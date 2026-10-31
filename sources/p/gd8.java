package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gd8 implements u2i1 {
    public static final gd8 a = new gd8();
    public static final List b = p7h.M(new t2i1("audiobook/chapter-playback-confirmation/{book_id as Base62}/{chapter_id as Base62}", j561.t), new t2i1("audiobook/chapters/bottomsheet/{book_id as Base62}", mpi1.t));
    public static final List c = p7h.M(ed8.f, fd8.e);
    public static final idd1 d = new idd1(vc7.R0);

    @Override // p.u2i1
    public final List a() {
        return c;
    }

    @Override // p.u2i1
    public final List b() {
        return b;
    }
}
