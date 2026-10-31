package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qoi0 implements voi0 {
    public final fru a;

    public qoi0(fru fruVar) {
        this.a = fruVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qoi0) && this.a.equals(((qoi0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
