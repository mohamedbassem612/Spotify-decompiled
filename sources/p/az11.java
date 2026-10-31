package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class az11 implements f961 {
    public final Context a;
    public final d021 b;
    public final nz11 c;
    public final zwz0 d;
    public final lmy0 e;
    public final Scheduler f;
    public final aq80 g;
    public final llm h;
    public s2t t;
    public final CompositeDisposable i = new CompositeDisposable();
    public final BehaviorSubject X = BehaviorSubject.f();

    public az11(Context context, q8n q8nVar, d021 d021Var, nz11 nz11Var, zwz0 zwz0Var, lmy0 lmy0Var, Scheduler scheduler, aq80 aq80Var) {
        this.a = context;
        this.b = d021Var;
        this.c = nz11Var;
        this.d = zwz0Var;
        this.e = lmy0Var;
        this.f = scheduler;
        this.g = aq80Var;
        this.h = l1d.x(q8nVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        if (p.b5p1.j(r10, r11, r0) == r7) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(p.onm r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof p.xy11
            if (r0 == 0) goto L13
            r0 = r11
            p.xy11 r0 = (p.xy11) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.xy11 r0 = new p.xy11
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.a
            int r1 = r0.c
            p.zwz0 r2 = r10.d
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            p.d9n r7 = p.d9n.a
            if (r1 == 0) goto L3e
            if (r1 == r5) goto L3a
            if (r1 == r4) goto L36
            if (r1 != r3) goto L30
            p.hm5.M(r11)
            goto L78
        L30:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            return r6
        L36:
            p.hm5.M(r11)
            goto L66
        L3a:
            p.hm5.M(r11)
            goto L55
        L3e:
            p.hm5.M(r11)
            p.mr20 r11 = r2.c()
            p.nw5 r1 = new p.nw5
            r8 = 29
            r1.<init>(r8)
            r0.c = r5
            java.lang.Object r11 = p.b5p1.j(r11, r1, r0)
            if (r11 != r7) goto L55
            goto L77
        L55:
            p.zy11 r11 = new p.zy11
            r1 = 0
            r11.<init>(r10, r6, r1)
            r0.c = r4
            r8 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r10 = p.rc2.O(r8, r11, r0)
            if (r10 != r7) goto L66
            goto L77
        L66:
            p.mr20 r10 = r2.c()
            p.yy11 r11 = new p.yy11
            r11.<init>(r5)
            r0.c = r3
            java.lang.Object r10 = p.b5p1.j(r10, r11, r0)
            if (r10 != r7) goto L78
        L77:
            return r7
        L78:
            p.rih1 r10 = p.rih1.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.az11.a(p.onm):java.lang.Object");
    }

    @Override // p.dwo
    public final void shutdown() {
        smo1.q(this.h);
        this.i.g();
    }

    @Override // p.f961
    public final Object getApi() {
        return this;
    }
}
