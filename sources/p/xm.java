package p;

import android.content.Intent;
import android.view.View;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xm extends m8c0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ xm(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public void b(int i, int i2, Intent intent) {
        switch (this.a) {
            case 0:
                if (i == 5436 && i2 == -1) {
                    kt91 kt91Var = (kt91) this.b;
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131961394});
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                    kt91Var.o(new er91((fs91) null, "", 2131961394, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                    ((ber) this.c).a();
                    break;
                }
                break;
        }
    }

    public void e() {
        switch (this.a) {
            case 1:
                ((Disposable) ((kp00) this.b).c).dispose();
                ((t3b1) this.c).u(this);
                break;
        }
    }
}
