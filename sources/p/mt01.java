package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mt01 implements zob1 {
    public final /* synthetic */ long a;
    public final /* synthetic */ ay8 b;

    public mt01(long j, ay8 ay8Var) {
        this.a = j;
        this.b = ay8Var;
    }

    public final List c() {
        return Collections.singletonList(j1r.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (p.hap1.i(r7.a, r0) == r6) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(p.vr20 r8, p.lnm r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p.lt01
            if (r0 == 0) goto L13
            r0 = r9
            p.lt01 r0 = (p.lt01) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.lt01 r0 = new p.lt01
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L41
            if (r1 == r5) goto L3b
            if (r1 == r4) goto L35
            if (r1 == r3) goto L30
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r2
        L30:
            kotlin.KotlinNothingValueException r7 = p.l1d.v(r9)
            throw r7
        L35:
            p.vr20 r8 = r0.a
            p.hm5.M(r9)
            goto L5e
        L3b:
            p.vr20 r8 = r0.a
            p.hm5.M(r9)
            goto L51
        L41:
            p.hm5.M(r9)
            r0.a = r8
            r0.d = r5
            p.j1r r9 = p.j1r.a
            java.lang.Object r9 = r8.emit(r9, r0)
            if (r9 != r6) goto L51
            goto L5d
        L51:
            r0.a = r8
            r0.d = r4
            long r4 = r7.a
            java.lang.Object r9 = p.hap1.i(r4, r0)
            if (r9 != r6) goto L5e
        L5d:
            return r6
        L5e:
            r0.a = r2
            r0.d = r3
            p.ay8 r7 = r7.b
            r7.collect(r8, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.mt01.collect(p.vr20, p.lnm):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object getValue() {
        return j1r.a;
    }
}
