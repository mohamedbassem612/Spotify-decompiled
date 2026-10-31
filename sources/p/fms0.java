package p;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fms0 implements anc0, mqb1 {
    public final Intent a;
    public final kt91 b;
    public boolean c;

    public fms0(Intent intent, kt91 kt91Var) {
        this.a = intent;
        this.b = kt91Var;
    }

    public final void d(int i) {
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i)});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        this.b.k(new er91((fs91) null, "", Integer.valueOf(i), (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
    }

    @Override // p.mqb1
    public final void e(Bundle bundle) {
        this.c = bundle != null ? bundle.getBoolean("permission_snackbar_has_triggered") : false;
    }

    @Override // p.mqb1
    public final void f(Bundle bundle) {
        bundle.putBoolean("permission_snackbar_has_triggered", this.c);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // p.anc0
    public final void n() {
        ty30 ty30Var;
        if (this.c) {
            return;
        }
        Bundle extras = this.a.getExtras();
        ty30 ty30Var2 = ty30.a;
        if (extras != null) {
            extras.setClassLoader(ty30.class.getClassLoader());
            ty30Var = (ty30) jhc1.t(extras, "list-entity-music-gained-permissions", ty30.class);
            if (ty30Var == null) {
                ty30Var = ty30Var2;
            }
        } else {
            ty30Var = ty30Var2;
        }
        if (ty30Var != ty30Var2) {
            this.c = true;
            int iOrdinal = ty30Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    d(2131959979);
                } else if (iOrdinal == 2) {
                    d(2131959978);
                } else {
                    eg.o();
                }
            }
        }
    }
}
