package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class snx implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.readInt();
                return tnx.c;
            case 1:
                parcel.readInt();
                return unx.c;
            case 2:
                parcel.readInt();
                return vnx.c;
            case 3:
                parcel.readInt();
                return wnx.c;
            case 4:
                parcel.readInt();
                return xnx.c;
            case 5:
                parcel.readInt();
                return ynx.c;
            case 6:
                parcel.readInt();
                return znx.c;
            case 7:
                parcel.readInt();
                return aox.c;
            case 8:
                parcel.readInt();
                return box.c;
            case 9:
                parcel.readInt();
                return cox.c;
            case 10:
                parcel.readInt();
                return dox.c;
            case 11:
                parcel.readInt();
                return eox.c;
            case 12:
                parcel.readInt();
                return gox.c;
            case 13:
                parcel.readInt();
                return hox.c;
            case 14:
                parcel.readInt();
                return iox.c;
            case 15:
                parcel.readInt();
                return jox.c;
            case 16:
                parcel.readInt();
                return kox.c;
            case 17:
                parcel.readInt();
                return lox.c;
            case 18:
                parcel.readInt();
                return mox.c;
            case 19:
                parcel.readInt();
                return nox.c;
            case 20:
                parcel.readInt();
                return oox.c;
            case 21:
                parcel.readInt();
                return pox.c;
            case 22:
                parcel.readInt();
                return qox.c;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                parcel.readInt();
                return rox.c;
            case 24:
                parcel.readInt();
                return sox.c;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                parcel.readInt();
                return tox.c;
            case 26:
                parcel.readInt();
                return uox.c;
            case 27:
                parcel.readInt();
                return vox.c;
            case 28:
                parcel.readInt();
                return wox.c;
            default:
                parcel.readInt();
                return xox.c;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new tnx[i];
            case 1:
                return new unx[i];
            case 2:
                return new vnx[i];
            case 3:
                return new wnx[i];
            case 4:
                return new xnx[i];
            case 5:
                return new ynx[i];
            case 6:
                return new znx[i];
            case 7:
                return new aox[i];
            case 8:
                return new box[i];
            case 9:
                return new cox[i];
            case 10:
                return new dox[i];
            case 11:
                return new eox[i];
            case 12:
                return new gox[i];
            case 13:
                return new hox[i];
            case 14:
                return new iox[i];
            case 15:
                return new jox[i];
            case 16:
                return new kox[i];
            case 17:
                return new lox[i];
            case 18:
                return new mox[i];
            case 19:
                return new nox[i];
            case 20:
                return new oox[i];
            case 21:
                return new pox[i];
            case 22:
                return new qox[i];
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new rox[i];
            case 24:
                return new sox[i];
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new tox[i];
            case 26:
                return new uox[i];
            case 27:
                return new vox[i];
            case 28:
                return new wox[i];
            default:
                return new xox[i];
        }
    }
}
