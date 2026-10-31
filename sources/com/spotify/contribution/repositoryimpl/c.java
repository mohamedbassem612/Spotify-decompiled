package com.spotify.contribution.repositoryimpl;

import java.util.ArrayList;
import p.a8d1;
import p.lnm;
import p.rih1;
import p.vr20;
import p.vu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class c extends a8d1 implements vu30 {
    public byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ f c;
    public final /* synthetic */ ArrayList d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, ArrayList arrayList, lnm lnmVar) {
        super(2, lnmVar);
        this.c = fVar;
        this.d = arrayList;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        c cVar = new c(this.c, this.d, lnmVar);
        cVar.b = obj;
        return cVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00af, code lost:
    
        if (r0.emit(r1, r13) == r7) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.b
            p.vr20 r0 = (p.vr20) r0
            byte r1 = r13.a
            r2 = 10
            java.util.ArrayList r3 = r13.d
            r4 = 2
            r5 = 1
            r6 = 0
            p.d9n r7 = p.d9n.a
            if (r1 == 0) goto L24
            if (r1 == r5) goto L20
            if (r1 != r4) goto L1a
            p.hm5.M(r14)
            goto Lb2
        L1a:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r13)
            return r6
        L20:
            p.hm5.M(r14)
            goto L5e
        L24:
            p.hm5.M(r14)
            com.spotify.contribution.repositoryimpl.f r14 = r13.c
            com.spotify.contribution.repositoryimpl.a r14 = r14.a
            java.util.ArrayList r1 = new java.util.ArrayList
            int r8 = p.q7h.U(r3, r2)
            r1.<init>(r8)
            java.util.Iterator r8 = r3.iterator()
        L38:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L53
            java.lang.Object r9 = r8.next()
            p.jpm r9 = (p.jpm) r9
            p.dm40 r10 = new p.dm40
            p.nvm r11 = r9.a
            p.lqm r12 = r9.b
            java.lang.Integer r9 = r9.c
            r10.<init>(r11, r12, r9)
            r1.add(r10)
            goto L38
        L53:
            r13.b = r0
            r13.a = r5
            java.io.Serializable r14 = r14.c(r1, r13)
            if (r14 != r7) goto L5e
            goto Lb1
        L5e:
            java.util.List r14 = (java.util.List) r14
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = p.q7h.U(r3, r2)
            r1.<init>(r2)
            java.util.Iterator r2 = r3.iterator()
            r3 = 0
        L6e:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto La7
            java.lang.Object r5 = r2.next()
            int r8 = r3 + 1
            if (r3 < 0) goto La3
            p.jpm r5 = (p.jpm) r5
            int r9 = r14.size()
            if (r3 >= r9) goto L8d
            java.lang.Object r3 = r14.get(r3)
            p.gga r3 = (p.gga) r3
            java.lang.Object r3 = r3.b
            goto L95
        L8d:
            com.spotify.contribution.repositoryimpl.ContributionApiError$EmptyResponse r3 = com.spotify.contribution.repositoryimpl.ContributionApiError$EmptyResponse.a
            p.m231 r9 = new p.m231
            r9.<init>(r3)
            r3 = r9
        L95:
            p.ipm r9 = new p.ipm
            p.nvm r10 = r5.a
            p.lqm r5 = r5.b
            r9.<init>(r10, r5, r3)
            r1.add(r9)
            r3 = r8
            goto L6e
        La3:
            p.p7h.T()
            throw r6
        La7:
            r13.b = r6
            r13.a = r4
            java.lang.Object r13 = r0.emit(r1, r13)
            if (r13 != r7) goto Lb2
        Lb1:
            return r7
        Lb2:
            p.rih1 r13 = p.rih1.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.contribution.repositoryimpl.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
