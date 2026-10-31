package p;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.spotify.artist.uiusecases.artistpick.elements.CommentBubbleView;
import com.spotify.artist.uiusecases.artistpick.elements.DateIconView;
import com.spotify.encoreconsumermobile.elements.addtobutton.AddToButtonView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.download.DownloadBadgeView;
import com.spotify.encoremobile.buttons.PrimaryButtonView;
import com.spotify.encoremobile.buttons.TertiaryButtonView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.icons.EncoreIconView;
import com.spotify.encoremobile.component.listrow.EncoreListRow;
import com.spotify.encoremobile.roundedcorner.RoundedConstraintLayout;
import com.spotify.legacyglue.icons.SpotifyIconView;
import com.spotify.nowplayingmini.uicomponents.trackinfo.TrackInfoView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ver implements qzh, e391 {
    public final /* synthetic */ byte a;
    public final Object b;

    public ver(Context context, byte b) {
        this.a = b;
        int i = 2131431115;
        int i2 = 2131431356;
        switch (b) {
            case 4:
                View viewInflate = LayoutInflater.from(context).inflate(2131624329, (ViewGroup) null, false);
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                if (m5n1.t(viewInflate, 2131431356) == null) {
                    bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(2131431356)));
                    throw null;
                }
                wde wdeVar = new wde(linearLayout);
                linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                this.b = wdeVar;
                return;
            case 5:
                ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131624502, (ViewGroup) null, false);
                TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131427454);
                if (textView != null) {
                    ConstraintLayout constraintLayout = constraintLayoutInflate;
                    TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131431115);
                    if (textView2 != null) {
                        TextView textView3 = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                        if (textView3 != null) {
                            wzn wznVar = new wzn(constraintLayout, textView, textView2, textView3);
                            constraintLayout.setLayoutParams(new qhl(-1, -2));
                            b8k1.q(constraintLayout, true);
                            this.b = wznVar;
                            return;
                        }
                        i = 2131431356;
                    }
                } else {
                    i = 2131427454;
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
                throw null;
            case 6:
                ConstraintLayout constraintLayoutInflate2 = LayoutInflater.from(context).inflate(2131624570, (ViewGroup) null, false);
                EncoreButton encoreButtonT = m5n1.t(constraintLayoutInflate2, 2131427839);
                if (encoreButtonT != null) {
                    TextView textView4 = (TextView) m5n1.t(constraintLayoutInflate2, 2131431115);
                    if (textView4 != null) {
                        TextView textView5 = (TextView) m5n1.t(constraintLayoutInflate2, 2131431356);
                        if (textView5 != null) {
                            ConstraintLayout constraintLayout2 = constraintLayoutInflate2;
                            a9x a9xVar = new a9x(constraintLayout2, encoreButtonT, textView4, textView5);
                            constraintLayout2.setLayoutParams(new qhl(-1, -1));
                            this.b = a9xVar;
                            return;
                        }
                        i = 2131431356;
                    }
                } else {
                    i = 2131427839;
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate2.getResources().getResourceName(i)));
                throw null;
            case 7:
                ConstraintLayout constraintLayoutInflate3 = LayoutInflater.from(context).inflate(2131624608, (ViewGroup) null, false);
                Button button = (Button) m5n1.t(constraintLayoutInflate3, 2131430685);
                if (button != null) {
                    TextView textView6 = (TextView) m5n1.t(constraintLayoutInflate3, 2131431115);
                    if (textView6 != null) {
                        TextView textView7 = (TextView) m5n1.t(constraintLayoutInflate3, 2131431356);
                        if (textView7 != null) {
                            ConstraintLayout constraintLayout3 = constraintLayoutInflate3;
                            yzu yzuVar = new yzu(constraintLayout3, button, textView6, textView7);
                            eqq.t(-1, -1, constraintLayout3);
                            this.b = yzuVar;
                            return;
                        }
                        i = 2131431356;
                    }
                } else {
                    i = 2131430685;
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate3.getResources().getResourceName(i)));
                throw null;
            case 8:
                RoundedConstraintLayout roundedConstraintLayoutInflate = LayoutInflater.from(context).inflate(2131625093, (ViewGroup) null, false);
                SpotifyIconView spotifyIconViewT = m5n1.t(roundedConstraintLayoutInflate, 2131429223);
                if (spotifyIconViewT != null) {
                    RoundedConstraintLayout roundedConstraintLayout = roundedConstraintLayoutInflate;
                    TextView textView8 = (TextView) m5n1.t(roundedConstraintLayoutInflate, 2131431356);
                    if (textView8 != null) {
                        o860 o860Var = new o860(roundedConstraintLayout, spotifyIconViewT, roundedConstraintLayout, textView8, (byte) 10);
                        roundedConstraintLayout.setLayoutParams(new qhl(-1, -2));
                        this.b = o860Var;
                        return;
                    }
                } else {
                    i2 = 2131429223;
                }
                bhn0.i("Missing required view with ID: ".concat(roundedConstraintLayoutInflate.getResources().getResourceName(i2)));
                throw null;
            case 9:
                ConstraintLayout constraintLayoutInflate4 = LayoutInflater.from(context).inflate(2131625154, (ViewGroup) null, false);
                int i3 = 2131428442;
                TextView textView9 = (TextView) m5n1.t(constraintLayoutInflate4, 2131428442);
                if (textView9 != null) {
                    i3 = 2131428492;
                    TertiaryButtonView tertiaryButtonViewT = m5n1.t(constraintLayoutInflate4, 2131428492);
                    if (tertiaryButtonViewT != null) {
                        i3 = 2131430214;
                        PrimaryButtonView primaryButtonViewT = m5n1.t(constraintLayoutInflate4, 2131430214);
                        if (primaryButtonViewT != null) {
                            i3 = 2131431360;
                            TextView textView10 = (TextView) m5n1.t(constraintLayoutInflate4, 2131431360);
                            if (textView10 != null) {
                                ConstraintLayout constraintLayout4 = constraintLayoutInflate4;
                                ur00 ur00Var = new ur00(constraintLayout4, textView9, tertiaryButtonViewT, primaryButtonViewT, textView10, (byte) 23);
                                eqq.t(-2, -2, constraintLayout4);
                                this.b = ur00Var;
                                return;
                            }
                        }
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate4.getResources().getResourceName(i3)));
                throw null;
            case 10:
            default:
                AddToButtonView addToButtonView = new AddToButtonView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                int iM = too1.m(context, 2131167033);
                addToButtonView.setPadding(iM, iM, iM, iM);
                this.b = addToButtonView;
                return;
            case 11:
                MaterialCardView materialCardViewInflate = LayoutInflater.from(context).inflate(2131625444, (ViewGroup) null, false);
                int i4 = 2131427688;
                if (m5n1.t(materialCardViewInflate, 2131427688) != null) {
                    i4 = 2131427974;
                    ImageView imageView = (ImageView) m5n1.t(materialCardViewInflate, 2131427974);
                    if (imageView != null) {
                        i4 = 2131428497;
                        View viewT = m5n1.t(materialCardViewInflate, 2131428497);
                        if (viewT != null) {
                            i4 = 2131428535;
                            LinearLayout linearLayout2 = (LinearLayout) m5n1.t(materialCardViewInflate, 2131428535);
                            if (linearLayout2 != null) {
                                i4 = 2131429028;
                                View viewT2 = m5n1.t(materialCardViewInflate, 2131429028);
                                if (viewT2 != null) {
                                    i4 = 2131430205;
                                    if (m5n1.t(materialCardViewInflate, 2131430205) != null) {
                                        i4 = 2131430356;
                                        TextView textView11 = (TextView) m5n1.t(materialCardViewInflate, 2131430356);
                                        if (textView11 != null) {
                                            i4 = 2131430357;
                                            TextView textView12 = (TextView) m5n1.t(materialCardViewInflate, 2131430357);
                                            if (textView12 != null) {
                                                i4 = 2131430360;
                                                RecyclerView recyclerViewT = m5n1.t(materialCardViewInflate, 2131430360);
                                                if (recyclerViewT != null) {
                                                    i4 = 2131430361;
                                                    EncoreButton encoreButtonT2 = m5n1.t(materialCardViewInflate, 2131430361);
                                                    if (encoreButtonT2 != null) {
                                                        i4 = 2131430381;
                                                        TextView textView13 = (TextView) m5n1.t(materialCardViewInflate, 2131430381);
                                                        if (textView13 != null) {
                                                            i4 = 2131430390;
                                                            TextView textView14 = (TextView) m5n1.t(materialCardViewInflate, 2131430390);
                                                            if (textView14 != null) {
                                                                i4 = 2131430392;
                                                                TextView textView15 = (TextView) m5n1.t(materialCardViewInflate, 2131430392);
                                                                if (textView15 != null) {
                                                                    i4 = 2131430393;
                                                                    EncoreButton encoreButtonT3 = m5n1.t(materialCardViewInflate, 2131430393);
                                                                    if (encoreButtonT3 != null) {
                                                                        i4 = 2131430394;
                                                                        EncoreButton encoreButtonT4 = m5n1.t(materialCardViewInflate, 2131430394);
                                                                        if (encoreButtonT4 != null) {
                                                                            i4 = 2131430397;
                                                                            TextView textView16 = (TextView) m5n1.t(materialCardViewInflate, 2131430397);
                                                                            if (textView16 != null) {
                                                                                i4 = 2131430469;
                                                                                if (((TextView) m5n1.t(materialCardViewInflate, 2131430469)) != null) {
                                                                                    i4 = 2131430473;
                                                                                    if (((ImageView) m5n1.t(materialCardViewInflate, 2131430473)) != null) {
                                                                                        i4 = 2131430867;
                                                                                        FrameLayout frameLayout = (FrameLayout) m5n1.t(materialCardViewInflate, 2131430867);
                                                                                        if (frameLayout != null) {
                                                                                            MaterialCardView materialCardView = materialCardViewInflate;
                                                                                            i4 = 2131431718;
                                                                                            if (m5n1.t(materialCardViewInflate, 2131431718) != null) {
                                                                                                i4 = 2131431719;
                                                                                                if (m5n1.t(materialCardViewInflate, 2131431719) != null) {
                                                                                                    f0a f0aVar = new f0a(materialCardView, imageView, viewT, linearLayout2, viewT2, textView11, textView12, recyclerViewT, encoreButtonT2, textView13, textView14, textView15, encoreButtonT3, encoreButtonT4, textView16, frameLayout, materialCardView);
                                                                                                    materialCardView.setLayoutParams(new qhl(-1, -2));
                                                                                                    this.b = f0aVar;
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
                }
                bhn0.i("Missing required view with ID: ".concat(materialCardViewInflate.getResources().getResourceName(i4)));
                throw null;
        }
    }

    public ArtworkView b() {
        return ((f2z) this.b).b;
    }

    public final void f(Object obj) {
        int i;
        String str;
        int i2;
        Object next;
        byte b = this.a;
        int i3 = 2;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                zl1 zl1Var = (zl1) obj;
                boolean z = zl1Var.a;
                boolean z2 = zl1Var.f;
                AddToButtonView addToButtonView = (AddToButtonView) obj2;
                addToButtonView.a(new pk1(zl1Var.b ? qk1.b : qk1.a, false, (String) null, (String) null, tk1.c, 12));
                addToButtonView.setVisibility(z ? 0 : 8);
                addToButtonView.setEnabled(z2);
                addToButtonView.setImageAlpha((int) ((z2 ? 1.0f : qx21.a(2131166791, addToButtonView.getResources())) * 255.0f));
                break;
            case 1:
                wco wcoVar = (wco) obj;
                String str2 = wcoVar.b;
                String str3 = wcoVar.d;
                String str4 = wcoVar.c;
                toj0 toj0Var = (toj0) obj2;
                ConstraintLayout constraintLayout = (ConstraintLayout) toj0Var.b;
                TextView textView = (TextView) toj0Var.e;
                TextView textView2 = (TextView) toj0Var.f;
                boolean z3 = wcoVar.f;
                constraintLayout.setTag(Boolean.valueOf(z3));
                constraintLayout.setClickable(z3);
                String str5 = wcoVar.a;
                String str6 = !ihc1.y0(str5) ? str5 : null;
                String str7 = !ihc1.y0(str2) ? str2 : null;
                String str8 = !ihc1.y0(str4) ? str4 : null;
                String strY0 = o7h.y0(f46.i0(new String[]{str6, str7}), ": ", (String) null, (String) null, (iu30) null, 62);
                if (ihc1.y0(strY0)) {
                    strY0 = null;
                }
                constraintLayout.setContentDescription(o7h.y0(f46.i0(new String[]{strY0, str8}), ", ", (String) null, (String) null, (iu30) null, 62));
                ((TextView) toj0Var.g).setText(str5);
                textView2.setText(str2);
                if (ihc1.y0(str4)) {
                    i = 8;
                    textView.setVisibility(8);
                    textView2.setMaxLines(2);
                } else {
                    textView.setText(str4);
                    textView.setVisibility(0);
                    textView2.setMaxLines(1);
                    i = 8;
                }
                PrimaryButtonView primaryButtonView = (PrimaryButtonView) toj0Var.d;
                primaryButtonView.setText(str3);
                if (z3 && str3.length() > 0) {
                    i = 0;
                }
                primaryButtonView.setVisibility(i);
                if (z3) {
                    constraintLayout.setAccessibilityDelegate(new vwd((byte) 0));
                } else {
                    constraintLayout.setAccessibilityDelegate(null);
                }
                WeakHashMap weakHashMap = b8k1.a;
                new l7k1().e(constraintLayout, Boolean.TRUE);
                if (z3) {
                    b8k1.m(constraintLayout, fg.g, !ihc1.y0(str3) ? str3 : null, (sh) null);
                } else {
                    b8k1.l(constraintLayout, fg.g.a());
                    b8k1.h(constraintLayout, 0);
                }
                ((ArtworkView) toj0Var.c).h(new f17(new g07(wcoVar.e, new zz6(4.0f))));
                break;
            case 2:
                oe1 oe1Var = (oe1) obj2;
                oe1Var.b.h(i07.a);
                oe1Var.c.setText((CharSequence) null);
                break;
            case 3:
                jt6 jt6Var = (jt6) obj;
                String str9 = jt6Var.g;
                yu3 yu3Var = (yu3) obj2;
                EncoreListRow encoreListRow = (EncoreListRow) yu3Var.b;
                CommentBubbleView commentBubbleView = (CommentBubbleView) yu3Var.e;
                DateIconView dateIconView = (DateIconView) yu3Var.c;
                ArtworkView artworkView = (ArtworkView) yu3Var.d;
                ((TextView) encoreListRow.getBinding().a.findViewById(2131431371)).setText(jt6Var.d);
                ((TextView) encoreListRow.getBinding().c()).setText(jt6Var.e);
                int dimensionPixelOffset = encoreListRow.getContext().getResources().getDimensionPixelOffset(2131165897);
                encoreListRow.f(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
                int i4 = jt6Var.f;
                if (i4 == -1 || str9 == null || str9.length() == 0) {
                    artworkView.setVisibility(0);
                    dateIconView.setVisibility(8);
                    artworkView.h(ulo1.k(jt6Var.b, new g07(jt6Var.a, yz6.d)));
                } else {
                    artworkView.setVisibility(4);
                    dateIconView.setVisibility(0);
                    dateIconView.a.setText(str9);
                    dateIconView.b.setText(String.valueOf(i4));
                }
                commentBubbleView.f(new oeh(jt6Var.c, jt6Var.h, jt6Var.i));
                zwa zwaVar = new zwa(commentBubbleView, (byte) 15);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) commentBubbleView.getLayoutParams();
                TextView textView3 = (TextView) commentBubbleView.findViewById(2131427602);
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(marginLayoutParams.getMarginStart(), (int) commentBubbleView.getResources().getDimension(2131165333));
                valueAnimatorOfInt.setDuration(1000L);
                valueAnimatorOfInt.setStartDelay(1000L);
                valueAnimatorOfInt.addUpdateListener(new peh(zwaVar, textView3, valueAnimatorOfInt, marginLayoutParams));
                valueAnimatorOfInt.start();
                break;
            case 4:
                if (obj != null) {
                    bhn0.d();
                    break;
                }
                break;
            case 5:
                sfo sfoVar = (sfo) obj;
                String str10 = sfoVar.c;
                wzn wznVar = (wzn) obj2;
                TextView textView4 = (TextView) wznVar.d;
                TextView textView5 = (TextView) wznVar.c;
                TextView textView6 = (TextView) wznVar.b;
                textView4.setText(sfoVar.a);
                String str11 = sfoVar.b;
                boolean z4 = str11 != null;
                textView5.setVisibility(z4 ? 0 : 8);
                if (z4) {
                    textView5.setText(str11);
                }
                boolean z5 = str10 != null;
                textView6.setVisibility(z5 ? 0 : 8);
                if (z5) {
                    textView6.setText(str10);
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) wznVar.a;
                    constraintLayout2.post(new wr3(textView6, constraintLayout2.getContext().getResources().getDimensionPixelSize(2131166960), constraintLayout2, (byte) 3));
                }
                break;
            case 6:
                e8x e8xVar = (e8x) obj;
                String str12 = e8xVar.b;
                a9x a9xVar = (a9x) obj2;
                TextView textView7 = a9xVar.d;
                String str13 = e8xVar.a;
                textView7.setText(str13);
                textView7.setVisibility(str13.length() > 0 ? 0 : 8);
                TextView textView8 = a9xVar.b;
                textView8.setText("");
                textView8.setVisibility(8);
                EncoreButton encoreButton = a9xVar.c;
                encoreButton.setText(str12);
                encoreButton.setVisibility(str12.length() > 0 ? 0 : 8);
                break;
            case 7:
                igz igzVar = (igz) obj;
                yzu yzuVar = (yzu) obj2;
                ((TextView) yzuVar.d).setText(igzVar.a);
                ((TextView) yzuVar.c).setText(igzVar.b);
                ((Button) yzuVar.b).setText(igzVar.c);
                break;
            case 8:
                tb80 tb80Var = (tb80) obj;
                o860 o860Var = (o860) obj2;
                RoundedConstraintLayout roundedConstraintLayout = (RoundedConstraintLayout) o860Var.d;
                SpotifyIconView spotifyIconView = (SpotifyIconView) o860Var.c;
                roundedConstraintLayout.setBackgroundColor(tb80Var.d);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (sb80 sb80Var : tb80Var.b) {
                    spannableStringBuilder.append(sb80Var.a, new ForegroundColorSpan(sb80Var.b), 33);
                }
                ((TextView) o860Var.e).setText(SpannableString.valueOf(spannableStringBuilder));
                spotifyIconView.setIcon(j4b1.valueOf(nhc1.W(tb80Var.a.toUpperCase(Locale.US), "-", "_")));
                spotifyIconView.setColor(tb80Var.c);
                break;
            case 9:
                aqd0 aqd0Var = (aqd0) obj;
                ur00 ur00Var = (ur00) obj2;
                TextView textView9 = (TextView) ur00Var.f;
                TertiaryButtonView tertiaryButtonView = (TertiaryButtonView) ur00Var.d;
                textView9.setText(aqd0Var.a);
                ((TextView) ur00Var.c).setText(aqd0Var.b);
                ((PrimaryButtonView) ur00Var.e).setText(aqd0Var.c);
                String str14 = aqd0Var.d;
                if (str14 == null || str14.length() == 0) {
                    tertiaryButtonView.setVisibility(8);
                } else {
                    tertiaryButtonView.setVisibility(0);
                    tertiaryButtonView.setTextColor(tyd1.b);
                    tertiaryButtonView.setText(str14);
                }
                break;
            case 10:
                rgu0 rgu0Var = (rgu0) obj;
                String str15 = rgu0Var.c;
                String str16 = rgu0Var.b;
                f2z f2zVar = (f2z) obj2;
                ArtworkView artworkView2 = f2zVar.b;
                TextView textView10 = f2zVar.c;
                TextView textView11 = f2zVar.d;
                artworkView2.h(new y07(new g07(rgu0Var.a), false));
                ConstraintLayout constraintLayout3 = f2zVar.a;
                String strY1 = rgu0Var.d;
                if (strY1 == null || strY1.length() <= 0) {
                    List listM = p7h.M(new String[]{str16, str15});
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : listM) {
                        String str17 = (String) obj3;
                        if (str17 != null && str17.length() > 0) {
                            arrayList.add(obj3);
                        }
                    }
                    strY1 = o7h.y0(arrayList, ", ", (String) null, (String) null, (iu30) null, 62);
                }
                constraintLayout3.setContentDescription(strY1);
                textView11.setText(str16);
                textView10.setText(str15);
                if (str16 != null && str16.length() != 0 && str15 != null && str15.length() != 0) {
                    i3 = 1;
                }
                textView11.setLines(i3);
                textView11.setVisibility((str16 == null || str16.length() == 0) ? 8 : 0);
                textView10.setVisibility((str15 == null || str15.length() == 0) ? 8 : 0);
                break;
            case 11:
                vtv0 vtv0Var = (vtv0) obj;
                String str18 = vtv0Var.h;
                String str19 = vtv0Var.e;
                String str20 = vtv0Var.d;
                f0a f0aVar = (f0a) obj2;
                MaterialCardView materialCardView = (MaterialCardView) f0aVar.Q0;
                LinearLayout linearLayout = (LinearLayout) f0aVar.d;
                TextView textView12 = (TextView) f0aVar.t;
                FrameLayout frameLayout = (FrameLayout) f0aVar.P0;
                TextView textView13 = (TextView) f0aVar.f;
                TextView textView14 = (TextView) f0aVar.X;
                Resources resources = materialCardView.getResources();
                int i5 = vtv0Var.l;
                ThreadLocal threadLocal = qx21.a;
                int color = resources.getColor(i5, null);
                TextView textView15 = (TextView) f0aVar.g;
                ((GradientDrawable) textView15.getBackground()).setColor(color);
                EncoreButton encoreButton2 = (EncoreButton) f0aVar.i;
                encoreButton2.setBackgroundColor(color);
                EncoreButton encoreButton3 = (EncoreButton) f0aVar.N0;
                encoreButton3.setBackgroundColor(color);
                TextView textView16 = (TextView) f0aVar.O0;
                textView16.setTextColor(color);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) materialCardView.getLayoutParams();
                DisplayMetrics displayMetrics = materialCardView.getContext().getResources().getDisplayMetrics();
                displayMetrics.getClass();
                int iApplyDimension = (int) TypedValue.applyDimension(1, 16.0f, displayMetrics);
                int iApplyDimension2 = (int) TypedValue.applyDimension(1, 12.0f, displayMetrics);
                marginLayoutParams2.setMargins(iApplyDimension, iApplyDimension2, iApplyDimension, iApplyDimension2);
                materialCardView.setLayoutParams(marginLayoutParams2);
                String str21 = vtv0Var.a;
                if (str21 == null || str21.length() == 0) {
                    textView15.setVisibility(8);
                } else {
                    textView15.setText(str21);
                    textView15.setVisibility(0);
                }
                textView16.setText(vtv0Var.b);
                ((TextView) f0aVar.Y).setText(vtv0Var.c);
                textView14.setText(str20);
                textView14.setVisibility((str20 == null || str20.length() == 0) ? 8 : 0);
                textView13.setVisibility((str19 == null || str19.length() == 0) ? 8 : 0);
                textView13.setText(str19);
                encoreButton2.setVisibility((str18 == null || str18.length() == 0) ? 8 : 0);
                encoreButton2.setText(str18);
                qp20 qp20Var = vtv0Var.o;
                String str22 = vtv0Var.j;
                boolean z6 = vtv0Var.m;
                if ((qp20Var == null || qp20Var.f.isEmpty()) && ((str = vtv0Var.k) == null || str.length() == 0)) {
                    frameLayout.setVisibility(8);
                } else {
                    EncoreButton encoreButton4 = (EncoreButton) f0aVar.Z;
                    frameLayout.setVisibility((str22 == null || str22.length() == 0) ? 8 : 0);
                    encoreButton4.setVisibility(z6 ? 8 : 0);
                    encoreButton3.setVisibility(!z6 ? 8 : 0);
                    encoreButton4.setText(z6 ? null : str22);
                    if (!z6) {
                        str22 = null;
                    }
                    encoreButton3.setText(str22);
                }
                String str23 = vtv0Var.g;
                if (str23 == null || str23.length() == 0) {
                    i2 = 8;
                    textView12.setVisibility(8);
                } else {
                    textView12.setMovementMethod(LinkMovementMethod.getInstance());
                    textView12.setText((Spannable) Html.fromHtml(str23, 0));
                    textView12.setVisibility(0);
                    i2 = 8;
                }
                RecyclerView recyclerView = (RecyclerView) f0aVar.h;
                View view = (View) f0aVar.e;
                linearLayout.setVisibility(i2);
                view.setVisibility(i2);
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                List list = vtv0Var.f;
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        String str24 = ((ttv0) next).b;
                        if (str24 == null || str24.length() == 0) {
                        }
                    } else {
                        next = null;
                    }
                }
                boolean z7 = next != null;
                recyclerView.setAdapter(new stv0(i5, list, z7));
                boolean z8 = list.size() > 5;
                if (z7 && z8) {
                    view.setVisibility(0);
                    view.post(new dhs(this, (byte) 0));
                    linearLayout.setVisibility(0);
                    ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                    n811 n811Var = new n811();
                    n811 n811Var2 = new n811();
                    recyclerView.post(new hw9(n811Var, this, n811Var2, layoutParams, (byte) 6));
                    linearLayout.setOnClickListener(new jmb((byte) 1, n811Var2, new l811(), this, n811Var, layoutParams));
                    break;
                }
                break;
            case 12:
                j511 j511Var = (j511) obj;
                ytp0 ytp0Var = (ytp0) obj2;
                TextView textView17 = (TextView) ytp0Var.f;
                EncoreIconView encoreIconView = (EncoreIconView) ytp0Var.c;
                textView17.setText(j511Var.a);
                ((TextView) ytp0Var.e).setText(j511Var.b);
                ArtworkView artworkView3 = (ArtworkView) ytp0Var.d;
                o17 o17Var = j511Var.c;
                artworkView3.setVisibility(o17Var != null ? 0 : 8);
                if (o17Var != null) {
                    artworkView3.h(o17Var);
                }
                encoreIconView.setVisibility(8);
                break;
            default:
                ((TrackInfoView) obj2).y((lof1) obj);
                break;
        }
    }

    public final View getView() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (AddToButtonView) obj;
            case 1:
                return (ConstraintLayout) ((toj0) obj).b;
            case 2:
                return ((oe1) obj).a;
            case 3:
                return (EncoreListRow) ((yu3) obj).b;
            case 4:
                return ((wde) obj).a;
            case 5:
                return (ConstraintLayout) ((wzn) obj).a;
            case 6:
                return ((a9x) obj).a;
            case 7:
                return (ConstraintLayout) ((yzu) obj).a;
            case 8:
                return (RoundedConstraintLayout) ((o860) obj).b;
            case 9:
                return (ConstraintLayout) ((ur00) obj).b;
            case 10:
                return ((f2z) obj).a;
            case 11:
                return (MaterialCardView) ((f0a) obj).Q0;
            case 12:
                return (ConstraintLayout) ((ytp0) obj).b;
            default:
                return (TrackInfoView) obj;
        }
    }

    public int k(int i) {
        RecyclerView recyclerView = (RecyclerView) ((f0a) this.b).h;
        int measuredHeight = 0;
        rr80 rr80VarM = yoi1.M(yoi1.Q(0, Math.min(i, recyclerView.getChildCount())));
        int i2 = rr80VarM.a;
        int i3 = rr80VarM.b;
        int i4 = rr80VarM.c;
        if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
            while (true) {
                View childAt = recyclerView.getChildAt(i2);
                if (childAt != null) {
                    measuredHeight = childAt.getMeasuredHeight() + measuredHeight;
                }
                if (i2 == i3) {
                    break;
                }
                i2 += i4;
            }
        }
        return measuredHeight;
    }

    public final void n(iu30 iu30Var) {
        byte b = this.a;
        byte b2 = 8;
        byte b3 = 7;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((AddToButtonView) obj).n(new m0o(iu30Var, (byte) 2));
                break;
            case 1:
                toj0 toj0Var = (toj0) obj;
                ConstraintLayout constraintLayout = (ConstraintLayout) toj0Var.b;
                constraintLayout.setOnClickListener(new cg1(this, iu30Var, (byte) 17));
                constraintLayout.setClickable(u890.j(constraintLayout.getTag(), Boolean.TRUE));
                ((PrimaryButtonView) toj0Var.d).setOnClickListener(new v20(iu30Var, (byte) 13));
                break;
            case 2:
                ((oe1) obj).a.setOnClickListener(new v20(iu30Var, (byte) 27));
                break;
            case 3:
                EncoreListRow encoreListRow = (EncoreListRow) ((yu3) obj).b;
                encoreListRow.setOnClickListener(new yer(iu30Var, (byte) 7));
                b8k1.m(encoreListRow, fg.g, encoreListRow.getContext().getString(2131952464), (sh) null);
                break;
            case 4:
                ((wde) obj).a.setOnClickListener(new yer(iu30Var, (byte) 21));
                break;
            case 5:
                ((TextView) ((wzn) obj).b).setOnClickListener(new trr(iu30Var, (byte) 0));
                break;
            case 6:
                ((a9x) obj).c.setOnClickListener(new trr(iu30Var, (byte) 8));
                break;
            case 7:
                ((Button) ((yzu) obj).b).setOnClickListener(new trr(iu30Var, (byte) 18));
                break;
            case 8:
                break;
            case 9:
                ur00 ur00Var = (ur00) obj;
                ((PrimaryButtonView) ur00Var.e).setOnClickListener(new o0s(iu30Var, b3));
                ((TertiaryButtonView) ur00Var.d).setOnClickListener(new o0s(iu30Var, b2));
                break;
            case 10:
                f2z f2zVar = (f2z) obj;
                f2zVar.a.setOnClickListener(new oes(iu30Var, (byte) 3));
                f2zVar.a.setOnLongClickListener(new wer(iu30Var, (byte) 10));
                break;
            case 11:
                f0a f0aVar = (f0a) obj;
                ((EncoreButton) f0aVar.i).setOnClickListener(new oes(iu30Var, (byte) 16));
                ((EncoreButton) f0aVar.Z).setOnClickListener(new oes(iu30Var, (byte) 17));
                ((EncoreButton) f0aVar.N0).setOnClickListener(new oes(iu30Var, (byte) 18));
                break;
            case 12:
                ((ConstraintLayout) ((ytp0) obj).b).setOnClickListener(new sis(iu30Var, (byte) 10));
                break;
            default:
                ((TrackInfoView) obj).Y0 = iu30Var;
                break;
        }
    }

    private final void l(iu30 iu30Var) {
    }

    public ver(Context context, gw70 gw70Var, boolean z, boolean z2) {
        this.a = (byte) 12;
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131625578, (ViewGroup) null, false);
        int i = 2131429223;
        EncoreIconView encoreIconViewT = m5n1.t(constraintLayoutInflate, 2131429223);
        if (encoreIconViewT != null) {
            i = 2131429612;
            View view = (ArtworkView) m5n1.t(constraintLayoutInflate, 2131429612);
            if (view != null) {
                i = 2131431115;
                TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131431115);
                if (textView != null) {
                    i = 2131431276;
                    if (((LinearLayout) m5n1.t(constraintLayoutInflate, 2131431276)) != null) {
                        i = 2131431356;
                        TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                        if (textView2 != null) {
                            ConstraintLayout constraintLayout = constraintLayoutInflate;
                            ytp0 ytp0Var = new ytp0((Object) constraintLayout, (Object) encoreIconViewT, (Object) view, (Object) textView, (Object) textView2, (byte) 27);
                            int dimensionPixelSize = constraintLayout.getResources().getDimensionPixelSize(2131166157);
                            int dimensionPixelSize2 = constraintLayout.getResources().getDimensionPixelSize(2131166152);
                            qhl qhlVar = new qhl(-1, -2);
                            qhlVar.setMargins(0, dimensionPixelSize, 0, dimensionPixelSize2);
                            constraintLayout.setLayoutParams(qhlVar);
                            v9w0 v9w0VarQ = b2u.q(constraintLayout);
                            Collections.addAll(v9w0VarQ.d, view);
                            Collections.addAll(v9w0VarQ.c, textView2, textView);
                            v9w0VarQ.a();
                            view.setViewContext(new f47(gw70Var));
                            b8k1.q(constraintLayout, true);
                            int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(z ? 2131166153 : 2131166155);
                            int i2 = (z2 || z) ? 2132018024 : 2132018023;
                            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                            if (layoutParams != null) {
                                layoutParams.height = dimensionPixelSize3;
                                layoutParams.width = dimensionPixelSize3;
                                view.setLayoutParams(layoutParams);
                                textView2.setTextAppearance(i2);
                                this.b = ytp0Var;
                                return;
                            }
                            bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                            throw null;
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0136 A[PHI: r4
      0x0136: PHI (r4v8 int) = (r4v7 int), (r4v9 int), (r4v10 int), (r4v11 int) binds: [B:19:0x00cf, B:21:0x00db, B:23:0x00e7, B:25:0x00f4] A[DONT_GENERATE, DONT_INLINE]] */
    public ver(Context context, gw70 gw70Var, byte b) {
        this.a = b;
        int i = 2131431356;
        switch (b) {
            case 2:
                ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131624021, (ViewGroup) null, false);
                ConstraintLayout constraintLayout = constraintLayoutInflate;
                View view = (ArtworkView) m5n1.t(constraintLayoutInflate, 2131427611);
                if (view != null) {
                    TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                    if (textView != null) {
                        oe1 oe1Var = new oe1(constraintLayout, view, textView);
                        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        view.setViewContext(new f47(gw70Var));
                        v9w0 v9w0VarQ = b2u.q(constraintLayout);
                        Collections.addAll(v9w0VarQ.c, textView);
                        Collections.addAll(v9w0VarQ.d, view);
                        v9w0VarQ.a();
                        this.b = oe1Var;
                        return;
                    }
                } else {
                    i = 2131427611;
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
                throw null;
            case 3:
                EncoreListRow encoreListRowInflate = LayoutInflater.from(context).inflate(2131624062, (ViewGroup) null, false);
                int i2 = 2131427608;
                DateIconView dateIconView = (DateIconView) m5n1.t(encoreListRowInflate, 2131427608);
                if (dateIconView != null) {
                    i2 = 2131427609;
                    View view2 = (ArtworkView) m5n1.t(encoreListRowInflate, 2131427609);
                    if (view2 != null) {
                        i2 = 2131428130;
                        CommentBubbleView commentBubbleView = (CommentBubbleView) m5n1.t(encoreListRowInflate, 2131428130);
                        if (commentBubbleView != null) {
                            EncoreListRow encoreListRow = encoreListRowInflate;
                            yu3 yu3Var = new yu3(encoreListRow, dateIconView, view2, commentBubbleView, (byte) 9);
                            encoreListRow.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                            kil kilVar = new kil();
                            kilVar.f(encoreListRow.getBinding().a());
                            kilVar.g(2131430482, 7, 2131428633, 7);
                            kilVar.b(encoreListRow.getBinding().a());
                            encoreListRow.getBinding().a().setClipChildren(false);
                            encoreListRow.getBinding().a.findViewById(2131430482).bringToFront();
                            commentBubbleView.getCommentImage().setViewContext(new f47(gw70Var));
                            view2.setViewContext(new f47(gw70Var));
                            v9w0 v9w0VarP = b2u.p(encoreListRow.getBinding().a());
                            Collections.addAll(v9w0VarP.d, commentBubbleView.getCommentImage(), view2);
                            v9w0VarP.a();
                            this.b = yu3Var;
                            return;
                        }
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(encoreListRowInflate.getResources().getResourceName(i2)));
                throw null;
            case 10:
                ConstraintLayout constraintLayoutInflate2 = LayoutInflater.from(context).inflate(2131625407, (ViewGroup) null, false);
                ConstraintLayout constraintLayout2 = constraintLayoutInflate2;
                int i3 = 2131428509;
                DownloadBadgeView downloadBadgeViewT = m5n1.t(constraintLayoutInflate2, 2131428509);
                if (downloadBadgeViewT != null) {
                    i3 = 2131428510;
                    DownloadBadgeView downloadBadgeViewT2 = m5n1.t(constraintLayoutInflate2, 2131428510);
                    if (downloadBadgeViewT2 != null) {
                        i3 = 2131429612;
                        View view3 = (ArtworkView) m5n1.t(constraintLayoutInflate2, 2131429612);
                        if (view3 != null) {
                            i3 = 2131431115;
                            TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate2, 2131431115);
                            if (textView2 != null) {
                                TextView textView3 = (TextView) m5n1.t(constraintLayoutInflate2, 2131431356);
                                if (textView3 != null) {
                                    f2z f2zVar = new f2z(constraintLayout2, downloadBadgeViewT, downloadBadgeViewT2, view3, textView2, textView3);
                                    view3.setViewContext(new f47(gw70Var));
                                    v9w0 v9w0VarP2 = b2u.p(constraintLayout2);
                                    ArrayList arrayList = v9w0VarP2.c;
                                    Collections.addAll(arrayList, textView3);
                                    Collections.addAll(arrayList, textView2);
                                    Collections.addAll(v9w0VarP2.d, view3);
                                    v9w0VarP2.a();
                                    this.b = f2zVar;
                                    a();
                                    e();
                                    return;
                                }
                            } else {
                                i = i3;
                            }
                        } else {
                            i = i3;
                        }
                    } else {
                        i = i3;
                    }
                } else {
                    i = i3;
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate2.getResources().getResourceName(i)));
                throw null;
            default:
                ConstraintLayout constraintLayoutInflate3 = LayoutInflater.from(context).inflate(2131624313, (ViewGroup) null, false);
                int i4 = 2131428291;
                View view4 = (ArtworkView) m5n1.t(constraintLayoutInflate3, 2131428291);
                if (view4 != null) {
                    i4 = 2131428292;
                    View view5 = (PrimaryButtonView) m5n1.t(constraintLayoutInflate3, 2131428292);
                    if (view5 != null) {
                        i4 = 2131428297;
                        TextView textView4 = (TextView) m5n1.t(constraintLayoutInflate3, 2131428297);
                        if (textView4 != null) {
                            i4 = 2131428298;
                            TextView textView5 = (TextView) m5n1.t(constraintLayoutInflate3, 2131428298);
                            if (textView5 != null) {
                                i4 = 2131428300;
                                TextView textView6 = (TextView) m5n1.t(constraintLayoutInflate3, 2131428300);
                                if (textView6 != null) {
                                    ConstraintLayout constraintLayout3 = constraintLayoutInflate3;
                                    toj0 toj0Var = new toj0(constraintLayout3, view4, view5, textView4, textView5, textView6, (byte) 9);
                                    constraintLayout3.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                    view4.setViewContext(new f47(gw70Var));
                                    view5.setImportantForAccessibility(4);
                                    v9w0 v9w0VarP3 = b2u.p(constraintLayout3);
                                    Collections.addAll(v9w0VarP3.c, textView6, textView5, textView4, view5);
                                    Collections.addAll(v9w0VarP3.d, view4);
                                    v9w0VarP3.a();
                                    this.b = toj0Var;
                                    return;
                                }
                            }
                        }
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate3.getResources().getResourceName(i4)));
                throw null;
        }
    }

    public ver(TrackInfoView trackInfoView) {
        this.a = (byte) 13;
        this.b = trackInfoView;
    }
}
