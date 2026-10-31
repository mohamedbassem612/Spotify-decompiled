package p;

import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class axb0 implements jqc {
    public final int a;
    public final TreeSet b = new TreeSet((Comparator) new m((byte) 20));
    public long c;

    public axb0(long j) {
        this.a = (int) j;
    }

    @Override // p.jqc
    public final void a(zv81 zv81Var, aw81 aw81Var) {
        this.b.add(aw81Var);
        this.c += aw81Var.c;
        f(zv81Var, 0L);
    }

    @Override // p.jqc
    public final void b(aw81 aw81Var) {
        this.b.remove(aw81Var);
        this.c -= aw81Var.c;
    }

    @Override // p.jqc
    public final void c(zv81 zv81Var, aw81 aw81Var, aw81 aw81Var2) {
        b(aw81Var);
        a(zv81Var, aw81Var2);
    }

    @Override // p.jqc
    public final boolean d() {
        return true;
    }

    @Override // p.jqc
    public final void e(zv81 zv81Var, long j) {
        if (j != -1) {
            f(zv81Var, j);
        }
    }

    public final void f(zv81 zv81Var, long j) {
        while (this.c + j > this.a && !this.b.isEmpty()) {
            aw81 aw81Var = (aw81) this.b.first();
            synchronized (zv81Var) {
                dm5.y(!zv81Var.i);
                zv81Var.l(aw81Var);
            }
        }
    }
}
