package com.spotify.contribution.repositoryimpl;

import java.util.List;
import p.a8d1;
import p.lnm;
import p.rih1;
import p.vr20;
import p.vu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class d extends a8d1 implements vu30 {
    public byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ f c;
    public final /* synthetic */ List d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, List list, lnm lnmVar) {
        super(2, lnmVar);
        this.c = fVar;
        this.d = list;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        d dVar = new d(this.c, this.d, lnmVar);
        dVar.b = obj;
        return dVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
    
        if (r0.emit(r1, r10) == r6) goto L27;
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
            java.util.List r2 = r10.d
            r3 = 2
            r4 = 1
            r5 = 0
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L18
            p.hm5.M(r11)
            goto L88
        L18:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            return r5
        L1e:
            p.hm5.M(r11)
            goto L34
        L22:
            p.hm5.M(r11)
            com.spotify.contribution.repositoryimpl.f r11 = r10.c
            com.spotify.contribution.repositoryimpl.a r11 = r11.a
            r10.b = r0
            r10.a = r4
            java.io.Serializable r11 = r11.d(r2, r10)
            if (r11 != r6) goto L34
            goto L87
        L34:
            java.util.List r11 = (java.util.List) r11
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r1 = new java.util.ArrayList
            r4 = 10
            int r4 = p.q7h.U(r2, r4)
            r1.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
            r4 = 0
        L48:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L7d
            java.lang.Object r7 = r2.next()
            int r8 = r4 + 1
            if (r4 < 0) goto L79
            p.mld r7 = (p.mld) r7
            int r9 = r11.size()
            if (r4 >= r9) goto L67
            java.lang.Object r4 = r11.get(r4)
            p.gga r4 = (p.gga) r4
            java.lang.Object r4 = r4.b
            goto L6f
        L67:
            com.spotify.contribution.repositoryimpl.ContributionApiError$EmptyResponse r4 = com.spotify.contribution.repositoryimpl.ContributionApiError$EmptyResponse.a
            p.m231 r9 = new p.m231
            r9.<init>(r4)
            r4 = r9
        L6f:
            p.lpm r9 = new p.lpm
            r9.<init>(r7, r4)
            r1.add(r9)
            r4 = r8
            goto L48
        L79:
            p.p7h.T()
            throw r5
        L7d:
            r10.b = r5
            r10.a = r3
            java.lang.Object r10 = r0.emit(r1, r10)
            if (r10 != r6) goto L88
        L87:
            return r6
        L88:
            p.rih1 r10 = p.rih1.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.contribution.repositoryimpl.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
