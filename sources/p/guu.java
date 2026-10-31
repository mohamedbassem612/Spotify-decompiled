package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class guu extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ luu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ guu(luu luuVar, byte b) {
        super(1);
        this.a = b;
        this.b = luuVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        luu luuVar = this.b;
        switch (b) {
            case 0:
                duu duuVar = (duu) obj;
                String str = duuVar.a;
                if (nhc1.Y(str, "spotify:local:", false)) {
                    return new huz(luuVar.X, (byte) 10);
                }
                ay8 ay8VarH = d3p1.H(luuVar.h, luuVar.t, duuVar);
                y281 y281Var = luuVar.i;
                y281Var.getClass();
                Set set = s4b1.f;
                return new x010(ay8VarH, !uic.g(str, blc0.fh) ? new huz(fuu.b, (byte) 10) : rqt0.u(new ht20(o4p1.k(h4p1.f(new uk71(y281Var, new jh5(new xv00(rc11.a.b(w281.class)), str), (lnm) null, (byte) 4)), -1, 2), new uk71(y281Var, str, (lnm) null, (byte) 5))), new mnl(3, (lnm) null, (byte) 17), (byte) 1);
            case 1:
                duu duuVar2 = (duu) obj;
                fuu fuuVar = fuu.c;
                fuu fuuVar2 = fuu.b;
                String str2 = duuVar2.a;
                if (nhc1.Y(str2, "spotify:local:", false)) {
                    buu buuVar = luuVar.X;
                    return new euu(buuVar.a, duuVar2.a, buuVar.b, buuVar.c, buuVar.d, buuVar.e, buuVar.f);
                }
                i1r i1rVarB = luuVar.h.b(luuVar.t.a(duuVar2));
                i1r i1rVar = i1rVarB instanceof i1r ? i1rVarB : null;
                cuu cuuVar = i1rVar != null ? (cuu) i1rVar.a : null;
                return new euu(cuuVar != null ? cuuVar.a : f2v.a, duuVar2.a, cuuVar != null ? cuuVar.d : null, cuuVar != null ? cuuVar.f : fuuVar2, cuuVar != null ? cuuVar.b : false, ((cuuVar == null || !cuuVar.c) && !luuVar.i.b(str2).equals(fuuVar)) ? fuuVar2 : fuuVar, fuuVar2);
            case 2:
                ((qtr) obj).b(new huu(luuVar, (lnm) null));
                return rih1.a;
            case 3:
                String str3 = ((duu) obj).a;
                if (luuVar.g) {
                    return str3;
                }
                return null;
            default:
                String str4 = ((duu) obj).a;
                if (luuVar.g) {
                    return str4;
                }
                return null;
        }
    }
}
