package p;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class e7a0 {
    public final d7a0 a;
    public final g7a0 b;
    public boolean c;
    public final float d;

    public e7a0(Window window, d7a0 d7a0Var) {
        this.a = d7a0Var;
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView == null) {
            eg.m("window.peekDecorView() is null: JankStats can only be created with a Window that has a non-null DecorView");
            throw null;
        }
        iro1.m(viewPeekDecorView);
        int i = Build.VERSION.SDK_INT;
        g7a0 i7a0Var = i >= 31 ? new i7a0(this, viewPeekDecorView, window) : i >= 26 ? new h7a0(this, viewPeekDecorView, window) : new g7a0(this, viewPeekDecorView, window);
        this.b = i7a0Var;
        i7a0Var.e.getDecorView().post(new s38(true, i7a0Var));
        this.c = true;
        this.d = 2.0f;
    }
}
