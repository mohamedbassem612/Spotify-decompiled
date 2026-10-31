package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mbx extends l570 implements o5s {
    public final /* synthetic */ byte b = 0;
    public final Scheduler c;
    public final qzh d;
    public final Object e;
    public final vx40 f;
    public final Object g;
    public final Object h;

    public mbx(Scheduler scheduler, qzh qzhVar, ef90 ef90Var, p5 p5Var, iac0 iac0Var, vx40 vx40Var) {
        super(qzhVar.getView());
        this.c = scheduler;
        this.d = qzhVar;
        this.e = ef90Var;
        this.h = p5Var;
        this.f = vx40Var;
        iac0Var.getLifecycle().a(this);
        this.g = new CompositeDisposable();
    }

    public static a63 c(y570 y570Var, boolean z, boolean z2) {
        String str = y570Var.n().a.a;
        String str2 = str == null ? "" : str;
        String str3 = y570Var.n().a.b;
        String str4 = str3 == null ? "" : str3;
        String[] strArrH = y570Var.g().H("artists");
        List listQ0 = strArrH != null ? f46.Q0(strArrH) : z6x.a;
        ld70 ld70Var = y570Var.k().a.c;
        String str5 = ld70Var != null ? ld70Var.a.c : null;
        String str6 = str5 == null ? "" : str5;
        String strB = y570Var.g().B("gradientColor");
        String str7 = strB == null ? "" : strB;
        String strB2 = y570Var.g().B("conciseFact");
        return new a63(str2, listQ0, str6, str7, strB2 == null ? "" : strB2, z, z2, str4);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041 A[PHI: r0
      0x0041: PHI (r0v2 java.lang.String) = (r0v1 java.lang.String), (r0v25 java.lang.String), (r0v31 java.lang.String) binds: [B:3:0x000d, B:8:0x0029, B:13:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    public static ee3 d(y570 y570Var, boolean z, boolean z2) {
        String str;
        String strB = y570Var.g().B("albumArtwork");
        if (strB != null) {
            str = strB;
        } else {
            ld70 ld70Var = (pc70) y570Var.k().a.e.get("albumArtwork");
            strB = ld70Var != null ? ld70Var.a.c : null;
            if (strB != null) {
                str = strB;
            } else {
                ld70 ld70Var2 = y570Var.k().a.c;
                strB = ld70Var2 != null ? ld70Var2.a.c : null;
                if (strB == null) {
                    str = "";
                } else {
                    str = strB;
                }
            }
        }
        String str2 = y570Var.n().a.a;
        String str3 = str2 == null ? "" : str2;
        String str4 = y570Var.n().a.b;
        String str5 = str4 == null ? "" : str4;
        Long lX = y570Var.g().x("releaseTimestamp");
        long jLongValue = lX != null ? lX.longValue() : 0L;
        String strB2 = y570Var.g().B("backgroundColor");
        String str6 = strB2 == null ? "" : strB2;
        ld70 ld70Var3 = y570Var.k().a.c;
        String str7 = ld70Var3 != null ? ld70Var3.a.c : null;
        return new ee3(str3, str5, jLongValue, str6, str7 == null ? "" : str7, str, z, z2);
    }

    public static ugu0 e(y570 y570Var, boolean z, boolean z2) {
        String str = y570Var.n().a.a;
        String str2 = str == null ? "" : str;
        String str3 = y570Var.n().a.b;
        String str4 = str3 == null ? "" : str3;
        String str5 = y570Var.n().a.d;
        String str6 = str5 == null ? "" : str5;
        ld70 ld70Var = y570Var.k().a.c;
        String str7 = ld70Var != null ? ld70Var.a.c : null;
        String str8 = str7 == null ? "" : str7;
        String strB = y570Var.g().B("gradientColor");
        String str9 = strB == null ? "" : strB;
        String strB2 = y570Var.g().B("conciseFact");
        return new ugu0(str2, str6, str8, str9, strB2 == null ? "" : strB2, str4, z, z2, y570Var.g().b("isLocked", false));
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ab  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r20v5 java.lang.Object, still in use, count: 2, list:
          (r20v5 java.lang.Object) from 0x00a4: PHI (r20 I:??) = (r20v2 java.lang.Object), (r20v5 java.lang.Object) binds: [B:36:0x00a2, B:115:0x00a4] A[DONT_GENERATE, DONT_INLINE]
          (r20v5 java.lang.Object) from 0x0095: CHECK_CAST (p.fxf1) (r20v5 java.lang.Object)
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
    public final void a(p.y570 r31, p.l670 r32, p.yfu r33) {
        /*
            Method dump skipped, instruction units count: 824
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.mbx.a(p.y570, p.l670, p.yfu):void");
    }

    public final void b(int... iArr) {
        byte b = this.b;
    }

    public final void onDestroy(iac0 iac0Var) {
        switch (this.b) {
            case 0:
                iac0Var.getLifecycle().d(this);
                break;
            case 1:
                iac0Var.getLifecycle().d(this);
                break;
            case 2:
                iac0Var.getLifecycle().d(this);
                break;
            default:
                iac0Var.getLifecycle().d(this);
                break;
        }
    }

    public final void onStop(iac0 iac0Var) {
        switch (this.b) {
            case 0:
                ((CompositeDisposable) this.g).g();
                break;
            case 1:
                ((CompositeDisposable) this.g).g();
                break;
            case 2:
                ((CompositeDisposable) this.g).g();
                break;
            default:
                ((vku) this.g).c();
                break;
        }
    }

    private final void f(int... iArr) {
    }

    private final void g(int... iArr) {
    }

    private final void h(int... iArr) {
    }

    private final void i(int... iArr) {
    }

    public mbx(Scheduler scheduler, qzh qzhVar, ef90 ef90Var, da daVar, iac0 iac0Var, vx40 vx40Var) {
        super(qzhVar.getView());
        this.c = scheduler;
        this.d = qzhVar;
        this.e = ef90Var;
        this.h = daVar;
        this.f = vx40Var;
        iac0Var.getLifecycle().a(this);
        this.g = new CompositeDisposable();
    }

    public mbx(Scheduler scheduler, qzh qzhVar, ef90 ef90Var, vf90 vf90Var, iac0 iac0Var, vx40 vx40Var) {
        super(qzhVar.getView());
        this.c = scheduler;
        this.d = qzhVar;
        this.e = ef90Var;
        this.h = vf90Var;
        this.f = vx40Var;
        iac0Var.getLifecycle().a(this);
        this.g = new CompositeDisposable();
    }

    public mbx(qzh qzhVar, Scheduler scheduler, ag90 ag90Var, iac0 iac0Var, vx40 vx40Var, zr00 zr00Var) {
        super(qzhVar.getView());
        this.d = qzhVar;
        this.c = scheduler;
        this.e = ag90Var;
        this.f = vx40Var;
        this.h = zr00Var;
        iac0Var.getLifecycle().a(this);
        this.g = new vku();
    }
}
