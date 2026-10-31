package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ho6 implements nb10 {
    public static final Parcelable.Creator<ho6> CREATOR = new fp5((byte) 12);
    public final boolean a;
    public final int b;
    public final int c;

    public ho6(boolean z, int i, int i2) {
        this.a = z;
        this.b = i;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho6)) {
            return false;
        }
        ho6 ho6Var = (ho6) obj;
        return this.a == ho6Var.a && this.b == ho6Var.b && this.c == ho6Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, Boolean.hashCode(this.a) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}
