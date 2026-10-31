package androidx.car.app.model;

import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;
import p.grd;
import p.hrd;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class CarIcon {
    public static final int TYPE_ALERT = 4;
    public static final int TYPE_APP_ICON = 5;
    public static final int TYPE_BACK = 3;
    public static final int TYPE_COMPOSE_MESSAGE = 8;
    public static final int TYPE_CUSTOM = 1;
    public static final int TYPE_ERROR = 6;
    public static final int TYPE_MEDIA_PLAYBACK = 9;
    public static final int TYPE_PAN = 7;
    private static final int TYPE_RESOURCE = 2;
    private static final int TYPE_URI = 4;
    private final IconCompat mIcon;
    private final CarIconStyle mStyle;

    @Deprecated
    private final CarColor mTint;
    private final int mType;
    public static final CarIcon APP_ICON = forStandardType(5);
    public static final CarIcon BACK = forStandardType(3);
    public static final CarIcon ALERT = forStandardType(4);
    public static final CarIcon ERROR = forStandardType(6);
    public static final CarIcon PAN = forStandardType(7);
    public static final CarIcon COMPOSE_MESSAGE = forStandardType(8);
    public static final CarIcon MEDIA_PLAYBACK = forStandardType(9);

    public CarIcon(IconCompat iconCompat, CarColor carColor, int i) {
        this.mType = i;
        this.mIcon = iconCompat;
        this.mTint = carColor;
        if (carColor == null) {
            this.mStyle = null;
            return;
        }
        hrd hrdVar = new hrd(CarIconStyle.TINTED);
        hrdVar.a(carColor);
        this.mStyle = new CarIconStyle(hrdVar, 0);
    }

    public static CarIcon createOriginalIcon(IconCompat iconCompat) {
        return new CarIcon(new grd(iconCompat, CarIconStyle.ORIGINAL));
    }

    public static CarIcon createTintedIcon(IconCompat iconCompat, CarColor carColor) {
        Objects.requireNonNull(iconCompat);
        Objects.requireNonNull(carColor);
        hrd hrdVar = new hrd(CarIconStyle.TINTED);
        hrdVar.a(carColor);
        return new CarIcon(new grd(iconCompat, new CarIconStyle(hrdVar, 0)));
    }

    private static CarIcon forStandardType(int i) {
        return new CarIcon(null, CarColor.DEFAULT, i);
    }

    private boolean iconCompatEquals(IconCompat iconCompat) {
        int iJ;
        IconCompat iconCompat2 = this.mIcon;
        if (iconCompat2 == null) {
            return iconCompat == null;
        }
        if (iconCompat == null || (iJ = iconCompat2.j()) != iconCompat.j()) {
            return false;
        }
        if (iJ == 2) {
            return Objects.equals(this.mIcon.i(), iconCompat.i()) && this.mIcon.h() == iconCompat.h();
        }
        if (iJ == 4) {
            return Objects.equals(this.mIcon.k(), iconCompat.k());
        }
        return true;
    }

    private Object iconCompatHash() {
        IconCompat iconCompat = this.mIcon;
        if (iconCompat == null) {
            return null;
        }
        int iJ = iconCompat.j();
        if (iJ != 2) {
            return iJ == 4 ? this.mIcon.k() : Integer.valueOf(iJ);
        }
        return this.mIcon.i() + this.mIcon.h();
    }

    private static String typeToString(int i) {
        switch (i) {
            case 1:
                return "CUSTOM";
            case 2:
            default:
                return "<unknown>";
            case 3:
                return "BACK";
            case 4:
                return "ALERT";
            case 5:
                return "APP";
            case 6:
                return "ERROR";
            case 7:
                return "PAN";
            case 8:
                return "COMPOSE_MESSAGE";
            case 9:
                return "MEDIA_PLAYBACK";
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarIcon)) {
            return false;
        }
        CarIcon carIcon = (CarIcon) obj;
        return this.mType == carIcon.mType && Objects.equals(this.mTint, carIcon.mTint) && iconCompatEquals(carIcon.mIcon) && Objects.equals(this.mStyle, carIcon.mStyle);
    }

    public IconCompat getIcon() {
        return this.mIcon;
    }

    public CarIconStyle getStyle() {
        CarIconStyle carIconStyle = this.mStyle;
        if (carIconStyle != null) {
            return carIconStyle;
        }
        if (this.mTint == null) {
            return null;
        }
        hrd hrdVar = new hrd(CarIconStyle.TINTED);
        hrdVar.a(this.mTint);
        return new CarIconStyle(hrdVar, 0);
    }

    @Deprecated
    public CarColor getTint() {
        CarIconStyle carIconStyle = this.mStyle;
        return carIconStyle == null ? this.mTint : carIconStyle.getTint();
    }

    public int getType() {
        return this.mType;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mType), this.mTint, iconCompatHash(), this.mStyle);
    }

    public String toString() {
        return "[type: " + typeToString(this.mType) + ", tint: " + this.mTint + ", style: " + this.mStyle + "]";
    }

    public static CarIcon createTintedIcon(IconCompat iconCompat) {
        return new CarIcon(new grd(iconCompat, CarIconStyle.TINTED));
    }

    public CarIcon(grd grdVar) {
        grdVar.getClass();
        this.mType = 1;
        this.mIcon = grdVar.a;
        CarIconStyle carIconStyle = grdVar.b;
        this.mStyle = carIconStyle;
        if (carIconStyle != null) {
            this.mTint = carIconStyle.getTint();
        } else {
            this.mTint = null;
        }
    }

    private CarIcon() {
        this.mType = 1;
        this.mIcon = null;
        this.mTint = null;
        this.mStyle = null;
    }
}
