package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class odm0 implements pdm0 {
    public static final Parcelable.Creator<odm0> CREATOR = new w9k0((byte) 11);
    public final String a;
    public final String b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;

    public odm0(int i, int i2, String str, String str2, List list, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof odm0)) {
            return false;
        }
        odm0 odm0Var = (odm0) obj;
        return u890.j(this.a, odm0Var.a) && u890.j(this.b, odm0Var.b) && u890.j(this.c, odm0Var.c) && this.d == odm0Var.d && this.e == odm0Var.e && this.f == odm0Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + xcg1.g(kaa0.f(this.d, f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        Iterator itM = kk0.m(parcel, this.c);
        while (itM.hasNext()) {
            ((sr10) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f);
    }

    public /* synthetic */ odm0(String str, List list, String str2) {
        this(0, -1, str, str2, list, true);
    }
}
