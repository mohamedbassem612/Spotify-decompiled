package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class be7 implements Parcelable {
    public static final Parcelable.Creator<be7> CREATOR = new f67((byte) 12);
    public final String a;
    public final String b;
    public final String c;
    public final yd7 d;
    public final me7 e;

    public be7(String str, String str2, String str3, yd7 yd7Var, me7 me7Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = yd7Var;
        this.e = me7Var;
    }

    public final yd7 a() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be7)) {
            return false;
        }
        be7 be7Var = (be7) obj;
        return u890.j(this.a, be7Var.a) && u890.j(this.b, be7Var.b) && u890.j(this.c, be7Var.c) && u890.j(this.d, be7Var.d) && this.e == be7Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
    }
}
