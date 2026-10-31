package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dx20 implements Parcelable {
    public static final Parcelable.Creator<dx20> CREATOR = new qe20((byte) 25);
    public final nx20 a;

    public dx20(nx20 nx20Var) {
        this.a = nx20Var;
    }

    public final nx20 a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dx20) && u890.j(this.a, ((dx20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
