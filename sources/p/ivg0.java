package p;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ivg0 {
    public final iug0 a;
    public final qr20 b;
    public final Scheduler c;
    public final lzn0 d;
    public final ao0 e;
    public final pug0 f;
    public final cyg0 g;
    public final kt91 h;
    public final q8n i;
    public final dg30 j;
    public final dto0 k;
    public final tm4 l;
    public final mgc m;
    public mwg0 n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public pk1 f35p = new pk1(qk1.a, false, (String) null, (String) null, (j7p1) null, 30);
    public final vku q = new vku();
    public final Handler r = new Handler(Looper.getMainLooper());
    public final er91 s;

    public ivg0(iug0 iug0Var, qr20 qr20Var, Scheduler scheduler, lzn0 lzn0Var, ao0 ao0Var, sw9 sw9Var, pug0 pug0Var, cyg0 cyg0Var, kt91 kt91Var, q8n q8nVar, dg30 dg30Var, dto0 dto0Var, tm4 tm4Var) {
        this.a = iug0Var;
        this.b = qr20Var;
        this.c = scheduler;
        this.d = lzn0Var;
        this.e = ao0Var;
        this.f = pug0Var;
        this.g = cyg0Var;
        this.h = kt91Var;
        this.i = q8nVar;
        this.j = dg30Var;
        this.k = dto0Var;
        this.l = tm4Var;
        this.m = new mgc(iug0Var.d, sw9Var.b, (gw70) sw9Var.c, (byte) 2);
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131960399});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        this.s = new er91((fs91) null, "", 2131960399, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
    }

    public final void a(tv80 tv80Var) {
        ao0.c(this.e, co0.d, this.a.a, (Long) null, (String) null, (String) null, (String) null, (String) null, 124);
        this.r.post(new xwn1(this, tv80Var, (byte) 26));
    }

    public final void b(boolean z) {
        iug0 iug0Var = this.a;
        this.g.b(iug0Var.a, z);
        ao0.c(this.e, co0.g, iug0Var.a, (Long) null, (String) null, (String) null, (String) null, (String) null, 124);
        mwg0 mwg0Var = this.n;
        if (mwg0Var == null) {
            u890.C("viewBinder");
            throw null;
        }
        mwg0Var.a1(new evg0(this, (byte) 2));
        this.q.c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        if (p.hap1.i(1000, r0) == r5) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(p.onm r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof p.fvg0
            if (r0 == 0) goto L13
            r0 = r13
            p.fvg0 r0 = (p.fvg0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.fvg0 r0 = new p.fvg0
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L35
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            p.hm5.M(r13)
            goto L54
        L2b:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r12)
            return r2
        L31:
            p.hm5.M(r13)
            goto L41
        L35:
            p.hm5.M(r13)
            r0.c = r4
            java.lang.Object r13 = r12.d(r0)
            if (r13 != r5) goto L41
            goto L53
        L41:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L8d
            r0.c = r3
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r13 = p.hap1.i(r3, r0)
            if (r13 != r5) goto L54
        L53:
            return r5
        L54:
            p.yro0 r6 = new p.yro0
            p.dg30 r13 = r12.j
            android.content.res.Resources r0 = r13.getResources()
            r1 = 2131960388(0x7f132244, float:1.9557443E38)
            java.lang.String r8 = r0.getString(r1)
            android.content.res.Resources r0 = r13.getResources()
            r1 = 2131960385(0x7f132241, float:1.9557437E38)
            java.lang.String r9 = r0.getString(r1)
            android.content.res.Resources r0 = r13.getResources()
            r1 = 2131960387(0x7f132243, float:1.9557441E38)
            java.lang.String r10 = r0.getString(r1)
            android.content.res.Resources r0 = r13.getResources()
            r1 = 2131960386(0x7f132242, float:1.955744E38)
            java.lang.String r11 = r0.getString(r1)
            r7 = 7
            r6.<init>(r7, r8, r9, r10, r11)
            p.dto0 r12 = r12.k
            r12.d(r13, r6, r2)
        L8d:
            p.rih1 r12 = p.rih1.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ivg0.c(p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(onm onmVar) {
        hvg0 hvg0Var;
        if (onmVar instanceof hvg0) {
            hvg0Var = (hvg0) onmVar;
            int i = hvg0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hvg0Var.c = i - Integer.MIN_VALUE;
            } else {
                hvg0Var = new hvg0(this, onmVar);
            }
        } else {
            hvg0Var = new hvg0(this, onmVar);
        }
        Object objO = hvg0Var.a;
        int i2 = hvg0Var.c;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(objO);
            gvg0 gvg0Var = new gvg0(this, lnmVar, (byte) 2);
            hvg0Var.c = 1;
            objO = rc2.O(2000L, gvg0Var, hvg0Var);
            d9n d9nVar = d9n.a;
            if (objO == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objO);
        }
        Boolean bool = (Boolean) objO;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }
}
