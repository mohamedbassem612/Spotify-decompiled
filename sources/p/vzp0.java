package p;

import com.spotify.base.java.logging.Logger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vzp0 implements p090 {
    public static final long c;
    public static final /* synthetic */ int d = 0;
    public final v4g1 a;
    public final yqg b;

    static {
        ytw0 ytw0Var = jfv.b;
        c = fdg1.k0(500, ngv.d);
    }

    public vzp0(yqg yqgVar, v4g1 v4g1Var) {
        this.a = v4g1Var;
        this.b = yqgVar;
    }

    public final ry21 a(uf01 uf01Var) {
        ry21 ry21Var;
        ln21 ln21Var = uf01Var.e;
        ry21 ry21VarB = uf01Var.b(ln21Var);
        jf01 jf01Var = uf01Var.a;
        i4g1 i4g1Var = new i4g1(jf01Var);
        qzp0 qzp0Var = new qzp0(ry21VarB, (byte) 1);
        v4g1 v4g1Var = this.a;
        v4g1Var.c(i4g1Var, qzp0Var);
        if (ry21VarB.R0) {
            v4g1Var.b(new i4g1(jf01Var), new ozp0(ry21VarB, this, (byte) 5));
            return ry21VarB;
        }
        p811 p811Var = new p811();
        v4g1Var.b(new i4g1(jf01Var), new aw40(p811Var, this, ry21VarB, jf01Var, ln21Var, (byte) 2));
        Function0 function0 = (Function0) p811Var.a;
        if (function0 != null && (ry21Var = (ry21) function0.invoke()) != null) {
            return ry21Var;
        }
        Logger.b("Unregistered call detected " + ln21Var.a, new Object[0]);
        return ry21VarB;
    }
}
