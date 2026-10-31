package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class blz0 implements clz0 {
    public final String a;

    public blz0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof blz0) && this.a.equals(((blz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
