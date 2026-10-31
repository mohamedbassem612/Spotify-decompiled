package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l2u {
    public final void a(mso msoVar, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(616178425);
        int i2 = i | (x340Var.g(msoVar) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = msoVar instanceof lso;
            String strO0 = cwl1.o0(x340Var, 2131954792);
            String message = msoVar.getMessage();
            if (message == null) {
                message = x0d.k(x340Var, -558011657, 2131954791, x340Var, false);
            } else {
                x340Var.i0(-558012246);
                x340Var.r(false);
            }
            mqo1.d(function1, (i3u) null, (hux) null, strO0, message, new zgx(cwl1.o0(x340Var, z ? 2131954790 : 2131954789), new gbx(z50.c, z ? function0 : function1)), (zgx) null, x340Var, ((i2 >> 6) & 14) | 262144, 70);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n7m(i, this, msoVar, function0, function1, (byte) 19);
        }
    }
}
