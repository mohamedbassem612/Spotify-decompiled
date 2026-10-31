package com.spotify.highlightsstats.statsdetails.uiusecases.bubblegraph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.kac;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR.\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/spotify/highlightsstats/statsdetails/uiusecases/bubblegraph/BubbleView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lp/kac;", "value", "c", "Lp/kac;", "getBubbleColors", "()Lp/kac;", "setBubbleColors", "(Lp/kac;)V", "bubbleColors", "src_main_java_com_spotify_highlightsstats_statsdetails_uiusecases_bubblegraph-bubblegraph"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BubbleView extends View {
    public final Paint a;
    public int b;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public kac bubbleColors;

    public /* synthetic */ BubbleView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        kac kacVar = this.bubbleColors;
        if (kacVar != null) {
            float width = getWidth() / 2.0f;
            float height = getHeight() / 2.0f;
            RadialGradient radialGradient = new RadialGradient(width, height, this.b, new int[]{kacVar.a, kacVar.b}, new float[]{0.5f, 0.9f}, Shader.TileMode.CLAMP);
            Paint paint = this.a;
            paint.setShader(radialGradient);
            canvas.drawCircle(width, height, this.b, paint);
        }
    }

    public final kac getBubbleColors() {
        return this.bubbleColors;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > i2) {
            i = i2;
        }
        this.b = i / 2;
    }

    public final void setBubbleColors(kac kacVar) {
        this.bubbleColors = kacVar;
        invalidate();
    }

    public BubbleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public BubbleView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public BubbleView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new Paint(1);
    }

    public BubbleView(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
