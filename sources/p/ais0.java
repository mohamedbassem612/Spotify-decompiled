package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ais0 implements dis0 {
    public static final Parcelable.Creator<ais0> CREATOR = new ybs0((byte) 29);
    public final String a;
    public final String b;
    public final String c;

    public ais0(String str, String str2, String str3) {
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
        if (!(obj instanceof ais0)) {
            return false;
        }
        ais0 ais0Var = (ais0) obj;
        return u890.j(this.a, ais0Var.a) && u890.j(this.b, ais0Var.b) && u890.j(this.c, ais0Var.c);
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
