package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mmx implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.readInt();
                return nmx.c;
            case 1:
                parcel.readInt();
                return omx.c;
            case 2:
                parcel.readInt();
                return pmx.c;
            case 3:
                parcel.readInt();
                return qmx.c;
            case 4:
                parcel.readInt();
                return rmx.c;
            case 5:
                parcel.readInt();
                return tmx.c;
            case 6:
                parcel.readInt();
                return umx.c;
            case 7:
                parcel.readInt();
                return vmx.c;
            case 8:
                parcel.readInt();
                return wmx.c;
            case 9:
                parcel.readInt();
                return xmx.c;
            case 10:
                parcel.readInt();
                return ymx.c;
            case 11:
                parcel.readInt();
                return zmx.c;
            case 12:
                parcel.readInt();
                return anx.c;
            case 13:
                parcel.readInt();
                return bnx.c;
            case 14:
                parcel.readInt();
                return cnx.c;
            case 15:
                parcel.readInt();
                return dnx.c;
            case 16:
                parcel.readInt();
                return enx.c;
            case 17:
                parcel.readInt();
                return fnx.c;
            case 18:
                parcel.readInt();
                return gnx.c;
            case 19:
                parcel.readInt();
                return hnx.c;
            case 20:
                parcel.readInt();
                return inx.c;
            case 21:
                parcel.readInt();
                return jnx.c;
            case 22:
                parcel.readInt();
                return knx.c;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                parcel.readInt();
                return lnx.c;
            case 24:
                parcel.readInt();
                return mnx.c;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                parcel.readInt();
                return nnx.c;
            case 26:
                parcel.readInt();
                return onx.c;
            case 27:
                parcel.readInt();
                return pnx.c;
            case 28:
                parcel.readInt();
                return qnx.c;
            default:
                parcel.readInt();
                return rnx.c;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new nmx[i];
            case 1:
                return new omx[i];
            case 2:
                return new pmx[i];
            case 3:
                return new qmx[i];
            case 4:
                return new rmx[i];
            case 5:
                return new tmx[i];
            case 6:
                return new umx[i];
            case 7:
                return new vmx[i];
            case 8:
                return new wmx[i];
            case 9:
                return new xmx[i];
            case 10:
                return new ymx[i];
            case 11:
                return new zmx[i];
            case 12:
                return new anx[i];
            case 13:
                return new bnx[i];
            case 14:
                return new cnx[i];
            case 15:
                return new dnx[i];
            case 16:
                return new enx[i];
            case 17:
                return new fnx[i];
            case 18:
                return new gnx[i];
            case 19:
                return new hnx[i];
            case 20:
                return new inx[i];
            case 21:
                return new jnx[i];
            case 22:
                return new knx[i];
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new lnx[i];
            case 24:
                return new mnx[i];
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new nnx[i];
            case 26:
                return new onx[i];
            case 27:
                return new pnx[i];
            case 28:
                return new qnx[i];
            default:
                return new rnx[i];
        }
    }
}
