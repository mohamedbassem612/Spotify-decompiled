package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.addtobutton.AddToButtonView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkShadow;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.legacyglue.icons.SpotifyIconView;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ngr implements qzh {
    public final /* synthetic */ byte a = 1;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public ngr(Context context, gw70 gw70Var) {
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131624328, (ViewGroup) null, false);
        int i = 2131427521;
        AddToButtonView addToButtonView = (AddToButtonView) m5n1.t(constraintLayoutInflate, 2131427521);
        if (addToButtonView != null) {
            i = 2131427606;
            ArtworkView artworkViewT = m5n1.t(constraintLayoutInflate, 2131427606);
            if (artworkViewT != null) {
                i = 2131427612;
                CardView cardViewT = m5n1.t(constraintLayoutInflate, 2131427612);
                if (cardViewT != null) {
                    i = 2131427624;
                    ArtworkShadow artworkShadow = (ArtworkShadow) m5n1.t(constraintLayoutInflate, 2131427624);
                    if (artworkShadow != null) {
                        i = 2131427757;
                        View viewT = m5n1.t(constraintLayoutInflate, 2131427757);
                        if (viewT != null) {
                            i = 2131428256;
                            FrameLayout frameLayout = (FrameLayout) m5n1.t(constraintLayoutInflate, 2131428256);
                            if (frameLayout != null) {
                                i = 2131428257;
                                ArtworkView artworkViewT2 = m5n1.t(constraintLayoutInflate, 2131428257);
                                if (artworkViewT2 != null) {
                                    i = 2131428438;
                                    TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131428438);
                                    if (textView != null) {
                                        i = 2131431115;
                                        TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131431115);
                                        if (textView2 != null) {
                                            i = 2131431356;
                                            TextView textView3 = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                                            if (textView3 != null) {
                                                ConstraintLayout constraintLayout = constraintLayoutInflate;
                                                em0 em0Var = new em0(constraintLayout, addToButtonView, artworkViewT, cardViewT, artworkShadow, viewT, frameLayout, artworkViewT2, textView, textView2, textView3);
                                                artworkViewT2.setViewContext(new f47(gw70Var));
                                                artworkViewT.setViewContext(new f47(gw70Var));
                                                this.c = em0Var;
                                                this.b = context.getColor(2131101503);
                                                nqr nqrVar = new nqr(new b2c(context, gw70Var), new yir(context, (byte) 13), (yqg) null, (Scheduler) null);
                                                this.d = nqrVar;
                                                this.e = r4u.c(new r4u[]{r4u.d(new ahs(vgs.b, (byte) 0), r4u.a(new vun(this, (byte) 17))), r4u.d(new ahs(wgs.b, (byte) 0), r4u.a(new qmr(this, (byte) 8))), r4u.d(new ahs(xgs.b, (byte) 0), r4u.a(new rmr(this, (byte) 8))), r4u.d(new ahs(ygs.b, (byte) 0), r4u.a(new efr(this, (byte) 10))), r4u.d(new ahs(zgs.b, (byte) 0), r4u.a(new h9n(this, (byte) 14))), r4u.d(new ahs(sgs.b, (byte) 0), r4u.a(new sun(this, (byte) 15))), r4u.d(new ahs(tgs.b, (byte) 0), r4u.a(new her(this, (byte) 11))), r4u.d(new ahs(ugs.b, (byte) 0), r4u.a(new rjn(this, (byte) 17)))});
                                                frameLayout.addView(nqrVar.f);
                                                this.f = constraintLayout;
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public static String a(String str, String str2) {
        StringBuilder sbG = dv20.g(str, " • ");
        if (str2 != null) {
            sbG.append(str2);
        }
        return sbG.toString();
    }

    /* JADX WARN: Type inference failed for: r6v8, types: [android.view.View, com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView] */
    public final void f(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                ph7 ph7Var = (ph7) obj;
                Context context = (Context) obj2;
                String str = ph7Var.d;
                String str2 = ph7Var.b;
                d520 d520Var = (d520) obj3;
                TextView textView = (TextView) d520Var.h;
                SpotifyIconView spotifyIconView = (SpotifyIconView) d520Var.d;
                ArtworkView artworkView = (ArtworkView) d520Var.c;
                TextView textView2 = (TextView) d520Var.g;
                textView.setText(ph7Var.a);
                k4m k4mVar = ph7Var.e;
                if (k4mVar != null) {
                    ((ContentRestrictionBadgeView) d520Var.f).f(k4mVar);
                }
                switch (l1d.C(ph7Var.c)) {
                    case 0:
                        textView2.setText(context.getString(2131952552));
                        artworkView.h(new l07(new g07(str2), false));
                        spotifyIconView.setContentDescription(context.getString(2131952551));
                        break;
                    case 1:
                        textView2.setText(context.getString(2131952560));
                        artworkView.h(new k17(new g07(str2)));
                        spotifyIconView.setContentDescription(context.getString(2131952559));
                        break;
                    case 2:
                        textView2.setText(a(context.getString(2131952550), str));
                        artworkView.h(new k07(new g07(str2), false));
                        spotifyIconView.setContentDescription(context.getString(2131952549));
                        break;
                    case 3:
                        textView2.setText(a(context.getString(2131952558), str));
                        artworkView.h(new y07(new g07(str2), false));
                        spotifyIconView.setContentDescription(context.getString(2131952557));
                        break;
                    case 4:
                        textView2.setText(a(context.getString(2131952562), str));
                        artworkView.h(new a17(new g07(str2)));
                        spotifyIconView.setContentDescription(context.getString(2131952561));
                        break;
                    case 5:
                        textView2.setText(a(context.getString(2131952556), str));
                        artworkView.h(new t07(new g07(str2), false));
                        spotifyIconView.setContentDescription(context.getString(2131952555));
                        break;
                    case 6:
                        textView2.setText(a(context.getString(2131952554), str));
                        artworkView.h(new o07(new g07(str2)));
                        spotifyIconView.setContentDescription(context.getString(2131952553));
                        break;
                    default:
                        eg.o();
                        break;
                }
                if (((nh7) this.d) instanceof mh7) {
                    getView().setBackgroundColor(azo1.p(context, 2130968769));
                }
                break;
            case 1:
                div0 div0Var = (div0) obj;
                ((r4u) obj3).e(div0Var);
                ((AddToButtonView) ((em0) obj2).c).f(new pk1(div0Var.e ? qk1.b : qk1.a, false, null, null, tk1.c, 14));
                break;
            default:
                exf1 exf1Var = (exf1) obj;
                d520 d520Var2 = (d520) obj3;
                TextView textView3 = (TextView) d520Var2.h;
                SpotifyIconView spotifyIconView2 = (SpotifyIconView) d520Var2.d;
                String str3 = exf1Var.a;
                textView3.setText(str3);
                TextView textView4 = (TextView) d520Var2.g;
                textView4.setText(((Context) obj2).getString(2131963359, o7h.y0(exf1Var.b, ", ", (String) null, (String) null, (iu30) null, 62)));
                ArtworkView artworkView2 = (ArtworkView) d520Var2.c;
                artworkView2.h(new g17(new g07(exf1Var.d)));
                ?? r6 = (ContentRestrictionBadgeView) d520Var2.f;
                r6.f(exf1Var.e);
                boolean z = exf1Var.c;
                tlv tlvVar = (ContextMenuButton) d520Var2.e;
                if (z) {
                    tlvVar.setVisibility(0);
                    tlvVar.setEnabled(true);
                    tlvVar.setContentDescription(tlvVar.getResources().getString(2131962418, str3));
                    spotifyIconView2.setVisibility(8);
                } else {
                    tlvVar.setVisibility(8);
                    spotifyIconView2.setVisibility(0);
                }
                boolean z2 = exf1Var.f != 3;
                getView().setActivated(z2);
                getView().setSelected(z2);
                boolean z3 = exf1Var.g;
                if (z) {
                    ((ConstraintLayout) d520Var2.b).setEnabled(z3);
                }
                artworkView2.setEnabled(z3);
                ((TextView) d520Var2.h).setEnabled(z3);
                textView4.setEnabled(z3);
                r6.setEnabled(z3);
                break;
        }
    }

    public final View getView() {
        switch (this.a) {
            case 0:
                return (View) ((idd1) this.f).getValue();
            case 1:
                return (ConstraintLayout) this.f;
            default:
                return (View) ((idd1) this.f).getValue();
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [android.view.View, com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton] */
    public final void n(iu30 iu30Var) {
        switch (this.a) {
            case 0:
                getView().setOnClickListener(new yer(iu30Var, (byte) 11));
                break;
            case 1:
                em0 em0Var = (em0) this.c;
                ((CardView) em0Var.e).setOnClickListener(new oes(iu30Var, (byte) 14));
                ((AddToButtonView) em0Var.c).n(new mwr(iu30Var, (byte) 25));
                ((nqr) this.d).n(new mwr(iu30Var, (byte) 26));
                break;
            default:
                d520 d520Var = (d520) this.e;
                ((ConstraintLayout) d520Var.b).setOnClickListener(new aqs(iu30Var, (byte) 8));
                ?? r0 = (ContextMenuButton) d520Var.e;
                if (r0.getVisibility() == 0) {
                    getView().setOnLongClickListener(new wer(iu30Var, (byte) 16));
                    r0.n(new shs(iu30Var, (byte) 25));
                }
                break;
        }
    }

    public ngr(Context context, gw70 gw70Var, cxf1 cxf1Var) {
        this.c = context;
        this.d = cxf1Var;
        this.b = context.getResources().getDimensionPixelSize(2131166934);
        d520 d520VarQ = d520.Q(LayoutInflater.from(context));
        ConstraintLayout constraintLayout = (ConstraintLayout) d520VarQ.b;
        eqq.t(-1, -2, constraintLayout);
        View view = (ArtworkView) d520VarQ.c;
        view.setViewContext(new f47(gw70Var));
        v9w0 v9w0VarQ = b2u.q(constraintLayout);
        Collections.addAll(v9w0VarQ.c, (TextView) d520VarQ.h, (TextView) d520VarQ.g);
        Collections.addAll(v9w0VarQ.d, view);
        v9w0VarQ.e = false;
        v9w0VarQ.a();
        this.e = d520VarQ;
        this.f = new idd1(new ots(this, (byte) 6));
    }

    public ngr(Context context, gw70 gw70Var, nh7 nh7Var) {
        this.c = context;
        this.d = nh7Var;
        this.b = context.getResources().getDimensionPixelSize(2131166934);
        d520 d520VarQ = d520.Q(LayoutInflater.from(context));
        ConstraintLayout constraintLayout = (ConstraintLayout) d520VarQ.b;
        eqq.t(-1, -2, constraintLayout);
        View view = (ArtworkView) d520VarQ.c;
        view.setViewContext(new f47(gw70Var));
        v9w0 v9w0VarQ = b2u.q(constraintLayout);
        Collections.addAll(v9w0VarQ.c, (TextView) d520VarQ.h, (TextView) d520VarQ.g);
        Collections.addAll(v9w0VarQ.d, view);
        v9w0VarQ.e = false;
        v9w0VarQ.a();
        this.e = d520VarQ;
        this.f = new idd1(new z5o(this, (byte) 20));
    }
}
