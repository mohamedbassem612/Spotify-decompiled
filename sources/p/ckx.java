package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ckx implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.readInt();
                return dkx.c;
            case 1:
                parcel.readInt();
                return ekx.c;
            case 2:
                parcel.readInt();
                return fkx.c;
            case 3:
                parcel.readInt();
                return gkx.c;
            case 4:
                parcel.readInt();
                return hkx.c;
            case 5:
                parcel.readInt();
                return ikx.c;
            case 6:
                parcel.readInt();
                return jkx.c;
            case 7:
                parcel.readInt();
                return kkx.c;
            case 8:
                parcel.readInt();
                return lkx.c;
            case 9:
                parcel.readInt();
                return mkx.c;
            case 10:
                parcel.readInt();
                return nkx.c;
            case 11:
                parcel.readInt();
                return okx.c;
            case 12:
                parcel.readInt();
                return pkx.c;
            case 13:
                parcel.readInt();
                return qkx.c;
            case 14:
                parcel.readInt();
                return rkx.c;
            case 15:
                parcel.readInt();
                return skx.c;
            case 16:
                parcel.readInt();
                return tkx.c;
            case 17:
                parcel.readInt();
                return ukx.c;
            case 18:
                parcel.readInt();
                return vkx.c;
            case 19:
                parcel.readInt();
                return wkx.c;
            case 20:
                parcel.readInt();
                return xkx.c;
            case 21:
                parcel.readInt();
                return ykx.c;
            case 22:
                parcel.readInt();
                return zkx.c;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                parcel.readInt();
                return alx.c;
            case 24:
                parcel.readInt();
                return blx.c;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                parcel.readInt();
                return clx.c;
            case 26:
                parcel.readInt();
                return dlx.c;
            case 27:
                parcel.readInt();
                return elx.c;
            case 28:
                parcel.readInt();
                return flx.c;
            default:
                parcel.readInt();
                return glx.c;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new dkx[i];
            case 1:
                return new ekx[i];
            case 2:
                return new fkx[i];
            case 3:
                return new gkx[i];
            case 4:
                return new hkx[i];
            case 5:
                return new ikx[i];
            case 6:
                return new jkx[i];
            case 7:
                return new kkx[i];
            case 8:
                return new lkx[i];
            case 9:
                return new mkx[i];
            case 10:
                return new nkx[i];
            case 11:
                return new okx[i];
            case 12:
                return new pkx[i];
            case 13:
                return new qkx[i];
            case 14:
                return new rkx[i];
            case 15:
                return new skx[i];
            case 16:
                return new tkx[i];
            case 17:
                return new ukx[i];
            case 18:
                return new vkx[i];
            case 19:
                return new wkx[i];
            case 20:
                return new xkx[i];
            case 21:
                return new ykx[i];
            case 22:
                return new zkx[i];
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new alx[i];
            case 24:
                return new blx[i];
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new clx[i];
            case 26:
                return new dlx[i];
            case 27:
                return new elx[i];
            case 28:
                return new flx[i];
            default:
                return new glx[i];
        }
    }
}
