package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class et01 {
    public final String a;

    public et01(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof et01) && this.a.equals(((et01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
