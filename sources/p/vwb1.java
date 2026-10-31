package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vwb1 {
    public final String a;

    public vwb1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vwb1) && this.a.equals(((vwb1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
