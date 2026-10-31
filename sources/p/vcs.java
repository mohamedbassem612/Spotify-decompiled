package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vcs extends a8d1 implements xu30 {
    public l6s a;
    public Iterator b;
    public Object c;
    public int d;
    public boolean e;
    public /* synthetic */ hqw0 f;
    public /* synthetic */ List g;
    public final /* synthetic */ l6s h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vcs(l6s l6sVar, lnm lnmVar) {
        super(3, lnmVar);
        this.h = l6sVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        vcs vcsVar = new vcs(this.h, (lnm) obj3);
        vcsVar.f = (hqw0) obj;
        vcsVar.g = (List) obj2;
        return vcsVar.invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    /* JADX WARN: Code duplicated, block: B:13:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x005e A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0053 -> B:14:0x0056). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:16:0x005e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            p.hqw0 r0 = r8.f
            java.util.List r1 = r8.g
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r8.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L20
            if (r2 != r3) goto L1a
            int r1 = r8.d
            java.lang.Object r2 = r8.c
            java.util.Iterator r5 = r8.b
            p.l6s r6 = r8.a
            p.hm5.M(r9)
            goto L56
        L1a:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r4
        L20:
            p.hm5.M(r9)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r9 = r1.iterator()
            r1 = 0
            p.l6s r2 = r8.h
            r5 = r9
            r6 = r2
        L2e:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L5f
            java.lang.Object r2 = r5.next()
            r9 = r2
            p.qo90 r9 = (p.qo90) r9
            java.lang.Object r7 = r6.c
            p.qy40 r7 = (p.qy40) r7
            r8.f = r0
            r8.g = r4
            r8.a = r6
            r8.b = r5
            r8.c = r2
            r8.d = r1
            r8.e = r3
            java.lang.Object r9 = r7.a(r0, r9, r8)
            p.d9n r7 = p.d9n.a
            if (r9 != r7) goto L56
            return r7
        L56:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L2e
            return r2
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.vcs.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
