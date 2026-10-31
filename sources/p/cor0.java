package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cor0 extends nor0 {
    public static final Parcelable.Creator<cor0> CREATOR = new elr0((byte) 5);
    public final String a;
    public final String b;

    public cor0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cor0)) {
            return false;
        }
        cor0 cor0Var = (cor0) obj;
        return u890.j(this.a, cor0Var.a) && u890.j(this.b, cor0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
