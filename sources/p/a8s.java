package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a8s extends rf {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    public /* synthetic */ a8s(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, kg kgVar) {
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, kgVar);
                kgVar.l(str);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, kgVar);
                kgVar.b(new fg(16, str));
                break;
        }
    }
}
