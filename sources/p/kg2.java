package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kg2 implements sg2 {
    public final zb90 a;

    public kg2(zb90 zb90Var) {
        this.a = zb90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kg2) && u890.j(this.a, ((kg2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
