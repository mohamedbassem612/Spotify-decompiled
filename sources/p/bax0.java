package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bax0 extends yax0 {
    public final String a;

    public bax0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bax0) && this.a.equals(((bax0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
