package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class st41 {
    public final xtb0 a;
    public final c9n b;
    public final zqe c;
    public xab1 d;
    public final bbc e = mno1.a(-1, 0, 6);

    public st41(xtb0 xtb0Var, c9n c9nVar, zqe zqeVar) {
        this.a = xtb0Var;
        this.b = c9nVar;
        this.c = zqeVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005b A[PHI: r1 r7 r8
      0x005b: PHI (r1v4 p.ot41) = (r1v2 p.ot41), (r1v3 p.ot41), (r1v7 p.ot41), (r1v9 p.ot41) binds: [B:18:0x0057, B:42:0x00e4, B:54:0x0129, B:16:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x005b: PHI (r7v8 p.nt41) = (r7v0 p.nt41), (r7v1 p.nt41), (r7v10 p.nt41), (r7v0 p.nt41) binds: [B:18:0x0057, B:42:0x00e4, B:54:0x0129, B:16:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x005b: PHI (r8v5 p.d9n) = (r8v0 p.d9n), (r8v1 p.d9n), (r8v7 p.d9n), (r8v0 p.d9n) binds: [B:18:0x0057, B:42:0x00e4, B:54:0x0129, B:16:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00e4 -> B:19:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0126 -> B:54:0x0129). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(p.onm r24) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.st41.a(p.onm):java.lang.Object");
    }

    public final boolean b(nt41 nt41Var, float f, Function0 function0, iu30 iu30Var) {
        boolean zC;
        int iOrdinal = nt41Var.ordinal();
        xtb0 xtb0Var = this.a;
        if (iOrdinal == 0) {
            zC = xtb0Var.c();
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return false;
            }
            zC = xtb0Var.d();
        }
        if (!zC) {
            return false;
        }
        if (this.d == null) {
            this.d = fn31.T(this.b, (o8n) null, 0, new qt41(this, null, (byte) 0), 3);
        }
        this.e.l(new ot41(nt41Var, f, function0, iu30Var));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (p.op71.p(r7, r0) == r5) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(p.onm r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p.rt41
            if (r0 == 0) goto L13
            r0 = r7
            p.rt41 r0 = (p.rt41) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.rt41 r0 = new p.rt41
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L35
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            p.hm5.M(r7)
            goto L52
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r2
        L31:
            p.hm5.M(r7)
            goto L45
        L35:
            p.hm5.M(r7)
            p.ot41 r7 = p.ot41.e
            r0.c = r4
            p.bbc r1 = r6.e
            java.lang.Object r7 = r1.b(r7, r0)
            if (r7 != r5) goto L45
            goto L51
        L45:
            p.xab1 r7 = r6.d
            if (r7 == 0) goto L52
            r0.c = r3
            java.lang.Object r7 = p.op71.p(r7, r0)
            if (r7 != r5) goto L52
        L51:
            return r5
        L52:
            r6.d = r2
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.st41.c(p.onm):java.lang.Object");
    }
}
