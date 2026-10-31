package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class j1z implements Parcelable {
    public static final Parcelable.Creator<j1z> CREATOR = new jhy(23);
    public final String a;
    public final String b;
    public final jlw0 c;
    public final Uri d;
    public final boolean e;
    public final boolean f;
    public final Long g;
    public final long h;
    public final String i;

    public j1z(String str, String str2, jlw0 jlw0Var, Uri uri, boolean z, boolean z2, Long l, long j, String str3) {
        this.a = str;
        this.b = str2;
        this.c = jlw0Var;
        this.d = uri;
        this.e = z;
        this.f = z2;
        this.g = l;
        this.h = j;
        this.i = str3;
    }

    public final boolean a() {
        return this.d != null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1z)) {
            return false;
        }
        j1z j1zVar = (j1z) obj;
        return u890.j(this.a, j1zVar.a) && u890.j(this.b, j1zVar.b) && u890.j(this.c, j1zVar.c) && u890.j(this.d, j1zVar.d) && this.e == j1zVar.e && this.f == j1zVar.f && u890.j(this.g, j1zVar.g) && this.h == j1zVar.h && u890.j(this.i, j1zVar.i);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31;
        Uri uri = this.d;
        int iG = xcg1.g(xcg1.g((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.e), 31, this.f);
        Long l = this.g;
        return this.i.hashCode() + cy30.f((iG + (l != null ? l.hashCode() : 0)) * 31, this.h, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        Long l = this.g;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            eqq.u(parcel, 1, l);
        }
        parcel.writeLong(this.h);
        parcel.writeString(this.i);
    }
}
