package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lxo1 {
    public final String a;
    public final String b;

    public lxo1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lxo1)) {
            return false;
        }
        lxo1 lxo1Var = (lxo1) obj;
        return this.a.equals(lxo1Var.a) && this.b.equals(lxo1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClientQueueEntry{mediaId=");
        sb.append(this.a);
        sb.append(", entryId=");
        return l1d.n(this.b, "}", sb);
    }
}
