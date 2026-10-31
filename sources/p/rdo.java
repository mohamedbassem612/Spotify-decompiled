package p;

import com.spotify.leavebehindads.events.proto.AdError;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rdo {
    public final t2j0 a;

    public rdo(t2j0 t2j0Var) {
        this.a = t2j0Var;
    }

    public final void a(puo1 puo1Var) {
        vn0 vn0VarN = AdError.n();
        vn0VarN.r(puo1Var.m());
        vn0VarN.q(puo1Var.n());
        vn0VarN.n(puo1Var.l());
        vn0VarN.v();
        vn0VarN.x(puo1Var.p());
        String strO = puo1Var.o();
        if (strO == null) {
            strO = "";
        }
        vn0VarN.u(strO);
        if (puo1Var instanceof qdo) {
            qdo qdoVar = (qdo) puo1Var;
            vn0VarN.w(qdoVar.c);
            vn0VarN.t(qdoVar.b);
            Long l = qdoVar.d;
            vn0VarN.s(l != null ? l.longValue() : 0L);
            vn0VarN.y(qdoVar.e);
        } else if (!(puo1Var instanceof pdo)) {
            eg.o();
            return;
        } else {
            pdo pdoVar = (pdo) puo1Var;
            vn0VarN.s(pdoVar.b.longValue());
            vn0VarN.w(pdoVar.c);
        }
        AdError adError = (AdError) vn0VarN.build();
        adError.getClass();
        this.a.a(adError);
    }
}
