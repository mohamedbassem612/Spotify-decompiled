package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class if50 {
    public static final k960 a = new k960(0.8333333f, 0.8333333f);

    public static final void a(jf50 jf50Var, qim0 qim0Var, b0k b0kVar, int i) {
        zvx zvxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-394943982);
        int i2 = (x340Var.g(jf50Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String str = jf50Var.a;
            boolean z = jf50Var.b;
            Uri uri = Uri.parse(str);
            if (z) {
                x340Var.i0(-1860499861);
                x340Var.r(false);
                zvxVar = null;
            } else {
                x340Var.i0(-1584035911);
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(x340Var).f;
                cua cuaVar2 = cbx.b(x340Var).f;
                zvxVar = new zvx();
                x340Var.r(false);
            }
            zvx zvxVar2 = zvxVar;
            cbx.a.getClass();
            ecx ecxVarA = uwr.a();
            qim0 qim0VarQ = nim0.a;
            if (z) {
                qim0VarQ = i1p1.q(qim0VarQ, er31.a);
            }
            eso1.e(uri, isl.a, qim0Var.then(qim0VarQ), (p3v) null, zvxVar2, ecxVarA, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 3120, 0, 4032);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xh00((Object) jf50Var, (Object) qim0Var, i, (byte) 28);
        }
    }

    public static final void b(ArrayList arrayList, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(340497707);
        int i2 = (x340Var.g(arrayList) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        byte b = 0;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0Var2 = qim0Var;
            w2g0.c(qim0Var2, (tl3) null, apo.r(1588678529, new hf50(arrayList, b), x340Var), x340Var, ((i2 >> 3) & 14) | 3072, 6);
        } else {
            qim0Var2 = qim0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vc0(arrayList, qim0Var2, i, (byte) 2);
        }
    }
}
