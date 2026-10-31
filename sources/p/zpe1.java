package p;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zpe1 extends a8d1 implements vu30 {
    public int a;
    public byte b;
    public final /* synthetic */ AtomicInteger c;
    public final /* synthetic */ ssw0 d;
    public final /* synthetic */ p811 e;
    public final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpe1(AtomicInteger atomicInteger, ssw0 ssw0Var, p811 p811Var, long j, lnm lnmVar) {
        super(2, lnmVar);
        this.c = atomicInteger;
        this.d = ssw0Var;
        this.e = p811Var;
        this.f = j;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new zpe1(this.c, this.d, this.e, this.f, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (p.hap1.j(r7.f, r7) == r4) goto L17;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0044 -> B:18:0x0047). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            byte r0 = r7.b
            java.util.concurrent.atomic.AtomicInteger r1 = r7.c
            r2 = 2
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r0 == 0) goto L21
            if (r0 == r3) goto L1b
            if (r0 != r2) goto L14
            int r0 = r7.a
            p.hm5.M(r8)
            goto L47
        L14:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            r7 = 0
            return r7
        L1b:
            int r0 = r7.a
            p.hm5.M(r8)
            goto L3a
        L21:
            p.hm5.M(r8)
        L24:
            int r8 = r1.get()
            p.p811 r0 = r7.e
            java.lang.Object r0 = r0.a
            r7.a = r8
            r7.b = r3
            p.ssw0 r5 = r7.d
            java.lang.Object r0 = r5.b(r0, r7)
            if (r0 != r4) goto L39
            goto L46
        L39:
            r0 = r8
        L3a:
            r7.a = r0
            r7.b = r2
            long r5 = r7.f
            java.lang.Object r8 = p.hap1.j(r5, r7)
            if (r8 != r4) goto L47
        L46:
            return r4
        L47:
            int r8 = r1.get()
            if (r0 != r8) goto L24
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.zpe1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
