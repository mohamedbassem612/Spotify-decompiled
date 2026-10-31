package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zp31 {
    public final yq31 a;

    public zp31(yq31 yq31Var) {
        this.a = yq31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zp31) && this.a.equals(((zp31) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
