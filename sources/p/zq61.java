package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zq61 {
    public final int a;
    public final int b;
    public final tr80 c;
    public final List d;

    public zq61(int i, int i2, tr80 tr80Var, List list) {
        this.a = i;
        this.b = i2;
        this.c = tr80Var;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zq61)) {
            return false;
        }
        zq61 zq61Var = (zq61) obj;
        return this.a == zq61Var.a && this.b == zq61Var.b && this.c.equals(zq61Var.c) && this.d.equals(zq61Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + lf51.e(kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
    }
}
