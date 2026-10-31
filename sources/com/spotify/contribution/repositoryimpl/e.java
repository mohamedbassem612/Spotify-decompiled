package com.spotify.contribution.repositoryimpl;

import java.util.ArrayList;
import p.a8d1;
import p.lnm;
import p.rih1;
import p.vr20;
import p.vu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class e extends a8d1 implements vu30 {
    public byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ f c;
    public final /* synthetic */ ArrayList d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, ArrayList arrayList, lnm lnmVar) {
        super(2, lnmVar);
        this.c = fVar;
        this.d = arrayList;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        e eVar = new e(this.c, this.d, lnmVar);
        eVar.b = obj;
        return eVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (r0.emit(r11, r10) == r7) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.b
            p.vr20 r0 = (p.vr20) r0
            byte r1 = r10.a
            r2 = 10
            java.util.ArrayList r3 = r10.d
            r4 = 2
            r5 = 0
            r6 = 1
            p.d9n r7 = p.d9n.a
            if (r1 == 0) goto L23
            if (r1 == r6) goto L1f
            if (r1 != r4) goto L19
            p.hm5.M(r11)
            goto L68
        L19:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            return r5
        L1f:
            p.hm5.M(r11)
            goto L48
        L23:
            p.hm5.M(r11)
            com.spotify.contribution.repositoryimpl.f r11 = r10.c
            com.spotify.contribution.repositoryimpl.a r11 = r11.a
            java.util.ArrayList r1 = new java.util.ArrayList
            int r8 = p.q7h.U(r3, r2)
            r1.<init>(r8)
            java.util.Iterator r8 = r3.iterator()
            boolean r9 = r8.hasNext()
            if (r9 != 0) goto L73
            r10.b = r0
            r10.a = r6
            java.io.Serializable r11 = r11.e(r1, r10)
            if (r11 != r7) goto L48
            goto L67
        L48:
            java.util.List r11 = (java.util.List) r11
            java.util.ArrayList r11 = new java.util.ArrayList
            int r1 = p.q7h.U(r3, r2)
            r11.<init>(r1)
            java.util.Iterator r1 = r3.iterator()
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L6b
            r10.b = r5
            r10.a = r4
            java.lang.Object r10 = r0.emit(r11, r10)
            if (r10 != r7) goto L68
        L67:
            return r7
        L68:
            p.rih1 r10 = p.rih1.a
            return r10
        L6b:
            java.lang.Object r10 = r1.next()
            p.pze0.m(r10)
            throw r5
        L73:
            java.lang.Object r10 = r8.next()
            p.pze0.m(r10)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.contribution.repositoryimpl.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
