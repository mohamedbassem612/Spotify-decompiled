package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a8g0 extends hon1 {
    public final String e;

    public a8g0(String str) {
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a8g0) && u890.j(this.e, ((a8g0) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
