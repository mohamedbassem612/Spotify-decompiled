package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class v220 implements w220 {
    public static final Parcelable.Creator<v220> CREATOR = new u220((byte) 0);
    public final String a;
    public final int b;

    public v220(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v220)) {
            return false;
        }
        v220 v220Var = (v220) obj;
        return u890.j(this.a, v220Var.a) && this.b == v220Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        int i2 = this.b;
        if (i2 == 1) {
            str = "BODY_SMALL";
        } else if (i2 == 2) {
            str = "BODY_MEDIUM";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "MARGINAL";
        }
        parcel.writeString(str);
    }
}
