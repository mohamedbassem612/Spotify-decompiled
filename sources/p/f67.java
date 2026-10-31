package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f67 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ f67(byte b) {
        this.a = b;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x03ae A[LOOP:6: B:106:0x03ac->B:107:0x03ae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x03c0 A[LOOP:7: B:109:0x03be->B:110:0x03c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x03cc  */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        ArrayList arrayList;
        int iH;
        int i2;
        ArrayList arrayList2;
        int iH2;
        int i3 = 3;
        int iH3 = 0;
        switch (this.a) {
            case 0:
                return new g67((j2k1) parcel.readParcelable(g67.class.getClassLoader()));
            case 1:
                return new u67(chr0.valueOf(parcel.readString()));
            case 2:
                return new r87(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 3:
                return qb7.valueOf(parcel.readString());
            case 4:
                return new vb7(parcel.readString(), parcel.readString(), qb7.CREATOR.createFromParcel(parcel));
            case 5:
                return new yb7(parcel.readString(), parcel.readString(), parcel.readString(), qb7.CREATOR.createFromParcel(parcel));
            case 6:
                String string = parcel.readString();
                int i4 = 2;
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                boolean z = parcel.readInt() != 0;
                r620 r620VarValueOf = r620.valueOf(parcel.readString());
                int i5 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i5);
                int iH4 = 0;
                while (iH4 != i5) {
                    iH4 = x0d.h(sd7.class, parcel, arrayList3, iH4, 1);
                }
                String string4 = parcel.readString();
                if (string4 != null) {
                    if (string4.equals("NOT_LOADED")) {
                        i4 = 1;
                    } else if (!string4.equals("LOADED")) {
                        if (string4.equals("FAILED")) {
                            i4 = 3;
                        } else {
                            hhg1.n("No enum constant com.spotify.assistedcuration.searchpage.data.domain.LoadState.".concat(string4));
                        }
                    }
                    yd7 parcelable = parcel.readParcelable(sd7.class.getClassLoader());
                    i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    iH = 0;
                    while (iH != i) {
                        iH = x0d.h(sd7.class, parcel, arrayList, iH, 1);
                    }
                    i2 = parcel.readInt();
                    arrayList2 = new ArrayList(i2);
                    iH2 = 0;
                    while (iH2 != i2) {
                        iH2 = x0d.h(sd7.class, parcel, arrayList2, iH2, 1);
                    }
                    return new sd7(string, string2, string3, z, r620VarValueOf, arrayList3, i4, parcelable, arrayList, arrayList2, parcel.readInt() != 0);
                }
                bhn0.i("Name is null");
                i4 = 0;
                yd7 parcelable2 = parcel.readParcelable(sd7.class.getClassLoader());
                i = parcel.readInt();
                arrayList = new ArrayList(i);
                iH = 0;
                while (iH != i) {
                    iH = x0d.h(sd7.class, parcel, arrayList, iH, 1);
                }
                i2 = parcel.readInt();
                arrayList2 = new ArrayList(i2);
                iH2 = 0;
                while (iH2 != i2) {
                    iH2 = x0d.h(sd7.class, parcel, arrayList2, iH2, 1);
                }
                return new sd7(string, string2, string3, z, r620VarValueOf, arrayList3, i4, parcelable2, arrayList, arrayList2, parcel.readInt() != 0);
            case 7:
                return new td7(parcel.readParcelable(td7.class.getClassLoader()));
            case 8:
                return new ud7(parcel.readParcelable(ud7.class.getClassLoader()));
            case 9:
                return new vd7(parcel.readParcelable(vd7.class.getClassLoader()));
            case 10:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                if (string6 != null) {
                    if (string6.equals("TOP_TRACKS")) {
                        i3 = 1;
                    } else if (string6.equals("ALBUMS")) {
                        i3 = 2;
                    } else if (!string6.equals("SINGLES")) {
                        if (string6.equals("APPEARS_ON")) {
                            i3 = 4;
                        } else {
                            hhg1.n("No enum constant com.spotify.assistedcuration.searchpage.pages.entitypage.AssistedCurationSearchEntity.SeeAll.Category.".concat(string6));
                        }
                    }
                    return new wd7(string5, i3);
                }
                bhn0.i("Name is null");
                i3 = 0;
                return new wd7(string5, i3);
            case 11:
                return new xd7(parcel.readParcelable(xd7.class.getClassLoader()));
            case 12:
                return new be7(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readParcelable(be7.class.getClassLoader()), (me7) parcel.readParcelable(be7.class.getClassLoader()));
            case 13:
                return new fe7(parcel.readString(), (me7) parcel.readParcelable(fe7.class.getClassLoader()), parcel.readParcelable(fe7.class.getClassLoader()));
            case 14:
                int iH5 = 0;
                String string7 = parcel.readString();
                r620 r620VarValueOf2 = r620.valueOf(parcel.readString());
                yd7 parcelable3 = parcel.readParcelable(ie7.class.getClassLoader());
                int i6 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i6);
                int iH6 = 0;
                while (iH6 != i6) {
                    iH6 = x0d.h(ie7.class, parcel, arrayList4, iH6, 1);
                }
                int i7 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i7);
                while (iH5 != i7) {
                    iH5 = x0d.h(ie7.class, parcel, arrayList5, iH5, 1);
                }
                return new ie7(string7, r620VarValueOf2, parcelable3, arrayList4, arrayList5);
            case 15:
                return me7.valueOf(parcel.readString());
            case 16:
                String string8 = parcel.readString();
                int iH7 = 0;
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                me7 me7Var = (me7) parcel.readParcelable(pe7.class.getClassLoader());
                int i8 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i8);
                while (iH7 != i8) {
                    iH7 = x0d.h(pe7.class, parcel, arrayList6, iH7, 1);
                }
                return new pe7(string8, string9, string10, me7Var, arrayList6);
            case 17:
                int i9 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i9);
                while (iH3 != i9) {
                    iH3 = x0d.h(qe7.class, parcel, arrayList7, iH3, 1);
                }
                return new qe7(parcel.readString(), arrayList7, parcel.readParcelable(qe7.class.getClassLoader()));
            case 18:
                String string11 = parcel.readString();
                me7 me7VarCreateFromParcel = me7.CREATOR.createFromParcel(parcel);
                int i10 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i10);
                while (iH3 != i10) {
                    iH3 = x0d.h(re7.class, parcel, arrayList8, iH3, 1);
                }
                return new re7(string11, me7VarCreateFromParcel, arrayList8);
            case 19:
                return new ng7(parcel.readString());
            case 20:
                return new og7(parcel.readString(), parcel.readString());
            case 21:
                parcel.readInt();
                return ck7.a;
            case 22:
                return new ol7(parcel.readString());
            case 23:
                parcel.readInt();
                return kr7.a;
            case 24:
                return new lr7(parcel.readString(), parcel.readParcelable(lr7.class.getClassLoader()));
            case 25:
                parcel.readInt();
                return mr7.a;
            case 26:
                return new pr7(parcel.readString(), parcel.readString(), parcel.readParcelable(pr7.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readParcelable(pr7.class.getClassLoader()), parcel.readParcelable(pr7.class.getClassLoader()), 256);
            case 27:
                return new qr7(parcel.readParcelable(qr7.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
            case 28:
                return new lt7(parcel.readParcelable(lt7.class.getClassLoader()), lf51.r(parcel.readString()), parcel.readParcelable(lt7.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readParcelable(lt7.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readParcelable(lt7.class.getClassLoader()), parcel.readParcelable(lt7.class.getClassLoader()), parcel.readString(), (wkt) null);
            default:
                return new mt7(parcel.readParcelable(mt7.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readParcelable(mt7.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readParcelable(mt7.class.getClassLoader()), parcel.readParcelable(mt7.class.getClassLoader()), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new g67[i];
            case 1:
                return new u67[i];
            case 2:
                return new r87[i];
            case 3:
                return new qb7[i];
            case 4:
                return new vb7[i];
            case 5:
                return new yb7[i];
            case 6:
                return new sd7[i];
            case 7:
                return new td7[i];
            case 8:
                return new ud7[i];
            case 9:
                return new vd7[i];
            case 10:
                return new wd7[i];
            case 11:
                return new xd7[i];
            case 12:
                return new be7[i];
            case 13:
                return new fe7[i];
            case 14:
                return new ie7[i];
            case 15:
                return new me7[i];
            case 16:
                return new pe7[i];
            case 17:
                return new qe7[i];
            case 18:
                return new re7[i];
            case 19:
                return new ng7[i];
            case 20:
                return new og7[i];
            case 21:
                return new ck7[i];
            case 22:
                return new ol7[i];
            case 23:
                return new kr7[i];
            case 24:
                return new lr7[i];
            case 25:
                return new mr7[i];
            case 26:
                return new pr7[i];
            case 27:
                return new qr7[i];
            case 28:
                return new lt7[i];
            default:
                return new mt7[i];
        }
    }
}
