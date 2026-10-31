package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qg90 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    /* JADX WARN: Code duplicated, block: B:36:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d5  */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        boolean z;
        boolean z2;
        int i2 = 1;
        int iH = 0;
        switch (this.a) {
            case 0:
                parcel.readInt();
                return rg90.a;
            case 1:
                int i3 = 1;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                boolean z3 = parcel.readInt() != 0;
                boolean z4 = parcel.readInt() != 0;
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                String string4 = parcel.readString();
                if (string4 != null) {
                    if (string4.equals("NOT_APPLICABLE")) {
                        i = i3;
                    } else if (string4.equals("ALBUM")) {
                        i = 2;
                    } else {
                        if (string4.equals("SINGLE")) {
                            i3 = 3;
                        } else if (string4.equals("APPEARS_ON")) {
                            i3 = 4;
                        } else {
                            hhg1.n("No enum constant com.spotify.assistedcuration.endpoints.Item.Album.Source.".concat(string4));
                        }
                        i = i3;
                    }
                    return new bh90(i, string, string2, string3, arrayListCreateStringArrayList, parcel.createStringArrayList(), z3, z4);
                }
                bhn0.i("Name is null");
                i = 0;
                return new bh90(i, string, string2, string3, arrayListCreateStringArrayList, parcel.createStringArrayList(), z3, z4);
            case 2:
                return new ch90(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList());
            case 3:
                return new eh90(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readFloat(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readLong(), parcel.createStringArrayList(), parcel.readLong());
            case 4:
                return new fi90(parcel.readString(), parcel.readString(), parcel.readString());
            case 5:
                boolean z5 = true;
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                int i4 = parcel.readInt();
                if (parcel.readInt() == 0) {
                    z5 = false;
                }
                return new di90(i4, string5, string6, z5);
            case 6:
                return new jh90(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readLong(), parcel.readLong());
            case 7:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                boolean z6 = parcel.readInt() != 0;
                int i5 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i5);
                int iH2 = 0;
                while (iH2 != i5) {
                    iH2 = x0d.h(mh90.class, parcel, arrayList, iH2, 1);
                }
                return new mh90(string7, string8, string9, string10, z6, arrayList);
            case 8:
                return new oh90(parcel.readString(), parcel.readString(), parcel.readString());
            case 9:
                return new rh90(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (yge) yge.CREATOR.createFromParcel(parcel));
            case 10:
                return new vh90(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 11:
                return new xh90(parcel.readString(), parcel.readString());
            case 12:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                boolean z7 = parcel.readInt() != 0;
                boolean z8 = parcel.readInt() != 0;
                boolean z9 = parcel.readInt() != 0;
                boolean z10 = parcel.readInt() != 0;
                int i6 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i6);
                int iD = 0;
                while (iD != i6) {
                    iD = dsl0.d(xh90.CREATOR, parcel, arrayList2, iD, 1);
                }
                return new yh90(string11, string12, string13, string14, string15, string16, z7, z8, z9, z10, arrayList2, parcel.readInt() != 0);
            case 13:
                return new hn90((xhc0) xhc0.CREATOR.createFromParcel(parcel), parcel.readString());
            case 14:
                int i7 = parcel.readInt();
                int i8 = parcel.readInt();
                tr80 tr80Var = new tr80(parcel.readInt(), parcel.readInt(), 1);
                int i9 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i9);
                int iD2 = 0;
                while (iD2 != i9) {
                    iD2 = dsl0.d(ttm1.CREATOR, parcel, arrayList3, iD2, 1);
                }
                int i10 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i10);
                int iD3 = 0;
                while (iD3 != i10) {
                    iD3 = dsl0.d(ttm1.CREATOR, parcel, arrayList4, iD3, 1);
                }
                int i11 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i11);
                int iH3 = 0;
                while (iH3 != i11) {
                    iH3 = x0d.h(mn90.class, parcel, arrayList5, iH3, 1);
                }
                return new mn90(i7, i8, tr80Var, arrayList3, arrayList4, arrayList5, parcel.readInt() != 0, parcel.readInt());
            case 15:
                int i12 = parcel.readInt();
                int i13 = parcel.readInt();
                int iH4 = 0;
                tr80 tr80Var2 = new tr80(parcel.readInt(), parcel.readInt(), 1);
                int i14 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i14);
                int iD4 = 0;
                while (iD4 != i14) {
                    iD4 = dsl0.d(ttm1.CREATOR, parcel, arrayList6, iD4, 1);
                }
                int i15 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i15);
                int iD5 = 0;
                while (iD5 != i15) {
                    iD5 = dsl0.d(ttm1.CREATOR, parcel, arrayList7, iD5, 1);
                }
                int i16 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i16);
                while (iH4 != i16) {
                    iH4 = x0d.h(nn90.class, parcel, arrayList8, iH4, 1);
                }
                return new nn90(i12, i13, tr80Var2, arrayList6, arrayList7, arrayList8, parcel.readInt());
            case 16:
                int i17 = parcel.readInt();
                int i18 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(i18);
                while (iH != i18) {
                    iH = x0d.h(on90.class, parcel, arrayList9, iH, 1);
                }
                return new on90(i17, arrayList9);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new pn90(parcel.readString());
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new qn90(parcel.readParcelable(qn90.class.getClassLoader()));
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                int i19 = parcel.readInt();
                int i20 = parcel.readInt();
                tr80 tr80Var3 = new tr80(parcel.readInt(), parcel.readInt(), 1);
                int i21 = parcel.readInt();
                boolean z11 = false;
                ArrayList arrayList10 = new ArrayList(i21);
                int iD6 = 0;
                while (iD6 != i21) {
                    iD6 = dsl0.d(ttm1.CREATOR, parcel, arrayList10, iD6, 1);
                }
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                return new rn90(i19, i20, tr80Var3, arrayList10, z11);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                int i22 = parcel.readInt();
                int i23 = parcel.readInt();
                tr80 tr80Var4 = new tr80(parcel.readInt(), parcel.readInt(), 1);
                int i24 = parcel.readInt();
                boolean z12 = false;
                ArrayList arrayList11 = new ArrayList(i24);
                int iD7 = 0;
                while (iD7 != i24) {
                    iD7 = dsl0.d(ttm1.CREATOR, parcel, arrayList11, iD7, 1);
                }
                if (parcel.readInt() != 0) {
                    z12 = true;
                }
                return new sn90(i22, i23, tr80Var4, arrayList11, z12);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                parcel.readInt();
                return tn90.a;
            case 22:
                Parcelable.Creator creator = ye10.CREATOR;
                return new bq90((ye10) creator.createFromParcel(parcel), (ye10) creator.createFromParcel(parcel));
            case 23:
                return new dq90(bq90.CREATOR.createFromParcel(parcel));
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                String string17 = parcel.readString();
                if (string17 != null) {
                    if (!string17.equals("HOST")) {
                        if (string17.equals("PARTICIPANT")) {
                            i2 = 2;
                        } else {
                            hhg1.n("No enum constant com.spotify.jam.features.jaminvitelearnmorepage.impl.page.JamInviteLearnMorePageParameters.ViewerContextType.".concat(string17));
                        }
                    }
                    int iX = ab80.x(parcel.readString());
                    String string18 = parcel.readString();
                    z = true;
                    String string19 = parcel.readString();
                    z2 = true;
                    if (parcel.readInt() == 0) {
                        z = false;
                    }
                    if (parcel.readInt() == 0) {
                        z2 = false;
                    }
                    return new ks90(i2, iX, string18, string19, z, z2);
                }
                bhn0.i("Name is null");
                i2 = 0;
                int iX2 = ab80.x(parcel.readString());
                String string110 = parcel.readString();
                z = true;
                String string111 = parcel.readString();
                z2 = true;
                if (parcel.readInt() == 0) {
                    z = false;
                }
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                return new ks90(i2, iX2, string110, string111, z, z2);
            case 25:
                return new gt90(parcel.readString(), parcel.readString());
            case 26:
                return new tx90(parcel.readString());
            case 27:
                return new eaa0(parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 28:
                return new taa0(vaa0.valueOf(parcel.readString()));
            default:
                return new uaa0((taa0) taa0.CREATOR.createFromParcel(parcel), (x6b) (parcel.readInt() == 0 ? null : x6b.CREATOR.createFromParcel(parcel)), (x6b) (parcel.readInt() != 0 ? x6b.CREATOR.createFromParcel(parcel) : null));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new rg90[i];
            case 1:
                return new bh90[i];
            case 2:
                return new ch90[i];
            case 3:
                return new eh90[i];
            case 4:
                return new fi90[i];
            case 5:
                return new di90[i];
            case 6:
                return new jh90[i];
            case 7:
                return new mh90[i];
            case 8:
                return new oh90[i];
            case 9:
                return new rh90[i];
            case 10:
                return new vh90[i];
            case 11:
                return new xh90[i];
            case 12:
                return new yh90[i];
            case 13:
                return new hn90[i];
            case 14:
                return new mn90[i];
            case 15:
                return new nn90[i];
            case 16:
                return new on90[i];
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new pn90[i];
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new qn90[i];
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new rn90[i];
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new sn90[i];
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new tn90[i];
            case 22:
                return new bq90[i];
            case 23:
                return new dq90[i];
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new ks90[i];
            case 25:
                return new gt90[i];
            case 26:
                return new tx90[i];
            case 27:
                return new eaa0[i];
            case 28:
                return new taa0[i];
            default:
                return new uaa0[i];
        }
    }
}
