package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g7z implements Parcelable {
    public static final Parcelable.Creator<g7z> CREATOR = new jhy((byte) 26);
    public final String a;
    public final Bundle b;
    public final String c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final Long g;
    public final boolean h;
    public final boolean i;
    public final boolean t;

    public g7z(String str, Bundle bundle, String str2, Long l, Long l2, Long l3, Long l4, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = bundle;
        this.c = str2;
        this.d = l;
        this.e = l2;
        this.f = l3;
        this.g = l4;
        this.h = z;
        this.i = z2;
        this.t = z3;
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7z)) {
            return false;
        }
        g7z g7zVar = (g7z) obj;
        return u890.j(this.a, g7zVar.a) && u890.j(this.b, g7zVar.b) && u890.j(this.c, g7zVar.c) && u890.j(this.d, g7zVar.d) && u890.j(this.e, g7zVar.e) && u890.j(this.f, g7zVar.f) && u890.j(this.g, g7zVar.g) && this.h == g7zVar.h && this.i == g7zVar.i && this.t == g7zVar.t;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Bundle bundle = this.b;
        int iD = cy30.d((iHashCode + (bundle == null ? 0 : bundle.hashCode())) * 31, 31, this.c);
        Long l = this.d;
        int iHashCode2 = (iD + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.e;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.g;
        return Boolean.hashCode(this.t) + xcg1.g(xcg1.g((iHashCode4 + (l4 != null ? l4.hashCode() : 0)) * 31, 31, this.h), 31, this.i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeBundle(this.b);
        parcel.writeString(this.c);
        Long l = this.d;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            eqq.u(parcel, 1, l);
        }
        Long l2 = this.e;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            eqq.u(parcel, 1, l2);
        }
        Long l3 = this.f;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            eqq.u(parcel, 1, l3);
        }
        Long l4 = this.g;
        if (l4 == null) {
            parcel.writeInt(0);
        } else {
            eqq.u(parcel, 1, l4);
        }
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.t ? 1 : 0);
    }
}
