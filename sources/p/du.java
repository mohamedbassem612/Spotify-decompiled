package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class du extends a8d1 implements dv30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ boolean b;
    public /* synthetic */ boolean c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ du(lnm lnmVar, byte b) {
        super(6, lnmVar);
        this.a = b;
    }

    public final Object Y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                du duVar = new du((lnm) obj6, (byte) 0);
                duVar.d = (String) obj;
                duVar.e = (spq0) obj2;
                duVar.f = (List) obj3;
                duVar.b = zBooleanValue;
                duVar.c = zBooleanValue2;
                return duVar.invokeSuspend(rih1Var);
            default:
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue4 = ((Boolean) obj5).booleanValue();
                du duVar2 = new du((lnm) obj6, (byte) 1);
                duVar2.d = (zfb1) obj;
                duVar2.b = zBooleanValue3;
                duVar2.e = (r840) obj3;
                duVar2.f = (y4m) obj4;
                duVar2.c = zBooleanValue4;
                return duVar2.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0080  */
    /* JADX WARN: Code duplicated, block: B:23:0x009f  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0099 A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v7 java.lang.Object, still in use, count: 2, list:
          (r1v7 java.lang.Object) from 0x007b: PHI (r1 I:??) = (r1v5 java.lang.Object), (r1v7 java.lang.Object) binds: [B:16:0x007a, B:34:0x007b] A[DONT_GENERATE, DONT_INLINE]
          (r1v7 java.lang.Object) from 0x006f: CHECK_CAST (p.ev) (r1v7 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            byte r1 = r0.a
            switch(r1) {
                case 0: goto L23;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.d
            r3 = r1
            p.zfb1 r3 = (p.zfb1) r3
            boolean r4 = r0.b
            java.lang.Object r1 = r0.e
            r5 = r1
            p.r840 r5 = (p.r840) r5
            java.lang.Object r1 = r0.f
            r6 = r1
            p.y4m r6 = (p.y4m) r6
            boolean r7 = r0.c
            p.hm5.M(r22)
            p.yfb1 r2 = new p.yfb1
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L23:
            java.lang.Object r1 = r0.d
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r0.e
            p.spq0 r1 = (p.spq0) r1
            java.lang.Object r2 = r0.f
            java.util.List r2 = (java.util.List) r2
            r8 = r2
            java.util.List r8 = (java.util.List) r8
            boolean r13 = r0.b
            boolean r14 = r0.c
            p.hm5.M(r22)
            java.lang.Object r0 = r1.h()
            p.eww0 r0 = (p.eww0) r0
            if (r0 == 0) goto L5d
            p.ev r15 = new p.ev
            java.lang.String r1 = r0.a
            java.lang.String r2 = r0.b
            java.lang.String r4 = r0.f
            int r0 = r0.g
            java.lang.Integer r19 = java.lang.Integer.valueOf(r0)
            r20 = 48
            r16 = r1
            r17 = r2
            r18 = r4
            r15.<init>(r16, r17, r18, r19, r20)
        L5b:
            r10 = r15
            goto L8e
        L5d:
            r0 = r8
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L64:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7a
            java.lang.Object r1 = r0.next()
            r2 = r1
            p.ev r2 = (p.ev) r2
            java.lang.String r2 = r2.a
            boolean r2 = p.u890.j(r2, r3)
            if (r2 == 0) goto L64
            goto L7b
        L7a:
            r1 = 0
        L7b:
            r15 = r1
            p.ev r15 = (p.ev) r15
            if (r15 != 0) goto L5b
            p.ev r2 = new p.ev
            r3.getClass()
            r6 = 0
            r7 = 62
            r4 = 0
            r5 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            r10 = r2
        L8e:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r0 = r8.iterator()
        L99:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb2
            java.lang.Object r1 = r0.next()
            r2 = r1
            p.ev r2 = (p.ev) r2
            java.lang.String r2 = r2.a
            boolean r2 = p.u890.j(r2, r3)
            if (r2 != 0) goto L99
            r11.add(r1)
            goto L99
        Lb2:
            p.au r9 = new p.au
            int r12 = r11.size()
            r9.<init>(r10, r11, r12, r13, r14)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.du.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
