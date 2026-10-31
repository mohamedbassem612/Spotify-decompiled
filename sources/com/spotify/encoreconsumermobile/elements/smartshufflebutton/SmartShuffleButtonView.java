package com.spotify.encoreconsumermobile.elements.smartshufflebutton;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.spotify.legacyglue.widgetstate.StateListAnimatorImageButton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.azo1;
import p.b8k1;
import p.eg;
import p.ei91;
import p.fe81;
import p.fi91;
import p.g4b1;
import p.gi91;
import p.idd1;
import p.iu30;
import p.j4b1;
import p.lcc;
import p.qnd0;
import p.tlv;
import p.x74;
import p.zdc;
import p.zl51;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/smartshufflebutton/SmartShuffleButtonView;", "", "Lcom/spotify/legacyglue/widgetstate/StateListAnimatorImageButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/drawable/Drawable;", "g", "Lp/znb0;", "getLoading", "()Landroid/graphics/drawable/Drawable;", "loading", "Landroid/animation/Animator;", "h", "getLoadingAnimator", "()Landroid/animation/Animator;", "loadingAnimator", "src_main_java_com_spotify_encoreconsumermobile_elements_smartshufflebutton-smartshufflebutton"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SmartShuffleButtonView extends StateListAnimatorImageButton implements tlv {
    public final g4b1 d;
    public final LayerDrawable e;
    public final LayerDrawable f;
    public final idd1 g;
    public final idd1 h;

    /* JADX WARN: Multi-variable type inference failed */
    public SmartShuffleButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new idd1(new qnd0(context, (byte) 18));
        this.h = new idd1(new fe81(this, (byte) 17));
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131165723);
        j4b1 j4b1Var = j4b1.a6;
        this.d = azo1.r(context, j4b1Var, 2131101341, dimensionPixelSize);
        this.e = azo1.j(context, azo1.r(context, j4b1Var, 2131101342, dimensionPixelSize));
        Drawable drawable = context.getDrawable(2131233929);
        if (drawable != null) {
            drawable.setTintList(x74.E(context, 2131101342));
        } else {
            drawable = null;
        }
        this.f = drawable != null ? azo1.j(context, drawable) : null;
        b8k1.p(this, new zdc((byte) 18));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Drawable getLoading() {
        return (Drawable) this.g.getValue();
    }

    private final Animator getLoadingAnimator() {
        return (Animator) this.h.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void f(ei91 ei91Var) {
        String string;
        fi91 fi91Var = fi91.f;
        fi91 fi91Var2 = fi91.g;
        lcc lccVar = ei91Var.a;
        fi91 fi91Var3 = fi91.e;
        if (lccVar.equals(fi91Var3)) {
            setImageDrawable(this.d);
            getLoadingAnimator().end();
        } else if (lccVar.equals(fi91Var2)) {
            setImageDrawable(this.e);
            getLoadingAnimator().end();
        } else if (lccVar.equals(fi91Var)) {
            setImageDrawable(getLoading());
            getLoadingAnimator().start();
        } else if (!(lccVar instanceof gi91)) {
            eg.o();
            return;
        } else {
            setImageDrawable(this.f);
            getLoadingAnimator().end();
        }
        if (lccVar.equals(fi91Var3)) {
            string = getContext().getString(2131955513);
        } else if (lccVar.equals(fi91Var2)) {
            string = getContext().getString(2131962441);
        } else if (lccVar.equals(fi91Var)) {
            string = getContext().getString(2131955514);
        } else {
            if (!(lccVar instanceof gi91)) {
                eg.o();
                return;
            }
            string = getContext().getString(2131955515);
        }
        setContentDescription(string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(iu30 iu30Var) {
        setOnClickListener(new zl51(iu30Var, (byte) 6));
    }

    public SmartShuffleButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public SmartShuffleButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ SmartShuffleButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
