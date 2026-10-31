package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h3g1 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        Class cls;
        boolean z;
        int iH = 0;
        boolean z2 = false;
        int iH2 = 0;
        switch (this.a) {
            case 0:
                dyf dyfVar = (dyf) (parcel.readInt() == 0 ? null : dyf.CREATOR.createFromParcel(parcel));
                String str = dyfVar != null ? dyfVar.a : null;
                ss20 ss20Var = (ss20) (parcel.readInt() == 0 ? null : ss20.CREATOR.createFromParcel(parcel));
                String str2 = ss20Var != null ? ss20Var.a : null;
                ol7 ol7Var = (ol7) (parcel.readInt() == 0 ? null : ol7.CREATOR.createFromParcel(parcel));
                return new i3g1(str, str2, ol7Var != null ? ol7Var.a : null);
            case 1:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                int i2 = parcel.readInt();
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                int i5 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i5);
                while (iH != i5) {
                    iH = x0d.h(k8g1.class, parcel, arrayList, iH, 1);
                }
                return new k8g1(string, string2, string3, string4, string5, i2, i3, i4, arrayList, parcel.readInt() != 0, qpe1.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
            case 2:
                int i6 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i6);
                int iH3 = 0;
                while (iH3 != i6) {
                    iH3 = x0d.h(wcg1.class, parcel, arrayList2, iH3, 1);
                }
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                n5e0 parcelable = parcel.readParcelable(wcg1.class.getClassLoader());
                String string6 = parcel.readString();
                if (string6 != null) {
                    if (string6.equals("ReadAlongPage")) {
                        i = 1;
                    } else if (string6.equals("ScrollCard")) {
                        i = 2;
                    } else {
                        hhg1.n("No enum constant com.spotify.transcript.list.TranscriptReadAlongListElement.Surface.".concat(string6));
                    }
                    return new wcg1(arrayList2, numValueOf, numValueOf2, parcelable, i, parcel.readString());
                }
                bhn0.i("Name is null");
                i = 0;
                return new wcg1(arrayList2, numValueOf, numValueOf2, parcelable, i, parcel.readString());
            case 3:
                int i7 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i7);
                while (iH2 != i7) {
                    iH2 = x0d.h(xdg1.class, parcel, arrayList3, iH2, 1);
                }
                return new xdg1(arrayList3, (g061) g061.CREATOR.createFromParcel(parcel), parcel.readParcelable(xdg1.class.getClassLoader()));
            case 4:
                return new lhg1((q6w0) q6w0.CREATOR.createFromParcel(parcel), (ruq0) ruq0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0);
            case 5:
                return new thg1(parcel.readString(), parcel.readParcelable(thg1.class.getClassLoader()), parcel.readParcelable(thg1.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readParcelable(thg1.class.getClassLoader()), parcel.readInt() != 0);
            case 6:
                return new wig1(parcel.readString());
            case 7:
                return new xig1(parcel.readString());
            case 8:
                return new ajg1(parcel.readString(), parcel.readString(), parcel.readString());
            case 9:
                int i8 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i8);
                int iG = 0;
                while (iG != i8) {
                    iG = k4s0.g(parcel, linkedHashSet, iG, 1);
                }
                int i9 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i9);
                for (int i10 = 0; i10 != i9; i10++) {
                    linkedHashSet2.add(af41.CREATOR.createFromParcel(parcel));
                }
                int i11 = parcel.readInt();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet(i11);
                int iG2 = 0;
                while (iG2 != i11) {
                    iG2 = k4s0.g(parcel, linkedHashSet3, iG2, 1);
                }
                int i12 = parcel.readInt();
                LinkedHashSet linkedHashSet4 = new LinkedHashSet(i12);
                int iG3 = 0;
                while (iG3 != i12) {
                    iG3 = k4s0.g(parcel, linkedHashSet4, iG3, 1);
                }
                int i13 = parcel.readInt();
                LinkedHashSet linkedHashSet5 = new LinkedHashSet(i13);
                int iG4 = 0;
                while (iG4 != i13) {
                    iG4 = k4s0.g(parcel, linkedHashSet5, iG4, 1);
                }
                return new hlg1(linkedHashSet, linkedHashSet2, linkedHashSet3, linkedHashSet4, linkedHashSet5);
            case 10:
                String string7 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                yig1 parcelable2 = parcel.readParcelable(bmg1.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    z = true;
                    cls = bmg1.class;
                } else {
                    cls = bmg1.class;
                    z = false;
                }
                return new bmg1(string7, z2, parcelable2, z, parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readParcelable(cls.getClassLoader()), parcel.readParcelable(cls.getClassLoader()));
            case 11:
                return new cmg1(parcel.readParcelable(cmg1.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readParcelable(cmg1.class.getClassLoader()), parcel.readInt() != 0 ? vur0.valueOf(parcel.readString()) : null, parcel.readParcelable(cmg1.class.getClassLoader()));
            case 12:
                parcel.readInt();
                return emg1.a;
            case 13:
                parcel.readInt();
                return fmg1.a;
            case 14:
                parcel.readInt();
                return gmg1.a;
            case 15:
                parcel.readInt();
                return hmg1.a;
            case 16:
                parcel.readInt();
                return img1.a;
            case 17:
                parcel.readInt();
                return wng1.a;
            case 18:
                return new xng1(parcel.readString());
            case 19:
                return new yng1(parcel.readInt() != 0);
            case 20:
                parcel.readInt();
                return zng1.a;
            case 21:
                parcel.readInt();
                return asg1.d;
            case 22:
                parcel.readInt();
                return bsg1.d;
            case 23:
                parcel.readInt();
                return csg1.d;
            case 24:
                parcel.readInt();
                return dsg1.d;
            case 25:
                parcel.readInt();
                return esg1.d;
            case 26:
                parcel.readInt();
                return fsg1.d;
            case 27:
                parcel.readInt();
                return gsg1.d;
            case 28:
                return new fug1(parcel.readParcelable(fug1.class.getClassLoader()), parcel.readInt());
            default:
                return new uvg1(parcel.readLong(), parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new i3g1[i];
            case 1:
                return new k8g1[i];
            case 2:
                return new wcg1[i];
            case 3:
                return new xdg1[i];
            case 4:
                return new lhg1[i];
            case 5:
                return new thg1[i];
            case 6:
                return new wig1[i];
            case 7:
                return new xig1[i];
            case 8:
                return new ajg1[i];
            case 9:
                return new hlg1[i];
            case 10:
                return new bmg1[i];
            case 11:
                return new cmg1[i];
            case 12:
                return new emg1[i];
            case 13:
                return new fmg1[i];
            case 14:
                return new gmg1[i];
            case 15:
                return new hmg1[i];
            case 16:
                return new img1[i];
            case 17:
                return new wng1[i];
            case 18:
                return new xng1[i];
            case 19:
                return new yng1[i];
            case 20:
                return new zng1[i];
            case 21:
                return new asg1[i];
            case 22:
                return new bsg1[i];
            case 23:
                return new csg1[i];
            case 24:
                return new dsg1[i];
            case 25:
                return new esg1[i];
            case 26:
                return new fsg1[i];
            case 27:
                return new gsg1[i];
            case 28:
                return new fug1[i];
            default:
                return new uvg1[i];
        }
    }
}
