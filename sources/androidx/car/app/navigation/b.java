package androidx.car.app.navigation;

import androidx.car.app.k;
import androidx.car.app.l;
import p.tac0;
import p.vth0;
import p.whg0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b implements whg0 {
    public final INavigationManager.Stub a;

    public b(k kVar, l lVar, tac0 tac0Var) {
        this.a = new NavigationManager$1(this, tac0Var);
        tac0Var.a(new vth0(this, tac0Var));
    }
}
