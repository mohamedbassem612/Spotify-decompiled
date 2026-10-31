package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lu61 implements Parcelable {
    public static final Parcelable.Creator<lu61> CREATOR = new hs61((byte) 7);
    public final p6r0 a;
    public final gu61 b;
    public final boolean c;

    public lu61(p6r0 p6r0Var, gu61 gu61Var, boolean z) {
        this.a = p6r0Var;
        this.b = gu61Var;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu61)) {
            return false;
        }
        lu61 lu61Var = (lu61) obj;
        return u890.j(this.a, lu61Var.a) && u890.j(this.b, lu61Var.b) && this.c == lu61Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
