package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ecu0 {
    public final uqo a;
    public final String b;

    public ecu0(uqo uqoVar, String str) {
        this.a = uqoVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ecu0)) {
            return false;
        }
        ecu0 ecu0Var = (ecu0) obj;
        return this.a.equals(ecu0Var.a) && u890.j(this.b, ecu0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
