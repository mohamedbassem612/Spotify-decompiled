package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uf60 extends vf60 {
    public static final Parcelable.Creator<uf60> CREATOR = new xk50((byte) 23);
    public final String a;
    public final int b;
    public final long c;

    public uf60(long j, int i, String str) {
        this.a = str;
        this.b = i;
        this.c = j;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf60)) {
            return false;
        }
        uf60 uf60Var = (uf60) obj;
        return u890.j(this.a, uf60Var.a) && this.b == uf60Var.b && this.c == uf60Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeLong(this.c);
    }
}
