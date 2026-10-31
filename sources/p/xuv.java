package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xuv implements evv {
    public final String a;

    public xuv(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xuv) && this.a.equals(((xuv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
