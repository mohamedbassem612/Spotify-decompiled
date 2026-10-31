package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.backbutton.BackButtonView;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.encoreconsumermobile.elements.playbutton.PlayButtonView;
import com.spotify.encoreconsumermobile.elements.share.ShareButton;
import com.spotify.encoreconsumermobile.elements.smartshufflebutton.SmartShuffleButtonView;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.icons.IconCheckAltFill;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.PlayOrigin;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class as0 implements isw {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    /* JADX WARN: Type inference failed for: r10v5, types: [android.view.View, java.lang.Object, p.hc5] */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.view.View, java.lang.Object, p.la5] */
    public as0(Context context, iu30 iu30Var, byte b) {
        this.a = b;
        switch (b) {
            case 14:
                this.c = iu30Var;
                ShareButton shareButton = new ShareButton(new plm(context, 2132018933), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                shareButton.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                this.b = shareButton;
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ?? la5Var = new la5(context);
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166754);
                la5Var.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize, dimensionPixelSize));
                la5Var.n(new wck0(iu30Var, (byte) 13));
                this.b = la5Var;
                this.c = la5Var;
                break;
            case 23:
                this.c = iu30Var;
                int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2131167022);
                SmartShuffleButtonView smartShuffleButtonView = new SmartShuffleButtonView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                smartShuffleButtonView.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
                this.b = smartShuffleButtonView;
                break;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                this.c = context;
                ?? hc5Var = new hc5(context);
                int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(2131167033);
                hc5Var.setPadding(dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3);
                hc5Var.n(new et61(iu30Var, (byte) 13));
                this.b = hc5Var;
                break;
            default:
                this.b = iu30Var;
                ContextMenuButton contextMenuButtonInflate = LayoutInflater.from(context).inflate(2131624472, (ViewGroup) null);
                contextMenuButtonInflate.setLayoutParams(new ViewGroup.LayoutParams(contextMenuButtonInflate.getContext().getResources().getDimensionPixelSize(2131166109), contextMenuButtonInflate.getContext().getResources().getDimensionPixelSize(2131166109)));
                this.c = contextMenuButtonInflate;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r5v28, types: [android.view.View, android.widget.ImageView, androidx.appcompat.widget.AppCompatImageButton, p.hc5] */
    public final void a(Object obj, ysw yswVar) {
        qxe1 qxe1Var;
        e17 l07Var;
        String string;
        e17 l07Var2;
        gi91 gi91Var;
        boolean z;
        in11 in11Var;
        byte b = this.a;
        String string2 = "";
        xz6 xz6Var = xz6.d;
        yz6 yz6Var = yz6.d;
        a07 a07Var = a07.d;
        byte b2 = 10;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                zr0 zr0Var = (zr0) obj;
                ji0 ji0Var = zr0Var.a;
                String str = ji0Var.S0;
                if (str == null) {
                    str = "";
                }
                String str2 = ji0Var.T0;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = ji0Var.R0;
                ((qzh) obj3).f(new ndo(str, str2, zr0Var.b, str3 != null ? str3 : ""));
                break;
            case 1:
                c83 c83Var = (c83) obj;
                String strF = c83Var.a;
                String str4 = c83Var.b;
                if (!ihc1.y0(str4)) {
                    strF = f4i1.f(str4, "\n", strF);
                }
                ((TextView) obj3).setText(strF);
                break;
            case 2:
                ((kdn0) ((bs0) obj3).e).m(((dr6) obj).a);
                break;
            case 3:
                f78 f78Var = (f78) obj;
                iu30 iu30Var = (iu30) obj3;
                toj0 toj0Var = (toj0) obj2;
                ((EncoreTextView) toj0Var.g).setText(f78Var.b);
                ((EncoreTextView) toj0Var.f).setText(f78Var.c);
                EncoreButton encoreButton = (EncoreButton) toj0Var.d;
                encoreButton.setText(f78Var.d);
                EncoreButton encoreButton2 = (EncoreButton) toj0Var.e;
                String str5 = f78Var.f;
                encoreButton2.setVisibility((str5 == null || ihc1.y0(str5)) ? 8 : 0);
                encoreButton2.setText(str5);
                encoreButton.setOnClickListener(new v20(iu30Var, (byte) 6));
                encoreButton2.setOnClickListener(new v20(iu30Var, (byte) 7));
                ((EncoreButton) toj0Var.c).setOnClickListener(new v20(iu30Var, (byte) 8));
                break;
            case 4:
                lnb lnbVar = (lnb) obj;
                Context context = (Context) obj3;
                EncoreTextView encoreTextView = (EncoreTextView) obj2;
                jnb jnbVar = jnb.a;
                encoreTextView.setVisibility(lnbVar == jnbVar ? 8 : 0);
                if (!lnbVar.equals(jnbVar)) {
                    if (lnbVar.equals(jnb.b)) {
                        string2 = context.getString(2131952614);
                    } else if (!(lnbVar instanceof knb)) {
                        eg.o();
                    } else {
                        string2 = context.getString(2131952615, ((knb) lnbVar).a);
                    }
                }
                encoreTextView.setText(string2);
                break;
            case 5:
                ((View) obj2).setOnClickListener(new v20((iu30) obj3, (byte) 12));
                break;
            case 6:
                obk obkVar = (obk) obj;
                tbk tbkVar = (tbk) obj2;
                h72 h72Var = tbkVar.c;
                ((BehaviorRetainingAppBarLayout) h72Var.b).setBackgroundColor(0);
                ((TextView) h72Var.Y).setText(obkVar.b);
                bpb1 bpb1Var = (wen0) tbkVar.a.getValue();
                bpb1Var.getClass();
                bpb1Var.m((Object) null, obkVar);
                break;
            case 7:
                sem semVar = (sem) obj;
                ContextMenuButton contextMenuButton = (ContextMenuButton) obj3;
                String str6 = semVar.a;
                Integer num = semVar.c;
                contextMenuButton.setEnabled(true);
                contextMenuButton.setContentDescription(contextMenuButton.getResources().getString(2131962417, str6));
                if (num != null) {
                    int iIntValue = num.intValue();
                    qxe1 drawable = contextMenuButton.getDrawable();
                    qxe1Var = drawable instanceof g4b1 ? (g4b1) drawable : null;
                    if (qxe1Var != null) {
                        qxe1Var.b(iIntValue);
                    }
                }
                contextMenuButton.n(new v7l(this, (byte) 15));
                break;
            case 8:
                iao iaoVar = (iao) obj;
                String str7 = iaoVar.c;
                oql oqlVar = (oql) obj2;
                ((TextView) oqlVar.c).setText(iaoVar.b);
                int i = iaoVar.d;
                int i2 = i == 0 ? -1 : kao.a[l1d.C(i)];
                if (i2 == 1) {
                    l07Var = new l07(new g07(str7, xz6Var), false);
                } else if (i2 != 2) {
                    l07Var = i2 != 3 ? new e17(new g07(str7, yz6Var)) : new k07(new g07(str7, a07Var), false);
                } else {
                    l07Var = new y07(new g07(str7, a07Var), false);
                }
                ((ArtworkView) oqlVar.b).h(l07Var);
                break;
            case 9:
                ((isw) obj2).a(obj, yswVar);
                break;
            case 10:
                iet ietVar = (iet) obj;
                iu30 iu30Var2 = (iu30) obj3;
                ydt ydtVarA = ietVar.a;
                long j = ietVar.b;
                if (j > 0) {
                    azj azjVar = new azj(j, new qlr(iu30Var2, (byte) 2));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ydtVarA.a);
                    Matcher matcher = ((Pattern) azjVar.c).matcher(spannableStringBuilder);
                    while (matcher.find()) {
                        azjVar.b(spannableStringBuilder, matcher, 1);
                    }
                    int i3 = 1;
                    Matcher matcher2 = ((Pattern) azjVar.d).matcher(spannableStringBuilder);
                    while (matcher2.find()) {
                        azjVar.b(spannableStringBuilder, matcher2, i3);
                        azjVar.b(spannableStringBuilder, matcher2, 2);
                        i3 = 1;
                    }
                    ydtVarA = ydt.a(ydtVarA, spannableStringBuilder, false, 6);
                }
                str strVar = (str) obj2;
                strVar.b = new m3n(this, ydtVarA, iu30Var2, (byte) 15);
                strVar.c(ydtVarA);
                break;
            case 11:
                CharSequence charSequenceA = ((tet) obj).a;
                Iterator it = ((b4v0) obj2).a.iterator();
                while (it.hasNext()) {
                    charSequenceA = ((c4v0) it.next()).a(charSequenceA);
                }
                EncoreTextView encoreTextView2 = (EncoreTextView) obj3;
                encoreTextView2.setText(charSequenceA, TextView.BufferType.SPANNABLE);
                encoreTextView2.setContentDescription(charSequenceA);
                break;
            case 12:
                egv egvVar = (egv) obj;
                zeu zeuVar = (zeu) obj2;
                ProgressBar progressBar = (ProgressBar) zeuVar.b;
                TextView textView = (TextView) zeuVar.c;
                boolean z2 = egvVar instanceof cgv;
                progressBar.setVisibility(z2 ? 0 : 8);
                IconCheckAltFill iconCheckAltFill = (IconCheckAltFill) zeuVar.a;
                boolean z3 = egvVar instanceof bgv;
                iconCheckAltFill.setVisibility(z3 ? 0 : 8);
                if (z3) {
                    textView.setText(((bgv) egvVar).a);
                } else if (egvVar instanceof dgv) {
                    textView.setText(((dgv) egvVar).a);
                } else if (z2) {
                    cgv cgvVar = (cgv) egvVar;
                    progressBar.setMax(100);
                    textView.setText(cgvVar.b);
                    progressBar.setProgress(cgvVar.a, true);
                } else {
                    eg.o();
                }
                break;
            case 13:
                ((qzh) obj3).f(((iu30) obj2).invoke(obj));
                break;
            case 14:
                t671 t671Var = (t671) obj;
                ShareButton shareButton = (ShareButton) obj2;
                shareButton.setTag("ShareElement:".concat(t671Var.a));
                shareButton.setOnClickListener(new aqs((iu30) obj3, (byte) 17));
                boolean z4 = t671Var.e;
                String str8 = t671Var.b;
                shareButton.setEnabled(z4);
                shareButton.setFocusable(true);
                shareButton.setImportantForAccessibility(1);
                if (str8 == null || (string = shareButton.getResources().getString(2131962278, str8)) == null) {
                    string = shareButton.getResources().getString(2131962270);
                }
                shareButton.setContentDescription(string);
                break;
            case 15:
                s7z s7zVar = (s7z) obj;
                PlayButtonView playButtonView = (PlayButtonView) obj2;
                p1p1 p1p1Var = s7zVar.b;
                if (p1p1Var instanceof zqt0) {
                    playButtonView.B(new cet0(false, new qft0(((zqt0) p1p1Var).c == 2, false), (String) null, 4));
                } else if (p1p1Var.equals(yqt0.c) || p1p1Var.equals(yqt0.d)) {
                    playButtonView.B(new cet0(false, new qft0(false, false), (String) null, 4));
                } else if (!p1p1Var.equals(qrt0.c)) {
                    eg.o();
                } else {
                    playButtonView.B(new cet0(true, new qft0(false, false), (String) null, 4));
                }
                playButtonView.n(new f0z(s7zVar, (iu30) obj3, (byte) 4));
                break;
            case 16:
                gg20 gg20Var = (gg20) obj;
                gi20 gi20Var = (gi20) obj2;
                gi20Var.f(gg20Var);
                gi20Var.n(new zf10(gg20Var, (rt01) obj3, b2));
                break;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                smd0 smd0Var = (smd0) obj;
                ((isw) obj2).getView().setVisibility(smd0Var.a ? 0 : 8);
                ((isw) obj3).a(smd0Var, yswVar);
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ((rui0) obj3).b.m(((pui0) obj).a);
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                bmo0 bmo0Var = (bmo0) obj;
                la5 la5Var = (la5) obj2;
                String str9 = bmo0Var.a;
                boolean zEquals = bmo0Var.c.equals(eh10.R0);
                tlv tlvVar = (la5) obj3;
                mmr0 mmr0Var = bmo0Var.b.equals(ylo0.a) ? new mmr0(dja.b, tlvVar.getContext().getString(2131962429, str9)) : new mmr0(dja.a, tlvVar.getContext().getString(2131962430, str9));
                dja djaVar = (dja) mmr0Var.a;
                String str10 = (String) mmr0Var.b;
                la5Var.setEnabled(zEquals);
                la5Var.f(new cja(djaVar, str10));
                break;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                g2z g2zVar = (g2z) obj2;
                TextView textView2 = (TextView) g2zVar.c;
                TextView textView3 = (TextView) g2zVar.d;
                TextView textView4 = (TextView) g2zVar.e;
                nnp0 nnp0Var = ((mnp0) obj).a;
                textView2.setText(nnp0Var.d);
                TextView textView5 = (TextView) g2zVar.b;
                String str11 = nnp0Var.e;
                String str12 = nnp0Var.f;
                String str13 = nnp0Var.b;
                textView5.setVisibility((str11 == null || str11.length() == 0) ? 8 : 0);
                textView5.setText(str11);
                textView4.setVisibility((str13 == null || str13.length() == 0) ? 8 : 0);
                textView4.setText(str13);
                textView3.setVisibility((str12 == null || str12.length() == 0) ? 8 : 0);
                textView3.setText(str12);
                MaterialRadioButton materialRadioButton = (MaterialRadioButton) g2zVar.f;
                int i4 = nnp0Var.a;
                Integer num2 = (Integer) ((op20) obj3).b.e();
                materialRadioButton.setChecked(num2 != null && i4 == num2.intValue());
                int iIntValue2 = nnp0Var.g.intValue();
                Drawable background = textView4.getBackground();
                GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
                if (gradientDrawable != null) {
                    gradientDrawable.setColor(iIntValue2);
                }
                Drawable background2 = textView3.getBackground();
                qxe1Var = background2 instanceof GradientDrawable ? (GradientDrawable) background2 : null;
                if (qxe1Var != null) {
                    qxe1Var.setColor(iIntValue2);
                }
                break;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                qw01 qw01Var = (qw01) obj;
                String str14 = qw01Var.c;
                nt21 nt21Var = (nt21) obj2;
                ((TextView) nt21Var.c).setText(qw01Var.b);
                int i5 = qw01Var.d;
                int i6 = i5 == 0 ? -1 : sw01.a[l1d.C(i5)];
                if (i6 == 1) {
                    l07Var2 = new l07(new g07(str14, xz6Var), false);
                } else if (i6 != 2) {
                    l07Var2 = i6 != 3 ? new e17(new g07(str14, yz6Var)) : new k07(new g07(str14, a07Var), false);
                } else {
                    l07Var2 = new y07(new g07(str14, a07Var), false);
                }
                ((ArtworkView) nt21Var.b).h(l07Var2);
                break;
            case 22:
                zi11 zi11Var = (zi11) obj;
                qzh qzhVar = ((gj11) obj3).g;
                String str15 = zi11Var.a;
                dj11 dj11Var = zi11Var.b;
                aj11 aj11Var = aj11.a;
                qzhVar.f(new t691(str15, !dj11Var.equals(aj11Var), zi11Var.c));
                qxe1 qxe1Var2 = (View) obj2;
                qxe1Var = qxe1Var2 instanceof qxe1 ? qxe1Var2 : null;
                if (qxe1Var != null) {
                    int i7 = 2131101354;
                    if (!dj11Var.equals(cj11.a) && !dj11Var.equals(aj11Var)) {
                        if (!(dj11Var instanceof bj11)) {
                            eg.o();
                        } else if (!((bj11) dj11Var).a) {
                            i7 = 2131101345;
                        }
                    }
                    qxe1Var.setSupportImageTintList(x74.E(qxe1Var2.getContext(), i7));
                }
                break;
            case 23:
                xe81 xe81Var = (xe81) obj;
                SmartShuffleButtonView smartShuffleButtonView = (SmartShuffleButtonView) obj2;
                smartShuffleButtonView.n(new et61((iu30) obj3, (byte) 11));
                int iOrdinal = xe81Var.a.ordinal();
                if (iOrdinal == 0) {
                    gi91Var = fi91.e;
                } else if (iOrdinal == 1) {
                    gi91Var = fi91.g;
                } else if (iOrdinal != 2) {
                    eg.o();
                } else {
                    gi91Var = gi91.e;
                }
                smartShuffleButtonView.b(new ei91(gi91Var));
                if (xe81Var.c) {
                    smartShuffleButtonView.setEnabled(false);
                }
                break;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ?? r5 = (hc5) obj2;
                boolean z5 = ((p991) obj).b;
                String string3 = ((Context) obj3).getString(2131959260);
                if (r5.getDrawable() == null || z5 != r5.d) {
                    r5.d = z5;
                    cdf0 cdf0Var = z5 ? r5.f : r5.g;
                    r5.setImageDrawable(cdf0Var);
                    if (r5.e) {
                        cdf0Var.k();
                        r5.e = false;
                    } else {
                        cdf0Var.o((int) cdf0Var.b.k());
                    }
                    r5.setContentDescription(string3);
                }
                break;
            case 25:
                ((isw) obj2).a(obj, yswVar);
                break;
            case 26:
                qeg1 qeg1Var = (qeg1) obj;
                View view = (View) obj3;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.width = qeg1Var.a;
                    layoutParams2.height = qeg1Var.b;
                    layoutParams2.bottomMargin = qeg1Var.c;
                    layoutParams2.gravity = 8388611;
                    view.setLayoutParams(layoutParams2);
                } else {
                    bhn0.i("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                break;
            case 27:
                nuj1 nuj1Var = (nuj1) obj;
                String str16 = nuj1Var.a;
                nuj1 nuj1Var2 = new nuj1(str16, nuj1Var.c, str16);
                joa0 joa0Var = new joa0(str16);
                tka0 tka0Var = dtw.C;
                ((dtw) obj2).k(nuj1Var2, joa0Var, (vu30) null);
                break;
            default:
                btj1 btj1Var = (btj1) obj;
                qzh qzhVar2 = (qzh) obj3;
                String str17 = btj1Var.d;
                List list = btj1Var.c;
                boolean z6 = btj1Var.b;
                List<ltj1> list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                for (ltj1 ltj1Var : list2) {
                    String str18 = ltj1Var.d;
                    String str19 = ltj1Var.a;
                    String str20 = ltj1Var.b;
                    String str21 = ltj1Var.e;
                    long j2 = ltj1Var.g;
                    long j3 = ltj1Var.h;
                    String str22 = ltj1Var.f;
                    int iC = l1d.C(ltj1Var.j);
                    if (iC != 0) {
                        z = z6;
                        if (iC == 1) {
                            in11Var = in11.b;
                        } else if (iC != 2) {
                            eg.o();
                        } else {
                            in11Var = in11.c;
                        }
                    } else {
                        z = z6;
                        in11Var = in11.a;
                    }
                    arrayList.add(new qn11(z, str18, str19, str20, str21, j2, j3, str22, ltj1Var.i, in11Var));
                    z6 = z;
                    break;
                }
                qzhVar2.f(new rn11(str17, arrayList));
                break;
        }
    }

    public final View getView() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return (ViewGroup) obj2;
            case 1:
                return (View) obj2;
            case 2:
                return (RecyclerView) obj2;
            case 3:
                return (ConstraintLayout) ((toj0) obj2).b;
            case 4:
                return (EncoreTextView) obj2;
            case 5:
                return (View) obj2;
            case 6:
                return (BehaviorRetainingAppBarLayout) obj;
            case 7:
                return (ContextMenuButton) obj;
            case 8:
                return (ConstraintLayout) obj;
            case 9:
                View view = ((isw) obj2).getView();
                ((iu30) obj).invoke(view);
                return view;
            case 10:
                return (str) obj2;
            case 11:
                return (EncoreTextView) obj;
            case 12:
                return (LinearLayout) obj;
            case 13:
                return ((qzh) obj).getView();
            case 14:
                return (ShareButton) obj2;
            case 15:
                return (PlayButtonView) obj2;
            case 16:
                return (gi20) obj2;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return ((isw) obj2).getView();
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (RecyclerView) obj2;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return (la5) obj;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return (ConstraintLayout) ((g2z) obj2).a;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return (ConstraintLayout) obj;
            case 22:
                return (View) obj2;
            case 23:
                return (SmartShuffleButtonView) obj2;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return (hc5) obj2;
            case 25:
                return (FrameLayout) obj;
            case 26:
                return (View) obj2;
            case 27:
                return (View) obj;
            default:
                return (View) obj2;
        }
    }

    public /* synthetic */ as0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj2;
        this.b = obj;
    }

    public as0(Context context, byte b) {
        this.a = b;
        switch (b) {
            case 12:
                View viewInflate = LayoutInflater.from(context).inflate(2131624554, (ViewGroup) null, false);
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                int i = 2131428539;
                IconCheckAltFill iconCheckAltFillT = m5n1.t(viewInflate, 2131428539);
                if (iconCheckAltFillT != null) {
                    i = 2131428541;
                    ProgressBar progressBar = (ProgressBar) m5n1.t(viewInflate, 2131428541);
                    if (progressBar != null) {
                        i = 2131428543;
                        TextView textView = (TextView) m5n1.t(viewInflate, 2131428543);
                        if (textView != null) {
                            this.b = new zeu(linearLayout, iconCheckAltFillT, progressBar, textView);
                            this.c = linearLayout;
                            return;
                        }
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
                throw null;
            default:
                this.c = context;
                EncoreTextView encoreTextView = new EncoreTextView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                encoreTextView.setId(2131427641);
                int dimensionPixelSize = encoreTextView.getResources().getDimensionPixelSize(2131167023);
                encoreTextView.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
                encoreTextView.setTextAppearance(2132018003);
                encoreTextView.setTextColor(xfo1.r(encoreTextView, 2130968791));
                this.b = encoreTextView;
                return;
        }
    }

    public as0(iu30 iu30Var, ViewGroup viewGroup, iu30 iu30Var2, lsw lswVar, iu30 iu30Var3, vu30 vu30Var, iu30 iu30Var4) {
        this.a = (byte) 13;
        this.b = iu30Var4;
        qzh qzhVar = (qzh) iu30Var.invoke(viewGroup);
        this.c = qzhVar;
        qzhVar.n(new jjv(iu30Var3, iu30Var2, (byte) 0));
        if (vu30Var != null) {
            vu30Var.invoke(lswVar, iu30Var2);
        }
    }

    public as0(Context context, ViewGroup viewGroup, byte b) {
        this.a = b;
        switch (b) {
            case 26:
                View viewInflate = LayoutInflater.from(context).inflate(2131626289, viewGroup, false);
                this.b = viewInflate;
                this.c = viewInflate.findViewById(2131430353);
                break;
            default:
                View viewInflate2 = LayoutInflater.from(context).inflate(2131624475, viewGroup, false);
                this.b = viewInflate2;
                this.c = (TextView) viewInflate2.findViewById(2131428252);
                break;
        }
    }

    public as0(ggx ggxVar, iu30 iu30Var) {
        this.a = (byte) 28;
        kjs kjsVarA = ggxVar.a(gn11.a);
        otj1 otj1Var = new otj1(iu30Var, (byte) 0);
        kjs kjsVar = kjsVarA;
        View view = (ConstraintLayout) kjsVar.f;
        kjsVar.b = otj1Var;
        this.c = kjsVarA;
        s1r0 s1r0Var = new s1r0(this, (byte) 1);
        p811 p811Var = new p811();
        p811 p811Var2 = new p811();
        ptj1 ptj1Var = new ptj1(p811Var, new qtj1(s1r0Var, p811Var, p811Var2, view));
        p811Var2.a = ptj1Var;
        view.addOnAttachStateChangeListener(ptj1Var);
        if (view.isAttachedToWindow()) {
            ((ptj1) p811Var2.a).onViewAttachedToWindow(view);
        }
        this.b = view;
    }

    public as0(sma1 sma1Var, Context context, ViewGroup viewGroup, d75 d75Var, iu30 iu30Var) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        this.a = (byte) 25;
        isw iswVarA = ((jpg0) sma1Var.d).a.c().a(context, viewGroup, d75Var.c, iu30Var);
        this.b = iswVarA;
        FrameLayout frameLayout = new FrameLayout(context);
        rma1 rma1Var = (rma1) sma1Var.e;
        Integer num = rma1Var.a;
        int dimensionPixelSize4 = 0;
        if (num != null) {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(num.intValue());
        } else {
            dimensionPixelSize = 0;
        }
        Integer num2 = rma1Var.b;
        if (num2 != null) {
            dimensionPixelSize2 = context.getResources().getDimensionPixelSize(num2.intValue());
        } else {
            dimensionPixelSize2 = 0;
        }
        Integer num3 = rma1Var.c;
        if (num3 != null) {
            dimensionPixelSize3 = context.getResources().getDimensionPixelSize(num3.intValue());
        } else {
            dimensionPixelSize3 = 0;
        }
        Integer num4 = rma1Var.d;
        if (num4 != null) {
            dimensionPixelSize4 = context.getResources().getDimensionPixelSize(num4.intValue());
        }
        frameLayout.setPaddingRelative(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        frameLayout.addView(iswVarA.getView());
        this.c = frameLayout;
    }

    public as0(Context context, rt01 rt01Var) {
        this.a = (byte) 16;
        this.c = rt01Var;
        this.b = new gi20(context);
    }

    public as0(isw iswVar) {
        this.a = (byte) 17;
        this.c = iswVar;
        this.b = iswVar;
        View view = iswVar.getView();
        view.setVisibility(8);
        view.setImportantForAccessibility(4);
        view.setFocusable(false);
        view.setFocusableInTouchMode(false);
        ViewGroup viewGroup = (ViewGroup) view;
        viewGroup.setDescendantFocusability(393216);
        viewGroup.setClickable(false);
    }

    public as0(Context context, ViewGroup viewGroup, iu30 iu30Var, op20 op20Var) {
        this.a = (byte) 20;
        this.c = op20Var;
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131624650, viewGroup, false);
        ConstraintLayout constraintLayout = constraintLayoutInflate;
        int i = 2131430207;
        TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131430207);
        if (textView != null) {
            i = 2131430209;
            TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131430209);
            if (textView2 != null) {
                i = 2131430387;
                TextView textView3 = (TextView) m5n1.t(constraintLayoutInflate, 2131430387);
                if (textView3 != null) {
                    i = 2131430388;
                    TextView textView4 = (TextView) m5n1.t(constraintLayoutInflate, 2131430388);
                    if (textView4 != null) {
                        i = 2131430909;
                        MaterialRadioButton materialRadioButtonT = m5n1.t(constraintLayoutInflate, 2131430909);
                        if (materialRadioButtonT != null) {
                            g2z g2zVar = new g2z();
                            g2zVar.a = constraintLayout;
                            g2zVar.b = textView;
                            g2zVar.c = textView2;
                            g2zVar.d = textView3;
                            g2zVar.e = textView4;
                            g2zVar.f = materialRadioButtonT;
                            constraintLayout.setOnClickListener(new jn90(iu30Var, (byte) 19));
                            this.b = g2zVar;
                            return;
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public as0(Context context, ne neVar, bs0 bs0Var) {
        this.a = (byte) 2;
        this.c = bs0Var;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(2131427607);
        neVar.f(recyclerView, new LinearLayoutManager(1), false);
        recyclerView.setNestedScrollingEnabled(false);
        this.b = recyclerView;
    }

    public as0(a4v0 a4v0Var, Context context, iu30 iu30Var) {
        this.a = (byte) 11;
        ahs ahsVar = new ahs(iu30Var, (byte) 1);
        a4v0Var.getClass();
        this.b = a4v0.a(ahsVar);
        EncoreTextView encoreTextView = new EncoreTextView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        encoreTextView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        encoreTextView.setId(2131428356);
        int dimensionPixelSize = encoreTextView.getResources().getDimensionPixelSize(2131167023);
        encoreTextView.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        encoreTextView.setTextIsSelectable(false);
        encoreTextView.setLongClickable(false);
        encoreTextView.setTextAppearance(2132018003);
        encoreTextView.setLinksClickable(true);
        encoreTextView.setTextDirection(5);
        encoreTextView.setMovementMethod(LinkMovementMethod.getInstance());
        encoreTextView.setLinkTextColor(xfo1.r(encoreTextView, 2130968787));
        this.c = encoreTextView;
    }

    public as0(Context context, ViewGroup viewGroup, iu30 iu30Var, byte b) {
        this.a = b;
        switch (b) {
            case 5:
                this.c = iu30Var;
                this.b = LayoutInflater.from(context).inflate(2131624308, viewGroup, false);
                return;
            default:
                this.c = iu30Var;
                ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131624073, viewGroup, false);
                int i = 2131427856;
                EncoreButton encoreButtonT = m5n1.t(constraintLayoutInflate, 2131427856);
                if (encoreButtonT != null) {
                    i = 2131427859;
                    EncoreButton encoreButtonT2 = m5n1.t(constraintLayoutInflate, 2131427859);
                    if (encoreButtonT2 != null) {
                        ConstraintLayout constraintLayout = constraintLayoutInflate;
                        i = 2131430866;
                        EncoreButton encoreButtonT3 = m5n1.t(constraintLayoutInflate, 2131430866);
                        if (encoreButtonT3 != null) {
                            i = 2131431303;
                            EncoreTextView encoreTextViewT = m5n1.t(constraintLayoutInflate, 2131431303);
                            if (encoreTextViewT != null) {
                                i = 2131431310;
                                EncoreTextView encoreTextViewT2 = m5n1.t(constraintLayoutInflate, 2131431310);
                                if (encoreTextViewT2 != null) {
                                    this.b = new toj0(constraintLayout, encoreButtonT, encoreButtonT2, encoreButtonT3, encoreTextViewT, encoreTextViewT2, (byte) 6);
                                    rwq0.s(constraintLayout, o40.a1);
                                    return;
                                }
                            }
                        }
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
                throw null;
        }
    }

    public as0(Context context, gw70 gw70Var, iu30 iu30Var, byte b) {
        this.a = b;
        int i = 2131427911;
        switch (b) {
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131626102, (ViewGroup) null, false);
                View view = (ArtworkView) m5n1.t(constraintLayoutInflate, 2131427903);
                if (view != null) {
                    TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131427911);
                    if (textView != null) {
                        ConstraintLayout constraintLayout = constraintLayoutInflate;
                        this.b = new nt21(constraintLayout, view, textView);
                        view.setViewContext(new f47(gw70Var));
                        v9w0 v9w0VarP = b2u.p(constraintLayout);
                        Collections.addAll(v9w0VarP.c, textView);
                        Collections.addAll(v9w0VarP.d, view);
                        v9w0VarP.a();
                        constraintLayout.setOnClickListener(new jn90(iu30Var, (byte) 26));
                        this.c = constraintLayout;
                        return;
                    }
                } else {
                    i = 2131427903;
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
                throw null;
            default:
                ConstraintLayout constraintLayoutInflate2 = LayoutInflater.from(context).inflate(2131624491, (ViewGroup) null, false);
                View view2 = (ArtworkView) m5n1.t(constraintLayoutInflate2, 2131427903);
                if (view2 != null) {
                    TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate2, 2131427911);
                    if (textView2 != null) {
                        ConstraintLayout constraintLayout2 = constraintLayoutInflate2;
                        this.b = new oql(constraintLayout2, (ArtworkView) view2, textView2);
                        view2.setViewContext(new f47(gw70Var));
                        v9w0 v9w0VarP2 = b2u.p(constraintLayout2);
                        Collections.addAll(v9w0VarP2.c, textView2);
                        Collections.addAll(v9w0VarP2.d, view2);
                        v9w0VarP2.a();
                        constraintLayout2.setOnClickListener(new v20(iu30Var, (byte) 24));
                        this.c = constraintLayout2;
                        return;
                    }
                } else {
                    i = 2131427903;
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate2.getResources().getResourceName(i)));
                throw null;
        }
    }

    public as0(Context context, ne neVar, rui0 rui0Var) {
        this.a = (byte) 18;
        this.c = rui0Var;
        RecyclerView recyclerView = new RecyclerView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = context.getResources().getDimensionPixelSize(2131167026);
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.j(xpn1.a);
        neVar.f(recyclerView, new GridLayoutManager(2), false);
        recyclerView.setNestedScrollingEnabled(false);
        this.b = recyclerView;
    }

    public as0(Context context, jb3 jb3Var, iu30 iu30Var) {
        this.a = (byte) 15;
        this.c = iu30Var;
        PlayButtonView playButtonView = new PlayButtonView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        playButtonView.setId(2131428385);
        this.b = playButtonView;
    }

    public as0(Context context, ViewGroup viewGroup, gsj1 gsj1Var, epb1 epb1Var, iu30 iu30Var, iac0 iac0Var) {
        this.a = (byte) 27;
        tka0 tka0Var = dtw.C;
        g2q g2qVar = gsj1Var.a;
        muz muzVar = (muz) gsj1Var.b.get();
        tgt0 tgt0Var = new tgt0(PlayOrigin.create("video-preview-carousel-artist"));
        lik1 lik1Var = gsj1Var.c;
        v65 v65Var = gsj1Var.h;
        guj1 guj1Var = new guj1(v65Var.g(), false, false, (njv0) gsj1Var.n.get(), (fiv0) gsj1Var.o.get(), (xaj1) null, false, false, v65Var.b(), 742);
        dtw dtwVarD = mhc.d(context, viewGroup, g2q.a(g2qVar, (i8h1) gsj1Var.m.get(), muzVar, epb1Var, tgt0Var, boo1.a, iu30Var, lik1Var, iac0Var, new dch1(gsj1Var, (byte) 24), new mah1(gsj1Var, viewGroup, (byte) 26), (kko) null, (mr20) null, guj1Var, 11264), (drw) null, 24);
        this.b = dtwVarD;
        this.c = dtwVarD.w;
    }

    public as0(gj11 gj11Var, iu30 iu30Var) {
        this.a = (byte) 22;
        this.c = gj11Var;
        qzh qzhVar = gj11Var.g;
        qzhVar.n(new n601(iu30Var, (byte) 6));
        this.b = qzhVar.getView();
    }

    public as0(Context context, sbk sbkVar, iu30 iu30Var) {
        this.a = (byte) 6;
        tbk tbkVar = new tbk(context, (gw70) sbkVar.c, (lbs) sbkVar.i, (d0r) sbkVar.t);
        bpb1 bpb1Var = (wen0) tbkVar.b.getValue();
        bpb1Var.getClass();
        bpb1Var.m((Object) null, iu30Var);
        h72 h72Var = tbkVar.c;
        ((BackButtonView) h72Var.e).n(new usj(iu30Var, (byte) 10));
        this.b = tbkVar;
        this.c = (BehaviorRetainingAppBarLayout) h72Var.b;
    }

    public as0(Context context, let letVar, iu30 iu30Var) {
        this.a = (byte) 10;
        this.c = iu30Var;
        str strVar = new str(context);
        strVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        strVar.a = letVar.b;
        EncoreTextView encoreTextView = (EncoreTextView) strVar.d.c;
        encoreTextView.setLinksClickable(true);
        encoreTextView.setMovementMethod(LinkMovementMethod.getInstance());
        encoreTextView.setTextDirection(5);
        this.b = strVar;
    }
}
