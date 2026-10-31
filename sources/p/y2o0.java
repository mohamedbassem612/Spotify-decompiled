package p;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y2o0 implements a4l {
    public final iur a;
    public final v4o0 b;
    public final q8n c;
    public final Context d;
    public c9n e;

    public y2o0(iur iurVar, v4o0 v4o0Var, Context context, q8n q8nVar) {
        this.a = iurVar;
        this.b = v4o0Var;
        this.c = q8nVar;
        this.d = context.getApplicationContext();
        this.e = cy30.t(q8nVar);
    }

    public final void a() {
        if (Build.VERSION.SDK_INT > 36) {
            smo1.q(this.e);
        }
    }

    public final void b() {
        if (Build.VERSION.SDK_INT > 36) {
            this.e = qmo1.v(this.e, new ivn0(this, (byte) 5));
            l4p1.u(this.e, f5p1.q(this.a.b, new oy3(this, (lnm) null, (byte) 12)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        if (p.b0o1.k(r8.b, p.u0o0.a, r8.d, (p.oxa0) null, r5, 8) == r7) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(boolean r9, p.onm r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p.x2o0
            if (r0 == 0) goto L14
            r0 = r10
            p.x2o0 r0 = (p.x2o0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.d = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            p.x2o0 r0 = new p.x2o0
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r5.b
            int r0 = r5.d
            r1 = 2
            r2 = 1
            p.d9n r7 = p.d9n.a
            if (r0 == 0) goto L39
            if (r0 == r2) goto L33
            if (r0 != r1) goto L2c
            p.hm5.M(r10)
            goto L67
        L2c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            r8 = 0
            return r8
        L33:
            boolean r9 = r5.a
            p.hm5.M(r10)
            goto L4b
        L39:
            p.hm5.M(r10)
            p.v4o0 r10 = r8.b
            p.mr20 r10 = r10.g
            r5.a = r9
            r5.d = r2
            java.lang.Object r10 = p.b5p1.i(r10, r5)
            if (r10 != r7) goto L4b
            goto L66
        L4b:
            p.m4o0 r10 = (p.m4o0) r10
            if (r9 == 0) goto L6c
            boolean r10 = r10 instanceof p.i4o0
            if (r10 == 0) goto L6c
            r5.a = r9
            r5.d = r1
            p.v4o0 r1 = r8.b
            p.u0o0 r2 = p.u0o0.a
            android.content.Context r3 = r8.d
            r4 = 0
            r6 = 8
            java.lang.Object r9 = p.b0o1.k(r1, r2, r3, r4, r5, r6)
            if (r9 != r7) goto L67
        L66:
            return r7
        L67:
            p.c9n r8 = r8.e
            p.smo1.q(r8)
        L6c:
            p.rih1 r8 = p.rih1.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.y2o0.c(boolean, p.onm):java.lang.Object");
    }
}
