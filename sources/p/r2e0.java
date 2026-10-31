package p;

import com.spotify.home.evopage.mobius.Effect;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r2e0 extends a8d1 implements xu30 {
    public ice0 a;
    public vr20 b;
    public byte c;
    public /* synthetic */ Throwable d;
    public final /* synthetic */ Effect.LoadHomeStructure e;
    public final /* synthetic */ vr20 f;
    public final /* synthetic */ y2e0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2e0(Effect.LoadHomeStructure loadHomeStructure, vr20 vr20Var, y2e0 y2e0Var, lnm lnmVar) {
        super(3, lnmVar);
        this.e = loadHomeStructure;
        this.f = vr20Var;
        this.g = y2e0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        vr20 vr20Var = this.f;
        y2e0 y2e0Var = this.g;
        r2e0 r2e0Var = new r2e0(this.e, vr20Var, y2e0Var, (lnm) obj3);
        r2e0Var.d = (Throwable) obj2;
        return r2e0Var.invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r1.emit(r7, r8) == r6) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Throwable r0 = r8.d
            byte r1 = r8.c
            p.y2e0 r2 = r8.g
            r3 = 2
            r4 = 1
            r5 = 0
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L15
            p.hm5.M(r9)
            goto L6d
        L15:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r5
        L1b:
            p.vr20 r1 = r8.b
            p.ice0 r4 = r8.a
            p.hm5.M(r9)
            goto L4f
        L23:
            p.hm5.M(r9)
            com.spotify.home.evopage.mobius.Effect$LoadHomeStructure r9 = r8.e
            p.ice0 r1 = r9.getLoadingStrategy()
            p.ice0 r7 = p.ice0.a
            if (r1 != r7) goto L33
            p.ice0 r9 = p.ice0.c
            goto L37
        L33:
            p.ice0 r9 = r9.getLoadingStrategy()
        L37:
            p.gqr r1 = r2.g
            io.reactivex.rxjava3.core.Observable r1 = r1.a
            r8.d = r0
            r8.a = r9
            p.vr20 r7 = r8.f
            r8.b = r7
            r8.c = r4
            java.lang.Object r1 = p.fc11.l(r1, r4, r5, r8)
            if (r1 != r6) goto L4c
            goto L6c
        L4c:
            r4 = r9
            r9 = r1
            r1 = r7
        L4f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            p.lmo r2 = r2.f
            java.lang.String r2 = r2.a
            com.spotify.home.evopage.mobius.Event$FailedToLoadHomeStructure r7 = new com.spotify.home.evopage.mobius.Event$FailedToLoadHomeStructure
            r7.<init>(r0, r4, r2, r9)
            r8.d = r5
            r8.a = r5
            r8.b = r5
            r8.c = r3
            java.lang.Object r8 = r1.emit(r7, r8)
            if (r8 != r6) goto L6d
        L6c:
            return r6
        L6d:
            p.rih1 r8 = p.rih1.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.r2e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
