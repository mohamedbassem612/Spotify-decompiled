package com.spotify.creativeworkplatform.encore.elements;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.eg;
import p.g47;
import p.g8h;
import p.i47;
import p.iu30;
import p.ixg;
import p.lvx;
import p.mod;
import p.p17;
import p.r17;
import p.s17;
import p.tlv;
import p.u890;
import p.vmz0;
import p.vno1;
import p.x37;
import p.x74;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0010B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R*\u0010\u001d\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010$\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/spotify/creativeworkplatform/encore/elements/ArtworkView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/drawable/Drawable;", "drawable", "Lp/rih1;", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Lp/g47;", "viewContext", "setViewContext", "(Lp/g47;)V", "Lp/g8h;", "g", "Lp/g8h;", "getImageLoaderColorCallback", "()Lp/g8h;", "setImageLoaderColorCallback", "(Lp/g8h;)V", "getImageLoaderColorCallback$annotations", "()V", "imageLoaderColorCallback", "", "value", "i", "F", "getRadius", "()F", "radius", "getCoverArtSize", "()I", "coverArtSize", "src_main_java_com_spotify_creativeworkplatform_encore-encore"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ArtworkView extends AppCompatImageView implements tlv {
    public final ColorDrawable d;
    public final ColorDrawable e;
    public g47 f;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public g8h imageLoaderColorCallback;
    public ixg h;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public float radius;

    /* JADX WARN: Multi-variable type inference failed */
    public ArtworkView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ColorDrawable colorDrawable = new ColorDrawable(getContext().getColor(2131101505));
        this.d = colorDrawable;
        colorDrawable.setAlpha(128);
        ColorStateList colorStateListE = x74.E(context, 2131101377);
        ColorDrawable colorDrawable2 = new ColorDrawable(context.getColor(2131101501));
        this.e = colorDrawable2;
        colorDrawable2.setTintList(colorStateListE);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vmz0.a, i, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.getFloat(2, 1.0f);
        lvx.t(this, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int getCoverArtSize() {
        return getLayoutParams().width <= 0 ? getWidth() : getLayoutParams().width;
    }

    public static /* synthetic */ void getImageLoaderColorCallback$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(p17 p17Var) {
        float coverArtSize;
        ixg ixgVar;
        vno1 vno1Var = p17Var.b;
        if (vno1Var.equals(r17.c)) {
            coverArtSize = getCoverArtSize() / 2.0f;
        } else if (vno1Var.equals(r17.d)) {
            coverArtSize = 0.0f;
        } else {
            if (!(vno1Var instanceof s17)) {
                eg.o();
                return;
            }
            coverArtSize = p17Var.b.c;
        }
        this.radius = coverArtSize;
        lvx.t(this, coverArtSize);
        LayerDrawable layerDrawable = new LayerDrawable(new ColorDrawable[]{this.e});
        String str = p17Var.a.a;
        g47 g47Var = this.f;
        if (g47Var == null) {
            u890.C("viewContext");
            throw null;
        }
        ixg ixgVarB = g47Var.a.b((str == null || str.length() == 0) ? Uri.EMPTY : Uri.parse(str));
        ixgVarB.r(String.valueOf(2131428270));
        this.h = ixgVarB;
        ixgVarB.m(layerDrawable);
        if (getScaleType() == ImageView.ScaleType.CENTER_CROP && (ixgVar = this.h) != null) {
            ixgVar.d();
            ixgVar.p(getWidth(), getHeight(), 1);
        }
        ixg ixgVar2 = this.h;
        if (ixgVar2 != null) {
            ixgVar2.k(this, this.imageLoaderColorCallback);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(Object obj) {
        p17 p17Var = (p17) obj;
        if (getWidth() <= 0 || getHeight() <= 0) {
            addOnLayoutChangeListener(new x37(this, p17Var, (byte) 2));
        } else {
            c(p17Var);
        }
    }

    public final g8h getImageLoaderColorCallback() {
        return this.imageLoaderColorCallback;
    }

    public final float getRadius() {
        return this.radius;
    }

    public final void n(iu30 iu30Var) {
        this.imageLoaderColorCallback = new i47(iu30Var);
    }

    public void setImageDrawable(Drawable drawable) {
        if (drawable != null && !drawable.isStateful()) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, this.d});
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(mod.a, layerDrawable);
            stateListDrawable.addState(mod.b, drawable);
            drawable = stateListDrawable;
        }
        super.setImageDrawable(drawable);
    }

    public final void setImageLoaderColorCallback(g8h g8hVar) {
        this.imageLoaderColorCallback = g8hVar;
    }

    public final void setViewContext(g47 viewContext) {
        this.f = viewContext;
    }

    public ArtworkView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ArtworkView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ArtworkView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
