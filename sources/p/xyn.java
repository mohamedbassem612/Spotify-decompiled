package p;

import android.text.Html;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xyn implements wpw {
    public final hod0 X;
    public final xfx a;
    public final lzn0 b;
    public final a1r0 c;
    public final hyn d;
    public final epb1 e;
    public final kko f;
    public final d9p g;
    public final tjq h;
    public final boolean i;
    public final boolean t;
    public final poy0 Y = c2p1.o(new wyn(this, (byte) 0), new z6n(2, this, xyn.class, "stateMapper", "stateMapper(Lcom/spotify/creator/elements/biographycard/CreatorBiographyCard$Props;Lcom/spotify/listcontentruntime/metadataapi/MetadataValues;)Lcom/spotify/creator/elements/biographycard/impl/CreatorBiographyElement$State;", 0, (byte) 13), new wyn(this, (byte) 1), 4);
    public final ia00 Z = n3o1.q(this).a(cnn.f, new v08(this, (byte) 18));
    public final nsw N0 = jch0.j(new cml(this, (byte) 14));

    public xyn(xfx xfxVar, lzn0 lzn0Var, a1r0 a1r0Var, hyn hynVar, epb1 epb1Var, kko kkoVar, d9p d9pVar, tjq tjqVar, boolean z, boolean z2, hod0 hod0Var) {
        this.a = xfxVar;
        this.b = lzn0Var;
        this.c = a1r0Var;
        this.d = hynVar;
        this.e = epb1Var;
        this.f = kkoVar;
        this.g = d9pVar;
        this.h = tjqVar;
        this.i = z;
        this.t = z2;
        this.X = hod0Var;
    }

    public static ez00 e(hoj0 hoj0Var) {
        goj0 goj0VarA;
        if (hoj0Var == null || (goj0VarA = hoj0Var.a()) == null) {
            return null;
        }
        return (ez00) goj0VarA.a;
    }

    public static String f(String str, ioj0 ioj0Var) {
        goj0 goj0VarA;
        xkk1 xkk1Var;
        mq70 mq70Var;
        up70 up70VarA;
        hoj0 hoj0VarC = ioj0Var.c(xkk1.class, str);
        if (hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null || (xkk1Var = (xkk1) goj0VarA.a) == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.d)) == null) {
            return null;
        }
        return up70VarA.a.a;
    }

    public static boolean g(kyn kynVar, String str) {
        return ((kynVar instanceof iyn) && ihc1.y0(Html.fromHtml(str, 0).toString())) ? false : true;
    }

    public static String h(kyn kynVar, String str) {
        if (kynVar instanceof jyn) {
            return ((jyn) kynVar).a;
        }
        if (kynVar instanceof iyn) {
            return f4i1.e(str, ":about");
        }
        eg.o();
        return null;
    }

    public final rqw a() {
        return this.Z;
    }

    public final rsw c() {
        return this.N0;
    }

    public final mqw getBehavior() {
        return this.Y;
    }
}
