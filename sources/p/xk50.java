package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xk50 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 1;
        int iH = 0;
        switch (this.a) {
            case 0:
                return new yk50(parcel.readString(), parcel.readString(), parcel.readParcelable(yk50.class.getClassLoader()));
            case 1:
                return new fl50(parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            case 2:
                parcel.readInt();
                return gl50.a;
            case 3:
                return new jl50(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? yk50.CREATOR.createFromParcel(parcel) : null);
            case 4:
                int iD = 0;
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                while (iD != i2) {
                    iD = dsl0.d(jl50.CREATOR, parcel, arrayList, iD, 1);
                }
                return new kl50(string, string2, parcel.readString(), parcel.readString(), arrayList);
            case 5:
                return new ll50(parcel.readString(), parcel.readString());
            case 6:
                return new ml50(parcel.readString(), parcel.createStringArrayList(), parcel.readString());
            case 7:
                return kr50.valueOf(parcel.readString());
            case 8:
                return new bv50(parcel.readString(), parcel.readString());
            case 9:
                return new zu50(parcel.readString(), parcel.readString(), parcel.readParcelable(zu50.class.getClassLoader()), (w160) w160.CREATOR.createFromParcel(parcel));
            case 10:
                return new w160((f470) (parcel.readInt() != 0 ? f470.CREATOR.createFromParcel(parcel) : null));
            case 11:
                return new i260(parcel.readString(), parcel.readString(), parcel.readString(), mqo1.F(parcel.createStringArrayList()), parcel.readString(), parcel.readString(), mqo1.F(parcel.createStringArrayList()), parcel.readString(), parcel.readString());
            case 12:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                int iD2 = 0;
                int i3 = parcel.readInt();
                String string8 = parcel.readString();
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                while (iD2 != i4) {
                    iD2 = dsl0.d(a4g.CREATOR, parcel, arrayList2, iD2, 1);
                }
                return new d360(i3, string3, string4, string5, string6, string7, string8, arrayList2);
            case 13:
                return new s360(parcel.readString(), parcel.readString());
            case 14:
                return new h460(parcel.readInt(), parcel.readString(), parcel.readString());
            case 15:
                int i5 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i5);
                while (iH != i5) {
                    iH = x0d.h(v660.class, parcel, arrayList3, iH, 1);
                }
                return new v660(arrayList3, x660.valueOf(parcel.readString()), (jq70) parcel.readParcelable(v660.class.getClassLoader()), parcel.readInt() != 0 ? w660.CREATOR.createFromParcel(parcel) : null);
            case 16:
                return new w660(parcel.readString(), parcel.readInt(), parcel.readInt());
            case 17:
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                if (string10 != null) {
                    if (!string10.equals("RECENTS")) {
                        if (string10.equals("SHORTCUTS")) {
                            i = 2;
                        } else {
                            hhg1.n("No enum constant com.spotify.home.hidefromhome.HideFromHomeSection.".concat(string10));
                        }
                    }
                    return new p860(i, string9, parcel.readSerializable());
                }
                bhn0.i("Name is null");
                i = 0;
                return new p860(i, string9, parcel.readSerializable());
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new h960(parcel.readInt(), parcel.readLong(), parcel.readInt());
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new zb60(parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString());
            case 20:
                return new rf60(parcel.readString());
            case 21:
                return new sf60(parcel.readString(), parcel.readInt());
            case 22:
                return new tf60(parcel.readString(), parcel.readInt(), parcel.readLong(), kn71.valueOf(parcel.readString()));
            case 23:
                return new uf60(parcel.readLong(), parcel.readInt(), parcel.readString());
            case 24:
                parcel.readInt();
                return zf60.a;
            case 25:
                parcel.readInt();
                return vg60.a;
            case 26:
                return new ej60(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            case 27:
                return new fj60(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 28:
                return new gj60(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            default:
                return new hj60(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new yk50[i];
            case 1:
                return new fl50[i];
            case 2:
                return new gl50[i];
            case 3:
                return new jl50[i];
            case 4:
                return new kl50[i];
            case 5:
                return new ll50[i];
            case 6:
                return new ml50[i];
            case 7:
                return new kr50[i];
            case 8:
                return new bv50[i];
            case 9:
                return new zu50[i];
            case 10:
                return new w160[i];
            case 11:
                return new i260[i];
            case 12:
                return new d360[i];
            case 13:
                return new s360[i];
            case 14:
                return new h460[i];
            case 15:
                return new v660[i];
            case 16:
                return new w660[i];
            case 17:
                return new p860[i];
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new h960[i];
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new zb60[i];
            case 20:
                return new rf60[i];
            case 21:
                return new sf60[i];
            case 22:
                return new tf60[i];
            case 23:
                return new uf60[i];
            case 24:
                return new zf60[i];
            case 25:
                return new vg60[i];
            case 26:
                return new ej60[i];
            case 27:
                return new fj60[i];
            case 28:
                return new gj60[i];
            default:
                return new hj60[i];
        }
    }
}
