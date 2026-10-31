package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.download.DownloadBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.enhanced.EnhancedBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.locked.LockedBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.premium.PremiumBadgeView;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.encoreconsumermobile.elements.playindicator.PlayIndicatorComposeView;
import com.spotify.encoreconsumermobile.elements.quickactions.QuickActionView;
import com.spotify.encoremobile.component.icons.IconCheckAltFill;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.recents.uiusecases.singleartworkwithbadge.SingleArtworkWithBadgeView;
import com.spotify.recents.uiusecases.stackedartwork.StackedArtworkComposeView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hjs implements qzh {
    public final Object N0;
    public final Object X;
    public final Object Y;
    public Object Z;
    public final /* synthetic */ byte a = 0;
    public final idd1 b;
    public final TextView c;
    public final Object d;
    public final View e;
    public final View f;
    public final View g;
    public final Object h;
    public final Object i;
    public final Object t;

    public hjs(Context context, gw70 gw70Var, idd1 idd1Var, i3h i3hVar) {
        this.d = context;
        this.b = idd1Var;
        View viewInflate = LayoutInflater.from(context).inflate(2131625573, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(2131431356);
        this.c = textView;
        TextView textView2 = (TextView) viewInflate.findViewById(2131431115);
        this.e = textView2;
        this.f = (TextView) viewInflate.findViewById(2131430349);
        View view = (ArtworkView) viewInflate.findViewById(2131429612);
        this.h = view;
        view.setViewContext(new f47(gw70Var));
        this.X = viewInflate.findViewById(2131430746);
        View view2 = (SingleArtworkWithBadgeView) viewInflate.findViewById(2131430747);
        this.i = view2;
        View view3 = (StackedArtworkComposeView) viewInflate.findViewById(2131431060);
        this.t = view3;
        view2.setImageLoader(gw70Var);
        view2.setCollectionDrawableProvider(i3hVar);
        view3.setImageLoader(gw70Var);
        view3.setCollectionDrawableProvider(i3hVar);
        this.Y = (ViewGroup) viewInflate.findViewById(2131430532);
        this.g = (TextView) viewInflate.findViewById(2131431043);
        v9w0 v9w0VarP = b2u.p(viewInflate);
        View[] viewArr = {textView};
        ArrayList arrayList = v9w0VarP.c;
        Collections.addAll(arrayList, viewArr);
        Collections.addAll(arrayList, textView2);
        Collections.addAll(v9w0VarP.d, view, view2, view3);
        v9w0VarP.a();
        float dimensionPixelSize = viewInflate.getResources().getDimensionPixelSize(2131166902);
        float f = viewInflate.getResources().getConfiguration().fontScale;
        int i = (int) ((f < 1.0f ? 1.0f : f) * dimensionPixelSize);
        for (View view4 : p7h.M(new Object[]{view, view2, view3})) {
            ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
            if (layoutParams == null) {
                bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                throw null;
            }
            qhl qhlVar = (qhl) layoutParams;
            ((ViewGroup.MarginLayoutParams) qhlVar).width = i;
            ((ViewGroup.MarginLayoutParams) qhlVar).height = i;
            view4.setLayoutParams(qhlVar);
        }
        this.N0 = viewInflate;
    }

    public void a(x47 x47Var) {
        View view = (View) this.N0;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        float dimensionPixelSize = ((Context) this.d).getResources().getDimensionPixelSize(2131166902);
        x47Var.getClass();
        float f = dimensionPixelSize * 1.0f;
        float f2 = view.getResources().getConfiguration().fontScale;
        layoutParams.width = (int) ((f2 >= 1.0f ? f2 : 1.0f) * f);
        view.setLayoutParams(layoutParams);
    }

    public void b(x47 x47Var) {
        float dimensionPixelSize = ((Context) this.d).getResources().getDimensionPixelSize(2131166902);
        x47Var.getClass();
        float f = dimensionPixelSize * 1.0f;
        float f2 = ((View) this.N0).getResources().getConfiguration().fontScale;
        int i = (int) ((f2 >= 1.0f ? f2 : 1.0f) * f);
        SingleArtworkWithBadgeView singleArtworkWithBadgeView = (SingleArtworkWithBadgeView) this.i;
        ViewGroup.LayoutParams layoutParams = singleArtworkWithBadgeView.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        qhl qhlVar = (qhl) layoutParams;
        ((ViewGroup.MarginLayoutParams) qhlVar).width = i;
        singleArtworkWithBadgeView.setLayoutParams(qhlVar);
        ArtworkView artworkView = (ArtworkView) this.h;
        ViewGroup.LayoutParams layoutParams2 = artworkView.getLayoutParams();
        if (layoutParams2 == null) {
            bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        qhl qhlVar2 = (qhl) layoutParams2;
        ((ViewGroup.MarginLayoutParams) qhlVar2).width = i;
        qhlVar2.G = "1:1";
        artworkView.setLayoutParams(qhlVar2);
    }

    public final void f(Object obj) {
        int i;
        int i2;
        ViewGroup viewGroup;
        Integer num;
        mmr0 mmr0Var;
        byte b = this.a;
        idd1 idd1Var = this.b;
        Object obj2 = this.X;
        Object obj3 = this.h;
        Object obj4 = this.i;
        Object obj5 = this.Y;
        Object obj6 = this.t;
        ContextMenuButton contextMenuButton = this.e;
        TextView textView = this.c;
        View view = this.g;
        View view2 = this.f;
        Object obj7 = this.N0;
        Object obj8 = this.d;
        switch (b) {
            case 0:
                eq01 eq01Var = (eq01) obj;
                TextView textView2 = (TextView) contextMenuButton;
                Context context = (Context) obj8;
                boolean z = eq01Var.h;
                String str = eq01Var.c;
                boolean z2 = eq01Var.g;
                m9m m9mVar = eq01Var.f;
                m87 m87Var = eq01Var.n;
                boolean z3 = eq01Var.l;
                boolean z4 = eq01Var.o;
                List list = eq01Var.d;
                int i3 = eq01Var.f13p;
                StackedArtworkComposeView stackedArtworkComposeView = (StackedArtworkComposeView) obj6;
                SingleArtworkWithBadgeView singleArtworkWithBadgeView = (SingleArtworkWithBadgeView) obj4;
                ArtworkView artworkView = (ArtworkView) obj3;
                if (list.isEmpty()) {
                    x47 x47Var = x47.a;
                    b(x47Var);
                    a(x47Var);
                } else {
                    x47 x47Var2 = ((j47) o7h.q0(list)).b;
                    a(x47Var2);
                    b(x47Var2);
                }
                iq01 iq01VarI = uwo1.I(m9mVar, m87Var, z3, z4, list, i3);
                if (iq01VarI instanceof fq01) {
                    artworkView.h(((fq01) iq01VarI).a.a);
                    artworkView.setVisibility(0);
                    singleArtworkWithBadgeView.setVisibility(8);
                    stackedArtworkComposeView.setVisibility(8);
                } else if (iq01VarI instanceof gq01) {
                    gq01 gq01Var = (gq01) iq01VarI;
                    j47 j47Var = gq01Var.a;
                    m87 m87Var2 = gq01Var.b;
                    singleArtworkWithBadgeView.setVisibility(0);
                    artworkView.setVisibility(8);
                    stackedArtworkComposeView.setVisibility(8);
                    singleArtworkWithBadgeView.f(new hy81(j47Var, m87Var2));
                } else if (!(iq01VarI instanceof hq01)) {
                    eg.o();
                } else {
                    hq01 hq01Var = (hq01) iq01VarI;
                    m87 m87Var3 = hq01Var.a;
                    List list2 = hq01Var.b;
                    artworkView.setVisibility(8);
                    singleArtworkWithBadgeView.setVisibility(8);
                    stackedArtworkComposeView.setVisibility(0);
                    List list3 = list2;
                    ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((j47) it.next()).a);
                    }
                    stackedArtworkComposeView.f(new eab1(mqo1.A(arrayList), m87Var3));
                }
                String string = eq01Var.b;
                if (string == null) {
                    string = null;
                } else if (ihc1.y0(string)) {
                    int iC = l1d.C(eq01Var.f13p);
                    if (iC == 0) {
                        num = 2131952444;
                    } else if (iC == 7) {
                        num = 2131963321;
                    } else if (iC == 2) {
                        num = 2131952169;
                    } else if (iC == 3) {
                        num = 2131952579;
                    } else if (iC != 4) {
                        num = iC != 5 ? null : 2131955571;
                    } else {
                        num = 2131959896;
                    }
                    if (num == null || (string = context.getString(num.intValue())) == null) {
                        string = "";
                    }
                }
                textView.setText(string);
                ((View) obj7).setContentDescription(eq01Var.e);
                String str2 = eq01Var.a;
                ViewGroup viewGroup2 = (ViewGroup) obj5;
                if (z2) {
                    vgx0 vgx0Var = new vgx0(str2, 200.0f);
                    dtw dtwVarB = (dtw) this.Z;
                    if (dtwVarB == null) {
                        tka0 tka0Var = dtw.C;
                        dtwVarB = mhc.b((Context) obj8, viewGroup2, f6o1.A((maa) idd1Var.getValue(), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), vgx0Var, (ipb1) null, 112);
                        viewGroup = viewGroup2;
                        this.Z = dtwVarB;
                        viewGroup.addView(dtwVarB.w, new FrameLayout.LayoutParams(-1, -2, 16));
                    } else {
                        viewGroup = viewGroup2;
                    }
                    i = 0;
                    viewGroup.setVisibility(0);
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams == null) {
                        bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    } else {
                        qhl qhlVar = (qhl) layoutParams;
                        ((ViewGroup.MarginLayoutParams) qhlVar).height = textView2.getLineHeight();
                        ((ViewGroup.MarginLayoutParams) qhlVar).topMargin = (int) context.getResources().getDimension(2131166903);
                        viewGroup.setLayoutParams(qhlVar);
                        joa0 joa0Var = new joa0(str2);
                        tka0 tka0Var2 = dtw.C;
                        dtwVarB.k(vgx0Var, joa0Var, (vu30) null);
                        i2 = 8;
                    }
                } else {
                    i = 0;
                    i2 = 8;
                    viewGroup2.setVisibility(8);
                }
                textView2.setText(str);
                textView2.setVisibility((z2 || str == null || ihc1.y0(str)) ? i2 : i);
                ((TextView) view).setVisibility((!z || z2) ? (!eq01Var.i || z2) ? i2 : 4 : i);
                boolean z5 = eq01Var.l;
                int i4 = (str == null || ihc1.y0(str)) ? 1 : i;
                IconCheckAltFill iconCheckAltFill = (IconCheckAltFill) obj2;
                if (z5 && !z2 && i4 == 0) {
                    i2 = i;
                }
                iconCheckAltFill.setVisibility(i2);
                boolean z6 = eq01Var.k;
                Integer num2 = eq01Var.j;
                textView.setMaxLines(z6 ? 2 : 1);
                int iIntValue = (num2 != null ? num2.intValue() : axo1.l(z6, z)) - (z6 ? 2 : 1);
                ((TextView) view2).setMinHeight(((textView2.getLineHeight() + context.getResources().getDimensionPixelSize(2131166903)) * (iIntValue < 1 ? 1 : iIntValue)) + (textView.getLineHeight() * textView.getMaxLines()) + context.getResources().getDimensionPixelSize(2131166904));
                break;
            default:
                idd1 idd1Var2 = (idd1) obj7;
                hxf1 hxf1Var = (hxf1) obj;
                ImageView imageView = (ImageView) view2;
                ImageView imageView2 = (ImageView) view;
                String str3 = hxf1Var.n;
                fxf1 fxf1Var = hxf1Var.l;
                int i5 = hxf1Var.f;
                uez0 uez0Var = hxf1Var.m;
                textView.setText(String.valueOf(hxf1Var.a));
                ks6 ks6Var = (ks6) obj8;
                TextView textView3 = (TextView) ks6Var.R0;
                String str4 = hxf1Var.b;
                textView3.setText(str4);
                TextView textView4 = (TextView) ks6Var.Q0;
                ConstraintLayout constraintLayout = (ConstraintLayout) ks6Var.a;
                textView4.setText(f6o1.k(constraintLayout.getResources(), hxf1Var.c));
                ((ArtworkView) ks6Var.d).h(new g17(hxf1Var.d));
                ContextMenuButton contextMenuButton2 = contextMenuButton;
                contextMenuButton2.setEnabled(true);
                contextMenuButton2.setContentDescription(contextMenuButton2.getResources().getString(2131962418, str4));
                ((QuickActionView) ks6Var.Z).a(uez0Var);
                EnhancedBadgeView enhancedBadgeView = (EnhancedBadgeView) ks6Var.f;
                enhancedBadgeView.setVisibility(8);
                ContentRestrictionBadgeView contentRestrictionBadgeView = (ContentRestrictionBadgeView) ks6Var.N0;
                contentRestrictionBadgeView.c(hxf1Var.e);
                DownloadBadgeView downloadBadgeView = (DownloadBadgeView) ks6Var.e;
                downloadBadgeView.c(hxf1Var.k);
                PremiumBadgeView premiumBadgeView = (PremiumBadgeView) ks6Var.X;
                premiumBadgeView.c(hxf1Var.h);
                LockedBadgeView lockedBadgeView = (LockedBadgeView) ks6Var.i;
                lockedBadgeView.c(hxf1Var.j);
                w2g0.l(lockedBadgeView, enhancedBadgeView, contentRestrictionBadgeView, premiumBadgeView, downloadBadgeView);
                boolean z7 = i5 != 3;
                constraintLayout.setActivated(z7);
                constraintLayout.setSelected(z7);
                int iOrdinal = fxf1Var.ordinal();
                if (iOrdinal == 0) {
                    mmr0Var = new mmr0((Object) null, (Object) null);
                } else if (iOrdinal == 1) {
                    mmr0Var = new mmr0((g4b1) obj4, (String) this.Z);
                } else if (iOrdinal == 2) {
                    mmr0Var = new mmr0((Drawable) obj6, (String) obj5);
                } else if (iOrdinal != 3) {
                    eg.o();
                } else {
                    mmr0Var = new mmr0((Object) null, (Object) null);
                }
                Drawable drawable = (Drawable) mmr0Var.a;
                String str5 = (String) mmr0Var.b;
                imageView2.setImageDrawable(drawable);
                imageView2.setContentDescription(str5);
                if (ovs.a[fxf1Var.ordinal()] == 1) {
                    imageView.setImageDrawable((g4b1) obj3);
                    imageView.setContentDescription((String) obj2);
                } else {
                    imageView.setImageDrawable(null);
                    imageView.setContentDescription(null);
                }
                boolean z8 = (uez0Var.equals(rez0.a) || uez0Var.equals(sez0.a) || !hxf1Var.g) ? false : true;
                imageView.setEnabled(z8);
                imageView2.setEnabled(z8);
                textView.setEnabled(z8);
                w2g0.w(ks6Var, z8);
                zkt0 zkt0Var = zkt0.c;
                if (z8) {
                    if (i5 == 1) {
                        zkt0Var = zkt0.a;
                    } else if (i5 == 2) {
                        zkt0Var = zkt0.b;
                    }
                }
                ((PlayIndicatorComposeView) ks6Var.t).z(zkt0Var);
                boolean z9 = hxf1Var.i;
                FrameLayout frameLayout = (FrameLayout) ks6Var.S0;
                if (z9) {
                    frameLayout.setVisibility(0);
                    zbs zbsVar = (zbs) idd1Var.getValue();
                    CharSequence text = textView4.getText();
                    tan0 tan0Var = new tan0(1, !(text == null || ihc1.y0(text)));
                    zbsVar.getClass();
                    zbsVar.a(tan0Var);
                } else {
                    frameLayout.setVisibility(8);
                }
                ((TextView) ((View) idd1Var2.getValue()).findViewById(2131430483)).setText(str3);
                ((View) idd1Var2.getValue()).setVisibility(str3 != null ? 0 : 8);
                ((ConstraintLayout) ks6Var.P0).setBackgroundColor(hxf1Var.o);
                break;
        }
    }

    public final View getView() {
        switch (this.a) {
            case 0:
                return (View) this.N0;
            default:
                return (ConstraintLayout) ((ks6) this.d).a;
        }
    }

    public final void n(iu30 iu30Var) {
        switch (this.a) {
            case 0:
                View view = (View) this.N0;
                view.setOnClickListener(new sis(iu30Var, (byte) 9));
                view.setOnLongClickListener(new wer(iu30Var, (byte) 13));
                break;
            default:
                ks6 ks6Var = (ks6) this.d;
                ((ConstraintLayout) ks6Var.a).setOnClickListener(new aqs(iu30Var, (byte) 9));
                ((ConstraintLayout) ks6Var.a).setOnLongClickListener(new wer(iu30Var, (byte) 17));
                this.e.n(new shs(iu30Var, (byte) 26));
                ((QuickActionView) ks6Var.Z).a = new shs(iu30Var, (byte) 27);
                break;
        }
    }

    public hjs(Context context, gw70 gw70Var, zfx zfxVar) {
        ks6 ks6VarG = ks6.g(LayoutInflater.from(context));
        w2g0.q(ks6VarG, gw70Var);
        this.d = ks6VarG;
        this.e = w2g0.p(ks6VarG, 2131624471);
        ViewStub viewStub = (ViewStub) ks6VarG.c;
        viewStub.setLayoutResource(2131626280);
        ViewGroup viewGroup = (ViewGroup) viewStub.inflate();
        this.b = new idd1(new nxr(zfxVar, this, (byte) 27));
        this.X = context.getString(2131960260);
        this.Y = context.getString(2131959115);
        this.Z = context.getString(2131960261);
        this.N0 = new idd1(new ots(this, (byte) 7));
        Guideline guideline = (Guideline) ks6VarG.h;
        qhl layoutParams = guideline.getLayoutParams();
        layoutParams.a = 0;
        guideline.setLayoutParams(layoutParams);
        this.f = (ImageView) b8k1.n(viewGroup, 2131429634);
        this.g = (ImageView) b8k1.n(viewGroup, 2131429633);
        this.c = (TextView) b8k1.n(viewGroup, 2131431537);
        g4b1 g4b1Var = new g4b1(context, j4b1.F1, context.getResources().getDimensionPixelSize(2131165724));
        g4b1Var.b(azo1.p(context, 2130968790));
        this.h = g4b1Var;
        g4b1 g4b1Var2 = new g4b1(context, j4b1.E1, context.getResources().getDimensionPixelSize(2131165724));
        g4b1Var2.b(azo1.p(context, 2130968789));
        this.i = g4b1Var2;
        Drawable drawable = context.getDrawable(2131233986);
        if (drawable != null) {
            drawable.setTint(azo1.p(context, 2130968786));
            this.t = drawable;
        } else {
            eg.m("Unable to load drawable track_row_chart_icon_new in TrackRowChart");
            throw null;
        }
    }
}
