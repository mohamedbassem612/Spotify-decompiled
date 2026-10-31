package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class om21 implements Parcelable {
    public static final Parcelable.Creator<om21> CREATOR = new g321((byte) 10);
    public final String a;
    public final int b;
    public final long c;

    public om21(long j, int i, String str) {
        this.a = str;
        this.b = i;
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
        if (!(obj instanceof om21)) {
            return false;
        }
        om21 om21Var = (om21) obj;
        return u890.j(this.a, om21Var.a) && this.b == om21Var.b && this.c == om21Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ab80.k(this.b, this.a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        int i2 = this.b;
        if (i2 == 1) {
            str = "UNSPECIFIED";
        } else if (i2 == 2) {
            str = "CORRECT";
        } else if (i2 == 3) {
            str = "WRONG";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "TIME_RAN_OUT";
        }
        parcel.writeString(str);
        parcel.writeLong(this.c);
    }
}
