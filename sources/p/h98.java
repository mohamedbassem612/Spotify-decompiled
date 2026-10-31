package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.cardview.widget.CardView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.encoreconsumermobile.elements.addtobutton.AddToButtonView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkShadow;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.elements.chipbutton.ChipButtonView;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.encoreconsumermobile.elements.heart.HeartButton;
import com.spotify.encoreconsumermobile.elements.playbutton.PlayButtonView;
import com.spotify.encoreconsumermobile.elements.quickactions.QuickActionView;
import com.spotify.encoremobile.buttons.PrimaryButtonView;
import com.spotify.encoremobile.buttons.SecondaryButtonView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.icons.EncoreIconView;
import com.spotify.encoremobile.component.icons.IconX;
import com.spotify.encoremobile.roundedcorner.RoundedConstraintLayout;
import com.spotify.legacyglue.icons.SpotifyIconView;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h98 implements qzh {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;
    public Object d;

    /* JADX WARN: Code duplicated, block: B:28:0x0160 A[PHI: r2
      0x0160: PHI (r2v25 int) = (r2v24 int), (r2v26 int), (r2v27 int) binds: [B:19:0x0123, B:21:0x012f, B:23:0x013b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x02e0 A[PHI: r4
      0x02e0: PHI (r4v6 int) = (r4v5 int), (r4v7 int) binds: [B:63:0x0293, B:65:0x029f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r3v12, types: [android.view.View, com.spotify.encoremobile.component.icons.IconX] */
    public h98(Context context, byte b) {
        this.a = b;
        int i = 2131431115;
        int i2 = 2131431356;
        switch (b) {
            case 3:
                jnq jnqVar = new jnq(context);
                rjn rjnVar = new rjn((byte) 12, false);
                this.b = jnqVar;
                this.c = rjnVar;
                ConstraintLayout constraintLayout = (ConstraintLayout) ((g1i) jnqVar.c).b;
                this.d = constraintLayout;
                constraintLayout.addOnAttachStateChangeListener(new y22(this, (byte) 7));
                return;
            case 4:
            case 9:
            case 12:
            case 13:
            case 14:
            case 16:
            default:
                this.b = context;
                ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131624343, (ViewGroup) null, false);
                ConstraintLayout constraintLayout2 = constraintLayoutInflate;
                TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131431258);
                if (textView == null) {
                    bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(2131431258)));
                    throw null;
                }
                this.c = new i3b(constraintLayout2, constraintLayout2, textView, (byte) 14);
                this.d = constraintLayout2;
                eqq.t(-1, -1, constraintLayout2);
                return;
            case 5:
                this.b = context;
                ConstraintLayout constraintLayoutInflate2 = LayoutInflater.from(context).inflate(2131626328, (ViewGroup) null, false);
                ConstraintLayout constraintLayout3 = constraintLayoutInflate2;
                TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate2, 2131431115);
                if (textView2 != null) {
                    TextView textView3 = (TextView) m5n1.t(constraintLayoutInflate2, 2131431356);
                    if (textView3 != null) {
                        f9e1 f9e1Var = new f9e1(constraintLayout3, textView2, textView3);
                        eqq.t(-1, -1, constraintLayout3);
                        this.c = f9e1Var;
                        this.d = constraintLayout3;
                        return;
                    }
                    i = 2131431356;
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate2.getResources().getResourceName(i)));
                throw null;
            case 6:
                ConstraintLayout constraintLayoutInflate3 = LayoutInflater.from(context).inflate(2131624602, (ViewGroup) null, false);
                int i3 = 2131427969;
                CheckBox checkBox = (CheckBox) m5n1.t(constraintLayoutInflate3, 2131427969);
                if (checkBox != null) {
                    i3 = 2131430674;
                    ContentRestrictionBadgeView contentRestrictionBadgeViewT = m5n1.t(constraintLayoutInflate3, 2131430674);
                    if (contentRestrictionBadgeViewT != null) {
                        ConstraintLayout constraintLayout4 = constraintLayoutInflate3;
                        TextView textView4 = (TextView) m5n1.t(constraintLayoutInflate3, 2131431115);
                        if (textView4 != null) {
                            TextView textView5 = (TextView) m5n1.t(constraintLayoutInflate3, 2131431356);
                            if (textView5 != null) {
                                yjq yjqVar = new yjq(constraintLayout4, checkBox, contentRestrictionBadgeViewT, textView4, textView5, (byte) 26);
                                eqq.t(-1, -2, constraintLayout4);
                                this.d = yjqVar;
                                this.b = new idd1(new mo2(context, (byte) 6));
                                this.c = new idd1(new mo2(context, (byte) 7));
                                return;
                            }
                            i = 2131431356;
                        }
                    } else {
                        i = i3;
                    }
                } else {
                    i = i3;
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate3.getResources().getResourceName(i)));
                throw null;
            case 7:
                this.b = context;
                ConstraintLayout constraintLayoutInflate4 = LayoutInflater.from(context).inflate(2131624606, (ViewGroup) null, false);
                int i4 = 2131427687;
                if (m5n1.t(constraintLayoutInflate4, 2131427687) != null) {
                    i4 = 2131428724;
                    SecondaryButtonView secondaryButtonViewT = m5n1.t(constraintLayoutInflate4, 2131428724);
                    if (secondaryButtonViewT != null) {
                        i4 = 2131428727;
                        EncoreIconView encoreIconViewT = m5n1.t(constraintLayoutInflate4, 2131428727);
                        if (encoreIconViewT != null) {
                            i4 = 2131428730;
                            TextView textView6 = (TextView) m5n1.t(constraintLayoutInflate4, 2131428730);
                            if (textView6 != null) {
                                i4 = 2131428732;
                                TextView textView7 = (TextView) m5n1.t(constraintLayoutInflate4, 2131428732);
                                if (textView7 != null) {
                                    ConstraintLayout constraintLayout5 = constraintLayoutInflate4;
                                    tjq tjqVar = new tjq(constraintLayout5, secondaryButtonViewT, encoreIconViewT, textView6, textView7);
                                    constraintLayout5.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                    b2u.o(secondaryButtonViewT).a();
                                    this.c = tjqVar;
                                    return;
                                }
                            }
                        }
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate4.getResources().getResourceName(i4)));
                throw null;
            case 8:
                this.b = context;
                ConstraintLayout constraintLayoutInflate5 = LayoutInflater.from(context).inflate(2131626328, (ViewGroup) null, false);
                ConstraintLayout constraintLayout6 = constraintLayoutInflate5;
                TextView textView8 = (TextView) m5n1.t(constraintLayoutInflate5, 2131431115);
                if (textView8 != null) {
                    TextView textView9 = (TextView) m5n1.t(constraintLayoutInflate5, 2131431356);
                    if (textView9 != null) {
                        ij90 ij90Var = new ij90(constraintLayout6, textView8, textView9);
                        eqq.t(-1, -1, constraintLayout6);
                        this.c = ij90Var;
                        this.d = constraintLayout6;
                        return;
                    }
                    i = 2131431356;
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate5.getResources().getResourceName(i)));
                throw null;
            case 10:
                this.b = context;
                ConstraintLayout constraintLayoutInflate6 = LayoutInflater.from(context).inflate(2131625094, (ViewGroup) null, false);
                int i5 = 2131428103;
                ?? r3 = (IconX) m5n1.t(constraintLayoutInflate6, 2131428103);
                if (r3 != 0) {
                    i5 = 2131429971;
                    TextView textView10 = (TextView) m5n1.t(constraintLayoutInflate6, 2131429971);
                    if (textView10 != null) {
                        ConstraintLayout constraintLayout7 = constraintLayoutInflate6;
                        wb80 wb80Var = new wb80(constraintLayout7, (IconX) r3, textView10);
                        constraintLayout7.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                        r3.setOnClickListener(new c20(this, (byte) 28));
                        this.c = wb80Var;
                        this.d = nvr.d1;
                        return;
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate6.getResources().getResourceName(i5)));
                throw null;
            case 11:
                ConstraintLayout constraintLayoutInflate7 = LayoutInflater.from(context).inflate(2131625228, (ViewGroup) null, false);
                int i6 = 2131427455;
                ChipButtonView chipButtonViewT = m5n1.t(constraintLayoutInflate7, 2131427455);
                if (chipButtonViewT != null) {
                    i6 = 2131428438;
                    TextView textView11 = (TextView) m5n1.t(constraintLayoutInflate7, 2131428438);
                    if (textView11 != null) {
                        i6 = 2131428493;
                        SpotifyIconView spotifyIconViewT = m5n1.t(constraintLayoutInflate7, 2131428493);
                        if (spotifyIconViewT != null) {
                            ConstraintLayout constraintLayout8 = constraintLayoutInflate7;
                            TextView textView12 = (TextView) m5n1.t(constraintLayoutInflate7, 2131431356);
                            if (textView12 != null) {
                                w6e0 w6e0Var = new w6e0(constraintLayout8, chipButtonViewT, textView11, spotifyIconViewT, textView12, (byte) 25);
                                constraintLayout8.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                                this.b = w6e0Var;
                                this.c = spotifyIconViewT;
                                this.d = chipButtonViewT;
                                return;
                            }
                        } else {
                            i2 = i6;
                        }
                    } else {
                        i2 = i6;
                    }
                } else {
                    i2 = i6;
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate7.getResources().getResourceName(i2)));
                throw null;
            case 15:
                this.b = context;
                this.c = n621.b;
                AppCompatImageButton appCompatImageButton = new AppCompatImageButton(context);
                appCompatImageButton.setBackground(null);
                appCompatImageButton.setContentDescription(appCompatImageButton.getResources().getString(2131959237));
                appCompatImageButton.setScaleType(ImageView.ScaleType.CENTER_CROP);
                Context context2 = appCompatImageButton.getContext();
                g4b1 g4b1Var = new g4b1(context2, j4b1.Q7, too1.m(context2, 2131166774));
                g4b1Var.c(x74.E(context2, 2131100205));
                appCompatImageButton.setImageDrawable(g4b1Var);
                int iM = too1.m(appCompatImageButton.getContext(), 2131167033);
                appCompatImageButton.setPadding(iM, iM, iM, iM);
                this.d = appCompatImageButton;
                return;
            case 17:
                View viewInflate = LayoutInflater.from(context).inflate(2131625125, (ViewGroup) null, false);
                TabLayout tabLayoutT = m5n1.t(viewInflate, 2131431193);
                if (tabLayoutT == null) {
                    bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(2131431193)));
                    throw null;
                }
                this.b = new ye90((FrameLayout) viewInflate, tabLayoutT, (byte) 15);
                tts ttsVar = new tts();
                ttsVar.a = mls.W0;
                ttsVar.b = mls.X0;
                ttsVar.c = mls.V0;
                this.c = ttsVar;
                this.d = new eod1(z6x.a, god1.c, null);
                tabLayoutT.a(new pwd(this, context));
                tabLayoutT.a(ttsVar);
                return;
        }
    }

    public static final /* synthetic */ pes0 a(h98 h98Var) {
        return (pes0) h98Var.b;
    }

    public static TextView e(dhd1 dhd1Var) {
        return (TextView) z561.W(z561.T(ye3.e1, new i46(dhd1Var.e, (byte) 8)));
    }

    public void b() {
        fdc fdcVar = (fdc) ((o0g1) this.d).d;
        fdcVar.b = true;
        Iterator it = o7h.p1((tr80) fdcVar.f).iterator();
        while (it.hasNext()) {
            ((f0t) fdcVar.d).invoke(Integer.valueOf(((Number) it.next()).intValue()));
        }
    }

    public final void f(Object obj) {
        kky kkyVar;
        int i;
        byte b = this.a;
        int i2 = 2;
        int i3 = 8;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                nb8 nb8Var = (nb8) obj;
                lly llyVar = (lly) ((idd1) this.c).getValue();
                Context context = getView().getContext();
                idd1 idd1Var = (idd1) this.d;
                QuickActionView quickActionView = (QuickActionView) idd1Var.getValue();
                lky lkyVar = new lky(nb8Var.a, 14, false);
                String str = nb8Var.d;
                fky fkyVar = (str == null || ihc1.y0(str)) ? null : new fky(str, q9w.c1, 12);
                kky kkyVar2 = new kky(nb8Var.b);
                ujy ujyVar = new ujy(2);
                String str2 = nb8Var.e;
                if (str2 == null) {
                    str2 = "";
                }
                aky akyVar = new aky(new pjy(str2), ujyVar, (njy) null, (yjy) null, (rjy) null, 28);
                bky bkyVar = new bky(Collections.singletonList(nb8Var.c), (dky) null);
                wiy wiyVar = new wiy(Html.fromHtml(nb8Var.f, 0).toString());
                mky mkyVar = new mky(quickActionView);
                xj61 xj61Var = new xj61();
                int iOrdinal = nb8Var.h.ordinal();
                if (iOrdinal == 0) {
                    i2 = 1;
                } else if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        i2 = 3;
                    } else {
                        if (iOrdinal != 3) {
                            eg.o();
                            return;
                        }
                        i2 = 0;
                    }
                }
                if (i2 != 0) {
                    xj61Var.add(new uiy(i2));
                }
                if (nb8Var.g) {
                    kkyVar = kkyVar2;
                    EncoreIconView encoreIconView = new EncoreIconView(context, (AttributeSet) null, 0, 2131232678, 6, (DefaultConstructorMarker) null);
                    encoreIconView.setTag("STAR_RATING_BADGE");
                    xj61Var.add(new qiy(encoreIconView, 1, "STAR_RATING_BADGE"));
                } else {
                    kkyVar = kkyVar2;
                }
                llyVar.a(new cky(lkyVar, akyVar, fkyVar, kkyVar, mkyVar, wiyVar, bkyVar, new piy(cwl1.j(xj61Var)), (cjy) null, 15680));
                ((QuickActionView) idd1Var.getValue()).a(new qez0(nb8Var.i));
                return;
            case 1:
                a63 a63Var = (a63) obj;
                u961 u961Var = (u961) this.d;
                List list = a63Var.b;
                String str3 = a63Var.a;
                String str4 = a63Var.h;
                d520 d520Var = (d520) obj2;
                ((ArtworkView) d520Var.b).h(new d17(new g07(a63Var.c), j4b1.O0));
                zhm0.b((View) d520Var.f, a63Var.d);
                zwg zwgVar = (zwg) this.c;
                ((HeartButton) zwgVar.d).setVisibility(8);
                AddToButtonView addToButtonView = (AddToButtonView) zwgVar.a;
                addToButtonView.setVisibility(0);
                addToButtonView.a(new pk1(a63Var.f ? qk1.b : qk1.a, false, (String) null, (String) null, (j7p1) null, 30));
                ((PlayButtonView) zwgVar.e).B(new cet0(a63Var.g, new vft0(false), (String) null, 4));
                ((TextView) zwgVar.c).setText(a63Var.e);
                ArtworkView artworkView = (ArtworkView) u961Var.a;
                TextView textView = (TextView) u961Var.b;
                artworkView.setVisibility(8);
                TextView textView2 = (TextView) u961Var.c;
                TextView textView3 = (TextView) u961Var.d;
                textView.setVisibility(str4.length() > 0 ? 0 : 8);
                textView.setText(str4);
                textView3.setVisibility(str3.length() > 0 ? 0 : 8);
                textView3.setText(str3);
                textView2.setText(o7h.y0(list, ", ", (String) null, (String) null, (iu30) null, 62));
                textView2.setVisibility(list.isEmpty() ? 8 : 0);
                return;
            case 2:
                ((TextView) ((i3b) this.c).b).setText(((Context) obj2).getString(2131953970, ((a1h) obj).a));
                return;
            case 3:
                ffo ffoVar = (ffo) obj;
                rjn rjnVar = (rjn) this.c;
                CountDownTimer countDownTimer = (CountDownTimer) rjnVar.b;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                rjnVar.b = null;
                long j = ffoVar.a;
                if (j <= 0) {
                    ((r4u) ((jnq) obj2).d).e(kan.a);
                    return;
                }
                her herVar = new her((Object) this, (byte) 5);
                rjnVar.b = null;
                rjnVar.b = new krr(j - new Date().getTime(), herVar).start();
                return;
            case 4:
                ((ViewGroup) obj2).setBackgroundColor(0);
                ((bpb1) this.c).m((Object) null, (kvt) obj);
                return;
            case 5:
                i9x i9xVar = (i9x) obj;
                Context context2 = (Context) obj2;
                String str5 = i9xVar.a;
                int length = str5.length();
                f9e1 f9e1Var = (f9e1) this.c;
                TextView textView4 = f9e1Var.a;
                TextView textView5 = f9e1Var.b;
                if (length != 0) {
                    textView5.setText(context2.getString(2131952516, str5));
                    textView4.setText(context2.getString(2131952515));
                    return;
                }
                textView5.setText(context2.getString(2131952517));
                int iC = l1d.C(i9xVar.b);
                if (iC == 0) {
                    i = 2131952514;
                } else {
                    if (iC != 1) {
                        eg.o();
                        return;
                    }
                    i = 2131952513;
                }
                textView4.setText(context2.getString(i));
                return;
            case 6:
                raz razVar = (raz) obj;
                yjq yjqVar = (yjq) this.d;
                ((TextView) yjqVar.f).setText(razVar.b);
                ((TextView) yjqVar.e).setText(razVar.c);
                ((ContentRestrictionBadgeView) yjqVar.b).c(razVar.d);
                CheckBox checkBox = (CheckBox) yjqVar.d;
                boolean z = razVar.e;
                checkBox.setChecked(z);
                checkBox.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, z ? (Drawable) ((idd1) obj2).getValue() : (Drawable) ((idd1) this.c).getValue(), (Drawable) null);
                return;
            case 7:
                u((fgz) obj);
                return;
            case 8:
                Context context3 = (Context) obj2;
                boolean z2 = ((fkz) obj).a;
                ij90 ij90Var = (ij90) this.c;
                TextView textView6 = ij90Var.a;
                TextView textView7 = ij90Var.b;
                if (z2) {
                    textView7.setText(context3.getString(2131952522));
                    textView6.setText(context3.getString(2131952521));
                    return;
                } else {
                    textView7.setText(context3.getString(2131952520));
                    textView6.setText(context3.getString(2131952519));
                    return;
                }
            case 9:
                ij40 ij40Var = (ij40) obj;
                CharSequence charSequence = ij40Var.b;
                ks6 ks6Var = (ks6) this.d;
                TextView textView8 = (TextView) ks6Var.R0;
                TextView textView9 = (TextView) ks6Var.Q0;
                List list2 = ij40Var.d;
                textView8.setText(!list2.isEmpty() ? ((oq51) this.c).a(list2, true, (ai4) obj2) : ij40Var.a);
                if (charSequence != null && charSequence.length() != 0) {
                    i3 = 0;
                }
                textView9.setVisibility(i3);
                if (charSequence != null && charSequence.length() != 0) {
                    textView9.setText(charSequence);
                    textView9.setTextColor(xfo1.r((ConstraintLayout) ks6Var.a, ij40Var.e ? 2130968788 : 2130968791));
                }
                ((ArtworkView) ks6Var.d).h(new q07(new g07(ij40Var.c, yz6.d)));
                return;
            case 10:
                Context context4 = (Context) obj2;
                wb80 wb80Var = (wb80) this.c;
                String string = context4.getString(t2s.a[l1d.C(((vb80) obj).a)] == 1 ? 2131962591 : 2131962590, "^");
                TextView textView10 = wb80Var.b;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int iV0 = ihc1.v0(string, '^', 0, 6);
                spannableStringBuilder.setSpan(new u1v0(context4, xfo1.r(textView10, 2130968787), (int) textView10.getTextSize()), iV0, iV0 + 1, 33);
                textView10.setText(spannableStringBuilder);
                return;
            case 11:
                sxi0 sxi0Var = (sxi0) obj;
                ChipButtonView chipButtonView = (ChipButtonView) this.d;
                String str6 = sxi0Var.c;
                w6e0 w6e0Var = (w6e0) obj2;
                ((TextView) w6e0Var.c).setText(sxi0Var.a);
                ((TextView) w6e0Var.b).setText(sxi0Var.b);
                ((SpotifyIconView) w6e0Var.e).setVisibility(sxi0Var.d ? 0 : 8);
                if (str6 == null || str6.length() == 0) {
                    chipButtonView.setVisibility(8);
                    return;
                } else {
                    chipButtonView.setVisibility(0);
                    chipButtonView.setText(str6);
                    return;
                }
            case 12:
                paq0 paq0Var = (paq0) obj;
                this.d = paq0Var;
                pbq pbqVar = (pbq) obj2;
                TextView textView11 = (TextView) pbqVar.e;
                EncoreButton encoreButton = (EncoreButton) pbqVar.X;
                TextView textView12 = (TextView) pbqVar.d;
                TextView textView13 = (TextView) pbqVar.c;
                textView11.setText(paq0Var.getTitle());
                ((TextView) pbqVar.b).setText(paq0Var.getArtist());
                if (paq0Var instanceof kaq0) {
                    kaq0 kaq0Var = (kaq0) paq0Var;
                    ((EncoreButton) pbqVar.i).setText(kaq0Var.d());
                    b8k1.m((RoundedConstraintLayout) pbqVar.f, fg.g, kaq0Var.d(), (sh) null);
                }
                ((ArtworkView) pbqVar.g).h(new m07(new g07(paq0Var.getArtwork())));
                if (paq0Var instanceof naq0) {
                    naq0 naq0Var = (naq0) paq0Var;
                    textView13.setText(naq0Var.f);
                    textView12.setText(naq0Var.e);
                    encoreButton.setVisibility(8);
                    x(naq0Var.h);
                    return;
                }
                if (paq0Var instanceof oaq0) {
                    oaq0 oaq0Var = (oaq0) paq0Var;
                    textView13.setText(oaq0Var.f);
                    textView12.setText(oaq0Var.e);
                    encoreButton.setText(oaq0Var.g);
                    encoreButton.setVisibility(0);
                    x(oaq0Var.i);
                    return;
                }
                if (paq0Var instanceof laq0) {
                    kaq0 kaq0Var2 = (kaq0) paq0Var;
                    ((TextView) pbqVar.c).setText(kaq0Var2.a());
                    ((TextView) pbqVar.d).setText(kaq0Var2.c());
                    ((EncoreButton) pbqVar.X).setVisibility(8);
                    return;
                }
                if (!(paq0Var instanceof maq0)) {
                    eg.o();
                    return;
                }
                kaq0 kaq0Var3 = (kaq0) paq0Var;
                ((TextView) pbqVar.c).setText(kaq0Var3.a());
                ((TextView) pbqVar.d).setText(kaq0Var3.c());
                ((EncoreButton) pbqVar.X).setVisibility(8);
                return;
            case 13:
                dns0 dns0Var = (dns0) obj;
                tzr0 tzr0Var = (tzr0) this.d;
                ((TextView) tzr0Var.e).setText(dns0Var.a);
                ((TextView) tzr0Var.c).setText(dns0Var.b);
                ((EncoreButton) tzr0Var.d).setText(dns0Var.c);
                ((CardView) tzr0Var.b).setVisibility(0);
                return;
            case 14:
                ndx0 ndx0Var = (ndx0) obj;
                String str7 = ndx0Var.a;
                String str8 = ndx0Var.b;
                phi0 phi0Var = (phi0) this.d;
                TextView textView14 = (TextView) phi0Var.e;
                TextView textView15 = (TextView) phi0Var.d;
                List list3 = ndx0Var.e;
                textView14.setText(!list3.isEmpty() ? ((oq51) this.c).a(list3, true, (ai4) obj2) : str7);
                textView15.setVisibility((str8 == null || str8.length() == 0) ? 8 : 0);
                if (str8 != null && str8.length() != 0) {
                    textView15.setText(str8);
                }
                ((ImageView) phi0Var.f).setVisibility(ndx0Var.d ? 0 : 8);
                ((ArtworkView) phi0Var.c).h(new l17(str7, new g07(ndx0Var.c, xz6.d)));
                return;
            case 15:
                q621 q621Var = (q621) obj;
                boolean z3 = q621Var.c;
                boolean z4 = q621Var.d;
                AppCompatImageButton appCompatImageButton = (AppCompatImageButton) this.d;
                if (!q621Var.e && !q621Var.f) {
                    i3 = 0;
                }
                appCompatImageButton.setVisibility(i3);
                appCompatImageButton.setEnabled(z4 || q621Var.b);
                appCompatImageButton.setActivated(!z4 && z3);
                mmr0 mmr0Var = z4 ? new mmr0(2131959245, n621.a) : z3 ? new mmr0(2131959263, n621.c) : new mmr0(2131959237, n621.b);
                int iIntValue = ((Number) mmr0Var.a).intValue();
                n621 n621Var = (n621) mmr0Var.b;
                appCompatImageButton.setContentDescription(((Context) obj2).getResources().getString(iIntValue));
                this.c = n621Var;
                return;
            case 16:
                v((t0d1) obj);
                return;
            case 17:
                eod1 eod1Var = (eod1) obj;
                tts ttsVar = (tts) this.c;
                ye90 ye90Var = (ye90) obj2;
                Integer num = eod1Var.c;
                dzo1 dzo1Var = eod1Var.b;
                eod1 eod1Var2 = (eod1) this.d;
                List list4 = eod1Var2.a;
                List list5 = eod1Var.a;
                if (list4.equals(list5) && u890.j(eod1Var2.b, dzo1Var)) {
                    if (num != null) {
                        int iIntValue2 = num.intValue();
                        TabLayout tabLayout = (TabLayout) ye90Var.c;
                        tabLayout.j(tabLayout.g(iIntValue2), true);
                        return;
                    }
                    return;
                }
                this.d = eod1Var;
                TabLayout tabLayout2 = (TabLayout) ye90Var.c;
                tabLayout2.setOverScrollMode(2);
                tabLayout2.i();
                tabLayout2.j1.remove(ttsVar);
                List<hod1> list6 = list5;
                ArrayList arrayList = new ArrayList(q7h.U(list6, 10));
                for (hod1 hod1Var : list6) {
                    dhd1 dhd1VarH = tabLayout2.h();
                    dhd1VarH.a(hod1Var.a);
                    TextView textViewE = e(dhd1VarH);
                    if (textViewE != null) {
                        textViewE.setTag("pepartab");
                    }
                    arrayList.add(dhd1VarH);
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    tabLayout2.b((dhd1) it.next(), tabLayout2.a.isEmpty());
                }
                if (!list5.isEmpty()) {
                    ViewGroup viewGroup = (ViewGroup) tabLayout2.getChildAt(0);
                    int dimensionPixelOffset = tabLayout2.getResources().getDimensionPixelOffset(2131165911);
                    int tabCount = tabLayout2.getTabCount() - 1;
                    for (int i4 = 0; i4 < tabCount; i4++) {
                        View childAt = viewGroup.getChildAt(i4);
                        childAt.getClass();
                        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                        if (layoutParams == null) {
                            bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            return;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMargins(0, marginLayoutParams.topMargin, dimensionPixelOffset, marginLayoutParams.bottomMargin);
                        childAt.setLayoutParams(marginLayoutParams);
                    }
                }
                if (!u890.j(dzo1Var, god1.c)) {
                    if (!u890.j(dzo1Var, god1.d)) {
                        eg.o();
                        return;
                    }
                    i2 = 0;
                }
                tabLayout2.setTabMode(i2);
                tabLayout2.a(ttsVar);
                if (num != null) {
                    tabLayout2.j(tabLayout2.g(num.intValue()), true);
                }
                tabLayout2.setTabIndicatorFullWidth(false);
                return;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                h0z h0zVar = (h0z) this.c;
                pes0 pes0Var = (pes0) obj2;
                if (pes0Var.b.getAdapter() == null) {
                    pes0Var.b.setAdapter(h0zVar);
                }
                h0zVar.C((List) null);
                return;
            default:
                pze0.m(obj);
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                viewGroup2.setBackgroundColor(0);
                viewGroup2.getContext();
                throw null;
        }
    }

    public final View getView() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (View) ((idd1) obj).getValue();
            case 1:
                return (ConstraintLayout) ((d520) obj).g;
            case 2:
                return (ConstraintLayout) this.d;
            case 3:
                return (ConstraintLayout) this.d;
            case 4:
                ComposeView composeView = new ComposeView(((ViewGroup) obj).getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                composeView.setContent(new j2i(134244437, new i4o(this, (byte) 12), true));
                return composeView;
            case 5:
                return (ConstraintLayout) this.d;
            case 6:
                return (ConstraintLayout) ((yjq) this.d).c;
            case 7:
                return (ConstraintLayout) ((tjq) this.c).b;
            case 8:
                return (ConstraintLayout) this.d;
            case 9:
                return (ConstraintLayout) ((ks6) this.d).a;
            case 10:
                return ((wb80) this.c).a;
            case 11:
                return (ConstraintLayout) ((w6e0) obj).d;
            case 12:
                return (RoundedConstraintLayout) this.c;
            case 13:
                return (CardView) ((tzr0) this.d).b;
            case 14:
                return (ConstraintLayout) ((phi0) this.d).b;
            case 15:
                return (AppCompatImageButton) this.d;
            case 16:
                return ((lly) this.d).c;
            case 17:
                return (FrameLayout) ((ye90) obj).b;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return ((pes0) obj).a;
            default:
                return (ConstraintLayout) ((sp00) this.c).b;
        }
    }

    public void k() {
        fdc fdcVar = (fdc) ((o0g1) this.d).d;
        fdcVar.b = false;
        Iterator it = o7h.p1((tr80) fdcVar.f).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            z511 adapter = ((RecyclerView) fdcVar.c).getAdapter();
            if (iIntValue < (adapter != null ? adapter.e() : 0)) {
                ((f0t) fdcVar.e).invoke(Integer.valueOf(iIntValue));
            }
        }
    }

    public final void n(iu30 iu30Var) {
        byte b = this.a;
        Object obj = this.b;
        byte b2 = 6;
        byte b3 = 2;
        switch (b) {
            case 0:
                ((lly) ((idd1) this.c).getValue()).n(new ib2(iu30Var, (byte) 19));
                ((QuickActionView) ((idd1) this.d).getValue()).a = new ib2(iu30Var, (byte) 20);
                break;
            case 1:
                ConstraintLayout constraintLayout = (ConstraintLayout) ((d520) obj).g;
                constraintLayout.setOnClickListener(new v20(iu30Var, (byte) 28));
                constraintLayout.setOnLongClickListener(new wer(iu30Var, (byte) 0));
                zwg zwgVar = (zwg) this.c;
                ((AddToButtonView) zwgVar.a).n(new m0o(iu30Var, (byte) 3));
                ((PlayButtonView) zwgVar.e).n(new m0o(iu30Var, (byte) 4));
                ((ContextMenuButton) zwgVar.b).n(new m0o(iu30Var, (byte) 5));
                break;
            case 2:
            case 3:
                break;
            case 4:
                ((bpb1) this.d).m((Object) null, iu30Var);
                break;
            case 5:
                break;
            case 6:
                ((ConstraintLayout) ((yjq) this.d).c).setOnClickListener(new trr(iu30Var, (byte) 16));
                break;
            case 7:
                ((SecondaryButtonView) ((tjq) this.c).c).setOnClickListener(new cvr(iu30Var, this, b3));
                break;
            case 8:
                break;
            case 9:
                ((ConstraintLayout) ((ks6) this.d).a).setOnClickListener(new trr(iu30Var, (byte) 28));
                break;
            case 10:
                this.d = iu30Var;
                break;
            case 11:
                ((SpotifyIconView) this.c).setOnClickListener(new o0s(iu30Var, (byte) 12));
                ((ChipButtonView) this.d).setOnClickListener(new o0s(iu30Var, (byte) 13));
                break;
            case 12:
                pbq pbqVar = (pbq) obj;
                ((EncoreButton) pbqVar.i).setOnClickListener(new ids((byte) 0, this, iu30Var));
                ((EncoreButton) pbqVar.X).setOnClickListener(new ids((byte) 1, this, iu30Var));
                ((EncoreButton) pbqVar.t).setOnClickListener(new ids((byte) 2, this, iu30Var));
                ((RoundedConstraintLayout) this.c).setOnClickListener(new ids((byte) 3, this, iu30Var));
                break;
            case 13:
                ((EncoreButton) ((tzr0) this.d).d).setOnClickListener(new cvr(iu30Var, this, b2));
                break;
            case 14:
                ((ConstraintLayout) ((phi0) this.d).b).setOnClickListener(new sis(iu30Var, (byte) 6));
                break;
            case 15:
                ((AppCompatImageButton) this.d).setOnClickListener(new cvr((Object) iu30Var, (Object) this, (byte) 14));
                break;
            case 16:
                ((lly) this.d).c.setOnClickListener(new aqs(iu30Var, (byte) 3));
                break;
            case 17:
                tts ttsVar = (tts) this.c;
                uts utsVar = new uts((byte) 0, this, iu30Var);
                uts utsVar2 = new uts((byte) 1, this, iu30Var);
                uts utsVar3 = new uts((byte) 2, this, iu30Var);
                ttsVar.a = utsVar;
                ttsVar.b = utsVar2;
                ttsVar.c = utsVar3;
                break;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                ((h0z) this.c).t = new hws(iu30Var, (byte) 3);
                break;
            default:
                sp00 sp00Var = (sp00) this.c;
                ((PrimaryButtonView) sp00Var.c).setOnClickListener(new aqs(iu30Var, (byte) 26));
                ((EncoreButton) sp00Var.d).setOnClickListener(new aqs(iu30Var, (byte) 27));
                break;
        }
    }

    public void u(fgz fgzVar) {
        String string;
        dgz dgzVar;
        tjq tjqVar = (tjq) this.c;
        TextView textView = (TextView) tjqVar.d;
        TextView textView2 = (TextView) tjqVar.e;
        this.d = fgzVar;
        ggz ggzVar = fgzVar.a;
        if (ggzVar == ggz.g && (dgzVar = fgzVar.b) != null) {
            textView2.setText(dgzVar.a);
            textView.setText(dgzVar.b);
            w(dgzVar.d ? 2131231800 : null);
            cgz cgzVar = dgzVar.c;
            string = cgzVar != null ? cgzVar.a : null;
            SecondaryButtonView secondaryButtonView = (SecondaryButtonView) tjqVar.c;
            if (string == null) {
                secondaryButtonView.setVisibility(8);
                return;
            } else {
                secondaryButtonView.setText(string);
                secondaryButtonView.setVisibility(0);
                return;
            }
        }
        Context context = (Context) this.b;
        lx21 lx21Var = (lx21) zxr.a.get(ggzVar);
        if (lx21Var != null) {
            textView2.setText(context.getString(lx21Var.b));
            textView2.setTextAppearance(lx21Var.e);
            textView.setText(context.getString(lx21Var.c));
            w(lx21Var.a);
            Integer num = lx21Var.d;
            string = num != null ? context.getString(num.intValue()) : null;
            SecondaryButtonView secondaryButtonView2 = (SecondaryButtonView) tjqVar.c;
            if (string == null) {
                secondaryButtonView2.setVisibility(8);
            } else {
                secondaryButtonView2.setText(string);
                secondaryButtonView2.setVisibility(0);
            }
        }
    }

    public void v(t0d1 t0d1Var) {
        int i;
        String string;
        lly llyVar = (lly) this.d;
        Resources resources = ((Context) this.c).getResources();
        uaa uaaVar = (bl70) ((idd1) this.b).getValue();
        int i2 = t0d1Var.b;
        if (i2 < 0) {
            k220.i("Negative file sizes are not supported");
            return;
        }
        double d = i2;
        int i3 = 0;
        while (d >= 1024.0d) {
            d /= 1024.0d;
            i3++;
        }
        double dDoubleValue = new BigDecimal(String.valueOf(d)).setScale(2, RoundingMode.HALF_UP).doubleValue();
        if (i3 == 0) {
            i = 2131953083;
        } else if (i3 == 1) {
            i = 2131953085;
        } else if (i3 == 2) {
            i = 2131953086;
        } else {
            if (i3 != 3) {
                k220.i("Only filesizes from zero byte to one gigabyte are supported");
                return;
            }
            i = 2131953084;
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.getDefault());
        if (dDoubleValue % 1.0d == 0.0d) {
            string = resources.getString(i, Integer.valueOf((int) dDoubleValue));
            string.getClass();
        } else {
            string = resources.getString(i, numberInstance.format(dDoubleValue));
            string.getClass();
        }
        cky ckyVar = new cky(new lky(t0d1Var.a, 14, false), t0d1Var.e ? new aky((String) null, (ujy) null, new njy(2131231765), (sjy) null, 26) : null, (fky) null, new kky(string), new mky(uaaVar), (wiy) null, (bky) null, t0d1Var.d ? new piy(Collections.singleton(new uiy(2))) : null, (cjy) null, 15844);
        llyVar.getClass();
        llyVar.a(ckyVar);
    }

    public void w(Integer num) {
        EncoreIconView encoreIconView = (EncoreIconView) ((tjq) this.c).a;
        if (num == null) {
            encoreIconView.setVisibility(8);
        } else {
            encoreIconView.setImageDrawable(((Context) this.b).getDrawable(num.intValue()));
            encoreIconView.setVisibility(0);
        }
    }

    public void x(Boolean bool) {
        pbq pbqVar = (pbq) this.b;
        ((EncoreButton) pbqVar.i).setVisibility(8);
        EncoreButton encoreButton = (EncoreButton) pbqVar.t;
        encoreButton.setVisibility(bool != null ? 0 : 8);
        if (bool != null) {
            encoreButton.setChecked(bool.booleanValue());
            encoreButton.setText(bool.booleanValue() ? encoreButton.getContext().getString(2131955780) : encoreButton.getContext().getString(2131955779));
        }
    }

    private final void l(iu30 iu30Var) {
    }

    private final void r(iu30 iu30Var) {
    }

    private final void s(iu30 iu30Var) {
    }

    private final void t(iu30 iu30Var) {
    }

    public h98(ViewGroup viewGroup) {
        this.a = (byte) 4;
        this.b = viewGroup;
        this.c = gio1.b((Object) null);
        this.d = gio1.b((Object) null);
    }

    public h98(Context context, lcs lcsVar) {
        this.a = (byte) 13;
        this.b = context;
        this.c = lcsVar;
        CardView cardViewInflate = LayoutInflater.from(context).inflate(2131625372, (ViewGroup) null, false);
        int i = 2131427761;
        if (((Space) m5n1.t(cardViewInflate, 2131427761)) != null) {
            CardView cardView = cardViewInflate;
            i = 2131430327;
            TextView textView = (TextView) m5n1.t(cardViewInflate, 2131430327);
            if (textView != null) {
                i = 2131430328;
                EncoreButton encoreButtonT = m5n1.t(cardViewInflate, 2131430328);
                if (encoreButtonT != null) {
                    i = 2131430329;
                    if (m5n1.t(cardViewInflate, 2131430329) != null) {
                        i = 2131430331;
                        TextView textView2 = (TextView) m5n1.t(cardViewInflate, 2131430331);
                        if (textView2 != null) {
                            tzr0 tzr0Var = new tzr0(cardView, textView, encoreButtonT, textView2, (byte) 4);
                            cardView.setLayoutParams(new qhl(-1, -2));
                            this.d = tzr0Var;
                            return;
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(cardViewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public h98(Context context, egx egxVar, y9p y9pVar, kly0 kly0Var, i3b i3bVar) {
        o0g1 o0g1Var;
        this.a = (byte) 18;
        RecyclerView recyclerViewInflate = LayoutInflater.from(context).inflate(2131626337, (ViewGroup) null, false);
        if (recyclerViewInflate != null) {
            RecyclerView recyclerView = recyclerViewInflate;
            this.b = new pes0(recyclerView, recyclerView);
            recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            f0t f0tVar = new f0t(this, (byte) 0);
            f0t f0tVar2 = new f0t(this, (byte) 1);
            switch (y9pVar.a) {
                case 0:
                    o0g1Var = new o0g1(recyclerView, f0tVar, f0tVar2);
                    break;
                default:
                    o0g1Var = new o0g1(recyclerView, f0tVar, f0tVar2);
                    break;
            }
            o0g1 o0g1Var2 = o0g1Var;
            this.d = o0g1Var2;
            RecyclerView recyclerView2 = (RecyclerView) o0g1Var2.c;
            recyclerView2.j(new j1e(o0g1Var2.b, (byte) 5));
            recyclerView2.m(new zl7(o0g1Var2, (byte) 26));
            this.c = new h0z(o0g1Var2, egxVar, kly0Var, i3bVar, new d4e(this, (byte) 19));
            recyclerView.setLayoutManager(new LinearLayoutManager(0));
            recyclerView.setNestedScrollingEnabled(false);
            return;
        }
        bhn0.i("rootView");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0107 A[PHI: r2
      0x0107: PHI (r2v22 int) = (r2v21 int), (r2v23 int), (r2v24 int), (r2v25 int), (r2v26 int), (r2v27 int), (r2v28 int), (r2v29 int), (r2v30 int) binds: [B:9:0x0078, B:11:0x0084, B:13:0x008f, B:15:0x009b, B:17:0x00a8, B:19:0x00b5, B:21:0x00c2, B:23:0x00cf, B:25:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0211 A[PHI: r2
      0x0211: PHI (r2v14 int) = (r2v13 int), (r2v15 int), (r2v16 int) binds: [B:46:0x01a8, B:48:0x01b5, B:50:0x01c2] A[DONT_GENERATE, DONT_INLINE]] */
    public h98(Context context, gw70 gw70Var, byte b) {
        int i;
        this.a = b;
        int i2 = 2131431356;
        byte b2 = 0;
        switch (b) {
            case 1:
                d520 d520VarR = d520.R(LayoutInflater.from(context));
                ConstraintLayout constraintLayout = (ConstraintLayout) d520VarR.e;
                this.b = d520VarR;
                ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131623977, (ViewGroup) null, false);
                int i3 = 2131427521;
                AddToButtonView addToButtonViewT = m5n1.t(constraintLayoutInflate, 2131427521);
                if (addToButtonViewT != null) {
                    ConstraintLayout constraintLayout2 = constraintLayoutInflate;
                    i3 = 2131428234;
                    ContextMenuButton contextMenuButtonT = m5n1.t(constraintLayoutInflate, 2131428234);
                    if (contextMenuButtonT != null) {
                        i3 = 2131428536;
                        TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131428536);
                        if (textView != null) {
                            HeartButton heartButtonT = m5n1.t(constraintLayoutInflate, 2131429106);
                            if (heartButtonT == null) {
                                i3 = 2131429106;
                            } else if (m5n1.t(constraintLayoutInflate, 2131429979) != null) {
                                PlayButtonView playButtonViewT = m5n1.t(constraintLayoutInflate, 2131430400);
                                if (playButtonViewT != null) {
                                    zwg zwgVar = new zwg();
                                    zwgVar.a = addToButtonViewT;
                                    zwgVar.b = contextMenuButtonT;
                                    zwgVar.c = textView;
                                    zwgVar.d = heartButtonT;
                                    zwgVar.e = playButtonViewT;
                                    eqq.t(-1, -2, constraintLayout2);
                                    this.c = zwgVar;
                                    View viewInflate = LayoutInflater.from(context).inflate(2131623980, (ViewGroup) null, false);
                                    int i4 = 2131427595;
                                    ArtworkView artworkViewT = m5n1.t(viewInflate, 2131427595);
                                    if (artworkViewT != null) {
                                        i4 = 2131428229;
                                        TextView textView2 = (TextView) m5n1.t(viewInflate, 2131428229);
                                        if (textView2 != null) {
                                            i4 = 2131431115;
                                            TextView textView3 = (TextView) m5n1.t(viewInflate, 2131431115);
                                            if (textView3 != null) {
                                                TextView textView4 = (TextView) m5n1.t(viewInflate, 2131431356);
                                                if (textView4 != null) {
                                                    LinearLayout linearLayout = (LinearLayout) viewInflate;
                                                    this.d = new u961(linearLayout, artworkViewT, textView2, textView3, textView4);
                                                    zhm0.d((ConstraintLayout) d520VarR.g, new ArtworkView[]{(ArtworkView) d520VarR.b}, (ConstraintLayout) null, (ArtworkShadow) d520VarR.d, gw70Var, new TextView[]{textView4, textView3});
                                                    constraintLayout.removeAllViews();
                                                    constraintLayout.addView(constraintLayout2);
                                                    ((FrameLayout) d520VarR.h).addView(linearLayout);
                                                    return;
                                                }
                                                i = 2131431356;
                                            } else {
                                                i = i4;
                                            }
                                        } else {
                                            i = i4;
                                        }
                                    } else {
                                        i = i4;
                                    }
                                    bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
                                    throw null;
                                }
                                i3 = 2131430400;
                            } else {
                                i3 = 2131429979;
                            }
                        }
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i3)));
                throw null;
            case 12:
                RoundedConstraintLayout roundedConstraintLayoutInflate = LayoutInflater.from(context).inflate(2131625343, (ViewGroup) null, false);
                int i5 = 2131427594;
                TextView textView5 = (TextView) m5n1.t(roundedConstraintLayoutInflate, 2131427594);
                if (textView5 != null) {
                    i5 = 2131427611;
                    ArtworkView artworkViewT2 = m5n1.t(roundedConstraintLayoutInflate, 2131427611);
                    if (artworkViewT2 != null) {
                        i5 = 2131427851;
                        if (m5n1.t(roundedConstraintLayoutInflate, 2131427851) != null) {
                            RoundedConstraintLayout roundedConstraintLayout = roundedConstraintLayoutInflate;
                            i5 = 2131428215;
                            View viewT = m5n1.t(roundedConstraintLayoutInflate, 2131428215);
                            if (viewT != null) {
                                i5 = 2131428889;
                                EncoreButton encoreButtonT = m5n1.t(roundedConstraintLayoutInflate, 2131428889);
                                if (encoreButtonT != null) {
                                    i5 = 2131430735;
                                    EncoreButton encoreButtonT2 = m5n1.t(roundedConstraintLayoutInflate, 2131430735);
                                    if (encoreButtonT2 != null) {
                                        i5 = 2131430896;
                                        EncoreButton encoreButtonT3 = m5n1.t(roundedConstraintLayoutInflate, 2131430896);
                                        if (encoreButtonT3 != null) {
                                            i5 = 2131431118;
                                            TextView textView6 = (TextView) m5n1.t(roundedConstraintLayoutInflate, 2131431118);
                                            if (textView6 != null) {
                                                i5 = 2131431119;
                                                TextView textView7 = (TextView) m5n1.t(roundedConstraintLayoutInflate, 2131431119);
                                                if (textView7 != null) {
                                                    TextView textView8 = (TextView) m5n1.t(roundedConstraintLayoutInflate, 2131431356);
                                                    if (textView8 != null) {
                                                        this.b = new pbq(roundedConstraintLayout, textView5, artworkViewT2, viewT, encoreButtonT, encoreButtonT2, encoreButtonT3, textView6, textView7, textView8, (byte) 22);
                                                        artworkViewT2.setViewContext(new f47(gw70Var));
                                                        b8k1.q(roundedConstraintLayout, true);
                                                        roundedConstraintLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                                                        this.c = roundedConstraintLayout;
                                                        return;
                                                    }
                                                } else {
                                                    i2 = i5;
                                                }
                                            } else {
                                                i2 = i5;
                                            }
                                        } else {
                                            i2 = i5;
                                        }
                                    } else {
                                        i2 = i5;
                                    }
                                } else {
                                    i2 = i5;
                                }
                            } else {
                                i2 = i5;
                            }
                        } else {
                            i2 = i5;
                        }
                    } else {
                        i2 = i5;
                    }
                } else {
                    i2 = i5;
                }
                bhn0.i("Missing required view with ID: ".concat(roundedConstraintLayoutInflate.getResources().getResourceName(i2)));
                throw null;
            case 16:
                this.c = context;
                this.d = new lly(context, gw70Var, 0, false, false, false, 60);
                this.b = new idd1(new ots(this, b2));
                return;
            default:
                this.b = new idd1(new i26(this, (byte) 21));
                this.c = new idd1(new f98(context, gw70Var, (byte) 0));
                this.d = new idd1(new f98(context, gw70Var, (byte) 1));
                return;
        }
    }

    public h98(Context context, gw70 gw70Var, ai4 ai4Var, byte b) {
        this.a = b;
        switch (b) {
            case 14:
                this.b = ai4Var;
                this.c = new oq51(context);
                ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131625462, (ViewGroup) null, false);
                int i = 2131427611;
                View view = (ArtworkView) m5n1.t(constraintLayoutInflate, 2131427611);
                if (view != null) {
                    i = 2131427741;
                    if (m5n1.t(constraintLayoutInflate, 2131427741) != null) {
                        ConstraintLayout constraintLayout = constraintLayoutInflate;
                        i = 2131431115;
                        TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131431115);
                        if (textView != null) {
                            i = 2131431356;
                            TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                            if (textView2 != null) {
                                i = 2131431572;
                                ImageView imageView = (ImageView) m5n1.t(constraintLayoutInflate, 2131431572);
                                if (imageView != null) {
                                    phi0 phi0Var = new phi0(constraintLayout, view, textView, textView2, imageView, (byte) 23);
                                    constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                    view.setViewContext(new f47(gw70Var));
                                    v9w0 v9w0VarQ = b2u.q(constraintLayout);
                                    Collections.addAll(v9w0VarQ.c, textView2, textView);
                                    Collections.addAll(v9w0VarQ.d, view);
                                    v9w0VarQ.e = false;
                                    v9w0VarQ.a();
                                    this.d = phi0Var;
                                    return;
                                }
                            }
                        }
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
                throw null;
            default:
                this.b = ai4Var;
                this.c = new oq51(context);
                ks6 ks6VarG = ks6.g(LayoutInflater.from(context));
                w2g0.q(ks6VarG, gw70Var);
                this.d = ks6VarG;
                return;
        }
    }

    public h98(LayoutInflater layoutInflater, ViewGroup viewGroup, gw70 gw70Var) {
        this.a = (byte) 19;
        this.b = viewGroup;
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131624715, viewGroup, false);
        int i = 2131431047;
        if (((ImageView) m5n1.t(constraintLayoutInflate, 2131431047)) != null) {
            i = 2131431672;
            PrimaryButtonView primaryButtonViewT = m5n1.t(constraintLayoutInflate, 2131431672);
            if (primaryButtonViewT != null) {
                i = 2131431673;
                if (((TextView) m5n1.t(constraintLayoutInflate, 2131431673)) != null) {
                    i = 2131431674;
                    EncoreButton encoreButtonT = m5n1.t(constraintLayoutInflate, 2131431674);
                    if (encoreButtonT != null) {
                        i = 2131431675;
                        ImageView imageView = (ImageView) m5n1.t(constraintLayoutInflate, 2131431675);
                        if (imageView != null) {
                            i = 2131431676;
                            if (((LinearLayout) m5n1.t(constraintLayoutInflate, 2131431676)) != null) {
                                i = 2131431677;
                                if (((TextView) m5n1.t(constraintLayoutInflate, 2131431677)) != null) {
                                    this.c = new sp00(constraintLayoutInflate, primaryButtonViewT, encoreButtonT, imageView, (byte) 22);
                                    this.d = new mjv(this, (byte) 20);
                                    return;
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
}
