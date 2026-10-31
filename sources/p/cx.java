package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cx extends dx {
    public static final Parcelable.Creator<cx> CREATOR = new gp((byte) 10);
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final List h;
    public final boolean i;

    public cx(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str2, List list, boolean z6) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = str2;
        this.h = list;
        this.i = z6;
    }

    public static cx a(cx cxVar, boolean z) {
        return new cx(cxVar.a, cxVar.b, z, cxVar.d, cxVar.e, cxVar.f, cxVar.g, cxVar.h, cxVar.i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx)) {
            return false;
        }
        cx cxVar = (cx) obj;
        return u890.j(this.a, cxVar.a) && this.b == cxVar.b && this.c == cxVar.c && this.d == cxVar.d && this.e == cxVar.e && this.f == cxVar.f && u890.j(this.g, cxVar.g) && u890.j(this.h, cxVar.h) && this.i == cxVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + f4i1.b(cy30.d(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeString(this.g);
        parcel.writeStringList(this.h);
        parcel.writeInt(this.i ? 1 : 0);
    }
}
