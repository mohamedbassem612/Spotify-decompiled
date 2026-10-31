package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lad0 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ lad0(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        int iH = 0;
        switch (this.a) {
            case 0:
                return new mad0(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 1:
                return new nad0(parcel.readString());
            case 2:
                return new oad0(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? wad0.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readLong());
            case 3:
                return new wad0(parcel.readString(), parcel.readString());
            case 4:
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iF = 0;
                while (iF != i) {
                    iF = cfm0.f(parcel, linkedHashMap, parcel.readString(), iF, 1);
                }
                int i2 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    linkedHashMap2.put(parcel.readString(), zad0.CREATOR.createFromParcel(parcel));
                }
                return new yad0(linkedHashMap, linkedHashMap2, (rad0) parcel.readParcelable(yad0.class.getClassLoader()));
            case 5:
                return new zad0(parcel.readString(), parcel.readInt() != 0 ? gad0.CREATOR.createFromParcel(parcel) : null);
            case 6:
                parcel.readInt();
                return jbd0.a;
            case 7:
                int i4 = 0;
                String string = parcel.readString();
                nbd0 nbd0VarCreateFromParcel = nbd0.CREATOR.createFromParcel(parcel);
                String string2 = parcel.readString();
                if (string2 == null) {
                    bhn0.i("Name is null");
                } else if (string2.equals("Friend")) {
                    i4 = 1;
                } else if (string2.equals("Following")) {
                    i4 = 2;
                } else {
                    hhg1.n("No enum constant com.spotify.listeningactivity.elements.carousel.api.ListeningActivityCarouselElement.CarouselItem.FeedItem.Type.".concat(string2));
                }
                return new obd0(string, nbd0VarCreateFromParcel, i4);
            case 8:
                return new nbd0(parcel.readString(), parcel.readString(), (mbd0) parcel.readParcelable(nbd0.class.getClassLoader()));
            case 9:
                return new kbd0(parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            case 10:
                parcel.readInt();
                return lbd0.a;
            case 11:
                int iD = 0;
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                int i5 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i5);
                while (iD != i5) {
                    iD = dsl0.d(pbd0.CREATOR, parcel, arrayList, iD, 1);
                }
                return new qbd0(string3, string4, arrayList);
            case 12:
                return new pbd0(parcel.readString(), parcel.readInt() != 0 ? nbd0.CREATOR.createFromParcel(parcel) : null);
            case 13:
                parcel.readInt();
                return rbd0.a;
            case 14:
                parcel.readInt();
                return sbd0.a;
            case 15:
                parcel.readInt();
                return wbd0.a;
            case 16:
                parcel.readInt();
                return xbd0.a;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                parcel.readInt();
                return ybd0.a;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new zbd0(parcel.readInt());
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                int i6 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i6);
                int iH2 = 0;
                while (iH2 != i6) {
                    iH2 = x0d.h(ccd0.class, parcel, arrayList2, iH2, 1);
                }
                acd0 acd0Var = (acd0) parcel.readParcelable(ccd0.class.getClassLoader());
                long j = parcel.readLong();
                boolean z4 = parcel.readInt() != 0;
                int i7 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    linkedHashSet.add(ubd0.valueOf(parcel.readString()));
                }
                return new ccd0(arrayList2, acd0Var, j, z4, linkedHashSet, parcel.readInt() != 0, parcel.readInt() != 0);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                parcel.readInt();
                return kcd0.a;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new ncd0(parcel.readString());
            case 22:
                return new ocd0(parcel.readInt() != 0);
            case 23:
                String string5 = parcel.readString();
                boolean z5 = true;
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                if (parcel.readInt() == 0) {
                    z5 = false;
                }
                long j2 = parcel.readLong();
                if (parcel.readInt() != 0) {
                    z = false;
                    z2 = true;
                    z3 = true;
                } else {
                    z = false;
                    z2 = false;
                    z3 = z5;
                }
                if (parcel.readInt() == 0) {
                    z3 = z;
                }
                return new xdd0(string5, string6, string7, z5, j2, z2, z3, parcel.readString());
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                parcel.readInt();
                return cfd0.a;
            case 25:
                return new wid0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 26:
                return new ajd0((wid0) wid0.CREATOR.createFromParcel(parcel), (bmd0) bmd0.CREATOR.createFromParcel(parcel), (pkd0) pkd0.CREATOR.createFromParcel(parcel), (yip0) yip0.CREATOR.createFromParcel(parcel));
            case 27:
                return new pkd0(parcel.readString(), parcel.readString(), parcel.readString());
            case 28:
                return new bmd0(parcel.readString(), parcel.readString(), parcel.readString());
            default:
                d761 parcelable = parcel.readParcelable(jmd0.class.getClassLoader());
                int i9 = parcel.readInt();
                int i10 = parcel.readInt();
                int i11 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i11);
                while (iH != i11) {
                    iH = x0d.h(jmd0.class, parcel, arrayList3, iH, 1);
                }
                return new jmd0(parcelable, i9, i10, arrayList3, parcel.readFloat(), parcel.readFloat(), parcel.createStringArrayList(), parcel.readInt(), parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new mad0[i];
            case 1:
                return new nad0[i];
            case 2:
                return new oad0[i];
            case 3:
                return new wad0[i];
            case 4:
                return new yad0[i];
            case 5:
                return new zad0[i];
            case 6:
                return new jbd0[i];
            case 7:
                return new obd0[i];
            case 8:
                return new nbd0[i];
            case 9:
                return new kbd0[i];
            case 10:
                return new lbd0[i];
            case 11:
                return new qbd0[i];
            case 12:
                return new pbd0[i];
            case 13:
                return new rbd0[i];
            case 14:
                return new sbd0[i];
            case 15:
                return new wbd0[i];
            case 16:
                return new xbd0[i];
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new ybd0[i];
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new zbd0[i];
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new ccd0[i];
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new kcd0[i];
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new ncd0[i];
            case 22:
                return new ocd0[i];
            case 23:
                return new xdd0[i];
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new cfd0[i];
            case 25:
                return new wid0[i];
            case 26:
                return new ajd0[i];
            case 27:
                return new pkd0[i];
            case 28:
                return new bmd0[i];
            default:
                return new jmd0[i];
        }
    }
}
