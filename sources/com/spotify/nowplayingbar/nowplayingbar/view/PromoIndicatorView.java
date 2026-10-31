package com.spotify.nowplayingbar.nowplayingbar.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/spotify/nowplayingbar/nowplayingbar/view/PromoIndicatorView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_nowplayingbar_nowplayingbar-nowplayingbar"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class PromoIndicatorView extends AppCompatTextView {
    /* JADX WARN: Multi-variable type inference failed */
    public PromoIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setSelected(true);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131167022);
        Drawable drawable = getCompoundDrawablesRelative()[0];
        if (drawable != null) {
            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            setCompoundDrawablesRelative(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        setCompoundDrawableTintList(ColorStateList.valueOf(getCurrentTextColor()));
    }

    public PromoIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public PromoIndicatorView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ PromoIndicatorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
