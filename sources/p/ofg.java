package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ofg extends x20 {
    public ofg(Context context) {
        super(context);
        setIconResource(2131232946);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setContentDescription(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getContext().getResources().getString(2131955539);
        }
        super/*android.view.View*/.setContentDescription(charSequence);
    }
}
