package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yae0 implements cce0 {
    public static final Parcelable.Creator<yae0> CREATOR = new qod0((byte) 17);
    public final Throwable a;

    public yae0(Throwable th) {
        this.a = th;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yae0) && u890.j(this.a, ((yae0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.a);
    }
}
