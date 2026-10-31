package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dqi0 extends sto1 {
    public final String b;

    public dqi0(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dqi0) && this.b.equals(((dqi0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
