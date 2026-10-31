package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l0b implements Parcelable {
    public static final Parcelable.Creator<l0b> CREATOR = new hbn1((byte) 5);
    public final String a;
    public final String b;

    public l0b(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0b)) {
            return false;
        }
        l0b l0bVar = (l0b) obj;
        return u890.j(this.a, l0bVar.a) && u890.j(this.b, l0bVar.b);
    }

    public final String getPageUri() {
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
