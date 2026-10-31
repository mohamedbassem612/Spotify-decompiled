package p;

import android.content.Context;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zxv {
    public final Context a;
    public final kly0 b;
    public final kly0 c;
    public final kly0 d;
    public final txk0 e;
    public final kly0 f;
    public final h3h1 g = new h3h1(new vxv(this, 6));
    public final h3h1 h = new h3h1(new vxv(this, 5));
    public final cnc0 i;

    public zxv(Context context, hvp0 hvp0Var, cxv cxvVar, lbp lbpVar, lbp lbpVar2, lbp lbpVar3, txk0 txk0Var, lbp lbpVar4) {
        this.a = context;
        this.b = lbpVar;
        this.c = lbpVar2;
        this.d = lbpVar3;
        this.e = txk0Var;
        this.f = lbpVar4;
        dnc0 dnc0VarB = hvp0.b(hvp0Var);
        two1.v(dnc0VarB, new huz(Collections.singletonList(new h8k1(kt51.a, "select_all")), (byte) 10), false, new vxv(this, (byte) 0));
        ve01 ve01Var = cxvVar.a;
        ve01 ve01Var2 = cxvVar.b;
        two1.v(dnc0VarB, new x010(ve01Var, ve01Var2, new qr0(this, (lnm) null, (byte) 15), (byte) 1), false, new vxv(this, (byte) 1));
        two1.v(dnc0VarB, new dwv(ve01Var, (byte) 5), true, new vxv(this, (byte) 2));
        two1.v(dnc0VarB, new dwv(ve01Var2, (byte) 6), false, new vxv(this, (byte) 3));
        two1.v(dnc0VarB, new dwv(ve01Var2, (byte) 7), false, new vxv(this, (byte) 4));
        this.i = dnc0VarB.a();
    }
}
