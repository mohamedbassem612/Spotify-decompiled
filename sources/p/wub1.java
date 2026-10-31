package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wub1 implements Parcelable {
    public static final Parcelable.Creator<wub1> CREATOR = new olb1((byte) 27);
    public final String a;
    public final h10 b;
    public final zo41 c;
    public final wub1 d;
    public final wub1 e;

    public wub1(String str, h10 h10Var, zo41 zo41Var, wub1 wub1Var, wub1 wub1Var2) {
        this.a = str;
        this.b = h10Var;
        this.c = zo41Var;
        this.d = wub1Var;
        this.e = wub1Var2;
    }

    public static wub1 a(wub1 wub1Var, zo41 zo41Var) {
        String str = wub1Var.a;
        h10 h10Var = wub1Var.b;
        wub1 wub1Var2 = wub1Var.d;
        wub1 wub1Var3 = wub1Var.e;
        wub1Var.getClass();
        return new wub1(str, h10Var, zo41Var, wub1Var2, wub1Var3);
    }

    public final zo41 b() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wub1)) {
            return false;
        }
        wub1 wub1Var = (wub1) obj;
        return u890.j(this.a, wub1Var.a) && u890.j(this.b, wub1Var.b) && u890.j(this.c, wub1Var.c) && u890.j(this.d, wub1Var.d) && u890.j(this.e, wub1Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        wub1 wub1Var = this.d;
        int iHashCode2 = (iHashCode + (wub1Var == null ? 0 : wub1Var.hashCode())) * 31;
        wub1 wub1Var2 = this.e;
        return iHashCode2 + (wub1Var2 != null ? wub1Var2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        wub1 wub1Var = this.d;
        if (wub1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wub1Var.writeToParcel(parcel, i);
        }
        wub1 wub1Var2 = this.e;
        if (wub1Var2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wub1Var2.writeToParcel(parcel, i);
        }
    }
}
