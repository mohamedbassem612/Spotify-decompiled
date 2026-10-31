package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class eo81 implements Parcelable {
    public static final Parcelable.Creator<eo81> CREATOR = new agm0((byte) 15);
    public final do81 a;
    public final bk8 b;

    public eo81(do81 do81Var, bk8 bk8Var) {
        this.a = do81Var;
        this.b = bk8Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eo81)) {
            return false;
        }
        eo81 eo81Var = (eo81) obj;
        return u890.j(this.a, eo81Var.a) && this.b == eo81Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b.name());
    }
}
