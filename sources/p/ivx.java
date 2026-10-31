package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ivx extends i5 {
    public static final Parcelable.ClassLoaderCreator<ivx> CREATOR = new aw91((byte) 9);
    public svx c;
    public ay31 d;
    public String e;

    public ivx(Parcel parcel, ClassLoader classLoader) {
        Enum r7;
        Enum r8;
        super(parcel, classLoader);
        Enum r12 = svx.Y;
        this.c = r12;
        Enum r0 = ay31.b;
        this.d = r0;
        this.e = "";
        int i = parcel.readInt();
        int i2 = parcel.readInt();
        Enum[] enumArrValues = svx.values();
        int length = enumArrValues.length;
        int i3 = 0;
        while (true) {
            r7 = null;
            if (i3 >= length) {
                r8 = null;
                break;
            }
            r8 = enumArrValues[i3];
            if (r8.ordinal() == i) {
                break;
            } else {
                i3++;
            }
        }
        this.c = r8 != null ? r8 : r12;
        for (Enum r3 : ay31.values()) {
            if (r3.ordinal() == i2) {
                r7 = r3;
                break;
            }
        }
        this.d = r7 != null ? r7 : r0;
        String string = parcel.readString();
        this.e = string == null ? "1:1" : string;
    }

    public final svx b() {
        return this.c;
    }

    public final String g() {
        return this.e;
    }

    public final ay31 h() {
        return this.d;
    }

    public final void j(svx svxVar) {
        this.c = svxVar;
    }

    public final void k(String str) {
        this.e = str;
    }

    public final void l(ay31 ay31Var) {
        this.d = ay31Var;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(((i5) this).a, i);
        parcel.writeInt(this.c.ordinal());
        parcel.writeInt(this.d.ordinal());
        parcel.writeString(this.e);
    }

    public ivx(Parcelable parcelable) {
        super(parcelable);
        this.c = svx.Y;
        this.d = ay31.b;
        this.e = "";
    }
}
