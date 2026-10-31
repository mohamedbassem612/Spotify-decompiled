package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gqf implements PointerInputEventHandler {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ gqf(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                Object objD = s9p1.D(nav0Var, new fqf((bmh1) obj4, (flb0) obj3, (n9d1) obj2, (n9d1) obj, (lnm) null, (byte) 0), lnmVar);
                return objD == d9nVar ? objD : rih1Var;
            case 1:
                ven0 ven0Var = (ven0) obj2;
                Object objH = g5v.h(new zqe((ven0) obj3, ven0Var, (byte) 5), new iwr(ven0Var, (byte) 7), lnmVar, new d7v((ven0) obj4, (byte) 2), new xd2((ven0) obj, (byte) 10), nav0Var);
                return objH == d9nVar ? objH : rih1Var;
            case 2:
                gg31 gg31Var = (gg31) obj4;
                iu30 iu30Var = (iu30) obj3;
                ven0 ven0Var2 = (ven0) obj2;
                Object objD2 = rqd1.d(nav0Var, new vg31(gg31Var, iu30Var, ven0Var2, (byte) 0), new vg31(gg31Var, iu30Var, ven0Var2, (byte) 1), (xu30) null, new vvu0((apl) obj, gg31Var, iu30Var, ven0Var2, (byte) 22), lnmVar, 4);
                return objD2 == d9nVar ? objD2 : rih1Var;
            case 3:
                o6e1 o6e1Var = new o6e1((c9n) obj4, (ven0) obj3, (idn0) obj2, (lnm) null);
                g45 g45Var = new g45((ven0) obj, (byte) 8);
                u9a1 u9a1Var = rqd1.a;
                Object objS = smo1.s(new bj81(nav0Var, o6e1Var, g45Var, new p9w0(nav0Var), (lnm) null, (byte) 8), lnmVar);
                if (objS != d9nVar) {
                    objS = rih1Var;
                }
                return objS == d9nVar ? objS : rih1Var;
            case 4:
                Object objD3 = rqd1.d(nav0Var, (iu30) null, (iu30) null, (xu30) null, new m9i1((ven0) obj4, (ven0) obj3, (ven0) obj2, (vy30) obj), lnmVar, 7);
                return objD3 == d9nVar ? objD3 : rih1Var;
            default:
                udm1 udm1Var = (udm1) obj4;
                Object objJ = g5v.j(new xdm1(udm1Var, (byte) 0), new xdm1(udm1Var, (byte) 1), lnmVar, new m9i1(udm1Var, (ven0) obj3, (cem1) obj2, (ven0) obj, (byte) 11), new ydm1(udm1Var, nav0Var, (byte) 0), nav0Var);
                return objJ == d9nVar ? objJ : rih1Var;
        }
    }
}
