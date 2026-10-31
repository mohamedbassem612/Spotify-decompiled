package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class brt0 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ brt0(byte b) {
        this.a = b;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:108:0x01e3  */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        int i2 = 3;
        int i3 = 2;
        int iG = 0;
        switch (this.a) {
            case 0:
                parcel.readInt();
                return crt0.a;
            case 1:
                parcel.readInt();
                return drt0.a;
            case 2:
                parcel.readInt();
                return ert0.a;
            case 3:
                parcel.readInt();
                return jrt0.a;
            case 4:
                return new krt0(parcel.readString());
            case 5:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                if (string3 != null) {
                    if (string3.equals("NONE")) {
                        i2 = 1;
                    } else if (string3.equals("PLAYING")) {
                        i2 = 2;
                    } else if (!string3.equals("PAUSED")) {
                        hhg1.n("No enum constant com.spotify.search.mobius.model.PlayState.PlayerState.".concat(string3));
                    }
                    return new lrt0(i2, string, string2);
                }
                bhn0.i("Name is null");
                i2 = 0;
                return new lrt0(i2, string, string2);
            case 6:
                parcel.readInt();
                return ort0.a;
            case 7:
                return new prt0(parcel.readParcelable(prt0.class.getClassLoader()));
            case 8:
                return new mrt0(parcel.readString());
            case 9:
                return new fvt0(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 10:
                return new l0u0(parcel.readString());
            case 11:
                String string4 = parcel.readString();
                if (string4 != null) {
                    if (string4.equals("StartSlow")) {
                        i3 = 1;
                    } else if (!string4.equals("Stuck")) {
                        hhg1.n("No enum constant com.spotify.offline.playbacktimeoutpage.PlaybackTimeoutReason.".concat(string4));
                    }
                    return new b7u0(i3);
                }
                bhn0.i("Name is null");
                i3 = 0;
                return new b7u0(i3);
            case 12:
                parcel.readInt();
                return rcu0.a;
            case 13:
                return new vcu0(parcel.readLong(), parcel.readLong());
            case 14:
                parcel.readInt();
                return wcu0.a;
            case 15:
                return new hfu0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 16:
                return new tfu0(parcel.readInt() != 0, parcel.readInt() != 0, parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readInt() != 0);
            case 17:
                return new khu0(parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, fd21.s(parcel.readString()), parcel.createStringArrayList(), parcel.readInt() != 0);
            case 18:
                return new jku0(parcel.readString(), parcel.readString(), wls0.valueOf(parcel.readString()), parcel.readInt() != 0);
            case 19:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                boolean z4 = parcel.readInt() != 0;
                boolean z5 = parcel.readInt() != 0;
                String string7 = parcel.readString();
                boolean z6 = parcel.readInt() != 0;
                String string8 = parcel.readString();
                if (string8 != null) {
                    if (string8.equals("UNKNOWN")) {
                        i = 1;
                    } else if (string8.equals("SUCCESS")) {
                        i = 2;
                    } else {
                        if (!string8.equals("QUEUED")) {
                            if (string8.equals("PROCESSING")) {
                                i2 = 4;
                            } else if (string8.equals("ERROR")) {
                                i2 = 5;
                            } else {
                                hhg1.n("No enum constant com.spotify.yourlibrary.resources.PromptGenerationStatus.".concat(string8));
                            }
                        }
                        i = i2;
                    }
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return new xlu0(i, string5, string6, string7, z4, z5, z6, z);
                }
                bhn0.i("Name is null");
                i = 0;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return new xlu0(i, string5, string6, string7, z4, z5, z6, z);
            case 20:
                lik1 parcelable = parcel.readParcelable(cmu0.class.getClassLoader());
                boolean z7 = parcel.readInt() != 0;
                boolean z8 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z3 = true;
                    z2 = false;
                } else {
                    z2 = false;
                    z3 = false;
                }
                return new cmu0(parcelable, z7, z8, z3, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? true : z2, parcel.readInt() != 0 ? true : z2, parcel.readString());
            case 21:
                return new dpu0(parcel.readParcelable(dpu0.class.getClassLoader()), parcel.readParcelable(dpu0.class.getClassLoader()), parcel.readInt() != 0, parcel.readParcelable(dpu0.class.getClassLoader()));
            case 22:
                return new fpu0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 23:
                return new fqu0(parcel.readString());
            case 24:
                String string9 = parcel.readString();
                CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                boolean z9 = false;
                String string10 = parcel.readString();
                boolean z10 = false;
                if (parcel.readInt() != 0) {
                    z9 = true;
                }
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                int i4 = parcel.readInt();
                boolean z11 = false;
                ArrayList arrayList = new ArrayList(i4);
                int iD = 0;
                while (iD != i4) {
                    iD = dsl0.d(gp51.CREATOR, parcel, arrayList, iD, 1);
                }
                boolean z12 = false;
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                if (parcel.readInt() != 0) {
                    z12 = true;
                }
                return new xsu0(string9, charSequence, string10, z9, z10, arrayList, z11, z12);
            case 25:
                int i5 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i5);
                while (iG != i5) {
                    iG = k4s0.g(parcel, linkedHashSet, iG, 1);
                }
                return new stu0(linkedHashSet);
            case 26:
                int i6 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i6);
                while (iG != i6) {
                    iG = k4s0.g(parcel, linkedHashSet2, iG, 1);
                }
                return new ttu0(linkedHashSet2);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new auu0(parcel.readString(), parcel.readString(), wls0.valueOf(parcel.readString()), parcel.readInt() != 0);
            case 28:
                return new buu0(parcel.readString(), wls0.valueOf(parcel.readString()), parcel.readString());
            default:
                return new owu0(parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new crt0[i];
            case 1:
                return new drt0[i];
            case 2:
                return new ert0[i];
            case 3:
                return new jrt0[i];
            case 4:
                return new krt0[i];
            case 5:
                return new lrt0[i];
            case 6:
                return new ort0[i];
            case 7:
                return new prt0[i];
            case 8:
                return new mrt0[i];
            case 9:
                return new fvt0[i];
            case 10:
                return new l0u0[i];
            case 11:
                return new b7u0[i];
            case 12:
                return new rcu0[i];
            case 13:
                return new vcu0[i];
            case 14:
                return new wcu0[i];
            case 15:
                return new hfu0[i];
            case 16:
                return new tfu0[i];
            case 17:
                return new khu0[i];
            case 18:
                return new jku0[i];
            case 19:
                return new xlu0[i];
            case 20:
                return new cmu0[i];
            case 21:
                return new dpu0[i];
            case 22:
                return new fpu0[i];
            case 23:
                return new fqu0[i];
            case 24:
                return new xsu0[i];
            case 25:
                return new stu0[i];
            case 26:
                return new ttu0[i];
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new auu0[i];
            case 28:
                return new buu0[i];
            default:
                return new owu0[i];
        }
    }
}
