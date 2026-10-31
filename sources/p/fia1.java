package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fia1 {
    public final zha1 a;

    public fia1(zha1 zha1Var) {
        this.a = zha1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fia1) && this.a == ((fia1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
