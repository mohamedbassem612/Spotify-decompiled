package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.allboarding.allboardingdomain.model.SearchConfiguration;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uo41 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    /* JADX WARN: Code duplicated, block: B:90:0x021b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0223  */
    /* JADX WARN: Code duplicated, block: B:94:0x0235  */
    /* JADX WARN: Code duplicated, block: B:96:0x0241  */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        m131 m131Var;
        m131 m131Var2;
        boolean z;
        boolean z2;
        int iH = 0;
        switch (this.a) {
            case 0:
                parcel.readInt();
                return vo41.a;
            case 1:
                parcel.readInt();
                return wo41.a;
            case 2:
                String string = parcel.readString();
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iD = 0;
                while (iD != i2) {
                    iD = dsl0.d(qpl.CREATOR, parcel, arrayList, iD, 1);
                }
                return new xo41(string, arrayList);
            case 3:
                parcel.readInt();
                return yo41.a;
            case 4:
                int iZ = x0d.z(parcel.readString());
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                int iH2 = 0;
                while (iH2 != i3) {
                    iH2 = x0d.h(ip41.class, parcel, arrayList2, iH2, 1);
                }
                return new ip41(iZ, arrayList2);
            case 5:
                return new jp41(parcel.readString());
            case 6:
                return new fw41(parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 7:
                return new SearchConfiguration(parcel.readString(), parcel.readString(), parcel.readString());
            case 8:
                return new qy41(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 9:
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                boolean z3 = parcel.readInt() != 0;
                boolean z4 = parcel.readInt() != 0;
                int i4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i4);
                int iD2 = 0;
                while (iD2 != i4) {
                    iD2 = dsl0.d(jq6.CREATOR, parcel, arrayList3, iD2, 1);
                }
                return new ry41(string2, string3, string4, string5, z3, z4, arrayList3, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            case 10:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                int i5 = parcel.readInt();
                f951 parcelable = parcel.readParcelable(z551.class.getClassLoader());
                val parcelable2 = parcel.readParcelable(z551.class.getClassLoader());
                fw41 fw41Var = (fw41) fw41.CREATOR.createFromParcel(parcel);
                llr0 parcelable3 = parcel.readParcelable(z551.class.getClassLoader());
                ue20 parcelable4 = parcel.readParcelable(z551.class.getClassLoader());
                xrt0 parcelable5 = parcel.readParcelable(z551.class.getClassLoader());
                String string8 = parcel.readString();
                if (string8 != null) {
                    if (string8.equals("None")) {
                        i = 1;
                    } else if (string8.equals("Dismissed")) {
                        i = 2;
                    } else {
                        hhg1.n("No enum constant com.spotify.search.mobius.model.MessageBannerState.".concat(string8));
                    }
                    m131Var = (m131) m131.CREATOR.createFromParcel(parcel);
                    e7r0 e7r0Var = (e7r0) e7r0.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() != 0) {
                        z = true;
                        m131Var2 = m131Var;
                    } else {
                        m131Var2 = m131Var;
                        z = false;
                    }
                    h1z0 h1z0Var = (h1z0) h1z0.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    return new z551(string6, string7, i5, parcelable, parcelable2, fw41Var, parcelable3, parcelable4, parcelable5, i, m131Var2, e7r0Var, z, h1z0Var, z2);
                }
                bhn0.i("Name is null");
                i = 0;
                m131Var = (m131) m131.CREATOR.createFromParcel(parcel);
                e7r0 e7r0Var2 = (e7r0) e7r0.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    z = true;
                    m131Var2 = m131Var;
                } else {
                    m131Var2 = m131Var;
                    z = false;
                }
                h1z0 h1z0Var2 = (h1z0) h1z0.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return new z551(string6, string7, i5, parcelable, parcelable2, fw41Var, parcelable3, parcelable4, parcelable5, i, m131Var2, e7r0Var2, z, h1z0Var2, z2);
            case 11:
                parcel.readInt();
                return i651.a;
            case 12:
                parcel.readInt();
                return j651.a;
            case 13:
                return new y651(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : gyh.valueOf(parcel.readString()), l651.valueOf(parcel.readString()));
            case 14:
                return new k851(parcel.readString(), parcel.readParcelable(k851.class.getClassLoader()));
            case 15:
                int i6 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i6);
                int iH3 = 0;
                while (iH3 != i6) {
                    iH3 = x0d.h(e951.class, parcel, arrayList4, iH3, 1);
                }
                return new e951(parcel.readString(), arrayList4, parcel.readInt() != 0);
            case 16:
                return new p851(parcel.readString());
            case 17:
                parcel.readInt();
                return q851.a;
            case 18:
                return new r851(parcel.readParcelable(r851.class.getClassLoader()), parcel.readString(), parcel.readParcelable(r851.class.getClassLoader()), parcel.readInt() != 0, parcel.createStringArrayList());
            case 19:
                parcel.readInt();
                return u851.a;
            case 20:
                return new w851(parcel.readParcelable(w851.class.getClassLoader()));
            case 21:
                return new x851(parcel.readParcelable(x851.class.getClassLoader()));
            case 22:
                parcel.readInt();
                return y851.a;
            case 23:
                return new z851(parcel.readParcelable(z851.class.getClassLoader()));
            case 24:
                return new a951(parcel.readParcelable(a951.class.getClassLoader()), parcel.readInt() != 0);
            case 25:
                int i7 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i7);
                int iH4 = 0;
                while (iH4 != i7) {
                    iH4 = x0d.h(b951.class, parcel, arrayList5, iH4, 1);
                }
                int i8 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i8);
                while (iH != i8) {
                    iH = x0d.h(b951.class, parcel, arrayList6, iH, 1);
                }
                return new b951(arrayList5, arrayList6);
            case 26:
                return new ma51((fpy) fpy.CREATOR.createFromParcel(parcel));
            case 27:
                return new vd51(parcel.readString(), parcel.readString());
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                parcel.readInt();
                return new ae51();
            default:
                return new de51(parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new vo41[i];
            case 1:
                return new wo41[i];
            case 2:
                return new xo41[i];
            case 3:
                return new yo41[i];
            case 4:
                return new ip41[i];
            case 5:
                return new jp41[i];
            case 6:
                return new fw41[i];
            case 7:
                return new SearchConfiguration[i];
            case 8:
                return new qy41[i];
            case 9:
                return new ry41[i];
            case 10:
                return new z551[i];
            case 11:
                return new i651[i];
            case 12:
                return new j651[i];
            case 13:
                return new y651[i];
            case 14:
                return new k851[i];
            case 15:
                return new e951[i];
            case 16:
                return new p851[i];
            case 17:
                return new q851[i];
            case 18:
                return new r851[i];
            case 19:
                return new u851[i];
            case 20:
                return new w851[i];
            case 21:
                return new x851[i];
            case 22:
                return new y851[i];
            case 23:
                return new z851[i];
            case 24:
                return new a951[i];
            case 25:
                return new b951[i];
            case 26:
                return new ma51[i];
            case 27:
                return new vd51[i];
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return new ae51[i];
            default:
                return new de51[i];
        }
    }
}
