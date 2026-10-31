package p;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wn30 {
    public final j0j0 a;
    public final d7b b;
    public final xy40 c;
    public final egd d;
    public final y621 e;
    public final xa21 f;
    public final jl21 g;
    public final x860 h;
    public final hgd0 i;
    public final jed0 j;
    public final vcd0 k;

    public wn30(j0j0 j0j0Var, d7b d7bVar, xy40 xy40Var, egd egdVar, y621 y621Var, xa21 xa21Var, jl21 jl21Var, x860 x860Var, hgd0 hgd0Var, jed0 jed0Var, vcd0 vcd0Var) {
        this.a = j0j0Var;
        this.b = d7bVar;
        this.c = xy40Var;
        this.d = egdVar;
        this.e = y621Var;
        this.f = xa21Var;
        this.g = jl21Var;
        this.h = x860Var;
        this.i = hgd0Var;
        this.j = jed0Var;
        this.k = vcd0Var;
    }

    public final kjm a(bo30 bo30Var, jhm jhmVar) {
        String str = bo30Var.b;
        String str2 = bo30Var.a;
        String str3 = bo30Var.d;
        String str4 = bo30Var.c;
        Uri uri = str4 != null ? Uri.parse(str4) : Uri.EMPTY;
        uri.getClass();
        igm igmVar = new igm(str, new wfm(uri, new hgm(str3, str)), (String) null, 4);
        smc0 smc0VarN = k4p1.n();
        int iC = l1d.C(bo30Var.f);
        d7b d7bVar = this.b;
        if (iC != 0) {
            xy40 xy40Var = this.c;
            if (iC == 1) {
                smc0VarN.add(xy40Var.a(str3));
                smc0VarN.add(this.d.a(str2, str));
                smc0VarN.add(d7bVar.a(str2, str, new h7b(3)));
            } else {
                if (iC != 2) {
                    eg.o();
                    return null;
                }
                smc0VarN.add(xy40Var.a(str3));
                smc0VarN.add(new jhm("profile_remove_suggested_friend", (hux) fux.c, (fhm) null, (Integer) 2131960480, (String) null, false, (tm81) null, new ihm(new ygm(3), new ghm(ma21.e, ma21.f), new v721(this.f, str3, str, (byte) 4)), 244));
                smc0VarN.add(d7bVar.a(str2, str, new h7b(3)));
            }
        } else {
            if (jhmVar != null) {
                smc0VarN.add(jhmVar);
            }
            if (bo30Var.g) {
                smc0VarN.add(this.a.a(str3, null, bc30.g, true));
            }
            smc0VarN.add(this.e.a(str2, str));
            smc0VarN.add(d7bVar.a(str2, str, new h7b(3)));
            smc0VarN.add(jl21.b(this.g, str2, bo30Var.e));
        }
        return new kjm(igmVar, (List) k4p1.k(smc0VarN), 4);
    }
}
