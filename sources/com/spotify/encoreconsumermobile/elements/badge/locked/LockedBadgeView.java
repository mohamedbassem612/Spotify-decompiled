package com.spotify.encoreconsumermobile.elements.badge.locked;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.azo1;
import p.b8k1;
import p.j4b1;
import p.tlv;
import p.x74;
import p.ymz0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/badge/locked/LockedBadgeView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_encoreconsumermobile_elements_badge_locked-locked"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LockedBadgeView extends AppCompatImageView implements tlv {
    /* JADX WARN: Multi-variable type inference failed */
    public LockedBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setBackgroundResource(2131233480);
        ColorStateList colorStateListE = x74.E(context, 2131101374);
        WeakHashMap weakHashMap = b8k1.a;
        setBackgroundTintList(colorStateListE);
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ymz0.a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 2131166217);
        typedArrayObtainStyledAttributes.recycle();
        setImageDrawable(azo1.r(context, j4b1.P3, 2131101375, context.getResources().getDimensionPixelSize(resourceId)));
        setContentDescription(context.getString(2131957664));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(boolean z) {
        setVisibility(z ? 0 : 8);
    }

    public final /* bridge */ /* synthetic */ void f(Object obj) {
        c(((Boolean) obj).booleanValue());
    }

    public LockedBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public LockedBadgeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ LockedBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
