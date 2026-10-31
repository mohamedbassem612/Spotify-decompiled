package com.spotify.encoremobile.facepile;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.adt;
import p.b380;
import p.bg11;
import p.n3p1;
import p.o280;
import p.o7h;
import p.rnz0;
import p.w6;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@adt
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/spotify/encoremobile/facepile/FacePileView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "cornerRadiusPx", "Lp/rih1;", "setFaceCornerRadius", "(F)V", "size", "setFaceSize", "(I)V", "src_main_java_com_spotify_encoremobile_facepile-facepile"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class FacePileView extends LinearLayout {
    public final bg11 a;
    public final FacePileContainer b;
    public final boolean c;
    public final int d;
    public final float e;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public FacePileView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rnz0.a);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, getResources().getDimensionPixelSize(2131166022));
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, getResources().getDimensionPixelSize(2131166955));
        int integer = typedArrayObtainStyledAttributes.getInteger(2, 2);
        this.c = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.e = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        FacePileContainer facePileContainer = (FacePileContainer) layoutInflaterFrom.inflate(2131624630, (ViewGroup) this, false);
        this.b = facePileContainer;
        addView(facePileContainer);
        n3p1.j(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i2 = 0;
        int i3 = 0;
        while (i2 < integer) {
            AppCompatImageView appCompatImageView = (FaceView) layoutInflaterFrom.inflate(2131624632, (ViewGroup) this.b, false);
            if (i2 == 0) {
                appCompatImageView.setId(2131428818);
            } else {
                int i4 = this.d;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) appCompatImageView.getLayoutParams();
                if (appCompatImageView.getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
                    marginLayoutParams.rightMargin = i4;
                } else {
                    marginLayoutParams.leftMargin = i4;
                }
                appCompatImageView.setLayoutParams(marginLayoutParams);
            }
            if (this.e <= 0.0f) {
                appCompatImageView.setElevation(((integer - i2) - 1.0f) * getResources().getDisplayMetrics().density);
            }
            appCompatImageView.setDuplicateParentStateEnabled(true);
            int i5 = i3 + 1;
            int iB = o280.b(objArrCopyOf.length, i5);
            if (iB > objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
            }
            objArrCopyOf[i3] = appCompatImageView;
            this.b.addView(appCompatImageView);
            i2++;
            i3 = i5;
        }
        this.a = b380.l(i3, objArrCopyOf);
        setFaceSize(dimensionPixelSize);
    }

    public final void setFaceCornerRadius(float cornerRadiusPx) {
        ViewGroup.LayoutParams layoutParams;
        bg11 bg11Var = this.a;
        w6 it = bg11Var.iterator();
        while (true) {
            w6 w6Var = it;
            if (!w6Var.hasNext()) {
                break;
            } else {
                ((FaceView) w6Var.next()).setCornerRadius(cornerRadiusPx);
            }
        }
        AppCompatImageView appCompatImageView = (FaceView) o7h.s0(bg11Var);
        if (appCompatImageView == null || (layoutParams = appCompatImageView.getLayoutParams()) == null) {
            return;
        }
        this.b.a(layoutParams.width / 2.0f, this.e, this.d, cornerRadiusPx);
    }

    public final void setFaceSize(int size) {
        this.b.a(size / 2.0f, this.e, this.d, Float.MAX_VALUE);
        w6 it = this.a.iterator();
        while (true) {
            w6 w6Var = it;
            if (!w6Var.hasNext()) {
                return;
            }
            AppCompatImageView appCompatImageView = (FaceView) w6Var.next();
            ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
            layoutParams.width = size;
            layoutParams.height = size;
            appCompatImageView.setLayoutParams(layoutParams);
        }
    }

    public FacePileView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public FacePileView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ FacePileView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
