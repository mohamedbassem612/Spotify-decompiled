package p;

import android.view.View;
import io.reactivex.rxjava3.functions.Cancellable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zak1 implements Cancellable {
    public final /* synthetic */ View a;
    public final /* synthetic */ zqi1 b;

    public zak1(View view, zqi1 zqi1Var) {
        this.a = view;
        this.b = zqi1Var;
    }

    public final void cancel() {
        this.a.getViewTreeObserver().removeOnWindowFocusChangeListener(this.b);
    }
}
