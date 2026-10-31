package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dsb implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lsb b;

    public /* synthetic */ dsb(lsb lsbVar, byte b) {
        this.a = b;
        this.b = lsbVar;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        Object objB;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        lsb lsbVar = this.b;
        switch (b) {
            case 0:
                Object objB2 = lsbVar.k.b(new erb((Map) obj), lnmVar);
                return objB2 == d9nVar ? objB2 : rih1Var;
            case 1:
                mmr0 mmr0Var = (mmr0) obj;
                bbc bbcVar = lsbVar.k;
                drb drbVar = (drb) mmr0Var.a;
                vrb vrbVar = (vrb) mmr0Var.b;
                if (u890.j(vrbVar, trb.a)) {
                    objB = bbcVar.b(new hrb(drbVar), lnmVar);
                    if (objB != d9nVar) {
                        return rih1Var;
                    }
                } else if (u890.j(vrbVar, srb.a)) {
                    objB = bbcVar.b(new grb(drbVar), lnmVar);
                    if (objB != d9nVar) {
                        return rih1Var;
                    }
                } else {
                    if (!u890.j(vrbVar, urb.a)) {
                        eg.o();
                        return null;
                    }
                    objB = bbcVar.b(new irb(drbVar), lnmVar);
                    if (objB != d9nVar) {
                        return rih1Var;
                    }
                }
                return objB;
            default:
                Object objB3 = lsbVar.k.b(new mrb((Map) obj), lnmVar);
                return objB3 == d9nVar ? objB3 : rih1Var;
        }
    }
}
