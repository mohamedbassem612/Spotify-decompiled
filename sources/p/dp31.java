package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dp31 implements Parcelable {
    public static final Parcelable.Creator<dp31> CREATOR = new s231((byte) 23);
    public final th61 a;
    public final gp5 b;

    public dp31(th61 th61Var, gp5 gp5Var) {
        this.a = th61Var;
        this.b = gp5Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp31)) {
            return false;
        }
        dp31 dp31Var = (dp31) obj;
        return u890.j(this.a, dp31Var.a) && u890.j(this.b, dp31Var.b);
    }

    public final int hashCode() {
        th61 th61Var = this.a;
        return this.b.a.hashCode() + ((th61Var == null ? 0 : th61Var.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        this.b.writeToParcel(parcel, i);
    }
}
