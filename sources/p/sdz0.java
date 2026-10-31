package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sdz0 implements wdz0 {
    public final String a;

    public sdz0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sdz0) && this.a.equals(((sdz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
