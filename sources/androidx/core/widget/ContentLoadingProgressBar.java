package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.widget.ContentLoadingProgressBar;
import p.xxl;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class ContentLoadingProgressBar extends ProgressBar {
    public static final /* synthetic */ int c = 0;
    public final xxl a;
    public final xxl b;

    /* JADX WARN: Type inference failed for: r2v1, types: [p.xxl] */
    /* JADX WARN: Type inference failed for: r2v2, types: [p.xxl] */
    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        final byte b = 0;
        this.a = new Runnable(this) { // from class: p.xxl
            public final /* synthetic */ ContentLoadingProgressBar b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                ContentLoadingProgressBar contentLoadingProgressBar = this.b;
                switch (b2) {
                    case 0:
                        int i = ContentLoadingProgressBar.c;
                        contentLoadingProgressBar.setVisibility(8);
                        break;
                    default:
                        int i2 = ContentLoadingProgressBar.c;
                        System.currentTimeMillis();
                        contentLoadingProgressBar.setVisibility(0);
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.b = new Runnable(this) { // from class: p.xxl
            public final /* synthetic */ ContentLoadingProgressBar b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b2;
                ContentLoadingProgressBar contentLoadingProgressBar = this.b;
                switch (b3) {
                    case 0:
                        int i = ContentLoadingProgressBar.c;
                        contentLoadingProgressBar.setVisibility(8);
                        break;
                    default:
                        int i2 = ContentLoadingProgressBar.c;
                        System.currentTimeMillis();
                        contentLoadingProgressBar.setVisibility(0);
                        break;
                }
            }
        };
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.a);
        removeCallbacks(this.b);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.a);
        removeCallbacks(this.b);
    }

    public ContentLoadingProgressBar(Context context) {
        this(context, null);
    }
}
