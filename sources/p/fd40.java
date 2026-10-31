package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fd40 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ fd40(byte b) {
        this.a = b;
    }

    /* JADX WARN: Code duplicated, block: B:97:0x01c7  */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int iH = 0;
        switch (this.a) {
            case 0:
                parcel.readInt();
                return gd40.a;
            case 1:
                parcel.readInt();
                return ke40.a;
            case 2:
                return new og40(nmu0.valueOf(parcel.readString()), (ResultReceiver) parcel.readParcelable(og40.class.getClassLoader()));
            case 3:
                return new ci40((lby) lby.CREATOR.createFromParcel(parcel));
            case 4:
                String string = parcel.readString();
                if (string != null) {
                    if (string.equals("UNKNOWN")) {
                        i = 1;
                    } else if (string.equals("DEFAULT")) {
                        i = 2;
                    } else if (string.equals("CONTENT")) {
                        i = 3;
                    } else {
                        hhg1.n("No enum constant com.spotify.search.searchview.Genre.GenreType.".concat(string));
                    }
                    return new ji40(i, parcel.readInt() != 0);
                }
                bhn0.i("Name is null");
                i = 0;
                return new ji40(i, parcel.readInt() != 0);
            case 5:
                String string2 = parcel.readString();
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                while (iH != i2) {
                    iH = x0d.h(ki40.class, parcel, arrayList, iH, 1);
                }
                return new ki40(string2, arrayList);
            case 6:
                return new mi40(ki40.CREATOR.createFromParcel(parcel), (ivd) ivd.CREATOR.createFromParcel(parcel));
            case 7:
                String string3 = parcel.readString();
                CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                String string4 = parcel.readString();
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                int iD = 0;
                while (iD != i3) {
                    iD = dsl0.d(gp51.CREATOR, parcel, arrayList2, iD, 1);
                }
                return new ij40(string3, charSequence, string4, arrayList2, parcel.readInt() != 0);
            case 8:
                return new jj40(parcel.readString(), parcel.readInt());
            case 9:
                return new rq40(parcel);
            case 10:
                return new i050((vsw0) parcel.readParcelable(i050.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : ata.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? aih1.CREATOR.createFromParcel(parcel) : null, parcel.readString());
            case 11:
                return new g150(i050.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (f150) parcel.readParcelable(g150.class.getClassLoader()), (a250) parcel.readParcelable(g150.class.getClassLoader()));
            case 12:
                parcel.readInt();
                return b150.a;
            case 13:
                parcel.readInt();
                return c150.a;
            case 14:
                parcel.readInt();
                return d150.a;
            case 15:
                parcel.readInt();
                return e150.a;
            case 16:
                parcel.readInt();
                return m150.INSTANCE;
            case 17:
                return new p150(parcel.readString(), parcel.readString());
            case 18:
                parcel.readInt();
                return r150.INSTANCE;
            case 19:
                return new u150(parcel.readInt() != 0, parcel.readString());
            case 20:
                parcel.readInt();
                return v150.INSTANCE;
            case 21:
                parcel.readInt();
                return w150.INSTANCE;
            case 22:
                parcel.readInt();
                return y150.a;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                parcel.readInt();
                return z150.a;
            case 24:
                return new b250(parcel.readString());
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                parcel.readInt();
                return c250.a;
            case 26:
                parcel.readInt();
                return d250.a;
            case 27:
                return new f250(parcel.readString(), (uuy0) parcel.readParcelable(f250.class.getClassLoader()));
            case 28:
                return new n450(parcel.readString(), parcel.readString());
            default:
                return new o450(parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new gd40[i];
            case 1:
                return new ke40[i];
            case 2:
                return new og40[i];
            case 3:
                return new ci40[i];
            case 4:
                return new ji40[i];
            case 5:
                return new ki40[i];
            case 6:
                return new mi40[i];
            case 7:
                return new ij40[i];
            case 8:
                return new jj40[i];
            case 9:
                return new rq40[i];
            case 10:
                return new i050[i];
            case 11:
                return new g150[i];
            case 12:
                return new b150[i];
            case 13:
                return new c150[i];
            case 14:
                return new d150[i];
            case 15:
                return new e150[i];
            case 16:
                return new m150[i];
            case 17:
                return new p150[i];
            case 18:
                return new r150[i];
            case 19:
                return new u150[i];
            case 20:
                return new v150[i];
            case 21:
                return new w150[i];
            case 22:
                return new y150[i];
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new z150[i];
            case 24:
                return new b250[i];
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new c250[i];
            case 26:
                return new d250[i];
            case 27:
                return new f250[i];
            case 28:
                return new n450[i];
            default:
                return new o450[i];
        }
    }
}
