package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f4z0 implements h4z0 {
    public static final Parcelable.Creator<f4z0> CREATOR = new j1z0((byte) 6);
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public f4z0(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4z0)) {
            return false;
        }
        f4z0 f4z0Var = (f4z0) obj;
        return u890.j(this.a, f4z0Var.a) && u890.j(this.b, f4z0Var.b) && u890.j(this.c, f4z0Var.c) && this.d == f4z0Var.d;
    }

    public final boolean f() {
        return this.d;
    }

    public final String getDescription() {
        return this.c;
    }

    public final String getText() {
        return this.b;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
