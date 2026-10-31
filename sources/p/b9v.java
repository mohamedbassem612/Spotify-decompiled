package p;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b9v {
    public final int a;
    public final p2i0 b;
    public final CopyOnWriteArrayList c;

    public b9v() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public final void a(twa twaVar) {
        for (a9v a9vVar : this.c) {
            zoi1.c0(a9vVar.a, new c45((Object) this, (Object) a9vVar.b, (Object) twaVar, (byte) 14));
        }
    }

    public final void b() {
        for (a9v a9vVar : this.c) {
            zoi1.c0(a9vVar.a, new z8v(this, a9vVar.b, (byte) 1));
        }
    }

    public final void c() {
        for (a9v a9vVar : this.c) {
            zoi1.c0(a9vVar.a, new z8v(this, a9vVar.b, (byte) 2));
        }
    }

    public final void d(int i) {
        for (a9v a9vVar : this.c) {
            zoi1.c0(a9vVar.a, new pvt((Object) this, (Object) a9vVar.b, i, (byte) 1));
        }
    }

    public final void e(Exception exc) {
        for (a9v a9vVar : this.c) {
            zoi1.c0(a9vVar.a, new c45((Object) this, (Object) a9vVar.b, (Object) exc, (byte) 13));
        }
    }

    public final void f() {
        for (a9v a9vVar : this.c) {
            zoi1.c0(a9vVar.a, new z8v(this, a9vVar.b, (byte) 0));
        }
    }

    public b9v(CopyOnWriteArrayList copyOnWriteArrayList, int i, p2i0 p2i0Var) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = p2i0Var;
    }
}
