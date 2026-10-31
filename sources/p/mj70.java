package p;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mj70 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iH = 0;
        switch (this.a) {
            case 0:
                boolean z = true;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    z = false;
                }
                return new nj70(string, string2, string3, z);
            case 1:
                return new hq70(parcel.readString(), parcel.readInt(), parcel.readInt());
            case 2:
                return new kq70(parcel.readString(), parcel.readString());
            case 3:
                return new cq70(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
            case 4:
                return new gq70(parcel.readInt(), parcel.readInt(), parcel.readParcelable(gq70.class.getClassLoader()));
            case 5:
                return new tp70((Bitmap) parcel.readParcelable(tp70.class.getClassLoader()));
            case 6:
                return new wp70(parcel.readString());
            case 7:
                int i = parcel.readInt();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                Double dValueOf = null;
                String string8 = parcel.readString();
                if (parcel.readInt() != 0) {
                    dValueOf = Double.valueOf(parcel.readDouble());
                }
                return new yr70(i, string4, string5, string6, string7, string8, dValueOf, parcel.readInt() != 0, parcel.readString());
            case 8:
                return new lt70(parcel.readString(), parcel.readString());
            case 9:
                return new zv70(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            case 10:
                return new bw70(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            case 11:
                return new zw70(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString());
            case 12:
                return new ax70(parcel.readInt(), parcel.readString(), parcel.readString());
            case 13:
                boolean z2 = true;
                boolean z3 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                return new ix70(z3, z2);
            case 14:
                boolean z4 = true;
                boolean z5 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    z4 = false;
                }
                return new jx70(z5, z4);
            case 15:
                int i2 = parcel.readInt();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                Double dValueOf2 = null;
                String string12 = parcel.readString();
                if (parcel.readInt() != 0) {
                    dValueOf2 = Double.valueOf(parcel.readDouble());
                }
                return new kz70(i2, string9, string10, string11, string12, dValueOf2, parcel.readString());
            case 16:
                return new xz70(parcel.readString());
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new yz70(parcel.readString());
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new a580(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new r880(parcel.readString(), parcel.readString(), parcel.readParcelable(r880.class.getClassLoader()));
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new t880(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                parcel.readInt();
                return fh80.a;
            case 22:
                return new fk80(parcel.readString());
            case 23:
                return new gk80(parcel.readInt(), parcel.readString());
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new hk80(parcel.readString());
            case 25:
                return new ik80(parcel.readString(), parcel.readString());
            case 26:
                return new jk80(parcel.readString());
            case 27:
                d761 parcelable = parcel.readParcelable(ul80.class.getClassLoader());
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                int i3 = parcel.readInt();
                String string15 = parcel.readString();
                int i4 = parcel.readInt();
                int i5 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i5);
                while (iH != i5) {
                    iH = x0d.h(ul80.class, parcel, arrayList, iH, 1);
                }
                return new ul80(parcelable, string13, string14, i3, string15, i4, arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 28:
                return new vl80(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            default:
                int i6 = parcel.readInt();
                int i7 = parcel.readInt();
                Parcelable.Creator creator = vl80.CREATOR;
                return new wl80(i6, i7, (vl80) creator.createFromParcel(parcel), (vl80) creator.createFromParcel(parcel), parcel.readInt());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new nj70[i];
            case 1:
                return new hq70[i];
            case 2:
                return new kq70[i];
            case 3:
                return new cq70[i];
            case 4:
                return new gq70[i];
            case 5:
                return new tp70[i];
            case 6:
                return new wp70[i];
            case 7:
                return new yr70[i];
            case 8:
                return new lt70[i];
            case 9:
                return new zv70[i];
            case 10:
                return new bw70[i];
            case 11:
                return new zw70[i];
            case 12:
                return new ax70[i];
            case 13:
                return new ix70[i];
            case 14:
                return new jx70[i];
            case 15:
                return new kz70[i];
            case 16:
                return new xz70[i];
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new yz70[i];
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new a580[i];
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new r880[i];
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new t880[i];
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new fh80[i];
            case 22:
                return new fk80[i];
            case 23:
                return new gk80[i];
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new hk80[i];
            case 25:
                return new ik80[i];
            case 26:
                return new jk80[i];
            case 27:
                return new ul80[i];
            case 28:
                return new vl80[i];
            default:
                return new wl80[i];
        }
    }
}
