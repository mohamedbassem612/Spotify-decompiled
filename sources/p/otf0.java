package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class otf0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ otf0(Object obj, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        zyi0 zyi0Var = (zyi0) obj;
        myi0 myi0Var = (nyi0) obj2;
        tqw tqwVar = (tqw) obj3;
        bzi0 bzi0Var = (bzi0) this.b;
        iu30 iu30Var = zyi0Var.w;
        if (myi0Var instanceof lyi0) {
            iu30Var.invoke(myi0Var);
        } else {
            if (!(myi0Var instanceof myi0)) {
                eg.o();
                return null;
            }
            if (bzi0Var.d.j()) {
                iu30Var.invoke(new hyi0(tqwVar != null ? n3o1.y(tqwVar).a : null));
            } else {
                myi0 myi0Var2 = myi0Var;
                boolean z = zyi0Var.r;
                ou80 ou80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
                z6h0 z6h0Var = new z6h0(zyi0Var, (byte) 29);
                hyy0 hyy0Var = bzi0Var.b;
                List<gxz0> list = myi0Var2.a;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (gxz0 gxz0Var : list) {
                    boolean zJ = u890.j(gxz0Var.c.a, bzi0Var.Z);
                    w4i1 w4i1Var = gxz0Var.c;
                    arrayList.add(new c401(new b401(w4i1Var.a, w4i1Var.b, w4i1Var.d, w4i1Var.c), gxz0Var.b, zJ, zJ || z));
                }
                hyy0Var.l(arrayList, new gnf0(z6h0Var, bzi0Var, ou80VarY, (byte) 16));
            }
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        if (baj0.a[((z9j0) obj2).ordinal()] == 1) {
            ((daj0) this.b).a.invoke();
            return rih1.a;
        }
        eg.o();
        return null;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        if (faj0.a[((eaj0) obj2).ordinal()] == 1) {
            ((haj0) this.b).a.invoke();
            return rih1.a;
        }
        eg.o();
        return null;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        ((maj0) this.b).b.invoke((iaj0) obj2);
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        naj0 naj0Var = (naj0) obj2;
        tqw tqwVar = (tqw) obj3;
        if (tqwVar != null) {
            ((xd2) this.b).invoke(naj0Var, n3o1.y(tqwVar));
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0261  */
    /* JADX WARN: Code duplicated, block: B:106:0x0276  */
    /* JADX WARN: Code duplicated, block: B:110:0x0280  */
    /* JADX WARN: Code duplicated, block: B:113:0x0288  */
    /* JADX WARN: Code duplicated, block: B:123:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:125:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:127:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:128:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:131:0x0305  */
    /* JADX WARN: Code duplicated, block: B:132:0x0308  */
    /* JADX WARN: Code duplicated, block: B:134:0x0310  */
    /* JADX WARN: Code duplicated, block: B:136:0x0316  */
    /* JADX WARN: Code duplicated, block: B:137:0x0326  */
    /* JADX WARN: Code duplicated, block: B:196:0x0587  */
    /* JADX WARN: Code duplicated, block: B:200:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:203:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:205:0x0603  */
    /* JADX WARN: Code duplicated, block: B:207:0x0607  */
    /* JADX WARN: Code duplicated, block: B:208:0x0611  */
    /* JADX WARN: Code duplicated, block: B:210:0x0615  */
    /* JADX WARN: Code duplicated, block: B:213:0x061b  */
    /* JADX WARN: Code duplicated, block: B:214:0x061e  */
    /* JADX WARN: Code duplicated, block: B:216:0x0622  */
    /* JADX WARN: Code duplicated, block: B:217:0x0625  */
    /* JADX WARN: Code duplicated, block: B:219:0x0629  */
    /* JADX WARN: Code duplicated, block: B:222:0x0639  */
    /* JADX WARN: Code duplicated, block: B:224:0x064f  */
    /* JADX WARN: Code duplicated, block: B:225:0x0658  */
    /* JADX WARN: Code duplicated, block: B:227:0x066c  */
    /* JADX WARN: Code duplicated, block: B:230:0x067f  */
    /* JADX WARN: Code duplicated, block: B:231:0x0682  */
    /* JADX WARN: Code duplicated, block: B:234:0x0688  */
    /* JADX WARN: Code duplicated, block: B:237:0x068f  */
    /* JADX WARN: Code duplicated, block: B:239:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:241:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:441:0x020f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:444:0x0271 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:79:0x0201  */
    /* JADX WARN: Code duplicated, block: B:85:0x0214  */
    /* JADX WARN: Code duplicated, block: B:96:0x0250  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v34 java.lang.Object, still in use, count: 2, list:
          (r10v34 java.lang.Object) from 0x01e3: PHI (r10 I:??) = (r10v22 java.lang.Object), (r10v34 java.lang.Object) binds: [B:68:0x01e2, B:438:0x01e3] A[DONT_GENERATE, DONT_INLINE]
          (r10v34 java.lang.Object) from 0x01d9: CHECK_CAST (com.spotify.podcast.access.proto.OfferExplanation$Section) (r10v34 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r41, java.lang.Object r42, java.lang.Object r43) {
        /*
            Method dump skipped, instruction units count: 3552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.otf0.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
