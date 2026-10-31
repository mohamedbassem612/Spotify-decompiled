package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m19 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;

    public m19(String str, String str2, int i, String str3) {
        if (i == 0) {
            bhn0.i("Null getType");
            throw null;
        }
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m19)) {
            return false;
        }
        m19 m19Var = (m19) obj;
        return l1d.d(this.a, m19Var.a) && this.b.equals(m19Var.b) && this.c.equals(m19Var.c) && this.d.equals(m19Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((l1d.C(this.a) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        String str;
        int i = this.a;
        if (i == 1) {
            str = "TOKEN_RECEIVED";
        } else if (i != 2) {
            str = i != 3 ? "null" : "LOGIN_FAILED";
        } else {
            str = "LOGGING_IN";
        }
        return rjx.o(gvg.n("LoginState{getType=", str, ", errorMessage=", this.b, ", authCode="), this.c, ", apiServerUrl=", this.d, "}");
    }
}
