package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ax41 extends xyn1 {
    public final String b;

    public ax41(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ax41) && u890.j(this.b, ((ax41) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
