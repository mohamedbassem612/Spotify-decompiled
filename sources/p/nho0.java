package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nho0 {
    public final String a;
    public final String b;

    public nho0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nho0)) {
            return false;
        }
        nho0 nho0Var = (nho0) obj;
        return u890.j(this.a, nho0Var.a) && u890.j(this.b, nho0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
