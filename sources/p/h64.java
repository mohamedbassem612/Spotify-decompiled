package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class h64 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public Object d;
    public /* synthetic */ boolean e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h64(lnm lnmVar, boolean z, List list, v1k v1kVar) {
        super(3, lnmVar);
        this.a = (byte) 1;
        this.e = z;
        this.f = list;
        this.g = v1kVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.g;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                h64 h64Var = new h64((lnm) obj3, (kl1) this.f, (String) obj4, this.e, (byte) 0);
                h64Var.c = (vr20) obj;
                h64Var.d = obj2;
                return h64Var.invokeSuspend(rih1Var);
            case 1:
                h64 h64Var2 = new h64((lnm) obj3, this.e, (List) this.f, (v1k) obj4);
                h64Var2.c = (vr20) obj;
                h64Var2.d = obj2;
                return h64Var2.invokeSuspend(rih1Var);
            case 2:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                h64 h64Var3 = new h64((lnm) obj3, (hgo) obj4);
                h64Var3.f = (g911) obj;
                h64Var3.e = zBooleanValue;
                return h64Var3.invokeSuspend(rih1Var);
            default:
                h64 h64Var4 = new h64((lnm) obj3, (b5s0) this.f, (String) obj4, this.e, (byte) 3);
                h64Var4.c = (vr20) obj;
                h64Var4.d = obj2;
                return h64Var4.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00cc A[Catch: CancellationException -> 0x00eb, Exception -> 0x00f1, TRY_ENTER, TryCatch #2 {CancellationException -> 0x00eb, Exception -> 0x00f1, blocks: (B:17:0x007f, B:49:0x00df, B:46:0x00cc), top: B:123:0x0072 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00de  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v17 java.lang.Object, still in use, count: 2, list:
          (r5v17 java.lang.Object) from 0x00c7: PHI (r5 I:??) = (r5v14 java.lang.Object), (r5v17 java.lang.Object) binds: [B:42:0x00c6, B:126:0x00c7] A[DONT_GENERATE, DONT_INLINE]
          (r5v17 java.lang.Object) from 0x00bf: CHECK_CAST (p.hp90) (r5v17 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.h64.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h64(lnm lnmVar, hgo hgoVar) {
        super(3, lnmVar);
        this.a = (byte) 2;
        this.g = hgoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h64(lnm lnmVar, Object obj, String str, boolean z, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.f = obj;
        this.g = str;
        this.e = z;
    }
}
