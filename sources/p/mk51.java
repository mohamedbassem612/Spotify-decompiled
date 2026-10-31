package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mk51 implements ok51 {
    public static final Parcelable.Creator<mk51> CREATOR = new ge51((byte) 5);
    public final String a;
    public final String b;

    public mk51(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mk51)) {
            return false;
        }
        mk51 mk51Var = (mk51) obj;
        return u890.j(this.a, mk51Var.a) && u890.j(this.b, mk51Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public final String y() {
        return this.b;
    }
}
