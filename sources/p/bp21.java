package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bp21 implements Parcelable {
    public final String a;
    public static final nl7 b = new nl7(ap21.a, (byte) 11);
    public static final Parcelable.Creator<bp21> CREATOR = new g321((byte) 15);

    public static String a(String str) {
        return f4i1.f("RequestId(value=", str, ")");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bp21) {
            return this.a.equals(((bp21) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
