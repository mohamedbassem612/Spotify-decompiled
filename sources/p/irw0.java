package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class irw0 implements wgn, xgn {
    @Override // p.wgn, p.xgn
    public final List a() {
        Integer m231Var;
        int iIntValue;
        try {
            m231Var = Integer.valueOf(((Number) tnt0.d1.invoke()).intValue());
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        String strValueOf = "UNKNOWN";
        if (e331.a(m231Var) == null && (iIntValue = m231Var.intValue()) != 0) {
            if (iIntValue == 100) {
                strValueOf = "IMPORTANCE_FOREGROUND";
            } else if (iIntValue == 125) {
                strValueOf = "IMPORTANCE_FOREGROUND_SERVICE";
            } else if (iIntValue == 200) {
                strValueOf = "IMPORTANCE_VISIBLE";
            } else if (iIntValue == 230) {
                strValueOf = "IMPORTANCE_PERCEPTIBLE";
            } else if (iIntValue == 300) {
                strValueOf = "IMPORTANCE_SERVICE";
            } else if (iIntValue == 325) {
                strValueOf = "IMPORTANCE_TOP_SLEEPING";
            } else if (iIntValue == 350) {
                strValueOf = "IMPORTANCE_CANT_SAVE_STATE";
            } else if (iIntValue != 400) {
                strValueOf = iIntValue != 1000 ? String.valueOf(iIntValue) : "IMPORTANCE_GONE";
            } else {
                strValueOf = "IMPORTANCE_CACHED";
            }
        }
        return k4p1.x(new yfn(strValueOf));
    }
}
