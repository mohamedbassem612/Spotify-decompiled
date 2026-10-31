package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pwe0 implements xwe0 {
    public static final Parcelable.Creator<pwe0> CREATOR = new lbe0((byte) 22);
    public final owe0 a;

    public pwe0(owe0 owe0Var) {
        this.a = owe0Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pwe0) && u890.j(this.a, ((pwe0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
