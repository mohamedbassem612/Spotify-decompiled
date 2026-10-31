package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xt30 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ xt30(byte b) {
        this.a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z = true;
        int iD = 0;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                return new yt30(lf51.r(parcel.readString()), parcel.readParcelable(yt30.class.getClassLoader()), (ez61) parcel.readParcelable(yt30.class.getClassLoader()), (wa71) parcel.readParcelable(yt30.class.getClassLoader()), null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), (llw0) parcel.readParcelable(yt30.class.getClassLoader()), parcel.createStringArrayList(), (cuu0) parcel.readParcelable(yt30.class.getClassLoader()));
            case 1:
                return new zt30(lf51.r(parcel.readString()), parcel.readParcelable(zt30.class.getClassLoader()), (ez61) parcel.readParcelable(zt30.class.getClassLoader()), (wa71) parcel.readParcelable(zt30.class.getClassLoader()), (wkt) null, parcel.readString(), parcel.readString());
            case 2:
                return new cu30(parcel.readString(), parcel.readString());
            case 3:
                return new zw30(parcel.readString(), parcel.readString(), parcel.readString());
            case 4:
                return new ox30((s69) (parcel.readInt() == 0 ? null : s69.CREATOR.createFromParcel(parcel)), (s69) (parcel.readInt() == 0 ? null : s69.CREATOR.createFromParcel(parcel)), (s69) (parcel.readInt() != 0 ? s69.CREATOR.createFromParcel(parcel) : null));
            case 5:
                return new px30(rx30.valueOf(parcel.readString()));
            case 6:
                px30 px30Var = (px30) px30.CREATOR.createFromParcel(parcel);
                Parcelable.Creator creator = s69.CREATOR;
                return new qx30(px30Var, (s69) creator.createFromParcel(parcel), (s69) creator.createFromParcel(parcel), (s69) creator.createFromParcel(parcel), (s69) creator.createFromParcel(parcel), (s69) creator.createFromParcel(parcel), (s69) creator.createFromParcel(parcel));
            case 7:
                return ty30.valueOf(parcel.readString());
            case 8:
                int i = 1;
                String string = parcel.readString();
                int i2 = parcel.readInt();
                int i3 = parcel.readInt();
                String string2 = parcel.readString();
                if (string2 != null) {
                    if (!string2.equals("IMAGE")) {
                        if (string2.equals("VIDEO")) {
                            i = 2;
                        } else {
                            hhg1.n("No enum constant com.spotify.campfire.chatcontributionmediagallerypage.GalleryMediaType.".concat(string2));
                        }
                    }
                    return new vy30(i2, i3, i, parcel.readLong(), string, parcel.readString());
                }
                bhn0.i("Name is null");
                i = 0;
                return new vy30(i2, i3, i, parcel.readLong(), string, parcel.readString());
            case 9:
                return new h140(parcel.readString(), parcel.readString(), parcel.readString());
            case 10:
                return new i340(parcel.readString(), parcel.readString(), parcel.readString());
            case 11:
                return j340.valueOf(parcel.readString());
            case 12:
                return new w540(parcel.readString(), parcel.readInt() != 0);
            case 13:
                return new e940(parcel.readString(), parcel.readString());
            case 14:
                return new o940((n940) parcel.readParcelable(o940.class.getClassLoader()), k940.CREATOR.createFromParcel(parcel), (e940) (parcel.readInt() != 0 ? e940.CREATOR.createFromParcel(parcel) : null));
            case 15:
                return h940.valueOf(parcel.readString());
            case 16:
                return k940.valueOf(parcel.readString());
            case 17:
                int i4 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i4);
                while (iD != i4) {
                    iD = dsl0.d(h940.CREATOR, parcel, arrayList, iD, 1);
                }
                return new l940(arrayList);
            case 18:
                parcel.readInt();
                return m940.a;
            case 19:
                return new hc40(parcel.readParcelable(hc40.class.getClassLoader()));
            case 20:
                return new ec40(parcel.readString());
            case 21:
                return new fc40(parcel.readString());
            case 22:
                parcel.readInt();
                return oc40.a;
            case 23:
                parcel.readInt();
                return pc40.a;
            case 24:
                hd40 parcelable = parcel.readParcelable(id40.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = z;
                }
                if (parcel.readInt() == 0) {
                    z = iD;
                }
                return new id40(parcelable, z, z2, z, parcel.readInt() != 0);
            case 25:
                parcel.readInt();
                return ad40.a;
            case 26:
                parcel.readInt();
                return bd40.a;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                parcel.readInt();
                return cd40.a;
            case 28:
                parcel.readInt();
                return dd40.a;
            default:
                parcel.readInt();
                return ed40.a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new yt30[i];
            case 1:
                return new zt30[i];
            case 2:
                return new cu30[i];
            case 3:
                return new zw30[i];
            case 4:
                return new ox30[i];
            case 5:
                return new px30[i];
            case 6:
                return new qx30[i];
            case 7:
                return new ty30[i];
            case 8:
                return new vy30[i];
            case 9:
                return new h140[i];
            case 10:
                return new i340[i];
            case 11:
                return new j340[i];
            case 12:
                return new w540[i];
            case 13:
                return new e940[i];
            case 14:
                return new o940[i];
            case 15:
                return new h940[i];
            case 16:
                return new k940[i];
            case 17:
                return new l940[i];
            case 18:
                return new m940[i];
            case 19:
                return new hc40[i];
            case 20:
                return new ec40[i];
            case 21:
                return new fc40[i];
            case 22:
                return new oc40[i];
            case 23:
                return new pc40[i];
            case 24:
                return new id40[i];
            case 25:
                return new ad40[i];
            case 26:
                return new bd40[i];
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new cd40[i];
            case 28:
                return new dd40[i];
            default:
                return new ed40[i];
        }
    }
}
