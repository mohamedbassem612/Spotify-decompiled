package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ylk1 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ ylk1(byte b) {
        this.a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17, types: [int] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ?? r2;
        ArrayList arrayList;
        Boolean boolValueOf;
        int iF = 0;
        switch (this.a) {
            case 0:
                return new zlk1(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 1:
                return new apk1(parcel.readString(), parcel.readString());
            case 2:
                parcel.readInt();
                return xqk1.a;
            case 3:
                return new yqk1(duk1.valueOf(parcel.readString()));
            case 4:
                return new buk1(duk1.valueOf(parcel.readString()));
            case 5:
                buk1 buk1Var = (buk1) buk1.CREATOR.createFromParcel(parcel);
                Parcelable.Creator creator = s69.CREATOR;
                return new cuk1(buk1Var, (s69) creator.createFromParcel(parcel), (s69) creator.createFromParcel(parcel));
            case 6:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i = parcel.readInt();
                i260 i260VarCreateFromParcel = i260.CREATOR.createFromParcel(parcel);
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int iD = 0;
                while (iD != i2) {
                    iD = dsl0.d(wdo0.CREATOR, parcel, arrayList2, iD, 1);
                }
                return new fwk1(string, string2, string3, i, i260VarCreateFromParcel, arrayList2, lvb.CREATOR.createFromParcel(parcel), xhz.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString(), parcel.readString());
            case 7:
                return new hwk1(parcel.readString(), parcel.readString());
            case 8:
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                int i3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i3);
                while (iF != i3) {
                    arrayList3.add(parcel.readValue(eyk1.class.getClassLoader()));
                    iF++;
                }
                return new eyk1(parcel.readInt(), string4, string5, parcel.readString(), parcel.readString(), arrayList3);
            case 9:
                return new iyk1(parcel.readString(), parcel.readString(), parcel.createByteArray(), parcel.readString());
            case 10:
                boolean z = false;
                String string6 = parcel.readString();
                boolean z2 = parcel.readInt() != 0;
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean z3 = parcel.readInt() != 0 ? true : z;
                String string9 = parcel.readString();
                if (string9 == null) {
                    bhn0.i("Name is null");
                    r2 = z;
                } else if (string9.equals("PORTRAIT")) {
                    r2 = 1;
                } else if (string9.equals("LANDSCAPE")) {
                    r2 = 2;
                } else if (string9.equals("SCREEN_ORIENTATION_LOCKED")) {
                    r2 = 3;
                } else if (string9.equals("NONE")) {
                    r2 = 4;
                } else {
                    hhg1.n("No enum constant com.spotify.tome.pagecapabilities.properties.ForcedOrientationOnSmallScreen.Mode.".concat(string9));
                    r2 = z;
                }
                return new u2l1(r2, string6, string7, string8, z2, z3);
            case 11:
                parcel.readInt();
                return b3l1.a;
            case 12:
                return new i5l1(parcel.readString(), j5l1.valueOf(parcel.readString()), parcel.createStringArrayList());
            case 13:
                ArrayList arrayList4 = null;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i4 = parcel.readInt();
                    ArrayList arrayList5 = new ArrayList(i4);
                    int iD2 = 0;
                    while (iD2 != i4) {
                        iD2 = dsl0.d(s360.CREATOR, parcel, arrayList5, iD2, 1);
                    }
                    arrayList = arrayList5;
                }
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                String string16 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int i5 = parcel.readInt();
                    arrayList4 = new ArrayList(i5);
                    int iD3 = 0;
                    while (iD3 != i5) {
                        iD3 = dsl0.d(ib6.CREATOR, parcel, arrayList4, iD3, 1);
                    }
                }
                return new r8l1(arrayList, string10, string11, string12, string13, string14, string15, boolValueOf, string16, arrayList4);
            case 14:
                parcel.readInt();
                return sal1.a;
            case 15:
                return new tal1(parcel.readString(), parcel.readString());
            case 16:
                parcel.readInt();
                return cbl1.a;
            case 17:
                return new jcl1(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            case 18:
                String string17 = parcel.readString();
                boolean z4 = false;
                String string18 = parcel.readString();
                boolean z5 = true;
                String string19 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                if (parcel.readInt() == 0) {
                    z5 = z4;
                }
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                return new qcl1(string17, string18, string19, z4, z5, z4);
            case 19:
                parcel.readInt();
                return new dhl1();
            case 20:
                mjl1 mjl1Var = new mjl1(parcel);
                mjl1Var.e = parcel.readString();
                return mjl1Var;
            case 21:
                return new dll1(parcel.readParcelable(dll1.class.getClassLoader()), iwq.CREATOR.createFromParcel(parcel), parcel.readParcelable(dll1.class.getClassLoader()));
            case 22:
                String string20 = parcel.readString();
                int i6 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i6);
                while (iF != i6) {
                    iF = cfm0.f(parcel, linkedHashMap, parcel.readString(), iF, 1);
                }
                return new ill1(string20, linkedHashMap);
            case 23:
                return new sml1(parcel.readString(), parcel.readSerializable(), parcel.readParcelable(sml1.class.getClassLoader()));
            case 24:
                return new jwl1(parcel.readString());
            case 25:
                return new k4m1(parcel.readString(), parcel.readString());
            case 26:
                return new g6m1(parcel.readString());
            case 27:
                return new t8m1(parcel.readString());
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return new u8m1(parcel.readString());
            default:
                parcel.readInt();
                return v8m1.a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new zlk1[i];
            case 1:
                return new apk1[i];
            case 2:
                return new xqk1[i];
            case 3:
                return new yqk1[i];
            case 4:
                return new buk1[i];
            case 5:
                return new cuk1[i];
            case 6:
                return new fwk1[i];
            case 7:
                return new hwk1[i];
            case 8:
                return new eyk1[i];
            case 9:
                return new iyk1[i];
            case 10:
                return new u2l1[i];
            case 11:
                return new b3l1[i];
            case 12:
                return new i5l1[i];
            case 13:
                return new r8l1[i];
            case 14:
                return new sal1[i];
            case 15:
                return new tal1[i];
            case 16:
                return new cbl1[i];
            case 17:
                return new jcl1[i];
            case 18:
                return new qcl1[i];
            case 19:
                return new dhl1[i];
            case 20:
                return new mjl1[i];
            case 21:
                return new dll1[i];
            case 22:
                return new ill1[i];
            case 23:
                return new sml1[i];
            case 24:
                return new jwl1[i];
            case 25:
                return new k4m1[i];
            case 26:
                return new g6m1[i];
            case 27:
                return new t8m1[i];
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return new u8m1[i];
            default:
                return new v8m1[i];
        }
    }
}
