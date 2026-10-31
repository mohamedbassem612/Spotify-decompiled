package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hcm1 extends hon1 {
    public final String e;

    public hcm1(String str) {
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hcm1) && u890.j(this.e, ((hcm1) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
