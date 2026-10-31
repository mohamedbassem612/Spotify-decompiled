package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dxa1 implements fxa1 {
    public final String a;

    public dxa1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dxa1) && this.a.equals(((dxa1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
