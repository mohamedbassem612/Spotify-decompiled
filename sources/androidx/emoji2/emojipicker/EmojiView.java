package androidx.emoji2.emojipicker;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.e0i;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR.\u0010\u0018\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/emoji2/emojipicker/EmojiView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "a", "Z", "getWillDrawVariantIndicator$emoji2_emojipicker_release", "()Z", "setWillDrawVariantIndicator$emoji2_emojipicker_release", "(Z)V", "willDrawVariantIndicator", "", "value", "d", "Ljava/lang/CharSequence;", "getEmoji", "()Ljava/lang/CharSequence;", "setEmoji", "(Ljava/lang/CharSequence;)V", "emoji", "emoji2-emojipicker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EmojiView extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean willDrawVariantIndicator;
    public final TextPaint b;
    public final Bitmap c;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public CharSequence emoji;

    public EmojiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(context.getDrawable(2131233845));
        setImportantForAccessibility(1);
        this.willDrawVariantIndicator = true;
        TextPaint textPaint = new TextPaint(3);
        textPaint.setTextSize(TypedValue.applyDimension(2, 30.0f, context.getResources().getDisplayMetrics()));
        this.b = textPaint;
        Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
        int i = fontMetricsInt.bottom - fontMetricsInt.top;
        this.c = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        canvas.save();
        float width = canvas.getWidth();
        Bitmap bitmap = this.c;
        canvas.scale(width / bitmap.getWidth(), canvas.getHeight() / bitmap.getHeight());
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    public final CharSequence getEmoji() {
        return this.emoji;
    }

    /* JADX INFO: renamed from: getWillDrawVariantIndicator$emoji2_emojipicker_release, reason: from getter */
    public final boolean getWillDrawVariantIndicator() {
        return this.willDrawVariantIndicator;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iMin = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2)) - getContext().getResources().getDimensionPixelSize(2131165700);
        setMeasuredDimension(iMin, iMin);
    }

    public final void setEmoji(CharSequence charSequence) {
        this.emoji = charSequence;
        post(new e0i((Object) charSequence, (Object) this, (byte) 25));
    }

    public final void setWillDrawVariantIndicator$emoji2_emojipicker_release(boolean z) {
        this.willDrawVariantIndicator = z;
    }

    public /* synthetic */ EmojiView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EmojiView(Context context) {
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }
}
