package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.campfire.chatcontentpickerpage.search.domain.EntityType;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class utx implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ utx(byte b) {
        this.a = b;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x022c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0234  */
    /* JADX WARN: Code duplicated, block: B:107:0x0236  */
    /* JADX WARN: Code duplicated, block: B:110:0x023f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0247  */
    /* JADX WARN: Code duplicated, block: B:113:0x0249  */
    /* JADX WARN: Code duplicated, block: B:115:0x0254  */
    /* JADX WARN: Code duplicated, block: B:118:0x025e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0260  */
    /* JADX WARN: Code duplicated, block: B:122:0x0270 A[LOOP:3: B:121:0x026e->B:122:0x0270, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        String string;
        boolean z;
        int i;
        ArrayList arrayList;
        int i2 = 4;
        switch (this.a) {
            case 0:
                parcel.readInt();
                return vtx.c;
            case 1:
                parcel.readInt();
                return wtx.c;
            case 2:
                parcel.readInt();
                return xtx.c;
            case 3:
                parcel.readInt();
                return ytx.c;
            case 4:
                parcel.readInt();
                return ztx.c;
            case 5:
                parcel.readInt();
                return aux.c;
            case 6:
                parcel.readInt();
                return bux.c;
            case 7:
                parcel.readInt();
                return cux.c;
            case 8:
                parcel.readInt();
                return dux.c;
            case 9:
                parcel.readInt();
                return eux.c;
            case 10:
                parcel.readInt();
                return gux.c;
            case 11:
                parcel.readInt();
                return e5y.a;
            case 12:
                return new w7y(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 13:
                return new z7y(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 14:
                int iD = 0;
                String string2 = parcel.readString();
                long j = parcel.readLong();
                String string3 = parcel.readString();
                boolean z2 = parcel.readInt() != 0;
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                msd msdVar = (msd) parcel.readParcelable(v9y.class.getClassLoader());
                l1f1 l1f1VarValueOf = parcel.readInt() != 0 ? l1f1.valueOf(parcel.readString()) : null;
                vef0 parcelable = parcel.readParcelable(v9y.class.getClassLoader());
                kw9 kw9Var = (kw9) parcel.readParcelable(v9y.class.getClassLoader());
                chf0 chf0VarValueOf = chf0.valueOf(parcel.readString());
                int iU = pze0.u(parcel.readString());
                boolean z3 = parcel.readInt() != 0;
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                while (iD != i3) {
                    iD = dsl0.d(t5t0.CREATOR, parcel, arrayList2, iD, 1);
                }
                return new v9y(string2, j, string3, z2, numValueOf, msdVar, l1f1VarValueOf, parcelable, kw9Var, chf0VarValueOf, iU, z3, arrayList2, 1056);
            case 15:
                String string4 = parcel.readString();
                long j2 = parcel.readLong();
                String string5 = parcel.readString();
                int i4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    arrayList3.add(Integer.valueOf(parcel.readInt()));
                }
                return new aay(string4, j2, string5, arrayList3);
            case 16:
                String string6 = parcel.readString();
                int i6 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i6);
                int iF = 0;
                while (iF != i6) {
                    iF = cfm0.f(parcel, linkedHashMap, parcel.readString(), iF, 1);
                }
                cqs0 cqs0VarG = mqo1.G(linkedHashMap);
                int i7 = parcel.readInt();
                int iD2 = 0;
                int i8 = parcel.readInt();
                int i9 = 2;
                int i10 = parcel.readInt();
                String string7 = parcel.readString();
                if (string7 != null) {
                    if (string7.equals("CLASSIC")) {
                        i2 = 1;
                    } else if (string7.equals("WIDE")) {
                        i2 = 2;
                    } else if (string7.equals("NARROW")) {
                        i2 = 3;
                    } else if (!string7.equals("SLANTED")) {
                        hhg1.n("No enum constant com.spotify.stickers.enhancedsharecard.FontStyle.".concat(string7));
                    }
                    string = parcel.readString();
                    if (string != null) {
                        if (string.equals("LEFT")) {
                            i9 = 1;
                        } else if (!string.equals("CENTER")) {
                            if (string.equals("RIGHT")) {
                                i9 = 3;
                            } else {
                                hhg1.n("No enum constant com.spotify.stickers.enhancedsharecard.Alignment.".concat(string));
                            }
                        }
                        if (parcel.readInt() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String string8 = parcel.readString();
                        i = parcel.readInt();
                        arrayList = new ArrayList(i);
                        while (iD2 != i) {
                            iD2 = dsl0.d(v5t0.CREATOR, parcel, arrayList, iD2, 1);
                        }
                        return new cay(string6, cqs0VarG, i7, i8, i10, i2, i9, z, string8, arrayList);
                    }
                    bhn0.i("Name is null");
                    i9 = 0;
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String string9 = parcel.readString();
                    i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    while (iD2 != i) {
                        iD2 = dsl0.d(v5t0.CREATOR, parcel, arrayList, iD2, 1);
                    }
                    return new cay(string6, cqs0VarG, i7, i8, i10, i2, i9, z, string9, arrayList);
                }
                bhn0.i("Name is null");
                i2 = 0;
                string = parcel.readString();
                if (string != null) {
                    if (string.equals("LEFT")) {
                        i9 = 1;
                    } else if (!string.equals("CENTER")) {
                        if (string.equals("RIGHT")) {
                            i9 = 3;
                        } else {
                            hhg1.n("No enum constant com.spotify.stickers.enhancedsharecard.Alignment.".concat(string));
                        }
                    }
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String string10 = parcel.readString();
                    i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    while (iD2 != i) {
                        iD2 = dsl0.d(v5t0.CREATOR, parcel, arrayList, iD2, 1);
                    }
                    return new cay(string6, cqs0VarG, i7, i8, i10, i2, i9, z, string10, arrayList);
                }
                bhn0.i("Name is null");
                i9 = 0;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                String string11 = parcel.readString();
                i = parcel.readInt();
                arrayList = new ArrayList(i);
                while (iD2 != i) {
                    iD2 = dsl0.d(v5t0.CREATOR, parcel, arrayList, iD2, 1);
                }
                return new cay(string6, cqs0VarG, i7, i8, i10, i2, i9, z, string11, arrayList);
            case 17:
                return new lby(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (ei90) parcel.readParcelable(lby.class.getClassLoader()), (fby) parcel.readParcelable(lby.class.getClassLoader()), parcel.readInt() != 0 ? o940.CREATOR.createFromParcel(parcel) : null);
            case 18:
                return new hby(parcel.readString(), EntityType.valueOf(parcel.readString()));
            case 19:
                parcel.readInt();
                return cby.a;
            case 20:
                parcel.readInt();
                return dby.a;
            case 21:
                parcel.readInt();
                return eby.a;
            case 22:
                parcel.readInt();
                return ahy.a;
            case 23:
                return new bhy(parcel.readInt(), (ttm1) ttm1.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, as3.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
            case 24:
                return new chy(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 25:
                return new dhy(parcel.readString(), parcel.readParcelable(dhy.class.getClassLoader()));
            case 26:
                return new fhy(parcel.readString(), parcel.readParcelable(fhy.class.getClassLoader()));
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                String string12 = parcel.readString();
                if (string12 != null) {
                    if (string12.equals("Artist")) {
                        i2 = 1;
                    } else if (string12.equals("Podcast")) {
                        i2 = 2;
                    } else if (string12.equals("Event")) {
                        i2 = 3;
                    } else if (!string12.equals("ImportMusic")) {
                        hhg1.n("No enum constant com.spotify.yourlibrary.yourlibraryx.shared.view.EntityItem.Onboarding.Type.".concat(string12));
                    }
                    return new ghy(i2, parcel.readString(), parcel.readInt() != 0, as3.valueOf(parcel.readString()));
                }
                bhn0.i("Name is null");
                i2 = 0;
                return new ghy(i2, parcel.readString(), parcel.readInt() != 0, as3.valueOf(parcel.readString()));
            case 28:
                int i11 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i11);
                int iD3 = 0;
                while (iD3 != i11) {
                    iD3 = dsl0.d(ttm1.CREATOR, parcel, arrayList4, iD3, 1);
                }
                a3t0 a3t0VarValueOf = a3t0.valueOf(parcel.readString());
                int i12 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i12);
                int iG = 0;
                while (iG != i12) {
                    iG = k4s0.g(parcel, linkedHashSet, iG, 1);
                }
                return new hhy(arrayList4, a3t0VarValueOf, linkedHashSet, parcel.readInt() != 0);
            default:
                return new ihy(parcel.readInt(), as3.valueOf(parcel.readString()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new vtx[i];
            case 1:
                return new wtx[i];
            case 2:
                return new xtx[i];
            case 3:
                return new ytx[i];
            case 4:
                return new ztx[i];
            case 5:
                return new aux[i];
            case 6:
                return new bux[i];
            case 7:
                return new cux[i];
            case 8:
                return new dux[i];
            case 9:
                return new eux[i];
            case 10:
                return new gux[i];
            case 11:
                return new e5y[i];
            case 12:
                return new w7y[i];
            case 13:
                return new z7y[i];
            case 14:
                return new v9y[i];
            case 15:
                return new aay[i];
            case 16:
                return new cay[i];
            case 17:
                return new lby[i];
            case 18:
                return new hby[i];
            case 19:
                return new cby[i];
            case 20:
                return new dby[i];
            case 21:
                return new eby[i];
            case 22:
                return new ahy[i];
            case 23:
                return new bhy[i];
            case 24:
                return new chy[i];
            case 25:
                return new dhy[i];
            case 26:
                return new fhy[i];
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new ghy[i];
            case 28:
                return new hhy[i];
            default:
                return new ihy[i];
        }
    }
}
