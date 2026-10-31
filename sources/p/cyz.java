package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cyz implements p600 {
    public final Throwable a;
    public final boolean b;

    public cyz(Throwable th, boolean z) {
        this.a = th;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyz)) {
            return false;
        }
        cyz cyzVar = (cyz) obj;
        return this.a.equals(cyzVar.a) && this.b == cyzVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
