package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uk70 extends rf {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;

    public uk70(View view, int i) {
        this.a = view;
        this.b = i;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, kg kgVar) {
        super.onInitializeAccessibilityNodeInfo(view, kgVar);
        kgVar.b(new fg(16, this.a.getContext().getString(this.b)));
        kgVar.l("android.widget.Button");
    }
}
