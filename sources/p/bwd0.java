package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bwd0 implements Parcelable {
    public static final Parcelable.Creator<bwd0> CREATOR = new qod0((byte) 9);
    public final String a;
    public final boolean b;
    public final String c;

    public bwd0(String str, String str2, boolean z) {
        this.a = str;
        this.b = z;
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
        if (!(obj instanceof bwd0)) {
            return false;
        }
        bwd0 bwd0Var = (bwd0) obj;
        return u890.j(this.a, bwd0Var.a) && this.b == bwd0Var.b && u890.j(this.c, bwd0Var.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iG + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c);
    }
}
