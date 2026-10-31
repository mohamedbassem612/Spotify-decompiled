package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ipf0 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ ipf0(byte b) {
        this.a = b;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0252  */
    /* JADX WARN: Code duplicated, block: B:104:0x0255  */
    /* JADX WARN: Code duplicated, block: B:107:0x025d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0260  */
    /* JADX WARN: Code duplicated, block: B:111:0x0268  */
    /* JADX WARN: Code duplicated, block: B:112:0x026b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0273  */
    /* JADX WARN: Code duplicated, block: B:116:0x0276  */
    /* JADX WARN: Code duplicated, block: B:119:0x0282  */
    /* JADX WARN: Code duplicated, block: B:120:0x0285  */
    /* JADX WARN: Code duplicated, block: B:123:0x028d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0290  */
    /* JADX WARN: Code duplicated, block: B:127:0x0298  */
    /* JADX WARN: Code duplicated, block: B:128:0x029b  */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        int i2 = 0;
        switch (this.a) {
            case 0:
                fef0 fef0Var = (fef0) parcel.readParcelable(jpf0.class.getClassLoader());
                bff0 bff0Var = (bff0) parcel.readParcelable(jpf0.class.getClassLoader());
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i3 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashSet.add(Integer.valueOf(parcel.readInt()));
                }
                int i5 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    linkedHashSet2.add(Integer.valueOf(parcel.readInt()));
                }
                return new jpf0(fef0Var, bff0Var, string, string2, string3, linkedHashSet, linkedHashSet2, parcel.readInt() != 0);
            case 1:
                return new kpf0((bff0) parcel.readParcelable(kpf0.class.getClassLoader()));
            case 2:
                return new mpf0(parcel.readString(), (lpf0) parcel.readParcelable(mpf0.class.getClassLoader()));
            case 3:
                return new opf0(parcel.readString(), parcel.readString());
            case 4:
                parcel.readInt();
                return spf0.a;
            case 5:
                parcel.readInt();
                return tpf0.a;
            case 6:
                return new vpf0((a9h) parcel.readParcelable(vpf0.class.getClassLoader()));
            case 7:
                parcel.readInt();
                return wpf0.a;
            case 8:
                return new zpf0(parcel.readString(), parcel.readString(), parcel.readString());
            case 9:
                boolean z10 = parcel.readInt() != 0;
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                int i7 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i7);
                int iD = 0;
                while (iD != i7) {
                    iD = dsl0.d(zpf0.CREATOR, parcel, arrayList, iD, 1);
                }
                return new iqf0(z10, arrayListCreateStringArrayList, arrayList, parcel.readInt() != 0, parcel.readInt() != 0);
            case 10:
                String str = ((r1g1) parcel.readParcelable(gsf0.class.getClassLoader())).a;
                String str2 = parcel.readParcelable(gsf0.class.getClassLoader()).a;
                dhf0 dhf0VarValueOf = dhf0.valueOf(parcel.readString());
                bef0 bef0Var = (bef0) parcel.readParcelable(gsf0.class.getClassLoader());
                boolean z11 = parcel.readInt() != 0;
                int iT = pze0.t(parcel.readString());
                int i8 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i8);
                int iD2 = 0;
                while (iD2 != i8) {
                    iD2 = dsl0.d(xlf0.CREATOR, parcel, arrayList2, iD2, 1);
                }
                fsf0 fsf0Var = (fsf0) parcel.readParcelable(gsf0.class.getClassLoader());
                boolean z12 = parcel.readInt() != 0;
                vrf0 vrf0Var = (vrf0) parcel.readParcelable(gsf0.class.getClassLoader());
                csf0 csf0Var = (csf0) parcel.readParcelable(gsf0.class.getClassLoader());
                srf0 srf0VarCreateFromParcel = srf0.CREATOR.createFromParcel(parcel);
                String string4 = parcel.readString();
                if (string4 != null) {
                    if (string4.equals("TITLE_MEDIUM")) {
                        i = 1;
                    } else if (string4.equals("TITLE_SMALL")) {
                        i = 2;
                    } else {
                        hhg1.n("No enum constant com.spotify.lyrics.textelement.data.LyricsTextElementState.DisplayState.TextStyle.".concat(string4));
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
                    if (parcel.readInt() != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (parcel.readInt() != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    float f = parcel.readFloat();
                    if (parcel.readInt() != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (parcel.readInt() != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (parcel.readInt() != 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    return new gsf0(str, str2, dhf0VarValueOf, bef0Var, z11, iT, arrayList2, fsf0Var, z12, vrf0Var, csf0Var, srf0VarCreateFromParcel, i, z, z2, z3, z4, f, z5, z6, z7, klf0.Y0, klf0.Z0);
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
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (parcel.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                float f2 = parcel.readFloat();
                if (parcel.readInt() != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (parcel.readInt() != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (parcel.readInt() != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                return new gsf0(str, str2, dhf0VarValueOf, bef0Var, z11, iT, arrayList2, fsf0Var, z12, vrf0Var, csf0Var, srf0VarCreateFromParcel, i, z, z2, z3, z4, f2, z5, z6, z7, klf0.Y0, klf0.Z0);
            case 11:
                nrf0 nrf0Var = (nrf0) parcel.readParcelable(srf0.class.getClassLoader());
                rrf0 rrf0Var = (rrf0) parcel.readParcelable(srf0.class.getClassLoader());
                bff0 bff0Var2 = (bff0) parcel.readParcelable(srf0.class.getClassLoader());
                int iV = pze0.v(parcel.readString());
                if (parcel.readInt() != 0) {
                    z8 = false;
                    z9 = true;
                } else {
                    z8 = false;
                    z9 = false;
                }
                return new srf0(nrf0Var, rrf0Var, bff0Var2, iV, z9, parcel.readInt() == 0 ? z8 : true, parcel.readFloat());
            case 12:
                parcel.readInt();
                return hrf0.a;
            case 13:
                int i9 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i9);
                while (i2 != i9) {
                    linkedHashMap.put(vhc0.CREATOR.createFromParcel(parcel), parcel.readParcelable(irf0.class.getClassLoader()));
                    i2++;
                }
                return new irf0(linkedHashMap);
            case 14:
                vhc0 vhc0VarCreateFromParcel = parcel.readInt() == 0 ? null : vhc0.CREATOR.createFromParcel(parcel);
                int i10 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    linkedHashMap2.put(vhc0.CREATOR.createFromParcel(parcel), parcel.readParcelable(mrf0.class.getClassLoader()));
                }
                return new mrf0(vhc0VarCreateFromParcel, linkedHashMap2, parcel.readInt() != 0);
            case 15:
                parcel.readInt();
                return jrf0.a;
            case 16:
                parcel.readInt();
                return krf0.a;
            case 17:
                parcel.readInt();
                return orf0.a;
            case 18:
                parcel.readInt();
                return prf0.a;
            case 19:
                parcel.readInt();
                return qrf0.a;
            case 20:
                parcel.readInt();
                return trf0.a;
            case 21:
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(i12);
                while (i2 != i12) {
                    linkedHashMap3.put(jae.CREATOR.createFromParcel(parcel), parcel.readParcelable(urf0.class.getClassLoader()));
                    i2++;
                }
                return new urf0(linkedHashMap3);
            case 22:
                return new zrf0(parcel.readParcelable(zrf0.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            case 23:
                return new wrf0(vhc0.CREATOR.createFromParcel(parcel).a);
            case 24:
                return new xrf0(vhc0.CREATOR.createFromParcel(parcel).a, parcel.readInt());
            case 25:
                parcel.readInt();
                return asf0.a;
            case 26:
                parcel.readInt();
                return bsf0.a;
            case 27:
                return new dsf0(pze0.v(parcel.readString()), parcel.createStringArrayList(), parcel.readInt() != 0);
            case 28:
                parcel.readInt();
                return esf0.a;
            default:
                return new hsf0(vhc0.CREATOR.createFromParcel(parcel).a);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new jpf0[i];
            case 1:
                return new kpf0[i];
            case 2:
                return new mpf0[i];
            case 3:
                return new opf0[i];
            case 4:
                return new spf0[i];
            case 5:
                return new tpf0[i];
            case 6:
                return new vpf0[i];
            case 7:
                return new wpf0[i];
            case 8:
                return new zpf0[i];
            case 9:
                return new iqf0[i];
            case 10:
                return new gsf0[i];
            case 11:
                return new srf0[i];
            case 12:
                return new hrf0[i];
            case 13:
                return new irf0[i];
            case 14:
                return new mrf0[i];
            case 15:
                return new jrf0[i];
            case 16:
                return new krf0[i];
            case 17:
                return new orf0[i];
            case 18:
                return new prf0[i];
            case 19:
                return new qrf0[i];
            case 20:
                return new trf0[i];
            case 21:
                return new urf0[i];
            case 22:
                return new zrf0[i];
            case 23:
                return new wrf0[i];
            case 24:
                return new xrf0[i];
            case 25:
                return new asf0[i];
            case 26:
                return new bsf0[i];
            case 27:
                return new dsf0[i];
            case 28:
                return new esf0[i];
            default:
                return new hsf0[i];
        }
    }
}
