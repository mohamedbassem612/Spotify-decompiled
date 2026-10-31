package androidx.car.app.model;

import java.util.Objects;
import p.qrd;
import p.u7a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class BannerStyle {
    private final Background mBackground;
    private final Shape mShape;

    private BannerStyle() {
        this.mShape = null;
        this.mBackground = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerStyle)) {
            return false;
        }
        BannerStyle bannerStyle = (BannerStyle) obj;
        return Objects.equals(this.mShape, bannerStyle.mShape) && Objects.equals(this.mBackground, bannerStyle.mBackground);
    }

    public Background getBackground() {
        return this.mBackground;
    }

    public Shape getShape() {
        return this.mShape;
    }

    public int hashCode() {
        return Objects.hash(this.mShape, this.mBackground);
    }

    public String toString() {
        return "BannerStyle { shape: " + this.mShape + ", background: " + this.mBackground + " }";
    }

    private BannerStyle(u7a u7aVar) {
        throw null;
    }
}
