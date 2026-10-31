package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gkh extends pkh {
    public final String b;

    public gkh(String str) {
        super(fkh.c);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gkh) && u890.j(this.b, ((gkh) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
