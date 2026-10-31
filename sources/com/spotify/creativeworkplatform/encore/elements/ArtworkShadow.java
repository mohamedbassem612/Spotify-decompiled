package com.spotify.creativeworkplatform.encore.elements;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/spotify/creativeworkplatform/encore/elements/ArtworkShadow;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getShadowBlurRadius", "()F", "shadowBlurRadius", "src_main_java_com_spotify_creativeworkplatform_encore-encore"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ArtworkShadow extends View {
    public static final /* synthetic */ int g = 0;
    public final Paint a;
    public float b;
    public float c;
    public boolean d;
    public View e;
    public float f;

    public ArtworkShadow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        paint.setColor(0);
        this.a = paint;
        if (Build.VERSION.SDK_INT < 28) {
            setLayerType(1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getShadowBlurRadius() {
        return this.b / 1.5f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        View view = this.e;
        if (view != null) {
            boolean z = this.d;
            Paint paint = this.a;
            if (!z) {
                float f = this.b;
                canvas.drawRect(f, f, getWidth() - this.b, getHeight() - this.b, paint);
                return;
            }
            float left = view.getLeft() - this.b;
            float top = view.getTop() - this.c;
            float right = view.getRight() + this.b;
            float bottom = view.getBottom() + this.c;
            float f2 = this.f;
            canvas.drawRoundRect(left, top, right, bottom, f2, f2, paint);
        }
    }

    public ArtworkShadow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ArtworkShadow(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ArtworkShadow(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
