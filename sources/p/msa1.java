package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class msa1 implements dta1 {
    public final boolean a;

    public msa1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof msa1) && this.a == ((msa1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
