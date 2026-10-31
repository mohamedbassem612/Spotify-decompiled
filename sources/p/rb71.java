package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rb71 implements Parcelable {
    public static final Parcelable.Creator<rb71> CREATOR = new v871((byte) 14);
    public final float a;
    public final qb71 b;

    public rb71(float f, qb71 qb71Var) {
        this.a = f;
        this.b = qb71Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb71)) {
            return false;
        }
        rb71 rb71Var = (rb71) obj;
        return Float.compare(this.a, rb71Var.a) == 0 && u890.j(this.b, rb71Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
