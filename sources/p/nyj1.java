package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nyj1 implements syj1 {
    public final String a;

    public nyj1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nyj1) && this.a.equals(((nyj1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
