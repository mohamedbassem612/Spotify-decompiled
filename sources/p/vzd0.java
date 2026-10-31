package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vzd0 implements Parcelable {
    public static final Parcelable.Creator<vzd0> CREATOR = new qod0((byte) 10);
    public final String a;
    public final int b;

    public vzd0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzd0)) {
            return false;
        }
        vzd0 vzd0Var = (vzd0) obj;
        return u890.j(this.a, vzd0Var.a) && this.b == vzd0Var.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = this.b;
        return iHashCode + (i == 0 ? 0 : l1d.C(i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        int i2 = this.b;
        if (i2 == 0) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        if (i2 != 1) {
            throw null;
        }
        parcel.writeString("SHARE");
    }
}
