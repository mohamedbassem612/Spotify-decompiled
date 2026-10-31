package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ted1 {
    public final String a;

    public ted1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ted1) && this.a.equals(((ted1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
