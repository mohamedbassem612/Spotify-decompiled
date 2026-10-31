package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jbk0 {
    public final rxj0 a;

    public jbk0(rxj0 rxj0Var) {
        this.a = rxj0Var;
    }

    public final ibk0 a(String str, String str2) {
        rxj0 rxj0Var = this.a;
        boolean z = rxj0Var.m;
        ebk0 ebk0Var = ebk0.a;
        hbk0 hbk0Var = hbk0.a;
        gbk0 gbk0Var = gbk0.a;
        if (!z) {
            if (str2 == null) {
                str2 = "";
            }
            if (rxj0Var.a) {
                if (u890.j(str2, "premium")) {
                    return ebk0Var;
                }
                if (u890.j(str2, "free") && rxj0Var.n) {
                    return hbk0Var;
                }
            }
            return gbk0Var;
        }
        if (str == null) {
            str = "";
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -2049179193) {
            if (iHashCode != 2123274) {
                if (iHashCode == 2634405 && str.equals("VIEW") && rxj0Var.n) {
                    return hbk0Var;
                }
            } else if (str.equals("EDIT")) {
                return ebk0Var;
            }
        } else if (str.equals("LISTEN")) {
            return fbk0.a;
        }
        return gbk0Var;
    }
}
