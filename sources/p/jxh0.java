package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jxh0 {
    public final b380 a;
    public final int b;
    public final long c;

    public jxh0(List list, int i, long j) {
        this.a = b380.p(list);
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxh0)) {
            return false;
        }
        jxh0 jxh0Var = (jxh0) obj;
        b380 b380Var = jxh0Var.a;
        b380 b380Var2 = this.a;
        b380Var2.getClass();
        return z1p1.j(b380Var2, b380Var) && this.b == jxh0Var.b && this.c == jxh0Var.c;
    }

    public final int hashCode() {
        return anm1.z(this.c) + (((this.a.hashCode() * 31) + this.b) * 31);
    }
}
