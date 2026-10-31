package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cyh0 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    /* JADX WARN: Code duplicated, block: B:100:0x0273  */
    /* JADX WARN: Code duplicated, block: B:103:0x027e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0286  */
    /* JADX WARN: Code duplicated, block: B:106:0x0288  */
    /* JADX WARN: Code duplicated, block: B:108:0x0294  */
    /* JADX WARN: Code duplicated, block: B:111:0x029e  */
    /* JADX WARN: Code duplicated, block: B:112:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:115:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:116:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:119:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:120:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:123:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:124:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:127:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:128:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:44:0x0102  */
    /* JADX WARN: Code duplicated, block: B:97:0x0268  */
    /* JADX WARN: Code duplicated, block: B:99:0x0270  */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        String string;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i3;
        boolean z6;
        int i4 = 2;
        switch (this.a) {
            case 0:
                return new MediaSessionCompat.QueueItem(parcel);
            case 1:
                return new MediaSessionCompat.Token(parcel.readParcelable(null), (lh70) null, 0);
            case 2:
                return h3i0.valueOf(parcel.readString());
            case 3:
                return new m3i0((u3i0) parcel.readParcelable(m3i0.class.getClassLoader()), parcel.readInt());
            case 4:
                return new u3i0(parcel.readString(), parcel.readParcelable(u3i0.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0 ? o6i0.valueOf(parcel.readString()) : null, parcel.readString());
            case 5:
                return new n3i0(parcel.readParcelable(n3i0.class.getClassLoader()));
            case 6:
                return new o3i0(parcel.readString());
            case 7:
                return new p3i0(parcel.readParcelable(p3i0.class.getClassLoader()));
            case 8:
                return new r3i0(parcel.readParcelable(r3i0.class.getClassLoader()), parcel.readParcelable(r3i0.class.getClassLoader()));
            case 9:
                return new s3i0(parcel.readParcelable(s3i0.class.getClassLoader()));
            case 10:
                return new o5i0(parcel.readParcelable(o5i0.class.getClassLoader()), parcel.readParcelable(o5i0.class.getClassLoader()));
            case 11:
                v5i0 v5i0Var = (v5i0) v5i0.CREATOR.createFromParcel(parcel);
                int i5 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                }
                p5i0 parcelable = parcel.readParcelable(u5i0.class.getClassLoader());
                String string2 = parcel.readString();
                o5i0 o5i0Var = (o5i0) o5i0.CREATOR.createFromParcel(parcel);
                String string3 = parcel.readString();
                if (string3 != null) {
                    if (string3.equals("START_ONLY")) {
                        i = 1;
                    } else if (string3.equals("DRAGGABLE")) {
                        i = 2;
                    } else {
                        hhg1.n("No enum constant com.spotify.mediatrimmer.mediatrimmerimpl.MediaTrimmerElement.Props.TrimMode.".concat(string3));
                    }
                    string = parcel.readString();
                    if (string != null) {
                        if (string.equals("SHARE_CLIP")) {
                            i2 = 1;
                        } else {
                            if (!string.equals("CREATE_CLIP")) {
                                if (string.equals("EDIT_CLIP")) {
                                    i4 = 3;
                                } else {
                                    hhg1.n("No enum constant com.spotify.mediatrimmer.mediatrimmerimpl.MediaTrimmerElement.Props.PageMode.".concat(string));
                                }
                            }
                            i2 = i4;
                        }
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
                        if (parcel.readInt() != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
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
                        return new u5i0(v5i0Var, arrayList, parcelable, string2, o5i0Var, i, i2, z, z2, z3, z4, z5, parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readParcelable(u5i0.class.getClassLoader()), 405504);
                    }
                    bhn0.i("Name is null");
                    i2 = 0;
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
                    if (parcel.readInt() != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
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
                    return new u5i0(v5i0Var, arrayList, parcelable, string2, o5i0Var, i, i2, z, z2, z3, z4, z5, parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readParcelable(u5i0.class.getClassLoader()), 405504);
                }
                bhn0.i("Name is null");
                i = 0;
                string = parcel.readString();
                if (string != null) {
                    if (string.equals("SHARE_CLIP")) {
                        i2 = 1;
                    } else {
                        if (!string.equals("CREATE_CLIP")) {
                            if (string.equals("EDIT_CLIP")) {
                                i4 = 3;
                            } else {
                                hhg1.n("No enum constant com.spotify.mediatrimmer.mediatrimmerimpl.MediaTrimmerElement.Props.PageMode.".concat(string));
                            }
                        }
                        i2 = i4;
                    }
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
                    if (parcel.readInt() != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
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
                    return new u5i0(v5i0Var, arrayList, parcelable, string2, o5i0Var, i, i2, z, z2, z3, z4, z5, parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readParcelable(u5i0.class.getClassLoader()), 405504);
                }
                bhn0.i("Name is null");
                i2 = 0;
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
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
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
                return new u5i0(v5i0Var, arrayList, parcelable, string2, o5i0Var, i, i2, z, z2, z3, z4, z5, parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readParcelable(u5i0.class.getClassLoader()), 405504);
            case 12:
                parcel.readInt();
                return p5i0.a;
            case 13:
                parcel.readInt();
                return q5i0.a;
            case 14:
                int i7 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    linkedHashMap.put(parcel.readParcelable(r5i0.class.getClassLoader()), Integer.valueOf(parcel.readInt()));
                }
                return new r5i0(linkedHashMap);
            case 15:
                parcel.readInt();
                return s5i0.a;
            case 16:
                boolean z7 = parcel.readInt() != 0;
                long j = parcel.readLong();
                int i9 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i9);
                int iH = 0;
                while (iH != i9) {
                    iH = x0d.h(v5i0.class, parcel, arrayList2, iH, 1);
                }
                int i10 = parcel.readInt();
                int i11 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i11);
                int iH2 = 0;
                while (iH2 != i11) {
                    iH2 = x0d.h(v5i0.class, parcel, arrayList3, iH2, 1);
                }
                return new v5i0(z7, j, arrayList2, i10, arrayList3, parcel.readString(), parcel.readParcelable(v5i0.class.getClassLoader()));
            case 17:
                parcel.readInt();
                return s6i0.a;
            case 18:
                return new t6i0(parcel.readString(), parcel.readString(), new n5f0(parcel.readLong(), parcel.readLong()));
            case 19:
                return new z6i0((u3i0) parcel.readParcelable(z6i0.class.getClassLoader()));
            case 20:
                return new g7i0(parcel.readParcelable(g7i0.class.getClassLoader()), pze0.t(parcel.readString()));
            case 21:
                return new ihi0(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            case 22:
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                dx parcelable2 = parcel.readParcelable(fli0.class.getClassLoader());
                String string8 = parcel.readString();
                if (string8 != null) {
                    if (string8.equals("LOADING")) {
                        i3 = 1;
                    } else if (string8.equals("READY")) {
                        i3 = 2;
                    } else {
                        hhg1.n("No enum constant com.spotify.premiumaccountmanagement.memberdetails.mobius.State.".concat(string8));
                    }
                    int i12 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    return new fli0(string4, string5, string6, string7, parcelable2, i3, i12, z6);
                }
                bhn0.i("Name is null");
                i3 = 0;
                int i13 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                return new fli0(string4, string5, string6, string7, parcelable2, i3, i13, z6);
            case 23:
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                if (string10 != null) {
                    if (string10.equals("NONE")) {
                        i4 = 1;
                    } else if (!string10.equals("QUICKSILVER")) {
                        hhg1.n("No enum constant com.spotify.premiumaccountmanagement.memberdetails.MemberDetailsEntrySource.".concat(string10));
                    }
                    return new lli0(string9, i4);
                }
                bhn0.i("Name is null");
                i4 = 0;
                return new lli0(string9, i4);
            case 24:
                return new bmi0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readParcelable(bmi0.class.getClassLoader()));
            case 25:
                return new gmi0(parcel.readString());
            case 26:
                return new omi0(parcel.readString(), parcel.readParcelable(omi0.class.getClassLoader()));
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new umi0(parcel.readString());
            case 28:
                return new sni0(parcel.readString(), parcel.readString());
            default:
                return new kpi0(parcel.readString(), wxn0.valueOf(parcel.readString()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new MediaSessionCompat.QueueItem[i];
            case 1:
                return new MediaSessionCompat.Token[i];
            case 2:
                return new h3i0[i];
            case 3:
                return new m3i0[i];
            case 4:
                return new u3i0[i];
            case 5:
                return new n3i0[i];
            case 6:
                return new o3i0[i];
            case 7:
                return new p3i0[i];
            case 8:
                return new r3i0[i];
            case 9:
                return new s3i0[i];
            case 10:
                return new o5i0[i];
            case 11:
                return new u5i0[i];
            case 12:
                return new p5i0[i];
            case 13:
                return new q5i0[i];
            case 14:
                return new r5i0[i];
            case 15:
                return new s5i0[i];
            case 16:
                return new v5i0[i];
            case 17:
                return new s6i0[i];
            case 18:
                return new t6i0[i];
            case 19:
                return new z6i0[i];
            case 20:
                return new g7i0[i];
            case 21:
                return new ihi0[i];
            case 22:
                return new fli0[i];
            case 23:
                return new lli0[i];
            case 24:
                return new bmi0[i];
            case 25:
                return new gmi0[i];
            case 26:
                return new omi0[i];
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new umi0[i];
            case 28:
                return new sni0[i];
            default:
                return new kpi0[i];
        }
    }
}
