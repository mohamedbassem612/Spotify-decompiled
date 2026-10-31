package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wch0 implements xch0 {
    public final zfc1 a;

    public wch0(zfc1 zfc1Var) {
        this.a = zfc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wch0) && this.a == ((wch0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
