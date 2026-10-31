package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kyj1 implements syj1 {
    public final String a;

    public kyj1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kyj1) && this.a.equals(((kyj1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
