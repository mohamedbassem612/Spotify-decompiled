package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rd11 implements Parcelable {
    public static final Parcelable.Creator<rd11> CREATOR = new e211((byte) 5);
    public final String a;
    public final String b;

    public rd11(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd11)) {
            return false;
        }
        rd11 rd11Var = (rd11) obj;
        return u890.j(this.a, rd11Var.a) && u890.j(this.b, rd11Var.b);
    }

    public final String getEntityUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
