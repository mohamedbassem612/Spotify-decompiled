package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r0a implements wf80 {
    @Override // p.wf80
    public final zhq0 a(ug80 ug80Var) {
        yr31 yr31Var = ug80Var.h;
        d9z0 d9z0VarL = yr31Var.l();
        int iG = yr31Var.g('`');
        d9z0 d9z0VarL2 = yr31Var.l();
        while (yr31Var.c('`') > 0) {
            d9z0 d9z0VarL3 = yr31Var.l();
            if (yr31Var.g('`') == iG) {
                cwg cwgVar = new cwg();
                String strReplace = yr31Var.d(d9z0VarL2, d9z0VarL3).b().replace('\n', ' ');
                if (strReplace.length() >= 3) {
                    int i = 0;
                    if (strReplace.charAt(0) == ' ' && strReplace.charAt(strReplace.length() - 1) == ' ') {
                        int length = strReplace.length();
                        while (true) {
                            if (i >= length) {
                                i = length;
                                break;
                            }
                            if (strReplace.charAt(i) != ' ') {
                                break;
                            }
                            i++;
                        }
                        if (i != length) {
                            strReplace = cy30.h(1, 1, strReplace);
                        }
                    }
                }
                cwgVar.g = strReplace;
                return new zhq0(cwgVar, yr31Var.l(), (byte) 11);
            }
        }
        return new zhq0(new xzd1(yr31Var.d(d9z0VarL, d9z0VarL2).b()), d9z0VarL2, (byte) 11);
    }
}
