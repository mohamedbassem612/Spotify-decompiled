package p;

import android.os.Bundle;
import java.io.Serializable;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class z6r0 implements zxn0 {
    public final zia a = new zia();
    public y6r0 b;

    public static y6r0 a() {
        return new y6r0(UUID.randomUUID().toString());
    }

    public final y6r0 b() {
        return (y6r0) this.a.a.get();
    }

    @Override // p.zxn0
    public final void c(Bundle bundle) {
        if (this.b != null) {
            return;
        }
        Serializable serializable = bundle != null ? bundle.getSerializable("ubi.nav-logger.page-instance-id") : null;
        this.b = serializable instanceof y6r0 ? (y6r0) serializable : null;
    }

    @Override // p.zxn0
    public final void d(Bundle bundle) {
        y6r0 y6r0Var = this.b;
        if (y6r0Var != null) {
            bundle.putSerializable("ubi.nav-logger.page-instance-id", y6r0Var);
        }
    }

    public final void e(y6r0 y6r0Var) {
        zia ziaVar = this.a;
        if (y6r0Var.equals(ziaVar.a.get())) {
            return;
        }
        ziaVar.accept(y6r0Var);
    }
}
