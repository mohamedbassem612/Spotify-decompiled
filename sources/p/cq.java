package p;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
public final class cq extends a8d1 implements vu30 {
    public SharedPreferences a;
    public Object b;
    public byte c;
    public /* synthetic */ Object d;
    public final /* synthetic */ iq e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq(iq iqVar, lnm lnmVar) {
        super(2, lnmVar);
        this.e = iqVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        cq cqVar = new cq(this.e, lnmVar);
        cqVar.d = obj;
        return cqVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if (p.jch0.s(r0, r8, r7) == r5) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.d
            p.ssw0 r0 = (p.ssw0) r0
            byte r1 = r7.c
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L25
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L15
            p.hm5.M(r8)
            goto L61
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r4
        L1b:
            java.lang.Object r1 = r7.b
            android.content.SharedPreferences$OnSharedPreferenceChangeListener r1 = (android.content.SharedPreferences.OnSharedPreferenceChangeListener) r1
            android.content.SharedPreferences r3 = r7.a
            p.hm5.M(r8)
            goto L48
        L25:
            p.hm5.M(r8)
            p.iq r8 = r7.e
            android.content.SharedPreferences r1 = r8.b()
            p.bq r6 = new p.bq
            r6.<init>(r0, r8, r1)
            java.util.List r8 = r8.d(r1)
            r7.d = r0
            r7.a = r1
            r7.b = r6
            r7.c = r3
            java.lang.Object r8 = r0.b(r8, r7)
            if (r8 != r5) goto L46
            goto L60
        L46:
            r3 = r1
            r1 = r6
        L48:
            if (r3 == 0) goto L4d
            r3.registerOnSharedPreferenceChangeListener(r1)
        L4d:
            p.aq r8 = new p.aq
            r8.<init>(r3, r1)
            r7.d = r4
            r7.a = r4
            r7.b = r4
            r7.c = r2
            java.lang.Object r7 = p.jch0.s(r0, r8, r7)
            if (r7 != r5) goto L61
        L60:
            return r5
        L61:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.cq.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
