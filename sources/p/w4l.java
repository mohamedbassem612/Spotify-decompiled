package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w4l {
    public final boolean a;
    public final boolean b;

    public w4l(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        if (z || z2) {
            return;
        }
        hhg1.n("Failed requirement.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4l)) {
            return false;
        }
        w4l w4lVar = (w4l) obj;
        return this.a == w4lVar.a && this.b == w4lVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
