package p;

import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class f7y implements w6y {
    public final kzt a;
    public final wcr b;

    public f7y(kzt kztVar, ekb ekbVar, wcr wcrVar) {
        this.a = kztVar;
        this.b = wcrVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        if (r5 == r4) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(p.onm r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p.x6y
            if (r0 == 0) goto L13
            r0 = r6
            p.x6y r0 = (p.x6y) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.x6y r0 = new p.x6y
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            p.hm5.M(r6)
            goto L71
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r5)
            r5 = 0
            return r5
        L31:
            p.hm5.M(r6)
            goto L43
        L35:
            p.hm5.M(r6)
            r0.c = r3
            p.wcr r5 = r5.b
            java.lang.Object r6 = r5.n(r0)
            if (r6 != r4) goto L43
            goto L70
        L43:
            p.o6y r6 = (p.o6y) r6
            if (r6 != 0) goto L4a
            p.q231 r5 = p.q231.a
            return r5
        L4a:
            r0.c = r2
            p.l441 r5 = new p.l441
            p.lnm r0 = p.aym.t(r0)
            r5.<init>(r0)
            p.km3 r6 = r6.a
            p.hfp1 r6 = r6.w()
            p.xap r0 = new p.xap
            r1 = 29
            r0.<init>(r5, r1)
            r6.b(r0)
            java.lang.Object r5 = r5.a()
            if (r5 != r4) goto L6c
            goto L6e
        L6c:
            p.rih1 r5 = p.rih1.a
        L6e:
            if (r5 != r4) goto L71
        L70:
            return r4
        L71:
            p.u231 r5 = p.u231.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.f7y.a(p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r5 == r4) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(p.onm r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p.y6y
            if (r0 == 0) goto L13
            r0 = r6
            p.y6y r0 = (p.y6y) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.y6y r0 = new p.y6y
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            p.hm5.M(r6)
            goto L70
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r5)
            r5 = 0
            return r5
        L31:
            p.hm5.M(r6)
            goto L43
        L35:
            p.hm5.M(r6)
            r0.c = r3
            p.wcr r5 = r5.b
            java.lang.Object r6 = r5.n(r0)
            if (r6 != r4) goto L43
            goto L6f
        L43:
            p.o6y r6 = (p.o6y) r6
            if (r6 != 0) goto L4a
            p.q231 r5 = p.q231.a
            return r5
        L4a:
            r0.c = r2
            p.l441 r5 = new p.l441
            p.lnm r0 = p.aym.t(r0)
            r5.<init>(r0)
            p.km3 r6 = r6.a
            p.hfp1 r6 = r6.x()
            p.lmw r0 = new p.lmw
            r1 = 3
            r0.<init>(r5, r1)
            r6.b(r0)
            java.lang.Object r5 = r5.a()
            if (r5 != r4) goto L6b
            goto L6d
        L6b:
            p.rih1 r5 = p.rih1.a
        L6d:
            if (r5 != r4) goto L70
        L6f:
            return r4
        L70:
            p.u231 r5 = p.u231.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.f7y.b(p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r5 == r4) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(p.lnm r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p.z6y
            if (r0 == 0) goto L13
            r0 = r6
            p.z6y r0 = (p.z6y) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.z6y r0 = new p.z6y
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            p.hm5.M(r6)
            goto L70
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r5)
            r5 = 0
            return r5
        L31:
            p.hm5.M(r6)
            goto L43
        L35:
            p.hm5.M(r6)
            r0.c = r3
            p.wcr r5 = r5.b
            java.lang.Object r6 = r5.n(r0)
            if (r6 != r4) goto L43
            goto L6f
        L43:
            p.o6y r6 = (p.o6y) r6
            if (r6 != 0) goto L4a
            p.q231 r5 = p.q231.a
            return r5
        L4a:
            r0.c = r2
            p.l441 r5 = new p.l441
            p.lnm r0 = p.aym.t(r0)
            r5.<init>(r0)
            p.km3 r6 = r6.a
            p.hfp1 r6 = r6.y()
            p.mev r0 = new p.mev
            r1 = 5
            r0.<init>(r5, r1)
            r6.b(r0)
            java.lang.Object r5 = r5.a()
            if (r5 != r4) goto L6b
            goto L6d
        L6b:
            p.rih1 r5 = p.rih1.a
        L6d:
            if (r5 != r4) goto L70
        L6f:
            return r4
        L70:
            p.u231 r5 = p.u231.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.f7y.c(p.lnm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(onm onmVar) {
        a7y a7yVar;
        if (onmVar instanceof a7y) {
            a7yVar = (a7y) onmVar;
            int i = a7yVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                a7yVar.c = i - Integer.MIN_VALUE;
            } else {
                a7yVar = new a7y(this, onmVar);
            }
        } else {
            a7yVar = new a7y(this, onmVar);
        }
        Object objN = a7yVar.a;
        int i2 = a7yVar.c;
        boolean z = false;
        try {
            if (i2 == 0) {
                hm5.M(objN);
                wcr wcrVar = this.b;
                a7yVar.c = 1;
                objN = wcrVar.n(a7yVar);
                d9n d9nVar = d9n.a;
                if (objN == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objN);
            }
            if (objN != null) {
                z = true;
            }
        } catch (Exception unused) {
        }
        return yah0.m(z);
    }

    public final ArrayList e(yf yfVar) {
        List listI = yfVar.i();
        ArrayList arrayList = new ArrayList();
        Iterator it = listI.iterator();
        while (it.hasNext()) {
            Object objE = this.a.e((u310) it.next(), yfVar.g());
            Throwable thA = e331.a(objE);
            if (thA != null) {
                Logger.l(thA, "Error mapping item", new Object[0]);
                objE = null;
            }
            mby mbyVar = (mby) objE;
            if (mbyVar != null) {
                arrayList.add(mbyVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    /* JADX WARN: Code duplicated, block: B:32:0x0082  */
    /* JADX WARN: Code duplicated, block: B:35:0x0093 A[LOOP:0: B:33:0x008d->B:35:0x0093, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00db, code lost:
    
        if (r8 == r5) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(p.iu30 r9, p.onm r10) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.f7y.f(p.iu30, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008f  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:46:0x010f  */
    /* JADX WARN: Code duplicated, block: B:48:0x011f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0121  */
    /* JADX WARN: Code duplicated, block: B:52:0x0137 A[LOOP:3: B:50:0x0131->B:52:0x0137, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0151  */
    /* JADX WARN: Code duplicated, block: B:61:0x0178 A[LOOP:4: B:59:0x0172->B:61:0x0178, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x0199  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x019b, code lost:
    
        if (r0 == r6) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(p.r1t r18, p.onm r19) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.f7y.g(p.r1t, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008f, code lost:
    
        if (r5 == r4) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(p.lnm r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p.d7y
            if (r0 == 0) goto L13
            r0 = r6
            p.d7y r0 = (p.d7y) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.d7y r0 = new p.d7y
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            p.hm5.M(r6)
            goto L92
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r5)
            r5 = 0
            return r5
        L31:
            p.hm5.M(r6)
            goto L43
        L35:
            p.hm5.M(r6)
            r0.c = r3
            p.wcr r5 = r5.b
            java.lang.Object r6 = r5.n(r0)
            if (r6 != r4) goto L43
            goto L91
        L43:
            p.o6y r6 = (p.o6y) r6
            if (r6 != 0) goto L4a
            p.q231 r5 = p.q231.a
            return r5
        L4a:
            p.tz01 r5 = new p.tz01
            r1 = 23
            r5.<init>(r1)
            java.lang.String r1 = "https://open.spotify.com"
            java.lang.String r3 = "spotify-engage-sdk-sign-in"
            android.net.Uri r1 = p.ekb.l(r1, r3)
            r5.j(r1)
            p.kj81 r5 = r5.b()
            r0.c = r2
            p.l441 r1 = new p.l441
            p.lnm r0 = p.aym.t(r0)
            r1.<init>(r0)
            p.km3 r6 = r6.a
            p.rut0 r0 = new p.rut0
            r0.<init>()
            r0.l(r5)
            p.sks0 r5 = r0.c()
            p.hfp1 r5 = r6.O(r5)
            p.j3v r6 = new p.j3v
            r0 = 7
            r6.<init>(r1, r0)
            r5.b(r6)
            java.lang.Object r5 = r1.a()
            if (r5 != r4) goto L8d
            goto L8f
        L8d:
            p.rih1 r5 = p.rih1.a
        L8f:
            if (r5 != r4) goto L92
        L91:
            return r4
        L92:
            p.u231 r5 = p.u231.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.f7y.h(p.lnm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        if (r5 == r4) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(int r6, p.onm r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p.e7y
            if (r0 == 0) goto L13
            r0 = r7
            p.e7y r0 = (p.e7y) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.e7y r0 = new p.e7y
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            p.hm5.M(r7)
            goto L83
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r5)
            r5 = 0
            return r5
        L31:
            int r6 = r0.a
            p.hm5.M(r7)
            goto L47
        L37:
            p.hm5.M(r7)
            r0.a = r6
            r0.d = r3
            p.wcr r5 = r5.b
            java.lang.Object r7 = r5.n(r0)
            if (r7 != r4) goto L47
            goto L82
        L47:
            p.o6y r7 = (p.o6y) r7
            if (r7 != 0) goto L4e
            p.q231 r5 = p.q231.a
            return r5
        L4e:
            r0.a = r6
            r0.d = r2
            p.l441 r5 = new p.l441
            p.lnm r0 = p.aym.t(r0)
            r5.<init>(r0)
            p.km3 r7 = r7.a
            p.ij81 r0 = new p.ij81
            r1 = 26
            r0.<init>(r1)
            r0.s(r6)
            p.ij81 r6 = r0.i()
            p.hfp1 r6 = r7.V(r6)
            p.n6y r7 = new p.n6y
            r7.<init>(r5)
            r6.b(r7)
            java.lang.Object r5 = r5.a()
            if (r5 != r4) goto L7e
            goto L80
        L7e:
            p.rih1 r5 = p.rih1.a
        L80:
            if (r5 != r4) goto L83
        L82:
            return r4
        L83:
            p.u231 r5 = p.u231.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.f7y.i(int, p.onm):java.lang.Object");
    }
}
