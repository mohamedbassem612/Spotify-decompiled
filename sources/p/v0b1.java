package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class v0b1 implements wyo0 {
    public final fza1 a;
    public final ObservableFromPublisher b;
    public final ay0 c;
    public final Observable d;
    public final idd1 e;
    public final jge f;

    public v0b1(fza1 fza1Var, ObservableFromPublisher observableFromPublisher, ay0 ay0Var, Observable observable, dg30 dg30Var, wiq wiqVar, Flowable flowable) {
        this.a = fza1Var;
        this.b = observableFromPublisher;
        this.c = ay0Var;
        this.d = observable;
        this.e = new idd1(new gga1(wiqVar, (byte) 6));
        vbm[] vbmVarArr = q601.a;
        this.f = hu20.e(rqt0.w(new kge((moy0) flowable), r0b1.a, rqt0.b), new uu61((lnm) null, this, dg30Var));
    }

    public final mr20 a() {
        return this.f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (r6.e(r0) == r4) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r7, p.onm r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p.u0b1
            if (r0 == 0) goto L13
            r0 = r8
            p.u0b1 r0 = (p.u0b1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.u0b1 r0 = new p.u0b1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            int r1 = r0.c
            p.ay0 r6 = r6.c
            r2 = 2
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2c
            p.hm5.M(r8)     // Catch: java.lang.Exception -> L5f
            goto L5f
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            r6 = 0
            return r6
        L33:
            p.hm5.M(r8)     // Catch: java.lang.Exception -> L5f
            goto L56
        L37:
            p.hm5.M(r8)
            p.qrd1 r8 = new p.qrd1     // Catch: java.lang.Exception -> L5f
            p.prd1 r1 = new p.prd1     // Catch: java.lang.Exception -> L5f
            r1.<init>()     // Catch: java.lang.Exception -> L5f
            p.mmr0 r5 = new p.mmr0     // Catch: java.lang.Exception -> L5f
            r5.<init>(r1, r7)     // Catch: java.lang.Exception -> L5f
            p.mmr0[] r7 = new p.mmr0[]{r5}     // Catch: java.lang.Exception -> L5f
            r8.<init>(r7)     // Catch: java.lang.Exception -> L5f
            r0.c = r3     // Catch: java.lang.Exception -> L5f
            java.lang.Object r7 = p.ay0.b(r6, r8, r0, r2)     // Catch: java.lang.Exception -> L5f
            if (r7 != r4) goto L56
            goto L5e
        L56:
            r0.c = r2     // Catch: java.lang.Exception -> L5f
            java.lang.Object r6 = r6.e(r0)     // Catch: java.lang.Exception -> L5f
            if (r6 != r4) goto L5f
        L5e:
            return r4
        L5f:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.v0b1.b(java.lang.String, p.onm):java.lang.Object");
    }
}
