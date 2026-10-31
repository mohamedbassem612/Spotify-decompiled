package com.spotify.campaigns.storyscenestemplates.summary;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.Metadata;
import p.b8k1;
import p.dzc1;
import p.ktd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0017\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/spotify/campaigns/storyscenestemplates/summary/SummaryView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/dzc1;", "data", "Lp/rih1;", "setUpAccessibility", "(Lp/dzc1;)V", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "setData", "getCardTranslationX$src_main_java_com_spotify_campaigns_storyscenestemplates_storyscenestemplates", "()I", "getCardTranslationX", "src_main_java_com_spotify_campaigns_storyscenestemplates-storyscenestemplates"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SummaryView extends View {
    public float a;
    public float b;
    public float c;
    public final View d;
    public final View e;

    /* JADX WARN: Multi-variable type inference failed */
    public SummaryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View viewInflate = LayoutInflater.from(context).inflate(2131626219, (ViewGroup) new FrameLayout(context), false);
        this.d = viewInflate;
        this.e = b8k1.n(viewInflate, 2131431147);
        TextView[] textViewArr = {b8k1.n(viewInflate, 2131431155), b8k1.n(viewInflate, 2131431157), b8k1.n(viewInflate, 2131431156), b8k1.n(viewInflate, 2131431154), b8k1.n(viewInflate, 2131431153)};
        TextView[] textViewArr2 = {b8k1.n(viewInflate, 2131431160), b8k1.n(viewInflate, 2131431162), b8k1.n(viewInflate, 2131431161), b8k1.n(viewInflate, 2131431159), b8k1.n(viewInflate, 2131431158)};
    }

    private final void setUpAccessibility(dzc1 data) {
        throw null;
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.widget.ImageView";
    }

    public final int getCardTranslationX$src_main_java_com_spotify_campaigns_storyscenestemplates_storyscenestemplates() {
        return (int) this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(this.b, this.c);
        float f = this.a;
        canvas.scale(f, f);
        this.d.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        float f = i;
        float f2 = i2;
        float fMin = Math.min(f / 540.0f, f2 / 960.0f);
        this.a = fMin;
        this.b = ktd.e(fMin, 540.0f, f, 2.0f);
        this.c = ktd.e(fMin, 960.0f, f2, 2.0f);
    }

    public final void setData(dzc1 data) {
        throw null;
    }

    public SummaryView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SummaryView(Context context) {
        this(context, null);
    }
}
