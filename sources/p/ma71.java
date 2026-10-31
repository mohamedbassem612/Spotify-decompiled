package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ma71 extends u9 {
    public static final Parcelable.Creator<ma71> CREATOR = new v871((byte) 4);
    public final Uri a;
    public final String b;

    public ma71(Uri uri, String str) {
        this.a = uri;
        this.b = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma71)) {
            return false;
        }
        ma71 ma71Var = (ma71) obj;
        return u890.j(this.a, ma71Var.a) && u890.j(this.b, ma71Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
    }
}
