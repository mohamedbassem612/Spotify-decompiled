package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ump0 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ ump0(byte b) {
        this.a = b;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x019b  */
    /* JADX WARN: Code duplicated, block: B:103:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:106:0x01aa  */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        int i = 4;
        int iD = 0;
        switch (this.a) {
            case 0:
                return new ymp0((xmp0) parcel.readParcelable(ymp0.class.getClassLoader()));
            case 1:
                return new vmp0((piz) parcel.readParcelable(vmp0.class.getClassLoader()));
            case 2:
                return new wmp0(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
            case 3:
                return new gnp0(parcel.readString(), parcel.readString());
            case 4:
                return new ynp0(parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
            case 5:
                boolean z3 = false;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                boolean z4 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z3 = true;
                }
                return new znp0(string, string2, string3, arrayListCreateStringArrayList, z4, z3);
            case 6:
                return new krp0(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
            case 7:
                return new lrp0(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
            case 8:
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                while (iD != i2) {
                    iD = dsl0.d(krp0.CREATOR, parcel, arrayList, iD, 1);
                }
                return new mrp0(arrayList);
            case 9:
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                while (iD != i3) {
                    iD = dsl0.d(lrp0.CREATOR, parcel, arrayList2, iD, 1);
                }
                return new nrp0(arrayList2);
            case 10:
                return tsp0.valueOf(parcel.readString());
            case 11:
                return ttp0.valueOf(parcel.readString());
            case 12:
                return new dup0(parcel.readString(), parcel.readString(), parcel.readString());
            case 13:
                return new eup0(parcel.readString(), parcel.readString(), parcel.readString());
            case 14:
                int i4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i4);
                while (iD != i4) {
                    iD = dsl0.d(dup0.CREATOR, parcel, arrayList3, iD, 1);
                }
                return new fup0(arrayList3);
            case 15:
                int i5 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i5);
                while (iD != i5) {
                    iD = dsl0.d(eup0.CREATOR, parcel, arrayList4, iD, 1);
                }
                return new gup0(arrayList4);
            case 16:
                fup0 fup0VarCreateFromParcel = null;
                int iD2 = 0;
                String string4 = parcel.readString();
                yxp0 yxp0VarCreateFromParcel = parcel.readInt() == 0 ? null : yxp0.CREATOR.createFromParcel(parcel);
                mrp0 mrp0VarCreateFromParcel = parcel.readInt() == 0 ? null : mrp0.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    fup0VarCreateFromParcel = fup0.CREATOR.createFromParcel(parcel);
                }
                fup0 fup0Var = fup0VarCreateFromParcel;
                int i6 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i6);
                while (iD2 != i6) {
                    iD2 = dsl0.d(ynp0.CREATOR, parcel, arrayList5, iD2, 1);
                }
                return new ovp0(string4, yxp0VarCreateFromParcel, mrp0VarCreateFromParcel, fup0Var, arrayList5);
            case 17:
                gup0 gup0VarCreateFromParcel = null;
                int iD3 = 0;
                String string5 = parcel.readString();
                zxp0 zxp0VarCreateFromParcel = parcel.readInt() == 0 ? null : zxp0.CREATOR.createFromParcel(parcel);
                nrp0 nrp0VarCreateFromParcel = parcel.readInt() == 0 ? null : nrp0.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    gup0VarCreateFromParcel = gup0.CREATOR.createFromParcel(parcel);
                }
                gup0 gup0Var = gup0VarCreateFromParcel;
                int i7 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i7);
                while (iD3 != i7) {
                    iD3 = dsl0.d(znp0.CREATOR, parcel, arrayList6, iD3, 1);
                }
                return new pvp0(string5, zxp0VarCreateFromParcel, nrp0VarCreateFromParcel, gup0Var, arrayList6);
            case 18:
                boolean z5 = false;
                int i8 = 4;
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                if (string9 != null) {
                    if (string9.equals("TRACK")) {
                        i8 = 1;
                    } else if (string9.equals("ALBUM")) {
                        i8 = 2;
                    } else if (string9.equals("EPISODE")) {
                        i8 = 3;
                    } else if (!string9.equals("PLAYLIST")) {
                        hhg1.n("No enum constant com.spotify.search.uiusecases.offlinerow.OfflineRowSearch.Type.".concat(string9));
                    }
                    int iS = fd21.s(parcel.readString());
                    k4m k4mVarValueOf = k4m.valueOf(parcel.readString());
                    z = false;
                    if (parcel.readInt() != 0) {
                        z5 = true;
                    }
                    z2 = false;
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    if (parcel.readInt() != 0) {
                        z2 = true;
                    }
                    return new awp0(string6, string7, string8, i8, iS, k4mVarValueOf, z5, z, z2);
                }
                bhn0.i("Name is null");
                i8 = 0;
                int iS2 = fd21.s(parcel.readString());
                k4m k4mVarValueOf2 = k4m.valueOf(parcel.readString());
                z = false;
                if (parcel.readInt() != 0) {
                    z5 = true;
                }
                z2 = false;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                return new awp0(string6, string7, string8, i8, iS2, k4mVarValueOf2, z5, z, z2);
            case 19:
                parcel.readInt();
                return hwp0.a;
            case 20:
                return new jwp0(parcel.readInt());
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                parcel.readInt();
                return lwp0.a;
            case 22:
                parcel.readInt();
                return nwp0.a;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                parcel.readInt();
                return pwp0.a;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                parcel.readInt();
                return rwp0.a;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                parcel.readInt();
                return twp0.a;
            case 26:
                String string10 = parcel.readString();
                if (string10 != null) {
                    if (string10.equals("IN_QUEUE")) {
                        i = 1;
                    } else if (string10.equals("OFFLINE_MODE")) {
                        i = 2;
                    } else if (string10.equals("NO_CONNECTION")) {
                        i = 3;
                    } else if (!string10.equals("SYNC_NOT_ALLOWED")) {
                        hhg1.n("No enum constant com.spotify.offline.util.WaitingReason.".concat(string10));
                    }
                    return new vwp0(i, parcel.readInt());
                }
                bhn0.i("Name is null");
                i = 0;
                return new vwp0(i, parcel.readInt());
            case 27:
                Object objCreateFromParcel = null;
                boolean z6 = true;
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                int i9 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i9);
                int iD4 = 0;
                while (iD4 != i9) {
                    iD4 = dsl0.d(txp0.CREATOR, parcel, arrayList7, iD4, 1);
                }
                if (parcel.readInt() != 0) {
                    objCreateFromParcel = rxp0.CREATOR.createFromParcel(parcel);
                }
                rxp0 rxp0Var = (rxp0) objCreateFromParcel;
                boolean z7 = parcel.readInt() != 0;
                boolean z8 = true;
                if (parcel.readInt() == 0) {
                    z6 = false;
                }
                if (parcel.readInt() == 0) {
                    z8 = false;
                }
                return new oxp0(string11, string12, string13, arrayList7, rxp0Var, z7, z6, z8);
            case 28:
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                sxp0 sxp0VarCreateFromParcel = null;
                String string16 = parcel.readString();
                int i10 = parcel.readInt();
                boolean z9 = true;
                ArrayList arrayList8 = new ArrayList(i10);
                int iD5 = 0;
                while (iD5 != i10) {
                    iD5 = dsl0.d(uxp0.CREATOR, parcel, arrayList8, iD5, 1);
                }
                if (parcel.readInt() != 0) {
                    sxp0VarCreateFromParcel = sxp0.CREATOR.createFromParcel(parcel);
                }
                sxp0 sxp0Var = sxp0VarCreateFromParcel;
                boolean z10 = true;
                if (parcel.readInt() == 0) {
                    z9 = false;
                }
                boolean z11 = true;
                if (parcel.readInt() == 0) {
                    z10 = false;
                }
                if (parcel.readInt() == 0) {
                    z11 = false;
                }
                return new pxp0(string14, string15, string16, arrayList8, sxp0Var, z9, z10, z11);
            default:
                return new rxp0(parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ymp0[i];
            case 1:
                return new vmp0[i];
            case 2:
                return new wmp0[i];
            case 3:
                return new gnp0[i];
            case 4:
                return new ynp0[i];
            case 5:
                return new znp0[i];
            case 6:
                return new krp0[i];
            case 7:
                return new lrp0[i];
            case 8:
                return new mrp0[i];
            case 9:
                return new nrp0[i];
            case 10:
                return new tsp0[i];
            case 11:
                return new ttp0[i];
            case 12:
                return new dup0[i];
            case 13:
                return new eup0[i];
            case 14:
                return new fup0[i];
            case 15:
                return new gup0[i];
            case 16:
                return new ovp0[i];
            case 17:
                return new pvp0[i];
            case 18:
                return new awp0[i];
            case 19:
                return new hwp0[i];
            case 20:
                return new jwp0[i];
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                return new lwp0[i];
            case 22:
                return new nwp0[i];
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                return new pwp0[i];
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                return new rwp0[i];
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                return new twp0[i];
            case 26:
                return new vwp0[i];
            case 27:
                return new oxp0[i];
            case 28:
                return new pxp0[i];
            default:
                return new rxp0[i];
        }
    }
}
