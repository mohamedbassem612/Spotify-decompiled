package p;

import android.content.Context;
import com.spotify.cosmos.p000servicebasedrouter.AndroidServicebasedrouterProperties$TestHelper;
import java.util.Collections;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qj50 implements sdm {
    public final Context a;
    public final bfd b;
    public final jl21 c;
    public final add d;
    public final rsm e;
    public final dlg1 f;
    public final her g;
    public final upa0 h;
    public final dg90 i;

    public qj50(Context context, bfd bfdVar, jl21 jl21Var, add addVar, rsm rsmVar, dlg1 dlg1Var, her herVar, upa0 upa0Var, dg90 dg90Var) {
        this.a = context;
        this.b = bfdVar;
        this.c = jl21Var;
        this.d = addVar;
        this.e = rsmVar;
        this.f = dlg1Var;
        this.g = herVar;
        this.h = upa0Var;
        this.i = dg90Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object a(sj50 sj50Var, onm onmVar) {
        oj50 oj50Var;
        String str;
        String str2;
        String str3;
        zks0 zks0Var;
        if (onmVar instanceof oj50) {
            oj50Var = (oj50) onmVar;
            int i = oj50Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                oj50Var.g = i - Integer.MIN_VALUE;
            } else {
                oj50Var = new oj50(this, onmVar);
            }
        } else {
            oj50Var = new oj50(this, onmVar);
        }
        Object obj = oj50Var.e;
        int i2 = oj50Var.g;
        if (i2 == 0) {
            hm5.M(obj);
            String str4 = sj50Var.a;
            String str5 = sj50Var.b;
            zks0 zks0Var2 = sj50Var.c;
            str = sj50Var.d;
            oj50Var.a = str4;
            oj50Var.b = str5;
            oj50Var.c = zks0Var2;
            oj50Var.d = str;
            oj50Var.g = 1;
            Object objC = c(zks0Var2, str4, oj50Var);
            Object obj2 = d9n.a;
            if (objC == obj2) {
                return obj2;
            }
            str2 = str4;
            obj = objC;
            str3 = str5;
            zks0Var = zks0Var2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = oj50Var.d;
            zks0Var = oj50Var.c;
            str3 = oj50Var.b;
            str2 = oj50Var.a;
            hm5.M(obj);
        }
        nj50 nj50Var = (nj50) obj;
        igm igmVar = new igm(this.a.getString(2131958561), (rzn1) null, (String) null, 6);
        smc0 smc0VarN = k4p1.n();
        if (nj50Var instanceof mj50) {
            if (((mj50) nj50Var).a) {
                smc0VarN.add(this.f.h(str2));
            } else {
                smc0VarN.add(this.e.a(str2));
            }
        } else if (!u890.j(nj50Var, lj50.a)) {
            eg.o();
            return null;
        }
        add addVar = this.d;
        qf4 qf4Var = addVar.a;
        if (qf4Var.h() && qf4Var.x()) {
            smc0VarN.add(this.c.a(pcf.d(6, str2, (String) null), new lik1(str3), Collections.singletonMap("chatFlag", AndroidServicebasedrouterProperties$TestHelper.TRUE)));
        }
        boolean zI = addVar.a.i();
        upa0 upa0Var = this.h;
        if (zI) {
            if (!zks0Var.b() && !zks0Var.g()) {
                smc0VarN.add(upa0Var.c(str2, str3, str));
            }
            smc0VarN.add(this.g.b(new r6t(zks0Var), str2, str3));
            if (!zks0Var.b() && !zks0Var.g()) {
                smc0VarN.add(new jhm("campfire_leave_and_delete_group_chat", cmx.c, (fhm) null, 2131958542, (String) null, false, (tm81) null, new ihm(new ygm(3), hhm.c, new ghm(zib0.Z0, zib0.a1), new lb50(this.i, str3, str2, (byte) 14)), 244));
            }
        } else {
            smc0VarN.add(upa0Var.c(str2, str3, str));
        }
        return new kjm(igmVar, k4p1.k(smc0VarN), 4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(zks0 zks0Var, String str, onm onmVar) {
        pj50 pj50Var;
        if (onmVar instanceof pj50) {
            pj50Var = (pj50) onmVar;
            int i = pj50Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pj50Var.c = i - Integer.MIN_VALUE;
            } else {
                pj50Var = new pj50(this, onmVar);
            }
        } else {
            pj50Var = new pj50(this, onmVar);
        }
        Object objV = pj50Var.a;
        int i2 = pj50Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objV);
                if (zks0Var.b() || zks0Var.g()) {
                    return lj50.a;
                }
                bfd bfdVar = this.b;
                pj50Var.c = 1;
                objV = bfdVar.b.v(str, pj50Var);
                d9n d9nVar = d9n.a;
                if (objV == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objV);
            }
            return new mj50(((Boolean) objV).booleanValue());
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return new mj50(false);
        }
    }
}
