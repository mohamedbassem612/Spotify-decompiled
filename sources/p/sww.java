package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sww extends vww {
    public final String a;

    public sww(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sww) && u890.j(this.a, ((sww) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
