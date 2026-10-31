package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class sr10 implements Parcelable {
    public static final Parcelable.Creator<sr10> CREATOR = new no10((byte) 10);
    public final String a;
    public final String b;
    public final lhg1 c;
    public final boolean d;

    public sr10(String str, String str2, lhg1 lhg1Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = lhg1Var;
        this.d = z;
    }

    public static sr10 a(sr10 sr10Var, lhg1 lhg1Var) {
        return new sr10(sr10Var.a, sr10Var.b, lhg1Var, sr10Var.d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr10)) {
            return false;
        }
        sr10 sr10Var = (sr10) obj;
        return u890.j(this.a, sr10Var.a) && u890.j(this.b, sr10Var.b) && u890.j(this.c, sr10Var.c) && this.d == sr10Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
