package p;

import android.R;
import android.animation.ArgbEvaluator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.transition.AutoTransition;
import android.transition.TransitionSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.encoreconsumermobile.elements.loading.LoadingProgressBarView;
import com.spotify.encoremobile.buttons.PrimaryButtonView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tps implements qzh {
    public final /* synthetic */ byte a = 0;
    public final Context b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Serializable i;
    public Object t;

    /* JADX WARN: Code duplicated, block: B:66:0x01f7 A[PHI: r4
      0x01f7: PHI (r4v2 int) = (r4v1 int), (r4v4 int), (r4v5 int), (r4v11 int) binds: [B:3:0x0026, B:5:0x0036, B:7:0x003f, B:15:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    public tps(Context context, gw70 gw70Var) {
        this.b = context;
        this.c = gw70Var;
        View viewInflate = LayoutInflater.from(context).inflate(2131625429, (ViewGroup) null, false);
        int i = 2131427902;
        View viewT = m5n1.t(viewInflate, 2131427902);
        if (viewT != null) {
            lc20 lc20VarG = lc20.g(viewT);
            i = 2131428203;
            LinearLayout linearLayout = (LinearLayout) m5n1.t(viewInflate, 2131428203);
            if (linearLayout != null) {
                i = 2131428718;
                ConstraintLayout constraintLayoutT = m5n1.t(viewInflate, 2131428718);
                if (constraintLayoutT != null) {
                    int i2 = 2131428730;
                    if (((TextView) m5n1.t(constraintLayoutT, 2131428730)) != null) {
                        i2 = 2131428732;
                        if (((TextView) m5n1.t(constraintLayoutT, 2131428732)) != null) {
                            i2 = 2131431524;
                            PrimaryButtonView primaryButtonViewT = m5n1.t(constraintLayoutT, 2131431524);
                            if (primaryButtonViewT != null) {
                                kp00 kp00Var = new kp00(constraintLayoutT, primaryButtonViewT, (byte) 28);
                                i = 2131429816;
                                ConstraintLayout constraintLayoutT2 = m5n1.t(viewInflate, 2131429816);
                                if (constraintLayoutT2 != null) {
                                    int i3 = 2131427851;
                                    if (m5n1.t(constraintLayoutT2, 2131427851) != null) {
                                        i3 = 2131428229;
                                        TextView textView = (TextView) m5n1.t(constraintLayoutT2, 2131428229);
                                        if (textView != null) {
                                            i3 = 2131430239;
                                            LinearLayout linearLayout2 = (LinearLayout) m5n1.t(constraintLayoutT2, 2131430239);
                                            if (linearLayout2 != null) {
                                                i3 = 2131430450;
                                                if (m5n1.t(constraintLayoutT2, 2131430450) != null) {
                                                    i3 = 2131430562;
                                                    TextView textView2 = (TextView) m5n1.t(constraintLayoutT2, 2131430562);
                                                    if (textView2 != null) {
                                                        i3 = 2131431115;
                                                        TextView textView3 = (TextView) m5n1.t(constraintLayoutT2, 2131431115);
                                                        if (textView3 != null) {
                                                            i3 = 2131431278;
                                                            if (((LinearLayout) m5n1.t(constraintLayoutT2, 2131431278)) != null) {
                                                                i3 = 2131431334;
                                                                ArtworkView artworkViewT = m5n1.t(constraintLayoutT2, 2131431334);
                                                                if (artworkViewT != null) {
                                                                    i3 = 2131431336;
                                                                    LinearLayout linearLayout3 = (LinearLayout) m5n1.t(constraintLayoutT2, 2131431336);
                                                                    if (linearLayout3 != null) {
                                                                        i3 = 2131431356;
                                                                        TextView textView4 = (TextView) m5n1.t(constraintLayoutT2, 2131431356);
                                                                        if (textView4 != null) {
                                                                            i3 = 2131431649;
                                                                            EncoreButton encoreButtonT = m5n1.t(constraintLayoutT2, 2131431649);
                                                                            if (encoreButtonT != null) {
                                                                                i3 = 2131431653;
                                                                                LoadingProgressBarView loadingProgressBarViewT = m5n1.t(constraintLayoutT2, 2131431653);
                                                                                if (loadingProgressBarViewT != null) {
                                                                                    p1f0 p1f0Var = new p1f0(constraintLayoutT2, textView, linearLayout2, textView2, textView3, artworkViewT, linearLayout3, textView4, encoreButtonT, loadingProgressBarViewT);
                                                                                    ConstraintLayout constraintLayoutT3 = m5n1.t(viewInflate, 2131430210);
                                                                                    if (constraintLayoutT3 != null) {
                                                                                        int i4 = 2131430212;
                                                                                        if (((TextView) m5n1.t(constraintLayoutT3, 2131430212)) != null) {
                                                                                            i4 = 2131430213;
                                                                                            if (((TextView) m5n1.t(constraintLayoutT3, 2131430213)) != null) {
                                                                                                wb00 wb00Var = new wb00(constraintLayoutT3, (byte) 9);
                                                                                                int i5 = 2131430873;
                                                                                                View viewT2 = m5n1.t(viewInflate, 2131430873);
                                                                                                if (viewT2 != null) {
                                                                                                    lc20 lc20VarG2 = lc20.g(viewT2);
                                                                                                    i5 = 2131431650;
                                                                                                    ConstraintLayout constraintLayoutT4 = m5n1.t(viewInflate, 2131431650);
                                                                                                    if (constraintLayoutT4 != null) {
                                                                                                        int i6 = 2131431526;
                                                                                                        PrimaryButtonView primaryButtonViewT2 = m5n1.t(constraintLayoutT4, 2131431526);
                                                                                                        if (primaryButtonViewT2 != null) {
                                                                                                            i6 = 2131431651;
                                                                                                            if (((TextView) m5n1.t(constraintLayoutT4, 2131431651)) != null) {
                                                                                                                i6 = 2131431652;
                                                                                                                if (((TextView) m5n1.t(constraintLayoutT4, 2131431652)) != null) {
                                                                                                                    yeu0 yeu0Var = new yeu0(constraintLayoutT4, primaryButtonViewT2, (byte) 9);
                                                                                                                    LinearLayout linearLayout4 = (LinearLayout) viewInflate;
                                                                                                                    this.d = new aru0(linearLayout4, lc20VarG, linearLayout, kp00Var, p1f0Var, wb00Var, lc20VarG2, yeu0Var);
                                                                                                                    this.e = p1f0Var;
                                                                                                                    this.f = kp00Var;
                                                                                                                    this.g = wb00Var;
                                                                                                                    this.h = yeu0Var;
                                                                                                                    this.i = new ArrayList();
                                                                                                                    linearLayout4.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                                                                                                    artworkViewT.setViewContext(new f47(gw70Var));
                                                                                                                    int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167226);
                                                                                                                    linearLayout.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                                                                                                                    return;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        bhn0.i("Missing required view with ID: ".concat(constraintLayoutT4.getResources().getResourceName(i6)));
                                                                                                        throw null;
                                                                                                    }
                                                                                                }
                                                                                                i = i5;
                                                                                            }
                                                                                        }
                                                                                        bhn0.i("Missing required view with ID: ".concat(constraintLayoutT3.getResources().getResourceName(i4)));
                                                                                        throw null;
                                                                                    }
                                                                                    i = 2131430210;
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
                                    bhn0.i("Missing required view with ID: ".concat(constraintLayoutT2.getResources().getResourceName(i3)));
                                    throw null;
                                }
                            }
                        }
                    }
                    bhn0.i("Missing required view with ID: ".concat(constraintLayoutT.getResources().getResourceName(i2)));
                    throw null;
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw 0;
    }

    public static void e(ConstraintLayout constraintLayout, ibv0 ibv0Var, int i) {
        float f = i;
        float f2 = f > 0.0f ? ibv0Var.c / f : 0.0f;
        kil kilVar = new kil();
        kilVar.f(constraintLayout);
        kilVar.l(2131430324).e.e0 = f2;
        kilVar.b(constraintLayout);
    }

    public g4b1 a(j4b1 j4b1Var, int i) {
        Context context = this.b;
        g4b1 g4b1Var = new g4b1(context, j4b1Var, too1.m(context, 2131166774));
        g4b1Var.c(x74.E(context, i));
        return g4b1Var;
    }

    public void b(ConstraintLayout constraintLayout, boolean z, Integer num) {
        int color = this.b.getColor(2131101503);
        int i = uah.i(Color.argb(76, 0, 0, 0), num != null ? num.intValue() : color);
        if (!z) {
            constraintLayout.findViewById(2131430324).getBackground().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC));
            return;
        }
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(color), Integer.valueOf(i));
        valueAnimatorOfObject.setDuration(600L);
        valueAnimatorOfObject.addUpdateListener(new ocg(this, constraintLayout, (byte) 1));
        valueAnimatorOfObject.start();
    }

    /* JADX WARN: Code duplicated, block: B:73:0x034a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0352  */
    public final void f(Object obj) {
        g4b1 g4b1Var;
        String str;
        int i;
        byte b;
        byte b2 = this.a;
        Serializable serializable = this.i;
        Object obj2 = this.c;
        Object obj3 = this.d;
        Object obj4 = this.f;
        Object obj5 = this.h;
        Object obj6 = this.e;
        Object obj7 = this.g;
        switch (b2) {
            case 0:
                em91 em91Var = (em91) obj;
                sqe sqeVar = em91Var.c;
                AppCompatImageButton appCompatImageButton = (AppCompatImageButton) this.t;
                jm91 jm91Var = em91Var.f;
                appCompatImageButton.setEnabled(!(jm91Var instanceof gm91));
                appCompatImageButton.setAlpha(jm91Var instanceof hm91 ? 0.5f : 1.0f);
                boolean z = sqeVar instanceof lm91;
                appCompatImageButton.setActivated(!z);
                if (z) {
                    g4b1Var = (g4b1) ((idd1) obj2).getValue();
                } else if (sqeVar instanceof mm91) {
                    g4b1Var = (Drawable) ((idd1) obj3).getValue();
                } else if (!(sqeVar instanceof nm91)) {
                    eg.o();
                } else {
                    g4b1Var = (Drawable) ((idd1) obj6).getValue();
                }
                appCompatImageButton.setImageDrawable(g4b1Var);
                if (z) {
                    str = ((lm91) sqeVar).d ? (String) serializable : (String) obj4;
                } else if (sqeVar instanceof mm91) {
                    str = (String) obj7;
                } else if (!(sqeVar instanceof nm91)) {
                    eg.o();
                } else {
                    str = (String) obj5;
                }
                appCompatImageButton.setContentDescription(str);
                break;
            default:
                gbv0 gbv0Var = (gbv0) obj;
                ConstraintLayout constraintLayout = (ConstraintLayout) ((wb00) obj7).b;
                p1f0 p1f0Var = (p1f0) obj6;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) p1f0Var.a;
                ConstraintLayout constraintLayout3 = (ConstraintLayout) ((yeu0) obj5).b;
                ConstraintLayout constraintLayout4 = (ConstraintLayout) ((kp00) obj4).b;
                int iB = gbv0Var.b();
                boolean zA = gbv0Var.a();
                aru0 aru0Var = (aru0) obj3;
                lc20 lc20Var = (lc20) aru0Var.c;
                LinearLayout linearLayout = (LinearLayout) aru0Var.b;
                lc20 lc20Var2 = (lc20) aru0Var.d;
                int i2 = iB == 0 ? -1 : igs.a[l1d.C(iB)];
                Context context = this.b;
                if (i2 == 1) {
                    ((ConstraintLayout) lc20Var2.b).setVisibility(8);
                    ConstraintLayout constraintLayout5 = (ConstraintLayout) lc20Var.b;
                    TextView textView = (TextView) lc20Var.d;
                    constraintLayout5.setVisibility(0);
                    textView.setText(context.getString(2131960202));
                    textView.setTextAppearance(2132018004);
                    ((ContextMenuButton) lc20Var.c).setVisibility(zA ? 0 : 8);
                } else if (i2 != 2) {
                    ((ConstraintLayout) lc20Var.b).setVisibility(8);
                    ((ConstraintLayout) lc20Var2.b).setVisibility(8);
                } else {
                    ((ConstraintLayout) lc20Var.b).setVisibility(8);
                    ConstraintLayout constraintLayout6 = (ConstraintLayout) lc20Var2.b;
                    TextView textView2 = (TextView) lc20Var2.d;
                    constraintLayout6.setVisibility(0);
                    textView2.setText(context.getString(2131960202));
                    textView2.setTextAppearance(2132018024);
                    ((ContextMenuButton) lc20Var2.c).setVisibility(zA ? 0 : 8);
                }
                if (gbv0Var instanceof fbv0) {
                    fbv0 fbv0Var = (fbv0) gbv0Var;
                    if (fbv0Var.j) {
                        linearLayout.setVisibility(0);
                        constraintLayout4.setVisibility(8);
                        constraintLayout3.setVisibility(0);
                        constraintLayout2.setVisibility(8);
                        constraintLayout.setVisibility(8);
                    } else {
                        linearLayout.setVisibility(0);
                        constraintLayout4.setVisibility(8);
                        constraintLayout3.setVisibility(8);
                        LoadingProgressBarView loadingProgressBarView = (LoadingProgressBarView) p1f0Var.h;
                        EncoreButton encoreButton = (EncoreButton) p1f0Var.g;
                        ViewGroup viewGroup = (LinearLayout) p1f0Var.b;
                        constraintLayout2.setVisibility(0);
                        constraintLayout.setVisibility(8);
                        TextView textView3 = (TextView) p1f0Var.c;
                        String str2 = fbv0Var.a;
                        ArrayList<ibv0> arrayList = fbv0Var.e;
                        b290 b290Var = fbv0Var.f;
                        textView3.setText(str2);
                        ((TextView) p1f0Var.d).setText(fbv0Var.b);
                        boolean z2 = (fbv0Var.g && b290Var.isEmpty()) ? false : true;
                        ((ArtworkView) p1f0Var.e).setVisibility(8);
                        ((LinearLayout) p1f0Var.f).setVisibility(8);
                        TransitionSet transitionSet = null;
                        if (!z2) {
                            int i3 = fbv0Var.d;
                            viewGroup.removeAllViews();
                            for (ibv0 ibv0Var : arrayList) {
                                if (i3 == 1) {
                                    Button button = (Button) LayoutInflater.from(context).inflate(2131625435, viewGroup, false);
                                    button.setText(ibv0Var.a);
                                    button.setOnClickListener(new cvr(this, ibv0Var, (byte) 8));
                                    viewGroup.addView(button);
                                } else if (i3 == 2) {
                                    CheckBox checkBox = (CheckBox) LayoutInflater.from(context).inflate(2131625433, viewGroup, false);
                                    checkBox.setText(ibv0Var.a);
                                    Drawable g4b1Var2 = new g4b1(checkBox.getContext(), j4b1.I1, checkBox.getContext().getResources().getDimensionPixelSize(2131165492));
                                    g4b1Var2.b(checkBox.getContext().getColor(2131100252));
                                    Drawable drawable = checkBox.getContext().getDrawable(2131233989);
                                    StateListDrawable stateListDrawable = new StateListDrawable();
                                    stateListDrawable.addState(new int[]{R.attr.state_checked}, g4b1Var2);
                                    stateListDrawable.addState(new int[]{-16842912}, drawable);
                                    checkBox.setCompoundDrawablesWithIntrinsicBounds(stateListDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
                                    checkBox.setChecked(((ArrayList) serializable).contains(Integer.valueOf(ibv0Var.b)));
                                    checkBox.setOnCheckedChangeListener(new ldr(this, ibv0Var, (byte) 1));
                                    viewGroup.addView(checkBox);
                                }
                            }
                            if (i3 == 2) {
                                i = 0;
                                encoreButton.setVisibility(0);
                            }
                            if (fbv0Var.l) {
                                viewGroup.setVisibility(4);
                                loadingProgressBarView.setVisibility(i);
                            } else {
                                viewGroup.setVisibility(i);
                                loadingProgressBarView.setVisibility(8);
                            }
                        } else {
                            int i4 = fbv0Var.h;
                            boolean z3 = fbv0Var.m;
                            String str3 = fbv0Var.i;
                            viewGroup.removeAllViews();
                            encoreButton.setVisibility(8);
                            p811 p811Var = new p811();
                            if (z3) {
                                transitionSet = new TransitionSet();
                                transitionSet.setDuration(600L);
                                AutoTransition autoTransition = new AutoTransition();
                                autoTransition.setInterpolator((TimeInterpolator) hlv.b);
                                transitionSet.addTransition(autoTransition);
                                p811Var.a = ValueAnimator.ofFloat(0.0f, 1.0f);
                                viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new ngf(this, p811Var, (byte) 1));
                            }
                            TransitionSet transitionSet2 = transitionSet;
                            for (Iterator it = arrayList.iterator(); it.hasNext(); it = it) {
                                ibv0 ibv0Var2 = (ibv0) it.next();
                                float f = i4;
                                float f2 = f > 0.0f ? ibv0Var2.c / f : 0.0f;
                                int i5 = i4;
                                View view = (ConstraintLayout) LayoutInflater.from(context).inflate(2131625434, viewGroup, false);
                                ((TextView) view.findViewById(2131430238)).setText(ibv0Var2.a);
                                TextView textView4 = (TextView) view.findViewById(2131430237);
                                Object[] objArr = {Integer.valueOf(jch0.U(100.0f * f2))};
                                TransitionSet transitionSet3 = transitionSet2;
                                textView4.setText(context.getString(2131960203, objArr));
                                if (b290Var.contains(Integer.valueOf(ibv0Var2.b))) {
                                    View viewFindViewById = view.findViewById(2131427972);
                                    g4b1 g4b1Var3 = new g4b1(viewFindViewById.getContext(), j4b1.H1, viewFindViewById.getContext().getResources().getDimensionPixelSize(2131165491));
                                    g4b1Var3.b(viewFindViewById.getContext().getColor(2131101506));
                                    viewFindViewById.setBackground(g4b1Var3);
                                    b = 0;
                                    viewFindViewById.setVisibility(0);
                                } else {
                                    b = 0;
                                }
                                viewGroup.addView(view);
                                ((gw70) obj2).f(str3).g(new jgs(this, view, z3, b), new jgs(this, view, z3, (byte) 1));
                                ValueAnimator valueAnimator = (ValueAnimator) p811Var.a;
                                if (transitionSet3 == null || valueAnimator == null) {
                                    i4 = i5;
                                    e(view, ibv0Var2, i4);
                                } else {
                                    i4 = i5;
                                    valueAnimator.addUpdateListener(new kgs(this, view, ibv0Var2, i4, transitionSet3));
                                }
                                transitionSet2 = transitionSet3;
                            }
                        }
                        i = 0;
                        if (fbv0Var.l) {
                            viewGroup.setVisibility(4);
                            loadingProgressBarView.setVisibility(i);
                        } else {
                            viewGroup.setVisibility(i);
                            loadingProgressBarView.setVisibility(8);
                        }
                    }
                } else if (gbv0Var instanceof zav0) {
                    ((LinearLayout) aru0Var.b).setVisibility(8);
                } else if (gbv0Var instanceof abv0) {
                    linearLayout.setVisibility(0);
                    constraintLayout4.setVisibility(0);
                    constraintLayout3.setVisibility(8);
                    constraintLayout2.setVisibility(8);
                    constraintLayout.setVisibility(8);
                } else if (!(gbv0Var instanceof hbv0)) {
                    eg.o();
                } else if (((hbv0) gbv0Var).c) {
                    ((LinearLayout) aru0Var.b).setVisibility(8);
                } else {
                    linearLayout.setVisibility(0);
                    constraintLayout4.setVisibility(8);
                    constraintLayout3.setVisibility(8);
                    constraintLayout2.setVisibility(8);
                    constraintLayout.setVisibility(0);
                }
                break;
        }
    }

    public final View getView() {
        switch (this.a) {
            case 0:
                return (AppCompatImageButton) this.t;
            default:
                return (LinearLayout) ((aru0) this.d).b;
        }
    }

    public final void n(iu30 iu30Var) {
        switch (this.a) {
            case 0:
                ((AppCompatImageButton) this.t).setOnClickListener(new sis(iu30Var, (byte) 21));
                break;
            default:
                this.t = iu30Var;
                ((EncoreButton) ((p1f0) this.e).g).setOnClickListener(new cvr(iu30Var, this, (byte) 9));
                ((PrimaryButtonView) ((kp00) this.f).c).setOnClickListener(new oes(iu30Var, (byte) 10));
                ((PrimaryButtonView) ((yeu0) this.h).c).setOnClickListener(new oes(iu30Var, (byte) 11));
                aru0 aru0Var = (aru0) this.d;
                ((ContextMenuButton) ((lc20) aru0Var.c).c).setOnClickListener(new oes(iu30Var, (byte) 12));
                ((ContextMenuButton) ((lc20) aru0Var.d).c).setOnClickListener(new oes(iu30Var, (byte) 13));
                break;
        }
    }

    public tps(Context context) {
        this.b = context;
        idd1 idd1Var = new idd1(new sps(this, (byte) 0));
        this.c = idd1Var;
        this.d = new idd1(new sps(this, (byte) 1));
        this.e = new idd1(new sps(this, (byte) 2));
        String string = context.getResources().getString(2131959258);
        this.f = string;
        this.g = context.getResources().getString(2131959257);
        this.h = context.getResources().getString(2131959242);
        this.i = context.getResources().getString(2131959241);
        AppCompatImageButton appCompatImageButton = new AppCompatImageButton(context);
        appCompatImageButton.setBackground(null);
        appCompatImageButton.setScaleType(ImageView.ScaleType.CENTER_CROP);
        appCompatImageButton.setContentDescription(string);
        int iM = too1.m(appCompatImageButton.getContext(), 2131167033);
        appCompatImageButton.setPadding(iM, iM, iM, iM);
        appCompatImageButton.setImageDrawable((g4b1) idd1Var.getValue());
        this.t = appCompatImageButton;
    }
}
