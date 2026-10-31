package com.spotify.encoreconsumermobile.elements.artwork;

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
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.a6t0;
import p.adt;
import p.ago1;
import p.az70;
import p.df;
import p.eg;
import p.f0o1;
import p.f47;
import p.f8h;
import p.g4b1;
import p.gch0;
import p.h47;
import p.hg10;
import p.iu30;
import p.iw61;
import p.ixg;
import p.j4b1;
import p.lcc;
import p.lvx;
import p.nx2;
import p.o17;
import p.pk70;
import p.rk70;
import p.s10;
import p.tlv;
import p.u890;
import p.v07;
import p.vmz0;
import p.x1p1;
import p.x37;
import p.x5t0;
import p.x74;
import p.y1a1;
import p.y5t0;
import p.z5t0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@adt
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0010B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010$\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u00106\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b.\u0010/\u0012\u0004\b4\u00105\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u0010>\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R(\u0010E\u001a\u0004\u0018\u00010?2\b\u0010@\u001a\u0004\u0018\u00010?8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u001bR\u0014\u0010I\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\u001b¨\u0006J"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/artwork/ArtworkView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/drawable/Drawable;", "drawable", "Lp/rih1;", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Lp/f47;", "viewContext", "setViewContext", "(Lp/f47;)V", "", "getRadius", "()F", "getContentRadius", "f", "I", "getPlaceholderInset", "()I", "setPlaceholderInset", "(I)V", "placeholderInset", "g", "F", "getPlaceholderInsetRatio", "setPlaceholderInsetRatio", "(F)V", "placeholderInsetRatio", "", "N0", "Z", "getConstrainIconToSmallestDimension", "()Z", "setConstrainIconToSmallestDimension", "(Z)V", "constrainIconToSmallestDimension", "Lp/f8h;", "O0", "Lp/f8h;", "getImageLoaderColorCallback", "()Lp/f8h;", "setImageLoaderColorCallback", "(Lp/f8h;)V", "getImageLoaderColorCallback$annotations", "()V", "imageLoaderColorCallback", "Lp/az70;", "Q0", "Lp/az70;", "getRequestCreator", "()Lp/az70;", "setRequestCreator", "(Lp/az70;)V", "requestCreator", "Landroid/content/res/ColorStateList;", "value", "getPlaceholderBackgroundColor", "()Landroid/content/res/ColorStateList;", "setPlaceholderBackgroundColor", "(Landroid/content/res/ColorStateList;)V", "placeholderBackgroundColor", "getCoverArtSize", "coverArtSize", "getIconReferenceSize", "iconReferenceSize", "src_main_java_com_spotify_encoreconsumermobile_elements_artwork-artwork"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class ArtworkView extends AppCompatImageView implements tlv {
    public static final String S0 = String.valueOf(2131428270);

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    public boolean constrainIconToSmallestDimension;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    public f8h imageLoaderColorCallback;
    public final s10 P0;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    public az70 requestCreator;
    public Function0 R0;
    public final ColorDrawable d;
    public final gch0 e;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int placeholderInset;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public float placeholderInsetRatio;
    public LayerDrawable h;
    public j4b1 i;
    public f47 t;

    public ArtworkView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new gch0();
        this.P0 = new s10(this, (byte) 9);
        this.R0 = df.g;
        ColorDrawable colorDrawable = new ColorDrawable(x74.D(getContext(), 2131101505));
        this.d = colorDrawable;
        colorDrawable.setAlpha(128);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vmz0.a, i, 0);
        this.placeholderInset = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        setPlaceholderBackgroundColor(x74.E(context, typedArrayObtainStyledAttributes.getResourceId(3, 2131101377)));
        this.placeholderInsetRatio = typedArrayObtainStyledAttributes.getFloat(2, 1.0f);
        lvx.t(this, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getContentRadius() {
        return Math.max((getContext().getResources().getDisplayMetrics().densityDpi / 160.0f) * 4.0f, getCoverArtSize() * 0.025f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCoverArtSize() {
        return getLayoutParams().width <= 0 ? getWidth() : getLayoutParams().width;
    }

    private final int getIconReferenceSize() {
        if (!this.constrainIconToSmallestDimension) {
            return getCoverArtSize();
        }
        int width = getLayoutParams().width <= 0 ? getWidth() : getLayoutParams().width;
        int height = getLayoutParams().height <= 0 ? getHeight() : getLayoutParams().height;
        return height > 0 ? Math.min(width, height) : width;
    }

    public static /* synthetic */ void getImageLoaderColorCallback$annotations() {
    }

    public final int e() {
        return (((double) this.placeholderInsetRatio) >= 1.0d || getIconReferenceSize() <= 0) ? this.placeholderInset : (((int) (getIconReferenceSize() * this.placeholderInsetRatio)) / 2) + this.placeholderInset;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void g(o17 o17Var) throws NoWhenBranchMatchedException {
        hg10 layerDrawable;
        int iP;
        ixg ixgVar;
        this.R0 = new nx2(o17Var, this, (byte) 29);
        iw61 iw61VarE = new iw61().e(((Number) this.R0.invoke()).floatValue());
        gch0 gch0Var = this.e;
        gch0Var.setShapeAppearanceModel(iw61VarE);
        lvx.u(this, this.R0);
        a6t0 a6t0VarB = o17Var.b();
        if (a6t0VarB == null) {
            layerDrawable = null;
        } else if (a6t0VarB instanceof z5t0) {
            Context context = getContext();
            j4b1 j4b1Var = ((z5t0) a6t0VarB).h;
            int iconReferenceSize = getIconReferenceSize();
            int iE = e();
            if (this.i == j4b1Var) {
                layerDrawable = this.h;
            } else {
                int i = iconReferenceSize - (iE * 2);
                Drawable g4b1Var = new g4b1(context, j4b1Var, i);
                g4b1Var.c(f0o1.i(context, 2131101378));
                hg10 layerDrawable2 = new LayerDrawable(new Drawable[]{gch0Var, g4b1Var});
                int coverArtSize = (getCoverArtSize() - i) / 2;
                layerDrawable2.setLayerInset(1, coverArtSize, iE, coverArtSize, iE);
                this.h = layerDrawable2;
                this.i = j4b1Var;
                layerDrawable = layerDrawable2;
            }
        } else if (a6t0VarB instanceof a6t0) {
            a6t0 a6t0Var = a6t0VarB;
            layerDrawable = new hg10(getContext(), a6t0Var.Z(), a6t0Var.Y());
        } else if (a6t0VarB instanceof y5t0) {
            Context context2 = getContext();
            rk70 rk70VarY = ((y5t0) a6t0VarB).Y();
            int iE2 = e();
            pk70 pk70VarA = rk70VarY.a();
            if (pk70VarA instanceof pk70) {
                rk70VarY.a().getClass();
                iP = ago1.p(this, 2130970440);
            } else {
                if (pk70VarA != null) {
                    eg.o();
                    return;
                }
                iP = ago1.p(this, 2130970440);
            }
            Drawable drawableG = x74.G(context2, rk70VarY.b());
            if (drawableG != null) {
                y1a1.T(drawableG.mutate(), iP);
            } else {
                drawableG = null;
            }
            int i2 = -Math.abs(getMeasuredWidth() - getMeasuredHeight());
            hg10 layerDrawable3 = new LayerDrawable(new Drawable[]{gch0Var, drawableG});
            layerDrawable3.setLayerInset(0, i2, i2, i2, i2);
            int iconReferenceSize2 = getIconReferenceSize() - (iE2 * 2);
            int coverArtSize2 = getCoverArtSize() > iconReferenceSize2 ? (getCoverArtSize() - iconReferenceSize2) / 2 : iE2;
            layerDrawable3.setLayerInset(1, coverArtSize2, iE2, coverArtSize2, iE2);
            layerDrawable = layerDrawable3;
        } else {
            if (!a6t0VarB.equals(x5t0.h)) {
                eg.o();
                return;
            }
            layerDrawable = new LayerDrawable(new gch0[]{gch0Var});
        }
        ixg ixgVar2 = this.requestCreator;
        if (ixgVar2 != null) {
            ixgVar2.b();
        }
        String str = o17Var.a().a;
        if (str == null) {
            if (o17Var instanceof v07) {
                layerDrawable = ((v07) o17Var).d();
            }
            setImageDrawable(layerDrawable);
            return;
        }
        f47 f47Var = this.t;
        if (f47Var == null) {
            u890.C("viewContext");
            throw null;
        }
        ixg ixgVarB = f47Var.a.b(str.length() == 0 ? Uri.EMPTY : Uri.parse(str));
        ixgVarB.r(S0);
        this.requestCreator = ixgVarB;
        if (layerDrawable != null) {
            ixgVarB.m(layerDrawable);
        }
        if (getScaleType() == ImageView.ScaleType.CENTER_CROP && (ixgVar = this.requestCreator) != null) {
            ixg ixgVar3 = ixgVar;
            ixgVar3.d();
            ixgVar3.p(getWidth(), getHeight(), 1);
        }
        boolean zC = o17Var.c();
        ixg ixgVar4 = this.requestCreator;
        if (!zC) {
            if (ixgVar4 != null) {
                ixgVar4.k(this, this.imageLoaderColorCallback);
            }
        } else if (ixgVar4 != null) {
            ixg ixgVar5 = ixgVar4;
            ixgVar5.g = false;
            ixgVar5.j(x1p1.u(this, this.imageLoaderColorCallback));
        }
    }

    public final boolean getConstrainIconToSmallestDimension() {
        return this.constrainIconToSmallestDimension;
    }

    public final f8h getImageLoaderColorCallback() {
        return this.imageLoaderColorCallback;
    }

    public final ColorStateList getPlaceholderBackgroundColor() {
        return this.e.a.c;
    }

    public final int getPlaceholderInset() {
        return this.placeholderInset;
    }

    public final float getPlaceholderInsetRatio() {
        return this.placeholderInsetRatio;
    }

    public final float getRadius() {
        return ((Number) this.R0.invoke()).floatValue();
    }

    public final az70 getRequestCreator() {
        return this.requestCreator;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // p.mi90
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void f(o17 o17Var) throws NoWhenBranchMatchedException {
        s10 s10Var = this.P0;
        removeCallbacks(s10Var);
        f47 f47Var = this.t;
        if (f47Var != null) {
            f47Var.a.d(this);
        }
        if (getWidth() <= 0 || getHeight() <= 0) {
            addOnLayoutChangeListener(new x37(this, o17Var));
        } else {
            g(o17Var);
        }
        if (o17Var.a().a == null && o17Var.c()) {
            post(s10Var);
        }
    }

    @Override // p.mi90
    public final void n(iu30 iu30Var) {
        this.imageLoaderColorCallback = new h47(iu30Var);
    }

    public final void setConstrainIconToSmallestDimension(boolean z) {
        this.constrainIconToSmallestDimension = z;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (drawable != null && !drawable.isStateful()) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, this.d});
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(lcc.a, layerDrawable);
            stateListDrawable.addState(lcc.b, drawable);
            drawable = stateListDrawable;
        }
        super.setImageDrawable(drawable);
    }

    public final void setImageLoaderColorCallback(f8h f8hVar) {
        this.imageLoaderColorCallback = f8hVar;
    }

    public final void setPlaceholderBackgroundColor(ColorStateList colorStateList) {
        this.e.m(colorStateList);
    }

    public final void setPlaceholderInset(int i) {
        this.placeholderInset = i;
    }

    public final void setPlaceholderInsetRatio(float f) {
        this.placeholderInsetRatio = f;
    }

    public final void setRequestCreator(az70 az70Var) {
        this.requestCreator = az70Var;
    }

    public final void setViewContext(f47 viewContext) {
        this.t = viewContext;
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
