package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yox implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.readInt();
                return zox.c;
            case 1:
                parcel.readInt();
                return apx.c;
            case 2:
                parcel.readInt();
                return bpx.c;
            case 3:
                parcel.readInt();
                return cpx.c;
            case 4:
                parcel.readInt();
                return dpx.c;
            case 5:
                parcel.readInt();
                return epx.c;
            case 6:
                parcel.readInt();
                return fpx.c;
            case 7:
                parcel.readInt();
                return gpx.c;
            case 8:
                parcel.readInt();
                return hpx.c;
            case 9:
                parcel.readInt();
                return ipx.c;
            case 10:
                parcel.readInt();
                return jpx.c;
            case 11:
                parcel.readInt();
                return kpx.c;
            case 12:
                parcel.readInt();
                return lpx.c;
            case 13:
                parcel.readInt();
                return mpx.c;
            case 14:
                parcel.readInt();
                return npx.c;
            case 15:
                parcel.readInt();
                return opx.c;
            case 16:
                parcel.readInt();
                return ppx.c;
            case 17:
                parcel.readInt();
                return qpx.c;
            case 18:
                parcel.readInt();
                return rpx.c;
            case 19:
                parcel.readInt();
                return spx.c;
            case 20:
                parcel.readInt();
                return tpx.c;
            case 21:
                parcel.readInt();
                return upx.c;
            case 22:
                parcel.readInt();
                return vpx.c;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                parcel.readInt();
                return wpx.c;
            case 24:
                parcel.readInt();
                return xpx.c;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                parcel.readInt();
                return ypx.c;
            case 26:
                parcel.readInt();
                return zpx.c;
            case 27:
                parcel.readInt();
                return aqx.c;
            case 28:
                parcel.readInt();
                return bqx.c;
            default:
                parcel.readInt();
                return cqx.c;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new zox[i];
            case 1:
                return new apx[i];
            case 2:
                return new bpx[i];
            case 3:
                return new cpx[i];
            case 4:
                return new dpx[i];
            case 5:
                return new epx[i];
            case 6:
                return new fpx[i];
            case 7:
                return new gpx[i];
            case 8:
                return new hpx[i];
            case 9:
                return new ipx[i];
            case 10:
                return new jpx[i];
            case 11:
                return new kpx[i];
            case 12:
                return new lpx[i];
            case 13:
                return new mpx[i];
            case 14:
                return new npx[i];
            case 15:
                return new opx[i];
            case 16:
                return new ppx[i];
            case 17:
                return new qpx[i];
            case 18:
                return new rpx[i];
            case 19:
                return new spx[i];
            case 20:
                return new tpx[i];
            case 21:
                return new upx[i];
            case 22:
                return new vpx[i];
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new wpx[i];
            case 24:
                return new xpx[i];
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new ypx[i];
            case 26:
                return new zpx[i];
            case 27:
                return new aqx[i];
            case 28:
                return new bqx[i];
            default:
                return new cqx[i];
        }
    }
}
