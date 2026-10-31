package p;

import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class dl5 extends kr60 {
    public final /* synthetic */ AppCompatTextView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl5(AppCompatTextView appCompatTextView) {
        super(appCompatTextView, (byte) 19);
        this.c = appCompatTextView;
    }

    public final void a(int i) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i);
    }

    public final void c(int i) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i);
    }
}
