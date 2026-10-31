package p;

import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIconStyle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class grd {
    public final IconCompat a;
    public CarIconStyle b;

    public grd(IconCompat iconCompat, CarIconStyle carIconStyle) {
        yo31 yo31Var = yo31.e;
        Objects.requireNonNull(iconCompat);
        yo31Var.d(iconCompat);
        this.a = iconCompat;
        Objects.requireNonNull(carIconStyle);
        this.b = carIconStyle;
    }

    public final void a(CarColor carColor) {
        qpd.b.a(carColor);
        CarIconStyle carIconStyle = this.b;
        if (carIconStyle == null) {
            hrd hrdVar = new hrd(CarIconStyle.TINTED);
            hrdVar.a(carColor);
            this.b = new CarIconStyle(hrdVar, 0);
        } else {
            hrd hrdVar2 = new hrd(carIconStyle);
            hrdVar2.a(carColor);
            this.b = new CarIconStyle(hrdVar2, 0);
        }
    }

    public grd(IconCompat iconCompat) {
        yo31.e.d(iconCompat);
        this.a = iconCompat;
        this.b = null;
    }
}
