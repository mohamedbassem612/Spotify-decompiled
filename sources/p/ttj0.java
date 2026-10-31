package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ttj0 {
    public final String a;
    public final String b;

    public ttj0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ttj0)) {
            return false;
        }
        ttj0 ttj0Var = (ttj0) obj;
        return this.a.equals(ttj0Var.a) && this.b.equals(ttj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
