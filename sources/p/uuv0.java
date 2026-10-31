package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uuv0 {
    public final k760 a;

    public uuv0(k760 k760Var) {
        this.a = k760Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uuv0) && this.a.equals(((uuv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
