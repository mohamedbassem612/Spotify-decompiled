package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uod1 implements Parcelable {
    public static final Parcelable.Creator<uod1> CREATOR = new pxc1((byte) 28);
    public final String a;
    public final String b;
    public final int c;
    public final Integer d;

    public uod1(int i, String str, Integer num, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
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
        if (!(obj instanceof uod1)) {
            return false;
        }
        uod1 uod1Var = (uod1) obj;
        return u890.j(this.a, uod1Var.a) && u890.j(this.b, uod1Var.b) && this.c == uod1Var.c && u890.j(this.d, uod1Var.d);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        Integer num = this.d;
        return iF + (num == null ? 0 : num.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
    }
}
