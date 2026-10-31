package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tqs implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View.OnClickListener b;
    public final /* synthetic */ yq91 c;

    public /* synthetic */ tqs(yq91 yq91Var, View.OnClickListener onClickListener, byte b) {
        this.a = b;
        this.c = yq91Var;
        this.b = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        yq91 yq91Var = this.c;
        View.OnClickListener onClickListener = this.b;
        switch (b) {
            case 0:
                yq91Var.b(3);
                onClickListener.onClick(view);
                break;
            default:
                onClickListener.onClick(view);
                yq91Var.b(1);
                break;
        }
    }
}
