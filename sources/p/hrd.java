package p;

import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIconStyle;
import androidx.car.app.model.Shape;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hrd {
    public CarColor a;
    public final Shape b;

    public hrd(CarIconStyle carIconStyle) {
        Objects.requireNonNull(carIconStyle);
        this.a = carIconStyle.mTint;
        this.b = carIconStyle.mShape;
    }

    public final void a(CarColor carColor) {
        qpd qpdVar = qpd.b;
        Objects.requireNonNull(carColor);
        qpdVar.a(carColor);
        this.a = carColor;
    }
}
