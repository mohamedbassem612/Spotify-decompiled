package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v68 extends ei90 {
    public static final Parcelable.Creator<v68> CREATOR = new bu7((byte) 10);
    public final List a;
    public final boolean b;
    public final kfv c;
    public final String d;
    public final String e;
    public final boolean f;
    public final t68 g;
    public final double h;

    public v68(List list, boolean z, kfv kfvVar, String str, String str2, boolean z2, t68 t68Var, double d) {
        this.a = list;
        this.b = z;
        this.c = kfvVar;
        this.d = str;
        this.e = str2;
        this.f = z2;
        this.g = t68Var;
        this.h = d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v68)) {
            return false;
        }
        v68 v68Var = (v68) obj;
        return this.a.equals(v68Var.a) && this.b == v68Var.b && u890.j(this.c, v68Var.c) && u890.j(this.d, v68Var.d) && u890.j(this.e, v68Var.e) && this.f == v68Var.f && u890.j(this.g, v68Var.g) && Double.compare(this.h, v68Var.h) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.h) + ((this.g.hashCode() + xcg1.g(cy30.d(cy30.d(cy30.f(xcg1.g(this.a.hashCode() * 31, 31, this.b), this.c.a, 31), 31, this.d), 31, this.e), 31, this.f)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        this.c.writeToParcel(parcel, i);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeValue(this.g);
        parcel.writeDouble(this.h);
    }
}
