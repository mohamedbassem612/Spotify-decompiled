package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ha00 implements nb10 {
    public static final Parcelable.Creator<ha00> CREATOR = new dez((byte) 27);
    public final long a;
    public final String b;
    public final String c;

    public ha00(long j, String str, String str2) {
        this.a = j;
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha00)) {
            return false;
        }
        ha00 ha00Var = (ha00) obj;
        return this.a == ha00Var.a && u890.j(this.b, ha00Var.b) && u890.j(this.c, ha00Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(Long.hashCode(this.a) * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
