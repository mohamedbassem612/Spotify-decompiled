package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yq2 implements dr2 {
    public final hv2 a;

    public yq2(hv2 hv2Var) {
        this.a = hv2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yq2) && this.a.equals(((yq2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
