package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gj31 {
    public final String a;
    public final String b;

    public gj31(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gj31)) {
            return false;
        }
        gj31 gj31Var = (gj31) obj;
        return this.a.equals(gj31Var.a) && this.b.equals(gj31Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
