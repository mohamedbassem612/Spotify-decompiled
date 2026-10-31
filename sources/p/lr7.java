package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lr7 implements nr7 {
    public static final Parcelable.Creator<lr7> CREATOR = new f67((byte) 24);
    public final String a;
    public final s171 b;

    public lr7(String str, s171 s171Var) {
        this.a = str;
        this.b = s171Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lr7)) {
            return false;
        }
        lr7 lr7Var = (lr7) obj;
        return u890.j(this.a, lr7Var.a) && u890.j(this.b, lr7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
