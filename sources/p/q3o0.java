package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q3o0 implements Parcelable {
    public static final Parcelable.Creator<q3o0> CREATOR = new dan0((byte) 27);
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;
    public final y0o0 e;

    public q3o0(int i, String str, String str2, boolean z, y0o0 y0o0Var) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = y0o0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3o0)) {
            return false;
        }
        q3o0 q3o0Var = (q3o0) obj;
        return this.a == q3o0Var.a && u890.j(this.b, q3o0Var.b) && u890.j(this.c, q3o0Var.c) && this.d == q3o0Var.d && u890.j(this.e, q3o0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xcg1.g(cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeParcelable(this.e, i);
    }
}
