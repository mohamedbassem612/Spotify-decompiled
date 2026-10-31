package p;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import io.reactivex.rxjava3.internal.operators.completable.CompletableObserveOn;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r171 implements xpw {
    public final mnk0 N0;
    public final aas O0;
    public final sve P0;
    public final ngs0 Q0;
    public final zr00 R0;
    public final r0s0 S0;
    public final yh2 T0;
    public final dc31 U0;
    public final b7r0 V0;
    public final lgq W0;
    public final a9d X;
    public final mgq X0;
    public final rxj0 Y;
    public final h4q Y0;
    public final yxb0 Z;
    public final qgq Z0;
    public final Context a;
    public final kgq a1;
    public final lzn0 b;
    public final w390 b1;
    public final el3 c;
    public final String c1;
    public final ykf0 d;
    public final String d1;
    public final hyy0 e;
    public final boolean e1;
    public final c9n f;
    public final h9n f1;
    public final kt91 g;
    public final kly0 g1;
    public final xh71 h;
    public final kly0 h1;
    public final z201 i;
    public final d0r i1;
    public final cbr0 j1;
    public final e821 k1;
    public final String l1;
    public final mzr0 m1;
    public final idd1 n1;
    public final idd1 o1;
    public xab1 p1;
    public xab1 q1;
    public final js20 r1;
    public final idd1 s1;
    public final add t;
    public final idd1 t1;
    public final u7h1 u1;
    public final psw v1;

    public r171(Context context, lzn0 lzn0Var, el3 el3Var, ykf0 ykf0Var, hyy0 hyy0Var, c9n c9nVar, kt91 kt91Var, xh71 xh71Var, z201 z201Var, add addVar, a9d a9dVar, rxj0 rxj0Var, yxb0 yxb0Var, mnk0 mnk0Var, aas aasVar, sve sveVar, ngs0 ngs0Var, zr00 zr00Var, r0s0 r0s0Var, ts71 ts71Var, yh2 yh2Var, dc31 dc31Var, b7r0 b7r0Var, lgq lgqVar, mgq mgqVar, h4q h4qVar, qgq qgqVar, kgq kgqVar, w390 w390Var, String str, String str2, boolean z, h9n h9nVar, kly0 kly0Var, kly0 kly0Var2, d0r d0rVar, cbr0 cbr0Var, ruz ruzVar, e821 e821Var) {
        this.a = context;
        this.b = lzn0Var;
        this.c = el3Var;
        this.d = ykf0Var;
        this.e = hyy0Var;
        this.f = c9nVar;
        this.g = kt91Var;
        this.h = xh71Var;
        this.i = z201Var;
        this.t = addVar;
        this.X = a9dVar;
        this.Y = rxj0Var;
        this.Z = yxb0Var;
        this.N0 = mnk0Var;
        this.O0 = aasVar;
        this.P0 = sveVar;
        this.Q0 = ngs0Var;
        this.R0 = zr00Var;
        this.S0 = r0s0Var;
        this.T0 = yh2Var;
        this.U0 = dc31Var;
        this.V0 = b7r0Var;
        this.W0 = lgqVar;
        this.X0 = mgqVar;
        this.Y0 = h4qVar;
        this.Z0 = qgqVar;
        this.a1 = kgqVar;
        this.b1 = w390Var;
        this.c1 = str;
        this.d1 = str2;
        this.e1 = z;
        this.f1 = h9nVar;
        this.g1 = kly0Var;
        this.h1 = kly0Var2;
        this.i1 = d0rVar;
        this.j1 = cbr0Var;
        this.k1 = e821Var;
        this.l1 = pcf.d(6, str, (String) null);
        bjx bjxVar = ts71Var.a;
        a9q a9qVar = (a9q) bjxVar.b;
        c8o.l(a9qVar);
        r2r r2rVar = (r2r) bjxVar.c;
        c8o.l(r2rVar);
        lrh lrhVar = (lrh) bjxVar.d;
        c8o.l(lrhVar);
        this.m1 = new mzr0(a9qVar, r2rVar, lrhVar, (a5m) bjxVar.e, (lc20) bjxVar.f, (r0s0) bjxVar.g, ruzVar);
        this.n1 = new idd1(new n171(this, (byte) 3));
        this.o1 = new idd1(new n171(this, (byte) 1));
        this.r1 = x3p1.n(new d061(1, this, r171.class, "externalState", "externalState(Lcom/spotify/campfire/chatpage/elements/sharecard/api/ShareCardElement$Props;)Lkotlinx/coroutines/flow/Flow;", 0, (byte) 5), rq61.S0, new o171(this, (byte) 0), (o8n) null, new q961(this, (byte) 16), 8);
        this.s1 = new idd1(new n171(this, (byte) 2));
        this.t1 = new idd1(new n171(this, (byte) 0));
        this.u1 = new u7h1(new o171(this, (byte) 1), new u451(this, (byte) 18));
        j2i j2iVar = new j2i(1075294460, new hg31(this, (byte) 28), true);
        ien0 ien0Var = qsw.a;
        this.v1 = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.u1;
    }

    public final jsw c() {
        return this.v1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    public final Object e(f071 f071Var, ib71 ib71Var, boolean z, tv80 tv80Var, onm onmVar) {
        q171 q171Var;
        ou80 ou80Var;
        if (onmVar instanceof q171) {
            q171Var = (q171) onmVar;
            int i = q171Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                q171Var.c = i - Integer.MIN_VALUE;
            } else {
                q171Var = new q171(this, onmVar);
            }
        } else {
            q171Var = new q171(this, onmVar);
        }
        Object obj = q171Var.a;
        int i2 = q171Var.c;
        rih1 rih1Var = rih1.a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            if (ib71Var == ib71.b) {
                this.T0.b(f071Var.a, (String) null);
                return rih1Var;
            }
            if (ib71Var == ib71.a && z) {
                String str = f071Var.a;
                xab1 xab1Var = this.p1;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                this.p1 = fn31.T(this.f, (o8n) null, 0, new lm61(this, str, (lnm) null, (byte) 4), 3);
                return rih1Var;
            }
            y6r0 y6r0Var = this.V0.get();
            String str2 = y6r0Var != null ? y6r0Var.a : null;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = (tv80Var == null || (ou80Var = tv80Var.a) == null) ? null : ou80Var.a;
            CompletableObserveOn completableObserveOnB = this.O0.b(f071Var.a, str2, 2, str3 != null ? str3 : "");
            q171Var.c = 1;
            Object objI = fc11.i(completableObserveOnB, q171Var);
            d9n d9nVar = d9n.a;
            return objI == d9nVar ? d9nVar : rih1Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131951781});
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
            this.g.k(new er91((fs91) null, "", 2131951781, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
            return rih1Var;
        }
    }

    public final void f(String str, tqw tqwVar, ib71 ib71Var, boolean z) {
        if (ib71Var == ib71.b) {
            this.T0.b(str, (String) null);
            return;
        }
        ib71 ib71Var2 = ib71.a;
        c9n c9nVar = this.f;
        if (ib71Var == ib71Var2 && z) {
            xab1 xab1Var = this.p1;
            if (xab1Var != null) {
                xab1Var.d((CancellationException) null);
            }
            this.p1 = fn31.T(c9nVar, (o8n) null, 0, new lm61(this, str, (lnm) null, (byte) 4), 3);
            return;
        }
        if (nzy.b(str) && tqwVar != null) {
            xab1 xab1Var2 = this.q1;
            if (xab1Var2 != null) {
                xab1Var2.d((CancellationException) null);
            }
            this.q1 = fn31.T(c9nVar, (o8n) null, 0, new n641(this, str, tqwVar, (lnm) null, (byte) 25), 3);
            return;
        }
        try {
            pcf.a(this.b, str, tqwVar != null ? n3o1.y(tqwVar) : null, (Bundle) null);
        } catch (Exception unused) {
            Context context = this.a;
            Toast.makeText(context, context.getString(2131951781), 0).show();
            n57.s("Campfire - Error when opening share. uri: ".concat(str));
        }
    }

    public final mqw getBehavior() {
        return this.r1;
    }
}
