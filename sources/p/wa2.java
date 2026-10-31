package p;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wa2 implements byf0 {
    public final Activity a;
    public final yqg b;
    public final ov20 c;
    public final lls0 d;
    public final llm e;
    public boolean f;
    public faa0 g;

    public wa2(Activity activity, yqg yqgVar, ov20 ov20Var, q8n q8nVar, lls0 lls0Var) {
        this.a = activity;
        this.b = yqgVar;
        this.c = ov20Var;
        this.d = lls0Var;
        this.e = smo1.e(q8nVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:40:0x0092  */
    /* JADX WARN: Code duplicated, block: B:41:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00aa, code lost:
    
        if (r7.d.v(r1, r9, r3, r0) == r5) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(p.oe2 r8, p.lnm r9) throws kotlin.NoWhenBranchMatchedException {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p.ua2
            if (r0 == 0) goto L13
            r0 = r9
            p.ua2 r0 = (p.ua2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.ua2 r0 = new p.ua2
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2c
            p.hm5.M(r9)
            goto Lad
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r4
        L32:
            int r8 = r0.b
            p.h8b r1 = r0.a
            p.hm5.M(r9)
            goto L82
        L3a:
            p.hm5.M(r9)
            int r8 = r8.ordinal()
            if (r8 == 0) goto L58
            if (r8 == r3) goto L62
            if (r8 == r2) goto L58
            r9 = 3
            if (r8 == r9) goto L5e
            r9 = 4
            if (r8 != r9) goto L5a
            r7.f = r3
            p.faa0 r8 = r7.g
            if (r8 == 0) goto L56
            r8.d(r4)
        L56:
            r7.g = r4
        L58:
            r1 = r4
            goto L65
        L5a:
            p.eg.o()
            return r4
        L5e:
            p.h8b r8 = p.h8b.b
        L60:
            r1 = r8
            goto L65
        L62:
            p.h8b r8 = p.h8b.a
            goto L60
        L65:
            if (r1 == 0) goto Lad
            p.ov20 r8 = r7.c
            p.mr20 r8 = p.rwq0.u(r8)
            p.gk r9 = new p.gk
            r6 = 13
            r9.<init>(r8, r7, r6)
            r0.a = r1
            r8 = 0
            r0.b = r8
            r0.e = r3
            java.lang.Object r9 = p.b5p1.k(r9, r0)
            if (r9 != r5) goto L82
            goto Lac
        L82:
            java.lang.Integer r9 = (java.lang.Integer) r9
            p.lik1 r3 = p.jf2.b
            android.app.Activity r3 = r7.a
            android.content.Intent r3 = r3.getIntent()
            boolean r3 = p.fae1.s(r3)
            if (r3 == 0) goto L9c
            p.u8b r3 = new p.u8b
            p.lik1 r6 = p.nik1.Y6
            java.lang.String r6 = r6.a
            r3.<init>(r6)
            goto L9e
        L9c:
            p.v8b r3 = p.v8b.d
        L9e:
            r0.a = r4
            r0.b = r8
            r0.e = r2
            p.lls0 r7 = r7.d
            java.lang.Object r7 = r7.v(r1, r9, r3, r0)
            if (r7 != r5) goto Lad
        Lac:
            return r5
        Lad:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.wa2.a(p.oe2, p.lnm):java.lang.Object");
    }

    public final void c() {
        if (this.f) {
            return;
        }
        this.g = c921.y(this.e, (o8n) null, 0, new qm(this, (lnm) null, (byte) 11), 3);
    }

    public final void d() {
        faa0 faa0Var = this.g;
        if (faa0Var != null) {
            faa0Var.d((CancellationException) null);
        }
    }

    public final void g(ViewGroup viewGroup) {
    }
}
