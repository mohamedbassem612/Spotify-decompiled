package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nug0 implements lug0 {
    public final g7h a;
    public final ccc0 b;
    public final ao0 c;
    public final s4w0 d;

    public nug0(g7h g7hVar, ccc0 ccc0Var, ao0 ao0Var, s4w0 s4w0Var) {
        this.a = g7hVar;
        this.b = ccc0Var;
        this.c = ao0Var;
        this.d = s4w0Var;
    }

    @Override // p.lug0
    public final Observable a(String str) {
        Set set = s4b1.f;
        if (uic.x(str).c == blc0.de) {
            Observable observableDistinctUntilChanged = this.d.b(str).distinctUntilChanged();
            observableDistinctUntilChanged.getClass();
            return observableDistinctUntilChanged;
        }
        Observable map = g7h.d(this.a, "", new String[]{str}).distinctUntilChanged().map(new xrh(str, (byte) 2));
        map.getClass();
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (r14 == r13) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        if (r14 == r13) goto L28;
     */
    @Override // p.lug0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(boolean r10, java.lang.String r11, java.lang.String r12, p.tv80 r13, p.onm r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof p.mug0
            if (r0 == 0) goto L13
            r0 = r14
            p.mug0 r0 = (p.mug0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.mug0 r0 = new p.mug0
            r0.<init>(r9, r14)
        L18:
            java.lang.Object r14 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2d
            boolean r10 = r0.a
            java.lang.String r12 = r0.b
            p.hm5.M(r14)
            goto L6c
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r4
        L33:
            boolean r10 = r0.a
            java.lang.String r12 = r0.b
            p.hm5.M(r14)
            goto L58
        L3b:
            p.hm5.M(r14)
            if (r13 == 0) goto L45
            p.ubc0 r4 = new p.ubc0
            r4.<init>(r13)
        L45:
            p.d9n r13 = p.d9n.a
            p.ccc0 r14 = r9.b
            if (r10 == 0) goto L5f
            r0.b = r12
            r0.a = r10
            r0.e = r3
            java.lang.Object r14 = p.ccc0.i(r14, r11, r3, r4, r0)
            if (r14 != r13) goto L58
            goto L6b
        L58:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            r14.getClass()
        L5d:
            r2 = r12
            goto L72
        L5f:
            r0.b = r12
            r0.a = r10
            r0.e = r2
            java.lang.Object r14 = p.ccc0.c(r14, r11, r3, r4, r0)
            if (r14 != r13) goto L6c
        L6b:
            return r13
        L6c:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            r14.getClass()
            goto L5d
        L72:
            if (r10 != 0) goto L88
            p.co0 r1 = p.co0.d
            r10 = 0
            java.lang.Long r3 = java.lang.Long.valueOf(r10)
            r7 = 0
            r8 = 112(0x70, float:1.57E-43)
            p.ao0 r0 = r9.c
            java.lang.String r4 = "heart"
            r5 = 0
            r6 = 0
            p.ao0.c(r0, r1, r2, r3, r4, r5, r6, r7, r8)
        L88:
            p.rih1 r9 = p.rih1.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.nug0.b(boolean, java.lang.String, java.lang.String, p.tv80, p.onm):java.lang.Object");
    }

    @Override // p.lug0
    public final Completable c(String str, String str2, boolean z) {
        if (!z) {
            ao0.c(this.c, co0.d, str2, 0L, "heart", (String) null, (String) null, (String) null, 112);
        }
        return this.d.d(str, (tv80) null, !z);
    }
}
