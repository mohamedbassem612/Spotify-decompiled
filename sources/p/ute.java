package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ute implements oim {
    public static final Parcelable.Creator<ute> CREATOR = new zge((byte) 18);
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public ute(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ute)) {
            return false;
        }
        ute uteVar = (ute) obj;
        return u890.j(this.a, uteVar.a) && u890.j(this.b, uteVar.b) && u890.j(this.c, uteVar.c) && this.d == uteVar.d && this.e == uteVar.e && this.f == uteVar.f && this.g == uteVar.g;
    }

    public final bjm getTarget() {
        return null;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + xcg1.g(xcg1.g(xcg1.g(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
    }
}
