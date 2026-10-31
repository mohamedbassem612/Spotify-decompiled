package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jrr0 implements Parcelable {
    public static final Parcelable.Creator<jrr0> CREATOR = new elr0((byte) 26);
    public final int a;
    public final int b;
    public final bm41 c;

    public jrr0(int i, int i2, bm41 bm41Var) {
        this.a = i;
        this.b = i2;
        this.c = bm41Var;
    }

    public final bm41 a() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jrr0)) {
            return false;
        }
        jrr0 jrr0Var = (jrr0) obj;
        return this.a == jrr0Var.a && this.b == jrr0Var.b && this.c == jrr0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, l1d.C(this.a) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.a;
        if (i2 == 1) {
            str = "DAILY";
        } else if (i2 == 2) {
            str = "WEEKLY";
        } else if (i2 == 3) {
            str = "NEVER";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "MONTHLY";
        }
        parcel.writeString(str);
        parcel.writeInt(this.b);
        this.c.writeToParcel(parcel, i);
    }
}
