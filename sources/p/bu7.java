package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bu7 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                String string = parcel.readString();
                boolean z = parcel.readInt() != 0;
                kfv kfvVar = (kfv) kfv.CREATOR.createFromParcel(parcel);
                Long lValueOf = null;
                String string2 = parcel.readString();
                wve1 wve1VarCreateFromParcel = wve1.CREATOR.createFromParcel(parcel);
                boolean z2 = parcel.readInt() != 0;
                kw91 kw91VarCreateFromParcel = kw91.CREATOR.createFromParcel(parcel);
                boolean z3 = false;
                boolean z4 = parcel.readInt() != 0;
                String string3 = parcel.readString();
                if (parcel.readInt() != 0) {
                    lValueOf = Long.valueOf(parcel.readLong());
                }
                if (parcel.readInt() != 0) {
                    z3 = true;
                }
                return new cu7(string, z, kfvVar, string2, wve1VarCreateFromParcel, z2, kw91VarCreateFromParcel, z4, string3, lValueOf, z3, du7.CREATOR.createFromParcel(parcel));
            case 1:
                return du7.valueOf(parcel.readString());
            case 2:
                return new aw7(parcel.readString(), parcel.readString());
            case 3:
                int iD = 0;
                String string4 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                while (iD != i) {
                    iD = dsl0.d(aw7.CREATOR, parcel, arrayList, iD, 1);
                }
                return new bw7(string4, arrayList);
            case 4:
                parcel.readInt();
                return hy7.a;
            case 5:
                return new iy7(parcel.readString(), parcel.readString(), sx7.valueOf(parcel.readString()));
            case 6:
                return new xz7(parcel.readString(), parcel.readString(), parcel.readString(), (dg) (parcel.readInt() != 0 ? dg.CREATOR.createFromParcel(parcel) : null));
            case 7:
                return new f08(parcel.readString(), parcel.readString(), parcel.readString(), (dg) (parcel.readInt() != 0 ? dg.CREATOR.createFromParcel(parcel) : null));
            case 8:
                return new g08(parcel.readString(), parcel.readString(), (dg) (parcel.readInt() != 0 ? dg.CREATOR.createFromParcel(parcel) : null));
            case 9:
                boolean z5 = false;
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z5 = true;
                }
                return new k48(string5, string6, z5);
            case 10:
                return new v68(parcel.createStringArrayList(), parcel.readInt() != 0, (kfv) kfv.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (t68) parcel.readValue(v68.class.getClassLoader()), parcel.readDouble());
            case 11:
                return new f78(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 12:
                return new d88(parcel.readString(), parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), k4m.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 13:
                boolean z6 = true;
                ph1 ph1VarValueOf = ph1.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    z6 = false;
                }
                return new v88(ph1VarValueOf, z6);
            case 14:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                k4m k4mVarValueOf = k4m.valueOf(parcel.readString());
                boolean z7 = parcel.readInt() != 0;
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int iD2 = 0;
                while (iD2 != i2) {
                    iD2 = dsl0.d(gp51.CREATOR, parcel, arrayList2, iD2, 1);
                }
                return new jc8(string7, string8, string9, k4mVarValueOf, z7, arrayList2, parcel.readInt() != 0, parcel.readInt() != 0);
            case 15:
                return new sc8(parcel.readString());
            case 16:
                return new od8(parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 17:
                return new ee8(parcel.readString());
            case 18:
                return new of8(parcel.readString(), parcel.createByteArray());
            case 19:
                return new di8(parcel.readString(), (wd) (parcel.readInt() != 0 ? wd.CREATOR.createFromParcel(parcel) : null), parcel.readParcelable(di8.class.getClassLoader()));
            case 20:
                return new ri8(parcel.createByteArray());
            case 21:
                return new gl8(parcel.readParcelable(gl8.class.getClassLoader()));
            case 22:
                return new hl8(parcel.readInt() != 0 ? yg8.valueOf(parcel.readString()) : null);
            case 23:
                return new rl8(parcel);
            case 24:
                return new sl8(parcel);
            case 25:
                return new tl8(parcel);
            case 26:
                parcel.readInt();
                return tm8.a;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new wn8(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readParcelable(wn8.class.getClassLoader()));
            case 28:
                return new co8(parcel.readString(), parcel.readParcelable(co8.class.getClassLoader()), parcel.readString(), (wn8) wn8.CREATOR.createFromParcel(parcel));
            default:
                parcel.readInt();
                return do8.a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new cu7[i];
            case 1:
                return new du7[i];
            case 2:
                return new aw7[i];
            case 3:
                return new bw7[i];
            case 4:
                return new hy7[i];
            case 5:
                return new iy7[i];
            case 6:
                return new xz7[i];
            case 7:
                return new f08[i];
            case 8:
                return new g08[i];
            case 9:
                return new k48[i];
            case 10:
                return new v68[i];
            case 11:
                return new f78[i];
            case 12:
                return new d88[i];
            case 13:
                return new v88[i];
            case 14:
                return new jc8[i];
            case 15:
                return new sc8[i];
            case 16:
                return new od8[i];
            case 17:
                return new ee8[i];
            case 18:
                return new of8[i];
            case 19:
                return new di8[i];
            case 20:
                return new ri8[i];
            case 21:
                return new gl8[i];
            case 22:
                return new hl8[i];
            case 23:
                return new rl8[i];
            case 24:
                return new sl8[i];
            case 25:
                return new tl8[i];
            case 26:
                return new tm8[i];
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new wn8[i];
            case 28:
                return new co8[i];
            default:
                return new do8[i];
        }
    }
}
