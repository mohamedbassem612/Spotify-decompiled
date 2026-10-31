package p;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hch0<S> extends zvs0 {
    public int G1;
    public vwc H1;

    public final void F0(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.G1);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.H1);
    }

    public final void w0(Bundle bundle) {
        super.w0(bundle);
        if (bundle == null) {
            bundle = ((zf30) this).f;
        }
        this.G1 = bundle.getInt("THEME_RES_ID_KEY");
        this.H1 = (vwc) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(h0(), this.G1));
        throw null;
    }
}
