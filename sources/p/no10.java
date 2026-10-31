package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class no10 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ no10(byte b) {
        this.a = b;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0101 A[LOOP:0: B:57:0x00ff->B:58:0x0101, LOOP_END] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        ArrayList arrayList;
        int i3;
        int i4 = 3;
        ArrayList arrayList2 = null;
        int iD = 0;
        switch (this.a) {
            case 0:
                return new oo10(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            case 1:
                parcel.readInt();
                return po10.a;
            case 2:
                Integer numValueOf = null;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                if (parcel.readInt() != 0) {
                    numValueOf = Integer.valueOf(parcel.readInt());
                }
                return new so10(string, string2, string3, string4, string5, numValueOf, parcel.readString(), parcel.readString(), parcel.readString(), (qo10) parcel.readParcelable(so10.class.getClassLoader()), (mo10) parcel.readParcelable(so10.class.getClassLoader()), parcel.readInt() != 0);
            case 3:
                parcel.readInt();
                return to10.a;
            case 4:
                return new uo10(parcel.readString(), parcel.readString(), parcel.readString(), (qo10) parcel.readParcelable(uo10.class.getClassLoader()), (mo10) parcel.readParcelable(uo10.class.getClassLoader()), parcel.readInt() != 0);
            case 5:
                return new cp10(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            case 6:
                parcel.readInt();
                return dp10.a;
            case 7:
                Integer numValueOf2 = null;
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                if (parcel.readInt() != 0) {
                    numValueOf2 = Integer.valueOf(parcel.readInt());
                }
                return new gp10(string6, string7, string8, numValueOf2, parcel.readString(), parcel.readString(), parcel.readString(), (ep10) parcel.readParcelable(gp10.class.getClassLoader()), parcel.readString(), parcel.readString());
            case 8:
                return new hp10(parcel.readString(), parcel.readString(), (ep10) parcel.readParcelable(hp10.class.getClassLoader()));
            case 9:
                parcel.readInt();
                return gr10.a;
            case 10:
                return new sr10(parcel.readString(), parcel.readString(), parcel.readParcelable(sr10.class.getClassLoader()), parcel.readInt() != 0);
            case 11:
                parcel.readInt();
                return xr10.a;
            case 12:
                return new yr10(parcel.readString());
            case 13:
                return new cs10(parcel.readInt() != 0);
            case 14:
                return new ds10(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 15:
                parcel.readInt();
                return es10.a;
            case 16:
                parcel.readInt();
                return fs10.a;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                parcel.readInt();
                return gs10.a;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new lx10(parcel.readString(), parcel.readString());
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                int i5 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i5);
                while (iD != i5) {
                    iD = dsl0.d(ll51.CREATOR, parcel, arrayList3, iD, 1);
                }
                return new x120(parcel.readInt(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), arrayList3);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new y120(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                int i6 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i6);
                int iD2 = 0;
                while (iD2 != i6) {
                    iD2 = dsl0.d(fr51.CREATOR, parcel, arrayList4, iD2, 1);
                }
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int i7 = parcel.readInt();
                    arrayList2 = new ArrayList(i7);
                    while (iD != i7) {
                        iD = dsl0.d(fr51.CREATOR, parcel, arrayList2, iD, 1);
                    }
                }
                return new z120(string9, string10, string11, string12, parcel.readString(), arrayList4, arrayList2);
            case 22:
                parcel.readInt();
                return a220.a;
            case 23:
                return new c220(parcel.readString(), parcel.readString(), parcel.readParcelable(c220.class.getClassLoader()));
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new o220(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 25:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                int i8 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i8);
                while (iD != i8) {
                    iD = dsl0.d(m4g.CREATOR, parcel, arrayList5, iD, 1);
                }
                return new p220(string13, string14, parcel.readString(), mqo1.F(arrayList5));
            case 26:
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                int i9 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i9);
                while (iD != i9) {
                    iD = dsl0.d(z9v.CREATOR, parcel, arrayList6, iD, 1);
                }
                return new q220(string15, string16, parcel.readString(), mqo1.F(arrayList6));
            case 27:
                return new r220(parcel.readString());
            case 28:
                String string17 = parcel.readString();
                String string18 = parcel.readString();
                String string19 = parcel.readString();
                if (string19 != null) {
                    if (string19.equals("TEXT")) {
                        i = 1;
                    } else if (string19.equals("NUMBER")) {
                        i = 2;
                    } else {
                        if (!string19.equals("PHONE")) {
                            if (string19.equals("EMAIL")) {
                                i4 = 4;
                            } else if (string19.equals("HIDDEN")) {
                                i4 = 5;
                            } else {
                                hhg1.n("No enum constant com.spotify.payment.paymentimpl.data.InputFieldType.".concat(string19));
                            }
                        }
                        i = i4;
                    }
                    String string20 = parcel.readString();
                    String string21 = parcel.readString();
                    i2 = parcel.readInt();
                    arrayList = new ArrayList(i2);
                    while (iD != i2) {
                        iD = x0d.h(s220.class, parcel, arrayList, iD, 1);
                    }
                    return new s220(string17, string18, i, string20, string21, mqo1.F(arrayList), parcel.readString(), parcel.readString(), parcel.readString());
                }
                bhn0.i("Name is null");
                i = 0;
                String string22 = parcel.readString();
                String string23 = parcel.readString();
                i2 = parcel.readInt();
                arrayList = new ArrayList(i2);
                while (iD != i2) {
                    iD = x0d.h(s220.class, parcel, arrayList, iD, 1);
                }
                return new s220(string17, string18, i, string22, string23, mqo1.F(arrayList), parcel.readString(), parcel.readString(), parcel.readString());
            default:
                String string24 = parcel.readString();
                String string25 = parcel.readString();
                c9 c9VarF = mqo1.F(parcel.createStringArrayList());
                les0 les0Var = (les0) les0.CREATOR.createFromParcel(parcel);
                sds0 sds0Var = (sds0) sds0.CREATOR.createFromParcel(parcel);
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                int i10 = parcel.readInt();
                boolean z4 = parcel.readInt() != 0;
                String string26 = parcel.readString();
                if (string26 != null) {
                    if (string26.equals("Loading")) {
                        i3 = 1;
                    } else if (string26.equals("Loaded")) {
                        i3 = 2;
                    } else if (string26.equals("Failed")) {
                        i3 = 3;
                    } else {
                        hhg1.n("No enum constant com.spotify.payment.paymentimpl.data.PciLoadState.".concat(string26));
                    }
                    return new t220(string24, string25, c9VarF, les0Var, sds0Var, z, z2, z3, i10, z4, i3, parcel.readDouble());
                }
                bhn0.i("Name is null");
                i3 = 0;
                return new t220(string24, string25, c9VarF, les0Var, sds0Var, z, z2, z3, i10, z4, i3, parcel.readDouble());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new oo10[i];
            case 1:
                return new po10[i];
            case 2:
                return new so10[i];
            case 3:
                return new to10[i];
            case 4:
                return new uo10[i];
            case 5:
                return new cp10[i];
            case 6:
                return new dp10[i];
            case 7:
                return new gp10[i];
            case 8:
                return new hp10[i];
            case 9:
                return new gr10[i];
            case 10:
                return new sr10[i];
            case 11:
                return new xr10[i];
            case 12:
                return new yr10[i];
            case 13:
                return new cs10[i];
            case 14:
                return new ds10[i];
            case 15:
                return new es10[i];
            case 16:
                return new fs10[i];
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new gs10[i];
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new lx10[i];
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new x120[i];
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new y120[i];
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new z120[i];
            case 22:
                return new a220[i];
            case 23:
                return new c220[i];
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new o220[i];
            case 25:
                return new p220[i];
            case 26:
                return new q220[i];
            case 27:
                return new r220[i];
            case 28:
                return new s220[i];
            default:
                return new t220[i];
        }
    }
}
