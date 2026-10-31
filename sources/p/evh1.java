package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class evh1 implements Parcelable {
    public static final Parcelable.Creator<evh1> CREATOR = new gwg1((byte) 13);
    public final mvh1 a;
    public final bm41 b;
    public final ResultReceiver c;

    public evh1(mvh1 mvh1Var, bm41 bm41Var, ResultReceiver resultReceiver) {
        this.a = mvh1Var;
        this.b = bm41Var;
        this.c = resultReceiver;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evh1)) {
            return false;
        }
        evh1 evh1Var = (evh1) obj;
        return u890.j(this.a, evh1Var.a) && this.b == evh1Var.b && u890.j(this.c, evh1Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ResultReceiver resultReceiver = this.c;
        return iHashCode + (resultReceiver == null ? 0 : resultReceiver.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
    }
}
