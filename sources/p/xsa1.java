package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xsa1 implements dta1 {
    public final boolean a;

    public xsa1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xsa1) && this.a == ((xsa1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
