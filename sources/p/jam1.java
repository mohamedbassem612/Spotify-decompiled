package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jam1 implements pam1 {
    public static final Parcelable.Creator<jam1> CREATOR = new w8m1((byte) 19);
    public final Integer a;
    public final boolean b;

    public jam1(Integer num, boolean z) {
        this.a = num;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jam1)) {
            return false;
        }
        jam1 jam1Var = (jam1) obj;
        return u890.j(this.a, jam1Var.a) && this.b == jam1Var.b;
    }

    public final int hashCode() {
        Integer num = this.a;
        return Boolean.hashCode(this.b) + ((num == null ? 0 : num.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.a;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        parcel.writeInt(this.b ? 1 : 0);
    }
}
