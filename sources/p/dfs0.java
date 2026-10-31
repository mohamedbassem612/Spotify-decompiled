package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dfs0 implements ffs0 {
    public static final Parcelable.Creator<dfs0> CREATOR = new ybs0((byte) 16);
    public final String a;
    public final String b;
    public final long c;

    public dfs0(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final long C0() {
        return this.c;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfs0)) {
            return false;
        }
        dfs0 dfs0Var = (dfs0) obj;
        return u890.j(this.a, dfs0Var.a) && u890.j(this.b, dfs0Var.b) && this.c == dfs0Var.c;
    }

    public final String getRequestId() {
        return this.a;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
    }
}
