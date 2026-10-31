package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lru extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public byte c;
    public Object d;
    public Object e;
    public Object f;
    public /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lru(zeu zeuVar, String str, lik1 lik1Var, boolean z, fbp1 fbp1Var, tv80 tv80Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = zeuVar;
        this.e = str;
        this.f = lik1Var;
        this.b = z;
        this.g = fbp1Var;
        this.h = tv80Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.h;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new lru((zeu) this.d, (String) this.e, (lik1) this.f, this.b, (fbp1) this.g, (tv80) obj2, lnmVar);
            default:
                lru lruVar = new lru((g651) obj2, lnmVar);
                lruVar.g = obj;
                return lruVar;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008d A[Catch: all -> 0x002c, PHI: r6 r8 r10 r11
      0x008d: PHI (r6v18 boolean) = (r6v13 boolean), (r6v17 boolean), (r6v20 boolean) binds: [B:31:0x0086, B:38:0x00c4, B:10:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x008d: PHI (r8v7 p.faa0) = (r8v5 p.faa0), (r8v6 p.faa0), (r8v13 p.faa0) binds: [B:31:0x0086, B:38:0x00c4, B:10:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x008d: PHI (r10v4 p.e651) = (r10v2 p.e651), (r10v3 p.e651), (r10v8 p.e651) binds: [B:31:0x0086, B:38:0x00c4, B:10:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x008d: PHI (r11v4 p.uac) = (r11v2 p.uac), (r11v3 p.uac), (r11v6 p.uac) binds: [B:31:0x0086, B:38:0x00c4, B:10:0x002a] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {all -> 0x002c, blocks: (B:9:0x0027, B:32:0x008d, B:35:0x00a3, B:37:0x00ab, B:15:0x0046, B:31:0x0086), top: B:100:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a3 A[Catch: all -> 0x002c, PHI: r6 r7 r8 r10 r11
      0x00a3: PHI (r6v17 boolean) = (r6v18 boolean), (r6v19 boolean) binds: [B:33:0x00a0, B:16:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r7v10 java.lang.Object) = (r7v18 java.lang.Object), (r7v21 java.lang.Object) binds: [B:33:0x00a0, B:16:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r8v6 p.faa0) = (r8v7 p.faa0), (r8v10 p.faa0) binds: [B:33:0x00a0, B:16:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r10v3 p.e651) = (r10v4 p.e651), (r10v6 p.e651) binds: [B:33:0x00a0, B:16:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r11v3 p.uac) = (r11v4 p.uac), (r11v5 p.uac) binds: [B:33:0x00a0, B:16:0x0049] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {all -> 0x002c, blocks: (B:9:0x0027, B:32:0x008d, B:35:0x00a3, B:37:0x00ab, B:15:0x0046, B:31:0x0086), top: B:100:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab A[Catch: all -> 0x002c, TRY_LEAVE, TryCatch #3 {all -> 0x002c, blocks: (B:9:0x0027, B:32:0x008d, B:35:0x00a3, B:37:0x00ab, B:15:0x0046, B:31:0x0086), top: B:100:0x0011 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00c4 -> B:32:0x008d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.lru.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lru(g651 g651Var, lnm lnmVar) {
        super(2, lnmVar);
        this.h = g651Var;
    }
}
