package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ko30 extends f8x0 {
    public static final /* synthetic */ int X0 = 0;
    public final dtw U0;
    public final h8x0 V0;
    public final z6v0 W0;

    public ko30(dtw dtwVar, h8x0 h8x0Var, z6v0 z6v0Var) {
        super(dtwVar.w);
        this.U0 = dtwVar;
        this.V0 = h8x0Var;
        this.W0 = z6v0Var;
    }

    @Override // p.f8x0
    public final void E(obx0 obx0Var, int i) {
        Set set = s4b1.f;
        String str = obx0Var.b;
        String strS = uic.x(str).s();
        String str2 = strS == null ? "" : strS;
        String str3 = obx0Var.b;
        String str4 = obx0Var.c;
        String str5 = str4.length() == 0 ? str2 : str4;
        String str6 = obx0Var.d;
        String str7 = str6 == null ? "" : str6;
        String str8 = obx0Var.e;
        jo30 jo30Var = new jo30(str3, str5, str7, str8 == null ? "" : str8, str2, ((Boolean) this.W0.invoke()).booleanValue(), new say(this, obx0Var, i, (byte) 15));
        joa0 joa0Var = new joa0(str);
        tka0 tka0Var = dtw.C;
        dtw dtwVar = this.U0;
        dtwVar.k(jo30Var, joa0Var, (vu30) null);
        ha71.C(dtwVar, i);
    }
}
