package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ux11 implements xx11 {
    public static final Parcelable.Creator<ux11> CREATOR = new e211((byte) 22);
    public final String a;
    public final String b;

    public ux11(String str, String str2) {
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
        if (!(obj instanceof ux11)) {
            return false;
        }
        ux11 ux11Var = (ux11) obj;
        return u890.j(this.a, ux11Var.a) && u890.j(this.b, ux11Var.b);
    }

    public final String getId() {
        return this.a;
    }

    public final String getUri() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
