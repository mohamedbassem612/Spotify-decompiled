package androidx.car.app.model;

import java.util.Objects;
import p.esk;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class CondensedItemStyle {
    private final Background mBackground;
    private final Shape mShape;

    private CondensedItemStyle(esk eskVar) {
        this.mShape = eskVar.a;
        this.mBackground = eskVar.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CondensedItemStyle)) {
            return false;
        }
        CondensedItemStyle condensedItemStyle = (CondensedItemStyle) obj;
        return Objects.equals(this.mShape, condensedItemStyle.mShape) && Objects.equals(this.mBackground, condensedItemStyle.mBackground);
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
        return "CondensedItemStyle { shape: " + this.mShape + ", background: " + this.mBackground + " }";
    }

    public /* synthetic */ CondensedItemStyle(esk eskVar, int i) {
        this(eskVar);
    }

    private CondensedItemStyle() {
        this.mShape = null;
        this.mBackground = null;
    }
}
