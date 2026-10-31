package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class h5x0 extends i541 {
    public final String d;

    public h5x0(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h5x0) && u890.j(this.d, ((h5x0) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
