package p;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class k69 implements wf80 {
    public static final Pattern a = Pattern.compile("^[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*$");
    public static final Pattern b = Pattern.compile("^([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)$");

    @Override // p.wf80
    public final zhq0 a(ug80 ug80Var) {
        String strConcat;
        yr31 yr31Var = ug80Var.h;
        yr31Var.h();
        d9z0 d9z0VarL = yr31Var.l();
        if (yr31Var.c('>') > 0) {
            ld50 ld50VarD = yr31Var.d(d9z0VarL, yr31Var.l());
            String strB = ld50VarD.b();
            yr31Var.h();
            if (a.matcher(strB).matches()) {
                strConcat = strB;
            } else {
                strConcat = b.matcher(strB).matches() ? "mailto:".concat(strB) : null;
            }
            if (strConcat != null) {
                ijc0 ijc0Var = new ijc0(strConcat, null);
                xzd1 xzd1Var = new xzd1(strB);
                xzd1Var.e(ld50VarD.c());
                ijc0Var.b(xzd1Var);
                return new zhq0(ijc0Var, yr31Var.l(), (byte) 11);
            }
        }
        return null;
    }
}
