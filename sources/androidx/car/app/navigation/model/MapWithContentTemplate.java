package androidx.car.app.navigation.model;

import androidx.car.app.model.ActionStrip;
import java.util.Objects;
import p.qrd;
import p.rpg0;
import p.spg0;
import p.sxd1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class MapWithContentTemplate implements sxd1 {
    private final ActionStrip mActionStrip;
    private final sxd1 mContentTemplate;
    private final MapController mMapController;

    private MapWithContentTemplate() {
        this.mMapController = null;
        this.mContentTemplate = new rpg0();
        this.mActionStrip = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapWithContentTemplate)) {
            return false;
        }
        MapWithContentTemplate mapWithContentTemplate = (MapWithContentTemplate) obj;
        return Objects.equals(this.mContentTemplate, mapWithContentTemplate.mContentTemplate) && Objects.equals(this.mMapController, mapWithContentTemplate.mMapController) && Objects.equals(this.mActionStrip, mapWithContentTemplate.mActionStrip);
    }

    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public sxd1 getContentTemplate() {
        return this.mContentTemplate;
    }

    public MapController getMapController() {
        return this.mMapController;
    }

    public int hashCode() {
        return Objects.hash(this.mMapController, this.mContentTemplate, this.mActionStrip);
    }

    public MapWithContentTemplate(spg0 spg0Var) {
        throw null;
    }
}
