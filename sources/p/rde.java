package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rde implements Parcelable {
    public static final Parcelable.Creator<rde> CREATOR = new xud((byte) 23);
    public final String a;
    public final bee b;

    public rde(String str, bee beeVar) {
        this.a = str;
        this.b = beeVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rde)) {
            return false;
        }
        rde rdeVar = (rde) obj;
        return u890.j(this.a, rdeVar.a) && u890.j(this.b, rdeVar.b);
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
