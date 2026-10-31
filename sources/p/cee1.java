package p;

import android.text.Spannable;
import android.text.SpannableString;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cee1 extends Spannable.Factory {
    @Override // android.text.Spannable.Factory
    public final Spannable newSpannable(CharSequence charSequence) {
        return charSequence instanceof String ? new SpannableString(charSequence) : (Spannable) charSequence;
    }
}
