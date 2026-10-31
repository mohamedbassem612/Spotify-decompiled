package androidx.mediarouter.app;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import p.lk5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
class MediaRouteVolumeSlider extends lk5 {
    public final float b;
    public Drawable c;

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedValue typedValue = new TypedValue();
        this.b = context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true) ? typedValue.getFloat() : 0.5f;
    }

    @Override // p.lk5, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int i = isEnabled() ? 255 : (int) (this.b * 255.0f);
        Drawable drawable = this.c;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(0, mode);
        this.c.setAlpha(i);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
            progressDrawable = layerDrawable.findDrawableByLayerId(R.id.progress);
            layerDrawable.findDrawableByLayerId(R.id.background).setColorFilter(0, mode);
        }
        progressDrawable.setColorFilter(0, mode);
        progressDrawable.setAlpha(i);
    }

    @Override // android.widget.AbsSeekBar
    public final void setThumb(Drawable drawable) {
        this.c = drawable;
        super.setThumb(drawable);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130970192);
    }

    public MediaRouteVolumeSlider(Context context) {
        this(context, null);
    }
}
