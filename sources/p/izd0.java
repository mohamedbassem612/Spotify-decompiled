package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class izd0 implements qzd0 {
    public final String a;

    public izd0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof izd0) && this.a.equals(((izd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
