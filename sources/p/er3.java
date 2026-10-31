package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class er3 extends hr3 {
    public final vod1 a;

    public er3(vod1 vod1Var) {
        this.a = vod1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof er3) && this.a.equals(((er3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
