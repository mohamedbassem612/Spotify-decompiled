package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q8r0 implements Parcelable {
    public static final Parcelable.Creator<q8r0> CREATOR = new p7q0((byte) 26);
    public final String a;
    public final String b;
    public final String c;

    public q8r0(String str, String str2, String str3) {
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
        if (!(obj instanceof q8r0)) {
            return false;
        }
        q8r0 q8r0Var = (q8r0) obj;
        return u890.j(this.a, q8r0Var.a) && u890.j(this.b, q8r0Var.b) && u890.j(this.c, q8r0Var.c);
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
