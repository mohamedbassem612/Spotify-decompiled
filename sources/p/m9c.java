package p;

import android.widget.FrameLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m9c implements i6l1 {
    public final /* synthetic */ byte a;
    public final c460 b;

    public /* synthetic */ m9c(c460 c460Var, byte b) {
        this.a = b;
        this.b = c460Var;
    }

    @Override // p.i6l1
    public final void a(Object obj, FrameLayout frameLayout) {
        byte b = this.a;
        c460 c460Var = this.b;
        switch (b) {
            case 0:
                x360 x360Var = (x360) obj;
                if (x360Var != null) {
                    frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), frameLayout.getContext().getResources().getDimensionPixelSize(2131167023));
                } else {
                    frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), 0);
                }
                c460Var.a(x360Var, frameLayout);
                break;
            default:
                x360 x360Var2 = (x360) obj;
                if (x360Var2 != null) {
                    frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getContext().getResources().getDimensionPixelSize(2131167033), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
                } else {
                    frameLayout.setPadding(frameLayout.getPaddingLeft(), 0, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
                }
                c460Var.a(x360Var2, frameLayout);
                break;
        }
    }
}
