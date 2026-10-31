package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pi70 extends hj70 {
    public static final Parcelable.Creator<pi70> CREATOR = new ai70((byte) 12);
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public pi70(String str, String str2, String str3, String str4, String str5) {
        super(2, 1);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pi70)) {
            return false;
        }
        pi70 pi70Var = (pi70) obj;
        return u890.j(this.c, pi70Var.c) && u890.j(this.d, pi70Var.d) && u890.j(this.e, pi70Var.e) && u890.j(this.f, pi70Var.f) && u890.j(this.g, pi70Var.g);
    }

    public final int hashCode() {
        String str = this.c;
        return this.g.hashCode() + cy30.d(cy30.d(cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }
}
