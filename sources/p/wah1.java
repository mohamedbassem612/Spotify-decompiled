package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wah1 implements Parcelable {
    public static final Parcelable.Creator<wah1> CREATOR = new gwg1((byte) 1);
    public final String a;
    public final ResultReceiver b;

    public wah1(String str, ResultReceiver resultReceiver) {
        this.a = str;
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
        if (!(obj instanceof wah1)) {
            return false;
        }
        wah1 wah1Var = (wah1) obj;
        return u890.j(this.a, wah1Var.a) && u890.j(this.b, wah1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ResultReceiver resultReceiver = this.b;
        return iHashCode + (resultReceiver == null ? 0 : resultReceiver.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
