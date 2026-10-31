package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rie0 implements Parcelable {
    public static final Parcelable.Creator<rie0> CREATOR = new lbe0((byte) 11);
    public final rne0 a;
    public final String b;
    public final int c;

    public rie0(rne0 rne0Var, String str, int i) {
        this.a = rne0Var;
        this.b = str;
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
        if (!(obj instanceof rie0)) {
            return false;
        }
        rie0 rie0Var = (rie0) obj;
        return u890.j(this.a, rie0Var.a) && u890.j(this.b, rie0Var.b) && this.c == rie0Var.c;
    }

    public final int hashCode() {
        rne0 rne0Var = this.a;
        return l1d.C(this.c) + cy30.d((rne0Var == null ? 0 : rne0Var.hashCode()) * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        rne0 rne0Var = this.a;
        if (rne0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rne0Var.writeToParcel(parcel, i);
        }
        parcel.writeString(this.b);
        int i2 = this.c;
        if (i2 == 1) {
            str = "NOT_REQUESTED";
        } else if (i2 == 2) {
            str = "REQUESTING";
        } else if (i2 == 3) {
            str = "COMPLETED";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "FAILED";
        }
        parcel.writeString(str);
    }
}
