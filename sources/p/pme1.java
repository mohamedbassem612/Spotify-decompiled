package p;

import com.spotify.wrapped.v1.proto.SceneTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pme1 extends a8d1 implements vu30 {
    public byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ SceneTemplate.TimeMachineContent.Card2 c;
    public final /* synthetic */ qme1 d;
    public final /* synthetic */ g7m1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pme1(SceneTemplate.TimeMachineContent.Card2 card2, qme1 qme1Var, g7m1 g7m1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = card2;
        this.d = qme1Var;
        this.e = g7m1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        pme1 pme1Var = new pme1(this.c, this.d, this.e, lnmVar);
        pme1Var.b = obj;
        return pme1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((ni31) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if (r12 == r10) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.b
            p.ni31 r0 = (p.ni31) r0
            byte r1 = r11.a
            p.qme1 r5 = r11.d
            com.spotify.wrapped.v1.proto.SceneTemplate$TimeMachineContent$Card2 r3 = r11.c
            r8 = 2
            r2 = 1
            r9 = 0
            p.d9n r10 = p.d9n.a
            if (r1 == 0) goto L23
            if (r1 == r2) goto L1f
            if (r1 != r8) goto L19
            p.hm5.M(r12)
            goto L70
        L19:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r11)
            return r9
        L1f:
            p.hm5.M(r12)
            goto L5a
        L23:
            p.hm5.M(r12)
            p.h290 r12 = r3.v()
            java.util.Iterator r12 = r12.iterator()
        L2e:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L78
            java.lang.Object r1 = r12.next()
            com.spotify.wrapped.v1.proto.SceneTemplate$TimeMachineContent$Card2$YearEntry r1 = (com.spotify.wrapped.v1.proto.SceneTemplate.TimeMachineContent.Card2.YearEntry) r1
            boolean r4 = r1.y()
            if (r4 == 0) goto L2e
            com.spotify.wrapped.v1.proto.RiveAnimation r12 = r1.s()
            java.lang.String r12 = r12.getUrl()
            p.ti31 r1 = r5.d
            r12.getClass()
            r11.b = r9
            r11.a = r2
            p.b7x r2 = p.b7x.a
            java.lang.Object r12 = r1.a(r12, r0, r2, r11)
            if (r12 != r10) goto L5a
            goto L6f
        L5a:
            r6 = r12
            p.oi31 r6 = (p.oi31) r6
            p.ome1 r2 = new p.ome1
            p.g7m1 r4 = r11.e
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            r11.b = r9
            r11.a = r8
            java.lang.Object r12 = p.smo1.s(r2, r11)
            if (r12 != r10) goto L70
        L6f:
            return r10
        L70:
            java.util.List r12 = (java.util.List) r12
            p.eme1 r11 = new p.eme1
            r11.<init>(r12)
            return r11
        L78:
            java.lang.String r11 = "Collection contains no element matching the predicate."
            p.bhn0.t(r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.pme1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
