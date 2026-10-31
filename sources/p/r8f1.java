package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.Timestamp;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r8f1 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ r8f1(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        String str;
        boolean z;
        LinkedHashMap linkedHashMap = null;
        switch (this.a) {
            case 0:
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iD = 0;
                while (iD != i2) {
                    iD = dsl0.d(q8f1.CREATOR, parcel, arrayList, iD, 1);
                }
                Integer numValueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
                sve1 sve1VarR = Timestamp.r();
                sve1VarR.q(parcel.readLong());
                sve1VarR.n(parcel.readInt());
                return new s8f1(arrayList, numValueOf, sve1VarR.build(), parcel.readString());
            case 1:
                return new vff1(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 2:
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                int iD2 = 0;
                while (iD2 != i3) {
                    iD2 = dsl0.d(zff1.CREATOR, parcel, arrayList2, iD2, 1);
                }
                return new xff1(parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), arrayList2);
            case 3:
                String string = parcel.readString();
                String string2 = parcel.readString();
                d761 parcelable = parcel.readParcelable(zff1.class.getClassLoader());
                xxh parcelable2 = parcel.readParcelable(zff1.class.getClassLoader());
                String string3 = parcel.readString();
                int i4 = parcel.readInt();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                d761 parcelable3 = parcel.readParcelable(zff1.class.getClassLoader());
                String string6 = parcel.readString();
                int iS = parcel.readInt() == 0 ? 0 : us71.s(parcel.readString());
                int i5 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i5);
                int iD3 = 0;
                while (iD3 != i5) {
                    iD3 = dsl0.d(vff1.CREATOR, parcel, arrayList3, iD3, 1);
                }
                return new zff1(string, string2, parcelable, parcelable2, string3, i4, string4, string5, parcelable3, string6, iS, arrayList3);
            case 4:
                int i6 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i6);
                int iD4 = 0;
                while (iD4 != i6) {
                    iD4 = dsl0.d(zff1.CREATOR, parcel, arrayList4, iD4, 1);
                }
                Integer numValueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
                sve1 sve1VarR2 = Timestamp.r();
                sve1VarR2.q(parcel.readLong());
                sve1VarR2.n(parcel.readInt());
                return new agf1(arrayList4, numValueOf2, sve1VarR2.build(), parcel.readString());
            case 5:
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                ol11 ol11VarCreateFromParcel = ol11.CREATOR.createFromParcel(parcel);
                int i7 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i7);
                int iD5 = 0;
                while (iD5 != i7) {
                    iD5 = dsl0.d(ol11.CREATOR, parcel, arrayList5, iD5, 1);
                }
                return new jjf1(z2, z3, ol11VarCreateFromParcel, arrayList5, parcel.readInt() != 0, parcel.readInt() != 0, p2q0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (aql) parcel.readParcelable(jjf1.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, kw91.CREATOR.createFromParcel(parcel), (p1g1) parcel.readParcelable(jjf1.class.getClassLoader()), (tkf1) parcel.readParcelable(jjf1.class.getClassLoader()), (kfv) kfv.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            case 6:
                return new rjf1(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 7:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                int i8 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i8);
                int iD6 = 0;
                while (iD6 != i8) {
                    iD6 = dsl0.d(rjf1.CREATOR, parcel, arrayList6, iD6, 1);
                }
                return new xjf1(string7, string8, string9, string10, string11, arrayList6);
            case 8:
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                long j = parcel.readLong();
                ivd ivdVar = (ivd) ivd.CREATOR.createFromParcel(parcel);
                int i9 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i9);
                int iG = 0;
                while (iG != i9) {
                    iG = k4s0.g(parcel, linkedHashSet, iG, 1);
                }
                return new bkf1(string12, string13, j, ivdVar, linkedHashSet);
            case 9:
                parcel.readInt();
                return qkf1.a;
            case 10:
                parcel.readInt();
                return rkf1.a;
            case 11:
                parcel.readInt();
                return skf1.a;
            case 12:
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                k4m k4mVarValueOf = k4m.valueOf(parcel.readString());
                int iS2 = fd21.s(parcel.readString());
                boolean z4 = parcel.readInt() != 0;
                boolean z5 = parcel.readInt() != 0;
                boolean z6 = parcel.readInt() != 0;
                boolean z7 = parcel.readInt() != 0;
                boolean z8 = parcel.readInt() != 0;
                boolean z9 = parcel.readInt() != 0;
                boolean z10 = parcel.readInt() != 0;
                boolean z11 = parcel.readInt() != 0;
                boolean z12 = parcel.readInt() != 0;
                boolean z13 = parcel.readInt() != 0;
                String string18 = parcel.readString();
                boolean z14 = parcel.readInt() != 0;
                boolean z15 = parcel.readInt() != 0;
                boolean z16 = parcel.readInt() != 0;
                boolean z17 = parcel.readInt() != 0;
                boolean z18 = parcel.readInt() != 0;
                int i10 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i10);
                int iD7 = 0;
                while (true) {
                    boolean z19 = z13;
                    if (iD7 == i10) {
                        return new wlf1(string14, string15, string16, string17, k4mVarValueOf, iS2, z4, z5, z6, z7, z8, z9, z10, z11, z12, z19, string18, z14, z15, z16, z17, z18, arrayList7, parcel.readString());
                    }
                    iD7 = dsl0.d(gp51.CREATOR, parcel, arrayList7, iD7, 1);
                    z13 = z19;
                    i10 = i10;
                }
                break;
            case 13:
                String string19 = parcel.readString();
                lik1 parcelable4 = parcel.readParcelable(dmf1.class.getClassLoader());
                String string20 = parcel.readString();
                vsf1 vsf1Var = (vsf1) vsf1.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    int i11 = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(i11);
                    int iF = 0;
                    while (iF != i11) {
                        iF = cfm0.f(parcel, linkedHashMap, parcel.readString(), iF, 1);
                    }
                }
                return new dmf1(string19, parcelable4, string20, vsf1Var, linkedHashMap);
            case 14:
                return new fmf1(parcel.readString(), parcel.readString());
            case 15:
                return new dof1(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 16:
                return new crf1(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readParcelable(crf1.class.getClassLoader()), parcel.readParcelable(crf1.class.getClassLoader()), parcel.readString());
            case 17:
                int i12 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i12);
                int iD8 = 0;
                while (iD8 != i12) {
                    iD8 = dsl0.d(crf1.CREATOR, parcel, arrayList8, iD8, 1);
                }
                return new drf1(arrayList8);
            case 18:
                boolean z20 = true;
                String string21 = parcel.readString();
                String string22 = parcel.readString();
                boolean z21 = parcel.readInt() != 0;
                String string23 = parcel.readString();
                boolean z22 = parcel.readInt() != 0;
                boolean z23 = parcel.readInt() != 0;
                boolean z24 = parcel.readInt() != 0;
                boolean z25 = parcel.readInt() != 0;
                boolean z26 = parcel.readInt() != 0;
                boolean z27 = parcel.readInt() != 0;
                boolean z28 = parcel.readInt() != 0;
                String string24 = parcel.readString();
                boolean z29 = parcel.readInt() != 0;
                boolean z30 = parcel.readInt() != 0;
                boolean z31 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    z20 = false;
                }
                return new vsf1(string21, string22, z21, string23, z22, z23, z24, z25, z26, z27, z28, string24, z29, z30, z31, z20, parcel.readInt() != 0, parcel.readParcelable(vsf1.class.getClassLoader()), parcel.readParcelable(vsf1.class.getClassLoader()), parcel.readInt() != 0 ? z20 : false, parcel.readInt() != 0 ? z20 : false, parcel.readInt() != 0 ? z20 : false, parcel.readParcelable(vsf1.class.getClassLoader()), parcel.readInt() != 0 ? z20 : false, parcel.readInt() != 0 ? z20 : false, parcel.readInt() != 0 ? z20 : false, parcel.readInt() != 0 ? z20 : false, parcel.readInt() != 0 ? z20 : false, parcel.readInt() != 0 ? z20 : false, parcel.readInt() != 0 ? z20 : false, parcel.readInt() != 0 ? z20 : false, parcel.readInt() != 0 ? z20 : false, parcel.readParcelable(vsf1.class.getClassLoader()), parcel.readInt() != 0 ? z20 : false, parcel.readString(), parcel.readInt() != 0 ? z20 : false, parcel.readInt() != 0 ? z20 : false, parcel.readInt() != 0 ? z20 : false);
            case 19:
                return new avf1(parcel.readString(), parcel.readString(), (cvf1) parcel.readParcelable(avf1.class.getClassLoader()));
            case 20:
                parcel.readInt();
                return cvf1.a;
            case 21:
                int i13 = parcel.readInt();
                String string25 = parcel.readString();
                if (string25 != null) {
                    if (string25.equals("Player")) {
                        i = 1;
                    } else if (string25.equals("Scrub")) {
                        i = 2;
                    } else {
                        hhg1.n("No enum constant com.spotify.lyrics.textelement.data.TrackProgress.ChangeType.".concat(string25));
                    }
                    return new evf1(i13, i);
                }
                bhn0.i("Name is null");
                i = 0;
                return new evf1(i13, i);
            case 22:
                String string26 = parcel.readString();
                String string27 = parcel.readString();
                String string28 = parcel.readString();
                String string29 = parcel.readString();
                k4m k4mVarValueOf2 = k4m.valueOf(parcel.readString());
                int iS3 = fd21.s(parcel.readString());
                boolean z32 = parcel.readInt() != 0;
                boolean z33 = parcel.readInt() != 0;
                boolean z34 = parcel.readInt() != 0;
                boolean z35 = parcel.readInt() != 0;
                boolean z36 = parcel.readInt() != 0;
                boolean z37 = parcel.readInt() != 0;
                boolean z38 = parcel.readInt() != 0;
                boolean z39 = parcel.readInt() != 0;
                boolean z40 = parcel.readInt() != 0;
                boolean z41 = parcel.readInt() != 0;
                String string30 = parcel.readString();
                int i14 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(i14);
                int iD9 = 0;
                while (true) {
                    k4m k4mVar = k4mVarValueOf2;
                    if (iD9 == i14) {
                        String str2 = string27;
                        boolean z42 = parcel.readInt() != 0;
                        boolean z43 = parcel.readInt() != 0;
                        if (parcel.readInt() != 0) {
                            z = true;
                            str = str2;
                        } else {
                            str = str2;
                            z = false;
                        }
                        return new qzf1(string26, str, string28, string29, k4mVar, iS3, z32, z33, z34, z35, z36, z37, z38, z39, z40, z41, string30, arrayList9, z42, z43, z, parcel.readString());
                    }
                    iD9 = dsl0.d(gp51.CREATOR, parcel, arrayList9, iD9, 1);
                    k4mVarValueOf2 = k4mVar;
                    string27 = string27;
                }
                break;
            case 23:
                return new b1g1((wa71) parcel.readParcelable(b1g1.class.getClassLoader()));
            case 24:
                parcel.readInt();
                return i1g1.a;
            case 25:
                parcel.readInt();
                return j1g1.a;
            case 26:
                parcel.readInt();
                return m1g1.a;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                parcel.readInt();
                return n1g1.a;
            case 28:
                parcel.readInt();
                return o1g1.a;
            default:
                return new r1g1(parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new s8f1[i];
            case 1:
                return new vff1[i];
            case 2:
                return new xff1[i];
            case 3:
                return new zff1[i];
            case 4:
                return new agf1[i];
            case 5:
                return new jjf1[i];
            case 6:
                return new rjf1[i];
            case 7:
                return new xjf1[i];
            case 8:
                return new bkf1[i];
            case 9:
                return new qkf1[i];
            case 10:
                return new rkf1[i];
            case 11:
                return new skf1[i];
            case 12:
                return new wlf1[i];
            case 13:
                return new dmf1[i];
            case 14:
                return new fmf1[i];
            case 15:
                return new dof1[i];
            case 16:
                return new crf1[i];
            case 17:
                return new drf1[i];
            case 18:
                return new vsf1[i];
            case 19:
                return new avf1[i];
            case 20:
                return new cvf1[i];
            case 21:
                return new evf1[i];
            case 22:
                return new qzf1[i];
            case 23:
                return new b1g1[i];
            case 24:
                return new i1g1[i];
            case 25:
                return new j1g1[i];
            case 26:
                return new m1g1[i];
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new n1g1[i];
            case 28:
                return new o1g1[i];
            default:
                return new r1g1[i];
        }
    }
}
