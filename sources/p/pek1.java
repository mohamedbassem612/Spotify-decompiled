package p;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pek1 extends rek1 {
    public boolean a = false;
    public int b = 0;
    public final /* synthetic */ bz60 c;

    public pek1(bz60 bz60Var) {
        this.c = bz60Var;
    }

    public final void d(View view) {
        int i = this.b + 1;
        this.b = i;
        bz60 bz60Var = this.c;
        if (i == ((ArrayList) bz60Var.c).size()) {
            qek1 qek1Var = (qek1) bz60Var.e;
            if (qek1Var != null) {
                qek1Var.d((View) null);
            }
            this.b = 0;
            this.a = false;
            bz60Var.b = false;
        }
    }

    @Override // p.rek1
    public final void e() {
        if (this.a) {
            return;
        }
        this.a = true;
        qek1 qek1Var = (qek1) this.c.e;
        if (qek1Var != null) {
            qek1Var.e();
        }
    }
}
