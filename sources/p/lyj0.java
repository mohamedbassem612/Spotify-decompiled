package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lyj0 implements Parcelable {
    public static final Parcelable.Creator<lyj0> CREATOR = new ohj0(11);
    public final String a;
    public final long b;
    public final boolean c;
    public final boolean d;

    public lyj0(long j, String str, boolean z, boolean z2) {
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lyj0)) {
            return false;
        }
        lyj0 lyj0Var = (lyj0) obj;
        return u890.j(this.a, lyj0Var.a) && this.b == lyj0Var.b && this.c == lyj0Var.c && this.d == lyj0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(cy30.f(this.a.hashCode() * 31, this.b, 31), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
    }

    public /* synthetic */ lyj0() {
        this(0L, "", false, false);
    }
}
