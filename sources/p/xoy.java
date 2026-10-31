package p;

import com.spotify.player.esperanto.proto.EsPlayOrigin;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xoy implements tyq {
    public final iu30 N0;
    public final EsPlayOrigin.PlayOrigin O0;
    public final e7m0 P0;
    public final ia00 Q0;
    public final psw R0;
    public final km1 S0;
    public final ruz X;
    public final iac0 Y;
    public final String Z;
    public final ycm a;
    public final wh1 b;
    public final j6q c;
    public final r0s0 d;
    public final a5m e;
    public final lc20 f;
    public final t0b g;
    public final b0d0 h;
    public final q8n i;
    public final d0r t;

    public xoy(ycm ycmVar, wh1 wh1Var, j6q j6qVar, r0s0 r0s0Var, a5m a5mVar, lc20 lc20Var, t0b t0bVar, b0d0 b0d0Var, q8n q8nVar, d0r d0rVar, ruz ruzVar, iac0 iac0Var, String str, p6r0 p6r0Var, String str2, iu30 iu30Var) {
        this.a = ycmVar;
        this.b = wh1Var;
        this.c = j6qVar;
        this.d = r0s0Var;
        this.e = a5mVar;
        this.f = lc20Var;
        this.g = t0bVar;
        this.h = b0d0Var;
        this.i = q8nVar;
        this.t = d0rVar;
        this.X = ruzVar;
        this.Y = iac0Var;
        this.Z = str2;
        this.N0 = iu30Var;
        zpz zpzVarY = EsPlayOrigin.PlayOrigin.y();
        zpzVarY.w(nik1.w6.a);
        zpzVarY.s(p6r0Var.d);
        zpzVarY.u(str);
        this.O0 = zpzVarY.build();
        this.P0 = sbl.C(gny.R0, t2m.m, new roy(this), new moy(this, (byte) 0), new i5w(this, (byte) 26));
        this.Q0 = n3o1.q(this).a(c9x.U0, c9x.V0);
        j2i j2iVar = new j2i(-946095058, new yhy(this, (byte) 3), true);
        ien0 ien0Var = qsw.a;
        this.R0 = new psw(j2iVar, (byte) 0);
        this.S0 = new km1(this, (byte) 18);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    public static ioy g(koy koyVar, k1r k1rVar, y4m y4mVar, r840 r840Var, ast0 ast0Var) {
        String strY0;
        mq70 mq70Var;
        up70 up70VarA;
        String str;
        List list;
        List list2;
        boolean z = k1rVar instanceof i1r;
        String str2 = null;
        i1r i1rVar = z ? (i1r) k1rVar : null;
        tmy tmyVar = i1rVar != null ? (tmy) i1rVar.a : null;
        jo70 jo70Var = tmyVar != null ? tmyVar.a : null;
        xkk1 xkk1Var = tmyVar != null ? tmyVar.b : null;
        hll hllVar = tmyVar != null ? tmyVar.c : null;
        String str3 = jo70Var != null ? jo70Var.a : null;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = str3;
        if (koyVar.b != 2 || jo70Var == null || (list2 = jo70Var.d) == null) {
            strY0 = null;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                String str5 = ((ho70) it.next()).a;
                if (ihc1.y0(str5)) {
                    str5 = null;
                }
                if (str5 != null) {
                    arrayList.add(str5);
                }
            }
            ArrayList arrayList2 = !arrayList.isEmpty() ? arrayList : null;
            if (arrayList2 != null) {
                strY0 = o7h.y0(arrayList2, ", ", (String) null, (String) null, (iu30) null, 62);
            } else {
                strY0 = null;
            }
        }
        boolean z2 = (hllVar == null || (list = hllVar.b) == null || !list.contains(ell.b)) ? false : true;
        String str6 = koyVar.a;
        if (xkk1Var != null && (mq70Var = xkk1Var.a) != null && (up70VarA = mq70Var.a(vp70.c)) != null && (str = up70VarA.a.a) != null && !ihc1.y0(str)) {
            str2 = str;
        }
        return new ioy(str6, str4, strY0, str2, z2, !z, y4mVar, r840Var, ast0Var, (doy) null);
    }

    public final rqw a() {
        return this.Q0;
    }

    public final jsw c() {
        return this.R0;
    }

    public final ylt0 f(koy koyVar) {
        String str = koyVar.a;
        String str2 = koyVar.d;
        huz huzVar = new huz(w7x.a, (byte) 10);
        huz huzVar2 = new huz((Object) null, (byte) 10);
        huz huzVar3 = new huz(b7x.a, (byte) 10);
        xkg0 xkg0Var = new xkg0();
        xkg0Var.put("agentic_product_type", "martini");
        String str3 = koyVar.c;
        if (!ihc1.y0(str3)) {
            xkg0Var.put("martini_conversation_id", str3);
        }
        if (!ihc1.y0(str2)) {
            xkg0Var.put("play_context_decision_id", str2);
        }
        return this.d.r(new ult0(this.h.b(str, huzVar, this.Y, this.X, huzVar2, this.O0, huzVar3, new huz(xkg0Var.b(), (byte) 10))));
    }

    public final mqw getBehavior() {
        return this.P0;
    }

    public final f4r getData() {
        return this.S0;
    }
}
