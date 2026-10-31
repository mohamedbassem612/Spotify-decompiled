package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wn8 implements Parcelable {
    public static final Parcelable.Creator<wn8> CREATOR = new bu7((byte) 27);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final p860 d;

    public /* synthetic */ wn8(boolean z, p860 p860Var, int i) {
        this(true, true, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : p860Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wn8)) {
            return false;
        }
        wn8 wn8Var = (wn8) obj;
        return this.a == wn8Var.a && this.b == wn8Var.b && this.c == wn8Var.c && u890.j(this.d, wn8Var.d);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        p860 p860Var = this.d;
        return iG + (p860Var == null ? 0 : p860Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeParcelable(this.d, i);
    }

    public wn8(boolean z, boolean z2, boolean z3, p860 p860Var) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = p860Var;
    }
}
