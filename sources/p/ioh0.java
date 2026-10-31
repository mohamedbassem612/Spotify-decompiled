package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ioh0 extends z031 implements vu30 {
    public final /* synthetic */ upa0 N0;
    public int X;
    public boolean Y;
    public /* synthetic */ Object Z;
    public Iterator b;
    public kqg0 c;
    public qnf1 d;
    public pnf1 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ioh0(upa0 upa0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.N0 = upa0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        ioh0 ioh0Var = new ioh0(this.N0, lnmVar);
        ioh0Var.Z = obj;
        return ioh0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((r561) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0040  */
    /* JADX WARN: Code duplicated, block: B:13:0x004b  */
    /* JADX WARN: Code duplicated, block: B:9:0x003a A[PHI: r14
      0x003a: PHI (r14v5 java.util.Iterator) = (r14v4 java.util.Iterator), (r14v6 java.util.Iterator) binds: [B:8:0x002d, B:12:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0040 -> B:12:0x0049). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004b -> B:14:0x0055). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0057 -> B:16:0x0061). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.Z
            p.r561 r0 = (p.r561) r0
            boolean r1 = r13.Y
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2d
            if (r1 != r3) goto L26
            int r1 = r13.X
            int r4 = r13.t
            int r5 = r13.i
            int r6 = r13.h
            int r7 = r13.g
            int r8 = r13.f
            p.pnf1 r9 = r13.e
            p.qnf1 r10 = r13.d
            p.kqg0 r11 = r13.c
            java.util.Iterator r12 = r13.b
            p.hm5.M(r14)
            int r4 = r4 + r3
            r14 = r12
            goto L61
        L26:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r13)
            r13 = 0
            return r13
        L2d:
            p.hm5.M(r14)
            p.upa0 r14 = r13.N0
            java.lang.Object r14 = r14.b
            java.util.List r14 = (java.util.List) r14
            java.util.Iterator r14 = r14.iterator()
        L3a:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L8d
            java.lang.Object r1 = r14.next()
            p.kqg0 r1 = (p.kqg0) r1
            int r4 = r1.a
            r5 = r2
        L49:
            if (r5 >= r4) goto L3a
            p.qnf1[] r6 = r1.c
            r6 = r6[r5]
            int r7 = r6.a
            r8 = r5
            r10 = r6
            r5 = r7
            r6 = r2
        L55:
            if (r6 >= r5) goto L8a
            p.pnf1 r9 = r10.a(r6)
            int r7 = r9.a
            r11 = r1
            r1 = r7
            r7 = r4
            r4 = r2
        L61:
            if (r4 >= r1) goto L85
            p.ie30[] r2 = r9.d
            r2 = r2[r4]
            r13.Z = r0
            r13.b = r14
            r13.c = r11
            r13.d = r10
            r13.e = r9
            r13.f = r8
            r13.g = r7
            r13.h = r6
            r13.i = r5
            r13.t = r4
            r13.X = r1
            r13.Y = r3
            r0.b(r2, r13)
            p.d9n r13 = p.d9n.a
            return r13
        L85:
            int r6 = r6 + 1
            r4 = r7
            r1 = r11
            goto L55
        L8a:
            int r5 = r8 + 1
            goto L49
        L8d:
            p.rih1 r13 = p.rih1.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ioh0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
