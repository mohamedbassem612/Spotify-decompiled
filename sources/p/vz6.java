package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vz6 implements wz6 {
    public final String a;

    public vz6(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vz6) && this.a.equals(((vz6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
