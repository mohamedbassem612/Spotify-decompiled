package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b4o0 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v9, types: [int] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        boolean z;
        boolean z2 = true;
        int iD = 0;
        ?? r8 = 0;
        int iD2 = 0;
        switch (this.a) {
            case 0:
                return new c4o0(parcel.readString(), parcel.readString(), parcel.readParcelable(c4o0.class.getClassLoader()));
            case 1:
                return new f4o0(d4o0.CREATOR.createFromParcel(parcel));
            case 2:
                parcel.readInt();
                return s5o0.a;
            case 3:
                n6o0 n6o0Var = new n6o0(parcel);
                n6o0Var.a = parcel.readInt();
                return n6o0Var;
            case 4:
                return new g9o0(parcel.readParcelable(g9o0.class.getClassLoader()));
            case 5:
                return new h9o0(parcel.readLong());
            case 6:
                return new o9o0(parcel.readString(), parcel.readBundle(o9o0.class.getClassLoader()));
            case 7:
                return new wdo0(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 8:
                return new mgo0(parcel.readString(), parcel.readString(), cfm0.w(parcel.readString()), parcel.readString());
            case 9:
                return new rgo0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), cfm0.w(parcel.readString()), parcel.readString(), parcel.readString());
            case 10:
                return new ugo0(parcel.readInt() != 0, parcel.readString(), parcel.readString(), (vgo0) vgo0.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), (mgo0) (parcel.readInt() != 0 ? mgo0.CREATOR.createFromParcel(parcel) : null));
            case 11:
                return new vgo0(parcel.readString(), parcel.readInt(), parcel.readInt());
            case 12:
                return new sio0(parcel.readString());
            case 13:
                parcel.readInt();
                return tio0.a;
            case 14:
                return new pjo0(parcel.readString(), v80.valueOf(parcel.readString()));
            case 15:
                return new nmo0(parcel.readString(), parcel.readString());
            case 16:
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                while (iD != i3) {
                    iD = dsl0.d(ybi1.CREATOR, parcel, arrayList, iD, 1);
                }
                return new qmo0(arrayList);
            case 17:
                parcel.readInt();
                return rmo0.INSTANCE;
            case 18:
                return new umo0((ybi1) ybi1.CREATOR.createFromParcel(parcel), (nmo0) nmo0.CREATOR.createFromParcel(parcel));
            case 19:
                return ipo0.valueOf(parcel.readString());
            case 20:
                return new qro0(parcel.readString(), (ipo0) parcel.readParcelable(qro0.class.getClassLoader()));
            case 21:
                boolean z3 = true;
                if (parcel.readInt() == 0) {
                    z3 = false;
                }
                return new rro0(z3, parcel.readString());
            case 22:
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                while (iD2 != i4) {
                    iD2 = dsl0.d(kjo0.CREATOR, parcel, arrayList2, iD2, 1);
                }
                return new wro0(parcel.readString(), arrayList2, parcel.readString());
            case 23:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                if (string5 != null) {
                    if (string5.equals("CDP_ALBUM")) {
                        i = 1;
                    } else if (string5.equals("LE_EVENT")) {
                        i = 2;
                    } else if (string5.equals("LE_ARTIST_EVENTS")) {
                        i = 3;
                    } else if (string5.equals("NOTIFICATION_PREFERENCE_SETTINGS_TOGGLE")) {
                        i = 4;
                    } else {
                        if (string5.equals("AUDIOBOOK_PRERELEASE_PRESAVE_BUTTON")) {
                            i2 = 5;
                        } else if (string5.equals("NPV_PRERELEASE_PRESAVE_BUTTON")) {
                            i2 = 6;
                        } else if (string5.equals("MARQUEE_PRERELEASE_PRESAVE_BUTTON")) {
                            i2 = 7;
                        } else if (string5.equals("MESSAGING_NOTIFICATION_OPT_IN_NUDGE")) {
                            i2 = 8;
                        } else if (string5.equals("MUSIC_VIDEO_PRERELEASE_PRESAVE_BUTTON")) {
                            i2 = 9;
                        } else {
                            hhg1.n("No enum constant com.spotify.notifications.permissions.NotificationPermissionDialogReason.".concat(string5));
                        }
                        i = i2;
                    }
                    return new yro0(i, string, string2, string3, string4);
                }
                bhn0.i("Name is null");
                i = 0;
                return new yro0(i, string, string2, string3, string4);
            case 24:
                parcel.readInt();
                return fvo0.a;
            case 25:
                return new gvo0(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
            case 26:
                return new z5p0((hfu0) (parcel.readInt() == 0 ? null : hfu0.CREATOR.createFromParcel(parcel)), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (hfu0) (parcel.readInt() != 0 ? hfu0.CREATOR.createFromParcel(parcel) : null), parcel.readInt() != 0);
            case 27:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean z4 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                String string9 = parcel.readString();
                if (string9 != null) {
                    if (string9.equals("Track")) {
                        r8 = z2;
                    } else if (string9.equals("Episode")) {
                        r8 = 2;
                    } else if (string9.equals("Ad")) {
                        r8 = 3;
                    } else if (string9.equals("Unknown")) {
                        r8 = 4;
                    } else {
                        hhg1.n("No enum constant com.spotify.xrprojected.ui.model.TrackType.".concat(string9));
                    }
                    String string10 = parcel.readString();
                    long j = parcel.readLong();
                    long j2 = parcel.readLong();
                    long j3 = parcel.readLong();
                    z = false;
                    double d = parcel.readDouble();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    return new w9p0(string6, string7, string8, z4, z2, r8, string10, j, j2, j3, d, z, z, z, z);
                }
                bhn0.i("Name is null");
                String string11 = parcel.readString();
                long j4 = parcel.readLong();
                long j5 = parcel.readLong();
                long j6 = parcel.readLong();
                z = false;
                double d2 = parcel.readDouble();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                if (parcel.readInt() != 0) {
                    z = true;
                }
                if (parcel.readInt() != 0) {
                    z = true;
                }
                if (parcel.readInt() != 0) {
                    z = true;
                }
                return new w9p0(string6, string7, string8, z4, z2, r8, string11, j4, j5, j6, d2, z, z, z, z);
            case 28:
                return new yip0(parcel.readString());
            default:
                return new hmp0(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new c4o0[i];
            case 1:
                return new f4o0[i];
            case 2:
                return new s5o0[i];
            case 3:
                return new n6o0[i];
            case 4:
                return new g9o0[i];
            case 5:
                return new h9o0[i];
            case 6:
                return new o9o0[i];
            case 7:
                return new wdo0[i];
            case 8:
                return new mgo0[i];
            case 9:
                return new rgo0[i];
            case 10:
                return new ugo0[i];
            case 11:
                return new vgo0[i];
            case 12:
                return new sio0[i];
            case 13:
                return new tio0[i];
            case 14:
                return new pjo0[i];
            case 15:
                return new nmo0[i];
            case 16:
                return new qmo0[i];
            case 17:
                return new rmo0[i];
            case 18:
                return new umo0[i];
            case 19:
                return new ipo0[i];
            case 20:
                return new qro0[i];
            case 21:
                return new rro0[i];
            case 22:
                return new wro0[i];
            case 23:
                return new yro0[i];
            case 24:
                return new fvo0[i];
            case 25:
                return new gvo0[i];
            case 26:
                return new z5p0[i];
            case 27:
                return new w9p0[i];
            case 28:
                return new yip0[i];
            default:
                return new hmp0[i];
        }
    }
}
