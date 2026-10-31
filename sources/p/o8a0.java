package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o8a0 {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final Set e;
    public final qx81 f;

    public /* synthetic */ o8a0(int i, boolean z, boolean z2, Set set, int i2) {
        this(i, 1, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? null : set, null);
    }

    public static o8a0 a(o8a0 o8a0Var, int i, boolean z, Set set, qx81 qx81Var, int i2) {
        int i3 = o8a0Var.a;
        if ((i2 & 2) != 0) {
            i = o8a0Var.b;
        }
        int i4 = i;
        if ((i2 & 4) != 0) {
            z = o8a0Var.c;
        }
        boolean z2 = z;
        boolean z3 = o8a0Var.d;
        if ((i2 & 16) != 0) {
            set = o8a0Var.e;
        }
        Set set2 = set;
        if ((i2 & 32) != 0) {
            qx81Var = o8a0Var.f;
        }
        o8a0Var.getClass();
        return new o8a0(i3, i4, z2, z3, set2, qx81Var);
    }

    public final o8a0 b(int i) {
        return a(this, i, false, null, null, 61);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o8a0)) {
            return false;
        }
        o8a0 o8a0Var = (o8a0) obj;
        return u890.j(o8a0Var.f, this.f) && o8a0Var.a == this.a && o8a0Var.b == this.b && o8a0Var.c == this.c && o8a0Var.d == this.d;
    }

    public final int hashCode() {
        qx81 qx81Var = this.f;
        int iHashCode = qx81Var != null ? qx81Var.hashCode() : 0;
        int iC = l1d.C(this.a) + (iHashCode * 31) + iHashCode;
        int iC2 = l1d.C(this.b) + (iC * 31) + iC;
        int i = (iC2 * 31) + (this.c ? 1 : 0) + iC2;
        return (i * 31) + (this.d ? 1 : 0) + i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("JavaTypeAttributes(howThisTypeIsUsed=");
        String str2 = "null";
        int i = this.a;
        if (i != 1) {
            str = i != 2 ? "null" : "COMMON";
        } else {
            str = "SUPERTYPE";
        }
        sb.append(str);
        sb.append(", flexibility=");
        int i2 = this.b;
        if (i2 == 1) {
            str2 = "INFLEXIBLE";
        } else if (i2 == 2) {
            str2 = "FLEXIBLE_UPPER_BOUND";
        } else if (i2 == 3) {
            str2 = "FLEXIBLE_LOWER_BOUND";
        }
        sb.append(str2);
        sb.append(", isRaw=");
        sb.append(this.c);
        sb.append(", isForAnnotationParameter=");
        sb.append(this.d);
        sb.append(", visitedTypeParameters=");
        sb.append(this.e);
        sb.append(", defaultType=");
        sb.append(this.f);
        sb.append(')');
        return sb.toString();
    }

    public o8a0(int i, int i2, boolean z, boolean z2, Set set, qx81 qx81Var) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
        this.e = set;
        this.f = qx81Var;
    }
}
