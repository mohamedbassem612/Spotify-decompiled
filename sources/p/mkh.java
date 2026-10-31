package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mkh extends pkh {
    public final String b;

    public mkh(String str) {
        super(fkh.t);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mkh) && this.b.equals(((mkh) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
