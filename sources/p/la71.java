package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class la71 extends u9 {
    public static final Parcelable.Creator<la71> CREATOR = new v871((byte) 3);
    public final long a;
    public final long b;
    public final String c;

    public la71(long j, long j2, String str) {
        this.a = j;
        this.b = j2;
        this.c = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la71)) {
            return false;
        }
        la71 la71Var = (la71) obj;
        long j = la71Var.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && z4h1.b(this.b, la71Var.b) && u890.j(this.c, la71Var.c);
    }

    public final int hashCode() {
        int i = u7h.l;
        return this.c.hashCode() + cy30.f(Long.hashCode(this.a) * 31, this.b, 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(z4p1.G(this.a));
        parcel.writeInt(z4p1.G(this.b));
        parcel.writeString(this.c);
    }
}
