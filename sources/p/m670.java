package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m670 implements de70 {
    public static final t380 a = t380.u(k970.b.a, gb70.b.a, gb70.d.a);

    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    public final y570 b(y570 y570Var) {
        me70 me70VarT;
        String str;
        rwo1 rwo1Var;
        int i = n670.a;
        String str2 = null;
        if (y570Var.g().b("hubs:contextmenu", false)) {
            me70 me70VarT2 = y570Var.t();
            if (me70VarT2 != null) {
                str2 = ((od70) me70VarT2).a.a;
            }
        } else if (y570Var.g().a("hubs:contextmenu") == null) {
            if (a.contains(y570Var.h().a()) && (me70VarT = y570Var.t()) != null && (str = ((od70) me70VarT).a.a) != null) {
                blc0[] blc0VarArr = {blc0.g1, blc0.u1, blc0.Pg, blc0.fh, blc0.ti};
                Set set = s4b1.f;
                if (uic.h(str, blc0VarArr)) {
                    str2 = str;
                } else {
                    oxu0 oxu0Var = oxu0.a;
                    nyu0 nyu0VarC = oxu0Var.c(str);
                    if ((nyu0VarC instanceof nyu0 ? nyu0VarC : null) == null) {
                        wyu0 wyu0VarC = oxu0Var.c(str);
                        if ((wyu0VarC instanceof wyu0 ? wyu0VarC : null) != null) {
                            str2 = str;
                        }
                    } else {
                        str2 = str;
                    }
                }
            }
        }
        if (str2 == null) {
            return y570Var;
        }
        rc70 rc70Var = sc70.d.b;
        if (!u890.j(rc70Var.b, "contextMenu")) {
            rwo1Var = rc70Var;
            qc70 qc70Var = new qc70();
            qc70Var.c = rc70Var.c.a;
            qc70Var.b = "contextMenu";
            rwo1Var = qc70Var;
        }
        rwo1Var = rc70Var;
        sc70 sc70VarL = rwo1Var.j("uri", str2).j("title", ((id70) y570Var.n()).a.a).l();
        wwo1 wwo1VarQ = y570Var.toBuilder().q("longClick", sc70VarL);
        if (gb70.b.a.equals(y570Var.h().a()) || gb70.d.a.equals(y570Var.h().a())) {
            wwo1VarQ = wwo1VarQ.q("rightAccessoryClick", sc70VarL);
        }
        return wwo1VarQ.x();
    }
}
