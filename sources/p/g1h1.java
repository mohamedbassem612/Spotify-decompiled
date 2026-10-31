package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g1h1 implements oma0 {
    public final jla0 a;
    public final List b;
    public final oma0 c;
    public final int d;

    public g1h1(jla0 jla0Var, List list, oma0 oma0Var, int i) {
        this.a = jla0Var;
        this.b = list;
        this.c = oma0Var;
        this.d = i;
    }

    public final String e(boolean z) {
        String name;
        tka0 tka0Var = this.a;
        tka0 tka0Var2 = tka0Var instanceof tka0 ? tka0Var : null;
        Class clsN = tka0Var2 != null ? ((wdg) tka0Var2).n() : null;
        if (clsN == null) {
            name = tka0Var.toString();
        } else if ((this.d & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (!clsN.isArray()) {
            name = (z && clsN.isPrimitive()) ? j2h1.t(tka0Var).getName() : clsN.getName();
        } else if (clsN.equals(boolean[].class)) {
            name = "kotlin.BooleanArray";
        } else if (clsN.equals(char[].class)) {
            name = "kotlin.CharArray";
        } else if (clsN.equals(byte[].class)) {
            name = "kotlin.ByteArray";
        } else if (clsN.equals(short[].class)) {
            name = "kotlin.ShortArray";
        } else if (clsN.equals(int[].class)) {
            name = "kotlin.IntArray";
        } else if (clsN.equals(float[].class)) {
            name = "kotlin.FloatArray";
        } else if (clsN.equals(long[].class)) {
            name = "kotlin.LongArray";
        } else {
            name = clsN.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
        }
        List list = this.b;
        String strI = xcg1.i(name, list.isEmpty() ? "" : o7h.y0(list, ", ", "<", ">", new p5e1(this), 24), i() ? "?" : "");
        oma0 oma0Var = this.c;
        if (oma0Var instanceof g1h1) {
            String strE = ((g1h1) oma0Var).e(true);
            if (!strE.equals(strI)) {
                if (strE.equals(strI.concat("?"))) {
                    return strI.concat("!");
                }
                return "(" + strI + ".." + strE + ')';
            }
        }
        return strI;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g1h1)) {
            return false;
        }
        g1h1 g1h1Var = (g1h1) obj;
        return u890.j(this.a, g1h1Var.a) && u890.j(this.b, g1h1Var.b) && u890.j(this.c, g1h1Var.c) && this.d == g1h1Var.d;
    }

    public final List getAnnotations() {
        return z6x.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // p.oma0
    public final boolean i() {
        return (this.d & 1) != 0;
    }

    @Override // p.oma0
    public final jla0 k() {
        return this.a;
    }

    public final int l() {
        return this.d;
    }

    public final oma0 n() {
        return this.c;
    }

    public final String toString() {
        return e(false).concat(" (Kotlin reflection is not available)");
    }

    @Override // p.oma0
    public final List v() {
        return this.b;
    }

    public g1h1(jla0 jla0Var, List list, boolean z) {
        this(jla0Var, list, null, z ? 1 : 0);
    }
}
