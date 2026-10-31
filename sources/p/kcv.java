package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kcv implements vcv {
    public final gbv a;

    public kcv(gbv gbvVar) {
        this.a = gbvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kcv) && u890.j(this.a, ((kcv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
