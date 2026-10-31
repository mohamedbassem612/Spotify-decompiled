package com.spotify.legacyglue.emptystates;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.a8o;
import p.adt;
import p.b8k1;
import p.jch0;
import p.oi;
import p.wnz0;
import p.x2g0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@adt
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0014\u001a\u00020\u000b2\b\b\u0001\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\rJ\u0017\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000b2\b\b\u0001\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\rJ\u0017\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\rJ\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\"\u0010#R\u0017\u0010)\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010,\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010(R\u0017\u00102\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/spotify/legacyglue/emptystates/EmptyView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "imageWidth", "Lp/rih1;", "setImageWidth", "(I)V", "", "imageAspectRatio", "setImageAspectRatio", "(F)V", "", "title", "setTitle", "(Ljava/lang/CharSequence;)V", "description", "setText", "Landroid/graphics/drawable/Drawable;", "drawable", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;)V", "res", "setImageResource", "Landroid/view/View;", "getAccessoryView", "()Landroid/view/View;", "accessoryView", "setAccessoryView", "(Landroid/view/View;)V", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "getTitleView", "()Landroid/widget/TextView;", "titleView", "b", "getTextView", "textView", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "imageView", "src_main_java_com_spotify_legacyglue_emptystates-emptystates"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EmptyView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final TextView titleView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final TextView textView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final ImageView imageView;
    public final oi d;
    public int e;
    public float f;
    public boolean g;

    public EmptyView(Context context, AttributeSet attributeSet, int i) {
        int iX;
        int iX2;
        super(context, attributeSet);
        setOrientation(1);
        setGravity(17);
        View.inflate(context, 2131625362, this);
        TextView textView = (TextView) findViewById(2131431356);
        this.titleView = textView;
        TextView textView2 = (TextView) findViewById(2131431258);
        this.textView = textView2;
        ImageView imageView = (ImageView) findViewById(2131429612);
        this.imageView = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(2131427413);
        this.d = new oi(viewGroup);
        this.e = a8o.y(96.0f, getResources());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x2g0.b, i, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        String string = typedArrayObtainStyledAttributes.getString(1);
        String string2 = typedArrayObtainStyledAttributes.getString(2);
        setTitle(string);
        setText(string2);
        setImageDrawable(drawable);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, wnz0.a, i, 0);
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(6, 0);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(7);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(3, 0);
        ColorStateList colorStateList2 = typedArrayObtainStyledAttributes2.getColorStateList(4);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes2.getDimensionPixelOffset(1, 0);
        int dimensionPixelOffset2 = typedArrayObtainStyledAttributes2.getDimensionPixelOffset(5, 0);
        int dimensionPixelOffset3 = typedArrayObtainStyledAttributes2.getDimensionPixelOffset(0, 0);
        this.e = typedArrayObtainStyledAttributes2.getDimensionPixelSize(2, this.e);
        if (resourceId != 0) {
            textView.setTextAppearance(resourceId);
        }
        if (resourceId2 != 0) {
            textView2.setTextAppearance(resourceId2);
        }
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        if (colorStateList2 != null) {
            textView2.setTextColor(colorStateList2);
        }
        if (dimensionPixelOffset > 0) {
            ((LinearLayout.LayoutParams) imageView.getLayoutParams()).bottomMargin = dimensionPixelOffset;
        }
        if (dimensionPixelOffset2 > 0) {
            ((LinearLayout.LayoutParams) textView2.getLayoutParams()).topMargin = dimensionPixelOffset2;
        }
        if (dimensionPixelOffset3 > 0) {
            ((LinearLayout.LayoutParams) viewGroup.getLayoutParams()).topMargin = dimensionPixelOffset3;
        }
        typedArrayObtainStyledAttributes2.recycle();
        Drawable drawable2 = null;
        try {
            TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.windowBackground}, i, 0);
            drawable2 = typedArrayObtainStyledAttributes3.getDrawable(0);
            typedArrayObtainStyledAttributes3.recycle();
        } catch (Resources.NotFoundException unused) {
        }
        WeakHashMap weakHashMap = b8k1.a;
        setBackground(drawable2);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics.widthPixels / displayMetrics.density <= 320.0f) {
            iX = a8o.x(32.0f, getResources());
            iX2 = a8o.x(16.0f, getResources());
        } else {
            iX = a8o.x(48.0f, getResources());
            iX2 = a8o.x(32.0f, getResources());
        }
        setPadding(iX, iX2, iX, iX2);
    }

    public final View getAccessoryView() {
        return (View) this.d.d;
    }

    public final ImageView getImageView() {
        return this.imageView;
    }

    public final TextView getTextView() {
        return this.textView;
    }

    public final TextView getTitleView() {
        return this.titleView;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        oi oiVar = this.d;
        View view = (View) oiVar.d;
        ((ViewGroup) oiVar.c).setVisibility(view != null ? view.getVisibility() : 8);
        ImageView imageView = this.imageView;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            float intrinsicWidth = this.g ? this.f : drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
            int i3 = this.e;
            int iU = jch0.U(i3 / intrinsicWidth);
            imageView.getLayoutParams().width = i3;
            imageView.getLayoutParams().height = iU;
        }
        super.onMeasure(i, i2);
    }

    public final void setAccessoryView(View accessoryView) {
        this.d.J(accessoryView);
    }

    public final void setImageAspectRatio(float imageAspectRatio) {
        this.f = imageAspectRatio;
        this.g = true;
    }

    public final void setImageDrawable(Drawable drawable) {
        ImageView imageView = this.imageView;
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setImageDrawable(drawable);
        }
    }

    public final void setImageResource(int res) {
        ImageView imageView = this.imageView;
        if (res == 0) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setImageResource(res);
        }
    }

    public final void setImageWidth(int imageWidth) {
        this.e = imageWidth;
    }

    public final void setText(CharSequence description) {
        int i = TextUtils.isEmpty(description) ? 8 : 0;
        TextView textView = this.textView;
        textView.setVisibility(i);
        textView.setText(description);
    }

    public final void setTitle(CharSequence title) {
        this.titleView.setText(title);
    }

    public final void setTitle(int title) {
        this.titleView.setText(title);
    }

    public final void setText(int description) {
        setText(getContext().getString(description));
    }

    public EmptyView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public EmptyView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ EmptyView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 2130969967 : i);
    }
}
