package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a5t0 implements Parcelable {
    public static final Parcelable.Creator<a5t0> CREATOR = new bis0((byte) 27);
    public final String a;
    public final String b;
    public final boolean c;

    public a5t0(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5t0)) {
            return false;
        }
        a5t0 a5t0Var = (a5t0) obj;
        return u890.j(this.a, a5t0Var.a) && u890.j(this.b, a5t0Var.b) && this.c == a5t0Var.c;
    }

    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
