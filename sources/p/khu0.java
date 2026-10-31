package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class khu0 implements Parcelable {
    public static final Parcelable.Creator<khu0> CREATOR = new brt0((byte) 17);
    public final String a;
    public final CharSequence b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final List h;
    public final boolean i;

    public khu0(String str, CharSequence charSequence, String str2, boolean z, boolean z2, boolean z3, int i, List list, boolean z4) {
        this.a = str;
        this.b = charSequence;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = i;
        this.h = list;
        this.i = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khu0)) {
            return false;
        }
        khu0 khu0Var = (khu0) obj;
        return u890.j(this.a, khu0Var.a) && u890.j(this.b, khu0Var.b) && u890.j(this.c, khu0Var.c) && this.d == khu0Var.d && this.e == khu0Var.e && this.f == khu0Var.f && this.g == khu0Var.g && u890.j(this.h, khu0Var.h) && this.i == khu0Var.i;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return Boolean.hashCode(this.i) + f4i1.b(ab80.k(this.g, xcg1.g(xcg1.g(xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31), 31, this.h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        TextUtils.writeToParcel(this.b, parcel, i);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeString(fd21.o(this.g));
        parcel.writeStringList(this.h);
        parcel.writeInt(this.i ? 1 : 0);
    }
}
