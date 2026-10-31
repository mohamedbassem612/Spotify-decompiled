package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ta71 implements Parcelable {
    public static final Parcelable.Creator<ta71> CREATOR = new v871((byte) 6);
    public final Uri a;
    public final String b;
    public final h3i0 c;
    public final Long d;
    public final long e;
    public final long f;
    public final jdj1 g;
    public final boolean h;
    public final boolean i;

    public ta71(Uri uri, String str, h3i0 h3i0Var, Long l, long j, long j2, jdj1 jdj1Var, boolean z, boolean z2) {
        this.a = uri;
        this.b = str;
        this.c = h3i0Var;
        this.d = l;
        this.e = j;
        this.f = j2;
        this.g = jdj1Var;
        this.h = z;
        this.i = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta71)) {
            return false;
        }
        ta71 ta71Var = (ta71) obj;
        return u890.j(this.a, ta71Var.a) && u890.j(this.b, ta71Var.b) && this.c == ta71Var.c && u890.j(this.d, ta71Var.d) && this.e == ta71Var.e && this.f == ta71Var.f && u890.j(this.g, ta71Var.g) && this.h == ta71Var.h && this.i == ta71Var.i;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31;
        Long l = this.d;
        return Boolean.hashCode(this.i) + xcg1.g((this.g.hashCode() + cy30.f(cy30.f((iHashCode + (l == null ? 0 : l.hashCode())) * 31, this.e, 31), this.f, 31)) * 31, 31, this.h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        this.c.writeToParcel(parcel, i);
        Long l = this.d;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            eqq.u(parcel, 1, l);
        }
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
        parcel.writeParcelable(this.g, i);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
    }
}
