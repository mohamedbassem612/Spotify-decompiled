package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nni0 {
    public final String a;
    public final String b;

    public nni0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nni0)) {
            return false;
        }
        nni0 nni0Var = (nni0) obj;
        return this.a.equals(nni0Var.a) && this.b.equals(nni0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
