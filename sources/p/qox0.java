package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qox0 implements knt, Parcelable {
    public static final Parcelable.Creator<qox0> CREATOR = new wvw0((byte) 25);
    public final String a;
    public final String b;
    public final int c;

    public qox0(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qox0)) {
            return false;
        }
        qox0 qox0Var = (qox0) obj;
        return u890.j(this.a, qox0Var.a) && u890.j(this.b, qox0Var.b) && this.c == qox0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
    }
}
