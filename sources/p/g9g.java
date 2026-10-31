package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g9g implements Parcelable {
    public static final Parcelable.Creator<g9g> CREATOR = new i8g((byte) 14);
    public final String a;
    public final hn90 b;

    public g9g(String str, hn90 hn90Var) {
        this.a = str;
        this.b = hn90Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9g)) {
            return false;
        }
        g9g g9gVar = (g9g) obj;
        return u890.j(this.a, g9gVar.a) && u890.j(this.b, g9gVar.b);
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
