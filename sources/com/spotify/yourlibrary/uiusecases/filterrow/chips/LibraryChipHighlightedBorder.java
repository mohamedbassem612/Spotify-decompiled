package com.spotify.yourlibrary.uiusecases.filterrow.chips;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.adt;
import p.qx21;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@adt
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u0012\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/spotify/yourlibrary/uiusecases/filterrow/chips/LibraryChipHighlightedBorder;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "e", "[F", "getGradientColorStops$annotations", "()V", "gradientColorStops", "src_main_java_com_spotify_yourlibrary_uiusecases_filterrow-filterrow"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LibraryChipHighlightedBorder extends View {
    public final float a;
    public final float b;
    public final Path c;
    public final Paint d;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final float[] gradientColorStops;
    public final int[] f;

    public LibraryChipHighlightedBorder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = context.getResources().getDimension(2131166197);
        this.b = context.getResources().getDimension(2131166198);
        this.c = new Path();
        Paint paint = new Paint();
        paint.setDither(true);
        paint.setAntiAlias(true);
        this.d = paint;
        this.gradientColorStops = new float[]{0.0f, 0.65f, 1.0f};
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = qx21.a;
        this.f = new int[]{resources.getColor(2131101594, theme), context.getResources().getColor(2131101595, context.getTheme()), context.getResources().getColor(2131101596, context.getTheme())};
    }

    private static /* synthetic */ void getGradientColorStops$annotations() {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isSelected()) {
            return;
        }
        canvas.drawPath(this.c, this.d);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        float f = i;
        float height = getHeight();
        this.d.setShader(new LinearGradient(f * 0.17f, 0.0f, f * 0.86f, height, this.f, this.gradientColorStops, Shader.TileMode.CLAMP));
        Path path = this.c;
        path.reset();
        float f2 = this.a;
        path.addRoundRect(0.0f, 0.0f, f, height, f2, f2, Path.Direction.CW);
        float f3 = this.b;
        float f4 = 0.0f + f3;
        float f5 = this.a;
        path.addRoundRect(f4, f4, f - f3, height - f3, f5, f5, Path.Direction.CCW);
    }

    public LibraryChipHighlightedBorder(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public LibraryChipHighlightedBorder(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ LibraryChipHighlightedBorder(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
