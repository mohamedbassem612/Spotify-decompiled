package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bq90 implements Parcelable {
    public static final Parcelable.Creator<bq90> CREATOR = new qg90((byte) 22);
    public final ye10 a;
    public final ye10 b;

    public bq90(ye10 ye10Var, ye10 ye10Var2) {
        this.a = ye10Var;
        this.b = ye10Var2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq90)) {
            return false;
        }
        bq90 bq90Var = (bq90) obj;
        return u890.j(this.a, bq90Var.a) && u890.j(this.b, bq90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        this.b.writeToParcel(parcel, i);
    }
}
