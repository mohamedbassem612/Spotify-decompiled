package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t4c1 implements u4c1 {
    public static final Parcelable.Creator<t4c1> CREATOR = new yub1((byte) 21);
    public final int a;
    public final int b;

    public t4c1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // p.u4c1
    public final int A() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4c1)) {
            return false;
        }
        t4c1 t4c1Var = (t4c1) obj;
        return this.a == t4c1Var.a && this.b == t4c1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }
}
