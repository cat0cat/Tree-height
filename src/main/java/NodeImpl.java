import java.util.Objects;
import java.util.stream.Stream;

public class NodeImpl implements Node {
    private Node left;
    private Node right;
    public NodeImpl(Node left, Node right) {
        this.left = left;
        this.right = right;
    }
    private Stream<Node> getChildren() {
        return Stream.of(left, right).filter(Objects::nonNull);
    }
    @Override
    public int height() {
        return 0; // TODO
    }

    /**
     * Дано бинарное дерево.
     *  a
     *  /\
     *  b c
     *   /\
     *  d  e
     *      \
     *       f
     * Нужно найти высоту каждого узла дерева.
     * Высота двоичного дерева определяется как высота его корневого узла.
     * Пример: высота узла с равна 3, а высота узла f равна 1.
     */
    public static void main(String[] args) {
        var f = new NodeImpl(null, null);
        var d = new NodeImpl(null, null);
        var b = new NodeImpl(null, null);
        var e = new NodeImpl(null, f);
        var c = new NodeImpl(d, e);
        var a = new NodeImpl(b, c);

        System.out.println("Height a: " + a.height());
        System.out.println("Height b: " + b.height());
        System.out.println("Height c: " + c.height());
        System.out.println("Height d: " + d.height());
        System.out.println("Height e: " + e.height());
        System.out.println("Height f: " + f.height());
    }
}
