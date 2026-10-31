package androidx.car.app.model;

import java.util.Objects;
import p.qpd;
import p.qrd;
import p.vv9;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class Background {
    public static final Background TRANSPARENT;
    private final CarColor mColor;
    private final CarIcon mImage;

    static {
        vv9 vv9Var = new vv9();
        CarColor carColorCreateCustom = CarColor.createCustom(0, 0);
        qpd.b.a(carColorCreateCustom);
        vv9Var.a = carColorCreateCustom;
        TRANSPARENT = new Background(vv9Var);
    }

    public Background(vv9 vv9Var) {
        this.mColor = vv9Var.a;
        this.mImage = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Background)) {
            return false;
        }
        Background background = (Background) obj;
        return Objects.equals(this.mImage, background.mImage) && Objects.equals(this.mColor, background.mColor);
    }

    public CarColor getColor() {
        return this.mColor;
    }

    public CarIcon getImage() {
        return this.mImage;
    }

    public int hashCode() {
        return Objects.hashCode(this.mImage);
    }

    public String toString() {
        return "Background [image: " + this.mImage + ", color: " + this.mColor + "]";
    }

    private Background() {
        this.mColor = null;
        this.mImage = null;
    }
}
