package com.spotify.encoreconsumermobile.elements.playbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.agt0;
import p.azo1;
import p.b2u;
import p.b8k1;
import p.bgt0;
import p.cet0;
import p.cgt0;
import p.dgt0;
import p.eca;
import p.eg;
import p.egt0;
import p.fgt0;
import p.g4b1;
import p.idd1;
import p.ihc1;
import p.iu30;
import p.j4b1;
import p.lcg;
import p.lnn1;
import p.ncg;
import p.qft0;
import p.qhl;
import p.rft0;
import p.s980;
import p.scg;
import p.sft0;
import p.t230;
import p.tft0;
import p.tlv;
import p.ucg;
import p.uft0;
import p.vft0;
import p.wft0;
import p.x74;
import p.xft0;
import p.ycn0;
import p.zft0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u00112\b\b\u0001\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u001a²\u0006\f\u0010\u0018\u001a\u00020\u00178\nX\u008a\u0084\u0002²\u0006\f\u0010\u0019\u001a\u00020\u00178\nX\u008a\u0084\u0002"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/playbutton/PlayButtonView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getPlayButtonHeightWithoutBadge", "()I", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "Lp/egt0;", "style", "Lp/rih1;", "setButtonAppearance", "(Lp/egt0;)V", "viewSizeRes", "setEpisodeTrailerHeaderStyle", "(I)V", "Lp/g4b1;", "shuffleDrawable", "lockedDrawable", "src_main_java_com_spotify_encoreconsumermobile_elements_playbutton-playbutton"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PlayButtonView extends ConstraintLayout implements tlv {
    public final ImageView T0;
    public final ImageView U0;
    public g4b1 V0;
    public g4b1 W0;
    public g4b1 X0;
    public final s980 Y0;
    public final Drawable Z0;
    public final Drawable a1;
    public final Drawable b1;
    public boolean c1;
    public egt0 d1;

    /* JADX WARN: Multi-variable type inference failed */
    public PlayButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Trace.beginSection("ECM:PlayButtonView:inflate");
        try {
            if (((Boolean) ycn0.c.getValue()).booleanValue()) {
                y();
            } else {
                View.inflate(context, 2131625399, this);
            }
            Trace.endSection();
            ImageView imageView = (ImageView) b8k1.n(this, 2131427849);
            this.U0 = imageView;
            b2u.o(imageView).a();
            ImageView imageView2 = (ImageView) b8k1.n(this, 2131427860);
            this.T0 = imageView2;
            b2u.o(imageView2).a();
            Drawable drawable = context.getDrawable(2131233755);
            if (drawable == null) {
                eg.m("Could not find drawable");
                throw null;
            }
            drawable.setTintList(x74.E(context, 2131101354));
            this.a1 = drawable;
            Drawable drawable2 = context.getDrawable(2131233757);
            if (drawable2 == null) {
                eg.m("Could not find drawable");
                throw null;
            }
            drawable2.setTintList(x74.E(context, 2131101379));
            this.Z0 = drawable2;
            Drawable drawable3 = context.getDrawable(2131233759);
            if (drawable3 == null) {
                eg.m("Could not find drawable");
                throw null;
            }
            drawable3.setTintList(x74.E(context, 2131101381));
            this.b1 = drawable3;
            imageView2.setBackground(drawable2);
            int i2 = scg.O0;
            ucg ucgVar = new ucg(context, attributeSet, i);
            ucgVar.g = context.getResources().getDimensionPixelSize(2131165837);
            ((eca) ucgVar).a = context.getResources().getDimensionPixelSize(2131165838);
            lcg lcgVar = new lcg(ucgVar);
            lcgVar.c = 1;
            this.Y0 = new s980(context, ucgVar, lcgVar, new ncg(ucgVar));
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setButtonAppearance(egt0 style) {
        int i = 0;
        if ((style instanceof zft0) || (style instanceof qft0)) {
            C();
        } else if (style instanceof uft0) {
            z(getContext().getResources().getDimensionPixelSize(2131165856), getContext().getResources().getDimensionPixelSize(2131165856), getContext().getResources().getDimensionPixelSize(2131165851));
        } else if (style instanceof vft0) {
            z(getContext().getResources().getDimensionPixelSize(2131165848), getContext().getResources().getDimensionPixelSize(2131165856), getContext().getResources().getDimensionPixelSize(2131165851));
        } else if (style instanceof cgt0) {
            z(getContext().getResources().getDimensionPixelSize(2131165859), getContext().getResources().getDimensionPixelSize(2131165857), getContext().getResources().getDimensionPixelSize(2131165852));
        } else if (style instanceof dgt0) {
            z(getContext().getResources().getDimensionPixelSize(2131165858), getContext().getResources().getDimensionPixelSize(2131165857), getContext().getResources().getDimensionPixelSize(2131165852));
        } else if (style instanceof wft0) {
            setEpisodeTrailerHeaderStyle(2131165856);
        } else if (style instanceof xft0) {
            setEpisodeTrailerHeaderStyle(2131165848);
        } else {
            boolean z = style instanceof bgt0;
            ImageView imageView = this.T0;
            if (z) {
                int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(2131165854);
                int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(2131165856);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = dimensionPixelSize;
                layoutParams.width = dimensionPixelSize;
                setLayoutParams(layoutParams);
                ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                layoutParams2.height = dimensionPixelSize2;
                layoutParams2.width = dimensionPixelSize2;
                imageView.setLayoutParams(layoutParams2);
                D(getContext().getResources().getDimensionPixelSize(2131165852), 2131101354);
                imageView.setBackground(this.b1);
            } else if (style instanceof tft0) {
                z(getContext().getResources().getDimensionPixelSize(2131165848), getContext().getResources().getDimensionPixelSize(2131165856), getContext().getResources().getDimensionPixelSize(2131165851));
            } else if (style instanceof rft0) {
                C();
            } else if (style instanceof agt0) {
                int dimensionPixelSize3 = getContext().getResources().getDimensionPixelSize(2131165856);
                int dimensionPixelSize4 = getContext().getResources().getDimensionPixelSize(2131165851);
                ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
                layoutParams3.height = dimensionPixelSize3;
                layoutParams3.width = dimensionPixelSize3;
                setLayoutParams(layoutParams3);
                ViewGroup.LayoutParams layoutParams4 = imageView.getLayoutParams();
                layoutParams4.height = dimensionPixelSize3;
                layoutParams4.width = dimensionPixelSize3;
                imageView.setLayoutParams(layoutParams4);
                D(dimensionPixelSize4, 2131101344);
                imageView.setBackground(this.a1);
            } else if (style instanceof sft0) {
                int dimensionPixelSize5 = getContext().getResources().getDimensionPixelSize(2131165847);
                ViewGroup.LayoutParams layoutParams5 = getLayoutParams();
                layoutParams5.height = dimensionPixelSize5;
                layoutParams5.width = dimensionPixelSize5;
                setLayoutParams(layoutParams5);
                ViewGroup.LayoutParams layoutParams6 = imageView.getLayoutParams();
                layoutParams6.height = dimensionPixelSize5;
                layoutParams6.width = dimensionPixelSize5;
                imageView.setLayoutParams(layoutParams6);
                D(getContext().getResources().getDimensionPixelSize(2131165849), 2131101354);
                imageView.setBackground(getContext().getResources().getDrawable(2131233758, null));
            } else {
                i = 8;
            }
        }
        setVisibility(i);
        this.d1 = style;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setEpisodeTrailerHeaderStyle(int viewSizeRes) {
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(2131165856);
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(viewSizeRes);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = dimensionPixelSize2;
        layoutParams.width = dimensionPixelSize2;
        setLayoutParams(layoutParams);
        ImageView imageView = this.T0;
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        layoutParams2.height = dimensionPixelSize;
        layoutParams2.width = dimensionPixelSize;
        imageView.setLayoutParams(layoutParams2);
        D(getContext().getResources().getDimensionPixelSize(2131165851), 2131101344);
        Drawable drawable = getContext().getDrawable(2131233756);
        if (drawable == null) {
            eg.m("Could not find drawable");
        } else {
            drawable.setTintList(x74.E(getContext(), 2131101389));
            imageView.setBackground(drawable);
        }
    }

    public final void A(boolean z, g4b1 g4b1Var, int i) {
        int i2 = z ? 0 : 4;
        ImageView imageView = this.U0;
        imageView.setVisibility(i2);
        ColorStateList colorStateListE = x74.E(imageView.getContext(), i);
        WeakHashMap weakHashMap = b8k1.a;
        imageView.setBackgroundTintList(colorStateListE);
        imageView.setImageDrawable(g4b1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final void f(cet0 cet0Var) {
        boolean z;
        egt0 egt0Var = cet0Var.b;
        egt0 egt0Var2 = this.d1;
        if (egt0Var2 == null || egt0Var2.getClass() != egt0Var.getClass()) {
            setButtonAppearance(egt0Var);
        }
        boolean z2 = cet0Var.a;
        this.c1 = z2;
        boolean z3 = egt0Var instanceof qft0;
        Drawable drawable = this.Y0;
        if ((!z3 || !((qft0) egt0Var).b) && (!((z = egt0Var instanceof tft0)) || !((tft0) egt0Var).c)) {
            if ((egt0Var instanceof uft0) && ((uft0) egt0Var).a) {
                drawable = this.X0;
            } else if ((egt0Var instanceof vft0) && ((vft0) egt0Var).a) {
                drawable = this.X0;
            } else if (z && ((tft0) egt0Var).b) {
                drawable = this.X0;
            } else if ((egt0Var instanceof agt0) && ((agt0) egt0Var).a) {
                drawable = this.X0;
            } else {
                drawable = z2 ? this.W0 : this.V0;
            }
        }
        this.T0.setImageDrawable(drawable);
        Resources resources = getResources();
        String str = cet0Var.c;
        if (str == null) {
            str = "";
        }
        setContentDescription(ihc1.e1(lnn1.j(resources, cet0Var, str)).toString());
        boolean z4 = this.c1;
        idd1 idd1Var = new idd1(new fgt0(this, (byte) 1));
        idd1 idd1Var2 = new idd1(new fgt0(this, (byte) 0));
        if (egt0Var instanceof zft0) {
            zft0 zft0Var = (zft0) egt0Var;
            if (zft0Var.b) {
                A(true, (g4b1) idd1Var2.getValue(), 2131101374);
                return;
            } else {
                A(!z4 && zft0Var.a, (g4b1) idd1Var.getValue(), 2131101387);
                return;
            }
        }
        if (z3) {
            A(!z4 && ((qft0) egt0Var).a, (g4b1) idd1Var2.getValue(), 2131101374);
        } else if (egt0Var instanceof rft0) {
            A(!z4 && ((rft0) egt0Var).a, (g4b1) idd1Var2.getValue(), 2131101374);
        } else {
            this.U0.setVisibility(4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C() {
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(2131165855);
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(2131165848);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = dimensionPixelSize;
        layoutParams.width = dimensionPixelSize;
        setLayoutParams(layoutParams);
        ImageView imageView = this.T0;
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        layoutParams2.height = dimensionPixelSize2;
        layoutParams2.width = dimensionPixelSize2;
        imageView.setLayoutParams(layoutParams2);
        D(getContext().getResources().getDimensionPixelSize(2131165850), 2131101380);
        imageView.setBackground(this.Z0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D(int i, int i2) {
        this.V0 = azo1.r(getContext(), j4b1.L4, i2, i);
        this.W0 = azo1.r(getContext(), j4b1.E4, i2, i);
        this.X0 = azo1.r(getContext(), j4b1.P3, i2, i);
    }

    public CharSequence getAccessibilityClassName() {
        return "android.widget.Button";
    }

    public final int getPlayButtonHeightWithoutBadge() {
        return this.T0.getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(iu30 iu30Var) {
        setOnClickListener(new t230(this, iu30Var, (byte) 24));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y() {
        ImageView imageView = new ImageView(getContext());
        imageView.setId(2131427860);
        imageView.setClickable(false);
        imageView.setFocusable(false);
        imageView.setContentDescription(null);
        imageView.setImportantForAccessibility(2);
        imageView.setDuplicateParentStateEnabled(true);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        imageView.setScaleType(scaleType);
        qhl qhlVar = new qhl(0, 0);
        qhlVar.i = 0;
        qhlVar.l = 0;
        qhlVar.t = 0;
        qhlVar.v = 0;
        addView(imageView, qhlVar);
        int i = (int) ((20.0f * getResources().getDisplayMetrics().density) + 0.5f);
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setId(2131427849);
        imageView2.setClickable(false);
        imageView2.setFocusable(false);
        imageView2.setContentDescription(null);
        imageView2.setImportantForAccessibility(2);
        imageView2.setDuplicateParentStateEnabled(true);
        imageView2.setScaleType(scaleType);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        imageView2.setBackground(gradientDrawable);
        qhl qhlVar2 = new qhl(i, i);
        qhlVar2.l = 0;
        qhlVar2.v = 0;
        addView(imageView2, qhlVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z(int i, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i;
        layoutParams.width = i;
        setLayoutParams(layoutParams);
        ImageView imageView = this.T0;
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        layoutParams2.height = i2;
        layoutParams2.width = i2;
        imageView.setLayoutParams(layoutParams2);
        D(i3, 2131101344);
        imageView.setBackground(this.a1);
    }

    public PlayButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public PlayButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ PlayButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
