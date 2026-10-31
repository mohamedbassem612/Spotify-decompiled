package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lub0 implements srb0 {
    public final fvb0 a;

    public lub0(fvb0 fvb0Var) {
        this.a = fvb0Var;
    }

    public final int a() {
        return this.a.g().l;
    }

    public final int b() {
        int i;
        fvb0 fvb0Var = this.a;
        int size = 0;
        if (fvb0Var.g().m.isEmpty()) {
            return 0;
        }
        yub0 yub0VarG = fvb0Var.g();
        yub0 yub0Var = zub0.a;
        qqq0 qqq0Var = yub0VarG.u;
        long j = yub0VarG.n;
        qqq0 qqq0Var2 = qqq0.a;
        int i2 = (int) (qqq0Var == qqq0Var2 ? j & 4294967295L : j >> 32);
        yub0 yub0VarG2 = fvb0Var.g();
        List list = yub0VarG2.m;
        if (!list.isEmpty()) {
            int size2 = list.size();
            int i3 = 0;
            while (size < size2) {
                avb0 avb0Var = (avb0) list.get(size);
                i3 += (int) (yub0VarG2.u == qqq0Var2 ? avb0Var.v & 4294967295L : avb0Var.v >> 32);
                size++;
            }
            size = (i3 / list.size()) + yub0VarG2.s;
        }
        if (size != 0 && (i = i2 / size) >= 1) {
            return i;
        }
        return 1;
    }

    public final boolean c() {
        return !this.a.g().m.isEmpty();
    }

    public final int d() {
        return ((err0) this.a.c.d).s();
    }

    public final int e() {
        return ((avb0) o7h.A0(this.a.g().m)).a;
    }
}
