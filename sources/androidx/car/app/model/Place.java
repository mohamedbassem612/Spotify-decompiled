package androidx.car.app.model;

import java.util.Objects;
import p.l5t0;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class Place {
    private final CarLocation mLocation;
    private final PlaceMarker mMarker;

    private Place() {
        this.mLocation = null;
        this.mMarker = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Place)) {
            return false;
        }
        Place place = (Place) obj;
        return Objects.equals(this.mLocation, place.mLocation) && Objects.equals(this.mMarker, place.mMarker);
    }

    public CarLocation getLocation() {
        CarLocation carLocation = this.mLocation;
        Objects.requireNonNull(carLocation);
        return carLocation;
    }

    public PlaceMarker getMarker() {
        return this.mMarker;
    }

    public int hashCode() {
        return Objects.hash(this.mLocation, this.mMarker);
    }

    public String toString() {
        return "[ location: " + this.mLocation + ", marker: " + this.mMarker + "]";
    }

    public Place(l5t0 l5t0Var) {
        throw null;
    }
}
