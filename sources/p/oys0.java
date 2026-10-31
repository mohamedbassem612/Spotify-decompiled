package p;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oys0 extends uaa implements tlv {
    /* JADX WARN: Multi-variable type inference failed */
    public oys0(Context context, int i) {
        super(context, (AttributeSet) null, 0, 2131232308);
        setContentDescription(getResources().getString(2131959735));
        setAdjustViewBounds(true);
        setImageTintList(x74.E(context, 2131102486));
        setIconActive(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(boolean z) {
        setVisibility(z ? 0 : 8);
    }

    public final /* bridge */ /* synthetic */ void f(Object obj) {
        c(((Boolean) obj).booleanValue());
    }
}
