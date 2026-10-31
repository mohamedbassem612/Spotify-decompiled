package p;

import android.graphics.drawable.Drawable;
import android.view.textclassifier.TextClassification;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s3e1 extends e3e1 {
    public final TextClassification b;
    public final int c;
    public final Drawable d;

    public s3e1(Object obj, TextClassification textClassification, int i, Drawable drawable) {
        super(obj);
        this.b = textClassification;
        this.c = i;
        this.d = drawable;
    }

    public final String toString() {
        return "TextContextMenuTextClassificationItem(key=" + this.a + ", textClassification=" + this.b + ", index=" + this.c + ", icon=" + this.d + ")";
    }
}
