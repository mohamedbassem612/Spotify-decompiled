package p;

import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b2f1 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ MenuItem b;
    public final /* synthetic */ c2f1 c;

    public /* synthetic */ b2f1(c2f1 c2f1Var, MenuItem menuItem, byte b) {
        this.a = b;
        this.c = c2f1Var;
        this.b = menuItem;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        MenuItem menuItem = this.b;
        c2f1 c2f1Var = this.c;
        switch (b) {
            case 0:
                c2f1Var.b.performIdentifierAction(menuItem.getItemId(), 0);
                break;
            default:
                c2f1Var.b.performIdentifierAction(menuItem.getItemId(), 0);
                break;
        }
    }
}
