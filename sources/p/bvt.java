package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bvt implements a4l {
    public final Observable a;
    public final gz4 b;
    public final llm c;
    public Boolean d;
    public final ArrayList e = new ArrayList();
    public final xgn0 f = ygn0.a();

    public bvt(Observable observable, gz4 gz4Var, q8n q8nVar) {
        this.a = observable;
        this.b = gz4Var;
        this.c = l1d.x(q8nVar);
    }

    @Override // p.a4l
    public final void a() {
        if (this.b.c()) {
            op71.r(this.c.a);
            c921.D(new n5s(this, new zut(this, (byte) 0), (lnm) null, (byte) 24));
        }
    }

    @Override // p.a4l
    public final void b() {
        if (this.b.c()) {
            l4p1.u(this.c, f5p1.q(rqt0.u(yoi1.g(this.a)), new z6n(this)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:? A[LOOP:0: B:20:0x005c->B:30:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r7 == r4) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(boolean r6, p.lnm r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p.yut
            if (r0 == 0) goto L13
            r0 = r7
            p.yut r0 = (p.yut) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            p.yut r0 = new p.yut
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.d
            int r1 = r0.f
            r2 = 2
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L37
            if (r1 != r2) goto L30
            int r5 = r0.c
            boolean r6 = r0.a
            java.util.Iterator r1 = r0.b
            p.hm5.M(r7)
            goto L5c
        L30:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r5)
            r5 = 0
            return r5
        L37:
            boolean r6 = r0.a
            p.hm5.M(r7)
            goto L51
        L3d:
            p.hm5.M(r7)
            p.xt7 r7 = new p.xt7
            r1 = 3
            r7.<init>(r5, r6, r1)
            r0.a = r6
            r0.f = r3
            java.lang.Object r7 = r5.d(r7, r0)
            if (r7 != r4) goto L51
            goto L76
        L51:
            java.util.List r7 = (java.util.List) r7
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r5 = r7.iterator()
            r7 = 0
            r1 = r5
            r5 = r7
        L5c:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L77
            java.lang.Object r7 = r1.next()
            p.iu30 r7 = (p.iu30) r7
            r0.b = r1
            r0.a = r6
            r0.c = r5
            r0.f = r2
            java.lang.Object r7 = r7.invoke(r0)
            if (r7 != r4) goto L5c
        L76:
            return r4
        L77:
            p.rih1 r5 = p.rih1.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.bvt.c(boolean, p.lnm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(Function0 function0, onm onmVar) {
        avt avtVar;
        xgn0 xgn0Var;
        if (onmVar instanceof avt) {
            avtVar = (avt) onmVar;
            int i = avtVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                avtVar.e = i - Integer.MIN_VALUE;
            } else {
                avtVar = new avt(this, onmVar);
            }
        } else {
            avtVar = new avt(this, onmVar);
        }
        Object obj = avtVar.c;
        int i2 = avtVar.e;
        if (i2 == 0) {
            hm5.M(obj);
            avtVar.a = (hab0) function0;
            xgn0Var = this.f;
            avtVar.b = xgn0Var;
            avtVar.e = 1;
            Object objA = xgn0Var.a(avtVar);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xgn0Var = avtVar.b;
            function0 = (Function0) avtVar.a;
            hm5.M(obj);
        }
        try {
            return function0.invoke();
        } finally {
            xgn0Var.c((Object) null);
        }
    }
}
