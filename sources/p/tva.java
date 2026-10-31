package p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.appendix.contentviewstate.view.LoadingView;
import com.spotify.artist.artistfactsui.ArtistFactsView;
import com.spotify.artist.creatorartist.ExpandableEllipsizeTextView;
import com.spotify.legacyglue.carousel.CarouselLayoutManager;
import com.spotify.legacyglue.emptystates.EmptyView;
import com.spotify.legacyglue.pasteview.PasteViewLayoutParamHelper;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import p.iu30;
import p.s611;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tva implements fwa {
    public final ExpandableEllipsizeTextView N0;
    public final TextView O0;
    public final uw31 P0;
    public final View Q0;
    public final uw31 R0;
    public final uw31 S0;
    public final uw31 T0;
    public final uw31 U0;
    public final uw31 V0;
    public final uw31 W0;
    public final gj51 X;
    public final ArtistFactsView X0;
    public final ed6 Y;
    public final wc6 Y0;
    public final dd6 Z;
    public final RecyclerView Z0;
    public final Context a;
    public final RecyclerView a1;
    public final gw70 b;
    public final rm5 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final rtl g;
    public iu30 h;
    public iu30 i;
    public final d520 t;

    /* JADX WARN: Type inference failed for: r2v6, types: [android.widget.TextView, com.spotify.artist.creatorartist.ExpandableEllipsizeTextView] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public tva(Context context, LayoutInflater layoutInflater, gw70 gw70Var, rm5 rm5Var, boolean z, boolean z2, boolean z3) {
        kna knaVar = kna.d;
        this.a = context;
        this.b = gw70Var;
        this.c = rm5Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        gj51 gj51Var = new gj51();
        this.X = gj51Var;
        rtl rtlVar = new rtl(context, null);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        lqc lqcVar = LoadingView.S0;
        rtlVar.b = layoutInflaterFrom.inflate(2131625163, (ViewGroup) null);
        View emptyView = new EmptyView(context);
        i0c0 i0c0Var = new i0c0(emptyView);
        emptyView.setLayoutParams(PasteViewLayoutParamHelper.generateMatchParentWidthAndHeightLayoutParams(context, rtlVar));
        emptyView.setTag(2131429011, i0c0Var);
        rtlVar.a = i0c0Var;
        rtlVar.addView(emptyView);
        rtlVar.addView(rtlVar.b);
        View viewInflate = layoutInflater.inflate(2131624482, (ViewGroup) rtlVar, false);
        ViewGroup viewGroup = (RecyclerView) viewInflate.findViewById(R.id.list);
        viewGroup.setLayoutManager(new LinearLayoutManager(1));
        this.Y = new ed6(context);
        this.Z = new dd6(context);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(2131166517);
        o6 o6Var = this.Y;
        if (o6Var == null) {
            u890.C("rankView");
            throw null;
        }
        o6Var.setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        o6 o6Var2 = this.Z;
        if (o6Var2 == null) {
            u890.C("listenersView");
            throw null;
        }
        o6Var2.setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        if (z) {
            RecyclerView recyclerViewFindViewById = viewInflate.findViewById(2131427605);
            this.a1 = recyclerViewFindViewById;
            if (recyclerViewFindViewById != null) {
                recyclerViewFindViewById.setLayoutManager(new LinearLayoutManager(1));
            }
            RecyclerView recyclerView = this.a1;
            recyclerView.getClass();
            rwq0.s(recyclerView, knaVar);
        } else {
            FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(2131624054, viewGroup, false);
            this.Z0 = frameLayout.findViewById(2131428267);
            CarouselLayoutManager carouselLayoutManager = new CarouselLayoutManager() { // from class: com.spotify.artist.creatorartist.BiographyFragmentProxy$createContentView$layoutManager$1
                {
                    super(1);
                }

                public final void R0(RecyclerView recyclerView2, s611 s611Var, int i) {
                    iu30 iu30Var;
                    if (((CarouselLayoutManager) this).V0 != i && (iu30Var = this.k1.i) != null) {
                        iu30Var.invoke(Integer.valueOf(i));
                    }
                    super.R0(recyclerView2, s611Var, i);
                }
            };
            carouselLayoutManager.U0 = new ij81(context);
            RecyclerView recyclerView2 = this.Z0;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(carouselLayoutManager);
            }
            RecyclerView recyclerView3 = this.Z0;
            if (recyclerView3 != null) {
                recyclerView3.setItemAnimator(new ywd());
            }
            gj51Var.A(new bml(frameLayout, false), 0);
        }
        ?? r2 = (ExpandableEllipsizeTextView) layoutInflater.inflate(2131624490, viewGroup, false);
        this.N0 = r2;
        r2.setMovementMethod(LinkMovementMethod.getInstance());
        AppCompatTextView appCompatTextView = this.N0;
        if (appCompatTextView == null) {
            u890.C("biographyTextView");
            throw null;
        }
        appCompatTextView.setTextAppearance(2132018003);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(2131624075, viewGroup, false);
        TextView textView = (TextView) viewGroup2.findViewById(2131427652);
        this.O0 = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView2 = this.O0;
        if (textView2 == null) {
            u890.C("autobiographyText");
            throw null;
        }
        textView2.setTextAppearance(2132018003);
        s7s0 s7s0VarR = t890.r(context, viewGroup, 2131625036);
        uw31 uw31Var = new uw31(s7s0VarR);
        s7s0VarR.setTag(2131429011, uw31Var);
        this.P0 = uw31Var;
        s7s0VarR.setPadding(s7s0VarR.getPaddingLeft(), s7s0VarR.getPaddingTop(), s7s0VarR.getPaddingRight(), context.getResources().getDimensionPixelOffset(2131167068));
        uw31 uw31Var2 = this.P0;
        if (uw31Var2 == null) {
            u890.C("attributionRow");
            throw null;
        }
        viewGroup2.addView(((su31) uw31Var2).a);
        View viewInflate2 = layoutInflater.inflate(2131624064, viewGroup, false);
        this.Q0 = viewInflate2;
        byte b = 8;
        viewInflate2.setVisibility(8);
        ViewGroup viewGroup3 = (ViewGroup) layoutInflater.inflate(2131626173, viewGroup, false);
        ArrayList arrayList = new ArrayList();
        int iR = xfo1.r(viewInflate, 2130970418);
        int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(2131167069);
        this.U0 = a(viewGroup, iR, dimensionPixelOffset2, 2131232047, 2131954680, arrayList);
        this.T0 = a(viewGroup, iR, dimensionPixelOffset2, 2131232819, 2131954687, arrayList);
        this.W0 = a(viewGroup, iR, dimensionPixelOffset2, 2131232771, 2131954686, arrayList);
        this.S0 = a(viewGroup, iR, dimensionPixelOffset2, 2131231813, 2131954679, arrayList);
        this.R0 = a(viewGroup, iR, dimensionPixelOffset2, 2131231677, 2131954689, arrayList);
        this.V0 = a(viewGroup, iR, dimensionPixelOffset2, 2131232930, 2131954688, arrayList);
        if (arrayList.size() > 1) {
            r7h.f0(arrayList, new k0d((byte) 25));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            viewGroup3.addView(((p0a1) it.next()).b);
        }
        o6 o6Var3 = this.Y;
        if (o6Var3 == null) {
            u890.C("rankView");
            throw null;
        }
        gj51Var.A(new bml(o6Var3, false), 1);
        gj51Var.D(false, new int[]{1});
        o6 o6Var4 = this.Z;
        if (o6Var4 == null) {
            u890.C("listenersView");
            throw null;
        }
        gj51Var.A(new bml(o6Var4, false), 2);
        AppCompatTextView appCompatTextView2 = this.N0;
        if (appCompatTextView2 == null) {
            u890.C("biographyTextView");
            throw null;
        }
        gj51Var.A(new bml(appCompatTextView2, false), 3);
        gj51Var.D(false, new int[]{3});
        gj51Var.A(new bml(viewGroup2, false), 4);
        gj51Var.D(false, new int[]{4});
        View view = this.Q0;
        if (view == null) {
            u890.C("registeredRow");
            throw null;
        }
        gj51Var.A(new bml(view, true), 5);
        gj51Var.D(false, new int[]{5});
        wc6 wc6Var = new wc6(this.a);
        this.Y0 = wc6Var;
        wc6Var.setOnLearnMoreClick(new tla(this, (byte) 6));
        o6 o6Var5 = this.Y0;
        if (o6Var5 == null) {
            u890.C("artistBadgesView");
            throw null;
        }
        gj51Var.A(new bml(o6Var5, false), 6);
        gj51Var.D(false, new int[]{6});
        View viewInflate3 = layoutInflater.inflate(2131624057, viewGroup, false);
        ArtistFactsView artistFactsView = (ArtistFactsView) viewInflate3.findViewById(2131427604);
        this.X0 = artistFactsView;
        artistFactsView.setOnLearnMoreClick(new gaa(this, b));
        gj51Var.A(new bml(viewInflate3, false), 7);
        gj51Var.D(false, new int[]{7});
        gj51Var.A(new bml(viewGroup3, false), 8);
        gj51Var.D(false, new int[0]);
        viewGroup.setAdapter(gj51Var);
        viewGroup.setClipToPadding(false);
        rwq0.s(viewGroup, knaVar);
        rtlVar.setContentView(viewInflate);
        f8x emptyState = rtlVar.getEmptyState();
        Context context2 = this.a;
        View contentView = rtlVar.getContentView();
        ArrayList<sam> arrayList2 = new ArrayList();
        ram ramVar = ram.b;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            n57.c(ramVar, ((sam) it2.next()).a);
        }
        arrayList2.add(new sam(ramVar, "offline", 2131955740, 2131955739));
        ram ramVar2 = ram.c;
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            n57.c(ramVar2, ((sam) it3.next()).a);
        }
        arrayList2.add(new sam(ramVar2, "exclamation_circle", 2131955714, 2131955713));
        d520 d520Var = new d520(context2, emptyState, contentView);
        for (sam samVar : arrayList2) {
            ((EnumMap) d520Var.b).put(samVar.a, samVar);
        }
        this.t = d520Var;
        this.g = rtlVar;
    }

    public final void B(String str) {
        uw31 uw31Var = this.U0;
        if (uw31Var == null) {
            u890.C("instagramLinkRow");
            throw null;
        }
        f(str, uw31Var, 4);
        if (uw31Var == null) {
            u890.C("instagramLinkRow");
            throw null;
        }
        ((su31) uw31Var).a.setVisibility(0);
        this.X.F(8);
        rm5 rm5Var = this.c;
        i8h1 i8h1Var = (i8h1) rm5Var.b;
        urk0 urk0Var = (urk0) rm5Var.a;
        x6h1 x6h1VarC = urk0Var.b.c();
        x6h1VarC.i.add(new a7h1("social_instagram_link", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = urk0Var.c;
        i8h1Var.f(k7h1Var.a(), (Set) null);
    }

    public final void D(Throwable th) {
        d520 d520Var = this.t;
        d520Var.getClass();
        d520Var.c0(ram.c);
    }

    public final void F(String str) {
        uw31 uw31Var = this.V0;
        if (uw31Var == null) {
            u890.C("whatsAppLinkRow");
            throw null;
        }
        f(str, uw31Var, 5);
        if (uw31Var == null) {
            u890.C("whatsAppLinkRow");
            throw null;
        }
        ((su31) uw31Var).a.setVisibility(0);
        this.X.F(8);
        rm5 rm5Var = this.c;
        i8h1 i8h1Var = (i8h1) rm5Var.b;
        urk0 urk0Var = (urk0) rm5Var.a;
        x6h1 x6h1VarC = urk0Var.b.c();
        x6h1VarC.i.add(new a7h1("social_whatsapp_link", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = urk0Var.c;
        i8h1Var.f(k7h1Var.a(), (Set) null);
    }

    public final void I(String str) {
        uw31 uw31Var = this.T0;
        if (uw31Var == null) {
            u890.C("twitterLinkRow");
            throw null;
        }
        f(str, uw31Var, 3);
        if (uw31Var == null) {
            u890.C("twitterLinkRow");
            throw null;
        }
        ((su31) uw31Var).a.setVisibility(0);
        this.X.F(8);
        rm5 rm5Var = this.c;
        i8h1 i8h1Var = (i8h1) rm5Var.b;
        urk0 urk0Var = (urk0) rm5Var.a;
        x6h1 x6h1VarC = urk0Var.b.c();
        x6h1VarC.i.add(new a7h1("social_twitter_link", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = urk0Var.c;
        i8h1Var.f(k7h1Var.a(), (Set) null);
    }

    public final void K(String str, String str2, String str3) {
        Spannable spannable = (Spannable) Html.fromHtml(str, 0);
        guo1.G(spannable);
        TextView textView = this.O0;
        if (textView == null) {
            u890.C("autobiographyText");
            throw null;
        }
        textView.setText(spannable);
        Context context = this.a;
        Drawable drawable = context.getDrawable(2131231458);
        if (drawable == null) {
            hhg1.n("Icon drawable resource must be valid");
            return;
        }
        int iO = ago1.o(context, 2130968791, 0);
        int iO2 = ago1.o(context, 2130968769, 0);
        drawable.setTint(iO);
        ecg ecgVar = new ecg(drawable);
        ecgVar.d = ColorStateList.valueOf(iO2);
        ecgVar.c.setColor(iO2);
        ecgVar.f = iO2;
        ecgVar.a();
        ecgVar.invalidateSelf();
        ixg ixgVarF = this.b.f(str2);
        ixgVarF.m(ecgVar);
        ixgVarF.f(ecgVar);
        ixgVarF.s(new kcg());
        uw31 uw31Var = this.P0;
        if (uw31Var == null) {
            u890.C("attributionRow");
            throw null;
        }
        ixgVarF.k(uw31Var.d, (ird1) null);
        String string = context.getResources().getString(2131960262, str3);
        if (uw31Var == null) {
            u890.C("attributionRow");
            throw null;
        }
        uw31Var.h(string);
        this.X.F(4);
        rm5 rm5Var = this.c;
        i8h1 i8h1Var = (i8h1) rm5Var.b;
        urk0 urk0Var = (urk0) rm5Var.a;
        x6h1 x6h1VarC = urk0Var.b.c();
        x6h1VarC.i.add(new a7h1("about_biography", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = urk0Var.c;
        i8h1Var.f(k7h1Var.a(), (Set) null);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [android.view.View, p.dd6] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void S(fxn fxnVar) {
        iu30 iu30Var;
        d520 d520Var = this.t;
        d520Var.getClass();
        dem1.v();
        ((PriorityQueue) d520Var.c).clear();
        d520Var.h = null;
        d520Var.j0();
        String str = fxnVar.e;
        if (str != null && (iu30Var = this.h) != null) {
            iu30Var.invoke(str);
        }
        int i = fxnVar.b;
        boolean z = i > 0;
        gj51 gj51Var = this.X;
        if (z) {
            ed6 ed6Var = this.Y;
            if (ed6Var == null) {
                u890.C("rankView");
                throw null;
            }
            ed6Var.setRank(i);
            gj51Var.D(true, new int[]{1});
        } else {
            gj51Var.D(false, new int[]{1});
        }
        int dimensionPixelOffset = this.a.getResources().getDimensionPixelOffset(2131166517);
        ?? r7 = this.Z;
        if (r7 == 0) {
            u890.C("listenersView");
            throw null;
        }
        r7.setPadding(dimensionPixelOffset, z ? 0 : dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        if (r7 == 0) {
            u890.C("listenersView");
            throw null;
        }
        r7.setListenersCount(fxnVar.a);
        gj51Var.F(2);
    }

    public final void T(String str) {
        uw31 uw31Var = this.R0;
        if (uw31Var == null) {
            u890.C("wikipediaLinkRow");
            throw null;
        }
        f(str, uw31Var, 1);
        if (uw31Var == null) {
            u890.C("wikipediaLinkRow");
            throw null;
        }
        ((su31) uw31Var).a.setVisibility(0);
        this.X.F(8);
        rm5 rm5Var = this.c;
        i8h1 i8h1Var = (i8h1) rm5Var.b;
        urk0 urk0Var = (urk0) rm5Var.a;
        x6h1 x6h1VarC = urk0Var.b.c();
        x6h1VarC.i.add(new a7h1("social_wikipedia_link", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = urk0Var.c;
        i8h1Var.f(k7h1Var.a(), (Set) null);
    }

    public final void U() {
        d520 d520Var = this.t;
        d520Var.getClass();
        dem1.v();
        ((PriorityQueue) d520Var.c).clear();
        View view = null;
        d520Var.h = null;
        d520Var.j0();
        LoadingView loadingView = this.g.getLoadingView();
        dem1.v();
        d520Var.g = loadingView;
        loadingView.b();
        LoadingView loadingView2 = (LoadingView) d520Var.g;
        View view2 = (View) d520Var.e;
        i0c0 i0c0Var = (f8x) d520Var.d;
        View view3 = i0c0Var.a;
        if (view3.getVisibility() == 0) {
            view = view3;
        } else if (view2.getVisibility() == 0) {
            view = view2;
        }
        loadingView2.setTargetContentView(view);
        i0c0Var.a.setVisibility(8);
        view2.setVisibility(8);
        LoadingView loadingView3 = (LoadingView) d520Var.g;
        int i = loadingView3.c;
        if (loadingView3.N0 == 1) {
            loadingView3.N0 = 2;
            loadingView3.postDelayed(loadingView3.O0, i);
        }
    }

    public final void W() {
        if (!this.d) {
            this.X.D(false, new int[]{0});
            return;
        }
        RecyclerView recyclerView = this.a1;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
    }

    public final void Z(String str) {
        uw31 uw31Var = this.S0;
        if (uw31Var == null) {
            u890.C("facebookLinkRow");
            throw null;
        }
        f(str, uw31Var, 2);
        if (uw31Var == null) {
            u890.C("facebookLinkRow");
            throw null;
        }
        ((su31) uw31Var).a.setVisibility(0);
        this.X.F(8);
        rm5 rm5Var = this.c;
        i8h1 i8h1Var = (i8h1) rm5Var.b;
        urk0 urk0Var = (urk0) rm5Var.a;
        x6h1 x6h1VarC = urk0Var.b.c();
        x6h1VarC.i.add(new a7h1("social_facebook_link", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = urk0Var.c;
        i8h1Var.f(k7h1Var.a(), (Set) null);
    }

    public final uw31 a(RecyclerView recyclerView, int i, int i2, int i3, int i4, ArrayList arrayList) {
        Context context = this.a;
        Drawable drawable = context.getDrawable(i3);
        if (drawable != null) {
            drawable.setTint(i);
        }
        s7s0 s7s0VarR = t890.r(context, recyclerView, 2131625036);
        uw31 uw31Var = new uw31(s7s0VarR);
        s7s0VarR.setTag(2131429011, uw31Var);
        s7s0VarR.setVisibility(8);
        ((vw31) uw31Var).c.setText(i4);
        ImageView imageView = uw31Var.d;
        imageView.setImageDrawable(drawable);
        imageView.getLayoutParams().height = i2;
        imageView.getLayoutParams().width = i2;
        arrayList.add(new p0a1(context.getString(i4), s7s0VarR));
        return uw31Var;
    }

    public final View b() {
        return this.g;
    }

    public final void c(pva pvaVar) {
        this.i = pvaVar;
    }

    public final void d(boolean z) {
        View view = this.Q0;
        if (view == null) {
            u890.C("registeredRow");
            throw null;
        }
        view.setVisibility(z ? 0 : 8);
        gj51 gj51Var = this.X;
        if (z) {
            gj51Var.D(true, new int[]{5});
        } else {
            gj51Var.D(false, new int[]{5});
        }
    }

    public final void e(pva pvaVar) {
        this.h = pvaVar;
    }

    public final void f(String str, uw31 uw31Var, int i) {
        ((su31) uw31Var).a.setOnClickListener(new rn(str, this, i, (byte) 1));
    }

    public final void g(String str) {
        Spannable spannable = (Spannable) Html.fromHtml(str, 0);
        guo1.G(spannable);
        AppCompatTextView appCompatTextView = this.N0;
        if (appCompatTextView == null) {
            u890.C("biographyTextView");
            throw null;
        }
        appCompatTextView.setText(spannable);
        this.X.F(3);
        rm5 rm5Var = this.c;
        i8h1 i8h1Var = (i8h1) rm5Var.b;
        urk0 urk0Var = (urk0) rm5Var.a;
        x6h1 x6h1VarC = urk0Var.b.c();
        x6h1VarC.i.add(new a7h1("about_biography", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = urk0Var.c;
        i8h1Var.f(k7h1Var.a(), (Set) null);
    }

    public final void h(List list) {
        boolean z = this.d;
        gw70 gw70Var = this.b;
        if (z) {
            uva uvaVar = new uva(gw70Var, (byte) 0);
            uvaVar.f = list;
            RecyclerView recyclerView = this.a1;
            if (recyclerView != null) {
                recyclerView.setAdapter(uvaVar);
            }
        } else {
            uva uvaVar2 = new uva(gw70Var, (byte) 1);
            uvaVar2.f = list;
            RecyclerView recyclerView2 = this.Z0;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(uvaVar2);
            }
        }
        rm5 rm5Var = this.c;
        i8h1 i8h1Var = (i8h1) rm5Var.b;
        urk0 urk0Var = (urk0) rm5Var.a;
        x6h1 x6h1VarC = urk0Var.b.c();
        x6h1VarC.i.add(new a7h1("gallery", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = urk0Var.c;
        i8h1Var.f(k7h1Var.a(), (Set) null);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void n(List list) {
        Object next;
        String str;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((io6) next).a != mo6.c);
        io6 io6Var = (io6) next;
        int i = 0;
        boolean z = io6Var != null && io6Var.a == mo6.c && ((str = io6Var.b) == null || str.equals("CONFIRMED"));
        boolean z2 = io6Var != null && io6Var.a == mo6.c && u890.j(io6Var.b, "LIKELY");
        boolean z3 = (this.e && z) || (this.f && z2);
        rm5 rm5Var = this.c;
        gj51 gj51Var = this.X;
        if (z3) {
            wc6 wc6Var = this.Y0;
            if (wc6Var == null) {
                u890.C("artistBadgesView");
                throw null;
            }
            wc6Var.setLikely(z2);
            gj51Var.D(true, new int[]{6});
            if (wc6Var == null) {
                u890.C("artistBadgesView");
                throw null;
            }
            int i2 = ((Boolean) wc6Var.N0.getValue()).booleanValue() ? 2 : 1;
            i8h1 i8h1Var = (i8h1) rm5Var.b;
            urk0 urk0Var = (urk0) rm5Var.a;
            int iC = l1d.C(i2);
            int i3 = iC != 1 ? iC != 2 ? 1 : 3 : 2;
            x6h1 x6h1VarC = urk0Var.b.c();
            x6h1VarC.i.add(new a7h1("badge_card", v8i0.f(i3), 0, (String) null, (String) null));
            x6h1VarC.j = true;
            y6h1 y6h1VarA = x6h1VarC.a();
            k7h1 k7h1Var = new k7h1();
            ((xjn) k7h1Var).a = y6h1VarA;
            ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
            k7h1Var.e = urk0Var.c;
            i8h1Var.f(k7h1Var.a(), (Set) null);
        } else {
            gj51Var.D(false, new int[]{6});
        }
        ArtistFactsView artistFactsView = this.X0;
        if (artistFactsView == null) {
            u890.C("artistFactsView");
            throw null;
        }
        artistFactsView.setTitleOutsideCard(z3);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            io6 io6Var2 = (io6) it2.next();
            mo6 mo6Var = io6Var2.a;
            if (mo6Var != mo6.c) {
                if (mo6Var == mo6.g) {
                    arrayList.add(new io6(io6Var2.a, null, this.a.getString(2131963728)));
                } else {
                    String str2 = io6Var2.c;
                    if (str2 != null && str2.length() != 0) {
                        arrayList.add(io6Var2);
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            gj51Var.D(false, new int[]{7});
            return;
        }
        if (artistFactsView == null) {
            u890.C("artistFactsView");
            throw null;
        }
        artistFactsView.setFacts(arrayList);
        gj51Var.D(true, new int[]{7});
        gj51Var.D(false, new int[]{5});
        for (Object obj : arrayList) {
            int i4 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            mo6 mo6Var2 = ((io6) obj).a;
            i8h1 i8h1Var2 = (i8h1) rm5Var.b;
            urk0 urk0Var2 = (urk0) rm5Var.a;
            int iO = rm5.O(mo6Var2);
            Integer numValueOf = Integer.valueOf(i);
            x6h1 x6h1VarC2 = urk0Var2.b.c();
            x6h1VarC2.i.add(new a7h1("artist_detail_row", v8i0.e(iO), numValueOf, (String) null, (String) null));
            x6h1VarC2.j = true;
            y6h1 y6h1VarA2 = x6h1VarC2.a();
            k7h1 k7h1Var2 = new k7h1();
            ((xjn) k7h1Var2).a = y6h1VarA2;
            ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
            k7h1Var2.e = urk0Var2.c;
            i8h1Var2.f(k7h1Var2.a(), (Set) null);
            i = i4;
        }
    }

    public final void w() {
        d520 d520Var = this.t;
        d520Var.getClass();
        d520Var.c0(ram.b);
    }

    public final void x(String str) {
        uw31 uw31Var = this.W0;
        if (uw31Var == null) {
            u890.C("tikTokLinkRow");
            throw null;
        }
        f(str, uw31Var, 6);
        if (uw31Var == null) {
            u890.C("tikTokLinkRow");
            throw null;
        }
        ((su31) uw31Var).a.setVisibility(0);
        this.X.F(8);
        rm5 rm5Var = this.c;
        i8h1 i8h1Var = (i8h1) rm5Var.b;
        urk0 urk0Var = (urk0) rm5Var.a;
        x6h1 x6h1VarC = urk0Var.b.c();
        x6h1VarC.i.add(new a7h1("social_tiktok_link", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = urk0Var.c;
        i8h1Var.f(k7h1Var.a(), (Set) null);
    }

    public final void r() {
    }

    public final void y() {
    }
}
