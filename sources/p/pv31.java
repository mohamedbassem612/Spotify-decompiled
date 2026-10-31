package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pv31 implements bw31 {
    public final String a;
    public final String b;

    public pv31(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pv31)) {
            return false;
        }
        pv31 pv31Var = (pv31) obj;
        return this.a.equals(pv31Var.a) && this.b.equals(pv31Var.b);
    }

    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
