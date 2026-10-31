package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h460 implements knt, Parcelable {
    public static final Parcelable.Creator<h460> CREATOR = new xk50((byte) 14);
    public final String a;
    public final String b;
    public final int c;

    public h460(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h460)) {
            return false;
        }
        h460 h460Var = (h460) obj;
        return u890.j(this.a, h460Var.a) && u890.j(this.b, h460Var.b) && this.c == h460Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
    }
}
