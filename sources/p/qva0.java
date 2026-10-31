package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qva0 implements Parcelable {
    public static final Parcelable.Creator<qva0> CREATOR = new jca0((byte) 3);
    public final String a;
    public final int b;
    public final xgk1 c;

    public qva0(String str, int i, xgk1 xgk1Var) {
        this.a = str;
        this.b = i;
        this.c = xgk1Var;
    }

    public static qva0 a(qva0 qva0Var, int i, int i2) {
        String str = qva0Var.a;
        if ((i2 & 2) != 0) {
            i = qva0Var.b;
        }
        return new qva0(str, i, (i2 & 4) != 0 ? qva0Var.c : xgk1.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qva0)) {
            return false;
        }
        qva0 qva0Var = (qva0) obj;
        return u890.j(this.a, qva0Var.a) && this.b == qva0Var.b && this.c == qva0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ab80.k(this.b, this.a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        int i2 = this.b;
        if (i2 == 1) {
            str = "NOT_CHECKED";
        } else if (i2 == 2) {
            str = "DATE_INVALID";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "VALID";
        }
        parcel.writeString(str);
        parcel.writeString(this.c.name());
    }
}
