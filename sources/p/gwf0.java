package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gwf0 implements hwf0 {
    public final String a;
    public final String b;
    public final boolean c;

    public gwf0(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwf0)) {
            return false;
        }
        gwf0 gwf0Var = (gwf0) obj;
        return u890.j(this.a, gwf0Var.a) && u890.j(this.b, gwf0Var.b) && this.c == gwf0Var.c;
    }

    public final String getEntityUri() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
