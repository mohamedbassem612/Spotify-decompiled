package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fi1 implements Parcelable {
    public static final Parcelable.Creator<fi1> CREATOR = new d41((byte) 17);
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final sg90 e;

    public fi1(String str, String str2, long j, long j2, sg90 sg90Var) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = sg90Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi1)) {
            return false;
        }
        fi1 fi1Var = (fi1) obj;
        return u890.j(this.a, fi1Var.a) && u890.j(this.b, fi1Var.b) && this.c == fi1Var.c && this.d == fi1Var.d && u890.j(this.e, fi1Var.e);
    }

    public final int hashCode() {
        int iF = cy30.f(cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31), this.d, 31);
        sg90 sg90Var = this.e;
        return iF + (sg90Var == null ? 0 : sg90Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeParcelable(this.e, i);
    }
}
