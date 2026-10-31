package androidx.car.app.navigation.model;

import androidx.car.app.model.ActionStrip;
import java.util.Objects;
import p.gnr0;
import p.kmg0;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class MapController {
    private final ActionStrip mMapActionStrip;
    private final gnr0 mPanModeDelegate;

    private MapController() {
        this.mPanModeDelegate = null;
        this.mMapActionStrip = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapController)) {
            return false;
        }
        MapController mapController = (MapController) obj;
        return Boolean.valueOf(this.mPanModeDelegate == null).equals(Boolean.valueOf(mapController.mPanModeDelegate == null)) && Objects.equals(this.mMapActionStrip, mapController.mMapActionStrip);
    }

    public ActionStrip getMapActionStrip() {
        return this.mMapActionStrip;
    }

    public gnr0 getPanModeDelegate() {
        return this.mPanModeDelegate;
    }

    public int hashCode() {
        return Objects.hash(this.mPanModeDelegate, this.mMapActionStrip);
    }

    public MapController(kmg0 kmg0Var) {
        throw null;
    }
}
