package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x7w implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.readInt();
                return y7w.a;
            case 1:
                parcel.readInt();
                return z7w.a;
            case 2:
                parcel.readInt();
                return a8w.a;
            case 3:
                return new s8w(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readParcelable(s8w.class.getClassLoader()));
            case 4:
                return new t8w(parcel.readInt(), parcel.readParcelable(t8w.class.getClassLoader()));
            case 5:
                return new nxw(parcel.readParcelable(nxw.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 6:
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(rxw.valueOf(parcel.readString()));
                }
                return new qxw(string, arrayList, parcel.readInt() != 0);
            case 7:
                parcel.readInt();
                return byw.a;
            case 8:
                return new cyw(parcel.readString(), parcel.readInt());
            case 9:
                return new dyw(parcel.readString());
            case 10:
                return new eyw(parcel.readString());
            case 11:
                return new fyw(parcel.readString(), parcel.readString());
            case 12:
                return new gyw(parcel.readString());
            case 13:
                return new a6x(parcel.readString(), parcel.readString(), (oxc) (parcel.readInt() != 0 ? oxc.CREATOR.createFromParcel(parcel) : null));
            case 14:
                parcel.readInt();
                return n6x.a;
            case 15:
                return new gax(parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
            case 16:
                parcel.readInt();
                return njx.c;
            case 17:
                parcel.readInt();
                return ojx.c;
            case 18:
                parcel.readInt();
                return pjx.c;
            case 19:
                parcel.readInt();
                return qjx.c;
            case 20:
                parcel.readInt();
                return sjx.c;
            case 21:
                parcel.readInt();
                return tjx.c;
            case 22:
                parcel.readInt();
                return ujx.c;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                parcel.readInt();
                return vjx.c;
            case 24:
                parcel.readInt();
                return wjx.c;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                parcel.readInt();
                return xjx.c;
            case 26:
                parcel.readInt();
                return yjx.c;
            case 27:
                parcel.readInt();
                return zjx.c;
            case 28:
                parcel.readInt();
                return akx.c;
            default:
                parcel.readInt();
                return bkx.c;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new y7w[i];
            case 1:
                return new z7w[i];
            case 2:
                return new a8w[i];
            case 3:
                return new s8w[i];
            case 4:
                return new t8w[i];
            case 5:
                return new nxw[i];
            case 6:
                return new qxw[i];
            case 7:
                return new byw[i];
            case 8:
                return new cyw[i];
            case 9:
                return new dyw[i];
            case 10:
                return new eyw[i];
            case 11:
                return new fyw[i];
            case 12:
                return new gyw[i];
            case 13:
                return new a6x[i];
            case 14:
                return new n6x[i];
            case 15:
                return new gax[i];
            case 16:
                return new njx[i];
            case 17:
                return new ojx[i];
            case 18:
                return new pjx[i];
            case 19:
                return new qjx[i];
            case 20:
                return new sjx[i];
            case 21:
                return new tjx[i];
            case 22:
                return new ujx[i];
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new vjx[i];
            case 24:
                return new wjx[i];
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new xjx[i];
            case 26:
                return new yjx[i];
            case 27:
                return new zjx[i];
            case 28:
                return new akx[i];
            default:
                return new bkx[i];
        }
    }
}
