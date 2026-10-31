package androidx.car.app.model;

import java.util.Objects;
import p.hrd;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public class CarIconStyle {
    private final Shape mShape;
    private final CarColor mTint;
    public static final CarIconStyle TINTED = new CarIconStyle(CarColor.DEFAULT, (Shape) null);
    public static final CarIconStyle ORIGINAL = new CarIconStyle((CarColor) null, (Shape) null);

    private CarIconStyle(hrd hrdVar) {
        this.mTint = hrdVar.a;
        this.mShape = hrdVar.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarIconStyle)) {
            return false;
        }
        CarIconStyle carIconStyle = (CarIconStyle) obj;
        return Objects.equals(this.mTint, carIconStyle.mTint) && Objects.equals(this.mShape, carIconStyle.mShape);
    }

    public Shape getShape() {
        return this.mShape;
    }

    public CarColor getTint() {
        return this.mTint;
    }

    public int hashCode() {
        return Objects.hash(this.mTint, this.mShape);
    }

    public String toString() {
        return "CarIconStyle { tint: " + this.mTint + ", shape: " + this.mShape + " }";
    }

    public CarIconStyle(CarColor carColor, Shape shape) {
        this.mTint = carColor;
        this.mShape = shape;
    }

    public /* synthetic */ CarIconStyle(hrd hrdVar, int i) {
        this(hrdVar);
    }

    private CarIconStyle() {
        this.mShape = null;
        this.mTint = null;
    }
}
