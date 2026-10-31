package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a9d1 implements Parcelable {
    public static final Parcelable.Creator<a9d1> CREATOR = new pxc1((byte) 25);
    public final int a;
    public final w8d1 b;

    public a9d1(int i, w8d1 w8d1Var) {
        this.a = i;
        this.b = w8d1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9d1)) {
            return false;
        }
        a9d1 a9d1Var = (a9d1) obj;
        return this.a == a9d1Var.a && u890.j(this.b, a9d1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
