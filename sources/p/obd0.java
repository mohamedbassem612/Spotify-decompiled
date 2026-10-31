package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class obd0 implements tbd0 {
    public static final Parcelable.Creator<obd0> CREATOR = new lad0((byte) 7);
    public final String a;
    public final nbd0 b;
    public final int c;

    public obd0(String str, nbd0 nbd0Var, int i) {
        this.a = str;
        this.b = nbd0Var;
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
        if (!(obj instanceof obd0)) {
            return false;
        }
        obd0 obd0Var = (obd0) obj;
        return u890.j(this.a, obd0Var.a) && u890.j(this.b, obd0Var.b) && this.c == obd0Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        this.b.writeToParcel(parcel, i);
        int i2 = this.c;
        if (i2 == 1) {
            str = "Friend";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "Following";
        }
        parcel.writeString(str);
    }
}
