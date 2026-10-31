package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jc8 implements Parcelable {
    public static final Parcelable.Creator<jc8> CREATOR = new bu7((byte) 14);
    public final String a;
    public final String b;
    public final String c;
    public final k4m d;
    public final boolean e;
    public final List f;
    public final boolean g;
    public final boolean h;

    public jc8(String str, String str2, String str3, k4m k4mVar, boolean z, List list, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = k4mVar;
        this.e = z;
        this.f = list;
        this.g = z2;
        this.h = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc8)) {
            return false;
        }
        jc8 jc8Var = (jc8) obj;
        return u890.j(this.a, jc8Var.a) && u890.j(this.b, jc8Var.b) && u890.j(this.c, jc8Var.c) && this.d == jc8Var.d && this.e == jc8Var.e && this.f.equals(jc8Var.f) && this.g == jc8Var.g && this.h == jc8Var.h;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.h) + xcg1.g(f4i1.b(xcg1.g(p3d1.g(this.d, (iD + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.e), 31, this.f), 31, this.g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d.name());
        parcel.writeInt(this.e ? 1 : 0);
        Iterator itM = kk0.m(parcel, this.f);
        while (itM.hasNext()) {
            ((gp51) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
    }
}
