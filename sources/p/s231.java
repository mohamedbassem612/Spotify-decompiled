package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ResultReceiver;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s231 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ s231(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iD = 0;
        switch (this.a) {
            case 0:
                return new t231(parcel.readString());
            case 1:
                return new y231(parcel.readParcelable(y231.class.getClassLoader()));
            case 2:
                return new ResultReceiver(parcel);
            case 3:
                return new v531(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 4:
                return new w531(parcel.readString(), parcel.readString(), parcel.createByteArray(), parcel.readString());
            case 5:
                parcel.readInt();
                return p931.a;
            case 6:
                boolean z = true;
                String string = parcel.readString();
                tv80 parcelable = parcel.readParcelable(q931.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    z = false;
                }
                return new q931(string, parcelable, z);
            case 7:
                return new r931(parcel.readInt() != 0);
            case 8:
                boolean z2 = true;
                String string2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                return new s931(string2, z2);
            case 9:
                parcel.readInt();
                return t931.a;
            case 10:
                parcel.readInt();
                return u931.a;
            case 11:
                return new ea31(parcel.readString(), parcel.readString(), parcel.readParcelable(ea31.class.getClassLoader()));
            case 12:
                parcel.readInt();
                return fa31.a;
            case 13:
                parcel.readInt();
                return ga31.a;
            case 14:
                parcel.readInt();
                return ia31.a;
            case 15:
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                while (iD != i) {
                    iD = dsl0.d(z5c1.CREATOR, parcel, arrayList, iD, 1);
                }
                return new ja31(arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (ff) (parcel.readInt() == 0 ? null : ff.CREATOR.createFromParcel(parcel)), (ff) (parcel.readInt() == 0 ? null : ff.CREATOR.createFromParcel(parcel)), (ff) (parcel.readInt() != 0 ? ff.CREATOR.createFromParcel(parcel) : null));
            case 16:
                return new bd31(parcel.readString());
            case 17:
                return new lg31(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
            case 18:
                int i2 = 1;
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                int i5 = 0;
                long j = parcel.readLong();
                String string5 = parcel.readString();
                if (string5 == null) {
                    bhn0.i("Name is null");
                } else if (string5.equals("UNSPECIFIED")) {
                    i5 = i2;
                } else {
                    if (string5.equals("CAMERA")) {
                        i2 = 2;
                    } else if (string5.equals("LIBRARY")) {
                        i2 = 3;
                    } else {
                        hhg1.n("No enum constant com.spotify.campfire.models.RichMediaMetadata.UploadSource.".concat(string5));
                    }
                    i5 = i2;
                }
                return new mg31(string3, string4, i3, i4, j, i5, parcel.readLong());
            case 19:
                return new mh31(parcel.readString());
            case 20:
                return new ei31(parcel.readString());
            case 21:
                return new qm31(parcel.readString(), parcel.readInt() != 0);
            case 22:
                parcel.readInt();
                return qn31.a;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new dp31(parcel.readParcelable(dp31.class.getClassLoader()), (gp5) gp5.CREATOR.createFromParcel(parcel));
            case 24:
                return new xp31(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), (pbf0) pbf0.CREATOR.createFromParcel(parcel));
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                vp31 parcelable2 = parcel.readParcelable(rq31.class.getClassLoader());
                int i6 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i6);
                int iH = 0;
                while (iH != i6) {
                    iH = x0d.h(rq31.class, parcel, arrayList2, iH, 1);
                }
                return new rq31(parcelable2, arrayList2, parcel.readParcelable(rq31.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 26:
                return new sq31(parcel.readParcelable(sq31.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readInt() != 0);
            case 27:
                return new tq31(parcel.readParcelable(tq31.class.getClassLoader()));
            case 28:
                int i7 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i7);
                while (iD != i7) {
                    iD = dsl0.d(om21.CREATOR, parcel, arrayList3, iD, 1);
                }
                return new yq31(arrayList3);
            default:
                return new ww31(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new t231[i];
            case 1:
                return new y231[i];
            case 2:
                return new ResultReceiver[i];
            case 3:
                return new v531[i];
            case 4:
                return new w531[i];
            case 5:
                return new p931[i];
            case 6:
                return new q931[i];
            case 7:
                return new r931[i];
            case 8:
                return new s931[i];
            case 9:
                return new t931[i];
            case 10:
                return new u931[i];
            case 11:
                return new ea31[i];
            case 12:
                return new fa31[i];
            case 13:
                return new ga31[i];
            case 14:
                return new ia31[i];
            case 15:
                return new ja31[i];
            case 16:
                return new bd31[i];
            case 17:
                return new lg31[i];
            case 18:
                return new mg31[i];
            case 19:
                return new mh31[i];
            case 20:
                return new ei31[i];
            case 21:
                return new qm31[i];
            case 22:
                return new qn31[i];
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new dp31[i];
            case 24:
                return new xp31[i];
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new rq31[i];
            case 26:
                return new sq31[i];
            case 27:
                return new tq31[i];
            case 28:
                return new yq31[i];
            default:
                return new ww31[i];
        }
    }
}
