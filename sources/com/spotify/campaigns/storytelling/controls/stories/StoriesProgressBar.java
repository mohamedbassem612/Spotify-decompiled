package com.spotify.campaigns.storytelling.controls.stories;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;
import kotlin.Metadata;
import p.b8k1;
import p.qx21;
import p.tmz0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bR*\u0010\u0013\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0016\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010R$\u0010\u001c\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u00178\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010 \u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001e\u0010\u0010\"\u0004\b\u001f\u0010\u0012R\"\u0010$\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\u000e\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010\u0012¨\u0006%"}, d2 = {"Lcom/spotify/campaigns/storytelling/controls/stories/StoriesProgressBar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "a", "I", "getStoriesCount", "()I", "setStoriesCount", "(I)V", "storiesCount", "b", "getCurrentStory", "currentStory", "", "c", "F", "getCurrentStoryProgress", "()F", "currentStoryProgress", "d", "getBarsBackgroundColor", "setBarsBackgroundColor", "barsBackgroundColor", "e", "getBarsProgressColor", "setBarsProgressColor", "barsProgressColor", "src_main_java_com_spotify_campaigns_storytelling-storytelling"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StoriesProgressBar extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int storiesCount;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int currentStory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public float currentStoryProgress;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int barsBackgroundColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int barsProgressColor;
    public int f;
    public int g;
    public final int h;
    public final Rect i;
    public final Paint t;

    public StoriesProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new Rect();
        this.t = new Paint();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, tmz0.a, i, 0);
        try {
            setStoriesCount(typedArrayObtainStyledAttributes.getInt(5, 10));
            this.currentStory = typedArrayObtainStyledAttributes.getInt(0, 4);
            this.currentStoryProgress = typedArrayObtainStyledAttributes.getFraction(1, 1, 1, 0.4f);
            this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, context.getResources().getDimensionPixelSize(2131165628));
            Resources resources = context.getResources();
            Resources.Theme theme = context.getTheme();
            ThreadLocal threadLocal = qx21.a;
            this.barsBackgroundColor = typedArrayObtainStyledAttributes.getColor(2, resources.getColor(2131101290, theme));
            this.barsProgressColor = typedArrayObtainStyledAttributes.getColor(4, context.getResources().getColor(2131101291, context.getTheme()));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void a(int i, int i2) {
        int paddingStart;
        int i3 = this.storiesCount;
        if (i3 > 0) {
            int i4 = (i3 - 1) * this.h;
            WeakHashMap weakHashMap = b8k1.a;
            paddingStart = (((i - getPaddingStart()) - getPaddingEnd()) - i4) / this.storiesCount;
        } else {
            paddingStart = 0;
        }
        this.f = paddingStart;
        this.g = (i2 - getPaddingTop()) - getPaddingBottom();
    }

    public final int getBarsBackgroundColor() {
        return this.barsBackgroundColor;
    }

    public final int getBarsProgressColor() {
        return this.barsProgressColor;
    }

    public final int getCurrentStory() {
        return this.currentStory;
    }

    public final float getCurrentStoryProgress() {
        return this.currentStoryProgress;
    }

    public final int getStoriesCount() {
        return this.storiesCount;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        WeakHashMap weakHashMap = b8k1.a;
        int paddingStart = getPaddingStart();
        Integer numValueOf = Integer.valueOf((getWidth() - getPaddingEnd()) - this.f);
        Integer numValueOf2 = Integer.valueOf(paddingStart);
        if (getLayoutDirection() != 1) {
            numValueOf = numValueOf2;
        }
        int iIntValue = numValueOf.intValue();
        Rect rect = this.i;
        rect.left = iIntValue;
        rect.top = getPaddingTop();
        rect.right = rect.left + this.f;
        rect.bottom = this.g;
        int i = this.storiesCount;
        int i2 = 0;
        while (i2 < i) {
            int i3 = this.currentStory;
            if (i2 < i3) {
                f = 1.0f;
            } else {
                f = i2 == i3 ? this.currentStoryProgress : 0.0f;
            }
            int i4 = this.barsBackgroundColor;
            Paint paint = this.t;
            paint.setColor(i4);
            canvas.drawRect(rect, paint);
            paint.setColor(this.barsProgressColor);
            float fWidth = rect.width() * f;
            float f2 = rect.left;
            Float fValueOf = Float.valueOf(rect.right - fWidth);
            Float fValueOf2 = Float.valueOf(f2);
            WeakHashMap weakHashMap2 = b8k1.a;
            if (getLayoutDirection() != 1) {
                fValueOf = fValueOf2;
            }
            float fFloatValue = fValueOf.floatValue();
            float f3 = rect.top;
            float f4 = rect.left + fWidth;
            Float fValueOf3 = Float.valueOf(rect.right);
            Float fValueOf4 = Float.valueOf(f4);
            if (getLayoutDirection() != 1) {
                fValueOf3 = fValueOf4;
            }
            Canvas canvas2 = canvas;
            canvas2.drawRect(fFloatValue, f3, fValueOf3.floatValue(), rect.bottom, paint);
            int i5 = this.f + this.h;
            Integer numValueOf3 = Integer.valueOf(-i5);
            Integer numValueOf4 = Integer.valueOf(i5);
            if (getLayoutDirection() != 1) {
                numValueOf3 = numValueOf4;
            }
            rect.offset(numValueOf3.intValue(), 0);
            i2++;
            canvas = canvas2;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        a(i, i2);
    }

    public final void setBarsBackgroundColor(int i) {
        this.barsBackgroundColor = i;
    }

    public final void setBarsProgressColor(int i) {
        this.barsProgressColor = i;
    }

    public final void setStoriesCount(int i) {
        this.storiesCount = i;
        a(getWidth(), getHeight());
        invalidate();
    }

    public StoriesProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StoriesProgressBar(Context context) {
        this(context, null, 0);
    }
}
