package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zbf implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        int iH = 0;
        switch (this.a) {
            case 0:
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iH2 = 0;
                while (iH2 != i) {
                    iH2 = x0d.h(acf.class, parcel, arrayList2, iH2, 1);
                }
                boolean z = parcel.readInt() != 0;
                int i2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i2);
                int iH3 = 0;
                while (iH3 != i2) {
                    iH3 = x0d.h(acf.class, parcel, arrayList3, iH3, 1);
                }
                return new acf(arrayList2, arrayList3, z);
            case 1:
                int i3 = 0;
                goe goeVar = (goe) parcel.readParcelable(ncf.class.getClassLoader());
                w4i1 w4i1Var = (w4i1) parcel.readParcelable(ncf.class.getClassLoader());
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                acf acfVarCreateFromParcel = acf.CREATOR.createFromParcel(parcel);
                nlv parcelable = parcel.readParcelable(ncf.class.getClassLoader());
                mcf mcfVar = (mcf) parcel.readParcelable(ncf.class.getClassLoader());
                boolean z4 = parcel.readInt() != 0;
                int i4 = parcel.readInt();
                boolean z5 = parcel.readInt() != 0;
                String string = parcel.readString();
                boolean z6 = parcel.readInt() != 0;
                boolean z7 = parcel.readInt() != 0;
                boolean z8 = parcel.readInt() != 0;
                String string2 = parcel.readString();
                boolean z9 = parcel.readInt() != 0;
                int i5 = parcel.readInt();
                int i6 = parcel.readInt();
                t7q0 parcelable2 = parcel.readParcelable(ncf.class.getClassLoader());
                boolean z10 = parcel.readInt() != 0;
                boolean z11 = parcel.readInt() != 0;
                boolean z12 = parcel.readInt() != 0;
                int i7 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i7);
                while (i3 != i7) {
                    String string3 = parcel.readString();
                    int i8 = i3;
                    int i9 = parcel.readInt();
                    int i10 = i7;
                    ArrayList arrayList4 = new ArrayList(i9);
                    goe goeVar2 = goeVar;
                    int iH4 = 0;
                    while (iH4 != i9) {
                        iH4 = x0d.h(ncf.class, parcel, arrayList4, iH4, 1);
                        i9 = i9;
                    }
                    linkedHashMap.put(string3, arrayList4);
                    i3 = i8 + 1;
                    i7 = i10;
                    goeVar = goeVar2;
                }
                goe goeVar3 = goeVar;
                boolean z13 = parcel.readInt() != 0;
                boolean z14 = parcel.readInt() != 0;
                int i11 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i11);
                int i12 = 0;
                while (i12 != i11) {
                    linkedHashMap2.put(parcel.readString(), parcel.createStringArrayList());
                    i12++;
                    i11 = i11;
                }
                String string4 = parcel.readString();
                boolean z15 = parcel.readInt() != 0;
                boolean z16 = parcel.readInt() != 0;
                pfs0 pfs0Var = (pfs0) parcel.readParcelable(ncf.class.getClassLoader());
                boolean z17 = parcel.readInt() != 0;
                uu2 parcelable3 = parcel.readParcelable(ncf.class.getClassLoader());
                boolean z18 = parcel.readInt() != 0;
                h5f h5fVarValueOf = h5f.valueOf(parcel.readString());
                int i13 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList5.add(h5f.valueOf(parcel.readString()));
                }
                return new ncf(goeVar3, w4i1Var, z2, z3, acfVarCreateFromParcel, parcelable, mcfVar, z4, i4, z5, string, z6, z7, z8, string2, z9, i5, i6, parcelable2, z10, z11, z12, linkedHashMap, z13, z14, linkedHashMap2, string4, z15, z16, pfs0Var, z17, parcelable3, z18, h5fVarValueOf, arrayList5);
            case 2:
                return new bcf(parcel.readString(), (tom) parcel.readParcelable(bcf.class.getClassLoader()));
            case 3:
                return new ccf(parcel.readString(), (tom) parcel.readParcelable(ccf.class.getClassLoader()), (tom) parcel.readParcelable(ccf.class.getClassLoader()));
            case 4:
                return new dcf(parcel.readString(), (tom) parcel.readParcelable(dcf.class.getClassLoader()), (tom) parcel.readParcelable(dcf.class.getClassLoader()));
            case 5:
                return new ecf(parcel.readString(), (tom) parcel.readParcelable(ecf.class.getClassLoader()));
            case 6:
                return new fcf(parcel.readString(), (tom) parcel.readParcelable(fcf.class.getClassLoader()));
            case 7:
                return new hcf(parcel.readParcelable(hcf.class.getClassLoader()), parcel.readInt() != 0, (rqn) parcel.readParcelable(hcf.class.getClassLoader()));
            case 8:
                return new icf((rqn) parcel.readParcelable(icf.class.getClassLoader()));
            case 9:
                parcel.readInt();
                return jcf.a;
            case 10:
                parcel.readInt();
                return kcf.a;
            case 11:
                parcel.readInt();
                return lcf.a;
            case 12:
                return new agf(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 13:
                return new tgf(parcel.readString(), (sgf) parcel.readParcelable(tgf.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readParcelable(tgf.class.getClassLoader()), jqf.valueOf(parcel.readString()), parcel.readInt() != 0);
            case 14:
                return new ogf(parcel.readString(), parcel.readString());
            case 15:
                return new pgf(parcel.readString());
            case 16:
                return new qgf(parcel.readString(), parcel.readString());
            case 17:
                return new rgf(parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new aif(parcel.readString(), parcel.readString(), parcel.readString());
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new pmf(parcel.readString(), parcel.readString(), parcel.readString());
            case 20:
                return new umf(parcel.readString(), parcel.readString(), parcel.readString());
            case 21:
                return new mof(parcel.readInt(), parcel.readString(), parcel.readString());
            case 22:
                String string5 = parcel.readString();
                t7q0 parcelable4 = parcel.readParcelable(nof.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i15 = parcel.readInt();
                    ArrayList arrayList6 = new ArrayList(i15);
                    while (iH != i15) {
                        iH = x0d.h(nof.class, parcel, arrayList6, iH, 1);
                    }
                    arrayList = arrayList6;
                }
                return new nof(string5, parcelable4, arrayList);
            case 23:
                return new oof(parcel.readString(), parcel.readParcelable(oof.class.getClassLoader()));
            case 24:
                return new qof(parcel.readString(), parcel.readInt());
            case 25:
                return new vof(parcel.readParcelable(vof.class.getClassLoader()));
            case 26:
                int i16 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i16);
                while (iH != i16) {
                    iH = x0d.h(rof.class, parcel, arrayList7, iH, 1);
                }
                return new rof(arrayList7);
            case 27:
                return new sof(parcel.readParcelable(sof.class.getClassLoader()));
            case 28:
                return new tof(parcel.readString());
            default:
                return new vpf(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), (w4i1) parcel.readParcelable(vpf.class.getClassLoader()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new acf[i];
            case 1:
                return new ncf[i];
            case 2:
                return new bcf[i];
            case 3:
                return new ccf[i];
            case 4:
                return new dcf[i];
            case 5:
                return new ecf[i];
            case 6:
                return new fcf[i];
            case 7:
                return new hcf[i];
            case 8:
                return new icf[i];
            case 9:
                return new jcf[i];
            case 10:
                return new kcf[i];
            case 11:
                return new lcf[i];
            case 12:
                return new agf[i];
            case 13:
                return new tgf[i];
            case 14:
                return new ogf[i];
            case 15:
                return new pgf[i];
            case 16:
                return new qgf[i];
            case 17:
                return new rgf[i];
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new aif[i];
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new pmf[i];
            case 20:
                return new umf[i];
            case 21:
                return new mof[i];
            case 22:
                return new nof[i];
            case 23:
                return new oof[i];
            case 24:
                return new qof[i];
            case 25:
                return new vof[i];
            case 26:
                return new rof[i];
            case 27:
                return new sof[i];
            case 28:
                return new tof[i];
            default:
                return new vpf[i];
        }
    }
}
