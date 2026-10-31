package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fp5 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ fp5(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iD = 0;
        switch (this.a) {
            case 0:
                return new gp5((n1f0) n1f0.CREATOR.createFromParcel(parcel));
            case 1:
                return new nz5(parcel.readString(), parcel.readString());
            case 2:
                return new z86(parcel.readString(), parcel.readString(), chr0.valueOf(parcel.readString()), psk.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 3:
                return new ib6(parcel.readString(), parcel.readString(), parcel.readString());
            case 4:
                return new jb6(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : i6k.CREATOR.createFromParcel(parcel), (l6k) (parcel.readInt() != 0 ? l6k.CREATOR.createFromParcel(parcel) : null));
            case 5:
                return new kb6(parcel.readString(), parcel.readString(), parcel.readString());
            case 6:
                return new kc6(parcel.readString(), parcel.readString());
            case 7:
                return new tl6(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            case 8:
                return new wl6(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, (tl6) (parcel.readInt() != 0 ? tl6.CREATOR.createFromParcel(parcel) : null));
            case 9:
                return new bm6(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readParcelable(bm6.class.getClassLoader()), parcel.readParcelable(bm6.class.getClassLoader()), parcel.readInt() != 0, parcel.readParcelable(bm6.class.getClassLoader()));
            case 10:
                return new fm6(parcel.readString(), parcel.readParcelable(fm6.class.getClassLoader()), parcel.readString(), (bm6) bm6.CREATOR.createFromParcel(parcel));
            case 11:
                return new eo6(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            case 12:
                return new ho6(parcel.readInt() != 0, parcel.readInt(), parcel.readInt());
            case 13:
                return new lo6(parcel.readString(), parcel.readString(), parcel.readString());
            case 14:
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                while (iD != i) {
                    iD = dsl0.d(lo6.CREATOR, parcel, arrayList, iD, 1);
                }
                return new ro6(arrayList);
            case 15:
                return new jq6(parcel.readString(), parcel.readString());
            case 16:
                return new br6(parcel.readString(), parcel.createStringArrayList());
            case 17:
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iD != i2) {
                    iD = dsl0.d(b9e.CREATOR, parcel, arrayList2, iD, 1);
                }
                return new pu6(string, arrayList2, string2);
            case 18:
                return new qu6(parcel.readString());
            case 19:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                rha1 rha1VarValueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
                int i3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i3);
                while (iD != i3) {
                    iD = dsl0.d(cb20.CREATOR, parcel, arrayList3, iD, 1);
                }
                return new jv6(string3, string4, rha1VarValueOf, arrayList3);
            case 20:
                return new kv6(parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 21:
                return new fw6(parcel.readString(), parcel.readString(), jx11.valueOf(parcel.readString()));
            case 22:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                rha1 rha1VarValueOf2 = parcel.readInt() != 0 ? rha1.valueOf(parcel.readString()) : null;
                int i4 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i4);
                while (iD != i4) {
                    iD = dsl0.d(cia1.CREATOR, parcel, arrayList4, iD, 1);
                }
                return new tw6(string5, string6, string7, rha1VarValueOf2, arrayList4);
            case 23:
                return new uw6(parcel.readString(), parcel.readInt() != 0 ? rha1.valueOf(parcel.readString()) : null);
            case 24:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                boolean z4 = parcel.readInt() != 0;
                boolean z5 = parcel.readInt() != 0;
                int i5 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i5);
                while (iD != i5) {
                    iD = dsl0.d(gp51.CREATOR, parcel, arrayList5, iD, 1);
                }
                return new xx6(string8, string9, string10, z, z2, z3, z4, z5, arrayList5);
            case 25:
                return new pz6(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            case 26:
                return new n27(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new o57(parcel.readString());
            case 28:
                return new p57(parcel.readString());
            default:
                return new e67(parcel.readParcelable(e67.class.getClassLoader()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new gp5[i];
            case 1:
                return new nz5[i];
            case 2:
                return new z86[i];
            case 3:
                return new ib6[i];
            case 4:
                return new jb6[i];
            case 5:
                return new kb6[i];
            case 6:
                return new kc6[i];
            case 7:
                return new tl6[i];
            case 8:
                return new wl6[i];
            case 9:
                return new bm6[i];
            case 10:
                return new fm6[i];
            case 11:
                return new eo6[i];
            case 12:
                return new ho6[i];
            case 13:
                return new lo6[i];
            case 14:
                return new ro6[i];
            case 15:
                return new jq6[i];
            case 16:
                return new br6[i];
            case 17:
                return new pu6[i];
            case 18:
                return new qu6[i];
            case 19:
                return new jv6[i];
            case 20:
                return new kv6[i];
            case 21:
                return new fw6[i];
            case 22:
                return new tw6[i];
            case 23:
                return new uw6[i];
            case 24:
                return new xx6[i];
            case 25:
                return new pz6[i];
            case 26:
                return new n27[i];
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new o57[i];
            case 28:
                return new p57[i];
            default:
                return new e67[i];
        }
    }
}
