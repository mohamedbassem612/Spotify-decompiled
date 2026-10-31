package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xsu0 implements Parcelable {
    public static final Parcelable.Creator<xsu0> CREATOR = new brt0((byte) 24);
    public final String a;
    public final CharSequence b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final List f;
    public final boolean g;
    public final boolean h;

    public xsu0(String str, CharSequence charSequence, String str2, boolean z, boolean z2, List list, boolean z3, boolean z4) {
        this.a = str;
        this.b = charSequence;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = list;
        this.g = z3;
        this.h = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xsu0)) {
            return false;
        }
        xsu0 xsu0Var = (xsu0) obj;
        return u890.j(this.a, xsu0Var.a) && u890.j(this.b, xsu0Var.b) && u890.j(this.c, xsu0Var.c) && this.d == xsu0Var.d && this.e == xsu0Var.e && this.f.equals(xsu0Var.f) && this.g == xsu0Var.g && this.h == xsu0Var.h;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return Boolean.hashCode(this.h) + xcg1.g(f4i1.b(xcg1.g(xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        TextUtils.writeToParcel(this.b, parcel, i);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        Iterator itM = kk0.m(parcel, this.f);
        while (itM.hasNext()) {
            ((gp51) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
    }
}
