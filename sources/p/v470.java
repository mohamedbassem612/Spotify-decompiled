package p;

import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class v470 extends w5o0 {
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof u470) {
            super/*androidx.coordinatorlayout.widget.CoordinatorLayout*/.onRestoreInstanceState(((u470) parcelable).a);
        } else {
            super/*androidx.coordinatorlayout.widget.CoordinatorLayout*/.onRestoreInstanceState(parcelable);
        }
    }

    public final Parcelable onSaveInstanceState() {
        i3n i3nVar = (i3n) super/*androidx.coordinatorlayout.widget.CoordinatorLayout*/.onSaveInstanceState();
        u470 u470Var = new u470(AbsSavedState.EMPTY_STATE);
        u470Var.a = i3nVar;
        return u470Var;
    }
}
