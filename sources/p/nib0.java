package p;

import java.util.UUID;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nib0 {
    public final iac0 a;
    public final ynb0 b;
    public final iib0 c;
    public final idd1 d = new idd1(new pr90(this, (byte) 24));
    public final String e = UUID.randomUUID().toString();
    public c9n f;
    public xab1 g;
    public r091 h;
    public String i;
    public boolean j;
    public final bpb1 k;
    public final bpb1 l;

    public nib0(iac0 iac0Var, ynb0 ynb0Var, iib0 iib0Var) {
        this.a = iac0Var;
        this.b = ynb0Var;
        this.c = iib0Var;
        bpb1 bpb1VarB = gio1.b(tlw0.a);
        this.k = bpb1VarB;
        this.l = bpb1VarB;
        fn31.T(cto1.q(iac0Var), (o8n) null, 0, new no70(this, (lnm) null, (byte) 20), 3);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0056 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Code duplicated, block: B:21:0x0069 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0067 -> B:22:0x006a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(p.ttm0 r8, p.onm r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p.lib0
            if (r0 == 0) goto L13
            r0 = r9
            p.lib0 r0 = (p.lib0) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            p.lib0 r0 = new p.lib0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.d
            int r1 = r0.f
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L33
            if (r1 != r3) goto L2d
            int r8 = r0.c
            int r1 = r0.b
            p.ttm0 r4 = r0.a
            p.hm5.M(r9)
            r9 = r4
            goto L6a
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r2
        L33:
            p.hm5.M(r9)
            r9 = 0
            r1 = 3
            r6 = r9
            r9 = r8
            r8 = r6
        L3b:
            if (r8 >= r1) goto L6c
            p.idd1 r4 = r7.d
            java.lang.Object r5 = r4.getValue()
            p.zau0 r5 = (p.zau0) r5
            r9.a(r5)
            java.lang.Object r4 = r4.getValue()
            p.zau0 r4 = (p.zau0) r4
            p.r091 r5 = r7.h
            p.r091 r4 = p.q3p1.r(r4, r5)
            if (r4 == 0) goto L57
            return r4
        L57:
            r0.a = r9
            r0.b = r1
            r0.c = r8
            r0.f = r3
            r4 = 200(0xc8, double:9.9E-322)
            java.lang.Object r4 = p.hap1.i(r4, r0)
            p.d9n r5 = p.d9n.a
            if (r4 != r5) goto L6a
            return r5
        L6a:
            int r8 = r8 + r3
            goto L3b
        L6c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p.nib0.a(p.ttm0, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void b(r091 r091Var, onm onmVar) {
        mib0 mib0Var;
        if (onmVar instanceof mib0) {
            mib0Var = (mib0) onmVar;
            int i = mib0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mib0Var.c = i - Integer.MIN_VALUE;
            } else {
                mib0Var = new mib0(this, onmVar);
            }
        } else {
            mib0Var = new mib0(this, onmVar);
        }
        Object obj = mib0Var.a;
        int i2 = mib0Var.c;
        if (i2 != 0) {
            if (i2 == 1) {
                throw l1d.v(obj);
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
        } else {
            hm5.M(obj);
            bpb1 bpb1Var = r091Var.g;
            om70 om70Var = new om70(this, r091Var, (byte) 17);
            mib0Var.c = 1;
            bpb1Var.collect(om70Var, mib0Var);
        }
    }

    public final void c(r091 r091Var) {
        this.i = null;
        this.j = false;
        bpb1 bpb1Var = this.k;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, tlw0.a);
        r091Var.c();
    }

    public final void d(r091 r091Var) {
        if (this.h != r091Var) {
            xab1 xab1Var = this.g;
            if (xab1Var != null) {
                xab1Var.d((CancellationException) null);
            }
            this.g = null;
            this.h = r091Var;
        }
        if (r091Var == null || this.g != null) {
            return;
        }
        c9n c9nVar = this.f;
        this.g = c9nVar != null ? fn31.T(c9nVar, (o8n) null, 0, new ss90(this, r091Var, (lnm) null, (byte) 9), 3) : null;
    }

    public final void e() {
        this.i = null;
        this.j = false;
        bpb1 bpb1Var = this.k;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, tlw0.a);
        r091 r091Var = this.h;
        if (r091Var != null) {
            r091Var.j();
        }
        r091 r091Var2 = this.h;
        if (r091Var2 != null) {
            r091Var2.c();
        }
    }
}
