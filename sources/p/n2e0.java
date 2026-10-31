package p;

import com.spotify.home.evopage.mobius.Effect;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class n2e0 extends a8d1 implements vu30 {
    public vr20 a;
    public byte b;
    public /* synthetic */ Object c;
    public final /* synthetic */ y2e0 d;
    public final /* synthetic */ Effect.LoadHomeStructure e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2e0(Effect.LoadHomeStructure loadHomeStructure, lnm lnmVar, y2e0 y2e0Var) {
        super(2, lnmVar);
        this.d = y2e0Var;
        this.e = loadHomeStructure;
    }

    @Override // p.faa
    public final lnm create(Object obj, lnm lnmVar) {
        n2e0 n2e0Var = new n2e0(this.e, lnmVar, this.d);
        n2e0Var.c = obj;
        return n2e0Var;
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        return ((n2e0) create((vr20) obj, (lnm) obj2)).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (r0.emit(r7, r6) == r5) goto L15;
     */
    @Override // p.faa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.c
            p.vr20 r0 = (p.vr20) r0
            byte r1 = r6.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L21
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L15
            p.hm5.M(r7)
            goto L42
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L1b:
            p.vr20 r0 = r6.a
            p.hm5.M(r7)
            goto L35
        L21:
            p.hm5.M(r7)
            r6.c = r4
            r6.a = r0
            r6.b = r3
            p.y2e0 r7 = r6.d
            com.spotify.home.evopage.mobius.Effect$LoadHomeStructure r1 = r6.e
            java.lang.Object r7 = r7.b(r1, r6)
            if (r7 != r5) goto L35
            goto L41
        L35:
            r6.c = r4
            r6.a = r4
            r6.b = r2
            java.lang.Object r6 = r0.emit(r7, r6)
            if (r6 != r5) goto L42
        L41:
            return r5
        L42:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.n2e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
