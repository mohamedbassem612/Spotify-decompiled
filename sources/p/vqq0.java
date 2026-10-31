package p;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vqq0 extends dyb0 {
    @Override // p.dyb0
    public final int d(View view) {
        g611 layoutParams = view.getLayoutParams();
        ((a) this.b).getClass();
        return a.L(view) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    @Override // p.dyb0
    public final int e(View view) {
        g611 layoutParams = view.getLayoutParams();
        ((a) this.b).getClass();
        return a.N(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    @Override // p.dyb0
    public final int f(View view) {
        g611 layoutParams = view.getLayoutParams();
        return ((a) this.b).O(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    @Override // p.dyb0
    public final int g(View view) {
        g611 layoutParams = view.getLayoutParams();
        ((a) this.b).getClass();
        return a.Q(view) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
    }

    @Override // p.dyb0
    public final int h() {
        return ((a) this.b).P0;
    }

    @Override // p.dyb0
    public final int i() {
        a aVar = (a) this.b;
        return aVar.P0 - aVar.getPaddingBottom();
    }

    @Override // p.dyb0
    public final int j() {
        return ((a) this.b).getPaddingBottom();
    }

    @Override // p.dyb0
    public final int k() {
        return ((a) this.b).N0;
    }

    @Override // p.dyb0
    public final int l() {
        return ((a) this.b).Z;
    }

    @Override // p.dyb0
    public final int m() {
        return ((a) this.b).getPaddingTop();
    }

    @Override // p.dyb0
    public final int n() {
        a aVar = (a) this.b;
        return (aVar.P0 - aVar.getPaddingTop()) - aVar.getPaddingBottom();
    }

    @Override // p.dyb0
    public final int p(View view) {
        a aVar = (a) this.b;
        Rect rect = (Rect) this.c;
        aVar.Y(rect, view);
        return rect.bottom;
    }

    @Override // p.dyb0
    public final int q(View view) {
        a aVar = (a) this.b;
        Rect rect = (Rect) this.c;
        aVar.Y(rect, view);
        return rect.top;
    }

    @Override // p.dyb0
    public final void r(int i) {
        ((a) this.b).e0(i);
    }
}
