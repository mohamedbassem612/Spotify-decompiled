package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ux9 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ ux9(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        int i = 1;
        int iH = 0;
        switch (this.a) {
            case 0:
                return new vx9(parcel.readString(), parcel.readString());
            case 1:
                return new wx9(parcel.readString());
            case 2:
                return new xx9(parcel.readString());
            case 3:
                return new mz9(ox9.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : wx9.CREATOR.createFromParcel(parcel));
            case 4:
                return new oz9((llw0) parcel.readParcelable(oz9.class.getClassLoader()), (jlw0) parcel.readParcelable(oz9.class.getClassLoader()));
            case 5:
                return new pz9((vz9) parcel.readParcelable(pz9.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 6:
                parcel.readInt();
                return rz9.a;
            case 7:
                parcel.readInt();
                return sz9.a;
            case 8:
                parcel.readInt();
                return tz9.a;
            case 9:
                return new uz9(parcel.readString());
            case 10:
                String string = parcel.readString();
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int iH2 = 0;
                while (iH2 != i2) {
                    iH2 = x0d.h(a0a.class, parcel, arrayList2, iH2, 1);
                }
                jlw0 jlw0Var = (jlw0) parcel.readParcelable(a0a.class.getClassLoader());
                int iR = lf51.r(parcel.readString());
                ela1 ela1Var = (ela1) parcel.readParcelable(a0a.class.getClassLoader());
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                dqi1 dqi1Var = (dqi1) parcel.readParcelable(a0a.class.getClassLoader());
                int i3 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i3);
                int iF = 0;
                while (iF != i3) {
                    iF = cfm0.f(parcel, linkedHashMap, parcel.readString(), iF, 1);
                }
                return new a0a(string, arrayList2, jlw0Var, iR, ela1Var, string2, string3, string4, dqi1Var, mqo1.G(linkedHashMap), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), (pz9) parcel.readParcelable(a0a.class.getClassLoader()), (oz9) parcel.readParcelable(a0a.class.getClassLoader()), parcel.readParcelable(a0a.class.getClassLoader()), (ez61) parcel.readParcelable(a0a.class.getClassLoader()), (dmt) parcel.readParcelable(a0a.class.getClassLoader()));
            case 11:
                int iF2 = 0;
                String string5 = parcel.readString();
                int i4 = parcel.readInt();
                int i5 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i5);
                int iH3 = 0;
                while (iH3 != i5) {
                    iH3 = x0d.h(b0a.class, parcel, arrayList3, iH3, 1);
                }
                c9 c9VarF = mqo1.F(arrayList3);
                jlw0 jlw0Var2 = (jlw0) parcel.readParcelable(b0a.class.getClassLoader());
                int iR2 = lf51.r(parcel.readString());
                pz9 pz9Var = (pz9) parcel.readParcelable(b0a.class.getClassLoader());
                oz9 oz9Var = (oz9) parcel.readParcelable(b0a.class.getClassLoader());
                ez61 ez61Var = (ez61) parcel.readParcelable(b0a.class.getClassLoader());
                ela1 ela1Var2 = (ela1) parcel.readParcelable(b0a.class.getClassLoader());
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                dqi1 dqi1Var2 = (dqi1) parcel.readParcelable(b0a.class.getClassLoader());
                int i6 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i6);
                while (iF2 != i6) {
                    iF2 = cfm0.f(parcel, linkedHashMap2, parcel.readString(), iF2, 1);
                }
                return new b0a(string5, i4, c9VarF, jlw0Var2, iR2, pz9Var, oz9Var, ez61Var, ela1Var2, string6, string7, string8, dqi1Var2, mqo1.G(linkedHashMap2), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readParcelable(b0a.class.getClassLoader()), (dmt) parcel.readParcelable(b0a.class.getClassLoader()), null);
            case 12:
                int i7 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i7);
                int iH4 = 0;
                while (iH4 != i7) {
                    iH4 = x0d.h(g0a.class, parcel, arrayList4, iH4, 1);
                }
                jlw0 jlw0Var3 = (jlw0) parcel.readParcelable(g0a.class.getClassLoader());
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                dqi1 dqi1Var3 = (dqi1) parcel.readParcelable(g0a.class.getClassLoader());
                int i8 = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(i8);
                int iF3 = 0;
                while (iF3 != i8) {
                    iF3 = cfm0.f(parcel, linkedHashMap3, parcel.readString(), iF3, 1);
                }
                return new g0a(arrayList4, jlw0Var3, string9, string10, string11, dqi1Var3, linkedHashMap3, parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : pz9.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : oz9.CREATOR.createFromParcel(parcel), (dmt) parcel.readParcelable(g0a.class.getClassLoader()));
            case 13:
                return new m0a(parcel.readString(), o0a.valueOf(parcel.readString()));
            case 14:
                return new v0a(parcel.createStringArrayList(), parcel.readString());
            case 15:
                r1a r1aVar = new r1a();
                r1aVar.c = 255;
                r1aVar.d = -1;
                r1aVar.a = parcel.readInt();
                r1aVar.b = parcel.readInt();
                r1aVar.c = parcel.readInt();
                r1aVar.d = parcel.readInt();
                r1aVar.e = parcel.readInt();
                r1aVar.f = parcel.readString();
                r1aVar.g = parcel.readInt();
                r1aVar.i = parcel.readInt();
                r1aVar.X = parcel.readInt();
                r1aVar.Y = parcel.readInt();
                r1aVar.Z = parcel.readInt();
                r1aVar.N0 = parcel.readInt();
                r1aVar.O0 = parcel.readInt();
                r1aVar.P0 = parcel.readInt();
                r1aVar.t = parcel.readInt() != 0;
                return r1aVar;
            case 16:
                return new w4a(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.createStringArrayList());
            case 17:
                String string12 = parcel.readString();
                if (string12 != null) {
                    if (!string12.equals("SUCCESS")) {
                        if (string12.equals("NO_MATCH")) {
                            i = 2;
                        } else if (string12.equals("FAIL")) {
                            i = 3;
                        } else {
                            hhg1.n("No enum constant com.spotify.libraryimport.matchresult.api.BannerBodyIcon.".concat(string12));
                        }
                    }
                    return new z4a(i, parcel.readString());
                }
                bhn0.i("Name is null");
                i = 0;
                return new z4a(i, parcel.readString());
            case 18:
                return new o5a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 19:
                parcel.readInt();
                return j7a.a;
            case 20:
                parcel.readInt();
                return o7a.a;
            case 21:
                return new q7a(parcel.readInt(), parcel.readInt());
            case 22:
                float f = parcel.readFloat();
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i9 = parcel.readInt();
                    arrayList = new ArrayList(i9);
                    for (int i10 = 0; i10 != i9; i10++) {
                        arrayList.add(Float.valueOf(parcel.readFloat()));
                    }
                }
                yor0 yor0Var = yor0.c;
                return new s8a(f, string13, string14, arrayListCreateStringArrayList, arrayList, yor0Var.d(parcel), yor0Var.d(parcel));
            case 23:
                return new sda((ivd) ivd.CREATOR.createFromParcel(parcel));
            case 24:
                lig0 lig0Var = (lig0) lig0.CREATOR.createFromParcel(parcel);
                e8c0 e8c0Var = (e8c0) e8c0.CREATOR.createFromParcel(parcel);
                int i11 = parcel.readInt();
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                boolean z4 = parcel.readInt() != 0;
                boolean z5 = parcel.readInt() != 0;
                int i12 = parcel.readInt();
                int i13 = parcel.readInt();
                boolean z6 = parcel.readInt() != 0;
                int i14 = parcel.readInt();
                int i15 = parcel.readInt();
                boolean z7 = parcel.readInt() != 0;
                boolean z8 = parcel.readInt() != 0;
                Parcelable.Creator creator = jpb.CREATOR;
                return new qma(lig0Var, e8c0Var, i11, z, z2, z3, z4, z5, i12, i13, z6, i14, i15, z7, z8, (jpb) creator.createFromParcel(parcel), (jpb) creator.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, (ym51) ym51.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, (k89) k89.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (kr50) kr50.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, (qpt0) qpt0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (ttp0) ttp0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 25:
                return new kqa(lf51.r(parcel.readString()), parcel.readParcelable(kqa.class.getClassLoader()), (ez61) parcel.readParcelable(kqa.class.getClassLoader()), (wa71) parcel.readParcelable(kqa.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), (wkt) null);
            case 26:
                int iR3 = lf51.r(parcel.readString());
                z771 parcelable = parcel.readParcelable(lqa.class.getClassLoader());
                ez61 ez61Var2 = (ez61) parcel.readParcelable(lqa.class.getClassLoader());
                wa71 wa71Var = (wa71) parcel.readParcelable(lqa.class.getClassLoader());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                String string18 = parcel.readString();
                String string19 = parcel.readString();
                String string20 = parcel.readString();
                int i16 = parcel.readInt();
                llw0 llw0Var = (llw0) parcel.readParcelable(lqa.class.getClassLoader());
                int i17 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i17);
                while (iH != i17) {
                    iH = x0d.h(lqa.class, parcel, arrayList5, iH, 1);
                }
                return new lqa(iR3, parcelable, ez61Var2, wa71Var, string15, string16, string17, string18, string19, string20, i16, llw0Var, arrayList5, (cuu0) parcel.readParcelable(lqa.class.getClassLoader()), 128);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new mqa(lf51.r(parcel.readString()), parcel.readParcelable(mqa.class.getClassLoader()), (ez61) parcel.readParcelable(mqa.class.getClassLoader()), (wa71) parcel.readParcelable(mqa.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), (wkt) null);
            case 28:
                return new qqa(parcel.readString(), parcel.readString(), parcel.readString());
            default:
                nra nraVar = (nra) (parcel.readInt() == 0 ? null : nra.CREATOR.createFromParcel(parcel));
                String string21 = parcel.readString();
                int i18 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i18);
                int iH5 = 0;
                while (iH5 != i18) {
                    iH5 = x0d.h(lra.class, parcel, arrayList6, iH5, 1);
                }
                int i19 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i19);
                int iD = 0;
                while (iD != i19) {
                    iD = dsl0.d(rta.CREATOR, parcel, arrayList7, iD, 1);
                }
                return new lra(nraVar, string21, arrayList6, arrayList7, (ora) (parcel.readInt() == 0 ? null : ora.CREATOR.createFromParcel(parcel)), parcel.readInt() != 0, parcel.readString(), parcel.readParcelable(lra.class.getClassLoader()), parcel.createStringArrayList());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new vx9[i];
            case 1:
                return new wx9[i];
            case 2:
                return new xx9[i];
            case 3:
                return new mz9[i];
            case 4:
                return new oz9[i];
            case 5:
                return new pz9[i];
            case 6:
                return new rz9[i];
            case 7:
                return new sz9[i];
            case 8:
                return new tz9[i];
            case 9:
                return new uz9[i];
            case 10:
                return new a0a[i];
            case 11:
                return new b0a[i];
            case 12:
                return new g0a[i];
            case 13:
                return new m0a[i];
            case 14:
                return new v0a[i];
            case 15:
                return new r1a[i];
            case 16:
                return new w4a[i];
            case 17:
                return new z4a[i];
            case 18:
                return new o5a[i];
            case 19:
                return new j7a[i];
            case 20:
                return new o7a[i];
            case 21:
                return new q7a[i];
            case 22:
                return new s8a[i];
            case 23:
                return new sda[i];
            case 24:
                return new qma[i];
            case 25:
                return new kqa[i];
            case 26:
                return new lqa[i];
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new mqa[i];
            case 28:
                return new qqa[i];
            default:
                return new lra[i];
        }
    }
}
