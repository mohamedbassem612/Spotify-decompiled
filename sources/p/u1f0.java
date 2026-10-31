package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u1f0 implements Parcelable {
    public static final Parcelable.Creator<u1f0> CREATOR = new rwe0((byte) 13);
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final boolean e;

    public u1f0(Integer num, String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1f0)) {
            return false;
        }
        u1f0 u1f0Var = (u1f0) obj;
        return u890.j(this.a, u1f0Var.a) && u890.j(this.b, u1f0Var.b) && u890.j(this.c, u1f0Var.c) && u890.j(this.d, u1f0Var.d) && this.e == u1f0Var.e;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        return Boolean.hashCode(this.e) + ((iD + (num == null ? 0 : num.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        parcel.writeInt(this.e ? 1 : 0);
    }
}
