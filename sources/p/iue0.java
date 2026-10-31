package p;

import androidx.car.app.k;
import androidx.car.app.model.CarIcon;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class iue0 extends ap41 {
    public final tvc g;
    public svc h;

    public iue0(k kVar, qzn0 qzn0Var, tvc tvcVar, i8h1 i8h1Var, t64 t64Var) {
        super(kVar);
        this.g = tvcVar;
        this.h = svc.a;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-carapplibrary-logged-out";
        x6h1VarI.f = "1.0.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.a();
        Collections.singletonList("signup");
        fn31.T(cto1.q(this), (o8n) null, 0, new hue0(this, qzn0Var, (lnm) null), 3);
        fn31.T(cto1.q(this), (o8n) null, 0, new vse0(this, (lnm) null, (byte) 1), 3);
    }

    public final sxd1 d() {
        if (!(this.h instanceof svc)) {
            eg.o();
            return null;
        }
        c6j0 c6j0Var = new c6j0(((ap41) this).a.getString(2131957669));
        CarIcon carIcon = CarIcon.APP_ICON;
        yo31 yo31Var = yo31.f;
        Objects.requireNonNull(carIcon);
        yo31Var.j(carIcon);
        c6j0Var.e = carIcon;
        return c6j0Var.a();
    }
}
