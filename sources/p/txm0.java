package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class txm0 implements vxm0 {
    public final zu30 a = fmk0.Z;
    public final String b = "shuffle-algorithm";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof txm0) && this.a.equals(((txm0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + ((yd81.e.hashCode() + ((oa81.O0.hashCode() + (oa81.N0.hashCode() * 31)) * 31)) * 31);
    }
}
