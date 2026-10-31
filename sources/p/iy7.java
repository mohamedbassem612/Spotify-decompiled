package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class iy7 implements Parcelable {
    public static final Parcelable.Creator<iy7> CREATOR = new bu7((byte) 5);
    public final String a;
    public final String b;
    public final sx7 c;

    public iy7(String str, String str2, sx7 sx7Var) {
        this.a = str;
        this.b = str2;
        this.c = sx7Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iy7)) {
            return false;
        }
        iy7 iy7Var = (iy7) obj;
        return u890.j(this.a, iy7Var.a) && u890.j(this.b, iy7Var.b) && this.c == iy7Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c.name());
    }
}
