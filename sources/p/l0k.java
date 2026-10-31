package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l0k implements Parcelable {
    public static final Parcelable.Creator<l0k> CREATOR = new v6h((byte) 11);
    public final String a;
    public final String b;

    public l0k(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0k)) {
            return false;
        }
        l0k l0kVar = (l0k) obj;
        return u890.j(this.a, l0kVar.a) && u890.j(this.b, l0kVar.b);
    }

    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
