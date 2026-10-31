package p;

import android.content.Intent;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m53 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public Object d;
    public /* synthetic */ Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m53(lnm lnmVar, String str, pa01 pa01Var, String str2) {
        super(3, lnmVar);
        this.a = (byte) 11;
        this.e = str;
        this.f = pa01Var;
        this.g = str2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.g;
        switch (b) {
            case 0:
                m53 m53Var = new m53(this.f, this.e, obj4, (lnm) obj3, (byte) 0);
                m53Var.c = (vr20) obj;
                m53Var.d = obj2;
                return m53Var.invokeSuspend(rih1Var);
            case 1:
                m53 m53Var2 = new m53(this.f, obj4, (String) this.e, (lnm) obj3, (byte) 1);
                m53Var2.c = (vr20) obj;
                m53Var2.d = obj2;
                return m53Var2.invokeSuspend(rih1Var);
            case 2:
                m53 m53Var3 = new m53(this.f, this.e, obj4, (lnm) obj3, (byte) 2);
                m53Var3.c = (vr20) obj;
                m53Var3.d = obj2;
                return m53Var3.invokeSuspend(rih1Var);
            case 3:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                m53 m53Var4 = new m53((rer) this.d, (ler) this.f, (alt0) this.e, (y3p0) obj4, (lnm) obj3);
                m53Var4.b = zBooleanValue;
                m53Var4.c = (List) obj2;
                return m53Var4.invokeSuspend(rih1Var);
            case 4:
                m53 m53Var5 = new m53(this.f, this.e, obj4, (lnm) obj3, (byte) 4);
                m53Var5.c = (vr20) obj;
                m53Var5.d = obj2;
                return m53Var5.invokeSuspend(rih1Var);
            case 5:
                m53 m53Var6 = new m53(this.f, this.e, obj4, (lnm) obj3, (byte) 5);
                m53Var6.c = (vr20) obj;
                m53Var6.d = obj2;
                return m53Var6.invokeSuspend(rih1Var);
            case 6:
                m53 m53Var7 = new m53(this.f, this.e, obj4, (lnm) obj3, (byte) 6);
                m53Var7.c = (vr20) obj;
                m53Var7.d = obj2;
                return m53Var7.invokeSuspend(rih1Var);
            case 7:
                m53 m53Var8 = new m53(this.f, this.e, obj4, (lnm) obj3, (byte) 7);
                m53Var8.c = (vr20) obj;
                m53Var8.d = obj2;
                return m53Var8.invokeSuspend(rih1Var);
            case 8:
                m53 m53Var9 = new m53((svh0) obj4, (lnm) obj3);
                m53Var9.f = (yvg1) obj;
                m53Var9.e = (mmr0) obj2;
                return m53Var9.invokeSuspend(rih1Var);
            case 9:
                m53 m53Var10 = new m53((k4v0) this.d, (Intent) this.f, (th61) obj4, (lnm) obj3);
                m53Var10.c = (s4b1) obj;
                m53Var10.e = (String) obj2;
                return m53Var10.invokeSuspend(rih1Var);
            case 10:
                m53 m53Var11 = new m53(this.f, obj4, (String) this.e, (lnm) obj3, (byte) 10);
                m53Var11.c = (vr20) obj;
                m53Var11.d = obj2;
                return m53Var11.invokeSuspend(rih1Var);
            case 11:
                m53 m53Var12 = new m53((lnm) obj3, (String) this.e, (pa01) this.f, (String) obj4);
                m53Var12.c = (vr20) obj;
                m53Var12.d = obj2;
                return m53Var12.invokeSuspend(rih1Var);
            case 12:
                m53 m53Var13 = new m53(this.f, this.e, obj4, (lnm) obj3, (byte) 12);
                m53Var13.c = (vr20) obj;
                m53Var13.d = (Object[]) obj2;
                return m53Var13.invokeSuspend(rih1Var);
            case 13:
                m53 m53Var14 = new m53(this.f, this.e, obj4, (lnm) obj3, (byte) 13);
                m53Var14.c = (vr20) obj;
                m53Var14.d = (Object[]) obj2;
                return m53Var14.invokeSuspend(rih1Var);
            case 14:
                m53 m53Var15 = new m53(this.f, this.e, obj4, (lnm) obj3, (byte) 14);
                m53Var15.c = (vr20) obj;
                m53Var15.d = obj2;
                return m53Var15.invokeSuspend(rih1Var);
            case 15:
                m53 m53Var16 = new m53(this.f, this.e, obj4, (lnm) obj3, (byte) 15);
                m53Var16.c = (vr20) obj;
                m53Var16.d = obj2;
                return m53Var16.invokeSuspend(rih1Var);
            default:
                m53 m53Var17 = new m53(this.f, this.e, obj4, (lnm) obj3, (byte) 16);
                m53Var17.c = (vr20) obj;
                m53Var17.d = obj2;
                return m53Var17.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:280:0x0796  */
    /* JADX WARN: Code duplicated, block: B:281:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:283:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:286:0x07b0  */
    /* JADX WARN: Code duplicated, block: B:288:0x07ba  */
    /* JADX WARN: Code duplicated, block: B:292:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:298:0x07eb A[LOOP:3: B:296:0x07e5->B:298:0x07eb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:302:0x080e  */
    /* JADX WARN: Code duplicated, block: B:304:0x0818  */
    /* JADX WARN: Code duplicated, block: B:305:0x0828  */
    /* JADX WARN: Code duplicated, block: B:307:0x082c  */
    /* JADX WARN: Code duplicated, block: B:308:0x083e  */
    /* JADX WARN: Code duplicated, block: B:310:0x0842  */
    /* JADX WARN: Code duplicated, block: B:315:0x0875  */
    /* JADX WARN: Code duplicated, block: B:353:0x07d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x07c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:358:0x086b A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v11 java.lang.Object, still in use, count: 2, list:
          (r9v11 java.lang.Object) from 0x0792: PHI (r9 I:??) = (r9v3 java.lang.Object), (r9v11 java.lang.Object) binds: [B:277:0x0791, B:350:0x0792] A[DONT_GENERATE, DONT_INLINE]
          (r9v11 java.lang.Object) from 0x078a: CHECK_CAST (p.gay) (r9v11 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r40) {
        /*
            Method dump skipped, instruction units count: 2460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.m53.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m53(Object obj, Object obj2, String str, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.f = obj;
        this.g = obj2;
        this.e = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m53(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.f = obj;
        this.e = obj2;
        this.g = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m53(rer rerVar, ler lerVar, alt0 alt0Var, y3p0 y3p0Var, lnm lnmVar) {
        super(3, lnmVar);
        this.a = (byte) 3;
        this.d = rerVar;
        this.f = lerVar;
        this.e = alt0Var;
        this.g = y3p0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m53(svh0 svh0Var, lnm lnmVar) {
        super(3, lnmVar);
        this.a = (byte) 8;
        this.g = svh0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m53(k4v0 k4v0Var, Intent intent, th61 th61Var, lnm lnmVar) {
        super(3, lnmVar);
        this.a = (byte) 9;
        this.d = k4v0Var;
        this.f = intent;
        this.g = th61Var;
    }
}
