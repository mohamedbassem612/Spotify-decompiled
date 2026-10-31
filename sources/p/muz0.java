package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class muz0 implements Parcelable {
    public static final Parcelable.Creator<muz0> CREATOR = new erz0((byte) 5);
    public final String a;
    public final String b;
    public final boolean c;
    public final Integer d;

    public muz0(String str, String str2, boolean z, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof muz0)) {
            return false;
        }
        muz0 muz0Var = (muz0) obj;
        return u890.j(this.a, muz0Var.a) && u890.j(this.b, muz0Var.b) && this.c == muz0Var.c && u890.j(this.d, muz0Var.d);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        return iG + (num == null ? 0 : num.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
    }
}
