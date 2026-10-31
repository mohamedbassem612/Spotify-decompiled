package p;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wv3 implements acr0 {
    public final /* synthetic */ byte a;
    public final Set b;
    public final Object c;

    public wv3(e54 e54Var) {
        this.a = (byte) 1;
        this.c = e54Var;
        this.b = f46.S0(new blc0[]{blc0.w1, blc0.B1});
    }

    public final Set a() {
        byte b = this.a;
        return this.b;
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return tv3.class;
            case 1:
                return xva.class;
            case 2:
                return y2b.class;
            case 3:
                return kwm.class;
            case 4:
                return tdv.class;
            case 5:
                return jqo0.class;
            case 6:
                return m221.class;
            case 7:
                return ja91.class;
            default:
                return gle1.class;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0078  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v5 java.lang.Object, still in use, count: 2, list:
          (r3v5 java.lang.Object) from 0x00d1: PHI (r3 I:??) = (r3v2 java.lang.Object), (r3v5 java.lang.Object) binds: [B:60:0x00d0, B:101:0x00d1] A[DONT_GENERATE, DONT_INLINE]
          (r3v5 java.lang.Object) from 0x00c3: CHECK_CAST (p.rwm) (r3v5 java.lang.Object)
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
    public final android.os.Parcelable c(android.content.Intent r12, p.s4b1 r13, p.th61 r14) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.wv3.c(android.content.Intent, p.s4b1, p.th61):android.os.Parcelable");
    }

    public final e6w0 d() {
        byte b = this.a;
        a6w0 a6w0Var = a6w0.a;
        switch (b) {
            case 0:
                return new b6w0(false);
            case 1:
                return a6w0Var;
            case 2:
                return new b6w0(true);
            case 3:
                return new b6w0(true);
            case 4:
                return a6w0Var;
            case 5:
                return new b6w0(true);
            case 6:
                return new b6w0(false);
            case 7:
                return new b6w0(false);
            default:
                return new b6w0(false);
        }
    }

    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "The component to request allocations";
            case 1:
                return "Page API implementation of Artist Biography";
            case 2:
                return "Bottom sheet for entering a custom Blend social prompt";
            case 3:
                return "Bottom sheet showing a contributor's details within SongDNA";
            case 4:
                return "DSL Selection";
            case 5:
                return "Notification opt-in bottom sheet for comments";
            case 6:
                return "Remote downloads onboarding page triggered from the watch.";
            case 7:
                return "Implementation of sleep timer nudge bottom sheet";
            default:
                return "Time Cap Upsell Page for MFT+";
        }
    }

    public final boolean isEnabled() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return ((wpv0) obj).b.b();
            case 1:
                return ((e54) obj).a();
            case 2:
                return ((e3b) obj).a.d();
            case 3:
                return ((a7a1) obj).f;
            case 4:
                return ((z0t) obj).a.o();
            case 5:
                return ((fo4) obj).c();
            case 6:
                return ((l05) obj).a();
            case 7:
                return ((u15) obj).a();
            default:
                return ((ele1) obj).a.a();
        }
    }

    public wv3(l05 l05Var) {
        this.a = (byte) 6;
        this.c = l05Var;
        this.b = Collections.singleton(blc0.yf);
    }

    public wv3(fo4 fo4Var) {
        this.a = (byte) 5;
        this.c = fo4Var;
        this.b = Collections.singleton(blc0.L4);
    }

    public wv3(e3b e3bVar) {
        this.a = (byte) 2;
        this.c = e3bVar;
        this.b = Collections.singleton(blc0.y2);
    }

    public wv3(wpv0 wpv0Var) {
        this.a = (byte) 0;
        this.c = wpv0Var;
        this.b = Collections.singleton(blc0.Pd);
    }

    public wv3(ele1 ele1Var) {
        this.a = (byte) 8;
        this.c = ele1Var;
        this.b = Collections.singleton(blc0.vf);
    }

    public wv3(u15 u15Var) {
        this.a = (byte) 7;
        this.c = u15Var;
        this.b = Collections.singleton(blc0.uh);
    }

    public wv3(z0t z0tVar) {
        this.a = (byte) 4;
        this.c = z0tVar;
        this.b = Collections.singleton(blc0.ak);
    }

    public wv3(a7a1 a7a1Var) {
        this.a = (byte) 3;
        this.c = a7a1Var;
        this.b = Collections.singleton(blc0.Gh);
    }
}
