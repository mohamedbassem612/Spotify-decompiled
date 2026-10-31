package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lg31 extends ng31 {
    public static final Parcelable.Creator<lg31> CREATOR = new s231((byte) 17);
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;

    public lg31(int i, int i2, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = str3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lg31)) {
            return false;
        }
        lg31 lg31Var = (lg31) obj;
        return u890.j(this.a, lg31Var.a) && u890.j(this.b, lg31Var.b) && this.c == lg31Var.c && this.d == lg31Var.d && u890.j(this.e, lg31Var.e);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.d, kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31);
        String str = this.e;
        return iF + (str == null ? 0 : str.hashCode());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
    }
}
