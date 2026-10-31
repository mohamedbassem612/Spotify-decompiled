package p;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.spotify.artist.uiusecases.artistpick.elements.CommentBubbleView;
import com.spotify.artist.uiusecases.artistpick.elements.DateIconView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.encoremobile.buttons.PrimaryButtonView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.listrow.EncoreListRow;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class eos implements qzh {
    public final /* synthetic */ byte a;
    public final Object b;

    public eos(Context context, gw70 gw70Var, byte b) {
        this.a = b;
        switch (b) {
            case 4:
                ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131624514, (ViewGroup) null, false);
                int i = 2131428291;
                View view = (ArtworkView) m5n1.t(constraintLayoutInflate, 2131428291);
                if (view != null) {
                    i = 2131428292;
                    View view2 = (PrimaryButtonView) m5n1.t(constraintLayoutInflate, 2131428292);
                    if (view2 != null) {
                        ConstraintLayout constraintLayout = constraintLayoutInflate;
                        i = 2131428297;
                        TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131428297);
                        if (textView != null) {
                            i = 2131428298;
                            TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131428298);
                            if (textView2 != null) {
                                i = 2131428300;
                                TextView textView3 = (TextView) m5n1.t(constraintLayoutInflate, 2131428300);
                                if (textView3 != null) {
                                    i = 2131429067;
                                    if (m5n1.t(constraintLayoutInflate, 2131429067) != null) {
                                        i = 2131429068;
                                        if (m5n1.t(constraintLayoutInflate, 2131429068) != null) {
                                            p2o0 p2o0Var = new p2o0(constraintLayout, view, view2, textView, textView2, textView3, (byte) 26);
                                            constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                            view.setViewContext(new f47(gw70Var));
                                            view2.setImportantForAccessibility(4);
                                            v9w0 v9w0VarP = b2u.p(constraintLayout);
                                            Collections.addAll(v9w0VarP.c, textView3, textView2, textView, view2);
                                            Collections.addAll(v9w0VarP.d, view);
                                            v9w0VarP.a();
                                            this.b = p2o0Var;
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
            case 8:
                ConstraintLayout constraintLayoutInflate2 = LayoutInflater.from(context).inflate(2131625416, (ViewGroup) null, false);
                int i2 = 2131428234;
                ContextMenuButton contextMenuButtonT = m5n1.t(constraintLayoutInflate2, 2131428234);
                if (contextMenuButtonT != null) {
                    i2 = 2131430423;
                    View view3 = (ArtworkView) m5n1.t(constraintLayoutInflate2, 2131430423);
                    if (view3 != null) {
                        ConstraintLayout constraintLayout2 = constraintLayoutInflate2;
                        i2 = 2131431132;
                        TextView textView4 = (TextView) m5n1.t(constraintLayoutInflate2, 2131431132);
                        if (textView4 != null) {
                            i2 = 2131431388;
                            TextView textView5 = (TextView) m5n1.t(constraintLayoutInflate2, 2131431388);
                            if (textView5 != null) {
                                i2 = 2131431389;
                                if (m5n1.t(constraintLayoutInflate2, 2131431389) != null) {
                                    phi0 phi0Var = new phi0(constraintLayout2, contextMenuButtonT, view3, textView4, textView5, (byte) 18);
                                    constraintLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                    v9w0 v9w0VarQ = b2u.q(constraintLayout2);
                                    Collections.addAll(v9w0VarQ.d, view3);
                                    Collections.addAll(v9w0VarQ.c, textView5, textView4);
                                    v9w0VarQ.a();
                                    view3.setViewContext(new f47(gw70Var));
                                    this.b = phi0Var;
                                    return;
                                }
                            }
                        }
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate2.getResources().getResourceName(i2)));
                throw null;
            case 9:
                ks6 ks6VarG = ks6.g(LayoutInflater.from(context));
                w2g0.q(ks6VarG, gw70Var);
                int dimensionPixelSize = ((ConstraintLayout) ks6VarG.a).getResources().getDimensionPixelSize(2131165336);
                Guideline guideline = (Guideline) ks6VarG.g;
                qhl layoutParams = guideline.getLayoutParams();
                layoutParams.b = dimensionPixelSize;
                guideline.setLayoutParams(layoutParams);
                ImageView imageView = (ImageView) w2g0.p(ks6VarG, 2131625089);
                imageView.setImageDrawable(azo1.r(imageView.getContext(), j4b1.O1, 2131101343, imageView.getContext().getResources().getDimensionPixelSize(2131165337)));
                this.b = ks6VarG;
                return;
            default:
                View viewInflate = LayoutInflater.from(context).inflate(2131624061, (ViewGroup) null, false);
                int i3 = 2131427608;
                DateIconView dateIconView = (DateIconView) m5n1.t(viewInflate, 2131427608);
                if (dateIconView != null) {
                    i3 = 2131427609;
                    View view4 = (ArtworkView) m5n1.t(viewInflate, 2131427609);
                    if (view4 != null) {
                        i3 = 2131427677;
                        View view5 = (ArtworkView) m5n1.t(viewInflate, 2131427677);
                        if (view5 != null) {
                            i3 = 2131427907;
                            if (m5n1.t(viewInflate, 2131427907) != null) {
                                i3 = 2131428130;
                                CommentBubbleView commentBubbleView = (CommentBubbleView) m5n1.t(viewInflate, 2131428130);
                                if (commentBubbleView != null) {
                                    i3 = 2131428629;
                                    EncoreListRow encoreListRowT = m5n1.t(viewInflate, 2131428629);
                                    if (encoreListRowT != null) {
                                        i3 = 2131429745;
                                        if (m5n1.t(viewInflate, 2131429745) != null) {
                                            i3 = 2131430400;
                                            if (m5n1.t(viewInflate, 2131430400) != null) {
                                                FrameLayout frameLayout = (FrameLayout) viewInflate;
                                                toj0 toj0Var = new toj0(frameLayout, dateIconView, view4, view5, commentBubbleView, encoreListRowT, (byte) 4);
                                                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                                commentBubbleView.getCommentImage().setViewContext(new f47(gw70Var));
                                                view4.setViewContext(new f47(gw70Var));
                                                view5.setViewContext(new f47(gw70Var));
                                                v9w0 v9w0VarP2 = b2u.p(frameLayout);
                                                Collections.addAll(v9w0VarP2.d, commentBubbleView.getCommentImage(), view4, view5);
                                                v9w0VarP2.a();
                                                this.b = toj0Var;
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
                throw null;
        }
    }

    public final void f(Object obj) {
        int i;
        byte b = this.a;
        boolean z = true;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((AppCompatImageButton) obj2).setEnabled(((p671) obj).a);
                break;
            case 1:
                if (obj != null) {
                    bhn0.d();
                    break;
                }
                break;
            case 2:
                gt6 gt6Var = (gt6) obj;
                String str = gt6Var.h;
                toj0 toj0Var = (toj0) obj2;
                EncoreListRow encoreListRow = (EncoreListRow) toj0Var.g;
                DateIconView dateIconView = (DateIconView) toj0Var.c;
                ArtworkView artworkView = (ArtworkView) toj0Var.d;
                ((TextView) encoreListRow.getBinding().a.findViewById(2131431371)).setText(gt6Var.e);
                ((TextView) encoreListRow.getBinding().c()).setText(gt6Var.f);
                ((FrameLayout) toj0Var.b).getContext().getResources().getDimensionPixelOffset(2131165897);
                ((ArtworkView) toj0Var.e).h(new x07(new g07(gt6Var.a), true));
                int i2 = gt6Var.g;
                if (i2 == -1 || str == null || str.length() == 0) {
                    artworkView.setVisibility(0);
                    dateIconView.setVisibility(8);
                    artworkView.h(ulo1.k(gt6Var.c, new g07(gt6Var.b, yz6.d)));
                } else {
                    artworkView.setVisibility(4);
                    dateIconView.setVisibility(0);
                    dateIconView.a.setText(str);
                    dateIconView.b.setText(String.valueOf(i2));
                }
                if (gt6Var.k) {
                    encoreListRow.getBinding().d().setVisibility(0);
                } else {
                    encoreListRow.getBinding().d().setVisibility(8);
                }
                ((CommentBubbleView) toj0Var.f).f(new oeh(gt6Var.d, gt6Var.i, gt6Var.j));
                break;
            case 3:
                break;
            case 4:
                wco wcoVar = (wco) obj;
                String str2 = wcoVar.b;
                String str3 = wcoVar.d;
                String str4 = wcoVar.c;
                p2o0 p2o0Var = (p2o0) obj2;
                ConstraintLayout constraintLayout = (ConstraintLayout) p2o0Var.b;
                PrimaryButtonView primaryButtonView = (PrimaryButtonView) p2o0Var.d;
                TextView textView = (TextView) p2o0Var.e;
                TextView textView2 = (TextView) p2o0Var.g;
                TextView textView3 = (TextView) p2o0Var.f;
                boolean z2 = wcoVar.f;
                constraintLayout.setTag(Boolean.valueOf(z2));
                constraintLayout.setClickable(z2);
                String str5 = wcoVar.a;
                String str6 = !ihc1.y0(str5) ? str5 : null;
                String str7 = !ihc1.y0(str2) ? str2 : null;
                String str8 = !ihc1.y0(str4) ? str4 : null;
                String strY0 = o7h.y0(f46.i0(new String[]{str6, str7}), ": ", (String) null, (String) null, (iu30) null, 62);
                if (ihc1.y0(strY0)) {
                    strY0 = null;
                }
                constraintLayout.setContentDescription(o7h.y0(f46.i0(new String[]{strY0, str8}), ", ", (String) null, (String) null, (iu30) null, 62));
                textView2.setText(str5);
                textView3.setText(str2);
                if (ihc1.y0(str4)) {
                    textView.setVisibility(8);
                    textView3.setMaxLines(2);
                } else {
                    textView.setText(str4);
                    textView.setVisibility(0);
                    textView3.setMaxLines(1);
                }
                textView3.setTextColor(textView2.getContext().getColor(2131102468));
                primaryButtonView.setVisibility((!z2 || ihc1.y0(str3)) ? 4 : 0);
                primaryButtonView.setText(str3);
                if (z2) {
                    constraintLayout.setAccessibilityDelegate(new vwd((byte) 2));
                } else {
                    constraintLayout.setAccessibilityDelegate(null);
                }
                WeakHashMap weakHashMap = b8k1.a;
                new l7k1().e(constraintLayout, Boolean.TRUE);
                if (z2) {
                    if (ihc1.y0(str3)) {
                        str3 = null;
                    }
                    b8k1.m(constraintLayout, fg.g, str3, (sh) null);
                } else {
                    b8k1.l(constraintLayout, fg.g.a());
                    b8k1.h(constraintLayout, 0);
                }
                ((ArtworkView) p2o0Var.c).h(new f17(new g07(wcoVar.e, new zz6(4.0f))));
                break;
            case 5:
                t7x t7xVar = (t7x) obj;
                pbq pbqVar = (pbq) obj2;
                View view = (View) pbqVar.i;
                EncoreButton encoreButton = (EncoreButton) pbqVar.b;
                int i3 = t7xVar.c;
                int iC = l1d.C(i3);
                int i4 = 2131231323;
                if (iC == 0) {
                    i = 2131231323;
                } else if (iC != 1) {
                    eg.o();
                } else {
                    i = 2131231322;
                }
                view.setBackgroundResource(i);
                View view2 = (View) pbqVar.t;
                int iC2 = l1d.C(i3);
                if (iC2 != 0) {
                    if (iC2 != 1) {
                        eg.o();
                    } else {
                        i4 = 2131231322;
                    }
                }
                view2.setBackgroundResource(i4);
                TextView textView4 = (TextView) pbqVar.h;
                String str9 = t7xVar.a;
                textView4.setText(str9);
                textView4.setVisibility((str9 == null || ihc1.y0(str9)) ? 8 : 0);
                TextView textView5 = (TextView) pbqVar.g;
                String str10 = t7xVar.b;
                textView5.setText(str10);
                textView5.setVisibility((str10 == null || ihc1.y0(str10)) ? 8 : 0);
                String str11 = t7xVar.d;
                if (str11 != null && !ihc1.y0(str11)) {
                    z = false;
                }
                encoreButton.setVisibility(!z ? 0 : 8);
                if (!z) {
                    encoreButton.setText(str11);
                }
                break;
            case 6:
                break;
            case 7:
                wfq0 wfq0Var = (wfq0) obj;
                rzo0 rzo0Var = (rzo0) obj2;
                ((EncoreTextView) rzo0Var.d).setText(wfq0Var.a);
                ((EncoreButton) rzo0Var.c).setText(wfq0Var.b);
                break;
            case 8:
                usu0 usu0Var = (usu0) obj;
                phi0 phi0Var = (phi0) obj2;
                ((TextView) phi0Var.f).setText(usu0Var.a);
                ((TextView) phi0Var.e).setText(usu0Var.b);
                ((ContextMenuButton) phi0Var.c).setVisibility(usu0Var.d ? 0 : 8);
                ((ArtworkView) phi0Var.d).h(new y07(new g07(usu0Var.c), false));
                break;
            case 9:
                z981 z981Var = (z981) obj;
                ks6 ks6Var = (ks6) obj2;
                ((TextView) ks6Var.R0).setText(z981Var.a);
                ((TextView) ks6Var.Q0).setText(z981Var.b);
                ((ArtworkView) ks6Var.d).h(new e17(new g07(z981Var.c)));
                break;
            default:
                pbl1 pbl1Var = (pbl1) obj;
                tr80 tr80Var = pbl1Var.b;
                String str12 = pbl1Var.a;
                boolean zY0 = ihc1.y0(str12);
                ilh1 ilh1Var = (ilh1) obj2;
                TextView textView6 = (TextView) ilh1Var.c;
                if (!zY0) {
                    FrameLayout frameLayout = (FrameLayout) ilh1Var.b;
                    textView6.setVisibility(0);
                    if (!pbl1Var.c) {
                        textView6.setTextColor(frameLayout.getContext().getColor(2131104308));
                        textView6.setText(str12);
                    } else {
                        textView6.setTextColor(frameLayout.getContext().getColor(2131104309));
                        SpannableString spannableString = new SpannableString(str12);
                        spannableString.setSpan(new ForegroundColorSpan(frameLayout.getContext().getColor(2131104308)), Integer.valueOf(((rr80) tr80Var).a).intValue(), Integer.valueOf(((rr80) tr80Var).b).intValue(), 0);
                        textView6.setText(spannableString);
                    }
                } else {
                    textView6.setVisibility(4);
                }
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
                return (LinearLayout) ((a42) obj).b;
            case 2:
                return (FrameLayout) ((toj0) obj).b;
            case 3:
                return (LinearLayout) ((ic9) obj).b;
            case 4:
                return (ConstraintLayout) ((p2o0) obj).b;
            case 5:
                return (FrameLayout) ((pbq) obj).f;
            case 6:
                return (ConstraintLayout) ((vx40) obj).b;
            case 7:
                return (LinearLayout) ((rzo0) obj).b;
            case 8:
                return (ConstraintLayout) ((phi0) obj).b;
            case 9:
                return (ConstraintLayout) ((ks6) obj).a;
            default:
                return (FrameLayout) ((ilh1) obj).b;
        }
    }

    public final void n(iu30 iu30Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((AppCompatImageButton) obj).setOnClickListener(new sis(iu30Var, (byte) 16));
                break;
            case 1:
                ((LinearLayout) ((a42) obj).b).setOnClickListener(new v20(iu30Var, (byte) 26));
                break;
            case 2:
                FrameLayout frameLayout = (FrameLayout) ((toj0) obj).b;
                frameLayout.setOnClickListener(new yer(iu30Var, (byte) 6));
                b8k1.m(frameLayout, fg.g, frameLayout.getContext().getString(2131952464), (sh) null);
                break;
            case 3:
                ((EncoreButton) ((ic9) obj).c).setOnClickListener(new yer(iu30Var, (byte) 20));
                break;
            case 4:
                p2o0 p2o0Var = (p2o0) obj;
                ConstraintLayout constraintLayout = (ConstraintLayout) p2o0Var.b;
                constraintLayout.setOnClickListener(new cg1(this, iu30Var, (byte) 29));
                constraintLayout.setClickable(u890.j(constraintLayout.getTag(), Boolean.TRUE));
                ((PrimaryButtonView) p2o0Var.d).setOnClickListener(new yer(iu30Var, (byte) 29));
                break;
            case 5:
                ((EncoreButton) ((pbq) obj).b).setOnClickListener(new trr(iu30Var, (byte) 7));
                break;
            case 6:
                ((EncoreButton) ((vx40) obj).c).setOnClickListener(new o0s(iu30Var, (byte) 1));
                break;
            case 7:
                ((EncoreButton) ((rzo0) obj).c).setOnClickListener(new o0s(iu30Var, (byte) 28));
                break;
            case 8:
                phi0 phi0Var = (phi0) obj;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) phi0Var.b;
                constraintLayout2.setOnClickListener(new oes(iu30Var, (byte) 7));
                constraintLayout2.setOnLongClickListener(new wer(iu30Var, (byte) 12));
                ((ContextMenuButton) phi0Var.c).setOnClickListener(new oes(iu30Var, (byte) 8));
                break;
            case 9:
                ((ConstraintLayout) ((ks6) obj).a).setOnClickListener(new sis(iu30Var, (byte) 19));
                break;
        }
    }

    private final void a(iu30 iu30Var) {
    }

    public eos(Context context, byte b) {
        this.a = b;
        int i = 2131431356;
        switch (b) {
            case 1:
                View viewInflate = LayoutInflater.from(context).inflate(2131624020, (ViewGroup) null, false);
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                if (m5n1.t(viewInflate, 2131431356) != null) {
                    a42 a42Var = new a42(linearLayout, (byte) 6);
                    linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    this.b = a42Var;
                    return;
                }
                bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(2131431356)));
                throw null;
            case 2:
            case 4:
            case 8:
            case 9:
            default:
                AppCompatImageButton appCompatImageButton = new AppCompatImageButton(context);
                appCompatImageButton.setBackground(null);
                appCompatImageButton.setScaleType(ImageView.ScaleType.CENTER_CROP);
                appCompatImageButton.setContentDescription(appCompatImageButton.getResources().getString(2131959256));
                int iM = too1.m(context, 2131167033);
                appCompatImageButton.setPadding(iM, iM, iM, iM);
                g4b1 g4b1Var = new g4b1(context, j4b1.Y5, too1.m(context, 2131166769));
                g4b1Var.c(x74.E(context, 2131102446));
                appCompatImageButton.setImageDrawable(g4b1Var);
                this.b = appCompatImageButton;
                return;
            case 3:
                View viewInflate2 = LayoutInflater.from(context).inflate(2131624305, (ViewGroup) null, false);
                EncoreButton encoreButtonT = m5n1.t(viewInflate2, 2131427873);
                if (encoreButtonT != null) {
                    this.b = new ic9((LinearLayout) viewInflate2, encoreButtonT, (byte) 19);
                    return;
                } else {
                    bhn0.i("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(2131427873)));
                    throw null;
                }
            case 5:
                View viewInflate3 = LayoutInflater.from(context).inflate(2131624569, (ViewGroup) null, false);
                int i2 = 2131428615;
                EncoreButton encoreButtonT2 = m5n1.t(viewInflate3, 2131428615);
                if (encoreButtonT2 != null) {
                    i2 = 2131428616;
                    TextView textView = (TextView) m5n1.t(viewInflate3, 2131428616);
                    if (textView != null) {
                        i2 = 2131428617;
                        TextView textView2 = (TextView) m5n1.t(viewInflate3, 2131428617);
                        if (textView2 != null) {
                            i2 = 2131430950;
                            View viewT = m5n1.t(viewInflate3, 2131430950);
                            if (viewT != null) {
                                i2 = 2131430951;
                                View viewT2 = m5n1.t(viewInflate3, 2131430951);
                                if (viewT2 != null) {
                                    i2 = 2131430952;
                                    View viewT3 = m5n1.t(viewInflate3, 2131430952);
                                    if (viewT3 != null) {
                                        i2 = 2131430953;
                                        View viewT4 = m5n1.t(viewInflate3, 2131430953);
                                        if (viewT4 != null) {
                                            i2 = 2131430954;
                                            View viewT5 = m5n1.t(viewInflate3, 2131430954);
                                            if (viewT5 != null) {
                                                i2 = 2131430955;
                                                View viewT6 = m5n1.t(viewInflate3, 2131430955);
                                                if (viewT6 != null) {
                                                    FrameLayout frameLayout = (FrameLayout) viewInflate3;
                                                    pbq pbqVar = new pbq(frameLayout, encoreButtonT2, textView, textView2, viewT, viewT2, viewT3, viewT4, viewT5, viewT6, (byte) 7);
                                                    frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                                    this.b = pbqVar;
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
                bhn0.i("Missing required view with ID: ".concat(viewInflate3.getResources().getResourceName(i2)));
                throw null;
            case 6:
                ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131625076, (ViewGroup) null, false);
                EncoreButton encoreButtonT3 = m5n1.t(constraintLayoutInflate, 2131428093);
                if (encoreButtonT3 != null) {
                    ConstraintLayout constraintLayout = constraintLayoutInflate;
                    vx40 vx40Var = new vx40(constraintLayout, encoreButtonT3, (byte) 10);
                    constraintLayout.setLayoutParams(new qhl(-1, -2));
                    b8k1.q(constraintLayout, true);
                    this.b = vx40Var;
                    return;
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(2131428093)));
                throw null;
            case 7:
                View viewInflate4 = LayoutInflater.from(context).inflate(2131625345, (ViewGroup) null, false);
                EncoreButton encoreButtonT4 = m5n1.t(viewInflate4, 2131428551);
                if (encoreButtonT4 != null) {
                    EncoreTextView encoreTextViewT = m5n1.t(viewInflate4, 2131431356);
                    if (encoreTextViewT != null) {
                        LinearLayout linearLayout2 = (LinearLayout) viewInflate4;
                        rzo0 rzo0Var = new rzo0(linearLayout2, encoreButtonT4, encoreTextViewT, (byte) 17);
                        linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        this.b = rzo0Var;
                        return;
                    }
                } else {
                    i = 2131428551;
                }
                bhn0.i("Missing required view with ID: ".concat(viewInflate4.getResources().getResourceName(i)));
                throw null;
            case 10:
                View viewInflate5 = LayoutInflater.from(context).inflate(2131626339, (ViewGroup) null, false);
                FrameLayout frameLayout2 = (FrameLayout) viewInflate5;
                TextView textView3 = (TextView) m5n1.t(viewInflate5, 2131431509);
                if (textView3 != null) {
                    this.b = new ilh1(frameLayout2, textView3, (byte) 24);
                    return;
                } else {
                    bhn0.i("Missing required view with ID: ".concat(viewInflate5.getResources().getResourceName(2131431509)));
                    throw null;
                }
        }
    }
}
