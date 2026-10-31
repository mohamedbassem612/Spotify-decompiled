package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tf60 extends vf60 {
    public static final Parcelable.Creator<tf60> CREATOR = new xk50((byte) 22);
    public final String a;
    public final int b;
    public final long c;
    public final kn71 d;

    public tf60(String str, int i, long j, kn71 kn71Var) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = kn71Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf60)) {
            return false;
        }
        tf60 tf60Var = (tf60) obj;
        return u890.j(this.a, tf60Var.a) && this.b == tf60Var.b && this.c == tf60Var.c && this.d == tf60Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.f(kaa0.f(this.b, this.a.hashCode() * 31, 31), this.c, 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeLong(this.c);
        parcel.writeString(this.d.name());
    }
}
