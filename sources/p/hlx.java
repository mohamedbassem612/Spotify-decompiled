package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hlx implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.readInt();
                return ilx.c;
            case 1:
                parcel.readInt();
                return jlx.c;
            case 2:
                parcel.readInt();
                return klx.c;
            case 3:
                parcel.readInt();
                return llx.c;
            case 4:
                parcel.readInt();
                return mlx.c;
            case 5:
                parcel.readInt();
                return nlx.c;
            case 6:
                parcel.readInt();
                return olx.c;
            case 7:
                parcel.readInt();
                return plx.c;
            case 8:
                parcel.readInt();
                return qlx.c;
            case 9:
                parcel.readInt();
                return rlx.c;
            case 10:
                parcel.readInt();
                return slx.c;
            case 11:
                parcel.readInt();
                return tlx.c;
            case 12:
                parcel.readInt();
                return ulx.c;
            case 13:
                parcel.readInt();
                return vlx.c;
            case 14:
                parcel.readInt();
                return wlx.c;
            case 15:
                parcel.readInt();
                return xlx.c;
            case 16:
                parcel.readInt();
                return ylx.c;
            case 17:
                parcel.readInt();
                return zlx.c;
            case 18:
                parcel.readInt();
                return amx.c;
            case 19:
                parcel.readInt();
                return bmx.c;
            case 20:
                parcel.readInt();
                return cmx.c;
            case 21:
                parcel.readInt();
                return dmx.c;
            case 22:
                parcel.readInt();
                return emx.c;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                parcel.readInt();
                return fmx.c;
            case 24:
                parcel.readInt();
                return gmx.c;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                parcel.readInt();
                return hmx.c;
            case 26:
                parcel.readInt();
                return imx.c;
            case 27:
                parcel.readInt();
                return jmx.c;
            case 28:
                parcel.readInt();
                return kmx.c;
            default:
                parcel.readInt();
                return lmx.c;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ilx[i];
            case 1:
                return new jlx[i];
            case 2:
                return new klx[i];
            case 3:
                return new llx[i];
            case 4:
                return new mlx[i];
            case 5:
                return new nlx[i];
            case 6:
                return new olx[i];
            case 7:
                return new plx[i];
            case 8:
                return new qlx[i];
            case 9:
                return new rlx[i];
            case 10:
                return new slx[i];
            case 11:
                return new tlx[i];
            case 12:
                return new ulx[i];
            case 13:
                return new vlx[i];
            case 14:
                return new wlx[i];
            case 15:
                return new xlx[i];
            case 16:
                return new ylx[i];
            case 17:
                return new zlx[i];
            case 18:
                return new amx[i];
            case 19:
                return new bmx[i];
            case 20:
                return new cmx[i];
            case 21:
                return new dmx[i];
            case 22:
                return new emx[i];
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new fmx[i];
            case 24:
                return new gmx[i];
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new hmx[i];
            case 26:
                return new imx[i];
            case 27:
                return new jmx[i];
            case 28:
                return new kmx[i];
            default:
                return new lmx[i];
        }
    }
}
