package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rk21 implements sk21 {
    public final String a;

    public rk21(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rk21) && this.a.equals(((rk21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
