package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zme1 implements PointerInputEventHandler {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ane1 b;
    public final /* synthetic */ qam1 c;
    public final /* synthetic */ hdn0 d;
    public final /* synthetic */ ven0 e;

    public zme1(boolean z, ane1 ane1Var, qam1 qam1Var, hdn0 hdn0Var, ven0 ven0Var) {
        this.a = z;
        this.b = ane1Var;
        this.c = qam1Var;
        this.d = hdn0Var;
        this.e = ven0Var;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        j8d1 j8d1Var = (j8d1) nav0Var;
        float fH = j8d1Var.h() * 50.0f;
        m811 m811Var = new m811();
        Object objK = g5v.k(j8d1Var, new c110(m811Var, (byte) 1), new yme1(this.a, m811Var, fH, this.b, this.c, this.d, this.e), new e110(m811Var, (byte) 2), lnmVar, 4);
        return objK == d9n.a ? objK : rih1.a;
    }
}
