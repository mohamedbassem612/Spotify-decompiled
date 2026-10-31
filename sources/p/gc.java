package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gc extends hc implements Parcelable {
    public static final Parcelable.Creator<gc> CREATOR = new scc((byte) 15);
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public gc(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public static gc b(gc gcVar, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = gcVar.a;
        }
        if ((i & 2) != 0) {
            z2 = gcVar.b;
        }
        return new gc(z, z2, gcVar.c);
    }

    public final boolean a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc)) {
            return false;
        }
        gc gcVar = (gc) obj;
        return this.a == gcVar.a && this.b == gcVar.b && this.c == gcVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
