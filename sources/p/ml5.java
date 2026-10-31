package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ml5 {
    public final plc a;
    public final bmc b;

    public ml5(plc plcVar, bmc bmcVar) {
        this.a = plcVar;
        this.b = bmcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml5)) {
            return false;
        }
        ml5 ml5Var = (ml5) obj;
        return this.a.equals(ml5Var.a) && this.b.equals(ml5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
