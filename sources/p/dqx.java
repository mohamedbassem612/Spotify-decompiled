package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dqx implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.readInt();
                return eqx.c;
            case 1:
                parcel.readInt();
                return fqx.c;
            case 2:
                parcel.readInt();
                return gqx.c;
            case 3:
                parcel.readInt();
                return hqx.c;
            case 4:
                parcel.readInt();
                return iqx.c;
            case 5:
                parcel.readInt();
                return jqx.c;
            case 6:
                parcel.readInt();
                return kqx.c;
            case 7:
                parcel.readInt();
                return lqx.c;
            case 8:
                parcel.readInt();
                return mqx.c;
            case 9:
                parcel.readInt();
                return nqx.c;
            case 10:
                parcel.readInt();
                return oqx.c;
            case 11:
                parcel.readInt();
                return pqx.c;
            case 12:
                parcel.readInt();
                return qqx.c;
            case 13:
                parcel.readInt();
                return rqx.c;
            case 14:
                parcel.readInt();
                return sqx.c;
            case 15:
                parcel.readInt();
                return tqx.c;
            case 16:
                parcel.readInt();
                return uqx.c;
            case 17:
                parcel.readInt();
                return vqx.c;
            case 18:
                parcel.readInt();
                return wqx.c;
            case 19:
                parcel.readInt();
                return xqx.c;
            case 20:
                parcel.readInt();
                return yqx.c;
            case 21:
                parcel.readInt();
                return zqx.c;
            case 22:
                parcel.readInt();
                return arx.c;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                parcel.readInt();
                return brx.c;
            case 24:
                parcel.readInt();
                return crx.c;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                parcel.readInt();
                return drx.c;
            case 26:
                parcel.readInt();
                return erx.c;
            case 27:
                parcel.readInt();
                return frx.c;
            case 28:
                parcel.readInt();
                return grx.c;
            default:
                parcel.readInt();
                return irx.c;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new eqx[i];
            case 1:
                return new fqx[i];
            case 2:
                return new gqx[i];
            case 3:
                return new hqx[i];
            case 4:
                return new iqx[i];
            case 5:
                return new jqx[i];
            case 6:
                return new kqx[i];
            case 7:
                return new lqx[i];
            case 8:
                return new mqx[i];
            case 9:
                return new nqx[i];
            case 10:
                return new oqx[i];
            case 11:
                return new pqx[i];
            case 12:
                return new qqx[i];
            case 13:
                return new rqx[i];
            case 14:
                return new sqx[i];
            case 15:
                return new tqx[i];
            case 16:
                return new uqx[i];
            case 17:
                return new vqx[i];
            case 18:
                return new wqx[i];
            case 19:
                return new xqx[i];
            case 20:
                return new yqx[i];
            case 21:
                return new zqx[i];
            case 22:
                return new arx[i];
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new brx[i];
            case 24:
                return new crx[i];
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new drx[i];
            case 26:
                return new erx[i];
            case 27:
                return new frx[i];
            case 28:
                return new grx[i];
            default:
                return new irx[i];
        }
    }
}
