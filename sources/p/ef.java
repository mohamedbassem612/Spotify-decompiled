package p;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class ef {
    public static final kiv a = mod.t(df.b);
    public static final kiv b = mod.h(p4.d);

    public static final pe a(b0k b0kVar) {
        return (pe) ((x340) b0kVar).k(a);
    }

    public static final af b(b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-1953361457);
        bf bfVarC = c(x340Var);
        boolean zG = x340Var.g(bfVarC);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            objT = bfVarC.a();
            x340Var.s0(objT);
        }
        af afVar = (af) objT;
        x340Var.r(false);
        return afVar;
    }

    public static final bf c(b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        bf bfVarD = (bf) x340Var.k(b);
        if (bfVarD == null) {
            x340Var.i0(1281507684);
            bfVarD = d(x340Var);
        } else {
            x340Var.i0(1281506413);
        }
        x340Var.r(false);
        return bfVarD;
    }

    public static final bf d(b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
        kiv kivVar = t4k.h;
        float fH = ((wat) x340Var.k(kivVar)).h();
        float fU0 = ((wat) x340Var.k(kivVar)).U0();
        Configuration configuration = (Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a);
        boolean zD = x340Var.d(fU0) | x340Var.d(fH) | x340Var.g(context) | x340Var.g(configuration);
        Object objT = x340Var.T();
        if (zD || objT == fkj0.X) {
            objT = new bf(new km3(context, (byte) 5), true);
            x340Var.s0(objT);
        }
        return (bf) objT;
    }
}
