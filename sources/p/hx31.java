package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hx31 implements jx31 {
    public static final Parcelable.Creator<hx31> CREATOR = new xw31((byte) 9);
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final tcd1 i;
    public final List t;

    public hx31(String str, int i, int i2, String str2, int i3, int i4, boolean z, boolean z2, tcd1 tcd1Var, List list) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = i3;
        this.f = i4;
        this.g = z;
        this.h = z2;
        this.i = tcd1Var;
        this.t = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx31)) {
            return false;
        }
        hx31 hx31Var = (hx31) obj;
        return u890.j(this.a, hx31Var.a) && this.b == hx31Var.b && this.c == hx31Var.c && u890.j(this.d, hx31Var.d) && this.e == hx31Var.e && this.f == hx31Var.f && this.g == hx31Var.g && this.h == hx31Var.h && this.i == hx31Var.i && this.t.equals(hx31Var.t);
    }

    public final int hashCode() {
        return this.t.hashCode() + ((this.i.hashCode() + xcg1.g(xcg1.g(kaa0.f(this.f, kaa0.f(this.e, cy30.d(kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31), 31), 31, this.g), 31, this.h)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeString(this.i.name());
        Iterator itM = kk0.m(parcel, this.t);
        while (itM.hasNext()) {
            ((fx31) itM.next()).writeToParcel(parcel, i);
        }
    }
}
