package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qha1 implements Parcelable {
    public static final Parcelable.Creator<qha1> CREATOR = new yx81((byte) 22);
    public final int a;
    public final int b;

    public qha1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qha1)) {
            return false;
        }
        qha1 qha1Var = (qha1) obj;
        return this.a == qha1Var.a && this.b == qha1Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (l1d.C(this.a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2;
        int i2 = this.a;
        if (i2 == 1) {
            str = "ASC";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "DESC";
        }
        parcel.writeString(str);
        int i3 = this.b;
        if (i3 == 1) {
            str2 = "ALPHABETIC";
        } else if (i3 == 2) {
            str2 = "DATE";
        } else {
            if (i3 != 3) {
                throw null;
            }
            str2 = "NONE";
        }
        parcel.writeString(str2);
    }
}
