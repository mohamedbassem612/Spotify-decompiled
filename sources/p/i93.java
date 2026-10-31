package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.allboarding.entrypoint.EntryPoint;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class i93 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    /* JADX WARN: Code duplicated, block: B:179:0x0382  */
    /* JADX WARN: Code duplicated, block: B:180:0x0386  */
    /* JADX WARN: Code duplicated, block: B:184:0x0394  */
    /* JADX WARN: Code duplicated, block: B:187:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:212:0x041b  */
    /* JADX WARN: Code duplicated, block: B:213:0x041e  */
    /* JADX WARN: Code duplicated, block: B:216:0x0426  */
    /* JADX WARN: Code duplicated, block: B:217:0x0429  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        boolean z;
        boolean z2;
        ?? r14;
        boolean z3;
        int i2 = 2;
        boolean z4 = true;
        int iD = 0;
        switch (this.a) {
            case 0:
                String string = parcel.readString();
                if (string != null) {
                    if (string.equals("EP")) {
                        i = 1;
                    } else if (string.equals("ALBUM")) {
                        i = 2;
                    } else if (string.equals("SINGLE")) {
                        i = 3;
                    } else if (string.equals("COMPILATION")) {
                        i = 4;
                    } else if (string.equals("UNRECOGNIZED")) {
                        i = 5;
                    } else {
                        hhg1.n("No enum constant com.spotify.yourlibrary.yourlibraryx.shared.domain.AlbumExtraInfo.AlbumType.".concat(string));
                    }
                    String string2 = parcel.readString();
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
                    return new j93(string2, i, z, z2);
                }
                bhn0.i("Name is null");
                i = 0;
                String string3 = parcel.readString();
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
                return new j93(string3, i, z, z2);
            case 1:
                boolean z5 = false;
                boolean z6 = parcel.readInt() != 0;
                boolean z7 = parcel.readInt() != 0;
                boolean z8 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    z4 = false;
                }
                boolean z9 = parcel.readInt() != 0 ? z4 : false;
                if (parcel.readInt() != 0) {
                    z5 = z4;
                }
                boolean z10 = parcel.readInt() != 0 ? z4 : z5;
                ugo0 parcelable = parcel.readParcelable(mb3.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    z4 = z5;
                }
                boolean z11 = z9;
                String string4 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z5 = z4;
                }
                boolean z12 = parcel.readInt() != 0 ? z4 : z5;
                String string5 = parcel.readString();
                if (string5 != null) {
                    if (string5.equals("Hide")) {
                        r14 = z4;
                    } else if (string5.equals("Show")) {
                        r14 = 2;
                    } else if (string5.equals("ShowWithPlayability")) {
                        r14 = 3;
                    } else {
                        hhg1.n("No enum constant com.spotify.album.contextmenu.AlbumMenuConfiguration.AddToQueueConfiguration.".concat(string5));
                    }
                    if (parcel.readInt() != 0) {
                        z3 = z4;
                    } else {
                        z3 = z5;
                    }
                    return new mb3(z6, z7, z8, z4, z11, z5, z10, parcelable, z4, string4, z5, z12, (int) r14, z3, parcel.readInt() == 0 ? z5 : true, parcel.readParcelable(mb3.class.getClassLoader()), parcel.readInt() != 0, parcel.readParcelable(mb3.class.getClassLoader()));
                }
                bhn0.i("Name is null");
                r14 = z5;
                if (parcel.readInt() != 0) {
                    z3 = z4;
                } else {
                    z3 = z5;
                }
                if (parcel.readInt() == 0) {
                }
                if (parcel.readInt() != 0) {
                }
                return new mb3(z6, z7, z8, z4, z11, z5, z10, parcelable, z4, string4, z5, z12, (int) r14, z3, parcel.readInt() == 0 ? z5 : true, parcel.readParcelable(mb3.class.getClassLoader()), parcel.readInt() != 0, parcel.readParcelable(mb3.class.getClassLoader()));
            case 2:
                return new lc3(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 3:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean z13 = parcel.readInt() != 0;
                String string9 = parcel.readString();
                boolean z14 = parcel.readInt() != 0;
                k4m k4mVarValueOf = k4m.valueOf(parcel.readString());
                boolean z15 = parcel.readInt() != 0;
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                int iD2 = 0;
                while (iD2 != i3) {
                    iD2 = dsl0.d(gp51.CREATOR, parcel, arrayList, iD2, 1);
                }
                return new ag3(string6, string7, string8, z13, string9, z14, k4mVarValueOf, z15, arrayList, parcel.readString());
            case 4:
                return new fm3(parcel.readInt() != 0, EntryPoint.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
            case 5:
                return new gm3(EntryPoint.valueOf(parcel.readString()));
            case 6:
                return new hm3(parcel.readString(), parcel.createStringArrayList(), EntryPoint.valueOf(parcel.readString()), parcel.readInt() != 0);
            case 7:
                parcel.readInt();
                return im3.a;
            case 8:
                int iH = 0;
                EntryPoint entryPointValueOf = EntryPoint.valueOf(parcel.readString());
                wub1 parcelable2 = parcel.readParcelable(fn3.class.getClassLoader());
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                while (iH != i4) {
                    iH = x0d.h(fn3.class, parcel, arrayList2, iH, 1);
                }
                return new fn3(entryPointValueOf, parcelable2, arrayList2, parcel.readParcelable(fn3.class.getClassLoader()));
            case 9:
                return new qr3(parcel.readString(), parcel.readString(), parcel.readString());
            case 10:
                return new rr3(parcel.readString());
            case 11:
                int i5 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList3.add(dia1.valueOf(parcel.readString()));
                }
                return new tr3(arrayList3, sxc0.CREATOR.createFromParcel(parcel), (w7c0) parcel.readParcelable(tr3.class.getClassLoader()), parcel.readInt() != 0);
            case 12:
                return new rs3(EntryPoint.valueOf(parcel.readString()));
            case 13:
                return new fu3(parcel.readString());
            case 14:
                return new gu3(parcel.readString(), parcel.readString());
            case 15:
                return new vv3(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            case 16:
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                if (string12 != null) {
                    if (string12.equals("TRACK")) {
                        i2 = 1;
                    } else if (!string12.equals("AUDIOBOOK")) {
                        hhg1.n("No enum constant com.spotify.genalphablocking.childallowlistingrequest.bottomsheetpage.AllowListRequestContentType.".concat(string12));
                    }
                    return new mw3(i2, string10, string11);
                }
                bhn0.i("Name is null");
                i2 = 0;
                return new mw3(i2, string10, string11);
            case 17:
                return new sy3(aey.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
            case 18:
                int i7 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i7);
                while (iD != i7) {
                    iD = dsl0.d(ttm1.CREATOR, parcel, arrayList4, iD, 1);
                }
                return new uy3(arrayList4);
            case 19:
                parcel.readInt();
                return vy3.a;
            case 20:
                parcel.readInt();
                return xy3.a;
            case 21:
                return new dx4(parcel.createStringArray(), parcel.createIntArray());
            case 22:
                return new j65(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 23:
                parcel.readInt();
                return ed5.c;
            case 24:
                parcel.readInt();
                return fd5.c;
            case 25:
                return new gd5(parcel.readInt(), parcel.readInt());
            case 26:
                String string13 = parcel.readString();
                vkk1 parcelable3 = parcel.readParcelable(eh5.class.getClassLoader());
                int i8 = parcel.readInt();
                int iD3 = 0;
                ArrayList arrayList5 = new ArrayList(i8);
                while (iD3 != i8) {
                    iD3 = dsl0.d(eka1.CREATOR, parcel, arrayList5, iD3, 1);
                }
                return new eh5(string13, parcelable3, arrayList5, parcel.readString(), parcel.createStringArrayList());
            case 27:
                return new hh5(parcel.createStringArrayList(), parcel.readInt());
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                tk5 tk5Var = new tk5(parcel);
                tk5Var.a = parcel.readByte() != 0;
                return tk5Var;
            default:
                return new jo5((do5) parcel.readValue(jo5.class.getClassLoader()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new j93[i];
            case 1:
                return new mb3[i];
            case 2:
                return new lc3[i];
            case 3:
                return new ag3[i];
            case 4:
                return new fm3[i];
            case 5:
                return new gm3[i];
            case 6:
                return new hm3[i];
            case 7:
                return new im3[i];
            case 8:
                return new fn3[i];
            case 9:
                return new qr3[i];
            case 10:
                return new rr3[i];
            case 11:
                return new tr3[i];
            case 12:
                return new rs3[i];
            case 13:
                return new fu3[i];
            case 14:
                return new gu3[i];
            case 15:
                return new vv3[i];
            case 16:
                return new mw3[i];
            case 17:
                return new sy3[i];
            case 18:
                return new uy3[i];
            case 19:
                return new vy3[i];
            case 20:
                return new xy3[i];
            case 21:
                return new dx4[i];
            case 22:
                return new j65[i];
            case 23:
                return new ed5[i];
            case 24:
                return new fd5[i];
            case 25:
                return new gd5[i];
            case 26:
                return new eh5[i];
            case 27:
                return new hh5[i];
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return new tk5[i];
            default:
                return new jo5[i];
        }
    }
}
