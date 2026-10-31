package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class d41 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ d41(byte b) {
        this.a = b;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0212  */
    /* JADX WARN: Code duplicated, block: B:102:0x021a  */
    /* JADX WARN: Code duplicated, block: B:103:0x021e  */
    /* JADX WARN: Code duplicated, block: B:105:0x022a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0234  */
    /* JADX WARN: Code duplicated, block: B:109:0x0237  */
    /* JADX WARN: Code duplicated, block: B:191:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:192:0x0401  */
    /* JADX WARN: Code duplicated, block: B:195:0x0408  */
    /* JADX WARN: Code duplicated, block: B:196:0x040a  */
    /* JADX WARN: Code duplicated, block: B:200:0x0413  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c9 A[LOOP:4: B:87:0x01c7->B:88:0x01c9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:93:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:94:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:96:0x0204  */
    /* JADX WARN: Code duplicated, block: B:97:0x0207  */
    /* JADX WARN: Code duplicated, block: B:99:0x020f  */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        boolean z;
        boolean z2;
        int i2;
        LinkedHashMap linkedHashMap;
        int i3;
        String str;
        String string;
        int i4;
        boolean z3;
        String str2 = "Name is null";
        int iD = 0;
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new e41(parcel.readString());
            case 1:
                return new f41((w01) w01.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readParcelable(f41.class.getClassLoader()));
            case 2:
                return new g41(parcel.readInt() != 0, parcel.readParcelable(g41.class.getClassLoader()));
            case 3:
                return new h41(parcel.readParcelable(h41.class.getClassLoader()));
            case 4:
                return new n41(parcel.readParcelable(n41.class.getClassLoader()));
            case 5:
                return new i41(parcel.readString());
            case 6:
                return new j41(parcel.readString());
            case 7:
                return new k41(parcel.readString());
            case 8:
                return new l41(parcel.readString());
            case 9:
                return new o41(parcel.readParcelable(o41.class.getClassLoader()));
            case 10:
                int i5 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i5);
                int iD2 = 0;
                while (iD2 != i5) {
                    iD2 = dsl0.d(y8t0.CREATOR, parcel, arrayList, iD2, 1);
                }
                boolean z4 = parcel.readInt() != 0;
                String string2 = parcel.readString();
                if (string2 != null) {
                    if (string2.equals("READY")) {
                        i = 1;
                    } else if (string2.equals("LOADING")) {
                        i = 2;
                    } else {
                        hhg1.n("No enum constant com.spotify.accountswitching.addaccountpageimpl.mobius.AddAccountModel.Status.".concat(string2));
                    }
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (parcel.readInt() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    return new t71(arrayList, z4, i, z, z2, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
                }
                bhn0.i("Name is null");
                i = 0;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (parcel.readInt() != 0) {
                }
                return new t71(arrayList, z4, i, z, z2, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                String string3 = parcel.readString();
                iyr0 parcelable = parcel.readParcelable(bb1.class.getClassLoader());
                boolean z5 = parcel.readInt() != 0;
                String string4 = parcel.readString();
                int i6 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i6);
                int iH = 0;
                while (iH != i6) {
                    iH = x0d.h(bb1.class, parcel, arrayList2, iH, 1);
                }
                int i7 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i7);
                int iH2 = 0;
                while (iH2 != i7) {
                    iH2 = x0d.h(bb1.class, parcel, arrayList3, iH2, 1);
                }
                boolean z6 = parcel.readInt() != 0;
                boolean z7 = parcel.readInt() != 0;
                boolean z8 = parcel.readInt() != 0;
                String string5 = parcel.readString();
                mlr0 mlr0Var = (mlr0) mlr0.CREATOR.createFromParcel(parcel);
                flr0 flr0Var = (flr0) flr0.CREATOR.createFromParcel(parcel);
                int i8 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i8);
                int iG = 0;
                while (iG != i8) {
                    iG = k4s0.g(parcel, linkedHashSet, iG, 1);
                }
                return new bb1(string3, parcelable, z5, string4, arrayList2, arrayList3, z6, z7, z8, string5, mlr0Var, flr0Var, mqo1.H(linkedHashSet), parcel.readString());
            case grn1.d /* 12 */:
                return new nb1(parcel.readString(), parcel.readParcelable(nb1.class.getClassLoader()), parcel.readParcelable(nb1.class.getClassLoader()));
            case 13:
                parcel.readInt();
                return new ec1();
            case 14:
                return new cd1(parcel.readString(), wxn0.valueOf(parcel.readString()));
            case 15:
                return new vf1(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 16:
                return new kh1(parcel.readString());
            case 17:
                return new fi1(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readParcelable(fi1.class.getClassLoader()));
            case 18:
                return new sn1(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 19:
                ru1 ru1VarCreateFromParcel = parcel.readInt() == 0 ? null : ru1.CREATOR.createFromParcel(parcel);
                int i9 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i9);
                for (int i10 = 0; i10 != i9; i10++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readInt() == 0 ? null : yv51.CREATOR.createFromParcel(parcel));
                }
                return new fo1(ru1VarCreateFromParcel, linkedHashMap2);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean z9 = parcel.readInt() != 0;
                boolean z10 = parcel.readInt() != 0;
                String string9 = parcel.readString();
                boolean z11 = parcel.readInt() != 0;
                boolean z12 = parcel.readInt() != 0;
                String string10 = parcel.readString();
                boolean z13 = parcel.readInt() != 0;
                boolean z14 = parcel.readInt() != 0;
                String string11 = parcel.readString();
                int i11 = 3;
                if (string11 != null) {
                    if (string11.equals("NO")) {
                        i11 = 1;
                    } else if (string11.equals("YES")) {
                        i11 = 2;
                    } else if (!string11.equals("PENDING")) {
                        hhg1.n("No enum constant com.spotify.addtoplaylist.composer.domain.data.model.OfflineStatus.".concat(string11));
                    }
                    i2 = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(i2);
                    i3 = 0;
                    while (i3 != i2) {
                        linkedHashMap.put(zhu0.valueOf(parcel.readString()), Integer.valueOf(parcel.readInt()));
                        i3++;
                        string10 = string10;
                        str2 = str2;
                    }
                    String str3 = string10;
                    str = str2;
                    string = parcel.readString();
                    if (string != null) {
                        if (string.equals("YOUR_EPISODES")) {
                            i4 = 1;
                        } else if (string.equals("LIKED_SONGS")) {
                            i4 = 2;
                        } else if (string.equals("YOUR_LIBRARY")) {
                            i4 = 3;
                        } else if (string.equals("OTHER")) {
                            i4 = 4;
                        } else {
                            hhg1.n("No enum constant com.spotify.addtoplaylist.composer.domain.data.model.AddToPlaylistItem.EntityType.".concat(string));
                        }
                        if (parcel.readInt() != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        return new ot1(string6, string7, string8, z9, z10, string9, z11, z12, str3, z13, z14, i11, linkedHashMap, i4, z3);
                    }
                    bhn0.i(str);
                    i4 = 0;
                    if (parcel.readInt() != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    return new ot1(string6, string7, string8, z9, z10, string9, z11, z12, str3, z13, z14, i11, linkedHashMap, i4, z3);
                }
                bhn0.i("Name is null");
                i11 = 0;
                i2 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i2);
                i3 = 0;
                while (i3 != i2) {
                    linkedHashMap.put(zhu0.valueOf(parcel.readString()), Integer.valueOf(parcel.readInt()));
                    i3++;
                    string10 = string10;
                    str2 = str2;
                }
                String str4 = string10;
                str = str2;
                string = parcel.readString();
                if (string != null) {
                    if (string.equals("YOUR_EPISODES")) {
                        i4 = 1;
                    } else if (string.equals("LIKED_SONGS")) {
                        i4 = 2;
                    } else if (string.equals("YOUR_LIBRARY")) {
                        i4 = 3;
                    } else if (string.equals("OTHER")) {
                        i4 = 4;
                    } else {
                        hhg1.n("No enum constant com.spotify.addtoplaylist.composer.domain.data.model.AddToPlaylistItem.EntityType.".concat(string));
                    }
                    if (parcel.readInt() != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    return new ot1(string6, string7, string8, z9, z10, string9, z11, z12, str4, z13, z14, i11, linkedHashMap, i4, z3);
                }
                bhn0.i(str);
                i4 = 0;
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return new ot1(string6, string7, string8, z9, z10, string9, z11, z12, str4, z13, z14, i11, linkedHashMap, i4, z3);
            case 21:
                int i12 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i12);
                while (iD != i12) {
                    iD = dsl0.d(su1.CREATOR, parcel, arrayList4, iD, 1);
                }
                return new tu1(parcel.readLong(), arrayList4);
            case 22:
                return new ru1(parcel.readString(), parcel.readString());
            case 23:
                return new su1(parcel.readLong(), (vo1) parcel.readParcelable(su1.class.getClassLoader()));
            case 24:
                return new yu1(parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readInt() != 0, (gy1) parcel.readParcelable(yu1.class.getClassLoader()));
            case 25:
                String string12 = parcel.readString();
                zu1 zu1VarCreateFromParcel = parcel.readInt() != 0 ? zu1.CREATOR.createFromParcel(parcel) : null;
                String string13 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                String string14 = parcel.readString();
                int i13 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i13);
                int iG2 = 0;
                while (iG2 != i13) {
                    iG2 = k4s0.g(parcel, linkedHashSet2, iG2, 1);
                }
                boolean z15 = parcel.readInt() != 0;
                int i14 = parcel.readInt();
                int iG3 = 0;
                LinkedHashSet linkedHashSet3 = new LinkedHashSet(i14);
                int iG4 = 0;
                while (iG4 != i14) {
                    iG4 = k4s0.g(parcel, linkedHashSet3, iG4, 1);
                }
                gy1 gy1Var = (gy1) parcel.readParcelable(av1.class.getClassLoader());
                boolean z16 = parcel.readInt() != 0;
                int i15 = parcel.readInt();
                LinkedHashSet linkedHashSet4 = new LinkedHashSet(i15);
                while (iG3 != i15) {
                    iG3 = k4s0.g(parcel, linkedHashSet4, iG3, 1);
                }
                return new av1(string12, zu1VarCreateFromParcel, string13, arrayListCreateStringArrayList, string14, linkedHashSet2, z15, linkedHashSet3, gy1Var, z16, linkedHashSet4);
            case 26:
                return new zu1(parcel.readString(), parcel.readString());
            case 27:
                return new hv1((gv1) parcel.readParcelable(hv1.class.getClassLoader()));
            case 28:
                parcel.readInt();
                return cv1.a;
            default:
                return new dv1(parcel.readString(), parcel.readParcelable(dv1.class.getClassLoader()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new e41[i];
            case 1:
                return new f41[i];
            case 2:
                return new g41[i];
            case 3:
                return new h41[i];
            case 4:
                return new n41[i];
            case 5:
                return new i41[i];
            case 6:
                return new j41[i];
            case 7:
                return new k41[i];
            case 8:
                return new l41[i];
            case 9:
                return new o41[i];
            case 10:
                return new t71[i];
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new bb1[i];
            case grn1.d /* 12 */:
                return new nb1[i];
            case 13:
                return new ec1[i];
            case 14:
                return new cd1[i];
            case 15:
                return new vf1[i];
            case 16:
                return new kh1[i];
            case 17:
                return new fi1[i];
            case 18:
                return new sn1[i];
            case 19:
                return new fo1[i];
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return new ot1[i];
            case 21:
                return new tu1[i];
            case 22:
                return new ru1[i];
            case 23:
                return new su1[i];
            case 24:
                return new yu1[i];
            case 25:
                return new av1[i];
            case 26:
                return new zu1[i];
            case 27:
                return new hv1[i];
            case 28:
                return new cv1[i];
            default:
                return new dv1[i];
        }
    }
}
