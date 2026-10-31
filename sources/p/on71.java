package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class on71 implements Parcelable {
    public static final Parcelable.Creator<on71> CREATOR = new ff71(28);
    public final pn71 a;
    public final rn71 b;

    public on71(pn71 pn71Var, rn71 rn71Var) {
        this.a = pn71Var;
        this.b = rn71Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof on71)) {
            return false;
        }
        on71 on71Var = (on71) obj;
        return u890.j(this.a, on71Var.a) && u890.j(this.b, on71Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
