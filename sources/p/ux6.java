package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ux6 extends f8x0 {
    public static final /* synthetic */ int V0 = 0;
    public final dtw U0;

    public ux6(dtw dtwVar) {
        super(dtwVar.w);
        this.U0 = dtwVar;
    }

    public final void F(obx0 obx0Var, int i, boolean z, String str, zu30 zu30Var) {
        boolean zJ = u890.j(str, obx0Var.b);
        String str2 = obx0Var.b;
        String str3 = obx0Var.c;
        String str4 = obx0Var.d;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = obx0Var.e;
        hx6 hx6Var = new hx6(str2, str3, str4, str5 != null ? str5 : "", z && !zJ, obx0Var.f.a, new g90(zu30Var, obx0Var, i, (byte) 16));
        joa0 joa0Var = new joa0(str2);
        tka0 tka0Var = dtw.C;
        dtw dtwVar = this.U0;
        dtwVar.k(hx6Var, joa0Var, (vu30) null);
        ha71.C(dtwVar, i);
    }

    @Override // p.f8x0
    public final void E(obx0 obx0Var, int i) {
    }
}
