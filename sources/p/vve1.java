package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vve1 implements xve1 {
    public static final Parcelable.Creator<vve1> CREATOR = new lse1((byte) 6);
    public final long a;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public final /* synthetic */ long b() {
        return this.a;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vve1) {
            return this.a == ((vve1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return gvg.f(this.a, "User(ms=", ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
    }
}
