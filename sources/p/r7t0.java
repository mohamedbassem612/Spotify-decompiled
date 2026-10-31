package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r7t0 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 1;
        switch (this.a) {
            case 0:
                return new s7t0(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 1:
                boolean z = false;
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                return new p8t0(string, string2, z);
            case 2:
                x8t0 parcelable = parcel.readParcelable(y8t0.class.getClassLoader());
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                boolean z2 = true;
                String string5 = parcel.readString();
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                return new y8t0(string3, string4, string5, parcelable, z2);
            case 3:
                return new r8t0(parcel.readString());
            case 4:
                return new t8t0(parcel.readString());
            case 5:
                parcel.readInt();
                return u8t0.a;
            case 6:
                return new v8t0(parcel.readInt() != 0);
            case 7:
                parcel.readInt();
                return w8t0.a;
            case 8:
                return new pbt0(parcel.readString(), parcel.readInt() != 0);
            case 9:
                parcel.readInt();
                return ect0.a;
            case 10:
                return new fct0(parcel.readString());
            case 11:
                return new bet0(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 12:
                return new cet0(parcel.readInt() != 0, (egt0) parcel.readParcelable(cet0.class.getClassLoader()), parcel.readString());
            case 13:
                return new qft0(parcel.readInt() != 0, parcel.readInt() != 0);
            case 14:
                return new rft0(parcel.readInt() != 0);
            case 15:
                parcel.readInt();
                return sft0.a;
            case 16:
                String string6 = parcel.readString();
                if (string6 != null) {
                    if (!string6.equals("LOCKED")) {
                        if (string6.equals("PLAYING")) {
                            i = 2;
                        } else if (string6.equals("PAUSED")) {
                            i = 3;
                        } else if (string6.equals("LOADING")) {
                            i = 4;
                        } else {
                            hhg1.n("No enum constant com.spotify.encoreconsumermobile.elements.playbutton.PlayButtonStyle.Entity.PlayButtonState.".concat(string6));
                        }
                    }
                    return new tft0(i);
                }
                bhn0.i("Name is null");
                i = 0;
                return new tft0(i);
            case 17:
                return new uft0(parcel.readInt() != 0);
            case 18:
                return new vft0(parcel.readInt() != 0);
            case 19:
                parcel.readInt();
                return new wft0();
            case 20:
                parcel.readInt();
                return new xft0();
            case 21:
                parcel.readInt();
                return yft0.a;
            case 22:
                return new zft0(parcel.readInt() != 0, parcel.readInt() != 0);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new agt0(parcel.readInt() != 0);
            case 24:
                parcel.readInt();
                return bgt0.a;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new cgt0(parcel.readInt() != 0);
            case 26:
                return new dgt0(parcel.readInt() != 0);
            case 27:
                int iH = 0;
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                int i2 = parcel.readInt();
                int i3 = parcel.readInt();
                pbf0 parcelable2 = parcel.readParcelable(bot0.class.getClassLoader());
                int i4 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i4);
                int iH2 = 0;
                while (iH2 != i4) {
                    iH2 = x0d.h(bot0.class, parcel, arrayList, iH2, 1);
                }
                vrt0 parcelable3 = parcel.readParcelable(bot0.class.getClassLoader());
                lhz0 parcelable4 = parcel.readParcelable(bot0.class.getClassLoader());
                int i5 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i5);
                while (iH != i5) {
                    iH = x0d.h(bot0.class, parcel, arrayList2, iH, 1);
                }
                return new bot0(string7, string8, i2, i3, parcelable2, arrayList, parcelable3, parcelable4, arrayList2);
            case 28:
                return qpt0.valueOf(parcel.readString());
            default:
                return new art0(parcel.readParcelable(art0.class.getClassLoader()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new s7t0[i];
            case 1:
                return new p8t0[i];
            case 2:
                return new y8t0[i];
            case 3:
                return new r8t0[i];
            case 4:
                return new t8t0[i];
            case 5:
                return new u8t0[i];
            case 6:
                return new v8t0[i];
            case 7:
                return new w8t0[i];
            case 8:
                return new pbt0[i];
            case 9:
                return new ect0[i];
            case 10:
                return new fct0[i];
            case 11:
                return new bet0[i];
            case 12:
                return new cet0[i];
            case 13:
                return new qft0[i];
            case 14:
                return new rft0[i];
            case 15:
                return new sft0[i];
            case 16:
                return new tft0[i];
            case 17:
                return new uft0[i];
            case 18:
                return new vft0[i];
            case 19:
                return new wft0[i];
            case 20:
                return new xft0[i];
            case 21:
                return new yft0[i];
            case 22:
                return new zft0[i];
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new agt0[i];
            case 24:
                return new bgt0[i];
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new cgt0[i];
            case 26:
                return new dgt0[i];
            case 27:
                return new bot0[i];
            case 28:
                return new qpt0[i];
            default:
                return new art0[i];
        }
    }
}
