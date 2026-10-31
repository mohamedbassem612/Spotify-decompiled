package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tfv {
    public final rfv a;
    public final iix0 b;

    public tfv(rfv rfvVar, iix0 iix0Var) {
        this.a = rfvVar;
        this.b = iix0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tfv)) {
            return false;
        }
        tfv tfvVar = (tfv) obj;
        return this.a.equals(tfvVar.a) && this.b.equals(tfvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }
}
