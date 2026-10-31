package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eeh0 implements heh0 {
    public final Throwable a;

    public eeh0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eeh0) && this.a.equals(((eeh0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
