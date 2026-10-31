package p;

import android.view.textclassifier.TextClassifier;
import androidx.appcompat.widget.AppCompatEditText;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dk5 {
    public final /* synthetic */ AppCompatEditText a;

    public dk5(AppCompatEditText appCompatEditText) {
        this.a = appCompatEditText;
    }

    public final TextClassifier a() {
        return AppCompatEditText.a(this.a);
    }

    public final void b(TextClassifier textClassifier) {
        AppCompatEditText.b(this.a, textClassifier);
    }
}
