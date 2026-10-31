package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class su1 implements Parcelable {
    public static final Parcelable.Creator<su1> CREATOR = new d41(23);
    public final long a;
    public final vo1 b;

    public su1(long j, vo1 vo1Var) {
        this.a = j;
        this.b = vo1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su1)) {
            return false;
        }
        su1 su1Var = (su1) obj;
        return this.a == su1Var.a && u890.j(this.b, su1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
