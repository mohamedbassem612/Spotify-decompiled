package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wtg0 implements Parcelable {
    public static final Parcelable.Creator<wtg0> CREATOR = new isf0((byte) 28);
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;

    public wtg0(int i, int i2, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wtg0)) {
            return false;
        }
        wtg0 wtg0Var = (wtg0) obj;
        return u890.j(this.a, wtg0Var.a) && u890.j(this.b, wtg0Var.b) && this.c == wtg0Var.c && this.d == wtg0Var.d && u890.j(this.e, wtg0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + kaa0.f(this.d, kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
    }
}
