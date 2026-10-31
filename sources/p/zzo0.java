package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zzo0 extends g0p0 {
    public final cam a;

    public zzo0(cam camVar) {
        this.a = camVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzo0) && this.a.equals(((zzo0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
