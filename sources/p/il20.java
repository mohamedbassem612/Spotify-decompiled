package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class il20 implements Parcelable {
    public static final Parcelable.Creator<il20> CREATOR = new qe20((byte) 11);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final tv80 f;

    public il20(String str, String str2, String str3, String str4, boolean z, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = tv80Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il20)) {
            return false;
        }
        il20 il20Var = (il20) obj;
        return u890.j(this.a, il20Var.a) && u890.j(this.b, il20Var.b) && u890.j(this.c, il20Var.c) && u890.j(this.d, il20Var.d) && this.e == il20Var.e && u890.j(this.f, il20Var.f);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        tv80 tv80Var = this.f;
        return iG + (tv80Var == null ? 0 : tv80Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeParcelable(this.f, i);
    }
}
