package p;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encore.image.EncoreImageView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hv41 extends emc0 {
    public static final kn5 i = new kn5((byte) 24);
    public final /* synthetic */ byte e = 3;
    public final Object f;
    public Serializable g;
    public Object h;

    public hv41(oql oqlVar) {
        super(new kn5((byte) 18));
        this.f = oqlVar;
    }

    public void B(List list, List list2) {
        switch (this.e) {
            case 2:
                E();
                break;
        }
    }

    public void D(y3g y3gVar, int i2) {
        c4z c4zVar = this.g;
        if (c4zVar != null) {
            oql oqlVar = (oql) this.f;
            String str = y3gVar.b;
            fjl0 fjl0Var = (fjl0) oqlVar.c;
            Integer numValueOf = Integer.valueOf(i2);
            x6h1 x6h1VarC = fjl0Var.c.c();
            x6h1VarC.i.add(new a7h1("guest_chip", (String) null, numValueOf, str, (String) null));
            x6h1VarC.j = true;
            c4zVar.invoke(y3gVar, ((i8h1) oqlVar.b).m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), fjl0Var.b, System.currentTimeMillis()), (xj61) null));
        }
    }

    public void E() {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (recyclerView == null) {
            return;
        }
        int i2 = 0;
        for (Object obj : ((emc0) this).d.f) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                p7h.T();
                throw null;
            }
            y3g y3gVar = (y3g) obj;
            b8k1.a(recyclerView, recyclerView.getContext().getString(2131956510, y3gVar.a), new mgc(this, y3gVar, i2, (byte) 16));
            i2 = i3;
        }
    }

    public int g(int i2) {
        switch (this.e) {
            case 3:
                s1b0 s1b0Var = ((pv51) A(i2)).a;
                if (s1b0Var instanceof r1b0) {
                    return 0;
                }
                if (s1b0Var instanceof q1b0) {
                    return 1;
                }
                eg.o();
                return 0;
            default:
                return super/*p.z511*/.g(i2);
        }
    }

    public void m(RecyclerView recyclerView) {
        switch (this.e) {
            case 2:
                this.h = recyclerView;
                E();
                break;
        }
    }

    public final void n(int i2, w611 w611Var) {
        k4m k4mVar;
        switch (this.e) {
            case 0:
                h951 h951Var = (h951) A(i2);
                if (w611Var instanceof c551) {
                    c551 c551Var = (c551) w611Var;
                    h951Var.getClass();
                    TextView textView = c551Var.Z0;
                    String str = h951Var.e;
                    vu30 vu30Var = c551Var.W0;
                    if (vu30Var != null) {
                        vu30Var.invoke(Integer.valueOf(c551Var.n()), h951Var);
                    }
                    c551Var.Y0.setText(h951Var.d);
                    ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                    if (layoutParams == null) {
                        bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
                        textView.setLayoutParams(layoutParams);
                        textView.setVisibility(str.length() > 0 ? 0 : 8);
                        textView.setText(str);
                        ArtworkView artworkView = c551Var.X0;
                        int i3 = h951Var.a;
                        String str2 = h951Var.f;
                        int iC = l1d.C(i3);
                        artworkView.h(iC != 1 ? iC != 2 ? new e17(new g07(str2)) : new e17(new g07(str2)) : new l07(new g07(str2), false));
                        xl81 xl81Var = h951Var.b;
                        qpl qplVar = xl81Var instanceof qpl ? (qpl) xl81Var : null;
                        int i4 = qplVar != null ? qplVar.Y : 0;
                        int i5 = i4 == 0 ? -1 : b551.a[l1d.C(i4)];
                        if (i5 == -1) {
                            k4mVar = k4m.d;
                        } else if (i5 == 1) {
                            k4mVar = k4m.b;
                        } else if (i5 != 2) {
                            if (i5 != 3) {
                                eg.o();
                            }
                            k4mVar = k4m.d;
                        } else {
                            k4mVar = k4m.a;
                        }
                        c551Var.a1.c(k4mVar);
                        c551Var.U0.setOnClickListener(new wa21(c551Var, h951Var, (byte) 5));
                    }
                }
                break;
            case 1:
                jn5 jn5Var = (jn5) w611Var;
                u01 u01Var = (u01) A(i2);
                qzh qzhVar = jn5Var.U0;
                View view = ((w611) jn5Var).a;
                qzhVar.f(new dy51(u01Var.b, view.getContext().getString(2131952358), view.getContext().getString(2131956643), u01Var.c));
                hv41 hv41Var = jn5Var.V0;
                m42 m42Var = (m42) hv41Var.h;
                if (m42Var != null) {
                    m42Var.invoke(u01Var.a);
                }
                qzhVar.n(new cc2(hv41Var, u01Var, (byte) 22));
                break;
            case 2:
                y3g y3gVar = (y3g) A(i2);
                y3gVar.getClass();
                e5g e5gVar = ((lq50) w611Var).U0;
                e5gVar.setMaxWidth(Integer.MAX_VALUE);
                String str3 = y3gVar.a;
                e5gVar.setText(str3);
                e5gVar.setContentDescription(str3);
                oql oqlVar = (oql) this.f;
                String str4 = y3gVar.b;
                fjl0 fjl0Var = (fjl0) oqlVar.c;
                Integer numValueOf = Integer.valueOf(i2);
                x6h1 x6h1VarC = fjl0Var.c.c();
                x6h1VarC.i.add(new a7h1("guest_chip", (String) null, numValueOf, str4, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).b = fjl0Var.b;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                ((i8h1) oqlVar.b).f(k7h1Var.a(), (Set) null);
                break;
            default:
                pv51 pv51Var = (pv51) A(i2);
                if (w611Var instanceof h1b0) {
                    h1b0 h1b0Var = (h1b0) w611Var;
                    String str5 = (String) this.g;
                    r1b0 r1b0Var = (r1b0) pv51Var.a;
                    boolean z = pv51Var.b;
                    haa0 haa0Var = h1b0Var.U0;
                    ViewStub viewStub = (ViewStub) haa0Var.d;
                    ConstraintLayout constraintLayout = (ConstraintLayout) haa0Var.b;
                    viewStub.setVisibility(z ? 0 : 8);
                    constraintLayout.setOnClickListener(new rn(h1b0Var, r1b0Var, i2, (byte) 3));
                    String string = constraintLayout.getContext().getString(2131957125, r1b0Var.b);
                    TextView textView2 = (TextView) haa0Var.c;
                    ShapeDrawable shapeDrawable = h1b0Var.W0;
                    Paint paint = shapeDrawable.getPaint();
                    int i6 = r1b0Var.a;
                    Locale locale = vah.a;
                    paint.setColor(Color.parseColor(String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i6)}, 1))));
                    textView2.setBackground(shapeDrawable);
                    textView2.setText(str5);
                    textView2.setContentDescription(z ? cy30.p(str5, "; ", string, "; ", constraintLayout.getContext().getString(2131957128)) : f4i1.f(str5, "; ", string));
                } else if (w611Var instanceof g1b0) {
                    g1b0 g1b0Var = (g1b0) w611Var;
                    q1b0 q1b0Var = pv51Var.a;
                    boolean z2 = pv51Var.b;
                    String strF = q1b0Var.c;
                    haa0 haa0Var2 = g1b0Var.U0;
                    ViewStub viewStub2 = (ViewStub) haa0Var2.d;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) haa0Var2.b;
                    viewStub2.setVisibility(z2 ? 0 : 8);
                    constraintLayout2.setOnClickListener(new rn(g1b0Var, q1b0Var, i2, (byte) 2));
                    EncoreImageView encoreImageView = (EncoreImageView) haa0Var2.c;
                    encoreImageView.setImageLoader(g1b0Var.V0);
                    encoreImageView.setModifierFactory(ul90.U0);
                    encoreImageView.setSource(new sux(Uri.parse(q1b0Var.b)));
                    if (z2) {
                        strF = f4i1.f(strF, "; ", constraintLayout2.getContext().getString(2131957128));
                    }
                    encoreImageView.setContentDescription(strF);
                }
                break;
        }
    }

    public final w611 p(int i2, ViewGroup viewGroup) {
        g1b0 h1b0Var;
        byte b = this.e;
        byte b2 = 4;
        Object obj = this.f;
        switch (b) {
            case 0:
                View viewS = uyn1.s(viewGroup.getContext(), 2131626042, viewGroup, 4);
                viewS.getClass();
                return new c551(viewS, (gw70) obj, (h351) this.g, (h351) this.h);
            case 1:
                return new jn5(this, ((pp) obj).a(null));
            case 2:
                e5g e5gVar = new e5g(viewGroup.getContext(), (byte) 1);
                lq50 lq50Var = new lq50(e5gVar);
                e5gVar.setImportantForAccessibility(2);
                e5gVar.setOnClickListener(new t230(this, lq50Var, b2));
                return lq50Var;
            default:
                gs90 gs90Var = (gs90) this.h;
                int iC = l1d.C(l1d.H(2)[i2]);
                int i3 = 2131430915;
                if (iC == 0) {
                    ConstraintLayout constraintLayoutL = eqq.l(viewGroup, 2131625110, viewGroup, false);
                    TextView textView = (TextView) m5n1.t(constraintLayoutL, 2131429709);
                    if (textView != null) {
                        ViewStub viewStub = (ViewStub) m5n1.t(constraintLayoutL, 2131430915);
                        if (viewStub != null) {
                            h1b0Var = new h1b0(new haa0(constraintLayoutL, textView, viewStub, (byte) 8), gs90Var);
                        }
                    } else {
                        i3 = 2131429709;
                    }
                    bhn0.i("Missing required view with ID: ".concat(constraintLayoutL.getResources().getResourceName(i3)));
                    return null;
                }
                if (iC != 1) {
                    eg.o();
                    return null;
                }
                ConstraintLayout constraintLayoutL2 = eqq.l(viewGroup, 2131625109, viewGroup, false);
                EncoreImageView encoreImageViewT = m5n1.t(constraintLayoutL2, 2131429708);
                if (encoreImageViewT != null) {
                    ViewStub viewStub2 = (ViewStub) m5n1.t(constraintLayoutL2, 2131430915);
                    if (viewStub2 != null) {
                        h1b0Var = new g1b0(new haa0(constraintLayoutL2, encoreImageViewT, viewStub2, (byte) 7), (gw70) obj, gs90Var);
                    }
                } else {
                    i3 = 2131429708;
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutL2.getResources().getResourceName(i3)));
                return null;
                return h1b0Var;
        }
    }

    public void r(RecyclerView recyclerView) {
        switch (this.e) {
            case 2:
                this.h = null;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public hv41(gw70 gw70Var, h351 h351Var, h351 h351Var2) {
        super(i);
        this.f = gw70Var;
        this.g = h351Var;
        this.h = h351Var2;
    }

    public hv41(String str, gw70 gw70Var, gs90 gs90Var) {
        super(mth1.a);
        this.g = str;
        this.f = gw70Var;
        this.h = gs90Var;
    }

    public hv41(pp ppVar) {
        super(kn5.e);
        this.f = ppVar;
        this.g = null;
        this.h = null;
    }
}
