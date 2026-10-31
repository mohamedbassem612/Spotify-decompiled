package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j7f0 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ j7f0(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        int i3;
        boolean z;
        int iH = 0;
        switch (this.a) {
            case 0:
                return new k7f0(m7f0.valueOf(parcel.readString()));
            case 1:
                return new l7f0((k7f0) k7f0.CREATOR.createFromParcel(parcel), (x6b) (parcel.readInt() == 0 ? null : x6b.CREATOR.createFromParcel(parcel)), (x6b) (parcel.readInt() == 0 ? null : x6b.CREATOR.createFromParcel(parcel)));
            case 2:
                return new r7f0(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
            case 3:
                String string = parcel.readString();
                int i4 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i4);
                int iF = 0;
                while (iF != i4) {
                    iF = cfm0.f(parcel, linkedHashMap, parcel.readString(), iF, 1);
                }
                return new pbf0(string, linkedHashMap);
            case 4:
                wbf0 wbf0Var = new wbf0(parcel);
                wbf0Var.a = parcel.readString();
                wbf0Var.c = parcel.readFloat();
                wbf0Var.d = parcel.readInt() == 1;
                wbf0Var.e = parcel.readString();
                wbf0Var.f = parcel.readInt();
                wbf0Var.g = parcel.readInt();
                return wbf0Var;
            case 5:
                int i5 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i5);
                int iD = 0;
                while (iD != i5) {
                    iD = dsl0.d(aef0.CREATOR, parcel, arrayList, iD, 1);
                }
                int iT = pze0.t(parcel.readString());
                int i6 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i6);
                int iD2 = 0;
                while (iD2 != i6) {
                    iD2 = dsl0.d(def0.CREATOR, parcel, arrayList2, iD2, 1);
                }
                String string2 = parcel.readString();
                boolean z2 = parcel.readInt() != 0;
                bef0 bef0VarCreateFromParcel = bef0.CREATOR.createFromParcel(parcel);
                eef0 eef0VarCreateFromParcel = eef0.CREATOR.createFromParcel(parcel);
                String string3 = parcel.readString();
                if (string3 != null) {
                    if (string3.equals("NONE")) {
                        i = 1;
                    } else {
                        if (string3.equals("UNCAPPED")) {
                            i2 = 2;
                        } else if (string3.equals("CAPPED")) {
                            i2 = 3;
                        } else {
                            hhg1.n("No enum constant com.spotify.lyrics.data.model.Lyrics.CapStatus.".concat(string3));
                        }
                        i = i2;
                    }
                    return new fef0(arrayList, iT, arrayList2, string2, z2, bef0VarCreateFromParcel, eef0VarCreateFromParcel, i, parcel.createStringArrayList());
                }
                bhn0.i("Name is null");
                i = 0;
                return new fef0(arrayList, iT, arrayList2, string2, z2, bef0VarCreateFromParcel, eef0VarCreateFromParcel, i, parcel.createStringArrayList());
            case 6:
                long j = parcel.readLong();
                String string4 = parcel.readString();
                int i7 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i7);
                int iD3 = 0;
                while (iD3 != i7) {
                    iD3 = dsl0.d(cef0.CREATOR, parcel, arrayList3, iD3, 1);
                }
                return new aef0(j, string4, arrayList3);
            case 7:
                return new bef0(parcel.readString(), parcel.readString(), parcel.readString());
            case 8:
                return new cef0(parcel.readInt(), parcel.readInt());
            case 9:
                boolean z3 = true;
                String string5 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                if (parcel.readInt() == 0) {
                    z3 = false;
                }
                return new def0(string5, arrayListCreateStringArrayList, z3);
            case 10:
                return new eef0(parcel.readInt() != 0);
            case 11:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                int i8 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i8);
                int iF2 = 0;
                while (iF2 != i8) {
                    iF2 = cfm0.f(parcel, linkedHashMap2, parcel.readString(), iF2, 1);
                }
                cqs0 cqs0VarG = mqo1.G(linkedHashMap2);
                int i9 = parcel.readInt();
                int iD4 = 0;
                int i10 = parcel.readInt();
                int i11 = parcel.readInt();
                int i12 = parcel.readInt();
                int iU = pze0.u(parcel.readString());
                chf0 chf0VarValueOf = chf0.valueOf(parcel.readString());
                boolean z4 = parcel.readInt() != 0;
                int i13 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i13);
                while (true) {
                    int i14 = i9;
                    if (iD4 == i13) {
                        c9 c9VarF = mqo1.F(arrayList4);
                        boolean z5 = parcel.readInt() != 0;
                        if (parcel.readInt() != 0) {
                            z = true;
                            i3 = i14;
                        } else {
                            i3 = i14;
                            z = false;
                        }
                        return new vef0(string6, string7, string8, cqs0VarG, i3, i10, i11, i12, iU, chf0VarValueOf, z4, c9VarF, z5, z);
                    }
                    iD4 = dsl0.d(opf0.CREATOR, parcel, arrayList4, iD4, 1);
                    i9 = i14;
                }
                break;
            case 12:
                int i15 = parcel.readInt();
                int i16 = parcel.readInt();
                int i17 = parcel.readInt();
                boolean z6 = true;
                int i18 = parcel.readInt();
                int i19 = parcel.readInt();
                if (parcel.readInt() == 0) {
                    z6 = false;
                }
                return new bff0(i15, i16, i17, i18, i19, z6);
            case 13:
                int i20 = parcel.readInt();
                String string9 = parcel.readString();
                int i21 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i21);
                while (iH != i21) {
                    arrayList5.add(Integer.valueOf(parcel.readInt()));
                    iH++;
                }
                return new cgf0(i20, string9, arrayList5, (bff0) parcel.readParcelable(cgf0.class.getClassLoader()), parcel.readString());
            case 14:
                return new jgf0(parcel.readParcelable(jgf0.class.getClassLoader()), parcel.readInt(), parcel.readParcelable(jgf0.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readLong(), parcel.readString());
            case 15:
                dof1 dof1Var = (dof1) parcel.readParcelable(ojf0.class.getClassLoader());
                String string10 = parcel.readString();
                xpf0 xpf0Var = (xpf0) parcel.readParcelable(ojf0.class.getClassLoader());
                bff0 bff0Var = (bff0) parcel.readParcelable(ojf0.class.getClassLoader());
                boolean z7 = parcel.readInt() != 0;
                boolean z8 = parcel.readInt() != 0;
                boolean z9 = parcel.readInt() != 0;
                aog1 aog1Var = (aog1) parcel.readParcelable(ojf0.class.getClassLoader());
                String string11 = parcel.readString();
                xx81 xx81Var = (xx81) parcel.readParcelable(ojf0.class.getClassLoader());
                int i22 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i22);
                int iH2 = 0;
                while (iH2 != i22) {
                    iH2 = x0d.h(ojf0.class, parcel, arrayList6, iH2, 1);
                }
                return new ojf0(dof1Var, string10, xpf0Var, bff0Var, z7, z8, z9, aog1Var, string11, xx81Var, arrayList6, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, (pfm0) parcel.readParcelable(ojf0.class.getClassLoader()), (pfm0) parcel.readParcelable(ojf0.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : dn21.CREATOR.createFromParcel(parcel), (sr3) parcel.readParcelable(ojf0.class.getClassLoader()));
            case 16:
                return new wjf0(parcel.readInt() != 0, parcel.readParcelable(wjf0.class.getClassLoader()), parcel.readInt());
            case 17:
                int i23 = vhc0.CREATOR.createFromParcel(parcel).a;
                String string12 = parcel.readString();
                long j2 = parcel.readLong();
                int i24 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i24);
                while (iH != i24) {
                    iH = x0d.h(xlf0.class, parcel, arrayList7, iH, 1);
                }
                return new xlf0(i23, string12, j2, arrayList7);
            case 18:
                return new cmf0((a9h) parcel.readParcelable(cmf0.class.getClassLoader()));
            case 19:
                return new dmf0(parcel.readString());
            case 20:
                parcel.readInt();
                return emf0.a;
            case 21:
                parcel.readInt();
                return fmf0.a;
            case 22:
                parcel.readInt();
                return cnf0.a;
            case 23:
                return new dnf0(parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 24:
                kw9 parcelable = parcel.readParcelable(rnf0.class.getClassLoader());
                String string13 = parcel.readString();
                bef0 bef0Var = (bef0) parcel.readParcelable(rnf0.class.getClassLoader());
                vef0 parcelable2 = parcel.readParcelable(rnf0.class.getClassLoader());
                int i25 = parcel.readInt();
                ez61 parcelable3 = parcel.readParcelable(rnf0.class.getClassLoader());
                String string14 = parcel.readString();
                int i26 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i26);
                while (iH != i26) {
                    iH = x0d.h(rnf0.class, parcel, arrayList8, iH, 1);
                }
                return new rnf0(parcelable, string13, bef0Var, parcelable2, i25, parcelable3, string14, arrayList8, parcel.readString(), 512);
            case 25:
                return new dof0((ay61) parcel.readParcelable(dof0.class.getClassLoader()));
            case 26:
                String string15 = parcel.readString();
                int i27 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(i27);
                while (iH != i27) {
                    arrayList9.add(Integer.valueOf(parcel.readInt()));
                    iH++;
                }
                return new yof0(string15, arrayList9, (bff0) parcel.readParcelable(yof0.class.getClassLoader()));
            case 27:
                String string16 = parcel.readString();
                int i28 = parcel.readInt();
                ArrayList arrayList10 = new ArrayList(i28);
                while (iH != i28) {
                    arrayList10.add(Integer.valueOf(parcel.readInt()));
                    iH++;
                }
                return new epf0(string16, arrayList10, (bff0) parcel.readParcelable(epf0.class.getClassLoader()));
            case 28:
                return new gpf0(parcel.readParcelable(gpf0.class.getClassLoader()));
            default:
                return new hpf0((bff0) parcel.readParcelable(hpf0.class.getClassLoader()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new k7f0[i];
            case 1:
                return new l7f0[i];
            case 2:
                return new r7f0[i];
            case 3:
                return new pbf0[i];
            case 4:
                return new wbf0[i];
            case 5:
                return new fef0[i];
            case 6:
                return new aef0[i];
            case 7:
                return new bef0[i];
            case 8:
                return new cef0[i];
            case 9:
                return new def0[i];
            case 10:
                return new eef0[i];
            case 11:
                return new vef0[i];
            case 12:
                return new bff0[i];
            case 13:
                return new cgf0[i];
            case 14:
                return new jgf0[i];
            case 15:
                return new ojf0[i];
            case 16:
                return new wjf0[i];
            case 17:
                return new xlf0[i];
            case 18:
                return new cmf0[i];
            case 19:
                return new dmf0[i];
            case 20:
                return new emf0[i];
            case 21:
                return new fmf0[i];
            case 22:
                return new cnf0[i];
            case 23:
                return new dnf0[i];
            case 24:
                return new rnf0[i];
            case 25:
                return new dof0[i];
            case 26:
                return new yof0[i];
            case 27:
                return new epf0[i];
            case 28:
                return new gpf0[i];
            default:
                return new hpf0[i];
        }
    }
}
