package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lli0 implements Parcelable {
    public static final Parcelable.Creator<lli0> CREATOR = new cyh0((byte) 23);
    public final String a;
    public final int b;

    public lli0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lli0)) {
            return false;
        }
        lli0 lli0Var = (lli0) obj;
        return u890.j(this.a, lli0Var.a) && this.b == lli0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        int i2 = this.b;
        if (i2 == 1) {
            str = "NONE";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "QUICKSILVER";
        }
        parcel.writeString(str);
    }
}
