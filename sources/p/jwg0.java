package p;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jwg0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ Context a;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ImageView d;
    public final /* synthetic */ View e;

    public jwg0(Context context, View view, View view2, ImageView imageView, View view3) {
        this.a = context;
        this.b = view;
        this.c = view2;
        this.d = imageView;
        this.e = view3;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Context context = this.a;
        if (context.getResources().getConfiguration().orientation != 1) {
            return;
        }
        int iU = jch0.U(context.getResources().getDisplayMetrics().density * 24.0f);
        int top = this.b.getTop();
        int bottom = i4 - this.c.getBottom();
        int iMax = Math.max(top < iU ? Math.abs(iU - top) : 0, bottom < iU ? Math.abs(iU - bottom) : 0);
        ImageView imageView = this.d;
        qhl qhlVar = (qhl) imageView.getLayoutParams();
        qhlVar.setMarginStart(qhlVar.getMarginStart() + iMax);
        qhlVar.setMarginEnd(qhlVar.getMarginEnd() + iMax);
        imageView.setLayoutParams(qhlVar);
        this.e.removeOnLayoutChangeListener(this);
    }
}
