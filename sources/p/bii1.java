package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bii1 implements Parcelable {
    public static final Parcelable.Creator<bii1> CREATOR = new xbi1((byte) 9);
    public final int a;
    public final pks0 b;
    public final String c;

    public bii1(int i, pks0 pks0Var, String str) {
        this.a = i;
        this.b = pks0Var;
        this.c = str;
    }

    public final pks0 a() {
        return this.b;
    }

    public final int b() {
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
        if (!(obj instanceof bii1)) {
            return false;
        }
        bii1 bii1Var = (bii1) obj;
        return this.a == bii1Var.a && u890.j(this.b, bii1Var.b) && u890.j(this.c, bii1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
    }
}
