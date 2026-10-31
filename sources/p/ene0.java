package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ene0 implements Parcelable {
    public static final Parcelable.Creator<ene0> CREATOR = new lbe0((byte) 14);
    public final String a;
    public final int b;

    public ene0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final int a() {
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
        if (!(obj instanceof ene0)) {
            return false;
        }
        ene0 ene0Var = (ene0) obj;
        return u890.j(this.a, ene0Var.a) && this.b == ene0Var.b;
    }

    public final String getUri() {
        return this.a;
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
            str = "DEFAULT";
        } else if (i2 == 2) {
            str = "SET_PREFERRED";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "SET_BROWSE";
        }
        parcel.writeString(str);
    }
}
