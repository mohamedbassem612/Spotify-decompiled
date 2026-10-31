package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Trace;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.SwitchCompat;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.spotify.adsdisplay.uiusecases.adtag.AdTagView;
import com.spotify.adsdisplay.uiusecases.videocontrolsoverlay.VideoControlsOverlayView;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.encore.image.EncoreImageView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkShadow;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.download.DownloadBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.enhanced.EnhancedBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.locked.LockedBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.paid.PaidBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.premium.PremiumBadgeView;
import com.spotify.encoreconsumermobile.elements.clearbutton.ClearButtonView;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.encoreconsumermobile.elements.find.FindInContextView;
import com.spotify.encoreconsumermobile.elements.markasplayed.MarkAsPlayedButtonView;
import com.spotify.encoreconsumermobile.elements.playbutton.PlayButtonView;
import com.spotify.encoreconsumermobile.elements.playindicator.PlayIndicatorComposeView;
import com.spotify.encoreconsumermobile.elements.quickactions.QuickActionView;
import com.spotify.encoremobile.buttons.PrimaryButtonView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.icons.IconChevronRight;
import com.spotify.encoremobile.component.icons.IconVideo;
import com.spotify.encoremobile.component.icons.IconVolume;
import com.spotify.encoremobile.component.icons.IconVolumeOff;
import com.spotify.encoremobile.component.icons.IconX;
import com.spotify.encoremobile.component.listrow.EncoreListRow;
import com.spotify.encoremobile.component.slottextview.EncoreTitleView;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.encoremobile.facepile.FaceView;
import com.spotify.encoremobile.roundedcorner.RoundedConstraintLayout;
import com.spotify.legacyglue.icons.SpotifyIconView;
import com.spotify.legacyglue.widgetstate.StateListAnimatorImageButton;
import com.spotify.liveevents.uiusecases.concertentityheader.elements.CalendarIconView;
import com.spotify.podcastuiplatform.uiusecases.episoderow.elements.description.EpisodeRowDescriptionView;
import com.spotify.podcastuiplatform.uiusecases.episoderow.elements.header.EpisodeRowHeaderContainer;
import com.spotify.podcastuiplatform.uiusecases.episoderow.elements.quickaction.section.EpisodeRowQuickActionSectionView;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yir implements qzh, e391 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    /* JADX WARN: Code duplicated, block: B:14:0x00d5 A[PHI: r2
      0x00d5: PHI (r2v49 int) = (r2v48 int), (r2v50 int) binds: [B:7:0x007f, B:9:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x03c5 A[PHI: r2
      0x03c5: PHI (r2v6 int) = (r2v5 int), (r2v7 int), (r2v8 int) binds: [B:80:0x036d, B:82:0x0379, B:84:0x0386] A[DONT_GENERATE, DONT_INLINE]] */
    public yir(Context context, byte b) {
        this.a = b;
        int i = 2131431356;
        switch (b) {
            case 3:
                this.b = context;
                View viewInflate = LayoutInflater.from(context).inflate(2131624517, (ViewGroup) null, false);
                int i2 = 2131427511;
                if (((AdTagView) m5n1.t(viewInflate, 2131427511)) != null) {
                    i2 = 2131427543;
                    TextView textView = (TextView) m5n1.t(viewInflate, 2131427543);
                    if (textView != null) {
                        i2 = 2131428103;
                        ClearButtonView clearButtonViewT = m5n1.t(viewInflate, 2131428103);
                        if (clearButtonViewT != null) {
                            i2 = 2131428198;
                            ConstraintLayout constraintLayoutT = m5n1.t(viewInflate, 2131428198);
                            if (constraintLayoutT != null) {
                                i2 = 2131428292;
                                EncoreButton encoreButtonT = m5n1.t(viewInflate, 2131428292);
                                if (encoreButtonT != null) {
                                    i2 = 2131429587;
                                    IconVolume iconVolumeT = m5n1.t(viewInflate, 2131429587);
                                    if (iconVolumeT != null) {
                                        i2 = 2131429593;
                                        IconVolumeOff iconVolumeOffT = m5n1.t(viewInflate, 2131429593);
                                        if (iconVolumeOffT != null) {
                                            i2 = 2131430096;
                                            FrameLayout frameLayout = (FrameLayout) m5n1.t(viewInflate, 2131430096);
                                            if (frameLayout != null) {
                                                i2 = 2131431214;
                                                TextView textView2 = (TextView) m5n1.t(viewInflate, 2131431214);
                                                if (textView2 != null) {
                                                    i2 = 2131431586;
                                                    FrameLayout frameLayout2 = (FrameLayout) m5n1.t(viewInflate, 2131431586);
                                                    if (frameLayout2 != null) {
                                                        i2 = 2131431587;
                                                        VideoControlsOverlayView videoControlsOverlayView = (VideoControlsOverlayView) m5n1.t(viewInflate, 2131431587);
                                                        if (videoControlsOverlayView != null) {
                                                            i2 = 2131431603;
                                                            View viewT = m5n1.t(viewInflate, 2131431603);
                                                            if (viewT != null) {
                                                                i2 = 2131431606;
                                                                View view = (VideoSurfaceView) m5n1.t(viewInflate, 2131431606);
                                                                if (view != null) {
                                                                    FrameLayout frameLayout3 = (FrameLayout) viewInflate;
                                                                    h72 h72Var = new h72(frameLayout3, textView, clearButtonViewT, constraintLayoutT, encoreButtonT, iconVolumeT, iconVolumeOffT, frameLayout, textView2, frameLayout2, videoControlsOverlayView, viewT, view);
                                                                    frameLayout3.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                                                    v9w0 v9w0VarP = b2u.p(constraintLayoutT);
                                                                    Collections.addAll(v9w0VarP.c, textView);
                                                                    Collections.addAll(v9w0VarP.d, view);
                                                                    v9w0VarP.a();
                                                                    frameLayout2.setClipToOutline(true);
                                                                    Drawable drawable = context.getDrawable(2131232727);
                                                                    drawable.getClass();
                                                                    TypedValue typedValue = new TypedValue();
                                                                    context.getTheme().resolveAttribute(2130968791, typedValue, true);
                                                                    drawable.setTint(context.getColor(typedValue.resourceId));
                                                                    viewT.setBackground(new x10(drawable, 0.4f));
                                                                    this.c = h72Var;
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
                bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
                throw null;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 11:
            case 12:
            case 15:
            case 21:
            case 22:
            default:
                this.b = context;
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
                this.c = appCompatImageButton;
                return;
            case 10:
                this.b = context;
                ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131625402, (ViewGroup) null, false);
                int i3 = 2131428438;
                TextView textView3 = (TextView) m5n1.t(constraintLayoutInflate, 2131428438);
                if (textView3 != null) {
                    i3 = 2131429223;
                    ImageView imageView = (ImageView) m5n1.t(constraintLayoutInflate, 2131429223);
                    if (imageView != null) {
                        i3 = 2131429736;
                        View view2 = (EncoreButton) m5n1.t(constraintLayoutInflate, 2131429736);
                        if (view2 != null) {
                            ConstraintLayout constraintLayout = constraintLayoutInflate;
                            TextView textView4 = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                            if (textView4 != null) {
                                ytp0 ytp0Var = new ytp0(constraintLayout, textView3, imageView, (EncoreButton) view2, constraintLayout, textView4);
                                v9w0 v9w0VarQ = b2u.q(constraintLayout);
                                Collections.addAll(v9w0VarQ.c, textView4, textView3, view2);
                                Collections.addAll(v9w0VarQ.d, imageView);
                                v9w0VarQ.a();
                                b8k1.p(constraintLayout, new zdc((byte) 5));
                                this.c = ytp0Var;
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
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
                throw null;
            case 13:
                nzj nzjVar = new nzj(context, l9j.a);
                this.b = nzjVar;
                ComposeView composeView = nzjVar.d;
                composeView.setId(2131430470);
                this.c = composeView;
                return;
            case 14:
                ConstraintLayout constraintLayoutInflate2 = LayoutInflater.from(context).inflate(2131625438, (ViewGroup) null, false);
                EncoreButton encoreButtonT2 = m5n1.t(constraintLayoutInflate2, 2131430206);
                if (encoreButtonT2 == null) {
                    bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate2.getResources().getResourceName(2131430206)));
                    throw null;
                }
                ConstraintLayout constraintLayout2 = constraintLayoutInflate2;
                ntv0 ntv0Var = new ntv0(constraintLayout2, encoreButtonT2, constraintLayout2);
                constraintLayout2.setLayoutParams(new qhl(-1, -2));
                this.b = ntv0Var;
                this.c = encoreButtonT2.getBackgroundTintList();
                return;
            case 16:
                ConstraintLayout constraintLayoutInflate3 = LayoutInflater.from(context).inflate(2131624524, (ViewGroup) null, false);
                int i4 = 2131427887;
                TextView textView5 = (TextView) m5n1.t(constraintLayoutInflate3, 2131427887);
                if (textView5 != null) {
                    i4 = 2131430802;
                    FindInContextView findInContextViewT = m5n1.t(constraintLayoutInflate3, 2131430802);
                    if (findInContextViewT != null) {
                        this.b = new l6s(constraintLayoutInflate3, textView5, findInContextViewT);
                        findInContextViewT.U0.setText((CharSequence) null);
                        findInContextViewT.y(u681.b);
                        return;
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate3.getResources().getResourceName(i4)));
                throw null;
            case 17:
                EncoreListRow encoreListRowInflate = LayoutInflater.from(context).inflate(2131626121, (ViewGroup) null, false);
                EncoreListRow encoreListRow = encoreListRowInflate;
                int i5 = 2131429948;
                ImageView imageView2 = (ImageView) m5n1.t(encoreListRowInflate, 2131429948);
                if (imageView2 != null) {
                    i5 = 2131431371;
                    View view3 = (EncoreTitleView) m5n1.t(encoreListRowInflate, 2131431371);
                    if (view3 != null) {
                        i5 = 2131431502;
                        MaterialRadioButton materialRadioButtonT = m5n1.t(encoreListRowInflate, 2131431502);
                        if (materialRadioButtonT != null) {
                            y441 y441Var = new y441(encoreListRow, imageView2, view3, materialRadioButtonT);
                            encoreListRow.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                            v9w0 v9w0VarQ2 = b2u.q(encoreListRow);
                            Collections.addAll(v9w0VarQ2.c, view3);
                            Collections.addAll(v9w0VarQ2.d, imageView2);
                            v9w0VarQ2.a();
                            this.c = y441Var;
                            return;
                        }
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(encoreListRowInflate.getResources().getResourceName(i5)));
                throw null;
            case 18:
                this.b = context;
                ConstraintLayout constraintLayoutInflate4 = LayoutInflater.from(context).inflate(2131626186, (ViewGroup) null, false);
                AppCompatImageButton appCompatImageButtonT = m5n1.t(constraintLayoutInflate4, 2131427971);
                if (appCompatImageButtonT != null) {
                    ConstraintLayout constraintLayout3 = constraintLayoutInflate4;
                    TextView textView6 = (TextView) m5n1.t(constraintLayoutInflate4, 2131431356);
                    if (textView6 != null) {
                        yt91 yt91Var = new yt91(constraintLayout3, appCompatImageButtonT, textView6, (byte) 9);
                        eqq.t(-1, -2, constraintLayout3);
                        this.c = yt91Var;
                        return;
                    }
                } else {
                    i = 2131427971;
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate4.getResources().getResourceName(i)));
                throw null;
            case 19:
                this.b = context;
                ConstraintLayout constraintLayoutInflate5 = LayoutInflater.from(context).inflate(2131626189, (ViewGroup) null, false);
                int i6 = 2131430885;
                ImageButton imageButton = (ImageButton) m5n1.t(constraintLayoutInflate5, 2131430885);
                if (imageButton != null) {
                    i6 = 2131430888;
                    TextView textView7 = (TextView) m5n1.t(constraintLayoutInflate5, 2131430888);
                    if (textView7 != null) {
                        i6 = 2131430889;
                        TextView textView8 = (TextView) m5n1.t(constraintLayoutInflate5, 2131430889);
                        if (textView8 != null) {
                            ua91 ua91Var = new ua91(constraintLayoutInflate5, imageButton, textView7, textView8, (byte) 11);
                            b2u.q(imageButton);
                            b8k1.p(textView8, new zdc((byte) 7));
                            this.c = ua91Var;
                            return;
                        }
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate5.getResources().getResourceName(i6)));
                throw null;
            case 20:
                this.c = new idd1(new mo2(context, (byte) 13));
                return;
            case 23:
                this.b = context;
                ConstraintLayout constraintLayoutInflate6 = LayoutInflater.from(context).inflate(2131626317, (ViewGroup) null, false);
                ConstraintLayout constraintLayout4 = constraintLayoutInflate6;
                TextView textView9 = (TextView) m5n1.t(constraintLayoutInflate6, 2131431356);
                if (textView9 == null) {
                    bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate6.getResources().getResourceName(2131431356)));
                    throw null;
                }
                ig3 ig3Var = new ig3(constraintLayout4, textView9);
                constraintLayout4.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                v9w0 v9w0VarP2 = b2u.p(constraintLayout4);
                Collections.addAll(v9w0VarP2.c, textView9);
                v9w0VarP2.a();
                this.c = ig3Var;
                return;
            case 24:
                ConstraintLayout constraintLayoutInflate7 = LayoutInflater.from(context).inflate(2131626088, (ViewGroup) null, false);
                MaterialRadioButton materialRadioButtonT2 = m5n1.t(constraintLayoutInflate7, 2131431088);
                if (materialRadioButtonT2 != null) {
                    TextView textView10 = (TextView) m5n1.t(constraintLayoutInflate7, 2131431356);
                    if (textView10 != null) {
                        ConstraintLayout constraintLayout5 = constraintLayoutInflate7;
                        g931 g931Var = new g931(constraintLayout5, materialRadioButtonT2, textView10, (byte) 3);
                        constraintLayout5.setLayoutParams(new ViewGroup.LayoutParams(-1, constraintLayout5.getResources().getDimensionPixelSize(2131167072)));
                        v9w0 v9w0VarQ3 = b2u.q(constraintLayout5);
                        Collections.addAll(v9w0VarQ3.c, textView10);
                        v9w0VarQ3.e = false;
                        v9w0VarQ3.a();
                        materialRadioButtonT2.setClickable(false);
                        this.c = g931Var;
                        return;
                    }
                } else {
                    i = 2131431088;
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate7.getResources().getResourceName(i)));
                throw null;
            case 25:
                ConstraintLayout constraintLayoutInflate8 = LayoutInflater.from(context).inflate(2131626087, (ViewGroup) null, false);
                int i7 = 2131427413;
                ImageView imageView3 = (ImageView) m5n1.t(constraintLayoutInflate8, 2131427413);
                if (imageView3 != null) {
                    i7 = 2131427499;
                    TextView textView11 = (TextView) m5n1.t(constraintLayoutInflate8, 2131427499);
                    if (textView11 != null) {
                        TextView textView12 = (TextView) m5n1.t(constraintLayoutInflate8, 2131431356);
                        if (textView12 != null) {
                            ConstraintLayout constraintLayout6 = constraintLayoutInflate8;
                            kqm0 kqm0Var = new kqm0(constraintLayout6, imageView3, textView11, textView12);
                            constraintLayout6.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                            imageView3.setImageDrawable(azo1.r(imageView3.getContext(), j4b1.O1, 2131101341, imageView3.getResources().getDimensionPixelSize(2131167068)));
                            v9w0 v9w0VarQ4 = b2u.q(constraintLayout6);
                            Collections.addAll(v9w0VarQ4.c, textView12, textView11);
                            v9w0VarQ4.e = false;
                            v9w0VarQ4.a();
                            this.c = kqm0Var;
                            return;
                        }
                    } else {
                        i = i7;
                    }
                } else {
                    i = i7;
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate8.getResources().getResourceName(i)));
                throw null;
        }
    }

    private final void r(Object obj) {
        ndo ndoVar = (ndo) obj;
        bjx bjxVar = (bjx) this.c;
        TextView textView = (TextView) bjxVar.g;
        PrimaryButtonView primaryButtonView = (PrimaryButtonView) bjxVar.c;
        IconChevronRight iconChevronRight = (IconChevronRight) bjxVar.d;
        TextView textView2 = (TextView) bjxVar.e;
        String str = ndoVar.b;
        String str2 = ndoVar.a;
        String str3 = ndoVar.c;
        Context context = (Context) this.b;
        if (ihc1.y0(str2) || ihc1.y0(str3) || context.getResources().getConfiguration().fontScale >= 1.5f) {
            String string = context.getString(2131951844);
            if (context.getResources().getConfiguration().fontScale >= 1.5f || ihc1.y0(str2)) {
                str2 = ihc1.y0(str3) ? string : str3;
            }
            textView2.setText(str2);
            iconChevronRight.setVisibility(0);
            primaryButtonView.setVisibility(8);
        } else {
            iconChevronRight.setVisibility(8);
            primaryButtonView.setVisibility(0);
            textView2.setText(str2);
            primaryButtonView.setText(str3);
        }
        if (ihc1.y0(str)) {
            textView.setVisibility(8);
            textView2.setMaxLines(2);
        } else {
            textView.setText(str);
            textView.setVisibility(0);
            textView2.setMaxLines(1);
        }
        ((FrameLayout) bjxVar.b).getBackground().setColorFilter(ndoVar.d, PorterDuff.Mode.DST_OVER);
    }

    public ArtworkView b() {
        return (ArtworkView) ((dxy) this.c).c;
    }

    /* JADX WARN: Code duplicated, block: B:277:0x0a89  */
    /* JADX WARN: Code duplicated, block: B:325:0x0ba6  */
    /* JADX WARN: Code duplicated, block: B:326:0x0ba8  */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.view.View, com.spotify.podcastuiplatform.uiusecases.episoderow.elements.description.EpisodeRowDescriptionView] */
    public final void f(Object obj) {
        int i;
        float f;
        int i2;
        rd10 rd10Var;
        int iR;
        int i3;
        int i4;
        int i5;
        ColorStateList colorStateListValueOf;
        byte b = this.a;
        zkt0 zkt0Var = zkt0.c;
        boolean z = true;
        switch (b) {
            case 0:
                t3a t3aVar = (t3a) obj;
                AppCompatImageButton appCompatImageButton = (AppCompatImageButton) this.c;
                appCompatImageButton.setEnabled(t3aVar.c);
                boolean z2 = t3aVar.d;
                appCompatImageButton.setActivated(z2);
                appCompatImageButton.setContentDescription(((Context) this.b).getResources().getString(z2 ? 2131959263 : 2131959237));
                break;
            case 1:
                pf3 pf3Var = (pf3) obj;
                boolean z3 = pf3Var.f;
                zwg zwgVar = (zwg) this.b;
                TextView textView = (TextView) zwgVar.e;
                ConstraintLayout constraintLayout = (ConstraintLayout) zwgVar.a;
                textView.setText(pf3Var.a);
                ((TextView) zwgVar.d).setText(pf3Var.b);
                ((ArtworkView) zwgVar.b).h(new k07(pf3Var.c, false));
                boolean z4 = pf3Var.e;
                PlayButtonView playButtonView = (PlayButtonView) zwgVar.c;
                if (z4) {
                    playButtonView.setVisibility(0);
                    playButtonView.B(new cet0(z3, new vft0(false), (String) null, 4));
                } else {
                    playButtonView.setVisibility(8);
                }
                constraintLayout.setActivated(z3);
                constraintLayout.setSelected(z3);
                ((hrr0) this.c).setValue(Boolean.valueOf(z3));
                break;
            case 2:
                plg plgVar = (plg) obj;
                c21 c21Var = (c21) this.c;
                ((TextView) c21Var.c).setText(plgVar.a);
                ((TextView) c21Var.i).setText(plgVar.b);
                ((TextView) c21Var.g).setText(plgVar.c);
                ((ArtworkView) c21Var.f).h(new x07(plgVar.e, true));
                ArtworkView artworkView = (ArtworkView) c21Var.d;
                artworkView.n(new y0o(c21Var, plgVar, (byte) 15));
                artworkView.h(new x07(plgVar.f, true));
                ((ArtworkShadow) c21Var.e).b(artworkView, true);
                break;
            case 3:
                l((i2x) obj);
                break;
            case 4:
                cgm0 cgm0Var = (cgm0) obj;
                wj3 wj3Var = (wj3) this.b;
                if (!(cgm0Var instanceof cgm0)) {
                    eg.o();
                } else {
                    ?? r5 = (EpisodeRowDescriptionView) wj3Var.f;
                    mf20 mf20Var = new mf20(z561.T(f9z.Z, new i46((ConstraintLayout) wj3Var.b, (byte) 8)));
                    while (mf20Var.hasNext()) {
                        View view = (View) mf20Var.next();
                        view.setVisibility(view.getId() != 2131430716 ? 0 : 8);
                    }
                    ((ConstraintLayout) this.c).setEnabled(true);
                    b7z b7zVar = cgm0Var.a;
                    ImageView imageView = (ImageView) wj3Var.e;
                    TextView textView2 = (TextView) wj3Var.Z;
                    PaidBadgeView paidBadgeView = (PaidBadgeView) wj3Var.t;
                    PlayButtonView playButtonView2 = (PlayButtonView) wj3Var.X;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) wj3Var.b;
                    EpisodeRowHeaderContainer episodeRowHeaderContainer = (EpisodeRowHeaderContainer) wj3Var.h;
                    ComposeView composeView = (ComposeView) wj3Var.g;
                    ProgressBar progressBar = (ProgressBar) wj3Var.Y;
                    saz sazVar = cgm0Var.b;
                    int i6 = sazVar.f;
                    String str = b7zVar.c;
                    int i7 = b7zVar.i;
                    String str2 = b7zVar.m;
                    maz mazVar = new maz(str2 != null ? 2 : 1, str, b7zVar.b, str2 == null ? b7zVar.g : str2, b7zVar.j, b7zVar.k);
                    naz nazVar = episodeRowHeaderContainer.a;
                    if (nazVar != null) {
                        nazVar.f(mazVar);
                    }
                    playButtonView2.B(new cet0(i6 == 1 || i6 == 2, new vft0(sazVar.g), constraintLayout2.getContext().getString(2131955426, str)));
                    TextView textView3 = (TextView) ((LinearLayout) wj3Var.i).findViewById(2131428713);
                    if (textView3 == null) {
                        i = 8;
                    } else {
                        String strA = a2k1.a(textView3.getContext(), b7zVar.n);
                        if (strA != null) {
                            textView3.setText(strA.concat(" • "));
                            textView3.setVisibility(0);
                            if (i7 != 0 && k4s0.b(i7)) {
                                strA = null;
                            }
                            if (strA != null) {
                                i = 8;
                            }
                        }
                        textView3.setText("");
                        i = 8;
                        textView3.setVisibility(8);
                    }
                    k540 k540Var = b7zVar.l;
                    if (k540Var != null) {
                        paidBadgeView.setVisibility(i);
                        composeView.setVisibility(!k540Var.equals(j540.a) ? 0 : 8);
                        composeView.setContent(new j2i(-303322932, new gbz(k540Var, (byte) 1), true));
                    } else {
                        paidBadgeView.setVisibility(0);
                        composeView.setVisibility(8);
                        boolean z5 = i7 != 0 && k4s0.b(i7);
                        paidBadgeView.setImageDrawable(new n0e1(paidBadgeView.getContext(), paidBadgeView.getContext().getString(2131955878)));
                        paidBadgeView.setContentDescription(paidBadgeView.getContext().getString(2131955877));
                        paidBadgeView.setVisibility(z5 ? 0 : 8);
                    }
                    ((ContentRestrictionBadgeView) wj3Var.c).c(b7zVar.h);
                    textView2.setText(b7zVar.f);
                    ((View) wj3Var.P0).setVisibility(((Boolean) new tpj1(new opg(cgm0Var, (byte) 9), (byte) 12).invoke()).booleanValue() ? 0 : 4);
                    ((View) wj3Var.d).setVisibility(((Boolean) new tpj1(new hbz(cgm0Var, (byte) 0), (byte) 12).invoke()).booleanValue() ? 0 : 4);
                    gix0 gix0Var = sazVar.h;
                    if (gix0Var != null) {
                        imageView.setVisibility(((Boolean) new tpj1(new pdy(gix0Var, (byte) 12), (byte) 11).invoke()).booleanValue() ? 0 : 8);
                        boolean z6 = gix0Var instanceof gix0;
                        if (z6) {
                            gix0 gix0Var2 = gix0Var;
                            long j = gix0Var2.b;
                            if (j != 0) {
                                playButtonView2 = playButtonView2;
                                long j2 = gix0Var2.c;
                                if (j2 > j) {
                                    j2 = j;
                                }
                                f = j2 / j;
                            }
                            if (((Boolean) new ibz(z6, f, gix0Var).invoke()).booleanValue()) {
                                i2 = 0;
                            } else {
                                i2 = 4;
                            }
                            progressBar.setVisibility(i2);
                            progressBar.setProgress(jch0.U(f * 100.0f));
                        } else if (!(gix0Var instanceof hix0)) {
                            eg.o();
                        }
                        f = 0.0f;
                        if (((Boolean) new ibz(z6, f, gix0Var).invoke()).booleanValue()) {
                            i2 = 0;
                        } else {
                            i2 = 4;
                        }
                        progressBar.setVisibility(i2);
                        progressBar.setProgress(jch0.U(f * 100.0f));
                    } else {
                        playButtonView2 = playButtonView2;
                        imageView.setVisibility(((Boolean) new tpj1(new hbz(cgm0Var, (byte) 1), (byte) 11).invoke()).booleanValue() ? 0 : 8);
                        progressBar.setVisibility(((Boolean) new tpj1(new hbz(cgm0Var, (byte) 2), (byte) 11).invoke()).booleanValue() ? 0 : 8);
                        progressBar.setProgress(jch0.U(sazVar.c * 100.0f));
                    }
                    constraintLayout2.setActivated(i6 == 3 || i6 == 1);
                    int i8 = sazVar.e;
                    if (i8 == 0) {
                        i8 = 1;
                    }
                    boolean z7 = i8 == 3;
                    episodeRowHeaderContainer.setEnabled(z7);
                    r5.setEnabled(z7);
                    textView2.setEnabled(z7);
                    imageView.setEnabled(z7);
                    playButtonView2.setEnabled(i8 != 1);
                    ((EpisodeRowQuickActionSectionView) wj3Var.N0).a(new bbz(str, o7h.O0(new uaz(str), cgm0Var.d), o7h.O0(new uaz(str), cgm0Var.e), cgm0Var.f));
                    String str3 = b7zVar.e;
                    caz cazVar = r5.T0;
                    cazVar.b.setText(str3 != null ? ihc1.e1(str3).toString() : null);
                    cazVar.c.setVisibility(8);
                    cazVar.a.setVisibility(8);
                }
                break;
            case 5:
                w9z w9zVar = (w9z) obj;
                tnm tnmVar = (tnm) this.b;
                TextView textView4 = (TextView) tnmVar.h;
                ProgressBar progressBar2 = (ProgressBar) tnmVar.d;
                String str4 = w9zVar.a;
                textView4.setText(str4);
                TextView textView5 = (TextView) tnmVar.g;
                textView5.setText(w9zVar.c);
                ((ArtworkView) tnmVar.c).h(new t07(new g07(w9zVar.b), false));
                MarkAsPlayedButtonView markAsPlayedButtonView = (MarkAsPlayedButtonView) tnmVar.e;
                markAsPlayedButtonView.setContentDescription(markAsPlayedButtonView.getContext().getResources().getString(2131958187, str4));
                ((ContentRestrictionBadgeView) tnmVar.f).c(w9zVar.d);
                saz sazVar2 = w9zVar.e;
                boolean z8 = sazVar2.e == 3;
                textView4.setEnabled(z8);
                textView5.setEnabled(z8);
                markAsPlayedButtonView.setEnabled(z8);
                ConstraintLayout constraintLayout3 = (ConstraintLayout) tnmVar.b;
                int i9 = sazVar2.f;
                constraintLayout3.setActivated(i9 == 3 || i9 == 1);
                progressBar2.setVisibility(((Boolean) new tpj1(new dor(sazVar2, (byte) 11), (byte) 12).invoke()).booleanValue() ? 0 : 4);
                progressBar2.setMax(100);
                progressBar2.setProgress(jch0.U(sazVar2.c * 100.0f));
                break;
            case 6:
                ((r4u) this.b).e((z800) obj);
                break;
            case 7:
                g2z g2zVar = (g2z) this.c;
                FaceView faceView = (FaceView) g2zVar.c;
                TextView textView6 = (TextView) g2zVar.d;
                SpotifyIconView spotifyIconView = (SpotifyIconView) g2zVar.f;
                TextView textView7 = (TextView) g2zVar.e;
                ConstraintLayout constraintLayout4 = (ConstraintLayout) g2zVar.a;
                gw70 gw70Var = (gw70) this.b;
                hji0 hji0Var = ((mni0) obj).a;
                String str5 = hji0Var.i;
                String str6 = hji0Var.a;
                String str7 = hji0Var.b;
                try {
                    eth.h(16);
                    rd10Var = new rd10(Color.parseColor("#".concat(Integer.toString(0, 16))));
                } catch (IllegalArgumentException unused) {
                    rd10Var = null;
                }
                td10 td10Var = new td10(str7, str6, (String) null, rd10Var);
                int i10 = FaceView.f;
                faceView.g(gw70Var, td10Var, (nww0) null);
                if (hji0Var.d) {
                    constraintLayout4.setEnabled(false);
                    textView7.setText(constraintLayout4.getContext().getString(2131960333));
                    spotifyIconView.setVisibility(0);
                    b8k1.p((ConstraintLayout) g2zVar.a, new a8s("android.view.View", (byte) 0));
                } else {
                    constraintLayout4.setEnabled(true);
                    textView7.setText(str6);
                    spotifyIconView.setVisibility(8);
                    b8k1.p((ConstraintLayout) g2zVar.a, new a8s("android.widget.Button", (byte) 0));
                    b8k1.m(constraintLayout4, fg.g, constraintLayout4.getContext().getString(2131960329, str6), (sh) null);
                    if (str5 != null && str5.length() != 0) {
                        textView6.setVisibility(0);
                        textView6.setText(str5);
                    }
                }
                ((TextView) g2zVar.b).setText(hji0Var.g);
                break;
            case 8:
                q4e q4eVar = (q4e) this.b;
                q4eVar.e = ((mui0) obj).a;
                q4eVar.h();
                break;
            case 9:
                mdq0 mdq0Var = (mdq0) obj;
                Context context = (Context) this.b;
                String str8 = mdq0Var.c;
                byp bypVar = (byp) this.c;
                EncoreTextView encoreTextView = (EncoreTextView) bypVar.i;
                EncoreImageView encoreImageView = (EncoreImageView) bypVar.d;
                EncoreButton encoreButton = (EncoreButton) bypVar.h;
                EncoreButton encoreButton2 = (EncoreButton) bypVar.g;
                LinearLayout linearLayout = (LinearLayout) bypVar.f;
                encoreTextView.setText(mdq0Var.a);
                ((EncoreTextView) bypVar.a).setText(mdq0Var.b);
                EncoreButton encoreButton3 = (EncoreButton) bypVar.e;
                encoreButton3.setVisibility(8);
                int iC = l1d.C(2);
                if (iC == 0) {
                    iR = xfo1.r(encoreButton3, 2130968788);
                } else if (iC != 1) {
                    eg.o();
                } else {
                    iR = encoreButton3.getContext().getColor(2131104462);
                }
                encoreButton3.setTextColor(iR);
                String str9 = mdq0Var.d;
                encoreButton2.setVisibility(8);
                encoreButton2.setText(str9);
                encoreButton.setVisibility(0);
                encoreButton.setText(str9);
                String str10 = str8 != null ? str8 : "";
                encoreImageView.setVisibility(str10.length() > 0 ? 0 : 8);
                if (str10.length() > 0) {
                    encoreImageView.setSource(new sux(Uri.parse(str10)));
                }
                linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), context.getResources().getDimensionPixelSize((str8 == null || str8.length() == 0) ? 2131167023 : 2131167033), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
                ((IconX) bypVar.c).setVisibility(!mdq0Var.e ? 0 : 8);
                break;
            case 10:
                znt0 znt0Var = (znt0) obj;
                String str11 = znt0Var.a;
                ytp0 ytp0Var = (ytp0) this.c;
                TextView textView8 = (TextView) ytp0Var.f;
                TextView textView9 = (TextView) ytp0Var.b;
                ImageView imageView2 = (ImageView) ytp0Var.c;
                textView8.setText(str11);
                textView8.setContentDescription(str11);
                h1p1 h1p1Var = znt0Var.c;
                Context context2 = (Context) this.b;
                if (h1p1Var instanceof ynt0) {
                    g4b1 g4b1Var = new g4b1(context2, j4b1.a6, context2.getResources().getDimensionPixelSize(2131166822));
                    g4b1Var.b(azo1.p(context2, 2130968791));
                    imageView2.setImageDrawable(g4b1Var);
                } else if (!(h1p1Var instanceof xnt0)) {
                    eg.o();
                } else {
                    imageView2.setImageDrawable(context2.getDrawable(2131233929));
                }
                imageView2.setTag(h1p1Var);
                String str12 = znt0Var.b;
                if (str12 != null) {
                    textView9.setText(str12);
                    i4 = 0;
                    textView9.setVisibility(0);
                    i3 = 8;
                } else {
                    i3 = 8;
                    i4 = 0;
                    textView9.setVisibility(8);
                }
                boolean z9 = znt0Var.d;
                EncoreButton encoreButton4 = (EncoreButton) ytp0Var.d;
                if (!z9) {
                    encoreButton4.setVisibility(i3);
                } else {
                    encoreButton4.setVisibility(i4);
                }
                break;
            case 11:
                q4e q4eVar2 = (q4e) ((zfr) this.b).b;
                q4eVar2.e = ((szu0) obj).a;
                q4eVar2.h();
                break;
            case 12:
                x6v0 x6v0Var = (x6v0) obj;
                y6v0 y6v0VarK = k();
                y6v0VarK.d.setText(x6v0Var.b);
                TextView textView10 = y6v0VarK.c;
                textView10.setText(x6v0Var.c);
                ArtworkView artworkView2 = y6v0VarK.b;
                artworkView2.h(new a17(new g07(x6v0Var.d)));
                SwitchCompat switchCompat = y6v0VarK.e;
                switchCompat.setOnCheckedChangeListener(null);
                boolean z10 = x6v0Var.e;
                switchCompat.setChecked(z10);
                switchCompat.setOnCheckedChangeListener((yfs) this.c);
                switchCompat.setTag(2131430445, Boolean.valueOf(z10));
                boolean z11 = !x6v0Var.f;
                y6v0VarK.a.setEnabled(z11);
                y6v0VarK.d.setEnabled(z11);
                textView10.setEnabled(z11);
                artworkView2.setEnabled(z11);
                switchCompat.setEnabled(z11);
                break;
            case 13:
                ((nzj) this.b).f((lsv0) obj);
                break;
            case 14:
                jtv0 jtv0Var = (jtv0) obj;
                Integer num = jtv0Var.c;
                int i11 = jtv0Var.b;
                ntv0 ntv0Var = (ntv0) this.b;
                EncoreButton encoreButton5 = ntv0Var.b;
                if (i11 == 1) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) encoreButton5.getLayoutParams();
                    DisplayMetrics displayMetrics = encoreButton5.getContext().getResources().getDisplayMetrics();
                    displayMetrics.getClass();
                    int iApplyDimension = (int) TypedValue.applyDimension(1, 16.0f, displayMetrics);
                    int iApplyDimension2 = (int) TypedValue.applyDimension(1, 8.0f, displayMetrics);
                    marginLayoutParams.setMargins(iApplyDimension, iApplyDimension2, iApplyDimension, iApplyDimension2);
                    encoreButton5.setLayoutParams(marginLayoutParams);
                    i5 = 0;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) encoreButton5.getLayoutParams();
                    DisplayMetrics displayMetrics2 = encoreButton5.getContext().getResources().getDisplayMetrics();
                    displayMetrics2.getClass();
                    int iApplyDimension3 = (int) TypedValue.applyDimension(1, 0.0f, displayMetrics2);
                    int iApplyDimension4 = (int) TypedValue.applyDimension(1, 8.0f, displayMetrics2);
                    marginLayoutParams2.setMargins(iApplyDimension3, iApplyDimension4, iApplyDimension3, iApplyDimension4);
                    encoreButton5.setLayoutParams(marginLayoutParams2);
                    i5 = -2;
                }
                ViewGroup.LayoutParams layoutParams = encoreButton5.getLayoutParams();
                layoutParams.width = i5;
                encoreButton5.setLayoutParams(layoutParams);
                encoreButton5.setText(jtv0Var.a);
                if (num != null) {
                    Resources resources = ntv0Var.a.getResources();
                    int iIntValue = num.intValue();
                    ThreadLocal threadLocal = qx21.a;
                    colorStateListValueOf = ColorStateList.valueOf(resources.getColor(iIntValue, null));
                } else {
                    colorStateListValueOf = (ColorStateList) this.c;
                }
                encoreButton5.setBackgroundTintList(colorStateListValueOf);
                break;
            case 15:
                Context context3 = (Context) this.b;
                wrz0 wrz0Var = (wrz0) obj;
                int i12 = wrz0Var.a.a;
                Boolean bool = wrz0Var.d;
                Boolean bool2 = wrz0Var.e;
                ytp0 ytp0Var2 = (ytp0) this.c;
                ((ArtworkView) ytp0Var2.c).h(new t07(wrz0Var.b, false));
                boolean z12 = wrz0Var.c;
                if (z12) {
                    Boolean bool3 = Boolean.TRUE;
                    if (u890.j(bool, bool3)) {
                        int i13 = bool2.equals(bool3) ? 2131960838 : 2131960840;
                        TextView textView11 = (TextView) ytp0Var2.e;
                        textView11.setVisibility(0);
                        textView11.setText(textView11.getContext().getResources().getString(i13));
                        AppCompatRatingBar appCompatRatingBar = (AppCompatRatingBar) ytp0Var2.f;
                        appCompatRatingBar.setVisibility(0);
                        appCompatRatingBar.setRating(i12);
                        appCompatRatingBar.setContentDescription(context3.getResources().getQuantityString(2131820546, i12, Integer.valueOf(i12)));
                    }
                }
                if (z12 && u890.j(bool, Boolean.FALSE)) {
                    ((TextView) ytp0Var2.e).setVisibility(8);
                    AppCompatRatingBar appCompatRatingBar2 = (AppCompatRatingBar) ytp0Var2.f;
                    appCompatRatingBar2.setVisibility(0);
                    appCompatRatingBar2.setRating(i12);
                    appCompatRatingBar2.setContentDescription(context3.getResources().getQuantityString(2131820546, i12, Integer.valueOf(i12)));
                    int i14 = bool2.equals(Boolean.TRUE) ? 2131952601 : 2131956040;
                    TextView textView12 = (TextView) ytp0Var2.d;
                    textView12.setVisibility(0);
                    textView12.setText(textView12.getContext().getResources().getString(i14));
                } else {
                    Boolean bool4 = Boolean.TRUE;
                    int i15 = bool2.equals(bool4) ? 2131963545 : 2131963546;
                    TextView textView13 = (TextView) ytp0Var2.e;
                    textView13.setVisibility(0);
                    textView13.setText(textView13.getContext().getResources().getString(i15));
                    int i16 = bool2.equals(bool4) ? 2131963543 : 2131963544;
                    TextView textView14 = (TextView) ytp0Var2.d;
                    textView14.setVisibility(0);
                    textView14.setText(textView14.getContext().getResources().getString(i16));
                }
                break;
            case 16:
                l6s l6sVar = (l6s) this.b;
                FindInContextView findInContextView = (FindInContextView) l6sVar.c;
                if (((k451) obj).a) {
                    if (!findInContextView.isLaidOut()) {
                        findInContextView.addOnLayoutChangeListener(new eg7(this, (byte) 10));
                    } else {
                        o0c.M(((FindInContextView) l6sVar.c).U0);
                        iu30 iu30Var = (iu30) this.c;
                        if (iu30Var != null) {
                            iu30Var.invoke(h451.b);
                        }
                    }
                }
                break;
            case 17:
                dy51 dy51Var = (dy51) obj;
                y441 y441Var = (y441) this.c;
                ((EncoreTitleView) y441Var.c).setText(dy51Var.a);
                ImageView imageView3 = (ImageView) y441Var.b;
                imageView3.setContentDescription(dy51Var.d);
                imageView3.setBackgroundResource(dy51Var.b);
                MaterialRadioButton materialRadioButton = (MaterialRadioButton) y441Var.d;
                boolean z13 = dy51Var.c;
                materialRadioButton.setOnCheckedChangeListener(null);
                materialRadioButton.setChecked(z13);
                materialRadioButton.setOnCheckedChangeListener(new u3g(this, (byte) 1));
                break;
            case 18:
                wia1 wia1Var = (wia1) obj;
                yt91 yt91Var = (yt91) this.c;
                ((TextView) yt91Var.d).setText(wia1Var.a);
                ConstraintLayout constraintLayout5 = (ConstraintLayout) yt91Var.b;
                boolean z14 = wia1Var.b;
                constraintLayout5.setActivated(z14);
                AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) yt91Var.c;
                appCompatImageButton2.setVisibility(z14 ? 0 : 8);
                if (z14) {
                    Context context4 = (Context) this.b;
                    appCompatImageButton2.setImageDrawable(azo1.r(context4, j4b1.G1, 2131101342, context4.getResources().getDimensionPixelSize(2131165724)));
                }
                break;
            case 19:
                xya1 xya1Var = (xya1) obj;
                ua91 ua91Var = (ua91) this.c;
                TextView textView15 = (TextView) ua91Var.e;
                textView15.setText(xya1Var.a);
                ((TextView) ua91Var.d).setText(xya1Var.b);
                textView15.setTextAppearance(2132018024);
                Context context5 = (Context) this.b;
                textView15.setTextColor(context5.getColor(2131104462));
                boolean z15 = xya1Var.c;
                ImageButton imageButton = (ImageButton) ua91Var.c;
                if (!z15) {
                    imageButton.setVisibility(8);
                } else {
                    imageButton.setVisibility(0);
                    g4b1 g4b1Var2 = new g4b1(context5, j4b1.p3, a8o.y(12.0f, context5.getResources()));
                    g4b1Var2.b(context5.getColor(2131102468));
                    imageButton.setImageDrawable(g4b1Var2);
                }
                break;
            case 20:
                jze1 jze1Var = (jze1) obj;
                kze1 kze1Var = (kze1) ((idd1) this.c).getValue();
                kze1Var.b.setText(jze1Var.a);
                SwitchCompat switchCompat2 = kze1Var.c;
                switchCompat2.setOnCheckedChangeListener(null);
                switchCompat2.setChecked(jze1Var.b);
                switchCompat2.setOnCheckedChangeListener((yfs) this.b);
                break;
            case 21:
                uwf1 uwf1Var = (uwf1) obj;
                p2o0 p2o0Var = (p2o0) this.b;
                idd1 idd1Var = (idd1) p2o0Var.g;
                ig3 ig3Var = (ig3) p2o0Var.e;
                String str13 = uwf1Var.k;
                String str14 = uwf1Var.j;
                boolean z16 = uwf1Var.f;
                ks6 ks6Var = (ks6) p2o0Var.c;
                ((ArtworkView) ks6Var.d).setVisibility(8);
                ((PlayIndicatorComposeView) ks6Var.t).z(zkt0Var);
                TextView textView16 = (TextView) ks6Var.R0;
                String str15 = uwf1Var.a;
                textView16.setText(str15);
                textView16.setMaxLines(((bf) ((idd1) p2o0Var.b).getValue()).c(1));
                TextView textView17 = (TextView) ks6Var.Q0;
                textView17.setText(o7h.y0(uwf1Var.b, ", ", (String) null, (String) null, (iu30) null, 62));
                ((QuickActionView) ks6Var.Z).a(uwf1Var.i);
                EnhancedBadgeView enhancedBadgeView = (EnhancedBadgeView) ks6Var.f;
                enhancedBadgeView.setVisibility(8);
                ContentRestrictionBadgeView contentRestrictionBadgeView = (ContentRestrictionBadgeView) ks6Var.N0;
                contentRestrictionBadgeView.c(uwf1Var.d);
                ContextMenuButton contextMenuButton = (ContextMenuButton) p2o0Var.f;
                contextMenuButton.setEnabled(true);
                contextMenuButton.setContentDescription(contextMenuButton.getResources().getString(2131962418, str15));
                DownloadBadgeView downloadBadgeView = (DownloadBadgeView) ks6Var.e;
                downloadBadgeView.c(uwf1Var.c);
                PremiumBadgeView premiumBadgeView = (PremiumBadgeView) ks6Var.X;
                premiumBadgeView.setVisibility(8);
                LockedBadgeView lockedBadgeView = (LockedBadgeView) ks6Var.i;
                lockedBadgeView.c(uwf1Var.l);
                boolean z17 = uwf1Var.e;
                FrameLayout frameLayout = (FrameLayout) ks6Var.S0;
                if (z17) {
                    frameLayout.setVisibility(0);
                    zbs zbsVar = (zbs) ((idd1) p2o0Var.d).getValue();
                    CharSequence text = textView17.getText();
                    tan0 tan0Var = new tan0(1, !(text == null || ihc1.y0(text)));
                    zbsVar.getClass();
                    zbsVar.a(tan0Var);
                } else {
                    frameLayout.setVisibility(8);
                }
                w2g0.l(lockedBadgeView, enhancedBadgeView, contentRestrictionBadgeView, premiumBadgeView, downloadBadgeView);
                ConstraintLayout constraintLayout6 = ig3Var.a;
                TextView textView18 = ig3Var.b;
                constraintLayout6.setActivated(z16);
                ig3Var.a.setSelected(z16);
                w2g0.w(ks6Var, !uwf1Var.h && uwf1Var.g);
                if (ihc1.y0(str14)) {
                    textView18.setVisibility(8);
                } else {
                    textView18.setText(str14);
                    textView18.setVisibility(0);
                }
                if (str13 != null) {
                    ((TextView) ((View) idd1Var.getValue()).findViewById(2131430483)).setText(str13);
                }
                ((View) idd1Var.getValue()).setVisibility(str13 != null ? 0 : 8);
                ((ConstraintLayout) ks6Var.P0).setBackgroundColor(uwf1Var.m);
                break;
            case 22:
                izf1 izf1Var = (izf1) obj;
                zfr zfrVar = (zfr) this.b;
                ContextMenuButton contextMenuButton2 = (ContextMenuButton) zfrVar.c;
                boolean z18 = izf1Var.f;
                boolean z19 = izf1Var.h;
                String str16 = izf1Var.b;
                ks6 ks6Var2 = (ks6) zfrVar.b;
                ConstraintLayout constraintLayout7 = (ConstraintLayout) ks6Var2.a;
                ViewGroup.LayoutParams layoutParams2 = constraintLayout7.getLayoutParams();
                if (layoutParams2 == null) {
                    bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams3.bottomMargin = izf1Var.j ? constraintLayout7.getResources().getDimensionPixelSize(2131167025) : 0;
                    constraintLayout7.setLayoutParams(marginLayoutParams3);
                    ((ArtworkView) ks6Var2.d).setVisibility(8);
                    ((TextView) ks6Var2.R0).setText(str16);
                    ((TextView) ks6Var2.Q0).setText(o7h.y0(izf1Var.c, ", ", (String) null, (String) null, (iu30) null, 62));
                    ((ContentRestrictionBadgeView) ks6Var2.N0).c(izf1Var.e);
                    contextMenuButton2.setEnabled(true);
                    contextMenuButton2.setContentDescription(contextMenuButton2.getResources().getString(2131962418, str16));
                    contextMenuButton2.setVisibility(z19 ? 0 : 8);
                    ((DownloadBadgeView) ks6Var2.e).c(izf1Var.d);
                    constraintLayout7.setActivated(z18);
                    constraintLayout7.setSelected(z18);
                    if (!z19 && !izf1Var.i) {
                        z = false;
                    }
                    constraintLayout7.setEnabled(z);
                    w2g0.w(ks6Var2, z);
                }
                break;
            case 23:
                ((ig3) this.c).b.setText(((Context) this.b).getString(2131961559, ((b7k1) obj).a));
                break;
            case 24:
                iqm1 iqm1Var = (iqm1) obj;
                g931 g931Var = (g931) this.c;
                ((TextView) g931Var.d).setText(iqm1Var.b);
                ((MaterialRadioButton) g931Var.c).setChecked(iqm1Var.c);
                this.b = iqm1Var;
                break;
            case 25:
                kqm1 kqm1Var = (kqm1) obj;
                kqm0 kqm0Var = (kqm0) this.c;
                kqm0Var.c.setText(kqm1Var.b);
                kqm0Var.b.setText(kqm1Var.c);
                this.b = kqm1Var;
                break;
            case 26:
                r(obj);
                break;
            default:
                swf1 swf1Var = (swf1) obj;
                tzf1 tzf1Var = (tzf1) this.b;
                if (!(swf1Var instanceof swf1)) {
                    eg.o();
                } else {
                    tzf1Var.n();
                    tzf1Var.getRoot().setEnabled(true);
                    TextView title = tzf1Var.getTitle();
                    int i17 = swf1Var.g;
                    uez0 uez0Var = swf1Var.f;
                    String str17 = swf1Var.a;
                    title.setText(str17);
                    tzf1Var.getSubtitle().setText(f6o1.k(tzf1Var.getRoot().getResources(), swf1Var.b));
                    tzf1Var.getArtwork().h(new g17(swf1Var.c));
                    ContextMenuButton contextMenuButton3 = (ContextMenuButton) this.c;
                    contextMenuButton3.setEnabled(true);
                    contextMenuButton3.setContentDescription(contextMenuButton3.getResources().getString(2131962418, str17));
                    tzf1Var.d().a(uez0Var);
                    LockedBadgeView lockedBadgeViewO = tzf1Var.o();
                    lockedBadgeViewO.getClass();
                    lockedBadgeViewO.setVisibility(8);
                    tzf1Var.c().setVisibility(8);
                    tzf1Var.j().c(swf1Var.e);
                    tzf1Var.i().c(swf1Var.d);
                    PremiumBadgeView premiumBadgeViewK = tzf1Var.k();
                    premiumBadgeViewK.getClass();
                    premiumBadgeViewK.setVisibility(8);
                    w2g0.l(tzf1Var.o(), tzf1Var.c(), tzf1Var.j(), tzf1Var.k(), tzf1Var.i());
                    boolean z20 = i17 != 3;
                    tzf1Var.getRoot().setActivated(z20);
                    tzf1Var.getRoot().setSelected(z20);
                    tzf1Var.setEnabled(swf1Var.h && (!uez0Var.equals(rez0.a) && !uez0Var.equals(sez0.a)));
                    PlayIndicatorComposeView playIndicatorComposeViewL = tzf1Var.l();
                    int iC2 = l1d.C(i17);
                    if (iC2 == 0) {
                        zkt0Var = zkt0.a;
                    } else if (iC2 == 1) {
                        zkt0Var = zkt0.b;
                    } else if (iC2 != 2) {
                        eg.o();
                    }
                    playIndicatorComposeViewL.z(zkt0Var);
                }
                break;
        }
    }

    public final View getView() {
        switch (this.a) {
            case 0:
                return (AppCompatImageButton) this.c;
            case 1:
                return (ConstraintLayout) ((zwg) this.b).a;
            case 2:
                return (RoundedConstraintLayout) ((c21) this.c).b;
            case 3:
                return (FrameLayout) ((h72) this.c).b;
            case 4:
                return (ConstraintLayout) this.c;
            case 5:
                return (ConstraintLayout) this.c;
            case 6:
                return (ConstraintLayout) ((dxy) this.c).b;
            case 7:
                return (ConstraintLayout) ((g2z) this.c).a;
            case 8:
                return (FrameLayout) this.c;
            case 9:
                return (ConstraintLayout) ((byp) this.c).b;
            case 10:
                return (ConstraintLayout) ((ytp0) this.c).e;
            case 11:
                return (FrameLayout) this.c;
            case 12:
                return k().a;
            case 13:
                return (ComposeView) this.c;
            case 14:
                return ((ntv0) this.b).a;
            case 15:
                return (ConstraintLayout) ((ytp0) this.c).b;
            case 16:
                return (ConstraintLayout) ((l6s) this.b).a;
            case 17:
                return (EncoreListRow) ((y441) this.c).a;
            case 18:
                return (ConstraintLayout) ((yt91) this.c).b;
            case 19:
                return (ConstraintLayout) ((ua91) this.c).b;
            case 20:
                return ((kze1) ((idd1) this.c).getValue()).a;
            case 21:
                return (ConstraintLayout) this.c;
            case 22:
                return (ConstraintLayout) this.c;
            case 23:
                return ((ig3) this.c).a;
            case 24:
                return (ConstraintLayout) ((g931) this.c).b;
            case 25:
                return ((kqm0) this.c).a;
            case 26:
                return (FrameLayout) ((bjx) this.c).b;
            default:
                return ((tzf1) this.b).getRoot();
        }
    }

    public y6v0 k() {
        return (y6v0) ((idd1) this.b).getValue();
    }

    public void l(i2x i2xVar) {
        h72 h72Var = (h72) this.c;
        EncoreButton encoreButton = (EncoreButton) h72Var.e;
        VideoControlsOverlayView videoControlsOverlayView = (VideoControlsOverlayView) h72Var.t;
        boolean z = i2xVar.f;
        boolean z2 = i2xVar.j;
        String str = i2xVar.d;
        boolean z3 = true;
        boolean z4 = (i2xVar.h || i2xVar.g) ? false : true;
        ((VideoSurfaceView) h72Var.Y).setVisibility(z4 ? 0 : 8);
        videoControlsOverlayView.setVisibility(z4 ? 0 : 8);
        ((View) h72Var.X).setVisibility(!z4 ? 0 : 8);
        ((TextView) h72Var.c).setText(i2xVar.b);
        int length = str.length();
        TextView textView = (TextView) h72Var.i;
        if (length == 0) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
        ((FrameLayout) h72Var.b).setClickable(z2);
        encoreButton.setVisibility(z2 ? 0 : 8);
        String string = i2xVar.c;
        if (ihc1.y0(string)) {
            string = ((Context) this.b).getString(2131954910);
        }
        encoreButton.setText(string);
        ijj1 ijj1Var = i2xVar.e;
        if (!(ijj1Var instanceof wst0)) {
            if (!(ijj1Var instanceof mas0)) {
                eg.o();
                return;
            }
            z3 = false;
        }
        videoControlsOverlayView.c = z3;
        ((StateListAnimatorImageButton) videoControlsOverlayView.g.b).setImageDrawable(azo1.r(videoControlsOverlayView.getContext(), ijj1Var.getIcon(), 2131104462, videoControlsOverlayView.getResources().getDimensionPixelSize(2131167189)));
        ((IconVolume) h72Var.f).setVisibility(z ? 8 : 0);
        ((IconVolumeOff) h72Var.g).setVisibility(z ? 0 : 8);
    }

    public final void n(iu30 iu30Var) {
        String string;
        switch (this.a) {
            case 0:
                ((AppCompatImageButton) this.c).setOnClickListener(new cg1(iu30Var, this, (byte) 26));
                break;
            case 1:
                zwg zwgVar = (zwg) this.b;
                ((ConstraintLayout) zwgVar.a).setOnClickListener(new yer(iu30Var, (byte) 1));
                ((PlayButtonView) zwgVar.c).n(new m0o(iu30Var, (byte) 7));
                break;
            case 2:
                RoundedConstraintLayout roundedConstraintLayout = (RoundedConstraintLayout) ((c21) this.c).b;
                roundedConstraintLayout.setOnClickListener(new yer(iu30Var, (byte) 23));
                b8k1.m(roundedConstraintLayout, fg.g, ((Context) this.b).getString(2131953916), (sh) null);
                break;
            case 3:
                h72 h72Var = (h72) this.c;
                z8p1.v((FrameLayout) h72Var.b, 1000, new mwr(iu30Var, (byte) 1));
                ((ClearButtonView) h72Var.d).n(new mwr(iu30Var, (byte) 2));
                z8p1.v((EncoreButton) h72Var.e, 1000, new mwr(iu30Var, (byte) 3));
                ((VideoControlsOverlayView) h72Var.t).d = new mwr(iu30Var, (byte) 4);
                ((FrameLayout) h72Var.h).setOnClickListener(new trr(iu30Var, (byte) 6));
                break;
            case 4:
                wj3 wj3Var = (wj3) this.b;
                ((PlayButtonView) wj3Var.X).n(new mwr(iu30Var, (byte) 9));
                ConstraintLayout constraintLayout = (ConstraintLayout) this.c;
                constraintLayout.setOnClickListener(new trr(iu30Var, (byte) 13));
                constraintLayout.setOnLongClickListener(new wer(iu30Var, (byte) 4));
                ((EpisodeRowQuickActionSectionView) wj3Var.N0).n(new mwr(iu30Var, (byte) 10));
                break;
            case 5:
                ConstraintLayout constraintLayout2 = (ConstraintLayout) this.c;
                constraintLayout2.setOnClickListener(new trr(iu30Var, (byte) 14));
                constraintLayout2.setOnLongClickListener(new wer(iu30Var, (byte) 5));
                ((MarkAsPlayedButtonView) ((tnm) this.b).e).setOnClickListener(new trr(iu30Var, (byte) 15));
                break;
            case 6:
                ((ConstraintLayout) ((dxy) this.c).b).setOnClickListener(new trr(iu30Var, (byte) 19));
                break;
            case 7:
                ((ConstraintLayout) ((g2z) this.c).a).setOnClickListener(new o0s(iu30Var, (byte) 10));
                break;
            case 8:
                ((q4e) this.b).h = iu30Var;
                break;
            case 9:
                byp bypVar = (byp) this.c;
                ((IconX) bypVar.c).setOnClickListener(new o0s(iu30Var, (byte) 24));
                ((EncoreButton) bypVar.g).setOnClickListener(new o0s(iu30Var, (byte) 25));
                ((EncoreButton) bypVar.h).setOnClickListener(new o0s(iu30Var, (byte) 26));
                ((EncoreButton) bypVar.e).setOnClickListener(new o0s(iu30Var, (byte) 27));
                break;
            case 10:
                ytp0 ytp0Var = (ytp0) this.c;
                ((ConstraintLayout) ytp0Var.e).setOnClickListener(new oes(iu30Var, (byte) 1));
                ((EncoreButton) ytp0Var.d).setOnClickListener(new oes(iu30Var, (byte) 2));
                break;
            case 11:
                ((q4e) ((zfr) this.b).b).h = iu30Var;
                break;
            case 12:
                this.c = new yfs(iu30Var, (byte) 0);
                k().e.setOnCheckedChangeListener((yfs) this.c);
                k().a.setOnClickListener(new zfs(this, (byte) 0));
                y6v0 y6v0VarK = k();
                ConstraintLayout constraintLayout3 = y6v0VarK.a;
                TextView textView = y6v0VarK.c;
                TextView textView2 = y6v0VarK.d;
                if (constraintLayout3.isEnabled()) {
                    string = constraintLayout3.getResources().getString(y6v0VarK.e.isChecked() ? 2131960212 : 2131960211, textView2.getText(), textView.getText());
                } else {
                    string = constraintLayout3.getResources().getString(2131960213, textView2.getText(), textView.getText());
                }
                string.getClass();
                constraintLayout3.setContentDescription(string);
                b8k1.p(constraintLayout3, new xf(y6v0VarK, (byte) 0));
                break;
            case 13:
                ((nzj) this.b).n(iu30Var);
                break;
            case 14:
                ((ntv0) this.b).b.setOnClickListener(new oes(iu30Var, (byte) 15));
                break;
            case 15:
                ((AppCompatRatingBar) ((ytp0) this.c).f).setOnRatingBarChangeListener(new fjs(this, iu30Var));
                break;
            case 16:
                this.c = iu30Var;
                l6s l6sVar = (l6s) this.b;
                ((FindInContextView) l6sVar.c).n(new shs(iu30Var, (byte) 4));
                ((TextView) l6sVar.b).setOnClickListener(new sis(iu30Var, (byte) 11));
                break;
            case 17:
                this.b = iu30Var;
                EncoreListRow encoreListRow = (EncoreListRow) ((y441) this.c).a;
                encoreListRow.setOnClickListener(new sis(iu30Var, (byte) 15));
                b8k1.m(encoreListRow, fg.g, encoreListRow.getContext().getString(2131961351), (sh) null);
                break;
            case 18:
                ((ConstraintLayout) ((yt91) this.c).b).setOnClickListener(new aqs(iu30Var, (byte) 1));
                break;
            case 19:
                ((ImageButton) ((ua91) this.c).c).setOnClickListener(new aqs(iu30Var, (byte) 2));
                break;
            case 20:
                this.b = new yfs(iu30Var, (byte) 1);
                ((kze1) ((idd1) this.c).getValue()).c.setOnCheckedChangeListener((yfs) this.b);
                break;
            case 21:
                p2o0 p2o0Var = (p2o0) this.b;
                ig3 ig3Var = (ig3) p2o0Var.e;
                ig3Var.a.setOnClickListener(new aqs(iu30Var, (byte) 7));
                ig3Var.a.setOnLongClickListener(new wer(iu30Var, (byte) 15));
                ((ContextMenuButton) p2o0Var.f).n(new shs(iu30Var, (byte) 22));
                ((QuickActionView) ((ks6) p2o0Var.c).Z).a = new shs(iu30Var, (byte) 21);
                break;
            case 22:
                zfr zfrVar = (zfr) this.b;
                ((ConstraintLayout) ((ks6) zfrVar.b).a).setOnClickListener(new aqs(iu30Var, (byte) 11));
                ((ContextMenuButton) zfrVar.c).n(new shs(iu30Var, (byte) 29));
                break;
            case 23:
                ((ig3) this.c).a.setOnClickListener(new aqs(iu30Var, (byte) 14));
                break;
            case 24:
                ((ConstraintLayout) ((g931) this.c).b).setOnClickListener(new cvr(this, iu30Var, (byte) 19));
                break;
            case 25:
                ((kqm0) this.c).a.setOnClickListener(new cvr(this, iu30Var, (byte) 20));
                break;
            case 26:
                bjx bjxVar = (bjx) this.c;
                z8p1.v((ConstraintLayout) bjxVar.f, 500, new z720(iu30Var, (byte) 2));
                z8p1.v((PrimaryButtonView) bjxVar.c, 500, new z720(iu30Var, (byte) 3));
                break;
            default:
                tzf1 tzf1Var = (tzf1) this.b;
                tzf1Var.getRoot().setOnClickListener(new jn90(iu30Var, (byte) 20));
                tzf1Var.getRoot().setOnLongClickListener(new wer(iu30Var, (byte) 18));
                ((ContextMenuButton) this.c).n(new azr0(iu30Var, (byte) 15));
                tzf1Var.d().a = new azr0(iu30Var, (byte) 16);
                break;
        }
    }

    public yir(zfr zfrVar, byte b) {
        this.a = (byte) 22;
        this.b = zfrVar;
        this.c = (ConstraintLayout) ((ks6) zfrVar.b).a;
    }

    public yir(p2o0 p2o0Var) {
        this.a = (byte) 21;
        this.b = p2o0Var;
        this.c = ((ig3) p2o0Var.e).a;
    }

    public yir(zfr zfrVar) {
        this.a = (byte) 11;
        this.b = zfrVar;
        this.c = (FrameLayout) ((n4b) zfrVar.c).b;
    }

    public yir(Context context, boolean z) {
        Drawable colorDrawable;
        this.a = (byte) 26;
        this.b = context;
        View viewInflate = LayoutInflater.from(context).inflate(2131624652, (ViewGroup) null, false);
        int i = 2131428292;
        View view = (PrimaryButtonView) m5n1.t(viewInflate, 2131428292);
        if (view != null) {
            i = 2131428295;
            IconChevronRight iconChevronRightT = m5n1.t(viewInflate, 2131428295);
            if (iconChevronRightT != null) {
                i = 2131428300;
                TextView textView = (TextView) m5n1.t(viewInflate, 2131428300);
                if (textView != null) {
                    i = 2131429060;
                    if (m5n1.t(viewInflate, 2131429060) != null) {
                        i = 2131430432;
                        ConstraintLayout constraintLayoutT = m5n1.t(viewInflate, 2131430432);
                        if (constraintLayoutT != null) {
                            i = 2131430862;
                            TextView textView2 = (TextView) m5n1.t(viewInflate, 2131430862);
                            if (textView2 != null) {
                                FrameLayout frameLayout = (FrameLayout) viewInflate;
                                bjx bjxVar = new bjx(frameLayout, view, iconChevronRightT, textView, constraintLayoutT, textView2, (byte) 5);
                                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                if (z) {
                                    colorDrawable = context.getDrawable(2131233081);
                                } else {
                                    colorDrawable = new ColorDrawable(context.getColor(2131102463));
                                }
                                frameLayout.setBackground(colorDrawable);
                                v9w0 v9w0VarP = b2u.p(constraintLayoutT);
                                Collections.addAll(v9w0VarP.c, textView, textView2, view);
                                v9w0VarP.a();
                                this.c = bjxVar;
                                return;
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0452 A[PHI: r5
      0x0452: PHI (r5v1 int) = (r5v0 int), (r5v2 int) binds: [B:92:0x03ab, B:104:0x03fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:110:0x0454 A[PHI: r3
      0x0454: PHI (r3v3 int) = (r3v2 int), (r3v5 int), (r3v6 int), (r3v7 int), (r3v8 int), (r3v9 int) binds: [B:90:0x03a1, B:94:0x03b6, B:96:0x03c3, B:98:0x03d0, B:100:0x03e1, B:102:0x03ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x00c2 A[PHI: r5
      0x00c2: PHI (r5v20 int) = (r5v0 int), (r5v21 int), (r5v22 int) binds: [B:5:0x0032, B:7:0x003d, B:9:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    public yir(Context context, gw70 gw70Var, byte b) {
        int i;
        int i2;
        f0a eb80Var;
        int i3;
        this.a = b;
        int i4 = 2131427611;
        switch (b) {
            case 2:
                this.b = context;
                RoundedConstraintLayout roundedConstraintLayoutInflate = LayoutInflater.from(context).inflate(2131624334, (ViewGroup) null, false);
                int i5 = 2131427594;
                TextView textView = (TextView) m5n1.t(roundedConstraintLayoutInflate, 2131427594);
                if (textView == null) {
                    i = i5;
                } else {
                    View view = (ArtworkView) m5n1.t(roundedConstraintLayoutInflate, 2131427611);
                    if (view != null) {
                        i5 = 2131427612;
                        if (m5n1.t(roundedConstraintLayoutInflate, 2131427612) != null) {
                            i5 = 2131427624;
                            ArtworkShadow artworkShadowT = m5n1.t(roundedConstraintLayoutInflate, 2131427624);
                            if (artworkShadowT != null) {
                                i5 = 2131427673;
                                View view2 = (ArtworkView) m5n1.t(roundedConstraintLayoutInflate, 2131427673);
                                if (view2 != null) {
                                    RoundedConstraintLayout roundedConstraintLayout = roundedConstraintLayoutInflate;
                                    i5 = 2131428438;
                                    TextView textView2 = (TextView) m5n1.t(roundedConstraintLayoutInflate, 2131428438);
                                    if (textView2 != null) {
                                        i5 = 2131430402;
                                        ImageView imageView = (ImageView) m5n1.t(roundedConstraintLayoutInflate, 2131430402);
                                        if (imageView != null) {
                                            i4 = 2131431356;
                                            TextView textView3 = (TextView) m5n1.t(roundedConstraintLayoutInflate, 2131431356);
                                            if (textView3 != null) {
                                                i = 2131431595;
                                                IconVideo iconVideoT = m5n1.t(roundedConstraintLayoutInflate, 2131431595);
                                                if (iconVideoT != null) {
                                                    c21 c21Var = new c21(roundedConstraintLayout, textView, view, artworkShadowT, view2, textView2, imageView, textView3, iconVideoT, (byte) 7);
                                                    roundedConstraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                                    f47 f47Var = new f47(gw70Var);
                                                    view2.setViewContext(f47Var);
                                                    view.setViewContext(f47Var);
                                                    b8k1.q(roundedConstraintLayout, true);
                                                    v9w0 v9w0VarP = b2u.p(roundedConstraintLayout);
                                                    Collections.addAll(v9w0VarP.d, view2, view);
                                                    Collections.addAll(v9w0VarP.c, textView3, textView2, textView);
                                                    v9w0VarP.a();
                                                    this.c = c21Var;
                                                    return;
                                                }
                                            } else {
                                                i = i4;
                                            }
                                        } else {
                                            i = i5;
                                        }
                                    } else {
                                        i = i5;
                                    }
                                } else {
                                    i = i5;
                                }
                            } else {
                                i = i5;
                            }
                        } else {
                            i = i5;
                        }
                    } else {
                        i = i4;
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(roundedConstraintLayoutInflate.getResources().getResourceName(i)));
                throw null;
            case 5:
                View viewInflate = LayoutInflater.from(context).inflate(2131624473, (ViewGroup) null, false);
                ArtworkView artworkViewT = m5n1.t(viewInflate, 2131427611);
                if (artworkViewT != null) {
                    i2 = 2131430409;
                    ProgressBar progressBar = (ProgressBar) m5n1.t(viewInflate, 2131430409);
                    if (progressBar != null) {
                        i2 = 2131430497;
                        View view3 = (MarkAsPlayedButtonView) m5n1.t(viewInflate, 2131430497);
                        if (view3 != null) {
                            i2 = 2131430674;
                            ContentRestrictionBadgeView contentRestrictionBadgeViewT = m5n1.t(viewInflate, 2131430674);
                            if (contentRestrictionBadgeViewT != null) {
                                View view4 = (ConstraintLayout) viewInflate;
                                i2 = 2131431341;
                                TextView textView4 = (TextView) m5n1.t(viewInflate, 2131431341);
                                if (textView4 != null) {
                                    TextView textView5 = (TextView) m5n1.t(viewInflate, 2131431356);
                                    if (textView5 != null) {
                                        tnm tnmVar = new tnm(view4, artworkViewT, progressBar, view3, contentRestrictionBadgeViewT, view4, textView4, textView5);
                                        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165973);
                                        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2131165972);
                                        qhl qhlVar = new qhl(-1, -2);
                                        qhlVar.setMargins(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
                                        view4.setLayoutParams(qhlVar);
                                        view4.setClipToOutline(true);
                                        v9w0 v9w0VarO = b2u.o(view3);
                                        Collections.addAll(v9w0VarO.d, view3);
                                        v9w0VarO.a();
                                        v9w0 v9w0VarQ = b2u.q(view4);
                                        Collections.addAll(v9w0VarQ.d, view4);
                                        Collections.addAll(v9w0VarQ.c, textView5, textView4);
                                        v9w0VarQ.a();
                                        artworkViewT.setViewContext(new f47(gw70Var));
                                        this.b = tnmVar;
                                        this.c = view4;
                                        return;
                                    }
                                    i2 = 2131431356;
                                }
                            }
                        }
                    }
                } else {
                    i2 = 2131427611;
                }
                bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
                throw null;
            case 7:
                this.b = gw70Var;
                ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131625218, (ViewGroup) null, false);
                int i6 = 2131429953;
                TextView textView6 = (TextView) m5n1.t(constraintLayoutInflate, 2131429953);
                if (textView6 != null) {
                    i6 = 2131429954;
                    View view5 = (FaceView) m5n1.t(constraintLayoutInflate, 2131429954);
                    if (view5 != null) {
                        i6 = 2131429955;
                        TextView textView7 = (TextView) m5n1.t(constraintLayoutInflate, 2131429955);
                        if (textView7 != null) {
                            i6 = 2131429956;
                            TextView textView8 = (TextView) m5n1.t(constraintLayoutInflate, 2131429956);
                            if (textView8 != null) {
                                i6 = 2131430384;
                                SpotifyIconView spotifyIconViewT = m5n1.t(constraintLayoutInflate, 2131430384);
                                if (spotifyIconViewT != null) {
                                    ConstraintLayout constraintLayout = constraintLayoutInflate;
                                    g2z g2zVar = new g2z(constraintLayout, textView6, view5, textView7, textView8, spotifyIconViewT);
                                    constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                    v9w0 v9w0VarQ2 = b2u.q(constraintLayout);
                                    Collections.addAll(v9w0VarQ2.c, textView8, textView6);
                                    Collections.addAll(v9w0VarQ2.d, view5);
                                    v9w0VarQ2.e = false;
                                    v9w0VarQ2.a();
                                    this.c = g2zVar;
                                    return;
                                }
                            }
                        }
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i6)));
                throw null;
            case 8:
                q4e q4eVar = new q4e(context, new f47(gw70Var));
                this.b = q4eVar;
                View viewInflate2 = LayoutInflater.from(context).inflate(2131625224, (ViewGroup) null, false);
                RecyclerView recyclerViewT = m5n1.t(viewInflate2, 2131430614);
                if (recyclerViewT != null) {
                    recyclerViewT.setAdapter(q4eVar);
                    recyclerViewT.setLayoutManager(new LinearLayoutManager(0));
                    recyclerViewT.j(new fyd((byte) 1));
                    this.c = (FrameLayout) viewInflate2;
                    return;
                }
                bhn0.i("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(2131430614)));
                throw null;
            case 12:
                this.b = new idd1(new f98(context, gw70Var, (byte) 2));
                return;
            case 15:
                this.b = context;
                ConstraintLayout constraintLayoutInflate2 = LayoutInflater.from(context).inflate(2131625568, (ViewGroup) null, false);
                ArtworkView artworkViewT2 = m5n1.t(constraintLayoutInflate2, 2131427611);
                if (artworkViewT2 != null) {
                    i4 = 2131428647;
                    if (m5n1.t(constraintLayoutInflate2, 2131428647) != null) {
                        i4 = 2131430587;
                        TextView textView9 = (TextView) m5n1.t(constraintLayoutInflate2, 2131430587);
                        if (textView9 != null) {
                            i4 = 2131430588;
                            TextView textView10 = (TextView) m5n1.t(constraintLayoutInflate2, 2131430588);
                            if (textView10 != null) {
                                i4 = 2131430590;
                                AppCompatRatingBar appCompatRatingBarT = m5n1.t(constraintLayoutInflate2, 2131430590);
                                if (appCompatRatingBarT != null) {
                                    i4 = 2131431070;
                                    if (m5n1.t(constraintLayoutInflate2, 2131431070) != null) {
                                        i4 = 2131431448;
                                        if (m5n1.t(constraintLayoutInflate2, 2131431448) != null) {
                                            ConstraintLayout constraintLayout2 = constraintLayoutInflate2;
                                            ytp0 ytp0Var = new ytp0((Object) constraintLayout2, (Object) artworkViewT2, (Object) textView9, (Object) textView10, (Object) appCompatRatingBarT, (byte) 22);
                                            constraintLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                            artworkViewT2.setViewContext(new f47(gw70Var));
                                            this.c = ytp0Var;
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate2.getResources().getResourceName(i4)));
                throw null;
            case 27:
                Trace.beginSection("ECM:PlayIndicatorTrackRow:inflate");
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
                    this.c = eb80Var.f();
                    new idd1(new kks0(this, (byte) 9));
                    return;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            default:
                ConstraintLayout constraintLayoutInflate3 = LayoutInflater.from(context).inflate(2131624034, (ViewGroup) null, false);
                ConstraintLayout constraintLayout3 = constraintLayoutInflate3;
                View view6 = (ArtworkView) m5n1.t(constraintLayoutInflate3, 2131427611);
                if (view6 != null) {
                    i4 = 2131430400;
                    PlayButtonView playButtonViewT = m5n1.t(constraintLayoutInflate3, 2131430400);
                    if (playButtonViewT != null) {
                        i4 = 2131430403;
                        ComposeView composeViewT = m5n1.t(constraintLayoutInflate3, 2131430403);
                        if (composeViewT != null) {
                            TextView textView11 = (TextView) m5n1.t(constraintLayoutInflate3, 2131431115);
                            if (textView11 != null) {
                                TextView textView12 = (TextView) m5n1.t(constraintLayoutInflate3, 2131431356);
                                if (textView12 != null) {
                                    zwg zwgVar = new zwg();
                                    zwgVar.a = constraintLayout3;
                                    zwgVar.b = view6;
                                    zwgVar.c = playButtonViewT;
                                    zwgVar.d = textView11;
                                    zwgVar.e = textView12;
                                    constraintLayout3.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                    view6.setViewContext(new f47(gw70Var));
                                    v9w0 v9w0VarQ3 = b2u.q(constraintLayout3);
                                    Collections.addAll(v9w0VarQ3.c, textView12, textView11);
                                    Collections.addAll(v9w0VarQ3.d, view6);
                                    v9w0VarQ3.e = false;
                                    v9w0VarQ3.a();
                                    this.b = zwgVar;
                                    this.c = v8r.q(Boolean.FALSE);
                                    composeViewT.setContent(new j2i(-23859493, new i4o(this, (byte) 10), true));
                                    return;
                                }
                                i3 = 2131431356;
                            } else {
                                i3 = 2131431115;
                            }
                        } else {
                            i3 = i4;
                        }
                    } else {
                        i3 = i4;
                    }
                } else {
                    i3 = i4;
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate3.getResources().getResourceName(i3)));
                throw null;
        }
    }

    public yir(Context context, gw70 gw70Var, rcf0 rcf0Var, boolean z) {
        ConstraintLayout txrVar;
        this.a = (byte) 4;
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131624518, (ViewGroup) null, false);
        int i = 2131427731;
        ContentRestrictionBadgeView contentRestrictionBadgeViewT = m5n1.t(constraintLayoutInflate, 2131427731);
        if (contentRestrictionBadgeViewT != null) {
            i = 2131427742;
            View viewT = m5n1.t(constraintLayoutInflate, 2131427742);
            if (viewT != null) {
                i = 2131427968;
                ImageView imageView = (ImageView) m5n1.t(constraintLayoutInflate, 2131427968);
                if (imageView != null) {
                    i = 2131428457;
                    EpisodeRowDescriptionView episodeRowDescriptionView = (EpisodeRowDescriptionView) m5n1.t(constraintLayoutInflate, 2131428457);
                    if (episodeRowDescriptionView != null) {
                        i = 2131428713;
                        if (((TextView) m5n1.t(constraintLayoutInflate, 2131428713)) != null) {
                            int i2 = 2131428987;
                            ComposeView composeViewT = m5n1.t(constraintLayoutInflate, 2131428987);
                            if (composeViewT != null) {
                                i2 = 2131429077;
                                EpisodeRowHeaderContainer episodeRowHeaderContainer = (EpisodeRowHeaderContainer) m5n1.t(constraintLayoutInflate, 2131429077);
                                if (episodeRowHeaderContainer != null) {
                                    i2 = 2131429974;
                                    LinearLayout linearLayout = (LinearLayout) m5n1.t(constraintLayoutInflate, 2131429974);
                                    if (linearLayout != null) {
                                        i2 = 2131430280;
                                        PaidBadgeView paidBadgeViewT = m5n1.t(constraintLayoutInflate, 2131430280);
                                        if (paidBadgeViewT != null) {
                                            i2 = 2131430401;
                                            PlayButtonView playButtonViewT = m5n1.t(constraintLayoutInflate, 2131430401);
                                            if (playButtonViewT != null) {
                                                i2 = 2131430409;
                                                ProgressBar progressBar = (ProgressBar) m5n1.t(constraintLayoutInflate, 2131430409);
                                                if (progressBar != null) {
                                                    i2 = 2131430557;
                                                    TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131430557);
                                                    if (textView != null) {
                                                        i2 = 2131430572;
                                                        EpisodeRowQuickActionSectionView episodeRowQuickActionSectionViewT = m5n1.t(constraintLayoutInflate, 2131430572);
                                                        if (episodeRowQuickActionSectionViewT != null) {
                                                            i2 = 2131430716;
                                                            ViewStub viewStub = (ViewStub) m5n1.t(constraintLayoutInflate, 2131430716);
                                                            if (viewStub != null) {
                                                                ConstraintLayout constraintLayout = constraintLayoutInflate;
                                                                i2 = 2131431422;
                                                                View viewT2 = m5n1.t(constraintLayoutInflate, 2131431422);
                                                                if (viewT2 != null) {
                                                                    wj3 wj3Var = new wj3(constraintLayout, contentRestrictionBadgeViewT, viewT, imageView, episodeRowDescriptionView, composeViewT, episodeRowHeaderContainer, linearLayout, paidBadgeViewT, playButtonViewT, progressBar, textView, episodeRowQuickActionSectionViewT, viewStub, viewT2, (byte) 13);
                                                                    if (z) {
                                                                        txrVar = new eqj1(episodeRowHeaderContainer.getContext());
                                                                    } else {
                                                                        txrVar = new txr(episodeRowHeaderContainer.getContext());
                                                                    }
                                                                    txrVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                                                    txrVar.setEnabled(episodeRowHeaderContainer.isEnabled());
                                                                    episodeRowHeaderContainer.addView(txrVar);
                                                                    episodeRowHeaderContainer.a = txrVar;
                                                                    oaz oazVar = episodeRowHeaderContainer.b;
                                                                    if (oazVar != null) {
                                                                        EpisodeRowHeaderContainer.a(txrVar, oazVar);
                                                                    }
                                                                    constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                                                    episodeRowHeaderContainer.setViewContext(new oaz(gw70Var));
                                                                    b2u.q(constraintLayout).a();
                                                                    constraintLayout.post(new ukd(wj3Var, constraintLayout.getContext().getResources().getDimensionPixelSize(2131166820), (byte) 1));
                                                                    this.b = wj3Var;
                                                                    Context context2 = constraintLayout.getContext();
                                                                    g4b1 g4b1Var = new g4b1(context2, j4b1.I1, a8o.y(16.0f, context2.getResources()));
                                                                    g4b1Var.c(x74.E(context2, 2131100239));
                                                                    imageView.setImageDrawable(g4b1Var);
                                                                    progressBar.setMax(100);
                                                                    episodeRowQuickActionSectionViewT.setViewContext(new cbz(context, rcf0Var, gw70Var));
                                                                    linearLayout.findViewById(2131428713);
                                                                    this.c = constraintLayout;
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
                            i = i2;
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public yir(Context context, gw70 gw70Var, Integer num) {
        this.a = (byte) 6;
        this.b = r4u.c(new r4u[]{r4u.d(new hyr(fyr.b, (byte) 0), r4u.a(new vun(this, (byte) 13))), r4u.d(new hyr(gyr.b, (byte) 0), r4u.a(new qmr(this, (byte) 5))), r4u.a(new rmr(this, (byte) 5)), r4u.a(new efr(this, (byte) 6)), r4u.a(new tzo(this, (byte) 10))});
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131624611, (ViewGroup) null, false);
        int i = 2131427611;
        View view = (ArtworkView) m5n1.t(constraintLayoutInflate, 2131427611);
        if (view != null) {
            i = 2131427877;
            CalendarIconView calendarIconViewT = m5n1.t(constraintLayoutInflate, 2131427877);
            if (calendarIconViewT != null) {
                ConstraintLayout constraintLayout = constraintLayoutInflate;
                i = 2131428811;
                TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131428811);
                if (textView != null) {
                    i = 2131430711;
                    if (m5n1.t(constraintLayoutInflate, 2131430711) != null) {
                        i = 2131431356;
                        TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                        if (textView2 != null) {
                            i = 2131431569;
                            TextView textView3 = (TextView) m5n1.t(constraintLayoutInflate, 2131431569);
                            if (textView3 != null) {
                                dxy dxyVar = new dxy(constraintLayout, (ArtworkView) view, calendarIconViewT, constraintLayout, textView, textView2, textView3);
                                view.setViewContext(new f47(gw70Var));
                                constraintLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                                v9w0 v9w0VarP = b2u.p(constraintLayout);
                                Collections.addAll(v9w0VarP.c, textView2);
                                Collections.addAll(v9w0VarP.d, view);
                                v9w0VarP.a();
                                this.c = dxyVar;
                                if (num != null) {
                                    int iApplyDimension = (int) TypedValue.applyDimension(1, num.intValue(), context.getResources().getDisplayMetrics());
                                    ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                                    if (layoutParams == null) {
                                        eqq.t(iApplyDimension, -2, constraintLayout);
                                        return;
                                    } else {
                                        layoutParams.width = iApplyDimension;
                                        return;
                                    }
                                }
                                return;
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public yir(Context context, gw70 gw70Var, boolean z) {
        this.a = (byte) 9;
        this.b = context;
        hrr0 hrr0VarQ = v8r.q(szr.Y);
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131625344, (ViewGroup) null, false);
        int i = 2131428103;
        IconX iconXT = m5n1.t(constraintLayoutInflate, 2131428103);
        if (iconXT != null) {
            i = 2131428800;
            EncoreTextView encoreTextViewT = m5n1.t(constraintLayoutInflate, 2131428800);
            if (encoreTextViewT != null) {
                i = 2131429035;
                EncoreImageView encoreImageViewT = m5n1.t(constraintLayoutInflate, 2131429035);
                if (encoreImageViewT != null) {
                    i = 2131430131;
                    EncoreButton encoreButtonT = m5n1.t(constraintLayoutInflate, 2131430131);
                    if (encoreButtonT != null) {
                        ConstraintLayout constraintLayout = constraintLayoutInflate;
                        i = 2131430223;
                        LinearLayout linearLayout = (LinearLayout) m5n1.t(constraintLayoutInflate, 2131430223);
                        if (linearLayout != null) {
                            i = 2131430460;
                            EncoreButton encoreButtonT2 = m5n1.t(constraintLayoutInflate, 2131430460);
                            if (encoreButtonT2 != null) {
                                i = 2131430462;
                                EncoreButton encoreButtonT3 = m5n1.t(constraintLayoutInflate, 2131430462);
                                if (encoreButtonT3 != null) {
                                    i = 2131431356;
                                    EncoreTextView encoreTextViewT2 = m5n1.t(constraintLayoutInflate, 2131431356);
                                    if (encoreTextViewT2 != null) {
                                        byp bypVar = new byp(constraintLayout, iconXT, encoreTextViewT, encoreImageViewT, encoreButtonT, linearLayout, encoreButtonT2, encoreButtonT3, encoreTextViewT2);
                                        qhl qhlVar = new qhl(-1, -2);
                                        if (z) {
                                            int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166786);
                                            qhlVar.setMarginStart(dimensionPixelSize);
                                            qhlVar.setMarginEnd(dimensionPixelSize);
                                        }
                                        constraintLayout.setLayoutParams(qhlVar);
                                        encoreImageViewT.setImageLoader(gw70Var);
                                        encoreImageViewT.setModifierFactory(szr.X);
                                        encoreImageViewT.setPlaceholderFactory(new sqk(this, (byte) 27));
                                        encoreImageViewT.setErrorFactory((vu30) hrr0VarQ.getValue());
                                        lvx.t(constraintLayout, context.getResources().getDimensionPixelSize(2131166784));
                                        this.c = bypVar;
                                        return;
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
}
