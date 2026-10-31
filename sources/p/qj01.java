package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qj01 implements wj01 {
    public static final Parcelable.Creator<qj01> CREATOR = new erz0((byte) 28);
    public final String a;
    public final String b;
    public final int c;

    public qj01(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qj01)) {
            return false;
        }
        qj01 qj01Var = (qj01) obj;
        return u890.j(this.a, qj01Var.a) && u890.j(this.b, qj01Var.b) && this.c == qj01Var.c;
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
    }
}
