package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bmi0 implements Parcelable {
    public static final Parcelable.Creator<bmi0> CREATOR = new cyh0((byte) 24);
    public final String a;
    public final String b;
    public final String c;
    public final ygk1 d;

    public bmi0(String str, String str2, String str3, ygk1 ygk1Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = ygk1Var;
    }

    public static bmi0 a(bmi0 bmi0Var, ygk1 ygk1Var) {
        return new bmi0(bmi0Var.a, bmi0Var.b, bmi0Var.c, ygk1Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmi0)) {
            return false;
        }
        bmi0 bmi0Var = (bmi0) obj;
        return u890.j(this.a, bmi0Var.a) && u890.j(this.b, bmi0Var.b) && u890.j(this.c, bmi0Var.c) && u890.j(this.d, bmi0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
    }
}
