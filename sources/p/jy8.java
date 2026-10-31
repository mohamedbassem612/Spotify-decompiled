package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jy8 {
    public final int a;
    public final ky8 b;

    public jy8(int i, ky8 ky8Var) {
        if (i == 0) {
            bhn0.i("Null type");
            throw null;
        }
        this.a = i;
        this.b = ky8Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jy8)) {
            return false;
        }
        jy8 jy8Var = (jy8) obj;
        if (!l1d.d(this.a, jy8Var.a)) {
            return false;
        }
        ky8 ky8Var = jy8Var.b;
        ky8 ky8Var2 = this.b;
        if (ky8Var2 == null) {
            return ky8Var == null;
        }
        return ky8Var2.equals(ky8Var);
    }

    public final int hashCode() {
        int iC = (l1d.C(this.a) ^ 1000003) * 1000003;
        ky8 ky8Var = this.b;
        return (ky8Var == null ? 0 : ky8Var.hashCode()) ^ iC;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CameraState{type=");
        int i = this.a;
        if (i == 1) {
            str = "PENDING_OPEN";
        } else if (i == 2) {
            str = "OPENING";
        } else if (i == 3) {
            str = "OPEN";
        } else if (i != 4) {
            str = i != 5 ? "null" : "CLOSED";
        } else {
            str = "CLOSING";
        }
        sb.append(str);
        sb.append(", error=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
