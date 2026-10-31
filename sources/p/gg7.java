package p;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gg7 implements View.OnApplyWindowInsetsListener {
    public static final gg7 b = new gg7(0);
    public static final gg7 c = new gg7(1);
    public static final gg7 d = new gg7(2);
    public final /* synthetic */ byte a;

    public /* synthetic */ gg7(byte b2) {
        this.a = b2;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.a) {
            case 0:
                view.setPadding(0, 0, 0, jah.o(windowInsets.getInsets(WindowInsets.Type.ime())));
                break;
            case 1:
                view.setPadding(0, 0, 0, jah.o(windowInsets.getInsets(WindowInsets.Type.ime())));
                break;
            default:
                view.setPadding(0, 0, 0, jah.o(windowInsets.getInsets(WindowInsets.Type.ime())));
                break;
        }
        return windowInsets;
    }
}
