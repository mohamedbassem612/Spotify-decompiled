package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e9g implements Parcelable {
    public static final Parcelable.Creator<e9g> CREATOR = new i8g((byte) 12);
    public final String a;
    public final d9g b;

    public e9g(String str, d9g d9gVar) {
        this.a = str;
        this.b = d9gVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9g)) {
            return false;
        }
        e9g e9gVar = (e9g) obj;
        return u890.j(this.a, e9gVar.a) && u890.j(this.b, e9gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
