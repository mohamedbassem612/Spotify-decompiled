package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dcf0 implements ecf0 {
    public final String a;
    public final String b;

    public dcf0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dcf0)) {
            return false;
        }
        dcf0 dcf0Var = (dcf0) obj;
        return this.a.equals(dcf0Var.a) && this.b.equals(dcf0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
