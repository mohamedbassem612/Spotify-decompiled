package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jrx implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.readInt();
                return krx.c;
            case 1:
                parcel.readInt();
                return lrx.c;
            case 2:
                parcel.readInt();
                return mrx.c;
            case 3:
                parcel.readInt();
                return nrx.c;
            case 4:
                parcel.readInt();
                return orx.c;
            case 5:
                parcel.readInt();
                return prx.c;
            case 6:
                parcel.readInt();
                return qrx.c;
            case 7:
                parcel.readInt();
                return rrx.c;
            case 8:
                parcel.readInt();
                return srx.c;
            case 9:
                parcel.readInt();
                return trx.c;
            case 10:
                parcel.readInt();
                return urx.c;
            case 11:
                parcel.readInt();
                return vrx.c;
            case 12:
                parcel.readInt();
                return wrx.c;
            case 13:
                parcel.readInt();
                return xrx.c;
            case 14:
                parcel.readInt();
                return yrx.c;
            case 15:
                parcel.readInt();
                return zrx.c;
            case 16:
                parcel.readInt();
                return asx.c;
            case 17:
                parcel.readInt();
                return bsx.c;
            case 18:
                parcel.readInt();
                return csx.c;
            case 19:
                parcel.readInt();
                return esx.c;
            case 20:
                parcel.readInt();
                return fsx.c;
            case 21:
                parcel.readInt();
                return gsx.c;
            case 22:
                parcel.readInt();
                return hsx.c;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                parcel.readInt();
                return jsx.c;
            case 24:
                parcel.readInt();
                return isx.c;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                parcel.readInt();
                return lsx.c;
            case 26:
                parcel.readInt();
                return ksx.c;
            case 27:
                parcel.readInt();
                return msx.c;
            case 28:
                parcel.readInt();
                return nsx.c;
            default:
                parcel.readInt();
                return osx.c;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new krx[i];
            case 1:
                return new lrx[i];
            case 2:
                return new mrx[i];
            case 3:
                return new nrx[i];
            case 4:
                return new orx[i];
            case 5:
                return new prx[i];
            case 6:
                return new qrx[i];
            case 7:
                return new rrx[i];
            case 8:
                return new srx[i];
            case 9:
                return new trx[i];
            case 10:
                return new urx[i];
            case 11:
                return new vrx[i];
            case 12:
                return new wrx[i];
            case 13:
                return new xrx[i];
            case 14:
                return new yrx[i];
            case 15:
                return new zrx[i];
            case 16:
                return new asx[i];
            case 17:
                return new bsx[i];
            case 18:
                return new csx[i];
            case 19:
                return new esx[i];
            case 20:
                return new fsx[i];
            case 21:
                return new gsx[i];
            case 22:
                return new hsx[i];
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new jsx[i];
            case 24:
                return new isx[i];
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new lsx[i];
            case 26:
                return new ksx[i];
            case 27:
                return new msx[i];
            case 28:
                return new nsx[i];
            default:
                return new osx[i];
        }
    }
}
