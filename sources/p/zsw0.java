package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zsw0 implements atw0 {
    public static final Parcelable.Creator<zsw0> CREATOR = new w7w0((byte) 28);
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;

    public zsw0(int i, int i2, String str, String str2, String str3) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsw0)) {
            return false;
        }
        zsw0 zsw0Var = (zsw0) obj;
        return this.a == zsw0Var.a && this.b == zsw0Var.b && u890.j(this.c, zsw0Var.c) && u890.j(this.d, zsw0Var.d) && u890.j(this.e, zsw0Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(ab80.k(this.b, l1d.C(this.a) * 31, 31), 31, this.c), 31, this.d);
        String str = this.e;
        return iD + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2;
        int i2 = this.a;
        if (i2 == 1) {
            str = "GROUP_TOP";
        } else if (i2 == 2) {
            str = "GROUP_MIDDLE";
        } else if (i2 == 3) {
            str = "GROUP_BOTTOM";
        } else if (i2 == 4) {
            str = "GROUP_SINGLE_ITEM";
        } else {
            if (i2 != 5) {
                throw null;
            }
            str = "UNGROUPED";
        }
        parcel.writeString(str);
        int i3 = this.b;
        if (i3 == 1) {
            str2 = "DEFAULT";
        } else if (i3 == 2) {
            str2 = "ADDED";
        } else if (i3 == 3) {
            str2 = "REMOVED";
        } else if (i3 == 4) {
            str2 = "STRIKETHROUGH";
        } else {
            if (i3 != 5) {
                throw null;
            }
            str2 = "BOLD";
        }
        parcel.writeString(str2);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
