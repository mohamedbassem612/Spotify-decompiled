package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class psx implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.readInt();
                return qsx.c;
            case 1:
                parcel.readInt();
                return rsx.c;
            case 2:
                parcel.readInt();
                return ssx.c;
            case 3:
                parcel.readInt();
                return tsx.c;
            case 4:
                parcel.readInt();
                return usx.c;
            case 5:
                parcel.readInt();
                return vsx.c;
            case 6:
                parcel.readInt();
                return wsx.c;
            case 7:
                parcel.readInt();
                return xsx.c;
            case 8:
                parcel.readInt();
                return ysx.c;
            case 9:
                parcel.readInt();
                return zsx.c;
            case 10:
                parcel.readInt();
                return atx.c;
            case 11:
                parcel.readInt();
                return btx.c;
            case 12:
                parcel.readInt();
                return ctx.c;
            case 13:
                parcel.readInt();
                return dtx.c;
            case 14:
                parcel.readInt();
                return etx.c;
            case 15:
                parcel.readInt();
                return ftx.c;
            case 16:
                parcel.readInt();
                return gtx.c;
            case 17:
                parcel.readInt();
                return htx.c;
            case 18:
                parcel.readInt();
                return itx.c;
            case 19:
                parcel.readInt();
                return jtx.c;
            case 20:
                parcel.readInt();
                return ktx.c;
            case 21:
                parcel.readInt();
                return ltx.c;
            case 22:
                parcel.readInt();
                return mtx.c;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                parcel.readInt();
                return ntx.c;
            case 24:
                parcel.readInt();
                return otx.c;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                parcel.readInt();
                return ptx.c;
            case 26:
                parcel.readInt();
                return qtx.c;
            case 27:
                parcel.readInt();
                return rtx.c;
            case 28:
                parcel.readInt();
                return stx.c;
            default:
                parcel.readInt();
                return ttx.c;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new qsx[i];
            case 1:
                return new rsx[i];
            case 2:
                return new ssx[i];
            case 3:
                return new tsx[i];
            case 4:
                return new usx[i];
            case 5:
                return new vsx[i];
            case 6:
                return new wsx[i];
            case 7:
                return new xsx[i];
            case 8:
                return new ysx[i];
            case 9:
                return new zsx[i];
            case 10:
                return new atx[i];
            case 11:
                return new btx[i];
            case 12:
                return new ctx[i];
            case 13:
                return new dtx[i];
            case 14:
                return new etx[i];
            case 15:
                return new ftx[i];
            case 16:
                return new gtx[i];
            case 17:
                return new htx[i];
            case 18:
                return new itx[i];
            case 19:
                return new jtx[i];
            case 20:
                return new ktx[i];
            case 21:
                return new ltx[i];
            case 22:
                return new mtx[i];
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new ntx[i];
            case 24:
                return new otx[i];
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new ptx[i];
            case 26:
                return new qtx[i];
            case 27:
                return new rtx[i];
            case 28:
                return new stx[i];
            default:
                return new ttx[i];
        }
    }
}
