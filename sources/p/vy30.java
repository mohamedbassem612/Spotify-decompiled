package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vy30 implements Parcelable {
    public static final Parcelable.Creator<vy30> CREATOR = new xt30((byte) 8);
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final long f;

    public vy30(int i, int i2, int i3, long j, String str, String str2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = str2;
        this.f = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy30)) {
            return false;
        }
        vy30 vy30Var = (vy30) obj;
        return u890.j(this.a, vy30Var.a) && this.b == vy30Var.b && this.c == vy30Var.c && this.d == vy30Var.d && u890.j(this.e, vy30Var.e) && this.f == vy30Var.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + cy30.d(ab80.k(this.d, kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31), 31), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        int i2 = this.d;
        if (i2 == 1) {
            str = "IMAGE";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "VIDEO";
        }
        parcel.writeString(str);
        parcel.writeString(this.e);
        parcel.writeLong(this.f);
    }
}
