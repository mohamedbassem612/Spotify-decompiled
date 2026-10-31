package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p301 implements y301 {
    public final String a;

    public p301(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p301) && this.a.equals(((p301) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
