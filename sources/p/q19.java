package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class q19 {
    public final String a;
    public final String b;
    public final q0s0 c;

    public q19(String str, String str2, q0s0 q0s0Var) {
        this.a = str;
        this.b = str2;
        this.c = q0s0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q19) {
            q19 q19Var = (q19) obj;
            String str = q19Var.a;
            String str2 = this.a;
            if (str2 != null ? str2.equals(str) : str == null) {
                String str3 = q19Var.b;
                String str4 = this.b;
                if (str4 != null ? str4.equals(str3) : str3 == null) {
                    q0s0 q0s0Var = q19Var.c;
                    q0s0 q0s0Var2 = this.c;
                    if (q0s0Var2 != null ? q0s0Var2.equals(q0s0Var) : q0s0Var == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        q0s0 q0s0Var = this.c;
        return iHashCode2 ^ (q0s0Var != null ? q0s0Var.hashCode() : 0);
    }

    public final String toString() {
        return l1d.n(String.valueOf(this.c), "}", gvg.n("PartnerAccountLinkingResult{state=", this.a, ", redirectUri=", this.b, ", error="));
    }
}
