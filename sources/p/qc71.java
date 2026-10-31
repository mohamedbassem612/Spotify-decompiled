package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qc71 extends rc71 {
    public final String a;

    public qc71(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qc71) && this.a.equals(((qc71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
