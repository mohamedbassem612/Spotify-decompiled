package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uve1 implements xve1 {
    public static final Parcelable.Creator<uve1> CREATOR = new lse1(5);
    public final long a;

    public /* synthetic */ uve1(long j) {
        this.a = j;
    }

    public static final /* synthetic */ uve1 a(long j) {
        return new uve1(j);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uve1) {
            return this.a == ((uve1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return gvg.f(this.a, "Ingested(ms=", ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
    }
}
