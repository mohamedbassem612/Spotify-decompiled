package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jic1 implements Parcelable {
    public static final Parcelable.Creator<jic1> CREATOR = new y7c1((byte) 12);
    public final Integer a;
    public final y6h1 b;

    public jic1(Integer num, y6h1 y6h1Var) {
        this.a = num;
        this.b = y6h1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jic1)) {
            return false;
        }
        jic1 jic1Var = (jic1) obj;
        return u890.j(this.a, jic1Var.a) && u890.j(this.b, jic1Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        y6h1 y6h1Var = this.b;
        return iHashCode + (y6h1Var != null ? y6h1Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.a;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        parcel.writeSerializable(this.b);
    }
}
