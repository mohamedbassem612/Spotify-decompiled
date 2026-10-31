package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i3f0 extends l3f0 {
    public static final Parcelable.Creator<i3f0> CREATOR = new rwe0((byte) 27);
    public final String a;
    public final String b;
    public final String c;

    public i3f0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String b() {
        return this.b;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3f0)) {
            return false;
        }
        i3f0 i3f0Var = (i3f0) obj;
        return u890.j(this.a, i3f0Var.a) && u890.j(this.b, i3f0Var.b) && u890.j(this.c, i3f0Var.c);
    }

    public final String g() {
        return this.a;
    }

    public final String h() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
