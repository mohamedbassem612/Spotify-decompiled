package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f211 implements dtb1 {
    public static final Parcelable.Creator<f211> CREATOR = new e211((byte) 0);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public f211(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f211)) {
            return false;
        }
        f211 f211Var = (f211) obj;
        return u890.j(this.a, f211Var.a) && u890.j(this.b, f211Var.b) && u890.j(this.c, f211Var.c) && u890.j(this.d, f211Var.d) && u890.j(this.e, f211Var.e);
    }

    public final String getId() {
        return "RecommendedPlaylist";
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
