package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class isf0 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Boolean boolValueOf = null;
        switch (this.a) {
            case 0:
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(vhc0.CREATOR.createFromParcel(parcel));
                }
                return new jsf0(linkedHashSet, parcel.readInt() != 0);
            case 1:
                return new qtf0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readParcelable(qtf0.class.getClassLoader()), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readDouble(), parcel.readInt() != 0, (bef0) parcel.readParcelable(qtf0.class.getClassLoader()), pze0.t(parcel.readString()), parcel.readParcelable(qtf0.class.getClassLoader()));
            case 2:
                return new wuf0(parcel.readBundle(wuf0.class.getClassLoader()));
            case 3:
                return new tvf0(parcel.readString());
            case 4:
                return new yvf0(parcel.readString(), parcel.readString());
            case 5:
                return new fxf0(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, (exf0) parcel.readParcelable(fxf0.class.getClassLoader()));
            case 6:
                return new zwf0((rs21) parcel.readParcelable(zwf0.class.getClassLoader()));
            case 7:
                parcel.readInt();
                return axf0.a;
            case 8:
                parcel.readInt();
                return bxf0.a;
            case 9:
                parcel.readInt();
                return cxf0.a;
            case 10:
                return new dxf0(parcel.readInt() != 0);
            case 11:
                Parcelable parcelable = parcel.readParcelable(ryf0.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new ryf0(parcelable, boolValueOf);
            case 12:
                return new o2g0(parcel.readString(), parcel.readString(), parcel.readParcelable(o2g0.class.getClassLoader()));
            case 13:
                int iD = 0;
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                while (iD != i3) {
                    iD = dsl0.d(lby.CREATOR, parcel, arrayList, iD, 1);
                }
                return new z2g0(arrayList, parcel.readString(), (xy01) (parcel.readInt() == 0 ? null : xy01.CREATOR.createFromParcel(parcel)), (o5a) (parcel.readInt() == 0 ? null : o5a.CREATOR.createFromParcel(parcel)), (yo20) (parcel.readInt() == 0 ? null : yo20.CREATOR.createFromParcel(parcel)), (f820) (parcel.readInt() != 0 ? f820.CREATOR.createFromParcel(parcel) : null));
            case 14:
                return new y4g0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 15:
                String string = parcel.readString();
                String string2 = parcel.readString();
                iyr0 parcelable2 = parcel.readParcelable(r6g0.class.getClassLoader());
                i7g0 i7g0VarValueOf = i7g0.valueOf(parcel.readString());
                boolean z = parcel.readInt() != 0;
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                int iD2 = 0;
                while (iD2 != i4) {
                    iD2 = dsl0.d(f7g0.CREATOR, parcel, arrayList2, iD2, 1);
                }
                int i5 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i5);
                int iD3 = 0;
                while (iD3 != i5) {
                    iD3 = dsl0.d(y4g0.CREATOR, parcel, arrayList3, iD3, 1);
                }
                int i6 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i6);
                int iD4 = 0;
                while (iD4 != i6) {
                    iD4 = dsl0.d(bzr0.CREATOR, parcel, arrayList4, iD4, 1);
                }
                int i7 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i7);
                int iD5 = 0;
                while (iD5 != i7) {
                    iD5 = dsl0.d(mxr0.CREATOR, parcel, arrayList5, iD5, 1);
                }
                int i8 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i8);
                int iF = 0;
                while (iF != i8) {
                    iF = cfm0.f(parcel, linkedHashMap, parcel.readString(), iF, 1);
                }
                return new r6g0(string, string2, parcelable2, i7g0VarValueOf, z, arrayList2, arrayList3, arrayList4, arrayList5, linkedHashMap, parcel.readString());
            case 16:
                return new e7g0(parcel.readString(), parcel.readParcelable(e7g0.class.getClassLoader()), parcel.readParcelable(e7g0.class.getClassLoader()), parcel.readString());
            case 17:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                boolean z2 = false;
                String string8 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                return new f7g0(string3, string4, string5, string6, string7, string8, z2, z2, z2, z2, z2, parcel.readInt() != 0);
            case 18:
                return new m7g0(parcel.readString());
            case 19:
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                int i9 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i9);
                int iH = 0;
                while (iH != i9) {
                    iH = x0d.h(b9g0.class, parcel, arrayList6, iH, 1);
                }
                int i10 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    linkedHashMap2.put(parcel.readString(), a9g0.CREATOR.createFromParcel(parcel));
                }
                int i12 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i12);
                int iG = 0;
                while (iG != i12) {
                    iG = k4s0.g(parcel, linkedHashSet2, iG, 1);
                }
                return new b9g0(string9, string10, arrayList6, linkedHashMap2, linkedHashSet2, parcel.readInt() != 0);
            case 20:
                return new a9g0(ox3.valueOf(parcel.readString()), parcel.readInt() != 0);
            case 21:
                return new k9g0(parcel.readString(), parcel.readParcelable(k9g0.class.getClassLoader()));
            case 22:
                return new gbg0(parcel.readString(), ibg0.valueOf(parcel.readString()), parcel.readParcelable(gbg0.class.getClassLoader()));
            case 23:
                return new geg0(parcel.readString(), ibg0.valueOf(parcel.readString()), parcel.readParcelable(geg0.class.getClassLoader()));
            case 24:
                return new sfg0(parcel.readString(), ibg0.valueOf(parcel.readString()), parcel.readParcelable(sfg0.class.getClassLoader()));
            case 25:
                return new lig0(parcel.readString(), parcel.readString());
            case 26:
                return new kkg0(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readParcelable(kkg0.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            case 27:
                return new dsg0(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 28:
                return new wtg0(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
            default:
                d761 parcelable3 = parcel.readParcelable(xtg0.class.getClassLoader());
                Parcelable.Creator creator = wtg0.CREATOR;
                return new xtg0(parcelable3, (wtg0) creator.createFromParcel(parcel), (wtg0) creator.createFromParcel(parcel), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new jsf0[i];
            case 1:
                return new qtf0[i];
            case 2:
                return new wuf0[i];
            case 3:
                return new tvf0[i];
            case 4:
                return new yvf0[i];
            case 5:
                return new fxf0[i];
            case 6:
                return new zwf0[i];
            case 7:
                return new axf0[i];
            case 8:
                return new bxf0[i];
            case 9:
                return new cxf0[i];
            case 10:
                return new dxf0[i];
            case 11:
                return new ryf0[i];
            case 12:
                return new o2g0[i];
            case 13:
                return new z2g0[i];
            case 14:
                return new y4g0[i];
            case 15:
                return new r6g0[i];
            case 16:
                return new e7g0[i];
            case 17:
                return new f7g0[i];
            case 18:
                return new m7g0[i];
            case 19:
                return new b9g0[i];
            case 20:
                return new a9g0[i];
            case 21:
                return new k9g0[i];
            case 22:
                return new gbg0[i];
            case 23:
                return new geg0[i];
            case 24:
                return new sfg0[i];
            case 25:
                return new lig0[i];
            case 26:
                return new kkg0[i];
            case 27:
                return new dsg0[i];
            case 28:
                return new wtg0[i];
            default:
                return new xtg0[i];
        }
    }
}
