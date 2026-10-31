package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x2f0 extends l3f0 {
    public static final Parcelable.Creator<x2f0> CREATOR = new rwe0((byte) 16);
    public final String a;
    public final String b;

    public x2f0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String b() {
        return this.a;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2f0)) {
            return false;
        }
        x2f0 x2f0Var = (x2f0) obj;
        return u890.j(this.a, x2f0Var.a) && u890.j(this.b, x2f0Var.b);
    }

    public final String g() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
