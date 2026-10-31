package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f3i0 implements x2i0 {
    public final g8h0 a;
    public int d;
    public boolean e;
    public final ArrayList c = new ArrayList();
    public final Object b = new Object();

    public f3i0(qba qbaVar, boolean z) {
        this.a = new g8h0(qbaVar, z);
    }

    @Override // p.x2i0
    public final sqe1 a() {
        return this.a.O0;
    }

    public final void b(int i) {
        this.d = i;
        this.e = false;
        this.c.clear();
    }

    @Override // p.x2i0
    public final Object getUid() {
        return this.b;
    }
}
