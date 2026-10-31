package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u3z0 implements x3z0 {
    public static final Parcelable.Creator<u3z0> CREATOR = new j1z0(2);
    public final int a;
    public final int b;
    public final String c;
    public final String d;

    public u3z0(int i, String str, int i2, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3z0)) {
            return false;
        }
        u3z0 u3z0Var = (u3z0) obj;
        return this.a == u3z0Var.a && this.b == u3z0Var.b && u890.j(this.c, u3z0Var.c) && u890.j(this.d, u3z0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
