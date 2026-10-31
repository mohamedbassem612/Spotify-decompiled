package p;

import android.text.TextPaint;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class i0s {
    public static final ThreadLocal b = new ThreadLocal();
    public final TextPaint a;

    public i0s() {
        TextPaint textPaint = new TextPaint();
        this.a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
