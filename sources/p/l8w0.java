package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l8w0 extends m8w0 {
    public static final Parcelable.Creator<l8w0> CREATOR = new w7w0((byte) 4);
    public final b8w0 a;

    public l8w0(b8w0 b8w0Var) {
        this.a = b8w0Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l8w0) && this.a == ((l8w0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
    }
}
