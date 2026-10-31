package p;

import android.view.View;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rkn0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;

    public /* synthetic */ rkn0(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        View view = this.b;
        switch (b) {
            case 0:
                mmr0 mmr0Var = (mmr0) obj;
                view.setBackgroundColor(((Boolean) mmr0Var.b).booleanValue() ? ((Integer) mmr0Var.a).intValue() : 0);
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Logger.g("Changing loading visibility -> " + zBooleanValue, new Object[0]);
                view.setVisibility(zBooleanValue ? 0 : 8);
                break;
        }
    }
}
