package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class td90 implements ud90 {
    public static final Parcelable.Creator<td90> CREATOR = new xl80((byte) 21);
    public final String a;
    public final String b;

    public td90(String str, String str2) {
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
        if (!(obj instanceof td90)) {
            return false;
        }
        td90 td90Var = (td90) obj;
        return u890.j(this.a, td90Var.a) && u890.j(this.b, td90Var.b);
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
