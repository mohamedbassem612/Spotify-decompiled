package androidx.car.app.navigation.model;

import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.Toggle;
import java.util.Objects;
import p.gnr0;
import p.iyn0;
import p.jyn0;
import p.qrd;
import p.sxd1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class NavigationTemplate implements sxd1 {
    private final ActionStrip mActionStrip;
    private final CarColor mBackgroundColor;
    private final TravelEstimate mDestinationTravelEstimate;
    private final ActionStrip mMapActionStrip;
    private final jyn0 mNavigationInfo;
    private final gnr0 mPanModeDelegate;
    private final Toggle mPanModeToggle;

    private NavigationTemplate() {
        this.mNavigationInfo = null;
        this.mBackgroundColor = null;
        this.mDestinationTravelEstimate = null;
        this.mActionStrip = null;
        this.mMapActionStrip = null;
        this.mPanModeToggle = null;
        this.mPanModeDelegate = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavigationTemplate)) {
            return false;
        }
        NavigationTemplate navigationTemplate = (NavigationTemplate) obj;
        if (Objects.equals(this.mNavigationInfo, navigationTemplate.mNavigationInfo) && Objects.equals(this.mBackgroundColor, navigationTemplate.mBackgroundColor) && Objects.equals(this.mDestinationTravelEstimate, navigationTemplate.mDestinationTravelEstimate) && Objects.equals(this.mActionStrip, navigationTemplate.mActionStrip) && Objects.equals(this.mMapActionStrip, navigationTemplate.mMapActionStrip) && Objects.equals(this.mPanModeToggle, navigationTemplate.mPanModeToggle)) {
            if (Boolean.valueOf(this.mPanModeDelegate == null).equals(Boolean.valueOf(navigationTemplate.mPanModeDelegate == null))) {
                return true;
            }
        }
        return false;
    }

    public ActionStrip getActionStrip() {
        ActionStrip actionStrip = this.mActionStrip;
        Objects.requireNonNull(actionStrip);
        return actionStrip;
    }

    public CarColor getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public TravelEstimate getDestinationTravelEstimate() {
        return this.mDestinationTravelEstimate;
    }

    public ActionStrip getMapActionStrip() {
        return this.mMapActionStrip;
    }

    public jyn0 getNavigationInfo() {
        return this.mNavigationInfo;
    }

    public gnr0 getPanModeDelegate() {
        return this.mPanModeDelegate;
    }

    @Deprecated
    public Toggle getPanModeToggle() {
        return this.mPanModeToggle;
    }

    public int hashCode() {
        return Objects.hash(this.mNavigationInfo, this.mBackgroundColor, this.mDestinationTravelEstimate, this.mActionStrip, this.mMapActionStrip, this.mPanModeToggle, Boolean.valueOf(this.mPanModeDelegate == null));
    }

    public String toString() {
        return "NavigationTemplate";
    }

    public NavigationTemplate(iyn0 iyn0Var) {
        throw null;
    }
}
