package p;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vma1 extends f611 {
    public final int a;
    public final int b;
    public final int c;

    public vma1(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    @Override // p.f611
    public final void e(Rect rect, View view, RecyclerView recyclerView, s611 s611Var) {
        boolean z;
        int i = this.c;
        if (i != 0) {
            Object tag = view.getTag(i);
            if (u890.j(tag instanceof Boolean ? (Boolean) tag : null, Boolean.TRUE)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        int i2 = this.a;
        rect.left = z ? 0 : i2;
        rect.right = z ? 0 : i2;
        int i3 = this.b;
        rect.top = i3;
        rect.bottom = i3;
    }
}
