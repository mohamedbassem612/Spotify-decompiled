package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qgm1 implements vgm1 {
    public static final Parcelable.Creator<qgm1> CREATOR = new lfm1((byte) 16);
    public final Integer a;
    public final boolean b;

    public qgm1(Integer num, boolean z) {
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
        if (!(obj instanceof qgm1)) {
            return false;
        }
        qgm1 qgm1Var = (qgm1) obj;
        return u890.j(this.a, qgm1Var.a) && this.b == qgm1Var.b;
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
