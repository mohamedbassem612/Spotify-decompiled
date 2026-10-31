package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z5a0 {
    public final c9c0 a;
    public final n381 b;
    public final yqg c;

    public z5a0(c9c0 c9c0Var, n381 n381Var, yqg yqgVar) {
        this.a = c9c0Var;
        this.b = n381Var;
        this.c = yqgVar;
    }

    public final Object a(String str, boolean z, a8d1 a8d1Var) {
        euq0 euq0Var;
        String str2;
        int i = z ? 3 : 4;
        ap90 ap90Var = (ap90) this.a.d.b().getValue();
        to90 to90Var = ap90Var.c;
        g6c tptVar = null;
        if (to90Var != null) {
            long jB = this.c.b();
            String strD = z5c.d(i);
            String str3 = to90Var.a;
            String str4 = to90Var.b;
            so90 so90Var = to90Var.d;
            if (so90Var != null) {
                String str5 = so90Var.b;
                switch (so90Var.a) {
                    case 1:
                        str2 = "UNKNOWN_OUTPUT_DEVICE_TYPE";
                        break;
                    case 2:
                        str2 = "BUILT_IN_SPEAKER";
                        break;
                    case 3:
                        str2 = "LINE_OUT";
                        break;
                    case 4:
                        str2 = "BLUETOOTH";
                        break;
                    case 5:
                        str2 = "AIRPLAY";
                        break;
                    case 6:
                        str2 = "AUTOMOTIVE";
                        break;
                    case 7:
                        str2 = "CAR_PROJECTED";
                        break;
                    default:
                        throw null;
                }
                euq0Var = new euq0(str5, str2, so90Var.c);
            } else {
                euq0Var = null;
            }
            ro90 ro90Var = ap90Var.b;
            vo90 vo90Var = ro90Var.a;
            g6c g6cVar = vo90Var != null ? new g6c(vo90Var.c) : null;
            wo90 wo90Var = ro90Var.b;
            tptVar = new tpt(jB, strD, str3, str4, euq0Var, g6cVar, wo90Var != null ? new g6c(wo90Var.a) : null);
        }
        if (tptVar != null) {
            Object objM = fc11.m(rca.c((rca) this.b.b, new jk61(tptVar), str == null ? "" : str, (fq21) null, 4, (Object) null).onErrorComplete(), a8d1Var);
            if (objM == d9n.a) {
                return objM;
            }
        }
        return rih1.a;
    }
}
