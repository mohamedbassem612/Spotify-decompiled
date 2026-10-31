package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lpo implements PointerInputEventHandler {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public lpo(xu30 xu30Var, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, ven0 ven0Var4, ven0 ven0Var5) {
        this.e = xu30Var;
        this.b = ven0Var;
        this.c = ven0Var2;
        this.d = ven0Var3;
        this.f = ven0Var4;
        this.g = ven0Var5;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        Object obj6 = this.e;
        switch (b) {
            case 0:
                ven0 ven0Var = (ven0) obj5;
                if (!((Boolean) ven0Var.getValue()).booleanValue()) {
                    return rih1Var;
                }
                ven0 ven0Var2 = (ven0) obj4;
                o95 o95Var = (o95) obj6;
                c9n c9nVar = (c9n) obj2;
                Object objL = g5v.l(nav0Var, new bzm(ven0Var2, (byte) 10), new dy7((Object) o95Var, (Object) c9nVar, obj, ven0Var2, (ven0) obj3, ven0Var, (byte) 4), new kpo(o95Var, c9nVar, (byte) 0), lnmVar);
                return objL == d9nVar ? objL : rih1Var;
            case 1:
                Object objS = smo1.s(new yn0(nav0Var, (l811) obj5, (l811) obj4, (l811) obj3, (p811) obj6, (i0g0) obj2, (lbc0) obj, (lnm) null), lnmVar);
                return objS == d9nVar ? objS : rih1Var;
            default:
                xu30 xu30Var = (xu30) obj6;
                ven0 ven0Var3 = (ven0) obj5;
                Object objK = g5v.k(nav0Var, (iu30) null, new g4k1(xu30Var, ven0Var3, (byte) 7), new ydi0(nav0Var, xu30Var, (ven0) obj4, (ven0) obj3, (ven0) obj2, (ven0) obj, ven0Var3, (byte) 26), lnmVar, 5);
                return objK == d9nVar ? objK : rih1Var;
        }
    }

    public lpo(lbc0 lbc0Var, i0g0 i0g0Var, l811 l811Var, l811 l811Var2, l811 l811Var3, p811 p811Var) {
        this.b = l811Var;
        this.c = l811Var2;
        this.d = l811Var3;
        this.e = p811Var;
        this.f = i0g0Var;
        this.g = lbc0Var;
    }

    public lpo(ven0 ven0Var, ven0 ven0Var2, o95 o95Var, c9n c9nVar, iu30 iu30Var, ven0 ven0Var3) {
        this.b = ven0Var;
        this.c = ven0Var2;
        this.e = o95Var;
        this.f = c9nVar;
        this.g = iu30Var;
        this.d = ven0Var3;
    }
}
