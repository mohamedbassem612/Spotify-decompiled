package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class q21 extends s21 {
    public static final Parcelable.Creator<q21> CREATOR = new gp((byte) 27);
    public final String a;
    public final int b;
    public final String c;
    public final boolean d;

    public q21(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q21)) {
            return false;
        }
        q21 q21Var = (q21) obj;
        return u890.j(this.a, q21Var.a) && this.b == q21Var.b && u890.j(this.c, q21Var.c) && this.d == q21Var.d;
    }

    public final int hashCode() {
        int iF = kaa0.f(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((iF + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
