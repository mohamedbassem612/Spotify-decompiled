package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jcl1 implements knt, Parcelable {
    public static final Parcelable.Creator<jcl1> CREATOR = new ylk1((byte) 17);
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final int e;

    public jcl1(int i, String str, String str2, String str3, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jcl1)) {
            return false;
        }
        jcl1 jcl1Var = (jcl1) obj;
        return u890.j(this.a, jcl1Var.a) && u890.j(this.b, jcl1Var.b) && u890.j(this.c, jcl1Var.c) && u890.j(this.d, jcl1Var.d) && this.e == jcl1Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + f4i1.b(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeStringList(this.d);
        parcel.writeInt(this.e);
    }
}
