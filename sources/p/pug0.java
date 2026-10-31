package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pug0 implements lug0 {
    public final g7h a;
    public final ccc0 b;
    public final ao0 c;
    public final cyg0 d;
    public final s4w0 e;

    public pug0(g7h g7hVar, ccc0 ccc0Var, ao0 ao0Var, cyg0 cyg0Var, s4w0 s4w0Var) {
        this.a = g7hVar;
        this.b = ccc0Var;
        this.c = ao0Var;
        this.d = cyg0Var;
        this.e = s4w0Var;
    }

    @Override // p.lug0
    public final Observable a(String str) {
        Set set = s4b1.f;
        if (uic.x(str).c == blc0.de) {
            Observable observableDistinctUntilChanged = this.e.b(str).distinctUntilChanged();
            observableDistinctUntilChanged.getClass();
            return observableDistinctUntilChanged;
        }
        Observable map = g7h.d(this.a, "", new String[]{str}).distinctUntilChanged().map(new t4o(str, (byte) 5));
        map.getClass();
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if (r14 == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (r14 == r0) goto L29;
     */
    @Override // p.lug0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(boolean r10, java.lang.String r11, java.lang.String r12, p.tv80 r13, p.onm r14) {
        /*
            r9 = this;
            boolean r13 = r14 instanceof p.oug0
            if (r13 == 0) goto L13
            r13 = r14
            p.oug0 r13 = (p.oug0) r13
            int r0 = r13.e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r13.e = r0
            goto L18
        L13:
            p.oug0 r13 = new p.oug0
            r13.<init>(r9, r14)
        L18:
            java.lang.Object r14 = r13.c
            int r0 = r13.e
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L3b
            if (r0 == r2) goto L33
            if (r0 != r1) goto L2c
            boolean r10 = r13.a
            java.lang.String r12 = r13.b
            p.hm5.M(r14)
            goto L7b
        L2c:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            r9 = 0
            return r9
        L33:
            boolean r10 = r13.a
            java.lang.String r12 = r13.b
            p.hm5.M(r14)
            goto L64
        L3b:
            p.hm5.M(r14)
            p.ubc0 r14 = new p.ubc0
            if (r10 == 0) goto L44
            r0 = 6
            goto L45
        L44:
            r0 = 5
        L45:
            p.cyg0 r3 = r9.d
            p.tv80 r0 = r3.c(r0, r11, r12)
            r14.<init>(r0)
            p.d9n r0 = p.d9n.a
            p.ccc0 r3 = r9.b
            if (r10 == 0) goto L6b
            r13.b = r12
            r13.a = r10
            r13.e = r2
            r3.getClass()
            java.lang.Object r14 = p.ccc0.i(r3, r11, r2, r14, r13)
            if (r14 != r0) goto L64
            goto L7a
        L64:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            r14.getClass()
        L69:
            r2 = r12
            goto L81
        L6b:
            r13.b = r12
            r13.a = r10
            r13.e = r1
            r3.getClass()
            java.lang.Object r14 = p.ccc0.c(r3, r11, r2, r14, r13)
            if (r14 != r0) goto L7b
        L7a:
            return r0
        L7b:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            r14.getClass()
            goto L69
        L81:
            if (r10 != 0) goto L97
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
        L97:
            p.rih1 r9 = p.rih1.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.pug0.b(boolean, java.lang.String, java.lang.String, p.tv80, p.onm):java.lang.Object");
    }

    @Override // p.lug0
    public final Completable c(String str, String str2, boolean z) {
        String str3;
        if (z) {
            str3 = str2;
        } else {
            str3 = str2;
            ao0.c(this.c, co0.d, str3, 0L, "heart", (String) null, (String) null, (String) null, 112);
        }
        this.d.c(z ? 6 : 5, str, str3);
        return this.e.d(str, (tv80) null, !z);
    }
}
