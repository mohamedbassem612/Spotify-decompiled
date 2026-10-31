package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ge51 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ ge51(byte b) {
        this.a = b;
    }

    /* JADX WARN: Code duplicated, block: B:154:0x0343  */
    /* JADX WARN: Code duplicated, block: B:156:0x034f  */
    /* JADX WARN: Code duplicated, block: B:158:0x0355  */
    /* JADX WARN: Code duplicated, block: B:162:0x0363 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:163:0x0365 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:164:0x0367 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:165:0x0369 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:166:0x036b  */
    /* JADX WARN: Code duplicated, block: B:168:0x0372  */
    /* JADX WARN: Code duplicated, block: B:169:0x0377  */
    /* JADX WARN: Code duplicated, block: B:170:0x037d  */
    /* JADX WARN: Code duplicated, block: B:171:0x0383  */
    /* JADX WARN: Code duplicated, block: B:172:0x0389  */
    /* JADX WARN: Code duplicated, block: B:173:0x038f  */
    /* JADX WARN: Code duplicated, block: B:245:0x04af A[LOOP:9: B:244:0x04ad->B:245:0x04af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:248:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:250:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:251:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:253:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:254:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:256:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:257:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:259:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:274:0x0357 A[SYNTHETIC] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        ArrayList arrayList;
        int iH;
        String string;
        int i2;
        hol1 qf50Var;
        int i3;
        ArrayList arrayList2;
        int i4;
        int iC;
        z6x z6xVarCreateStringArrayList;
        int i5 = 5;
        int iD = 0;
        switch (this.a) {
            case 0:
                return new he51(parcel.readString());
            case 1:
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                if (string3 != null) {
                    if (string3.equals("VIDEO_CAROUSEL")) {
                        i5 = 1;
                    } else if (string3.equals("GENERIC")) {
                        i5 = 2;
                    } else if (string3.equals("UNKNOWN")) {
                        i5 = 3;
                    } else if (string3.equals("CROSSWORD")) {
                        i5 = 4;
                    } else if (!string3.equals("INSTANT_MIX")) {
                        if (string3.equals("DIVIDER")) {
                            i5 = 6;
                        } else if (string3.equals("RELATED_SEARCHES")) {
                            i5 = 7;
                        } else if (string3.equals("START_A_CHAT")) {
                            i5 = 8;
                        } else if (string3.equals("AGENT")) {
                            i5 = 9;
                        } else if (string3.equals("CROSS_CONTENT_RELATED")) {
                            i5 = 10;
                        } else if (string3.equals("TRACK_VERSIONS")) {
                            i5 = 11;
                        } else if (string3.equals("SEARCH_OVERVIEW_PLACEHOLDER")) {
                            i5 = 12;
                        } else {
                            hhg1.n("No enum constant com.spotify.search.searchview.Section.Type.".concat(string3));
                        }
                    }
                    i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    iH = 0;
                    while (iH != i) {
                        iH = x0d.h(yf51.class, parcel, arrayList, iH, 1);
                    }
                    String string4 = parcel.readString();
                    string = parcel.readString();
                    if (string != null) {
                        if (string.equals("UNKNOWN")) {
                            i2 = 1;
                        } else if (string.equals("CAROUSEL")) {
                            i2 = 2;
                        } else if (string.equals("LIST")) {
                            i2 = 3;
                        } else {
                            hhg1.n("No enum constant com.spotify.search.searchview.Section.RenderHint.".concat(string));
                        }
                        return new yf51(string2, i5, arrayList, string4, i2, parcel.readString(), parcel.createStringArrayList(), parcel.readString());
                    }
                    bhn0.i("Name is null");
                    i2 = 0;
                    return new yf51(string2, i5, arrayList, string4, i2, parcel.readString(), parcel.createStringArrayList(), parcel.readString());
                }
                bhn0.i("Name is null");
                i5 = 0;
                i = parcel.readInt();
                arrayList = new ArrayList(i);
                iH = 0;
                while (iH != i) {
                    iH = x0d.h(yf51.class, parcel, arrayList, iH, 1);
                }
                String string5 = parcel.readString();
                string = parcel.readString();
                if (string != null) {
                    if (string.equals("UNKNOWN")) {
                        i2 = 1;
                    } else if (string.equals("CAROUSEL")) {
                        i2 = 2;
                    } else if (string.equals("LIST")) {
                        i2 = 3;
                    } else {
                        hhg1.n("No enum constant com.spotify.search.searchview.Section.RenderHint.".concat(string));
                    }
                    return new yf51(string2, i5, arrayList, string5, i2, parcel.readString(), parcel.createStringArrayList(), parcel.readString());
                }
                bhn0.i("Name is null");
                i2 = 0;
                return new yf51(string2, i5, arrayList, string5, i2, parcel.readString(), parcel.createStringArrayList(), parcel.readString());
            case 2:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                if (string8 == null) {
                    qf50Var = null;
                } else {
                    if (string8 != null) {
                        if (string8.equals("GRID")) {
                            i5 = 1;
                        } else if (string8.equals("CAROUSEL")) {
                            i5 = 2;
                        } else if (string8.equals("LIST")) {
                            i5 = 3;
                        } else if (string8.equals("HERO")) {
                            i5 = 4;
                        } else if (!string8.equals("WIDE")) {
                            hhg1.n("No enum constant com.spotify.liveevents.eventshub.domain.liveeventsview.UriContentParceler.Kind.".concat(string8));
                        }
                        if (i5 == 0) {
                            qf50Var = null;
                        } else {
                            i3 = parcel.readInt();
                            arrayList2 = new ArrayList(i3);
                            for (i4 = 0; i4 < i3; i4++) {
                                z6xVarCreateStringArrayList = parcel.createStringArrayList();
                                if (z6xVarCreateStringArrayList == null) {
                                    z6xVarCreateStringArrayList = z6x.a;
                                }
                                arrayList2.add(z6xVarCreateStringArrayList);
                            }
                            iC = l1d.C(i5);
                            if (iC != 0) {
                                qf50Var = new qf50(arrayList2);
                            } else if (iC != 1) {
                                qf50Var = new swd(arrayList2);
                            } else if (iC != 2) {
                                qf50Var = new pnc0(arrayList2);
                            } else if (iC != 3) {
                                qf50Var = new o660(arrayList2);
                            } else {
                                if (iC == 4) {
                                    eg.o();
                                    return null;
                                }
                                qf50Var = new hol1(arrayList2);
                            }
                        }
                    } else {
                        bhn0.i("Name is null");
                    }
                    i5 = 0;
                    if (i5 == 0) {
                        qf50Var = null;
                    } else {
                        i3 = parcel.readInt();
                        arrayList2 = new ArrayList(i3);
                        while (i4 < i3) {
                            z6xVarCreateStringArrayList = parcel.createStringArrayList();
                            if (z6xVarCreateStringArrayList == null) {
                                z6xVarCreateStringArrayList = z6x.a;
                            }
                            arrayList2.add(z6xVarCreateStringArrayList);
                        }
                        iC = l1d.C(i5);
                        if (iC != 0) {
                            qf50Var = new qf50(arrayList2);
                        } else if (iC != 1) {
                            qf50Var = new swd(arrayList2);
                        } else if (iC != 2) {
                            qf50Var = new pnc0(arrayList2);
                        } else if (iC != 3) {
                            qf50Var = new o660(arrayList2);
                        } else {
                            if (iC == 4) {
                                eg.o();
                                return null;
                            }
                            qf50Var = new hol1(arrayList2);
                        }
                    }
                }
                int i6 = 3;
                String string9 = parcel.readString();
                pa30 pa30VarCreateFromParcel = parcel.readInt() == 0 ? null : pa30.CREATOR.createFromParcel(parcel);
                oxc oxcVar = (oxc) (parcel.readInt() != 0 ? oxc.CREATOR.createFromParcel(parcel) : null);
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                boolean z = parcel.readInt() != 0;
                String string12 = parcel.readString();
                if (string12 != null) {
                    if (string12.equals("UNSPECIFIED")) {
                        i6 = 1;
                    } else if (string12.equals("URI")) {
                        i6 = 2;
                    } else if (!string12.equals("EDITORIAL")) {
                        hhg1.n("No enum constant com.spotify.liveevents.eventshub.domain.liveeventsview.SectionCtaType.".concat(string12));
                    }
                    return new uf51(string6, string7, qf50Var, string9, pa30VarCreateFromParcel, oxcVar, string10, string11, z, i6, parcel.readString());
                }
                bhn0.i("Name is null");
                i6 = 0;
                return new uf51(string6, string7, qf50Var, string9, pa30VarCreateFromParcel, oxcVar, string10, string11, z, i6, parcel.readString());
            case 3:
                int i7 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i7);
                while (iD != i7) {
                    iD = dsl0.d(q620.CREATOR, parcel, arrayList3, iD, 1);
                }
                return new sg51(arrayList3);
            case 4:
                return new hk51(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
            case 5:
                return new mk51(parcel.readString(), parcel.readString());
            case 6:
                return new nk51(parcel.readString(), parcel.readString());
            case 7:
                return new el51(parcel.readString(), parcel.readString());
            case 8:
                return new ll51(parcel.readString(), parcel.readString());
            case 9:
                return ym51.valueOf(parcel.readString());
            case 10:
                return new vo51(parcel.readString());
            case 11:
                return new gp51(parcel.readString(), parcel.readInt() != 0);
            case 12:
                return new jp51(parcel.readString(), parcel.readInt() != 0);
            case 13:
                return new sq51(parcel.readLong(), parcel.readInt() != 0);
            case 14:
                return new fr51(parcel.readString(), parcel.readString());
            case 15:
                int i8 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i8);
                while (iD != i8) {
                    iD = dsl0.d(c220.CREATOR, parcel, arrayList4, iD, 1);
                }
                return new mr51(parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), arrayList4);
            case 16:
                return new yv51(parcel.readString(), parcel.readString());
            case 17:
                ly31 ly31Var = (ly31) parcel.readParcelable(mz51.class.getClassLoader());
                int i9 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i9);
                while (iD != i9) {
                    arrayList5.add(Integer.valueOf(parcel.readInt()));
                    iD++;
                }
                return new mz51(ly31Var, arrayList5);
            case 18:
                return new c061(parcel.readString());
            case 19:
                return new f061(parcel.readInt(), parcel.readInt());
            case 20:
                int i10 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i10);
                while (iD != i10) {
                    iD = dsl0.d(f061.CREATOR, parcel, arrayList6, iD, 1);
                }
                return new g061(arrayList6);
            case 21:
                int i11 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    linkedHashSet.add(parcel.readParcelable(p061.class.getClassLoader()));
                }
                return new p061(linkedHashSet, parcel.readInt() != 0);
            case 22:
                return new z261(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
            case 23:
                return new d761(parcel.createByteArray());
            case 24:
                return new ka61((ivd) ivd.CREATOR.createFromParcel(parcel), parcel.readLong());
            case 25:
                return new la61((cns) cns.CREATOR.createFromParcel(parcel));
            case 26:
                stu0 stu0Var = (stu0) stu0.CREATOR.createFromParcel(parcel);
                ttu0 ttu0Var = (ttu0) ttu0.CREATOR.createFromParcel(parcel);
                hlg1 hlg1Var = (hlg1) hlg1.CREATOR.createFromParcel(parcel);
                int i13 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    linkedHashSet2.add(parcel.readParcelable(ma61.class.getClassLoader()));
                }
                k031 parcelable = parcel.readParcelable(ma61.class.getClassLoader());
                int i15 = parcel.readInt();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet(i15);
                int iG = 0;
                while (iG != i15) {
                    iG = k4s0.g(parcel, linkedHashSet3, iG, 1);
                }
                int i16 = parcel.readInt();
                LinkedHashSet linkedHashSet4 = new LinkedHashSet(i16);
                for (int i17 = 0; i17 != i16; i17++) {
                    linkedHashSet4.add(ajk1.CREATOR.createFromParcel(parcel));
                }
                return new ma61(stu0Var, ttu0Var, hlg1Var, linkedHashSet2, parcelable, linkedHashSet3, linkedHashSet4);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new lb61(parcel.readParcelable(lb61.class.getClassLoader()));
            case 28:
                return new th61(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt() != 0 ? yg8.valueOf(parcel.readString()) : null, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, (zcs0) zcs0.CREATOR.createFromParcel(parcel), parcel.readString(), (km) km.CREATOR.createFromParcel(parcel));
            default:
                return new kn61(parcel.readString(), parcel.readString(), parcel.readBundle(kn61.class.getClassLoader()), parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new he51[i];
            case 1:
                return new yf51[i];
            case 2:
                return new uf51[i];
            case 3:
                return new sg51[i];
            case 4:
                return new hk51[i];
            case 5:
                return new mk51[i];
            case 6:
                return new nk51[i];
            case 7:
                return new el51[i];
            case 8:
                return new ll51[i];
            case 9:
                return new ym51[i];
            case 10:
                return new vo51[i];
            case 11:
                return new gp51[i];
            case 12:
                return new jp51[i];
            case 13:
                return new sq51[i];
            case 14:
                return new fr51[i];
            case 15:
                return new mr51[i];
            case 16:
                return new yv51[i];
            case 17:
                return new mz51[i];
            case 18:
                return new c061[i];
            case 19:
                return new f061[i];
            case 20:
                return new g061[i];
            case 21:
                return new p061[i];
            case 22:
                return new z261[i];
            case 23:
                return new d761[i];
            case 24:
                return new ka61[i];
            case 25:
                return new la61[i];
            case 26:
                return new ma61[i];
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new lb61[i];
            case 28:
                return new th61[i];
            default:
                return new kn61[i];
        }
    }
}
