package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xi8 implements bh0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xi8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void a(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                dj8 dj8Var = (dj8) obj2;
                if (dj8Var.N0().getIntent().getBooleanExtra("extra_finish_on_auth", false)) {
                    dj8Var.N0().finishAndRemoveTask();
                    return;
                }
                kg0 kg0Var = dj8Var.J1;
                if (kg0Var != null) {
                    kg0Var.b(new sjt(dj8Var.U1, dj8Var.V1, false, 4));
                    return;
                } else {
                    u890.C("zeroNavigator");
                    throw null;
                }
            case 1:
                ah0 ah0Var = (ah0) obj;
                th30 th30Var = (th30) obj2;
                mh30 mh30Var = (mh30) th30Var.H.pollLast();
                if (mh30Var == null) {
                    return;
                }
                String str = mh30Var.a;
                int i = mh30Var.b;
                zf30 zf30VarN = th30Var.c.n(str);
                if (zf30VarN == null) {
                    return;
                }
                zf30VarN.u0(i, ah0Var.a, ah0Var.b);
                return;
            default:
                ((qbs0) obj2).Z0().U(mzz.a);
                return;
        }
    }
}
