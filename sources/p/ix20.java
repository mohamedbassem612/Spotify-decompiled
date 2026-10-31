package p;

import android.app.Notification;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ix20 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ ix20(byte b) {
        this.a = b;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0142  */
    /* JADX WARN: Code duplicated, block: B:30:0x0144  */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        boolean z;
        int i2;
        switch (this.a) {
            case 0:
                parcel.readInt();
                return jx20.d;
            case 1:
                parcel.readInt();
                return kx20.d;
            case 2:
                parcel.readInt();
                return lx20.d;
            case 3:
                parcel.readInt();
                return mx20.d;
            case 4:
                return new p030((yv51) yv51.CREATOR.createFromParcel(parcel), parcel.readString());
            case 5:
                return new y030(parcel.readInt(), parcel.readInt());
            case 6:
                return new j230(parcel.readString(), blc0.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
            case 7:
                return new z230(parcel.readString(), parcel.readString());
            case 8:
                return new b630(parcel.readString());
            case 9:
                return new q730(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
            case 10:
                return new g830(parcel.readString(), parcel.readString(), parcel.readString());
            case 11:
                return new pa30(parcel.readString());
            case 12:
                return new gd30((Intent) parcel.readParcelable(gd30.class.getClassLoader()));
            case 13:
                return new hd30(parcel.readInt());
            case 14:
                parcel.readInt();
                return new id30();
            case 15:
                return new jd30(parcel.readInt(), (Notification) parcel.readParcelable(jd30.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 16:
                return new kd30(parcel.createStringArrayList());
            case 17:
                return new de30(parcel.readString());
            case 18:
                int iH = 0;
                String str = de30.CREATOR.createFromParcel(parcel).a;
                String string = parcel.readString();
                String string2 = parcel.readString();
                boolean z2 = parcel.readInt() != 0;
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                while (iH != i3) {
                    iH = x0d.h(ee30.class, parcel, arrayList, iH, 1);
                }
                return new ee30(str, string, string2, z2, mqo1.F(arrayList));
            case 19:
                int iD = 0;
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                while (iD != i4) {
                    iD = dsl0.d(qqr0.CREATOR, parcel, arrayList2, iD, 1);
                }
                return new te30(arrayList2);
            case 20:
                mh30 mh30Var = new mh30();
                mh30Var.a = parcel.readString();
                mh30Var.b = parcel.readInt();
                return mh30Var;
            case 21:
                bi30 bi30Var = new bi30();
                bi30Var.e = null;
                bi30Var.f = new ArrayList();
                bi30Var.g = new ArrayList();
                bi30Var.a = parcel.createStringArrayList();
                bi30Var.b = parcel.createStringArrayList();
                bi30Var.c = (ou9[]) parcel.createTypedArray(ou9.CREATOR);
                bi30Var.d = parcel.readInt();
                bi30Var.e = parcel.readString();
                bi30Var.f = parcel.createStringArrayList();
                bi30Var.g = parcel.createTypedArrayList(su9.CREATOR);
                bi30Var.h = parcel.createTypedArrayList(mh30.CREATOR);
                return bi30Var;
            case 22:
                return new wm30(parcel.readString(), parcel.readString(), parcel.readString());
            case 23:
                Parcelable.Creator creator = we10.CREATOR;
                return new en30((we10) creator.createFromParcel(parcel), (we10) creator.createFromParcel(parcel));
            case 24:
                return new gn30((en30) en30.CREATOR.createFromParcel(parcel));
            case 25:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                lik1 parcelable = parcel.readParcelable(bo30.class.getClassLoader());
                String string7 = parcel.readString();
                if (string7 != null) {
                    if (string7.equals("FRIEND")) {
                        i = 1;
                    } else {
                        if (string7.equals("INVITED_FRIEND")) {
                            i2 = 2;
                        } else if (string7.equals("SUGGESTED_FRIEND")) {
                            i2 = 3;
                        } else {
                            hhg1.n("No enum constant com.spotify.profile.contextmenu.FriendContextMenuParameters.Type.".concat(string7));
                        }
                        i = i2;
                    }
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return new bo30(string3, string4, string5, string6, parcelable, i, z);
                }
                bhn0.i("Name is null");
                i = 0;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return new bo30(string3, string4, string5, string6, parcelable, i, z);
            case 26:
                return new oq30((wa71) parcel.readParcelable(oq30.class.getClassLoader()), (jlw0) parcel.readParcelable(oq30.class.getClassLoader()), (jlw0) parcel.readParcelable(oq30.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), (s171) parcel.readParcelable(oq30.class.getClassLoader()), parcel.readParcelable(oq30.class.getClassLoader()), (ez61) parcel.readParcelable(oq30.class.getClassLoader()), null);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new sq30((jlw0) parcel.readParcelable(sq30.class.getClassLoader()), (jlw0) parcel.readParcelable(sq30.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), (s171) parcel.readParcelable(sq30.class.getClassLoader()));
            case 28:
                return new ks30(parcel.readParcelable(ks30.class.getClassLoader()));
            default:
                return new wt30(lf51.r(parcel.readString()), parcel.readParcelable(wt30.class.getClassLoader()), (ez61) parcel.readParcelable(wt30.class.getClassLoader()), (wa71) parcel.readParcelable(wt30.class.getClassLoader()), null, parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new jx20[i];
            case 1:
                return new kx20[i];
            case 2:
                return new lx20[i];
            case 3:
                return new mx20[i];
            case 4:
                return new p030[i];
            case 5:
                return new y030[i];
            case 6:
                return new j230[i];
            case 7:
                return new z230[i];
            case 8:
                return new b630[i];
            case 9:
                return new q730[i];
            case 10:
                return new g830[i];
            case 11:
                return new pa30[i];
            case 12:
                return new gd30[i];
            case 13:
                return new hd30[i];
            case 14:
                return new id30[i];
            case 15:
                return new jd30[i];
            case 16:
                return new kd30[i];
            case 17:
                return new de30[i];
            case 18:
                return new ee30[i];
            case 19:
                return new te30[i];
            case 20:
                return new mh30[i];
            case 21:
                return new bi30[i];
            case 22:
                return new wm30[i];
            case 23:
                return new en30[i];
            case 24:
                return new gn30[i];
            case 25:
                return new bo30[i];
            case 26:
                return new oq30[i];
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new sq30[i];
            case 28:
                return new ks30[i];
            default:
                return new wt30[i];
        }
    }
}
