package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v2f0 extends l3f0 {
    public static final Parcelable.Creator<v2f0> CREATOR = new rwe0((byte) 14);
    public final String a;

    public v2f0(String str) {
        this.a = str;
    }

    public final String b() {
        return this.a;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v2f0) && u890.j(this.a, ((v2f0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
