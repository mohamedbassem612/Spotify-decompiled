package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zq2 implements dr2 {
    public final yv2 a;

    public zq2(yv2 yv2Var) {
        this.a = yv2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zq2) && this.a.equals(((zq2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
