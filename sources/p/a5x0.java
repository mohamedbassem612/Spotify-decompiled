package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class a5x0 extends i541 {
    public final String d;

    public a5x0(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a5x0) && u890.j(this.d, ((a5x0) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
