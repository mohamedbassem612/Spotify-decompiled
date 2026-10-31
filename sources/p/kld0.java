package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kld0 extends a8d1 implements vu30 {
    public long a;
    public long b;
    public byte c;
    public /* synthetic */ Object d;
    public final /* synthetic */ skd0 e;
    public final /* synthetic */ o811 f;
    public final /* synthetic */ ssw0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kld0(skd0 skd0Var, o811 o811Var, ssw0 ssw0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.e = skd0Var;
        this.f = o811Var;
        this.g = ssw0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        kld0 kld0Var = new kld0(this.e, this.f, this.g, lnmVar);
        kld0Var.d = obj;
        return kld0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        create((PlayerState) obj, (lnm) obj2).invokeSuspend(rih1.a);
        return d9n.a;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0054  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        if (p.hap1.i(1000, r14) == r7) goto L18;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0066 -> B:7:0x001a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.d
            com.spotify.player.model.PlayerState r0 = (com.spotify.player.model.PlayerState) r0
            byte r1 = r14.c
            r2 = 0
            r3 = 1000(0x3e8, double:4.94E-321)
            r5 = 2
            r6 = 1
            p.d9n r7 = p.d9n.a
            if (r1 == 0) goto L2c
            if (r1 == r6) goto L24
            if (r1 != r5) goto L1e
            long r0 = r14.b
            long r8 = r14.a
            p.hm5.M(r15)
        L1a:
            r12 = r8
            r8 = r0
            r0 = r12
            goto L37
        L1e:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r14)
            return r2
        L24:
            long r0 = r14.b
            long r8 = r14.a
            p.hm5.M(r15)
            goto L57
        L2c:
            p.hm5.M(r15)
            p.skd0 r15 = r14.e
            long r0 = r15.a(r0)
            r8 = 0
        L37:
            long r10 = r8 * r3
            long r10 = r10 + r0
            p.o811 r15 = r14.f
            r15.a = r10
            p.jld0 r15 = new p.jld0
            r15.<init>(r6, r10)
            r14.d = r2
            r14.a = r0
            r14.b = r8
            r14.c = r6
            p.ssw0 r10 = r14.g
            java.lang.Object r15 = r10.b(r15, r14)
            if (r15 != r7) goto L54
            goto L68
        L54:
            r12 = r8
            r8 = r0
            r0 = r12
        L57:
            r10 = 1
            long r0 = r0 + r10
            r14.d = r2
            r14.a = r8
            r14.b = r0
            r14.c = r5
            java.lang.Object r15 = p.hap1.i(r3, r14)
            if (r15 != r7) goto L1a
        L68:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.kld0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
