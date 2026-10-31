package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class so71 implements Parcelable {
    public static final Parcelable.Creator<so71> CREATOR = new ro71((byte) 0);
    public final int a;
    public final int b;
    public final int c;

    static {
        bmq0.i(-11316397);
    }

    public so71(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so71)) {
            return false;
        }
        so71 so71Var = (so71) obj;
        return this.a == so71Var.a && this.b == so71Var.b && this.c == so71Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}
