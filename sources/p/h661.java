package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface h661 {
    default boolean b() {
        return false;
    }

    int c(String str);

    int d();

    String e(int i);

    List f(int i);

    h661 g(int i);

    default List getAnnotations() {
        return z6x.a;
    }

    yoi1 getKind();

    String h();

    boolean i(int i);

    default boolean isInline() {
        return false;
    }
}
