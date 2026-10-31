package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wxa0 implements xxa0 {
    public static final Parcelable.Creator<wxa0> CREATOR = new jca0((byte) 12);
    public final yig1 a;

    public wxa0(yig1 yig1Var) {
        this.a = yig1Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wxa0) && u890.j(this.a, ((wxa0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
