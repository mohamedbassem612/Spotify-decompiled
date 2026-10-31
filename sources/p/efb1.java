package p;

import android.os.Bundle;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class efb1 implements vr20 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public efb1(vr20 vr20Var, o8n o8nVar) {
        this.a = (byte) 13;
        this.b = o8nVar;
        this.c = flo1.s(o8nVar);
        this.d = new e0r(vr20Var, null, (byte) 3);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public Object b(boolean z, lnm lnmVar) {
        uyl1 uyl1Var;
        rih1 rih1Var = rih1.a;
        if (lnmVar instanceof uyl1) {
            uyl1Var = (uyl1) lnmVar;
            int i = uyl1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uyl1Var.c = i - Integer.MIN_VALUE;
            } else {
                uyl1Var = new uyl1(this, lnmVar);
            }
        } else {
            uyl1Var = new uyl1(this, lnmVar);
        }
        uyl1 uyl1Var2 = uyl1Var;
        Object obj = uyl1Var2.a;
        d9n d9nVar = d9n.a;
        int i2 = uyl1Var2.c;
        if (i2 == 0) {
            hm5.M(obj);
            if (z && !((wyl1) this.b).g) {
                wyl1 wyl1Var = (wyl1) this.b;
                String str = (String) this.c;
                uyl1Var2.c = 1;
                wyl1Var.g = true;
                Object objA = b1r0.a(wyl1Var.e, str, (String) null, (Bundle) null, uyl1Var2, 14);
                if (objA != d9nVar) {
                    objA = rih1Var;
                }
                if (objA == d9nVar) {
                    return d9nVar;
                }
            }
            return rih1Var;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        smo1.p((c9n) this.d, (CancellationException) null);
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:108:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:110:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:114:0x0208  */
    /* JADX WARN: Code duplicated, block: B:178:0x0318  */
    /* JADX WARN: Code duplicated, block: B:218:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:255:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:271:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:295:0x058c  */
    /* JADX WARN: Code duplicated, block: B:345:0x071b  */
    /* JADX WARN: Code duplicated, block: B:420:0x08b0  */
    /* JADX WARN: Code duplicated, block: B:489:0x0a0e  */
    /* JADX WARN: Code duplicated, block: B:506:0x0a68  */
    /* JADX WARN: Code duplicated, block: B:538:0x0ae7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f7 A[PHI: r1
      0x00f7: PHI (r1v74 p.bj31) = (r1v73 p.bj31), (r1v77 p.bj31) binds: [B:57:0x00f5, B:54:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0128  */
    /* JADX WARN: Code duplicated, block: B:86:0x0174  */
    /* JADX WARN: Code duplicated, block: B:91:0x0181  */
    /* JADX WARN: Code duplicated, block: B:93:0x0184  */
    /* JADX WARN: Code duplicated, block: B:95:0x0193  */
    /* JADX WARN: Code duplicated, block: B:97:0x0197  */
    /* JADX WARN: Code duplicated, block: B:99:0x019e  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v72 java.lang.Object, still in use, count: 2, list:
          (r2v72 java.lang.Object) from 0x0170: PHI (r2 I:??) = (r2v64 java.lang.Object), (r2v72 java.lang.Object) binds: [B:83:0x016f, B:558:0x0170] A[DONT_GENERATE, DONT_INLINE]
          (r2v72 java.lang.Object) from 0x0160: CHECK_CAST (p.l0l) (r2v72 java.lang.Object)
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
    public final java.lang.Object emit(java.lang.Object r32, p.lnm r33) {
        /*
            Method dump skipped, instruction units count: 2880
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.efb1.emit(java.lang.Object, p.lnm):java.lang.Object");
    }

    public efb1(String str, rng1 rng1Var, vr20 vr20Var) {
        this.a = (byte) 11;
        this.c = str;
        this.d = rng1Var;
        this.b = vr20Var;
    }

    public /* synthetic */ efb1(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
