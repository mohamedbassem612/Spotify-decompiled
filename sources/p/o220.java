package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class o220 implements w220 {
    public static final Parcelable.Creator<o220> CREATOR = new no10((byte) 24);
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public o220(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o220)) {
            return false;
        }
        o220 o220Var = (o220) obj;
        return u890.j(this.a, o220Var.a) && u890.j(this.b, o220Var.b) && u890.j(this.c, o220Var.c) && this.d == o220Var.d;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }

    public /* synthetic */ o220(String str, String str2, String str3) {
        this(str, str2, str3, false);
    }
}
