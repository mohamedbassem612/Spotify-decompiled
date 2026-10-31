package p;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class va4 {
    public static final va4 a = new va4();

    public static PointerIcon b(Context context, fav0 fav0Var) {
        return fav0Var instanceof ky4 ? PointerIcon.getSystemIcon(context, ((ky4) fav0Var).b) : PointerIcon.getSystemIcon(context, 1000);
    }

    public final void a(View view, fav0 fav0Var) {
        PointerIcon pointerIconB = b(view.getContext(), fav0Var);
        if (u890.j(view.getPointerIcon(), pointerIconB)) {
            return;
        }
        view.setPointerIcon(pointerIconB);
    }
}
