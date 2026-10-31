package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zge implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    /* JADX WARN: Code duplicated, block: B:86:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a5  */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        boolean z;
        int i2;
        int iD = 0;
        switch (this.a) {
            case 0:
                return new dhe(((vve1) parcel.readParcelable(dhe.class.getClassLoader())).a, parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
            case 1:
                return new zje(parcel.readString(), parcel.readString());
            case 2:
                return new dke((che) che.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt());
            case 3:
                return new kke(wke.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 4:
                return new lke(parcel.readString(), parcel.readString(), parcel.readString());
            case 5:
                return new wke(parcel.readString(), parcel.readString());
            case 6:
                return lle.valueOf(parcel.readString());
            case 7:
                return new gme(parcel.readString());
            case 8:
                return new gne(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
            case 9:
                String string = parcel.readString();
                ctf parcelable = parcel.readParcelable(goe.class.getClassLoader());
                zks0 zks0Var = (zks0) zks0.CREATOR.createFromParcel(parcel);
                gxz0 gxz0Var = (gxz0) (parcel.readInt() == 0 ? null : gxz0.CREATOR.createFromParcel(parcel));
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                int iD2 = 0;
                while (iD2 != i3) {
                    iD2 = dsl0.d(jwm.CREATOR, parcel, arrayList, iD2, 1);
                }
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                int iD3 = 0;
                while (iD3 != i4) {
                    iD3 = dsl0.d(tom.CREATOR, parcel, arrayList2, iD3, 1);
                }
                return new goe(string, parcelable, zks0Var, gxz0Var, arrayList, arrayList2, parcel.readInt(), (jlh1) jlh1.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readLong(), parcel.readInt() != 0, parcel.readParcelable(goe.class.getClassLoader()));
            case 10:
                return new jse(parcel.readString(), parcel.createStringArrayList(), parcel.readString());
            case 11:
                return new rse(parcel.readString());
            case 12:
                return new sse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            case 13:
                return new tse(parcel.readParcelable(tse.class.getClassLoader()));
            case 14:
                return new wse(parcel.readString(), parcel.readString());
            case 15:
                String string2 = parcel.readString();
                if (string2 != null) {
                    if (string2.equals("SEARCH")) {
                        i = 1;
                    } else {
                        if (string2.equals("LYRICS_STICKERS")) {
                            i2 = 2;
                        } else if (string2.equals("GIFS")) {
                            i2 = 3;
                        } else {
                            hhg1.n("No enum constant com.spotify.campfire.chatcontentpickerpage.pagecontract.ChatContentPickerTabId.".concat(string2));
                        }
                        i = i2;
                    }
                    String string3 = parcel.readString();
                    hux parcelable2 = parcel.readParcelable(xse.class.getClassLoader());
                    String string4 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return new xse(i, string3, parcelable2, string4, z);
                }
                bhn0.i("Name is null");
                i = 0;
                String string5 = parcel.readString();
                hux parcelable3 = parcel.readParcelable(xse.class.getClassLoader());
                String string6 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return new xse(i, string5, parcelable3, string6, z);
            case 16:
                w4i1 parcelable4 = parcel.readParcelable(ete.class.getClassLoader());
                int i5 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i5);
                int iD4 = 0;
                while (iD4 != i5) {
                    iD4 = dsl0.d(vy30.CREATOR, parcel, arrayList3, iD4, 1);
                }
                return new ete(parcel.readString(), parcel.readString(), arrayList3, parcelable4, parcel.readInt() != 0);
            case 17:
                String string7 = parcel.readString();
                boolean z2 = parcel.readInt() != 0;
                ctf parcelable5 = parcel.readParcelable(qte.class.getClassLoader());
                zks0 zks0Var2 = (zks0) zks0.CREATOR.createFromParcel(parcel);
                int i6 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i6);
                int iD5 = 0;
                while (iD5 != i6) {
                    iD5 = dsl0.d(jwm.CREATOR, parcel, arrayList4, iD5, 1);
                }
                int i7 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i7);
                while (iD != i7) {
                    iD = dsl0.d(tom.CREATOR, parcel, arrayList5, iD, 1);
                }
                return new qte(string7, z2, parcelable5, zks0Var2, arrayList4, arrayList5);
            case 18:
                return new ute(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 19:
                return new bve(parcel.readParcelable(bve.class.getClassLoader()), parcel.readInt() != 0);
            case 20:
                return new gve(parcel.readString(), parcel.readString(), parcel.readString());
            case 21:
                return new hve(parcel.readString());
            case 22:
                return new mve(parcel.readParcelable(mve.class.getClassLoader()));
            case 23:
                parcel.readInt();
                return ive.a;
            case 24:
                parcel.readInt();
                return jve.a;
            case 25:
                return new kve(parcel.readString());
            case 26:
                return new gwe(parcel.readString());
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                parcel.readInt();
                return hwe.a;
            case 28:
                return new aaf(parcel.readString());
            default:
                return new abf(parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new dhe[i];
            case 1:
                return new zje[i];
            case 2:
                return new dke[i];
            case 3:
                return new kke[i];
            case 4:
                return new lke[i];
            case 5:
                return new wke[i];
            case 6:
                return new lle[i];
            case 7:
                return new gme[i];
            case 8:
                return new gne[i];
            case 9:
                return new goe[i];
            case 10:
                return new jse[i];
            case 11:
                return new rse[i];
            case 12:
                return new sse[i];
            case 13:
                return new tse[i];
            case 14:
                return new wse[i];
            case 15:
                return new xse[i];
            case 16:
                return new ete[i];
            case 17:
                return new qte[i];
            case 18:
                return new ute[i];
            case 19:
                return new bve[i];
            case 20:
                return new gve[i];
            case 21:
                return new hve[i];
            case 22:
                return new mve[i];
            case 23:
                return new ive[i];
            case 24:
                return new jve[i];
            case 25:
                return new kve[i];
            case 26:
                return new gwe[i];
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new hwe[i];
            case 28:
                return new aaf[i];
            default:
                return new abf[i];
        }
    }
}
