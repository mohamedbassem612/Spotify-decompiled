package p;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wck1 {
    public final View a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;

    public wck1(View view) {
        this.a = view;
    }

    public final void a() {
        int iMax = this.d;
        if (this.g) {
            iMax = Math.max(this.e, Math.min(this.f, iMax));
        }
        View view = this.a;
        int top = iMax - (view.getTop() - this.b);
        WeakHashMap weakHashMap = b8k1.a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.c));
    }
}
