package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class og40 implements Parcelable {
    public static final Parcelable.Creator<og40> CREATOR = new fd40((byte) 2);
    public final nmu0 a;
    public final ResultReceiver b;

    public og40(nmu0 nmu0Var, ResultReceiver resultReceiver) {
        this.a = nmu0Var;
        this.b = resultReceiver;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof og40)) {
            return false;
        }
        og40 og40Var = (og40) obj;
        return this.a == og40Var.a && u890.j(this.b, og40Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ResultReceiver resultReceiver = this.b;
        return iHashCode + (resultReceiver == null ? 0 : resultReceiver.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
        parcel.writeParcelable(this.b, i);
    }
}
