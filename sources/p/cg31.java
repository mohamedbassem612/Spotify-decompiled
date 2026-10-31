package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cg31 implements fg31 {
    public final boolean a;

    public cg31(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cg31) && this.a == ((cg31) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
