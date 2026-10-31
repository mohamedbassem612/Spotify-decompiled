package p;

import android.media.MediaDescription;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hug0 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ hug0(byte b) {
        this.a = b;
    }

    /* JADX WARN: Code duplicated, block: B:139:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:143:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:147:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:198:0x0440  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b9 A[LOOP:1: B:42:0x00b7->B:43:0x00b9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00de A[LOOP:2: B:53:0x00dc->B:54:0x00de, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:62:0x0101  */
    /* JADX WARN: Code duplicated, block: B:65:0x0109  */
    /* JADX WARN: Code duplicated, block: B:66:0x010c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        ArrayList arrayList;
        int iD;
        boolean z4;
        boolean z5;
        int i5;
        ArrayList arrayList2;
        int iD2;
        boolean z6;
        boolean z7;
        boolean z8;
        int i6 = 3;
        int i7 = 2;
        boolean z9 = true;
        int iD3 = 0;
        switch (this.a) {
            case 0:
                twg0 twg0VarCreateFromParcel = null;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                tmq0 tmq0VarCreateFromParcel = tmq0.CREATOR.createFromParcel(parcel);
                String string14 = parcel.readString();
                if (parcel.readInt() != 0) {
                    twg0VarCreateFromParcel = twg0.CREATOR.createFromParcel(parcel);
                }
                twg0 twg0Var = twg0VarCreateFromParcel;
                boolean z10 = true;
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                if (string16 != null) {
                    if (string16.equals("UNKNOWN")) {
                        i = 1;
                    } else if (string16.equals("NO_HOLDOUT")) {
                        i = 2;
                    } else if (string16.equals("HOLDOUT")) {
                        i = 3;
                    } else {
                        hhg1.n("No enum constant com.spotify.marquee.marquee.domain.MarqueeHoldoutInfo.".concat(string16));
                    }
                    String string17 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        z10 = false;
                    }
                    return new iug0(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, tmq0VarCreateFromParcel, string14, twg0Var, string15, i, string17, z10);
                }
                bhn0.i("Name is null");
                i = 0;
                String string18 = parcel.readString();
                if (parcel.readInt() == 0) {
                    z10 = false;
                }
                return new iug0(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, tmq0VarCreateFromParcel, string14, twg0Var, string15, i, string18, z10);
            case 1:
                return new qwg0(iug0.CREATOR.createFromParcel(parcel));
            case 2:
                return twg0.valueOf(parcel.readString());
            case 3:
                return eyg0.valueOf(parcel.readString());
            case 4:
                return new i6h0(parcel.readString());
            case 5:
                return new j6h0(parcel.readString());
            case 6:
                return new k6h0(parcel.readString(), parcel.readString());
            case 7:
                parcel.readInt();
                return l6h0.a;
            case 8:
                return new m6h0(parcel.readString(), (l7c1) l7c1.CREATOR.createFromParcel(parcel));
            case 9:
                return new n6h0(parcel.readString());
            case 10:
                parcel.readInt();
                return o6h0.a;
            case 11:
                return new p6h0(parcel.readString(), parcel.readString());
            case 12:
                parcel.readInt();
                return q6h0.a;
            case 13:
                return new r6h0(parcel.readString());
            case 14:
                s6h0 s6h0Var = (s6h0) parcel.readParcelable(x6h0.class.getClassLoader());
                String string19 = parcel.readString();
                if (parcel.readInt() == 0) {
                    z9 = false;
                }
                String string20 = parcel.readString();
                if (string20 != null) {
                    if (string20.equals("NONE")) {
                        iD3 = 1;
                    } else if (string20.equals("DICTATION")) {
                        iD3 = 2;
                    } else if (string20.equals("REALTIME_VOICE")) {
                        iD3 = 3;
                    } else {
                        hhg1.n("No enum constant com.spotify.martini.martinipage.StartupMode.".concat(string20));
                    }
                    String string21 = parcel.readString();
                    String string22 = parcel.readString();
                    z = z9;
                    ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                    te30 te30Var = (te30) parcel.readParcelable(x6h0.class.getClassLoader());
                    boolean z11 = z;
                    if (parcel.readInt() == 0) {
                        z = false;
                    }
                    i2 = parcel.readInt();
                    z2 = z11 ? 1 : 0;
                    z3 = z11;
                    if (i2 == 0) {
                        z3 = iD3;
                    }
                    if (parcel.readInt() == 0) {
                        z2 = iD3;
                    }
                    return new x6h0(s6h0Var, string19, z9, iD3, string21, string22, arrayListCreateStringArrayList, te30Var, z, z3, z2, parcel.readString(), parcel.readString(), parcel.readString());
                }
                bhn0.i("Name is null");
                String string23 = parcel.readString();
                String string24 = parcel.readString();
                z = z9;
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                te30 te30Var2 = (te30) parcel.readParcelable(x6h0.class.getClassLoader());
                boolean z12 = z;
                if (parcel.readInt() == 0) {
                    z = false;
                }
                i2 = parcel.readInt();
                z2 = z12 ? 1 : 0;
                z3 = z12;
                if (i2 == 0) {
                    z3 = iD3;
                }
                if (parcel.readInt() == 0) {
                    z2 = iD3;
                }
                return new x6h0(s6h0Var, string19, z9, iD3, string23, string24, arrayListCreateStringArrayList2, te30Var2, z, z3, z2, parcel.readString(), parcel.readString(), parcel.readString());
            case 15:
                return new sah0(parcel.readInt() != 0 ? f8a.valueOf(parcel.readString()) : null);
            case 16:
                int i8 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i8);
                int iD4 = 0;
                while (iD4 != i8) {
                    iD4 = dsl0.d(gq70.CREATOR, parcel, arrayList3, iD4, 1);
                }
                int i9 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i9);
                int iD5 = 0;
                while (iD5 != i9) {
                    iD5 = dsl0.d(a7j1.CREATOR, parcel, arrayList4, iD5, 1);
                }
                int i10 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i10);
                while (iD3 != i10) {
                    iD3 = dsl0.d(zy60.CREATOR, parcel, arrayList5, iD3, 1);
                }
                return new fgh0(arrayList3, arrayList4, arrayList5);
            case 17:
                return new MediaBrowserCompat.MediaItem(parcel);
            case 18:
                return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
            case 19:
                return new mnh0(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readInt() != 0);
            case 20:
                int i11 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i11);
                int iD6 = 0;
                while (iD6 != i11) {
                    iD6 = dsl0.d(vy30.CREATOR, parcel, arrayList6, iD6, 1);
                }
                return new boh0(arrayList6, parcel.readParcelable(boh0.class.getClassLoader()), parcel.readParcelable(boh0.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 21:
                int i12 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i12);
                while (iD3 != i12) {
                    iD3 = dsl0.d(vy30.CREATOR, parcel, arrayList7, iD3, 1);
                }
                return new xnh0(arrayList7);
            case 22:
                return new ynh0((vy30) vy30.CREATOR.createFromParcel(parcel));
            case 23:
                return new znh0((vy30) vy30.CREATOR.createFromParcel(parcel));
            case 24:
                return new xoh0(parcel.readLong(), (Uri) parcel.readParcelable(xoh0.class.getClassLoader()), parcel.readLong(), parcel.readInt(), parcel.readInt(), p8i0.valueOf(parcel.readString()), parcel.readLong(), parcel.readLong());
            case 25:
                return new MediaMetadataCompat(parcel);
            case 26:
                String string25 = parcel.readString();
                if (string25 != null) {
                    if (string25.equals("GRANTED")) {
                        i3 = 1;
                    } else if (string25.equals("PARTIAL")) {
                        i3 = 2;
                    } else {
                        if (!string25.equals("NOT_DETERMINED")) {
                            if (string25.equals("DENIED")) {
                                i6 = 4;
                            } else {
                                hhg1.n("No enum constant com.spotify.mediapicker.impl.mediaprovider.PermissionStatus.".concat(string25));
                            }
                        }
                        i3 = i6;
                    }
                    i4 = parcel.readInt();
                    arrayList = new ArrayList(i4);
                    iD = 0;
                    while (iD != i4) {
                        iD = dsl0.d(xoh0.CREATOR, parcel, arrayList, iD, 1);
                    }
                    if (parcel.readInt() != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (parcel.readInt() != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    i5 = parcel.readInt();
                    arrayList2 = new ArrayList(i5);
                    iD2 = 0;
                    while (iD2 != i5) {
                        iD2 = dsl0.d(xoh0.CREATOR, parcel, arrayList2, iD2, 1);
                    }
                    int i13 = parcel.readInt();
                    int i14 = parcel.readInt();
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
                    if (parcel.readInt() != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    return new gsh0(i3, arrayList, z4, z5, arrayList2, i13, i14, z6, z7, z8, p8i0.valueOf(parcel.readString()));
                }
                bhn0.i("Name is null");
                i3 = 0;
                i4 = parcel.readInt();
                arrayList = new ArrayList(i4);
                iD = 0;
                while (iD != i4) {
                    iD = dsl0.d(xoh0.CREATOR, parcel, arrayList, iD, 1);
                }
                if (parcel.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (parcel.readInt() != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                i5 = parcel.readInt();
                arrayList2 = new ArrayList(i5);
                iD2 = 0;
                while (iD2 != i5) {
                    iD2 = dsl0.d(xoh0.CREATOR, parcel, arrayList2, iD2, 1);
                }
                int i15 = parcel.readInt();
                int i16 = parcel.readInt();
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
                if (parcel.readInt() != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                return new gsh0(i3, arrayList, z4, z5, arrayList2, i15, i16, z6, z7, z8, p8i0.valueOf(parcel.readString()));
            case 27:
                return new zsh0(parcel.readInt(), parcel.readInt());
            case 28:
                int i17 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i17);
                while (iD3 != i17) {
                    iD3 = dsl0.d(dth0.CREATOR, parcel, arrayList8, iD3, 1);
                }
                return new eth0(arrayList8);
            default:
                Uri uri = (Uri) parcel.readParcelable(dth0.class.getClassLoader());
                String string26 = parcel.readString();
                if (string26 != null) {
                    if (string26.equals("IMAGE")) {
                        i7 = 1;
                    } else if (!string26.equals("VIDEO")) {
                        hhg1.n("No enum constant com.spotify.mediapicker.api.MediaPickerResult.MediaType.".concat(string26));
                    }
                    return new dth0(i7, uri);
                }
                bhn0.i("Name is null");
                i7 = 0;
                return new dth0(i7, uri);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new iug0[i];
            case 1:
                return new qwg0[i];
            case 2:
                return new twg0[i];
            case 3:
                return new eyg0[i];
            case 4:
                return new i6h0[i];
            case 5:
                return new j6h0[i];
            case 6:
                return new k6h0[i];
            case 7:
                return new l6h0[i];
            case 8:
                return new m6h0[i];
            case 9:
                return new n6h0[i];
            case 10:
                return new o6h0[i];
            case 11:
                return new p6h0[i];
            case 12:
                return new q6h0[i];
            case 13:
                return new r6h0[i];
            case 14:
                return new x6h0[i];
            case 15:
                return new sah0[i];
            case 16:
                return new fgh0[i];
            case 17:
                return new MediaBrowserCompat.MediaItem[i];
            case 18:
                return new MediaDescriptionCompat[i];
            case 19:
                return new mnh0[i];
            case 20:
                return new boh0[i];
            case 21:
                return new xnh0[i];
            case 22:
                return new ynh0[i];
            case 23:
                return new znh0[i];
            case 24:
                return new xoh0[i];
            case 25:
                return new MediaMetadataCompat[i];
            case 26:
                return new gsh0[i];
            case 27:
                return new zsh0[i];
            case 28:
                return new eth0[i];
            default:
                return new dth0[i];
        }
    }
}
