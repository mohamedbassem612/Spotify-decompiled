package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class icm1 extends hon1 {
    public final String e;

    public icm1(String str) {
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof icm1) && u890.j(this.e, ((icm1) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
