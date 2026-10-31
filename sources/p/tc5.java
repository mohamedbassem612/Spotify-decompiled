package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tc5 extends a8d1 implements vu30 {
    public final /* synthetic */ ven0 X;
    public final /* synthetic */ ven0 Y;
    public ven0 a;
    public ven0 b;
    public Iterator c;
    public Iterator d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public /* synthetic */ Object i;
    public final /* synthetic */ cqs0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc5(cqs0 cqs0Var, ven0 ven0Var, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.t = cqs0Var;
        this.X = ven0Var;
        this.Y = ven0Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        tc5 tc5Var = new tc5(this.t, this.X, this.Y, lnmVar);
        tc5Var.i = obj;
        return tc5Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035  */
    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0097  */
    /* JADX WARN: Code duplicated, block: B:9:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0035 -> B:12:0x0046). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x004c -> B:15:0x0061). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0035
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.i
            p.c9n r0 = (p.c9n) r0
            boolean r1 = r11.h
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            int r1 = r11.g
            int r4 = r11.f
            int r5 = r11.e
            java.util.Iterator r6 = r11.d
            java.util.Iterator r7 = r11.c
            p.ven0 r8 = r11.b
            p.ven0 r9 = r11.a
            p.hm5.M(r12)
            r12 = r7
            r7 = r5
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r1
            r1 = r9
            goto L61
        L25:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r11)
            r11 = 0
            return r11
        L2c:
            p.hm5.M(r12)
        L2f:
            boolean r12 = p.smo1.u(r0)
            if (r12 == 0) goto L97
            p.cqs0 r12 = r11.t
            p.m7 r12 = (p.m7) r12
            java.util.Set r12 = r12.a()
            java.util.Iterator r12 = r12.iterator()
            p.ven0 r1 = r11.X
            p.ven0 r4 = r11.Y
            r5 = r3
        L46:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto L2f
            java.lang.Object r6 = r12.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r6 = r6.getValue()
            p.c380 r6 = (p.c380) r6
            java.util.Iterator r6 = r6.iterator()
            r7 = r5
            r8 = r6
            r6 = r3
            r5 = r4
            r4 = r6
        L61:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L94
            java.lang.Object r9 = r8.next()
            p.oag1 r9 = (p.oag1) r9
            java.lang.String r10 = r9.a
            r1.setValue(r10)
            java.lang.String r10 = r9.b
            r5.setValue(r10)
            long r9 = r9.c
            r11.i = r0
            r11.a = r1
            r11.b = r5
            r11.c = r12
            r11.d = r8
            r11.e = r7
            r11.f = r6
            r11.g = r4
            r11.h = r2
            java.lang.Object r9 = p.hap1.i(r9, r11)
            p.d9n r10 = p.d9n.a
            if (r9 != r10) goto L61
            return r10
        L94:
            r4 = r5
            r5 = r7
            goto L46
        L97:
            p.rih1 r11 = p.rih1.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p.tc5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
