package p;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.nowplayingbar.nowplayingbar.view.carousel.TrackInfoView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c2p0 extends e711 {
    public final TrackInfoView U0;
    public int V0;

    /* JADX WARN: Illegal instructions before constructor call */
    public c2p0(ViewGroup viewGroup, imx0 imx0Var) {
        View viewF = e711.F(2131625322, viewGroup);
        super(viewF);
        TrackInfoView trackInfoView = (TrackInfoView) viewF.findViewById(2131431475);
        trackInfoView.setPromoIndicatorController(imx0Var);
        trackInfoView.setListenAlongBadgeHolderFactory(new ivn0(trackInfoView, (byte) 16));
        this.U0 = trackInfoView;
        this.V0 = 2;
    }

    public final /* bridge */ /* synthetic */ void E(int i, Object obj) {
        J((m2g1) obj);
    }

    public final void J(m2g1 m2g1Var) {
        String strConcat;
        SpannableString spannableStringValueOf;
        String strConcat2;
        CharSequence spannedString;
        String quantityString;
        CharSequence spannedString2;
        imx0 imx0Var;
        int i;
        fqa1 fqa1Var = m2g1Var.i;
        t3g1 t3g1Var = m2g1Var.d;
        t3g1 t3g1Var2 = m2g1Var.c;
        boolean z = m2g1Var.g;
        boolean z2 = m2g1Var.f;
        int iC = l1d.C(this.V0);
        eqa1 eqa1Var = eqa1.a;
        String str = " • ";
        TrackInfoView trackInfoView = this.U0;
        if (iC == 0) {
            Context context = trackInfoView.getContext();
            String str2 = (String) t3g1Var2.invoke(context.getResources());
            String str3 = (String) t3g1Var.invoke(context.getResources());
            if (bno1.s(context)) {
                boolean zY0 = ihc1.y0(str3);
                if (!zY0) {
                    if (z2 && z) {
                        str = "     • ";
                    } else if (z2 || z) {
                        str = "   • ";
                    }
                    strConcat2 = f4i1.f(str3, str, str2);
                } else if (z2 && z) {
                    strConcat2 = str2.concat("    ");
                } else {
                    strConcat2 = (z2 || z) ? str2.concat("  ") : str2;
                }
                spannableStringValueOf = SpannableString.valueOf(strConcat2);
                if (zY0) {
                    int length = str2.length();
                    spannableStringValueOf.getClass();
                    vno1.n(context, spannableStringValueOf, 0, length);
                    if (z2 && z) {
                        vno1.h(context, spannableStringValueOf, length + 1, length + 2);
                        vno1.i(context, spannableStringValueOf, length + 3, length + 4);
                    } else if (z2) {
                        vno1.i(context, spannableStringValueOf, length + 1, length + 2);
                    } else if (z) {
                        vno1.h(context, spannableStringValueOf, length + 1, length + 2);
                    }
                } else {
                    int length2 = str3.length();
                    spannableStringValueOf.getClass();
                    spannableStringValueOf.setSpan(new l0e1(context, 2132018078, -1), 0, length2, 34);
                    if (z2 && z) {
                        vno1.h(context, spannableStringValueOf, length2 + 1, length2 + 2);
                        vno1.i(context, spannableStringValueOf, length2 + 3, length2 + 4);
                    } else if (z2) {
                        vno1.i(context, spannableStringValueOf, length2 + 1, length2 + 2);
                    } else if (z) {
                        vno1.h(context, spannableStringValueOf, length2 + 1, length2 + 2);
                    }
                    vno1.n(context, spannableStringValueOf, spannableStringValueOf.length() - str3.length(), spannableStringValueOf.length());
                }
            } else {
                boolean zY1 = ihc1.y0(str3);
                if (!zY1) {
                    if (z2 && z) {
                        str = " •     ";
                    } else if (z2 || z) {
                        str = " •   ";
                    }
                    strConcat = f4i1.f(str2, str, str3);
                } else if (z2 && z) {
                    strConcat = str2.concat("    ");
                } else {
                    strConcat = (z2 || z) ? str2.concat("  ") : str2;
                }
                spannableStringValueOf = SpannableString.valueOf(strConcat);
                if (zY1) {
                    int length3 = str2.length();
                    spannableStringValueOf.getClass();
                    vno1.n(context, spannableStringValueOf, 0, length3);
                    if (z2 && z) {
                        vno1.h(context, spannableStringValueOf, length3 + 1, length3 + 2);
                        vno1.i(context, spannableStringValueOf, length3 + 3, length3 + 4);
                    } else if (z2) {
                        vno1.i(context, spannableStringValueOf, length3 + 1, length3 + 2);
                    } else if (z) {
                        vno1.h(context, spannableStringValueOf, length3 + 1, length3 + 2);
                    }
                } else {
                    spannableStringValueOf.getClass();
                    int iW0 = ihc1.w0(spannableStringValueOf, "•", 0, false, 6);
                    int i2 = iW0 + 1;
                    vno1.n(context, spannableStringValueOf, 0, str2.length());
                    if (z2 && z) {
                        vno1.h(context, spannableStringValueOf, iW0 + 2, iW0 + 3);
                        i2 = iW0 + 5;
                        vno1.i(context, spannableStringValueOf, iW0 + 4, i2);
                    } else if (z2) {
                        i2 = iW0 + 3;
                        vno1.i(context, spannableStringValueOf, iW0 + 2, i2);
                    } else if (z) {
                        i2 = iW0 + 3;
                        vno1.h(context, spannableStringValueOf, iW0 + 2, i2);
                    }
                    spannableStringValueOf.setSpan(new l0e1(context, 2132018078, -1), i2 + 1, spannableStringValueOf.length(), 34);
                }
            }
            TextView textView = trackInfoView.b;
            TextView textView2 = trackInfoView.a;
            if (!nhc1.O(spannableStringValueOf, textView2.getText())) {
                textView2.setText(spannableStringValueOf);
            }
            textView2.setContentDescription(trackInfoView.b(spannableStringValueOf.toString(), z2, z));
            textView.setText((CharSequence) null);
            textView.setContentDescription(null);
            textView.setVisibility(4);
            trackInfoView.c.setVisibility(8);
            trackInfoView.d.setVisibility(8);
            trackInfoView.e.c(eqa1Var);
            trackInfoView.a(false);
            imx0 imx0Var2 = trackInfoView.t;
            if (imx0Var2 != null) {
                imx0Var2.b();
            }
            trackInfoView.c();
        } else {
            if (iC != 1) {
                eg.o();
                return;
            }
            Context context2 = trackInfoView.getContext();
            String str4 = (String) t3g1Var.invoke(context2.getResources());
            k8f0 k8f0Var = m2g1Var.e;
            String strE = f4i1.e(k8f0Var.b, k8f0Var.a);
            if (strE.length() > 0) {
                int color = context2.getColor(2131103942);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) str4);
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(color);
                int length4 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) strE);
                spannableStringBuilder.setSpan(foregroundColorSpan, length4, spannableStringBuilder.length(), 17);
                spannedString = new SpannedString(spannableStringBuilder);
            } else {
                spannedString = str4;
            }
            String quantityString2 = "";
            if (fqa1Var.equals(eqa1Var)) {
                quantityString = "";
            } else {
                if (!(fqa1Var instanceof fqa1)) {
                    eg.o();
                    return;
                }
                Resources resources = context2.getResources();
                int i3 = fqa1Var.a;
                quantityString = resources.getQuantityString(2131820928, i3, Integer.valueOf(i3));
                if (!ihc1.y0(str4)) {
                    quantityString = quantityString.concat(" • ");
                }
            }
            if (quantityString.length() == 0) {
                spannedString2 = spannedString;
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) quantityString);
                spannableStringBuilder2.append(spannedString);
                spannedString2 = new SpannedString(spannableStringBuilder2);
            }
            if (!fqa1Var.equals(eqa1Var)) {
                if (!(fqa1Var instanceof fqa1)) {
                    eg.o();
                    return;
                }
                fqa1 fqa1Var2 = fqa1Var;
                int iC2 = l1d.C(fqa1Var2.b);
                if (iC2 == 0) {
                    i = 2131820763;
                } else {
                    if (iC2 != 1) {
                        eg.o();
                        return;
                    }
                    i = 2131820764;
                }
                Resources resources2 = context2.getResources();
                int i4 = fqa1Var2.a;
                quantityString2 = resources2.getQuantityString(i, i4, Integer.valueOf(i4));
                if (!ihc1.y0(str4)) {
                    quantityString2 = quantityString2.concat(", ");
                }
            }
            if (quantityString2.length() != 0) {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                spannableStringBuilder3.append((CharSequence) quantityString2);
                spannableStringBuilder3.append(spannedString);
                spannedString = new SpannedString(spannableStringBuilder3);
            }
            String str5 = (String) t3g1Var2.invoke(trackInfoView.getResources());
            String str6 = m2g1Var.b;
            boolean z3 = m2g1Var.h;
            boolean z4 = m2g1Var.j;
            TextView textView3 = trackInfoView.b;
            trackInfoView.a(z4);
            imx0 imx0Var3 = trackInfoView.t;
            if (imx0Var3 != null) {
                imx0Var3.c();
            }
            TextView textView4 = trackInfoView.a;
            if (!str5.contentEquals(textView4.getText())) {
                textView4.setText(str5);
            }
            textView4.setContentDescription(trackInfoView.b(str5, z2, z));
            if (!nhc1.O(spannedString2, textView3.getText())) {
                textView3.setText(spannedString2);
            }
            textView3.setContentDescription(spannedString);
            textView3.setVisibility(ihc1.y0(spannedString2) ? 8 : 0);
            trackInfoView.c.setVisibility(z2 ? 0 : 8);
            trackInfoView.d.setVisibility(z ? 0 : 8);
            trackInfoView.e.c(fqa1Var);
            if (z3 && (imx0Var = trackInfoView.t) != null) {
                imx0Var.d(str6, trackInfoView.h, trackInfoView.g, trackInfoView.i);
            }
            trackInfoView.c();
        }
        trackInfoView.setMarqueeEnabled(m2g1Var.k);
    }
}
