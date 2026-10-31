package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bzc0 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new czc0(parcel.readString(), parcel.readString());
            case 1:
                parcel.readInt();
                return dzc0.a;
            case 2:
                return new ozc0(parcel.readString(), parcel.readString(), parcel.readParcelable(ozc0.class.getClassLoader()));
            case 3:
                parcel.readInt();
                return n2d0.a;
            case 4:
                return new o2d0(parcel.readInt() != 0);
            case 5:
                return new p2d0(parcel.readInt() != 0);
            case 6:
                return new q2d0(parcel.readInt() != 0);
            case 7:
                parcel.readInt();
                return r2d0.a;
            case 8:
                return new s2d0(parcel.readInt() != 0);
            case 9:
                parcel.readInt();
                return t2d0.a;
            case 10:
                parcel.readInt();
                return u2d0.a;
            case 11:
                return new v2d0(parcel.readInt() != 0);
            case 12:
                return new w2d0(parcel.readInt() != 0);
            case 13:
                return new x2d0(parcel.readInt() != 0);
            case 14:
                parcel.readInt();
                return y2d0.a;
            case 15:
                return new z2d0(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 16:
                return new a3d0(parcel.readString(), parcel.readString());
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new c3d0(parcel.readInt() != 0);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new e3d0(parcel.readInt() != 0);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new f3d0(parcel.readInt() != 0);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new l3d0(parcel.readString(), parcel.readString(), parcel.readParcelable(l3d0.class.getClassLoader()));
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new u5d0(parcel.readInt() != 0);
            case 22:
                return new r6d0(parcel.readString(), parcel.readString(), parcel.readString());
            case 23:
                return new t6d0(r6d0.CREATOR.createFromParcel(parcel));
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new r9d0(parcel.readString());
            case 25:
                Long lValueOf = null;
                String string = parcel.readString();
                String string2 = parcel.readString();
                boolean z = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    lValueOf = Long.valueOf(parcel.readLong());
                }
                return new gad0(lValueOf, string, string2, z);
            case 26:
                Long lValueOf2 = null;
                if (parcel.readInt() != 0) {
                    lValueOf2 = Long.valueOf(parcel.readLong());
                }
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                boolean z2 = true;
                String string5 = parcel.readString();
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                return new had0(lValueOf2, string3, string4, string5, z2, parcel.readString(), parcel.readString(), parcel.readString());
            case 27:
                parcel.readInt();
                return iad0.a;
            case 28:
                return new jad0(parcel.readInt());
            default:
                parcel.readInt();
                return kad0.a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new czc0[i];
            case 1:
                return new dzc0[i];
            case 2:
                return new ozc0[i];
            case 3:
                return new n2d0[i];
            case 4:
                return new o2d0[i];
            case 5:
                return new p2d0[i];
            case 6:
                return new q2d0[i];
            case 7:
                return new r2d0[i];
            case 8:
                return new s2d0[i];
            case 9:
                return new t2d0[i];
            case 10:
                return new u2d0[i];
            case 11:
                return new v2d0[i];
            case 12:
                return new w2d0[i];
            case 13:
                return new x2d0[i];
            case 14:
                return new y2d0[i];
            case 15:
                return new z2d0[i];
            case 16:
                return new a3d0[i];
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new c3d0[i];
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new e3d0[i];
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new f3d0[i];
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new l3d0[i];
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new u5d0[i];
            case 22:
                return new r6d0[i];
            case 23:
                return new t6d0[i];
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new r9d0[i];
            case 25:
                return new gad0[i];
            case 26:
                return new had0[i];
            case 27:
                return new iad0[i];
            case 28:
                return new jad0[i];
            default:
                return new kad0[i];
        }
    }
}
