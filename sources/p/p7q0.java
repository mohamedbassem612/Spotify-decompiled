package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p7q0 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iD = 0;
        int iD2 = 0;
        int iD3 = 0;
        switch (this.a) {
            case 0:
                return new q7q0(parcel.readString());
            case 1:
                return new r7q0(parcel.readString(), parcel.readString(), parcel.readString());
            case 2:
                return new u7q0((Uri) parcel.readParcelable(u7q0.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 3:
                return new fdq0(parcel.readString(), parcel.readString(), ezy.valueOf(parcel.readString()), parcel.readString(), parcel.readInt(), parcel.readString());
            case 4:
                return new req0(parcel.readString());
            case 5:
                String string = parcel.readString();
                ept parcelable = parcel.readParcelable(xeq0.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                while (iD != i) {
                    iD = dsl0.d(fdq0.CREATOR, parcel, arrayList, iD, 1);
                }
                return new xeq0(string, parcelable, mqo1.F(arrayList), 120);
            case 6:
                return new gfq0(parcel.readString(), parcel.readString(), parcel.readBundle(gfq0.class.getClassLoader()));
            case 7:
                return new pfq0(parcel.readString(), parcel.readString());
            case 8:
                return giq0.valueOf(parcel.readString());
            case 9:
                xo20 parcelable2 = parcel.readParcelable(qiq0.class.getClassLoader());
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iD3 != i2) {
                    iD3 = dsl0.d(k851.CREATOR, parcel, arrayList2, iD3, 1);
                }
                return new qiq0(parcelable2, arrayList2, parcel.createStringArrayList());
            case 10:
                int i3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i3);
                while (iD2 != i3) {
                    iD2 = dsl0.d(k851.CREATOR, parcel, arrayList3, iD2, 1);
                }
                return new riq0(arrayList3);
            case 11:
                return new rjq0(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
            case 12:
                return new vjq0(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            case 13:
                return new tmq0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 14:
                return new xmq0(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 15:
                fab0 fab0VarCreateFromParcel = fab0.CREATOR.createFromParcel(parcel);
                as3 as3VarValueOf = as3.valueOf(parcel.readString());
                dia1 dia1VarValueOf = dia1.valueOf(parcel.readString());
                int i4 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i4);
                int iH = 0;
                while (iH != i4) {
                    iH = x0d.h(bqq0.class, parcel, arrayList4, iH, 1);
                }
                return new bqq0(fab0VarCreateFromParcel, as3VarValueOf, dia1VarValueOf, arrayList4, (mml) parcel.readParcelable(bqq0.class.getClassLoader()), parcel.readInt() != 0, a3t0.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
            case 16:
                return new psq0(parcel.readString(), parcel.readString());
            case 17:
                return new ruq0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0, parcel.readFloat(), parcel.readFloat(), parcel.readDouble(), parcel.readDouble());
            case 18:
                nvq0 nvq0Var = new nvq0(parcel);
                nvq0Var.a = ivq0.b;
                int i5 = parcel.readInt();
                nvq0Var.a = i5 != -1 ? ((Enum[]) ivq0.class.getEnumConstants())[i5] : null;
                nvq0Var.b = parcel.readInt() != 0;
                return nvq0Var;
            case 19:
                return new owq0((Class) parcel.readSerializable(), parcel.readBundle(owq0.class.getClassLoader()), parcel.readParcelable(owq0.class.getClassLoader()));
            case 20:
                return new pwq0((Class) parcel.readSerializable(), parcel.readBundle(pwq0.class.getClassLoader()), parcel.readParcelable(pwq0.class.getClassLoader()));
            case 21:
                return new pxq0(parcel.readString());
            case 22:
                parcel.readInt();
                return qxq0.a;
            case 23:
                parcel.readInt();
                return rxq0.a;
            case 24:
                return new fyq0(parcel.readString(), parcel.readString());
            case 25:
                return new e7r0(parcel.readString(), parcel.readSerializable(), parcel.readString(), parcel.readParcelable(e7r0.class.getClassLoader()), parcel.readString());
            case 26:
                return new q8r0(parcel.readString(), parcel.readString(), parcel.readString());
            case 27:
                return new nar0(parcel.readSerializable(), parcel.readSerializable());
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return new ejr0((ivd) ivd.CREATOR.createFromParcel(parcel), parcel.readInt());
            default:
                return new okr0(parcel.readInt(), parcel.readInt());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new q7q0[i];
            case 1:
                return new r7q0[i];
            case 2:
                return new u7q0[i];
            case 3:
                return new fdq0[i];
            case 4:
                return new req0[i];
            case 5:
                return new xeq0[i];
            case 6:
                return new gfq0[i];
            case 7:
                return new pfq0[i];
            case 8:
                return new giq0[i];
            case 9:
                return new qiq0[i];
            case 10:
                return new riq0[i];
            case 11:
                return new rjq0[i];
            case 12:
                return new vjq0[i];
            case 13:
                return new tmq0[i];
            case 14:
                return new xmq0[i];
            case 15:
                return new bqq0[i];
            case 16:
                return new psq0[i];
            case 17:
                return new ruq0[i];
            case 18:
                return new nvq0[i];
            case 19:
                return new owq0[i];
            case 20:
                return new pwq0[i];
            case 21:
                return new pxq0[i];
            case 22:
                return new qxq0[i];
            case 23:
                return new rxq0[i];
            case 24:
                return new fyq0[i];
            case 25:
                return new e7r0[i];
            case 26:
                return new q8r0[i];
            case 27:
                return new nar0[i];
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return new ejr0[i];
            default:
                return new okr0[i];
        }
    }
}
