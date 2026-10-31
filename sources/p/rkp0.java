package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rkp0 extends tkp0 {
    public final boolean a;

    public rkp0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rkp0) && this.a == ((rkp0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
