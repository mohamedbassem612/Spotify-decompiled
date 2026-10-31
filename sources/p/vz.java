package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vz implements f10 {
    public final String a;

    public vz(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vz) && this.a.equals(((vz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
