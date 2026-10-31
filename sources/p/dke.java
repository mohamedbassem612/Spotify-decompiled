package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dke implements Parcelable {
    public static final Parcelable.Creator<dke> CREATOR = new zge((byte) 2);
    public final che a;
    public final int b;
    public final int c;

    public dke(che cheVar, int i, int i2) {
        this.a = cheVar;
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
        if (!(obj instanceof dke)) {
            return false;
        }
        dke dkeVar = (dke) obj;
        return u890.j(this.a, dkeVar.a) && this.b == dkeVar.b && this.c == dkeVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}
