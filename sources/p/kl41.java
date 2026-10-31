package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kl41 {
    public final String a;

    public kl41(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kl41) && u890.j(this.a, ((kl41) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
