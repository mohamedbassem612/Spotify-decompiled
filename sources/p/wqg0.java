package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wqg0 extends x20 {
    public wqg0(Context context) {
        super(context);
        setIconResource(2131231563);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setContentDescription(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getContext().getResources().getString(2131955541);
        }
        super/*android.view.View*/.setContentDescription(charSequence);
    }
}
