package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class upn implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 1;
        int iD = 0;
        switch (this.a) {
            case 0:
                return new vpn(parcel.createStringArrayList(), parcel.readInt() != 0);
            case 1:
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iD2 = 0;
                while (iD2 != i2) {
                    iD2 = dsl0.d(bqn.CREATOR, parcel, arrayList, iD2, 1);
                }
                return new zpn(z, z2, z3, arrayList, parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readParcelable(zpn.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            case 2:
                g3d0 parcelable = parcel.readParcelable(wpn.class.getClassLoader());
                int i3 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i3);
                while (iD != i3) {
                    linkedHashSet.add(parcel.readParcelable(wpn.class.getClassLoader()));
                    iD++;
                }
                return new wpn(linkedHashSet, parcelable);
            case 3:
                return new xpn(parcel.readString(), parcel.readParcelable(xpn.class.getClassLoader()));
            case 4:
                return new bqn(parcel.readString(), parcel.readString(), parcel.readString());
            case 5:
                return new eqn(parcel.readString(), parcel.readParcelable(eqn.class.getClassLoader()));
            case 6:
                return new pqn(parcel.readString());
            case 7:
                return new qqn(parcel.readString(), parcel.readString());
            case 8:
                return new nsn(parcel.readString(), parcel.readString());
            case 9:
                parcel.readInt();
                return cun.a;
            case 10:
                return new dun(parcel.readInt() != 0);
            case 11:
                return new eun(parcel.readInt());
            case 12:
                return new wwn(parcel.readString());
            case 13:
                return new xwn(parcel.readString());
            case 14:
                return new ywn(parcel.readString());
            case 15:
                int i4 = parcel.readInt();
                int i5 = parcel.readInt();
                int i6 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i6);
                int iD3 = 0;
                while (iD3 != i6) {
                    iD3 = dsl0.d(zw70.CREATOR, parcel, arrayList2, iD3, 1);
                }
                return new fxn(i4, i5, arrayList2, parcel.readString(), parcel.readString(), parcel.readString(), (v29) (parcel.readInt() == 0 ? null : v29.CREATOR.createFromParcel(parcel)), parcel.readInt() != 0, (ro6) (parcel.readInt() != 0 ? ro6.CREATOR.createFromParcel(parcel) : null));
            case 16:
                return new bzn(parcel.readString(), (td10) parcel.readParcelable(bzn.class.getClassLoader()), parcel.readInt() != 0);
            case 17:
                return new fzn(bzn.CREATOR.createFromParcel(parcel));
            case 18:
                return new gzn(bzn.CREATOR.createFromParcel(parcel), ozn.CREATOR.createFromParcel(parcel));
            case 19:
                int i7 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i7);
                while (iD != i7) {
                    iD = dsl0.d(bzn.CREATOR, parcel, arrayList3, iD, 1);
                }
                return new hzn(arrayList3, parcel.readInt(), parcel.readSerializable());
            case 20:
                int i8 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i8);
                while (iD != i8) {
                    iD = dsl0.d(bzn.CREATOR, parcel, arrayList4, iD, 1);
                }
                return new izn(arrayList4, parcel.readInt(), parcel.readSerializable());
            case 21:
                int i9 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i9);
                while (iD != i9) {
                    iD = dsl0.d(bzn.CREATOR, parcel, arrayList5, iD, 1);
                }
                return new jzn(arrayList5);
            case 22:
                parcel.readInt();
                return kzn.a;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new lzn(bzn.CREATOR.createFromParcel(parcel));
            case 24:
                return new mzn(bzn.CREATOR.createFromParcel(parcel));
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new ozn((td10) parcel.readParcelable(ozn.class.getClassLoader()));
            case 26:
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (string2 != null) {
                    if (!string2.equals("ARTIST")) {
                        if (string2.equals("AUTHOR")) {
                            i = 2;
                        } else {
                            hhg1.n("No enum constant com.spotify.creator.creatorpage.CreatorType.".concat(string2));
                        }
                    }
                    return new l1o(string, parcel.readString(), i, parcel.readString());
                }
                bhn0.i("Name is null");
                i = 0;
                return new l1o(string, parcel.readString(), i, parcel.readString());
            case 27:
                return new n5o(parcel.readString(), parcel.readString());
            case 28:
                return new c7o(parcel.readString(), parcel.readString(), parcel.readString());
            default:
                return new f9o(parcel.readInt(), parcel.readParcelable(f9o.class.getClassLoader()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new vpn[i];
            case 1:
                return new zpn[i];
            case 2:
                return new wpn[i];
            case 3:
                return new xpn[i];
            case 4:
                return new bqn[i];
            case 5:
                return new eqn[i];
            case 6:
                return new pqn[i];
            case 7:
                return new qqn[i];
            case 8:
                return new nsn[i];
            case 9:
                return new cun[i];
            case 10:
                return new dun[i];
            case 11:
                return new eun[i];
            case 12:
                return new wwn[i];
            case 13:
                return new xwn[i];
            case 14:
                return new ywn[i];
            case 15:
                return new fxn[i];
            case 16:
                return new bzn[i];
            case 17:
                return new fzn[i];
            case 18:
                return new gzn[i];
            case 19:
                return new hzn[i];
            case 20:
                return new izn[i];
            case 21:
                return new jzn[i];
            case 22:
                return new kzn[i];
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new lzn[i];
            case 24:
                return new mzn[i];
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new ozn[i];
            case 26:
                return new l1o[i];
            case 27:
                return new n5o[i];
            case 28:
                return new c7o[i];
            default:
                return new f9o[i];
        }
    }
}
