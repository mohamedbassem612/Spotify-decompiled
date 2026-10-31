package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ia41 {
    public final String a;

    public ia41(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ia41) && this.a.equals(((ia41) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
