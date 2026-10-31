package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jl81 extends nl81 {
    public final int a;
    public final boolean b;
    public final zyi1 c;
    public final String d;

    public jl81(int i, boolean z) {
        String strE;
        this.a = i;
        this.b = z;
        this.c = z ? zyi1.d : zyi1.c;
        switch (i) {
            case -1:
                strE = "n/a";
                break;
            case 0:
                strE = "NONE";
                break;
            case 1:
                strE = "LIGHT";
                break;
            case 2:
                strE = "MODERATE";
                break;
            case 3:
                strE = "SEVERE";
                break;
            case 4:
                strE = "CRITICAL";
                break;
            case 5:
                strE = "EMERGENCY";
                break;
            case 6:
                strE = "SHUTDOWN";
                break;
            default:
                strE = gvg.e(i, "?(", ")");
                break;
        }
        this.d = "thermal ".concat(strE);
    }

    @Override // p.nl81
    public final zyi1 a() {
        return this.c;
    }

    @Override // p.nl81
    public final String b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jl81)) {
            return false;
        }
        jl81 jl81Var = (jl81) obj;
        return this.a == jl81Var.a && this.b == jl81Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
