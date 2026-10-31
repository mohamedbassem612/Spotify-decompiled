package p;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Trace;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.encoreconsumermobile.elements.addtobutton.AddToButtonView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkShadow;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.freshness.FreshnessBadgeView;
import com.spotify.encoreconsumermobile.elements.camerabutton.CameraButtonView;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.encoreconsumermobile.elements.playbutton.PlayButtonView;
import com.spotify.encoreconsumermobile.elements.playindicator.PlayIndicatorView;
import com.spotify.encoreconsumermobile.elements.previewbutton.PreviewOverlayView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.icons.IconArrowUp;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.encoremobile.roundedcorner.RoundedConstraintLayout;
import com.spotify.legacyglue.widgetstate.StateListAnimatorImageButton;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.watchfeed.uiusecases.element.videothumbnail.VideoThumbnailView;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class odr implements qzh {
    public final /* synthetic */ byte a;
    public Object b;
    public final Object c;
    public Object d;
    public Object e;

    /* JADX WARN: Code duplicated, block: B:29:0x01d2 A[PHI: r2
      0x01d2: PHI (r2v11 int) = (r2v10 int), (r2v12 int) binds: [B:19:0x00bb, B:21:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0326 A[PHI: r4
      0x0326: PHI (r4v4 int) = (r4v0 int), (r4v5 int) binds: [B:47:0x0251, B:49:0x025e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0328 A[PHI: r6
      0x0328: PHI (r6v5 int) = (r6v4 int), (r6v6 int), (r6v7 int), (r6v8 int), (r6v9 int), (r6v10 int) binds: [B:35:0x020d, B:37:0x0218, B:39:0x0226, B:41:0x022f, B:43:0x023c, B:45:0x0247] A[DONT_GENERATE, DONT_INLINE]] */
    public odr(Context context, gw70 gw70Var, byte b) {
        this.a = b;
        int i = 2131431356;
        int i2 = 2131431115;
        switch (b) {
            case 3:
                this.b = context;
                ks6 ks6VarG = ks6.g(LayoutInflater.from(context));
                ConstraintLayout constraintLayout = (ConstraintLayout) ks6VarG.a;
                eqq.t(-1, -2, constraintLayout);
                View view = (ArtworkView) ks6VarG.d;
                view.setViewContext(new f47(gw70Var));
                v9w0 v9w0VarQ = b2u.q(constraintLayout);
                Collections.addAll(v9w0VarQ.c, (TextView) ks6VarG.R0, (TextView) ks6VarG.Q0);
                Collections.addAll(v9w0VarQ.d, view);
                v9w0VarQ.a();
                this.c = ks6VarG;
                this.e = constraintLayout;
                return;
            case 7:
                o7s0 o7s0VarInflate = LayoutInflater.from(context).inflate(2131626338, (ViewGroup) null, false);
                int i3 = 2131427611;
                ArtworkView artworkViewT = m5n1.t(o7s0VarInflate, 2131427611);
                if (artworkViewT != null) {
                    i3 = 2131427747;
                    if (m5n1.t(o7s0VarInflate, 2131427747) != null) {
                        o7s0 o7s0Var = (RoundedConstraintLayout) o7s0VarInflate;
                        i3 = 2131428647;
                        if (m5n1.t(o7s0VarInflate, 2131428647) != null) {
                            i3 = 2131429030;
                            View viewT = m5n1.t(o7s0VarInflate, 2131429030);
                            if (viewT != null) {
                                i3 = 2131430265;
                                TextView textView = (TextView) m5n1.t(o7s0VarInflate, 2131430265);
                                if (textView != null) {
                                    i3 = 2131431070;
                                    if (m5n1.t(o7s0VarInflate, 2131431070) != null) {
                                        TextView textView2 = (TextView) m5n1.t(o7s0VarInflate, 2131431115);
                                        if (textView2 != null) {
                                            i2 = 2131431334;
                                            View view2 = (VideoThumbnailView) m5n1.t(o7s0VarInflate, 2131431334);
                                            if (view2 != null) {
                                                TextView textView3 = (TextView) m5n1.t(o7s0VarInflate, 2131431356);
                                                if (textView3 != null) {
                                                    i = 2131431607;
                                                    View viewT2 = m5n1.t(o7s0VarInflate, 2131431607);
                                                    if (viewT2 != null) {
                                                        s880 s880Var = new s880(o7s0Var, artworkViewT, viewT, textView, textView2, view2, textView3, viewT2);
                                                        View videoSurfaceView = new VideoSurfaceView(context);
                                                        this.b = videoSurfaceView;
                                                        k8p1.o(viewT2, videoSurfaceView);
                                                        this.c = s880Var;
                                                        this.d = r4u.c(new r4u[]{r4u.d(new qlr(g0t.b, (byte) 1), r4u.a(new her(this, (byte) 18))), r4u.d(new qlr(h0t.b, (byte) 1), r4u.a(new rjn(this, (byte) 22))), r4u.d(new qlr(i0t.b, (byte) 1), r4u.a(new vun(this, (byte) 24))), new r4u(mm10.e1, new qmr(this, (byte) 14)), r4u.d(new qlr(j0t.b, (byte) 1), r4u.a(new sun(this, (byte) 22)))});
                                                        v9w0 v9w0VarP = b2u.p(o7s0Var);
                                                        Collections.addAll(v9w0VarP.c, textView3, textView2);
                                                        Collections.addAll(v9w0VarP.d, videoSurfaceView, view2);
                                                        v9w0VarP.a();
                                                        view2.setImageLoader(gw70Var);
                                                        artworkViewT.setViewContext(new f47(gw70Var));
                                                        videoSurfaceView.setScaleType(b3k1.c);
                                                        this.e = o7s0Var;
                                                        return;
                                                    }
                                                }
                                            } else {
                                                i = i2;
                                            }
                                        } else {
                                            i = i2;
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
                    } else {
                        i = i3;
                    }
                } else {
                    i = i3;
                }
                bhn0.i("Missing required view with ID: ".concat(o7s0VarInflate.getResources().getResourceName(i)));
                throw null;
            default:
                d520 d520VarR = d520.R(LayoutInflater.from(context));
                ConstraintLayout constraintLayout2 = (ConstraintLayout) d520VarR.e;
                this.b = d520VarR;
                ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131623978, (ViewGroup) null, false);
                int i4 = 2131427521;
                tlv tlvVar = (AddToButtonView) m5n1.t(constraintLayoutInflate, 2131427521);
                if (tlvVar != null) {
                    ConstraintLayout constraintLayout3 = constraintLayoutInflate;
                    i4 = 2131428234;
                    tlv tlvVar2 = (ContextMenuButton) m5n1.t(constraintLayoutInflate, 2131428234);
                    if (tlvVar2 != null) {
                        i4 = 2131428536;
                        TextView textView4 = (TextView) m5n1.t(constraintLayoutInflate, 2131428536);
                        if (textView4 != null) {
                            i4 = 2131428541;
                            ProgressBar progressBar = (ProgressBar) m5n1.t(constraintLayoutInflate, 2131428541);
                            if (progressBar != null) {
                                i4 = 2131428542;
                                FrameLayout frameLayout = (FrameLayout) m5n1.t(constraintLayoutInflate, 2131428542);
                                if (frameLayout != null) {
                                    i4 = 2131428976;
                                    tlv tlvVar3 = (FreshnessBadgeView) m5n1.t(constraintLayoutInflate, 2131428976);
                                    if (tlvVar3 != null) {
                                        i4 = 2131430400;
                                        tlv tlvVar4 = (PlayButtonView) m5n1.t(constraintLayoutInflate, 2131430400);
                                        if (tlvVar4 != null) {
                                            d520 d520Var = new d520(constraintLayout3, tlvVar, tlvVar2, textView4, progressBar, frameLayout, tlvVar3, tlvVar4, (byte) 5);
                                            eqq.t(-1, -2, constraintLayout3);
                                            this.c = d520Var;
                                            ConstraintLayout constraintLayoutInflate2 = LayoutInflater.from(context).inflate(2131623982, (ViewGroup) null, false);
                                            int i5 = 2131428229;
                                            TextView textView5 = (TextView) m5n1.t(constraintLayoutInflate2, 2131428229);
                                            if (textView5 != null) {
                                                i5 = 2131428438;
                                                TextView textView6 = (TextView) m5n1.t(constraintLayoutInflate2, 2131428438);
                                                if (textView6 != null) {
                                                    TextView textView7 = (TextView) m5n1.t(constraintLayoutInflate2, 2131431115);
                                                    if (textView7 != null) {
                                                        TextView textView8 = (TextView) m5n1.t(constraintLayoutInflate2, 2131431356);
                                                        if (textView8 != null) {
                                                            ConstraintLayout constraintLayout4 = constraintLayoutInflate2;
                                                            this.d = new u961(constraintLayout4, textView5, textView6, textView7, textView8);
                                                            zhm0.d((ConstraintLayout) d520VarR.g, new ArtworkView[]{(ArtworkView) d520VarR.b}, (ConstraintLayout) d520VarR.c, (ArtworkShadow) d520VarR.d, gw70Var, new TextView[]{textView8, textView7, textView6});
                                                            textView8.setTextSize(2, 14.0f);
                                                            constraintLayout2.removeAllViews();
                                                            constraintLayout2.addView(constraintLayout3);
                                                            ((FrameLayout) d520VarR.h).addView(constraintLayout4);
                                                            this.e = r4u.c(new r4u[]{r4u.d(new mo(fxr.b, (byte) 1), r4u.a(new xap(this, (byte) 9))), r4u.d(new mo(gxr.b, (byte) 1), r4u.a(new h9n(this, (byte) 12))), r4u.d(new mo(hxr.b, (byte) 1), r4u.a(new sun(this, (byte) 11))), r4u.d(new mo(ixr.b, (byte) 1), r4u.a(new her(this, (byte) 7))), r4u.d(new mo(jxr.b, (byte) 1), r4u.a(new ogr(this, (byte) 6))), r4u.d(qbo1.T0, r4u.a(new lqr(this, (byte) 2))), r4u.d(new mo(exr.b, (byte) 1), r4u.a(new a0m(this, (byte) 16))), r4u.d(cxo1.V0, r4u.a(new wcr(this, (byte) 7)))});
                                                            return;
                                                        }
                                                    } else {
                                                        i = 2131431115;
                                                    }
                                                } else {
                                                    i = i5;
                                                }
                                            } else {
                                                i = i5;
                                            }
                                            bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate2.getResources().getResourceName(i)));
                                            throw null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i4)));
                throw null;
        }
    }

    public AnimatorSet a(View view) {
        float dimension = ((Context) this.b).getResources().getDimension(2131167112);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(500L);
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f), ObjectAnimator.ofFloat(view, "translationY", dimension, 0.0f));
        return animatorSet;
    }

    public void e(hlp0 hlp0Var) {
        EncoreTextView encoreTextView = (EncoreTextView) this.d;
        String str = hlp0Var.a;
        String str2 = hlp0Var.b;
        List listQ0 = ihc1.Q0(str, new String[]{str2}, 0, 6);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) listQ0.get(0));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(xfo1.r(encoreTextView, 2130969492));
        int length = spannableStringBuilder.length();
        TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(encoreTextView.getContext(), 2132018007);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str2);
        spannableStringBuilder.setSpan(textAppearanceSpan, length2, spannableStringBuilder.length(), 17);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        String str3 = (String) o7h.t0(1, listQ0);
        if (str3 == null) {
            str3 = "";
        }
        spannableStringBuilder.append((CharSequence) str3);
        encoreTextView.setText(new SpannedString(spannableStringBuilder));
        ((EncoreButton) this.e).setText(hlp0Var.c);
        ((PlayIndicatorView) this.c).f(new rkt0());
    }

    public final void f(Object obj) {
        String str;
        byte b = this.a;
        boolean z = false;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((ViewGroup) this.b).setBackgroundColor(0);
                ((bpb1) this.d).m((Object) null, (mj) obj);
                return;
            case 1:
                ((r4u) this.e).e((e2z) obj);
                return;
            case 2:
                ((StateListAnimatorImageButton) ((lc20) this.e).c).setVisibility(8);
                ke10 ke10Var = (ke10) this.d;
                ke10 ke10Var2 = new ke10(ke10Var.a, ke10Var.b, ((rg20) obj).d, ke10Var.d, ke10Var.f, ke10Var.e);
                tka0 tka0Var = dtw.C;
                ((dtw) obj2).k(ke10Var2, goa0.a, (vu30) null);
                return;
            case 3:
                ppi0 ppi0Var = (ppi0) obj;
                this.d = ppi0Var;
                if (!(ppi0Var instanceof ppi0)) {
                    eg.o();
                    return;
                }
                String str2 = ppi0Var.a;
                ks6 ks6Var = (ks6) obj2;
                TextView textView = (TextView) ks6Var.R0;
                ArtworkView artworkView = (ArtworkView) ks6Var.d;
                TextView textView2 = (TextView) ks6Var.Q0;
                textView.setText(str2);
                textView2.setText("");
                textView2.setVisibility(8);
                artworkView.h(new j17(ppi0Var.b, str2, new g07(ppi0Var.c)));
                artworkView.setContentDescription(((Context) this.b).getResources().getString(2131958513));
                return;
            case 4:
                e((hlp0) obj);
                return;
            case 5:
                nad1 nad1Var = (nad1) obj;
                this.e = nad1Var;
                lvc1 lvc1Var = (lvc1) obj2;
                TextView textView3 = (TextView) lvc1Var.c;
                uaa uaaVar = (IconArrowUp) lvc1Var.b;
                textView3.setText(nad1Var.a);
                Integer num = nad1Var.e;
                if (num != null) {
                    int iIntValue = num.intValue();
                    uaaVar.setImageTintList(ColorStateList.valueOf(iIntValue));
                    textView3.setTextColor(iIntValue);
                }
                if (nad1Var.f) {
                    k(nad1Var.b);
                    return;
                }
                AnimatorSet animatorSet = (AnimatorSet) this.d;
                if (animatorSet != null) {
                    animatorSet.end();
                }
                this.d = null;
                nad1 nad1Var2 = (nad1) this.e;
                if (nad1Var2 == null) {
                    u890.C("model");
                    throw null;
                }
                if (nad1Var2.d) {
                    textView3.setAlpha(0.0f);
                    uaaVar.setAlpha(0.0f);
                    return;
                }
                return;
            case 6:
                swf1 swf1Var = (swf1) obj;
                tzf1 tzf1Var = (tzf1) this.b;
                if (!(swf1Var instanceof swf1)) {
                    eg.o();
                    return;
                }
                tzf1Var.n();
                tzf1Var.getRoot().setEnabled(true);
                uez0 uez0Var = swf1Var.f;
                int i = swf1Var.j;
                String str3 = swf1Var.a;
                ((View) ((idd1) this.e).getValue()).setVisibility(8);
                tzf1Var.b().setBackgroundColor(0);
                tzf1Var.getTitle().setText(str3);
                tzf1Var.getSubtitle().setText(f6o1.k(tzf1Var.getRoot().getResources(), swf1Var.b));
                ArtworkView artwork = tzf1Var.getArtwork();
                int[] iArr = mvs.a;
                if (iArr[l1d.C(i)] == 1) {
                    ViewGroup.LayoutParams layoutParams = artwork.getLayoutParams();
                    if (layoutParams == null) {
                        bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                        return;
                    }
                    qhl qhlVar = (qhl) layoutParams;
                    ((ViewGroup.MarginLayoutParams) qhlVar).width = 0;
                    if (i == 1) {
                        str = "1:1";
                    } else {
                        if (i != 2) {
                            throw null;
                        }
                        str = "16:9";
                    }
                    qhlVar.G = str;
                    artwork.setLayoutParams(qhlVar);
                }
                ArtworkView artwork2 = tzf1Var.getArtwork();
                int i2 = iArr[l1d.C(i)];
                g07 g07Var = swf1Var.c;
                if (i2 == 1) {
                    g07Var = new g07(g07Var.a, new zz6(4.0f));
                }
                artwork2.h(new g17(g07Var));
                tzf1Var.getArtwork().setVisibility(0);
                tlv tlvVar = (ContextMenuButton) obj2;
                if (tlvVar != null) {
                    tlvVar.setEnabled(true);
                    tlvVar.setContentDescription(tlvVar.getResources().getString(2131962418, str3));
                }
                tzf1Var.d().a(uez0Var);
                tzf1Var.l().z(zkt0.c);
                tlv tlvVarO = tzf1Var.o();
                tlvVarO.getClass();
                tlvVarO.setVisibility(8);
                tzf1Var.c().setVisibility(8);
                tzf1Var.j().f(swf1Var.e);
                tzf1Var.i().f(swf1Var.d);
                tlv tlvVarK = tzf1Var.k();
                tlvVarK.getClass();
                tlvVarK.setVisibility(8);
                PreviewOverlayView previewOverlayView = (PreviewOverlayView) this.d;
                if (previewOverlayView != null) {
                    previewOverlayView.y(new ajw0(null));
                }
                tzf1Var.m().setVisibility(8);
                w2g0.l(tzf1Var.o(), tzf1Var.c(), tzf1Var.j(), tzf1Var.k(), tzf1Var.i());
                boolean z2 = swf1Var.g != 3;
                tzf1Var.getRoot().setActivated(z2);
                tzf1Var.getRoot().setSelected(z2);
                boolean z3 = (uez0Var.equals(rez0.a) || uez0Var.equals(sez0.a)) ? false : true;
                if (swf1Var.h && z3) {
                    z = true;
                }
                tzf1Var.setEnabled(z);
                return;
            default:
                h8l1 h8l1Var = (h8l1) obj;
                ((RoundedConstraintLayout) ((s880) obj2).b).setContentDescription(h8l1Var.d);
                ((r4u) this.d).e(h8l1Var);
                return;
        }
    }

    public final View getView() {
        switch (this.a) {
            case 0:
                ComposeView composeView = new ComposeView(((ViewGroup) this.b).getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                composeView.setContent(new j2i(-1781109359, new i4o(this, (byte) 9), true));
                return composeView;
            case 1:
                return (ConstraintLayout) ((d520) this.b).g;
            case 2:
                return (ConstraintLayout) ((lc20) this.e).b;
            case 3:
                return (ConstraintLayout) this.e;
            case 4:
                return (View) this.b;
            case 5:
                return (ConstraintLayout) ((lvc1) this.c).d;
            case 6:
                return ((tzf1) this.b).getRoot();
            default:
                return (RoundedConstraintLayout) this.e;
        }
    }

    public void k(long j) {
        if (((AnimatorSet) this.d) != null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        lvc1 lvc1Var = (lvc1) this.c;
        uaa uaaVar = (IconArrowUp) lvc1Var.b;
        View view = (TextView) lvc1Var.c;
        animatorSet.playTogether(ObjectAnimator.ofFloat(uaaVar, "alpha", 0.0f));
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", 0.0f));
        animatorSet.setDuration(300L);
        animatorSet.setStartDelay(j - 500);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setInterpolator(new PathInterpolator(0.3f, 0.0f, 0.4f, 1.0f));
        AnimatorSet animatorSetA = a(uaaVar);
        AnimatorSet animatorSetA2 = a(view);
        animatorSetA2.setStartDelay(100L);
        animatorSet2.playTogether(animatorSetA, animatorSetA2);
        animatorSet2.setStartDelay(j);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(animatorSet, animatorSet2);
        animatorSet3.addListener(new otd(this, (byte) 1));
        animatorSet3.start();
        this.d = animatorSet3;
    }

    public final void n(iu30 iu30Var) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((bpb1) this.e).m((Object) null, iu30Var);
                break;
            case 1:
                d520 d520Var = (d520) this.b;
                ((ConstraintLayout) d520Var.g).setOnClickListener(new trr(iu30Var, (byte) 10));
                ((ConstraintLayout) d520Var.g).setOnLongClickListener(new wer(iu30Var, (byte) 3));
                d520 d520Var2 = (d520) obj;
                ((PlayButtonView) d520Var2.h).n(new mwr(iu30Var, (byte) 5));
                ((AddToButtonView) d520Var2.b).n(new mwr(iu30Var, (byte) 6));
                ((ContextMenuButton) d520Var2.c).n(new mwr(iu30Var, (byte) 7));
                break;
            case 2:
                lc20 lc20Var = (lc20) this.e;
                ((CameraButtonView) lc20Var.d).n(new mwr(iu30Var, (byte) 14));
                ((StateListAnimatorImageButton) lc20Var.c).setOnClickListener(new trr(iu30Var, (byte) 25));
                this.b = iu30Var;
                break;
            case 3:
                ((ConstraintLayout) ((ks6) obj).a).setOnClickListener(new cvr(this, iu30Var, (byte) 3));
                break;
            case 4:
                ((EncoreButton) this.e).setOnClickListener(new o0s(iu30Var, (byte) 21));
                break;
            case 5:
                break;
            case 6:
                tzf1 tzf1Var = (tzf1) this.b;
                tzf1Var.getRoot().setOnClickListener(new aqs(iu30Var, (byte) 6));
                tzf1Var.getRoot().setOnLongClickListener(new wer(iu30Var, (byte) 14));
                ContextMenuButton contextMenuButton = (ContextMenuButton) obj;
                if (contextMenuButton != null) {
                    contextMenuButton.n(new shs(iu30Var, (byte) 19));
                }
                tzf1Var.d().a = new shs(iu30Var, (byte) 20);
                PreviewOverlayView previewOverlayView = (PreviewOverlayView) this.d;
                if (previewOverlayView != null) {
                    previewOverlayView.n(new wrs(iu30Var, this, (byte) 3));
                }
                break;
            default:
                ((RoundedConstraintLayout) this.e).setOnClickListener(new aqs(iu30Var, (byte) 15));
                ((VideoThumbnailView) ((s880) obj).g).d = new hws(iu30Var, (byte) 4);
                break;
        }
    }

    private final void b(iu30 iu30Var) {
    }

    public odr(Context context) {
        this.a = (byte) 5;
        this.b = context;
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131626223, (ViewGroup) null, false);
        int i = 2131429223;
        IconArrowUp iconArrowUp = (IconArrowUp) m5n1.t(constraintLayoutInflate, 2131429223);
        if (iconArrowUp != null) {
            i = 2131429710;
            TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131429710);
            if (textView != null) {
                ConstraintLayout constraintLayout = constraintLayoutInflate;
                this.c = new lvc1(constraintLayout, iconArrowUp, textView, constraintLayout);
                return;
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public odr(LayoutInflater layoutInflater) {
        this.a = (byte) 4;
        View viewInflate = layoutInflater.inflate(2131625337, (ViewGroup) null);
        this.b = viewInflate;
        this.c = (PlayIndicatorView) b8k1.n(viewInflate, 2131430403);
        this.d = b8k1.n(viewInflate, 2131431258);
        this.e = b8k1.n(viewInflate, 2131427839);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [android.view.View, com.spotify.legacyglue.widgetstate.StateListAnimatorImageButton] */
    public odr(Context context, String str, r6h1 r6h1Var, acq acqVar, mf4 mf4Var) {
        int dimensionPixelSize;
        this.a = (byte) 2;
        this.b = nvr.R0;
        ke10 ke10Var = new ke10(0, 62, context.getString(2131956011), (String) null, (String) null, (String) null);
        this.d = ke10Var;
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131624643, (ViewGroup) null, false);
        int i = 2131427638;
        ?? r8 = (StateListAnimatorImageButton) m5n1.t(constraintLayoutInflate, 2131427638);
        if (r8 != 0) {
            i = 2131427882;
            CameraButtonView cameraButtonView = (CameraButtonView) m5n1.t(constraintLayoutInflate, 2131427882);
            if (cameraButtonView != null) {
                i = 2131428816;
                FrameLayout frameLayout = (FrameLayout) m5n1.t(constraintLayoutInflate, 2131428816);
                if (frameLayout != null) {
                    ConstraintLayout constraintLayout = constraintLayoutInflate;
                    lc20 lc20Var = new lc20(constraintLayout, (StateListAnimatorImageButton) r8, cameraButtonView, frameLayout);
                    tka0 tka0Var = dtw.C;
                    dtw dtwVarB = mhc.b(context, constraintLayout, f6o1.A(acqVar.a(str, r6h1Var, new m4r(this, (byte) 21)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), ke10Var, (ipb1) null, 112);
                    View view = dtwVarB.w;
                    constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    frameLayout.addView(view);
                    this.c = dtwVarB;
                    this.e = lc20Var;
                    r8.setContentDescription(context.getString(2131956644));
                    int paddingStart = constraintLayout.getPaddingStart();
                    int paddingTop = constraintLayout.getPaddingTop();
                    Resources resources = context.getResources();
                    int iOrdinal = mf4Var.c().ordinal();
                    if (iOrdinal == 0) {
                        dimensionPixelSize = resources.getDimensionPixelSize(2131165388);
                    } else if (iOrdinal == 1) {
                        dimensionPixelSize = resources.getDimensionPixelSize(2131165390);
                    } else if (iOrdinal == 2) {
                        dimensionPixelSize = resources.getDimensionPixelSize(2131165389);
                    } else {
                        eg.o();
                        throw null;
                    }
                    constraintLayout.setPaddingRelative(paddingStart, paddingTop + dimensionPixelSize, constraintLayout.getPaddingEnd(), constraintLayout.getPaddingBottom());
                    return;
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public odr(ViewGroup viewGroup, gw70 gw70Var) {
        this.a = (byte) 0;
        this.b = viewGroup;
        this.c = gw70Var;
        this.d = gio1.b((Object) null);
        this.e = gio1.b((Object) null);
    }

    public odr(Context context, gw70 gw70Var, zfx zfxVar) {
        f0a eb80Var;
        this.a = (byte) 6;
        Trace.beginSection("ECM:DefaultTrackRow:inflate");
        try {
            if (((Boolean) ycn0.f.getValue()).booleanValue()) {
                eb80Var = new f0a(context, (int) ((16.0f * context.getResources().getDisplayMetrics().density) + 0.5f));
                eb80Var.t(gw70Var);
            } else {
                ks6 ks6VarG = ks6.g(LayoutInflater.from(context));
                w2g0.q(ks6VarG, gw70Var);
                eb80Var = new eb80(ks6VarG, (byte) 0);
            }
            Trace.endSection();
            this.b = eb80Var;
            this.c = (ContextMenuButton) eb80Var.f();
            this.d = null;
            new idd1(new nvs(this, (byte) 0));
            this.e = new idd1(new nvs(this, (byte) 1));
            new idd1(new nxr(zfxVar, this, (byte) 25));
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
