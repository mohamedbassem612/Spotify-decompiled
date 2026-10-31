package p;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class khr0 implements g4h1 {
    public final enp a;
    public final cop b;
    public final w651 c;
    public final String d;
    public final gyh e;
    public final dop f;
    public final eop g;
    public final fop h;
    public final tl7 i;
    public final di4 j;
    public final i8h1 k;
    public final l6h1 l;
    public final n7h1 m;
    public final cir0 n;
    public final d751 o;

    public khr0(enp enpVar, ypa ypaVar, cop copVar, w651 w651Var, String str, gyh gyhVar, dop dopVar, eop eopVar, fop fopVar, tl7 tl7Var, di4 di4Var, i8h1 i8h1Var, l6h1 l6h1Var, n7h1 n7h1Var, cir0 cir0Var, d751 d751Var) {
        this.a = enpVar;
        this.b = copVar;
        this.c = w651Var;
        this.d = str;
        this.e = gyhVar;
        this.f = dopVar;
        this.g = eopVar;
        this.h = fopVar;
        this.i = tl7Var;
        this.j = di4Var;
        this.k = i8h1Var;
        this.l = l6h1Var;
        this.m = n7h1Var;
        this.n = cir0Var;
        this.o = d751Var;
    }

    public final f4h1 a(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String string;
        bz11 bz11Var;
        int i;
        boolean z = this.e == null;
        boolean z2 = bundle != null ? bundle.getBoolean("isSearchFieldFocused", z) : z;
        if (bundle != null) {
            z = bundle.getBoolean("isKeyboardVisible", z);
        }
        boolean z3 = z;
        d751 d751Var = this.o;
        iu30 wao0Var = new wao0(1, d751Var, d751.class, "dispatchEvent", "dispatchEvent(Lcom/spotify/search/mobius/SearchEvent;)V", 0, (byte) 17);
        wen0 wen0VarB = gio1.b(se20.a);
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131626100, (ViewGroup) null, false);
        int i2 = 2131428203;
        RelativeLayout relativeLayout = (RelativeLayout) m5n1.t(constraintLayoutInflate, 2131428203);
        if (relativeLayout != null) {
            i2 = 2131428869;
            if (m5n1.t(constraintLayoutInflate, 2131428869) != null) {
                i2 = 2131428871;
                ComposeView composeViewT = m5n1.t(constraintLayoutInflate, 2131428871);
                if (composeViewT != null) {
                    ConstraintLayout constraintLayout = constraintLayoutInflate;
                    nt21 nt21Var = new nt21(constraintLayout, relativeLayout, composeViewT, constraintLayout);
                    op80 op80VarK = j6p1.k(new jp80(constraintLayout), new eq80(new e3h1(this.l, this.m, this.k)));
                    cir0 cir0Var = this.n;
                    op80 op80VarK2 = j6p1.k(op80VarK, new g6r0(q601.b(cir0Var.i())));
                    xhk1.c(constraintLayout, op80VarK2);
                    Parcelable parcelable = bundle != null ? bundle.getParcelable("searchElementsBodyState") : null;
                    if (bundle == null || (string = bundle.getString("query")) == null) {
                        string = this.d;
                    }
                    String str = string;
                    kop kopVar = (kop) this.a.a.c;
                    e8r0 e8r0Var = (e8r0) kopVar.x.get();
                    hc51 hc51VarA0 = kopVar.a.a0();
                    c8o.l(hc51VarA0);
                    y751 y751Var = (y751) kopVar.y.get();
                    sco0 sco0VarI = kopVar.a.I();
                    c8o.l(sco0VarI);
                    q450 q450Var = new q450(e8r0Var, hc51VarA0, y751Var, sco0VarI, (pnp) kopVar.e1.get(), kopVar.b.e, wao0Var, z2, z3, parcelable, str, nt21Var, this.c);
                    g931 g931Var = (g931) q450Var.i;
                    p40 p40VarA = this.f.a(wao0Var);
                    idd1 idd1Var = new idd1(new shq0(this, wao0Var, (byte) 9));
                    z72 z72Var = (z72) g931Var.c;
                    if (this.j.C()) {
                        relativeLayout.setVisibility(8);
                        qhl layoutParams = composeViewT.getLayoutParams();
                        ((ViewGroup.MarginLayoutParams) layoutParams).height = 0;
                        layoutParams.l = 0;
                        fop fopVar = this.h;
                        fopVar.getClass();
                        nu nuVar = new nu((byte) 19);
                        kop kopVar2 = (kop) fopVar.a.c;
                        kopVar2.getClass();
                        br0 br0Var = new br0(new urk0((byte) 4));
                        esw eswVarI = kopVar2.i();
                        ww41 ww41Var = kopVar2.a;
                        di4 di4VarD = kopVar2.d();
                        hc51 hc51VarA1 = ww41Var.a0();
                        c8o.l(hc51VarA1);
                        y751 y751Var2 = (y751) kopVar2.y.get();
                        c8o.l(ww41Var.I());
                        znp znpVar = (znp) kopVar2.a1.get();
                        gop gopVar = (gop) kopVar2.l1.get();
                        bz11 bz11Var2 = new bz11();
                        bz11Var2.a = nuVar;
                        bz11Var2.b = br0Var;
                        bz11Var2.c = eswVarI;
                        bz11Var2.d = di4VarD;
                        bz11Var2.e = hc51VarA1;
                        bz11Var2.f = y751Var2;
                        bz11Var2.g = wao0Var;
                        bz11Var2.h = new idd1(new g521(bz11Var2, (byte) 27));
                        bz11Var2.i = gopVar.a(wao0Var);
                        bz11Var2.j = gio1.b(z6x.a);
                        bz11Var2.k = new idd1(new rl21(znpVar, bz11Var2, (byte) 15));
                        bz11Var = bz11Var2;
                        i = 0;
                    } else {
                        bz11Var = null;
                        i = 0;
                    }
                    composeViewT.setVisibility(i);
                    composeViewT.setContent(new j2i(-1736258716, new jhr0(this, op80VarK2, bz11Var, z72Var, bundle, z2, wen0VarB, p40VarA, idd1Var, (byte) 3), true));
                    r4u r4uVar = new r4u(e4x0.t, new rpv0(q450Var, (byte) 29));
                    r4u r4uVar2 = new r4u(f4x0.h, new s6z0(wen0VarB, (byte) 20));
                    rc51 rc51Var = rc51.b;
                    return new h751(g931Var, r4u.c(new r4u[]{r4uVar, r4uVar2, r4u.d(new jma((byte) 24), r4u.a(new zgz0(q450Var, (byte) 19)))}), this.b.a(g931Var, wen0VarB, cto1.q(cir0Var.e())), q450Var, cir0Var.e(), d751Var, cir0Var);
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i2)));
        return null;
    }
}
