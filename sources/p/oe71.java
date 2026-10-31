package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oe71 extends pe71 {
    public static final Parcelable.Creator<oe71> CREATOR = new v871((byte) 26);
    public final String a;
    public final yy61 b;
    public final String c;
    public final String d;
    public final k771 e;

    public oe71(String str, yy61 yy61Var, String str2, String str3, k771 k771Var) {
        this.a = str;
        this.b = yy61Var;
        this.c = str2;
        this.d = str3;
        this.e = k771Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe71)) {
            return false;
        }
        oe71 oe71Var = (oe71) obj;
        return u890.j(this.a, oe71Var.a) && this.b == oe71Var.b && u890.j(this.c, oe71Var.c) && u890.j(this.d, oe71Var.d) && this.e == oe71Var.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        yy61 yy61Var = this.b;
        return this.e.hashCode() + cy30.d(cy30.d((iHashCode + (yy61Var == null ? 0 : yy61Var.hashCode())) * 31, 31, this.c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        yy61 yy61Var = this.b;
        if (yy61Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(yy61Var.name());
        }
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, i);
    }
}
