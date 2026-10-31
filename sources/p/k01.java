package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class k01 implements jv30, Serializable {
    public final Object a;
    public final Class b;
    public final String c;
    public final String d;
    public final boolean e;
    public final byte f;
    public final int g;

    /* JADX WARN: Multi-variable type inference failed */
    public k01(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.a = obj;
        this.b = cls;
        this.c = str;
        this.d = str2;
        this.e = (i2 & 1) == 1;
        this.f = i;
        this.g = i2 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k01)) {
            return false;
        }
        k01 k01Var = (k01) obj;
        return this.e == k01Var.e && this.f == k01Var.f && this.g == k01Var.g && u890.j(this.a, k01Var.a) && u890.j(this.b, k01Var.b) && this.c.equals(k01Var.c) && this.d.equals(k01Var.d);
    }

    @Override // p.jv30
    public final int getArity() {
        return this.f;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.b;
        return ((((cy30.d(cy30.d((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31, this.c), 31, this.d) + (this.e ? 1231 : 1237)) * 31) + this.f) * 31) + this.g;
    }

    public final String toString() {
        return rc11.a.k(this);
    }

    public k01(int i, Class cls, String str, String str2, int i2) {
        this(i, lyc.NO_RECEIVER, cls, str, str2, i2);
    }
}
