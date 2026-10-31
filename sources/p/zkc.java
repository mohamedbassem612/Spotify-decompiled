package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zkc extends jlc {
    public final gmc a;
    public final vxo1 b;

    public zkc(gmc gmcVar, vxo1 vxo1Var) {
        this.a = gmcVar;
        this.b = vxo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zkc)) {
            return false;
        }
        zkc zkcVar = (zkc) obj;
        return this.a.equals(zkcVar.a) && this.b.equals(zkcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
