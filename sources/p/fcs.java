package p;

import android.content.Context;
import android.net.Uri;
import android.os.Trace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.spotify.artist.uiusecases.artistpick.elements.CommentBubbleView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoremobile.buttons.PrimaryButtonView;
import com.spotify.encoremobile.buttons.TertiaryButtonView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.icons.IconImage;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.encoremobile.roundedcorner.RoundedConstraintLayout;
import com.spotify.nowplayingmini.uicomponents.trackinfo.TrackInfoView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fcs implements qzh, e391 {
    public final /* synthetic */ byte a;
    public final Object b;

    /* JADX WARN: Code duplicated, block: B:138:0x04f7 A[PHI: r4
      0x04f7: PHI (r4v1 int) = (r4v0 int), (r4v2 int), (r4v4 int), (r4v5 int), (r4v6 int) binds: [B:114:0x043c, B:116:0x0449, B:120:0x045e, B:122:0x046b, B:124:0x0476] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0248 A[PHI: r4
      0x0248: PHI (r4v36 int) = (r4v0 int), (r4v38 int), (r4v39 int) binds: [B:49:0x01ea, B:53:0x0205, B:55:0x0212] A[DONT_GENERATE, DONT_INLINE]] */
    public fcs(Context context, gw70 gw70Var, byte b) {
        this.a = b;
        int i = 2131431115;
        int i2 = 2131427455;
        int i3 = 2131429612;
        int i4 = 2131427611;
        switch (b) {
            case 3:
                View viewInflate = LayoutInflater.from(context).inflate(2131624063, (ViewGroup) null, false);
                EncoreButton encoreButtonT = m5n1.t(viewInflate, 2131427455);
                if (encoreButtonT != null) {
                    i2 = 2131427676;
                    IconImage iconImageT = m5n1.t(viewInflate, 2131427676);
                    if (iconImageT == null) {
                        i = i2;
                    } else {
                        View view = (ArtworkView) m5n1.t(viewInflate, 2131427677);
                        if (view != null) {
                            i2 = 2131427907;
                            if (m5n1.t(viewInflate, 2131427907) != null) {
                                i2 = 2131428130;
                                CommentBubbleView commentBubbleView = (CommentBubbleView) m5n1.t(viewInflate, 2131428130);
                                if (commentBubbleView != null) {
                                    i2 = 2131429745;
                                    if (m5n1.t(viewInflate, 2131429745) != null) {
                                        TextView textView = (TextView) m5n1.t(viewInflate, 2131431115);
                                        if (textView != null) {
                                            i = 2131431200;
                                            if (m5n1.t(viewInflate, 2131431200) != null) {
                                                i = 2131431201;
                                                LinearLayout linearLayout = (LinearLayout) m5n1.t(viewInflate, 2131431201);
                                                if (linearLayout != null) {
                                                    i = 2131431209;
                                                    TextView textView2 = (TextView) m5n1.t(viewInflate, 2131431209);
                                                    if (textView2 != null) {
                                                        TextView textView3 = (TextView) m5n1.t(viewInflate, 2131431356);
                                                        if (textView3 != null) {
                                                            FrameLayout frameLayout = (FrameLayout) viewInflate;
                                                            kp5 kp5Var = new kp5(frameLayout, (View) encoreButtonT, (View) iconImageT, view, (View) commentBubbleView, textView, (View) linearLayout, (View) textView2, textView3);
                                                            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                                            view.setViewContext(new f47(gw70Var));
                                                            commentBubbleView.getCommentImage().setViewContext(new f47(gw70Var));
                                                            v9w0 v9w0VarP = b2u.p(frameLayout);
                                                            Collections.addAll(v9w0VarP.d, commentBubbleView.getCommentImage(), view);
                                                            v9w0VarP.a();
                                                            this.b = kp5Var;
                                                            return;
                                                        }
                                                        i = 2131431356;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i = i2;
                                    }
                                } else {
                                    i = i2;
                                }
                            } else {
                                i = i2;
                            }
                        } else {
                            i = 2131427677;
                        }
                    }
                } else {
                    i = i2;
                }
                bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
                throw null;
            case 4:
                CardView cardViewInflate = LayoutInflater.from(context).inflate(2131624335, (ViewGroup) null, false);
                View view2 = (ArtworkView) m5n1.t(cardViewInflate, 2131427611);
                if (view2 != null) {
                    CardView cardView = cardViewInflate;
                    i4 = 2131428100;
                    if (((ImageView) m5n1.t(cardViewInflate, 2131428100)) != null) {
                        xid xidVar = new xid(cardView, view2, (byte) 14);
                        view2.setViewContext(new f47(gw70Var));
                        v9w0 v9w0VarP2 = b2u.p(cardView);
                        Collections.addAll(v9w0VarP2.d, view2);
                        v9w0VarP2.a();
                        this.b = xidVar;
                        return;
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(cardViewInflate.getResources().getResourceName(i4)));
                throw null;
            case 5:
                RoundedConstraintLayout roundedConstraintLayoutInflate = LayoutInflater.from(context).inflate(2131624503, (ViewGroup) null, false);
                RoundedConstraintLayout roundedConstraintLayout = roundedConstraintLayoutInflate;
                View view3 = (ArtworkView) m5n1.t(roundedConstraintLayoutInflate, 2131429612);
                if (view3 == null) {
                    bhn0.i("Missing required view with ID: ".concat(roundedConstraintLayoutInflate.getResources().getResourceName(2131429612)));
                    throw null;
                }
                oql oqlVar = new oql(roundedConstraintLayout, view3, (byte) 16);
                view3.setViewContext(new f47(gw70Var));
                v9w0 v9w0VarP3 = b2u.p(roundedConstraintLayout);
                Collections.addAll(v9w0VarP3.d, view3);
                v9w0VarP3.a();
                roundedConstraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                this.b = oqlVar;
                return;
            case 6:
                Trace.beginSection("ECM:EpisodeCard:inflate");
                try {
                    f2z f2zVarA = ((Boolean) ycn0.d.getValue()).booleanValue() ? f2z.a(new tex0(context)) : f2z.a(LayoutInflater.from(context).inflate(2131624599, (ViewGroup) null, false));
                    Trace.endSection();
                    View view4 = f2zVarA.b;
                    view4.setViewContext(new f47(gw70Var));
                    v9w0 v9w0VarP4 = b2u.p(f2zVarA.a);
                    Collections.addAll(v9w0VarP4.c, f2zVarA.d, f2zVarA.c);
                    Collections.addAll(v9w0VarP4.d, view4);
                    v9w0VarP4.a();
                    this.b = f2zVarA;
                    a();
                    e();
                    return;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 7:
                View viewInflate2 = LayoutInflater.from(context).inflate(2131624710, (ViewGroup) null, false);
                int i5 = 2131427734;
                ArtworkView artworkViewT = m5n1.t(viewInflate2, 2131427734);
                if (artworkViewT != null) {
                    i5 = 2131428441;
                    TextView textView4 = (TextView) m5n1.t(viewInflate2, 2131428441);
                    if (textView4 != null) {
                        i5 = 2131428442;
                        TextView textView5 = (TextView) m5n1.t(viewInflate2, 2131428442);
                        if (textView5 != null) {
                            i5 = 2131428492;
                            TertiaryButtonView tertiaryButtonViewT = m5n1.t(viewInflate2, 2131428492);
                            if (tertiaryButtonViewT != null) {
                                i5 = 2131428647;
                                if (m5n1.t(viewInflate2, 2131428647) != null) {
                                    i5 = 2131430214;
                                    PrimaryButtonView primaryButtonViewT = m5n1.t(viewInflate2, 2131430214);
                                    if (primaryButtonViewT != null) {
                                        ScrollView scrollView = (ScrollView) viewInflate2;
                                        i5 = 2131431070;
                                        if (m5n1.t(viewInflate2, 2131431070) != null) {
                                            i5 = 2131431360;
                                            TextView textView6 = (TextView) m5n1.t(viewInflate2, 2131431360);
                                            if (textView6 != null) {
                                                i5 = 2131431448;
                                                if (m5n1.t(viewInflate2, 2131431448) != null) {
                                                    p410 p410Var = new p410(scrollView, artworkViewT, textView4, textView5, tertiaryButtonViewT, primaryButtonViewT, textView6, (byte) 7);
                                                    scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                                    artworkViewT.setViewContext(new f47(gw70Var));
                                                    this.b = p410Var;
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
                bhn0.i("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i5)));
                throw null;
            case 8:
            case 9:
            case 11:
            case 12:
            default:
                ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131624060, (ViewGroup) null, false);
                View view5 = (ArtworkView) m5n1.t(constraintLayoutInflate, 2131427611);
                if (view5 != null) {
                    ConstraintLayout constraintLayout = constraintLayoutInflate;
                    TextView textView7 = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                    if (textView7 != null) {
                        oe1 oe1Var = new oe1(constraintLayout, view5, textView7);
                        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        view5.setViewContext(new f47(gw70Var));
                        v9w0 v9w0VarQ = b2u.q(constraintLayout);
                        Collections.addAll(v9w0VarQ.c, textView7);
                        Collections.addAll(v9w0VarQ.d, view5);
                        v9w0VarQ.e = false;
                        v9w0VarQ.a();
                        this.b = oe1Var;
                        return;
                    }
                    i4 = 2131431356;
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i4)));
                throw null;
            case 10:
                ConstraintLayout constraintLayoutInflate2 = LayoutInflater.from(context).inflate(2131624522, (ViewGroup) null, false);
                Button button = (Button) m5n1.t(constraintLayoutInflate2, 2131427455);
                if (button == null) {
                    i = i2;
                } else {
                    ArtworkView artworkViewT2 = m5n1.t(constraintLayoutInflate2, 2131427611);
                    if (artworkViewT2 != null) {
                        ConstraintLayout constraintLayout2 = constraintLayoutInflate2;
                        i2 = 2131428438;
                        TextView textView8 = (TextView) m5n1.t(constraintLayoutInflate2, 2131428438);
                        if (textView8 != null) {
                            i2 = 2131429060;
                            Guideline guidelineT = m5n1.t(constraintLayoutInflate2, 2131429060);
                            if (guidelineT != null) {
                                TextView textView9 = (TextView) m5n1.t(constraintLayoutInflate2, 2131431115);
                                if (textView9 != null) {
                                    TextView textView10 = (TextView) m5n1.t(constraintLayoutInflate2, 2131431356);
                                    if (textView10 != null) {
                                        goq goqVar = new goq(constraintLayout2, button, artworkViewT2, textView8, guidelineT, textView9, textView10, (byte) 14);
                                        constraintLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                                        artworkViewT2.setViewContext(new f47(gw70Var));
                                        this.b = goqVar;
                                        return;
                                    }
                                    i = 2131431356;
                                }
                            } else {
                                i = i2;
                            }
                        } else {
                            i = i2;
                        }
                    } else {
                        i = 2131427611;
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate2.getResources().getResourceName(i)));
                throw null;
            case 13:
                RoundedConstraintLayout roundedConstraintLayoutInflate2 = LayoutInflater.from(context).inflate(2131626274, (ViewGroup) null, false);
                if (((ImageView) m5n1.t(roundedConstraintLayoutInflate2, 2131427677)) != null) {
                    RoundedConstraintLayout roundedConstraintLayout2 = roundedConstraintLayoutInflate2;
                    TextView textView11 = (TextView) m5n1.t(roundedConstraintLayoutInflate2, 2131428299);
                    if (textView11 != null) {
                        View view6 = (ArtworkView) m5n1.t(roundedConstraintLayoutInflate2, 2131429612);
                        if (view6 != null) {
                            i3 = 2131429710;
                            TextView textView12 = (TextView) m5n1.t(roundedConstraintLayoutInflate2, 2131429710);
                            if (textView12 != null) {
                                TextView textView13 = (TextView) m5n1.t(roundedConstraintLayoutInflate2, 2131431356);
                                if (textView13 != null) {
                                    this.b = new vi11(roundedConstraintLayout2, textView11, view6, textView12, textView13, (byte) 18);
                                    view6.setViewContext(new f47(gw70Var));
                                    v9w0 v9w0VarP5 = b2u.p(roundedConstraintLayout2);
                                    Collections.addAll(v9w0VarP5.d, view6);
                                    Collections.addAll(v9w0VarP5.c, textView12, textView13);
                                    v9w0VarP5.a();
                                    return;
                                }
                                i3 = 2131431356;
                            }
                        }
                    } else {
                        i3 = 2131428299;
                    }
                } else {
                    i3 = 2131427677;
                }
                bhn0.i("Missing required view with ID: ".concat(roundedConstraintLayoutInflate2.getResources().getResourceName(i3)));
                throw null;
            case 14:
                ConstraintLayout constraintLayoutInflate3 = LayoutInflater.from(context).inflate(2131625090, (ViewGroup) null, false);
                int i6 = 2131428291;
                View view7 = (ArtworkView) m5n1.t(constraintLayoutInflate3, 2131428291);
                if (view7 != null) {
                    i6 = 2131428292;
                    View view8 = (PrimaryButtonView) m5n1.t(constraintLayoutInflate3, 2131428292);
                    if (view8 != null) {
                        ConstraintLayout constraintLayout3 = constraintLayoutInflate3;
                        i6 = 2131428297;
                        TextView textView14 = (TextView) m5n1.t(constraintLayoutInflate3, 2131428297);
                        if (textView14 != null) {
                            i6 = 2131428298;
                            TextView textView15 = (TextView) m5n1.t(constraintLayoutInflate3, 2131428298);
                            if (textView15 != null) {
                                i6 = 2131428300;
                                TextView textView16 = (TextView) m5n1.t(constraintLayoutInflate3, 2131428300);
                                if (textView16 != null) {
                                    i6 = 2131429067;
                                    if (m5n1.t(constraintLayoutInflate3, 2131429067) != null) {
                                        i6 = 2131429068;
                                        if (m5n1.t(constraintLayoutInflate3, 2131429068) != null) {
                                            p410 p410Var2 = new p410(constraintLayout3, view7, view8, constraintLayout3, textView14, textView15, textView16, (byte) 9);
                                            constraintLayout3.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                            view7.setViewContext(new f47(gw70Var));
                                            v9w0 v9w0VarP6 = b2u.p(constraintLayout3);
                                            Collections.addAll(v9w0VarP6.c, textView16, textView15, textView14, view8);
                                            Collections.addAll(v9w0VarP6.d, view7);
                                            v9w0VarP6.a();
                                            this.b = p410Var2;
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate3.getResources().getResourceName(i6)));
                throw null;
        }
    }

    public ArtworkView b() {
        return ((f2z) this.b).b;
    }

    public final void f(Object obj) {
        byte b = this.a;
        int i = 2;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                jx jxVar = (jx) obj;
                String str = jxVar.e;
                cp31 cp31Var = (cp31) obj2;
                EncoreTextView encoreTextView = (EncoreTextView) cp31Var.f;
                EncoreTextView encoreTextView2 = (EncoreTextView) cp31Var.d;
                encoreTextView.setText(jxVar.a);
                String str2 = jxVar.b;
                int length = str2.length();
                EncoreTextView encoreTextView3 = (EncoreTextView) cp31Var.e;
                if (length > 0) {
                    encoreTextView3.setVisibility(0);
                    encoreTextView3.setText(str2);
                } else {
                    encoreTextView3.setVisibility(8);
                }
                if (str.length() > 0) {
                    encoreTextView2.setVisibility(0);
                    encoreTextView2.setText(str);
                } else {
                    encoreTextView2.setVisibility(8);
                }
                ((View) cp31Var.c).setVisibility(jxVar.c ? 0 : 8);
                ((ConstraintLayout) cp31Var.a).setEnabled(jxVar.d);
                break;
            case 2:
                pq6 pq6Var = (pq6) obj;
                oe1 oe1Var = (oe1) obj2;
                oe1Var.c.setText(pq6Var.a);
                oe1Var.b.h(new l07(new g07(pq6Var.b), false));
                break;
            case 3:
                mt6 mt6Var = (mt6) obj;
                String str3 = mt6Var.f;
                g07 g07Var = mt6Var.a;
                kp5 kp5Var = (kp5) obj2;
                TextView textView = (TextView) kp5Var.h;
                LinearLayout linearLayout = (LinearLayout) kp5Var.g;
                CommentBubbleView commentBubbleView = (CommentBubbleView) kp5Var.e;
                textView.setText(mt6Var.c);
                ((EncoreButton) kp5Var.b).setText(mt6Var.e);
                String str4 = mt6Var.d;
                int length2 = str4.length();
                TextView textView2 = (TextView) kp5Var.f;
                if (length2 > 0) {
                    textView2.setText(str4);
                    textView2.setVisibility(0);
                } else {
                    textView2.setVisibility(8);
                }
                linearLayout.setVisibility(4);
                String str5 = g07Var.a;
                if (str5 != null && str5.length() != 0) {
                    ((IconImage) kp5Var.c).setVisibility(8);
                }
                ((ArtworkView) kp5Var.d).h(new w07(g07Var, (rk70) null));
                if (str3 == null || str3.length() <= 0) {
                    commentBubbleView.setVisibility(4);
                } else {
                    commentBubbleView.f(new oeh(mt6Var.b, str3, true));
                    commentBubbleView.setVisibility(0);
                }
                break;
            case 4:
                ((ArtworkView) ((xid) obj2).c).h(new y07(new g07(((fpg) obj).a), false));
                break;
            case 5:
                ago agoVar = (ago) obj;
                oql oqlVar = (oql) obj2;
                ((ArtworkView) oqlVar.c).h(new y07(new g07(agoVar.a), false));
                ((RoundedConstraintLayout) oqlVar.b).setContentDescription(agoVar.b);
                break;
            case 6:
                c2z c2zVar = (c2z) obj;
                f2z f2zVar = (f2z) obj2;
                TextView textView3 = f2zVar.d;
                String str6 = c2zVar.a;
                textView3.setText(str6);
                TextView textView4 = f2zVar.c;
                String str7 = c2zVar.b;
                textView4.setText(str7);
                f2zVar.b.h(new t07(c2zVar.c, false));
                TextView textView5 = f2zVar.d;
                if (str6.length() != 0 && str7.length() != 0) {
                    i = 1;
                }
                textView5.setLines(i);
                textView5.setVisibility(str6.length() > 0 ? 0 : 8);
                textView4.setVisibility(str7.length() > 0 ? 0 : 8);
                break;
            case 7:
                f640 f640Var = (f640) obj;
                p410 p410Var = (p410) obj2;
                ArtworkView artworkView = (ArtworkView) p410Var.c;
                Uri uri = f640Var.d;
                artworkView.h(new e17(new g07(uri != null ? uri.toString() : null)));
                ((TextView) p410Var.h).setText(f640Var.a);
                ((TextView) p410Var.e).setText(f640Var.b);
                ((TextView) p410Var.d).setText(f640Var.c);
                ((PrimaryButtonView) p410Var.g).setText(f640Var.e);
                TertiaryButtonView tertiaryButtonView = (TertiaryButtonView) p410Var.f;
                tertiaryButtonView.setText(f640Var.f);
                tertiaryButtonView.setTextColor(tyd1.a);
                break;
            case 8:
                gc90 gc90Var = (gc90) obj;
                PrimaryButtonView primaryButtonView = ((hc90) ((idd1) obj2).getValue()).b;
                boolean z = gc90Var.b;
                primaryButtonView.setTag(2131429658, Boolean.valueOf(z));
                primaryButtonView.setText(gc90Var.a);
                primaryButtonView.setEnabled(z);
                break;
            case 9:
                w4g0 w4g0Var = (w4g0) obj;
                wp20 wp20Var = (wp20) obj2;
                ((EncoreTextView) wp20Var.e).setText(w4g0Var.a);
                ((EncoreTextView) wp20Var.d).setText(w4g0Var.b);
                ((View) wp20Var.c).setVisibility(w4g0Var.c ? 8 : 0);
                break;
            case 10:
                wku0 wku0Var = (wku0) obj;
                uku0 uku0Var = wku0Var.e;
                goq goqVar = (goq) obj2;
                ((TextView) goqVar.h).setText(wku0Var.a);
                ((TextView) goqVar.f).setText(wku0Var.b);
                TextView textView6 = (TextView) goqVar.d;
                String str8 = wku0Var.d;
                textView6.setText(str8);
                Button button = (Button) goqVar.b;
                String str9 = wku0Var.c;
                button.setText(str9);
                textView6.setVisibility(str8.length() > 0 ? 0 : 8);
                button.setVisibility(str9.length() > 0 ? 0 : 8);
                ((Guideline) goqVar.e).setGuidelinePercent(0.6f);
                ((ArtworkView) goqVar.c).setVisibility(uku0Var.equals(uku0.a) ? 8 : 0);
                if (!(uku0Var instanceof uku0)) {
                    eg.o();
                    break;
                }
                break;
            case 11:
                r3w0 r3w0Var = (r3w0) obj;
                toj0 toj0Var = (toj0) obj2;
                toj0Var.f = r3w0Var;
                h98 h98Var = (h98) toj0Var.e;
                List<s3w0> list = r3w0Var.a;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (s3w0 s3w0Var : list) {
                    s3w0Var.getClass();
                    arrayList.add(new t7l1(new h8l1("", (String) null, (String) null, String.format(((LinearLayout) toj0Var.d).getResources().getString(2131963833), Arrays.copyOf(new Object[]{s3w0Var.b}, 1)), s3w0Var.c, s3w0Var.f, (Float) null, (String) null, 964), new s7l1(s3w0Var.d, "watch-feed-entrypoint-prerelease", s3w0Var.e)));
                }
                h98Var.getClass();
                h0z h0zVar = (h0z) h98Var.c;
                pes0 pes0Var = (pes0) h98Var.b;
                if (pes0Var.b.getAdapter() == null) {
                    pes0Var.b.setAdapter(h0zVar);
                }
                h0zVar.C(arrayList);
                break;
            case 12:
                ((EncoreButton) ((m021) obj2).c).setText(((gk51) obj).a);
                break;
            case 13:
                hif1 hif1Var = (hif1) obj;
                vi11 vi11Var = (vi11) obj2;
                ((TextView) vi11Var.e).setText(hif1Var.a);
                ((TextView) vi11Var.f).setText(hif1Var.b);
                ((TextView) vi11Var.c).setText(hif1Var.c);
                ((ArtworkView) vi11Var.d).h(new y07(new g07(hif1Var.e), false));
                break;
            case 14:
                wco wcoVar = (wco) obj;
                p410 p410Var2 = (p410) obj2;
                String str10 = wcoVar.c;
                if (ihc1.y0(wcoVar.a)) {
                    ((TextView) p410Var2.h).setVisibility(8);
                }
                TextView textView7 = (TextView) p410Var2.g;
                ConstraintLayout constraintLayout = (ConstraintLayout) p410Var2.b;
                TextView textView8 = (TextView) p410Var2.f;
                textView7.setText(wcoVar.b);
                if (ihc1.y0(str10)) {
                    textView8.setVisibility(8);
                    textView7.setMaxLines(2);
                } else {
                    textView8.setText(str10);
                    textView8.setVisibility(0);
                    textView7.setMaxLines(1);
                }
                textView7.setTextColor(((ConstraintLayout) p410Var2.e).getContext().getColor(2131102468));
                ((PrimaryButtonView) p410Var2.d).setText(wcoVar.d);
                ((ArtworkView) p410Var2.c).h(new e17(new g07(wcoVar.e, new zz6(4.0f))));
                Integer num = wcoVar.g;
                constraintLayout.getBackground().setColorFilter(lm5.g(num != null ? num.intValue() : constraintLayout.getContext().getColor(2131102456), 4));
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
                return (AppCompatImageButton) obj;
            case 1:
                return (ConstraintLayout) ((cp31) obj).a;
            case 2:
                return ((oe1) obj).a;
            case 3:
                return (FrameLayout) ((kp5) obj).a;
            case 4:
                return (CardView) ((xid) obj).b;
            case 5:
                return (RoundedConstraintLayout) ((oql) obj).b;
            case 6:
                return ((f2z) obj).a;
            case 7:
                return (ScrollView) ((p410) obj).b;
            case 8:
                return ((hc90) ((idd1) obj).getValue()).a;
            case 9:
                return (ConstraintLayout) ((wp20) obj).a;
            case 10:
                return (ConstraintLayout) ((goq) obj).g;
            case 11:
                return (LinearLayout) ((toj0) obj).d;
            case 12:
                return (ConstraintLayout) ((m021) obj).b;
            case 13:
                return (RoundedConstraintLayout) ((vi11) obj).b;
            case 14:
                return (ConstraintLayout) ((p410) obj).b;
            default:
                return (TrackInfoView) obj;
        }
    }

    public final void n(iu30 iu30Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((AppCompatImageButton) obj).setOnClickListener(new o0s(iu30Var, (byte) 19));
                break;
            case 1:
                ((ConstraintLayout) ((cp31) obj).a).setOnClickListener(new v20(iu30Var, (byte) 25));
                break;
            case 2:
                ((oe1) obj).a.setOnClickListener(new yer(iu30Var, (byte) 5));
                break;
            case 3:
                ((FrameLayout) ((kp5) obj).a).setOnClickListener(new yer(iu30Var, (byte) 8));
                break;
            case 4:
                ((CardView) ((xid) obj).b).setOnClickListener(new yer(iu30Var, (byte) 24));
                break;
            case 5:
                ((RoundedConstraintLayout) ((oql) obj).b).setOnClickListener(new trr(iu30Var, (byte) 1));
                break;
            case 6:
                f2z f2zVar = (f2z) obj;
                f2zVar.a.setOnClickListener(new trr(iu30Var, (byte) 9));
                f2zVar.a.setOnLongClickListener(new wer(iu30Var, (byte) 2));
                break;
            case 7:
                p410 p410Var = (p410) obj;
                ((PrimaryButtonView) p410Var.g).setOnClickListener(new trr(iu30Var, (byte) 26));
                ((TertiaryButtonView) p410Var.f).setOnClickListener(new trr(iu30Var, (byte) 27));
                break;
            case 8:
                ((hc90) ((idd1) obj).getValue()).b.setOnClickListener(new o0s(iu30Var, (byte) 5));
                break;
            case 9:
                ((ConstraintLayout) ((wp20) obj).a).setOnClickListener(new o0s(iu30Var, (byte) 9));
                break;
            case 10:
                ((Button) ((goq) obj).b).setOnClickListener(new oes(iu30Var, (byte) 6));
                break;
            case 11:
                toj0 toj0Var = (toj0) obj;
                ((h98) toj0Var.e).n(new y0o(iu30Var, toj0Var, (byte) 29));
                break;
            case 12:
                ((EncoreButton) ((m021) obj).c).setOnClickListener(new sis(iu30Var, (byte) 14));
                break;
            case 13:
                ((RoundedConstraintLayout) ((vi11) obj).b).setOnClickListener(new aqs(iu30Var, (byte) 4));
                break;
            case 14:
                p410 p410Var2 = (p410) obj;
                ((ConstraintLayout) p410Var2.b).setOnClickListener(new aqs(iu30Var, (byte) 28));
                ((PrimaryButtonView) p410Var2.d).setOnClickListener(new aqs(iu30Var, (byte) 29));
                break;
            default:
                ((TrackInfoView) obj).Y0 = iu30Var;
                break;
        }
    }

    public /* synthetic */ fcs(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0109 A[PHI: r2
      0x0109: PHI (r2v12 int) = (r2v11 int), (r2v13 int), (r2v14 int) binds: [B:13:0x00a6, B:15:0x00af, B:17:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x01c2 A[PHI: r2
      0x01c2: PHI (r2v3 int) = (r2v2 int), (r2v4 int), (r2v5 int), (r2v6 int) binds: [B:31:0x0143, B:33:0x014c, B:35:0x0155, B:37:0x0160] A[DONT_GENERATE, DONT_INLINE]] */
    public fcs(Context context, byte b) {
        int i;
        this.a = b;
        int i2 = 2131431356;
        switch (b) {
            case 1:
                ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131623970, (ViewGroup) null, false);
                int i3 = 2131427665;
                ImageView imageView = (ImageView) m5n1.t(constraintLayoutInflate, 2131427665);
                if (imageView != null) {
                    i3 = 2131427666;
                    View viewT = m5n1.t(constraintLayoutInflate, 2131427666);
                    if (viewT != null) {
                        i3 = 2131427667;
                        View viewT2 = m5n1.t(constraintLayoutInflate, 2131427667);
                        if (viewT2 != null) {
                            i3 = 2131430158;
                            EncoreTextView encoreTextViewT = m5n1.t(constraintLayoutInflate, 2131430158);
                            if (encoreTextViewT != null) {
                                ConstraintLayout constraintLayout = constraintLayoutInflate;
                                View view = (EncoreTextView) m5n1.t(constraintLayoutInflate, 2131431115);
                                if (view != null) {
                                    View view2 = (EncoreTextView) m5n1.t(constraintLayoutInflate, 2131431356);
                                    if (view2 != null) {
                                        cp31 cp31Var = new cp31();
                                        cp31Var.a = constraintLayout;
                                        cp31Var.b = viewT;
                                        cp31Var.c = viewT2;
                                        cp31Var.d = encoreTextViewT;
                                        cp31Var.e = view;
                                        cp31Var.f = view2;
                                        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                        v9w0 v9w0VarQ = b2u.q(constraintLayout);
                                        Collections.addAll(v9w0VarQ.c, view2, view);
                                        Collections.addAll(v9w0VarQ.d, imageView);
                                        v9w0VarQ.e = false;
                                        v9w0VarQ.a();
                                        this.b = cp31Var;
                                        b8k1.p(constraintLayout, new zdc((byte) 1));
                                        return;
                                    }
                                    i = 2131431356;
                                } else {
                                    i = 2131431115;
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
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
                throw null;
            case 8:
                this.b = new idd1(new mo2(context, (byte) 10));
                return;
            case 9:
                ConstraintLayout constraintLayoutInflate2 = LayoutInflater.from(context).inflate(2131625172, (ViewGroup) null, false);
                int i4 = 2131429125;
                ImageView imageView2 = (ImageView) m5n1.t(constraintLayoutInflate2, 2131429125);
                if (imageView2 != null) {
                    i4 = 2131429127;
                    View viewT3 = m5n1.t(constraintLayoutInflate2, 2131429127);
                    if (viewT3 != null) {
                        i4 = 2131429128;
                        View viewT4 = m5n1.t(constraintLayoutInflate2, 2131429128);
                        if (viewT4 != null) {
                            ConstraintLayout constraintLayout2 = constraintLayoutInflate2;
                            View view3 = (EncoreTextView) m5n1.t(constraintLayoutInflate2, 2131431115);
                            if (view3 != null) {
                                View view4 = (EncoreTextView) m5n1.t(constraintLayoutInflate2, 2131431356);
                                if (view4 != null) {
                                    wp20 wp20Var = new wp20(constraintLayout2, imageView2, viewT3, viewT4, view3, view4);
                                    constraintLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                    v9w0 v9w0VarQ2 = b2u.q(constraintLayout2);
                                    Collections.addAll(v9w0VarQ2.c, view4, view3);
                                    Collections.addAll(v9w0VarQ2.d, imageView2);
                                    v9w0VarQ2.e = false;
                                    v9w0VarQ2.a();
                                    this.b = wp20Var;
                                    b8k1.p(constraintLayout2, new zdc((byte) 4));
                                    return;
                                }
                            } else {
                                i2 = 2131431115;
                            }
                        } else {
                            i2 = i4;
                        }
                    } else {
                        i2 = i4;
                    }
                } else {
                    i2 = i4;
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate2.getResources().getResourceName(i2)));
                throw null;
            case 12:
                ConstraintLayout constraintLayoutInflate3 = LayoutInflater.from(context).inflate(2131626116, (ViewGroup) null, false);
                EncoreButton encoreButtonT = m5n1.t(constraintLayoutInflate3, 2131428627);
                if (encoreButtonT != null) {
                    ConstraintLayout constraintLayout3 = constraintLayoutInflate3;
                    m021 m021Var = new m021(constraintLayout3, encoreButtonT, (byte) 24);
                    eqq.t(-1, -2, constraintLayout3);
                    this.b = m021Var;
                    return;
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate3.getResources().getResourceName(2131428627)));
                throw null;
            default:
                AppCompatImageButton appCompatImageButton = new AppCompatImageButton(context);
                appCompatImageButton.setBackground(null);
                appCompatImageButton.setContentDescription(appCompatImageButton.getResources().getString(2131959245));
                appCompatImageButton.setScaleType(ImageView.ScaleType.CENTER_CROP);
                appCompatImageButton.setImageDrawable(new g4b1(context, j4b1.Q7, too1.m(context, 2131166774)));
                int iM = too1.m(context, 2131167033);
                appCompatImageButton.setPadding(iM, iM, iM, iM);
                this.b = appCompatImageButton;
                return;
        }
    }
}
