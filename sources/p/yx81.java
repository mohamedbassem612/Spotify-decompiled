package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yx81 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    /* JADX WARN: Code duplicated, block: B:69:0x0124  */
    /* JADX WARN: Code duplicated, block: B:72:0x012d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0135  */
    /* JADX WARN: Code duplicated, block: B:75:0x0137  */
    /* JADX WARN: Code duplicated, block: B:77:0x013f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0141  */
    /* JADX WARN: Code duplicated, block: B:80:0x014c  */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        String string;
        int i2 = 1;
        int iG = 0;
        switch (this.a) {
            case 0:
                return new zx81(xlk1.valueOf(parcel.readString()));
            case 1:
                parcel.readInt();
                return ay81.a;
            case 2:
                ivd ivdVar = (ivd) ivd.CREATOR.createFromParcel(parcel);
                long j = parcel.readLong();
                int i3 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i3);
                while (iG != i3) {
                    iG = k4s0.g(parcel, linkedHashSet, iG, 1);
                }
                return new v491(ivdVar, j, linkedHashSet);
            case 3:
                return new w591(parcel.readString());
            case 4:
                return new x591(r591.valueOf(parcel.readString()));
            case 5:
                return new z591(r591.valueOf(parcel.readString()));
            case 6:
                return new f691(parcel.readString());
            case 7:
                return new ca91(parcel.readString(), d991.valueOf(parcel.readString()));
            case 8:
                return new la91(parcel.readString());
            case 9:
                String string2 = parcel.readString();
                tka0 tka0VarB = string2 == null ? null : rc11.a.b(Class.forName(string2));
                int i4 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i4);
                while (iG != i4) {
                    String string3 = parcel.readString();
                    arrayList.add(string3 == null ? null : rc11.a.b(Class.forName(string3)));
                    iG++;
                }
                return new fd91(tka0VarB, arrayList);
            case 10:
                return new wt91(parcel.readString(), parcel.readLong(), parcel.readInt() != 0 ? vt91.CREATOR.createFromParcel(parcel) : null);
            case 11:
                return new vt91(parcel.readString(), parcel.readString(), parcel.readString());
            case 12:
                int i5 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i5);
                while (iG != i5) {
                    iG = dsl0.d(hg50.CREATOR, parcel, arrayList2, iG, 1);
                }
                return new mu91(arrayList2, t5u.valueOf(parcel.readString()));
            case 13:
                int i6 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i6);
                while (iG != i6) {
                    iG = dsl0.d(jp51.CREATOR, parcel, arrayList3, iG, 1);
                }
                return new kw91(arrayList3);
            case 14:
                return new zw91(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 15:
                return new i9a1(parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString());
            case 16:
                return new rda1(parcel.readString());
            case 17:
                return new tea1(parcel.readString());
            case 18:
                return new uea1(parcel.readString(), parcel.readString());
            case 19:
                return new vea1(parcel.readString());
            case 20:
                parcel.readInt();
                return yea1.a;
            case 21:
                parcel.readInt();
                return gfa1.a;
            case 22:
                String string4 = parcel.readString();
                if (string4 != null) {
                    if (string4.equals("ASC")) {
                        i = 1;
                    } else if (string4.equals("DESC")) {
                        i = 2;
                    } else {
                        hhg1.n("No enum constant com.spotify.filterandsort.api.model.Order.".concat(string4));
                    }
                    string = parcel.readString();
                    if (string != null) {
                        if (!string.equals("ALPHABETIC")) {
                            if (string.equals("DATE")) {
                                i2 = 2;
                            } else if (string.equals("NONE")) {
                                i2 = 3;
                            } else {
                                hhg1.n("No enum constant com.spotify.filterandsort.api.model.SortSelection.".concat(string));
                            }
                        }
                        return new qha1(i, i2);
                    }
                    bhn0.i("Name is null");
                    i2 = 0;
                    return new qha1(i, i2);
                }
                bhn0.i("Name is null");
                i = 0;
                string = parcel.readString();
                if (string != null) {
                    if (!string.equals("ALPHABETIC")) {
                        if (string.equals("DATE")) {
                            i2 = 2;
                        } else if (string.equals("NONE")) {
                            i2 = 3;
                        } else {
                            hhg1.n("No enum constant com.spotify.filterandsort.api.model.SortSelection.".concat(string));
                        }
                    }
                    return new qha1(i, i2);
                }
                bhn0.i("Name is null");
                i2 = 0;
                return new qha1(i, i2);
            case 23:
                return new uha1(parcel.readString(), sha1.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0 ? qha1.CREATOR.createFromParcel(parcel) : null);
            case 24:
                return new cia1(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0 ? rha1.valueOf(parcel.readString()) : null);
            case 25:
                dia1 dia1VarValueOf = dia1.valueOf(parcel.readString());
                int i7 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    arrayList4.add(dia1.valueOf(parcel.readString()));
                }
                int i9 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i9);
                while (iG != i9) {
                    iG = x0d.h(hia1.class, parcel, arrayList5, iG, 1);
                }
                return new hia1(dia1VarValueOf, arrayList4, arrayList5);
            case 26:
                return new jia1(zha1.valueOf(parcel.readString()));
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new mia1(parcel.readString(), parcel.readInt() != 0, (mia1) (parcel.readInt() != 0 ? mia1.CREATOR.createFromParcel(parcel) : null));
            case 28:
                return new nia1(parcel.readString(), parcel.readInt() != 0, (nia1) (parcel.readInt() != 0 ? nia1.CREATOR.createFromParcel(parcel) : null));
            default:
                return pia1.valueOf(parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new zx81[i];
            case 1:
                return new ay81[i];
            case 2:
                return new v491[i];
            case 3:
                return new w591[i];
            case 4:
                return new x591[i];
            case 5:
                return new z591[i];
            case 6:
                return new f691[i];
            case 7:
                return new ca91[i];
            case 8:
                return new la91[i];
            case 9:
                return new fd91[i];
            case 10:
                return new wt91[i];
            case 11:
                return new vt91[i];
            case 12:
                return new mu91[i];
            case 13:
                return new kw91[i];
            case 14:
                return new zw91[i];
            case 15:
                return new i9a1[i];
            case 16:
                return new rda1[i];
            case 17:
                return new tea1[i];
            case 18:
                return new uea1[i];
            case 19:
                return new vea1[i];
            case 20:
                return new yea1[i];
            case 21:
                return new gfa1[i];
            case 22:
                return new qha1[i];
            case 23:
                return new uha1[i];
            case 24:
                return new cia1[i];
            case 25:
                return new hia1[i];
            case 26:
                return new jia1[i];
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new mia1[i];
            case 28:
                return new nia1[i];
            default:
                return new pia1[i];
        }
    }
}
