package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.checkout.proto.model.v1.proto.SpotifyCheckoutNative;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zzx0 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ zzx0(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        gyh gyhVarValueOf = null;
        int i = 1;
        int iD = 0;
        switch (this.a) {
            case 0:
                return new a0y0(parcel.readString(), parcel.readString());
            case 1:
                return new b0y0(parcel.readString(), parcel.createStringArrayList(), parcel.readString());
            case 2:
                return new k0y0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            case 3:
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                while (iD != i2) {
                    iD = dsl0.d(y2y0.CREATOR, parcel, arrayList, iD, 1);
                }
                return new x2y0(arrayList, parcel.readString());
            case 4:
                return new y2y0(parcel.readString(), parcel.readString());
            case 5:
                return new p4y0(parcel.createStringArrayList());
            case 6:
                return new f7y0(parcel.readString(), parcel.readString(), parcel.readString(), g7y0.valueOf(parcel.readString()));
            case 7:
                parcel.readInt();
                return lay0.a;
            case 8:
                int iH = 0;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                while (iH != i3) {
                    iH = x0d.h(may0.class, parcel, arrayList2, iH, 1);
                }
                return new may0(string, arrayList2, string2, string3);
            case 9:
                parcel.readInt();
                return nay0.a;
            case 10:
                return new qay0(parcel.readString(), parcel.readParcelable(qay0.class.getClassLoader()), parcel.readParcelable(qay0.class.getClassLoader()), 8);
            case 11:
                return new ray0(parcel.readString());
            case 12:
                return new jby0(lf51.r(parcel.readString()), parcel.readParcelable(jby0.class.getClassLoader()), parcel.readParcelable(jby0.class.getClassLoader()), (wkt) null);
            case 13:
                int iH2 = 0;
                int iR = lf51.r(parcel.readString());
                z771 parcelable = parcel.readParcelable(kby0.class.getClassLoader());
                wa71 parcelable2 = parcel.readParcelable(kby0.class.getClassLoader());
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                llw0 parcelable3 = parcel.readParcelable(kby0.class.getClassLoader());
                int i4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i4);
                while (iH2 != i4) {
                    iH2 = x0d.h(kby0.class, parcel, arrayList3, iH2, 1);
                }
                return new kby0(iR, parcelable, parcelable2, null, string4, string5, string6, parcelable3, arrayList3, parcel.readInt());
            case 14:
                return new lby0(lf51.r(parcel.readString()), parcel.readParcelable(lby0.class.getClassLoader()), parcel.readParcelable(lby0.class.getClassLoader()), (wkt) null);
            case 15:
                parcel.readInt();
                return new nby0();
            case 16:
                int iD2 = 0;
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                int i5 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i5);
                while (iD2 != i5) {
                    iD2 = dsl0.d(xu21.CREATOR, parcel, arrayList4, iD2, 1);
                }
                return new ocy0(string7, string8, arrayListCreateStringArrayList, arrayList4);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new pcy0(parcel.readString(), parcel.readString(), parcel.readString());
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new qcy0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0, parcel.readInt() != 0);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new rcy0(parcel.readString(), parcel.readString());
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new scy0(parcel.readString());
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                parcel.readInt();
                return ply0.a;
            case 22:
                return new qly0(parcel.readParcelable(qly0.class.getClassLoader()));
            case 23:
                return new rly0(SpotifyCheckoutNative.G(parcel.createByteArray()));
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new sly0(parcel.readString());
            case 25:
                if (parcel.readInt() != 0) {
                    gyhVarValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new ery0(gyhVarValueOf);
            case 26:
                return new bsy0(parcel.readInt() != 0);
            case 27:
                return new kty0(parcel.readInt() != 0);
            case 28:
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                if (string10 != null) {
                    if (!string10.equals("PENDING")) {
                        if (string10.equals("PURCHASED")) {
                            i = 2;
                        } else if (string10.equals("UNSPECIFIED_STATE")) {
                            i = 3;
                        } else {
                            hhg1.n("No enum constant com.spotify.gpb.client.Purchase.State.".concat(string10));
                        }
                    }
                    return new uuy0(i, string9, parcel.readString(), parcel.createStringArrayList());
                }
                bhn0.i("Name is null");
                i = 0;
                return new uuy0(i, string9, parcel.readString(), parcel.createStringArrayList());
            default:
                return new h1z0(parcel.readInt() != 0 ? gyh.valueOf(parcel.readString()) : null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new a0y0[i];
            case 1:
                return new b0y0[i];
            case 2:
                return new k0y0[i];
            case 3:
                return new x2y0[i];
            case 4:
                return new y2y0[i];
            case 5:
                return new p4y0[i];
            case 6:
                return new f7y0[i];
            case 7:
                return new lay0[i];
            case 8:
                return new may0[i];
            case 9:
                return new nay0[i];
            case 10:
                return new qay0[i];
            case 11:
                return new ray0[i];
            case 12:
                return new jby0[i];
            case 13:
                return new kby0[i];
            case 14:
                return new lby0[i];
            case 15:
                return new nby0[i];
            case 16:
                return new ocy0[i];
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new pcy0[i];
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new qcy0[i];
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new rcy0[i];
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new scy0[i];
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new ply0[i];
            case 22:
                return new qly0[i];
            case 23:
                return new rly0[i];
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new sly0[i];
            case 25:
                return new ery0[i];
            case 26:
                return new bsy0[i];
            case 27:
                return new kty0[i];
            case 28:
                return new uuy0[i];
            default:
                return new h1z0[i];
        }
    }
}
