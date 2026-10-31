package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lfi1 implements Parcelable {
    public static final Parcelable.Creator<lfi1> CREATOR = new xbi1((byte) 3);
    public final jfi1 a;
    public final String b;
    public final long c;

    public lfi1(jfi1 jfi1Var, String str, long j) {
        this.a = jfi1Var;
        this.b = str;
        this.c = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lfi1)) {
            return false;
        }
        lfi1 lfi1Var = (lfi1) obj;
        return u890.j(this.a, lfi1Var.a) && u890.j(this.b, lfi1Var.b) && this.c == lfi1Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
    }
}
