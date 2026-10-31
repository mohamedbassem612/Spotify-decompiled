package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ne71 extends pe71 {
    public static final Parcelable.Creator<ne71> CREATOR = new v871((byte) 25);
    public final String a;
    public final String b;
    public final String c;

    public ne71(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ne71)) {
            return false;
        }
        ne71 ne71Var = (ne71) obj;
        return u890.j(this.a, ne71Var.a) && u890.j(this.b, ne71Var.b) && u890.j(this.c, ne71Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
