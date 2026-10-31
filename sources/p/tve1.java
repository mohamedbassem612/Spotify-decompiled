package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tve1 implements xve1 {
    public static final Parcelable.Creator<tve1> CREATOR = new lse1((byte) 3);
    public final long a;

    public /* synthetic */ tve1(long j) {
        this.a = j;
    }

    public static final /* synthetic */ tve1 a(long j) {
        return new tve1(j);
    }

    public static final boolean b(long j, long j2) {
        return j == j2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tve1) {
            return this.a == ((tve1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return gvg.f(this.a, "Creator(ms=", ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
    }
}
