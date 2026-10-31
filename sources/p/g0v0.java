package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class g0v0 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ g0v0(byte b) {
        this.a = b;
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0189  */
    /* JADX WARN: Code duplicated, block: B:87:0x018b  */
    /* JADX WARN: Code duplicated, block: B:91:0x019f  */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Boolean boolValueOf;
        boolean z;
        int i = 3;
        switch (this.a) {
            case 0:
                parcel.readInt();
                return h0v0.a;
            case 1:
                return new o2v0(parcel.readString(), parcel.readString(), (kfv) kfv.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, (wve1) wve1.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString(), (lle) lle.CREATOR.createFromParcel(parcel));
            case 2:
                return new j3v0(parcel.readParcelable(j3v0.class.getClassLoader()), parcel.readInt() != 0);
            case 3:
                return new r7v0(parcel.readString(), parcel.readString());
            case 4:
                parcel.readInt();
                return x9v0.a;
            case 5:
                return new y9v0(parcel.readDouble(), parcel.readDouble());
            case 6:
                return new rdv0(parcel.readString(), parcel.readString(), parcel.readString());
            case 7:
                parcel.readInt();
                return sgv0.a;
            case 8:
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (string2 != null) {
                    if (string2.equals("ALBUM")) {
                        i = 1;
                    } else if (string2.equals("BOOK")) {
                        i = 2;
                    } else if (!string2.equals("UNRECOGNIZED")) {
                        hhg1.n("No enum constant com.spotify.yourlibrary.yourlibraryx.shared.domain.PreReleaseExtraInfo.Type.".concat(string2));
                    }
                    return new giv0(string, i);
                }
                bhn0.i("Name is null");
                i = 0;
                return new giv0(string, i);
            case 9:
                return new cnv0(parcel.readString());
            case 10:
                return new dnv0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 11:
                return new epv0(parcel.readString(), parcel.readString());
            case 12:
                return new upv0(parcel.readParcelable(upv0.class.getClassLoader()), parcel.readInt());
            case 13:
                return new mqv0(parcel.readString(), parcel.readParcelable(mqv0.class.getClassLoader()), parcel.readInt() != 0);
            case 14:
                return new grv0(parcel.readParcelable(grv0.class.getClassLoader()));
            case 15:
                parcel.readInt();
                return mrv0.a;
            case 16:
                parcel.readInt();
                return nrv0.a;
            case 17:
                parcel.readInt();
                return orv0.a;
            case 18:
                return new bsv0(parcel.readString(), parcel.readString(), parcel.readParcelable(bsv0.class.getClassLoader()), parcel.readInt() != 0);
            case 19:
                return new vwv0(parcel.readString(), parcel.readString(), parcel.readString());
            case 20:
                return new w2w0(parcel.readString());
            case 21:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                r8l1 r8l1VarCreateFromParcel = parcel.readInt() == 0 ? null : r8l1.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i2 = parcel.readInt();
                    ArrayList arrayList5 = new ArrayList(i2);
                    int iD = 0;
                    while (iD != i2) {
                        iD = dsl0.d(n3w0.CREATOR, parcel, arrayList5, iD, 1);
                    }
                    arrayList = arrayList5;
                }
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int i3 = parcel.readInt();
                    arrayList2 = new ArrayList(i3);
                    int iD2 = 0;
                    while (iD2 != i3) {
                        iD2 = dsl0.d(qcl1.CREATOR, parcel, arrayList2, iD2, 1);
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList3 = null;
                } else {
                    int i4 = parcel.readInt();
                    arrayList3 = new ArrayList(i4);
                    int iD3 = 0;
                    while (iD3 != i4) {
                        iD3 = dsl0.d(do10.CREATOR, parcel, arrayList3, iD3, 1);
                    }
                }
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList4 = null;
                } else {
                    int i5 = parcel.readInt();
                    arrayList4 = new ArrayList(i5);
                    int iD4 = 0;
                    while (iD4 != i5) {
                        iD4 = dsl0.d(zti0.CREATOR, parcel, arrayList4, iD4, 1);
                    }
                }
                return new z2w0(string3, string4, r8l1VarCreateFromParcel, arrayList, arrayList2, arrayList3, string5, string6, arrayList4, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : ajd0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            case 22:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                boolean z2 = false;
                String string9 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                return new n3w0(string7, string8, arrayListCreateStringArrayList, boolValueOf, string9, z2);
            case 23:
                return new z5w0(parcel.readParcelable(z5w0.class.getClassLoader()));
            case 24:
                parcel.readInt();
                return a6w0.a;
            case 25:
                return new b6w0(parcel.readInt() != 0);
            case 26:
                String string10 = parcel.readString();
                if (string10 != null) {
                    if (string10.equals("OPAQUE")) {
                        i = 1;
                    } else if (string10.equals("TRANSPARENT")) {
                        i = 2;
                    } else if (!string10.equals("FADE")) {
                        hhg1.n("No enum constant com.spotify.navigation.presentation.PresentationMode.Overlay.Default.Background.".concat(string10));
                    }
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return new c6w0(i, z, parcel.readParcelable(c6w0.class.getClassLoader()), parcel.readInt() != 0);
                }
                bhn0.i("Name is null");
                i = 0;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return new c6w0(i, z, parcel.readParcelable(c6w0.class.getClassLoader()), parcel.readInt() != 0);
            case 27:
                return new k6w0(parcel.readParcelable(k6w0.class.getClassLoader()), (d3j0) d3j0.CREATOR.createFromParcel(parcel), parcel.readSerializable());
            case 28:
                return new q6w0(b8w0.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : buk1.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : hez.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : fa20.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : px30.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : taa0.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : k7f0.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : s69.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : s69.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : gez.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : gez.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : r920.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : r920.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ox30.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ox30.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : x6b.CREATOR.createFromParcel(parcel));
            default:
                parcel.readInt();
                return j7w0.a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new h0v0[i];
            case 1:
                return new o2v0[i];
            case 2:
                return new j3v0[i];
            case 3:
                return new r7v0[i];
            case 4:
                return new x9v0[i];
            case 5:
                return new y9v0[i];
            case 6:
                return new rdv0[i];
            case 7:
                return new sgv0[i];
            case 8:
                return new giv0[i];
            case 9:
                return new cnv0[i];
            case 10:
                return new dnv0[i];
            case 11:
                return new epv0[i];
            case 12:
                return new upv0[i];
            case 13:
                return new mqv0[i];
            case 14:
                return new grv0[i];
            case 15:
                return new mrv0[i];
            case 16:
                return new nrv0[i];
            case 17:
                return new orv0[i];
            case 18:
                return new bsv0[i];
            case 19:
                return new vwv0[i];
            case 20:
                return new w2w0[i];
            case 21:
                return new z2w0[i];
            case 22:
                return new n3w0[i];
            case 23:
                return new z5w0[i];
            case 24:
                return new a6w0[i];
            case 25:
                return new b6w0[i];
            case 26:
                return new c6w0[i];
            case 27:
                return new k6w0[i];
            case 28:
                return new q6w0[i];
            default:
                return new j7w0[i];
        }
    }
}
