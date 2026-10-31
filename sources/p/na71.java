package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class na71 extends u9 {
    public static final Parcelable.Creator<na71> CREATOR = new v871((byte) 5);
    public final Uri a;
    public final long b;
    public final long c;
    public final Long d;
    public final int e;
    public final b3k1 f;
    public final boolean g;
    public final boolean h;
    public final String i;

    public na71(Uri uri, long j, long j2, Long l, int i, b3k1 b3k1Var, boolean z, boolean z2, String str) {
        this.a = uri;
        this.b = j;
        this.c = j2;
        this.d = l;
        this.e = i;
        this.f = b3k1Var;
        this.g = z;
        this.h = z2;
        this.i = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na71)) {
            return false;
        }
        na71 na71Var = (na71) obj;
        return u890.j(this.a, na71Var.a) && this.b == na71Var.b && this.c == na71Var.c && u890.j(this.d, na71Var.d) && this.e == na71Var.e && this.f == na71Var.f && this.g == na71Var.g && this.h == na71Var.h && u890.j(this.i, na71Var.i);
    }

    public final int hashCode() {
        int iF = cy30.f(cy30.f(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        Long l = this.d;
        return this.i.hashCode() + xcg1.g(xcg1.g((this.f.hashCode() + ab80.k(this.e, (iF + (l == null ? 0 : l.hashCode())) * 31, 31)) * 31, 31, this.g), 31, this.h);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeParcelable(this.a, i);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        Long l = this.d;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            eqq.u(parcel, 1, l);
        }
        int i2 = this.e;
        if (i2 == 1) {
            str = "PLAYING";
        } else if (i2 == 2) {
            str = "PAUSED";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "STOPPED";
        }
        parcel.writeString(str);
        parcel.writeString(this.f.name());
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeString(this.i);
    }
}
