package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xbi1 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    /* JADX WARN: Code duplicated, block: B:141:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:142:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:145:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:146:0x03b9  */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        boolean z;
        boolean z2;
        int i2 = 2;
        int iH = 0;
        switch (this.a) {
            case 0:
                return new ybi1(parcel.readString(), parcel.readString());
            case 1:
                String string = parcel.readString();
                m6r m6rVar = (m6r) m6r.CREATOR.createFromParcel(parcel);
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                String string2 = parcel.readString();
                if (string2 != null) {
                    if (string2.equals("EMPTY")) {
                        i = 1;
                    } else {
                        if (!string2.equals("READY")) {
                            if (string2.equals("DATE_ERROR")) {
                                i2 = 3;
                            } else {
                                hhg1.n("No enum constant com.spotify.genalphaaccountcreation.userinfo.page.mobius.ViewState.".concat(string2));
                            }
                        }
                        i = i2;
                    }
                    yxa0 parcelable = parcel.readParcelable(zci1.class.getClassLoader());
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String string3 = parcel.readString();
                    String string4 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    return new zci1(string, m6rVar, i3, i4, i, parcelable, z, string3, string4, z2);
                }
                bhn0.i("Name is null");
                i = 0;
                yxa0 parcelable2 = parcel.readParcelable(zci1.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return new zci1(string, m6rVar, i3, i4, i, parcelable2, z, string5, string6, z2);
            case 2:
                return new fdi1(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readParcelable(fdi1.class.getClassLoader()));
            case 3:
                return new lfi1(parcel.readParcelable(lfi1.class.getClassLoader()), parcel.readString(), parcel.readLong());
            case 4:
                return new hfi1(parcel.readString(), parcel.readString(), parcel.readString());
            case 5:
                return new ifi1(parcel.readString(), parcel.readString(), parcel.readString());
            case 6:
                return new thi1(parcel.readParcelable(thi1.class.getClassLoader()), parcel.readParcelable(thi1.class.getClassLoader()));
            case 7:
                return new uhi1(parcel.readParcelable(uhi1.class.getClassLoader()));
            case 8:
                int i5 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i5);
                while (iH != i5) {
                    iH = x0d.h(vhi1.class, parcel, arrayList, iH, 1);
                }
                return new vhi1(arrayList, parcel.readParcelable(vhi1.class.getClassLoader()));
            case 9:
                return new bii1(parcel.readInt(), parcel.readParcelable(bii1.class.getClassLoader()), parcel.readString());
            case 10:
                return new qii1(parcel.readInt() != 0);
            case 11:
                String string7 = parcel.readString();
                if (string7 == null) {
                    bhn0.i("Name is null");
                } else if (!string7.equals("WrappedParty")) {
                    hhg1.n("No enum constant com.spotify.usersnearby.usersnearbypage.UsersNearbyFeature.".concat(string7));
                }
                return new hni1(1, parcel.readString());
            case 12:
                return new dqi1(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 13:
                return new xui1(parcel.readString());
            case 14:
                boolean z3 = false;
                lik1 parcelable3 = parcel.readParcelable(zvi1.class.getClassLoader());
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                boolean z4 = parcel.readInt() != 0;
                boolean z5 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z3 = true;
                }
                return new zvi1(parcelable3, string8, string9, string10, z4, z5, z3);
            case 15:
                return new dxi1(parcel.readString(), parcel.readString());
            case 16:
                return new lxi1(parcel.readString(), parcel.readString());
            case 17:
                String string11 = parcel.readString();
                int i6 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i6);
                while (iH != i6) {
                    iH = x0d.h(v1j1.class, parcel, arrayList2, iH, 1);
                }
                return new v1j1(string11, arrayList2);
            case 18:
                String string12 = parcel.readString();
                int i7 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i7);
                while (iH != i7) {
                    iH = x0d.h(w1j1.class, parcel, arrayList3, iH, 1);
                }
                return new w1j1(string12, arrayList3, parcel.readString());
            case 19:
                return new b2j1(parcel.readString());
            case 20:
                return new k2j1(parcel.readInt() == 0 ? null : sbs0.CREATOR.createFromParcel(parcel), parcel.readString());
            case 21:
                String string13 = parcel.readString();
                if (string13 != null) {
                    if (string13.equals("ID_AND_SELFIE")) {
                        i2 = 1;
                    } else if (!string13.equals("ID_ONLY")) {
                        hhg1.n("No enum constant com.spotify.genalpha.entities.PhotoIdType.".concat(string13));
                    }
                    return new l2j1(i2, parcel.readString());
                }
                bhn0.i("Name is null");
                i2 = 0;
                return new l2j1(i2, parcel.readString());
            case 22:
                return new z4j1(parcel.readInt() != 0);
            case 23:
                return new a7j1(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readParcelable(a7j1.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            case 24:
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                int i8 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i8);
                while (iH != i8) {
                    iH = x0d.h(rcj1.class, parcel, arrayList4, iH, 1);
                }
                return new rcj1(string14, string15, string16, arrayList4, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 25:
                parcel.readInt();
                return hdj1.a;
            case 26:
                parcel.readInt();
                return idj1.a;
            case 27:
                String string17 = parcel.readString();
                String string18 = parcel.readString();
                String string19 = parcel.readString();
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                boolean z6 = true;
                int i9 = parcel.readInt();
                boolean z7 = false;
                int i10 = parcel.readInt();
                if (parcel.readInt() == 0) {
                    z6 = false;
                }
                if (parcel.readInt() != 0) {
                    z7 = true;
                }
                return new qfj1(string17, string18, string19, string20, string21, i9, i10, z6, z7, parcel.readString());
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                parcel.readInt();
                return lhj1.a;
            default:
                return new mhj1(parcel.readString(), parcel.readString(), parcel.readParcelable(mhj1.class.getClassLoader()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ybi1[i];
            case 1:
                return new zci1[i];
            case 2:
                return new fdi1[i];
            case 3:
                return new lfi1[i];
            case 4:
                return new hfi1[i];
            case 5:
                return new ifi1[i];
            case 6:
                return new thi1[i];
            case 7:
                return new uhi1[i];
            case 8:
                return new vhi1[i];
            case 9:
                return new bii1[i];
            case 10:
                return new qii1[i];
            case 11:
                return new hni1[i];
            case 12:
                return new dqi1[i];
            case 13:
                return new xui1[i];
            case 14:
                return new zvi1[i];
            case 15:
                return new dxi1[i];
            case 16:
                return new lxi1[i];
            case 17:
                return new v1j1[i];
            case 18:
                return new w1j1[i];
            case 19:
                return new b2j1[i];
            case 20:
                return new k2j1[i];
            case 21:
                return new l2j1[i];
            case 22:
                return new z4j1[i];
            case 23:
                return new a7j1[i];
            case 24:
                return new rcj1[i];
            case 25:
                return new hdj1[i];
            case 26:
                return new idj1[i];
            case 27:
                return new qfj1[i];
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return new lhj1[i];
            default:
                return new mhj1[i];
        }
    }
}
