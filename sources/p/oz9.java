package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oz9 implements Parcelable {
    public static final Parcelable.Creator<oz9> CREATOR = new ux9(4);
    public final llw0 a;
    public final jlw0 b;

    public oz9(llw0 llw0Var, jlw0 jlw0Var) {
        this.a = llw0Var;
        this.b = jlw0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz9)) {
            return false;
        }
        oz9 oz9Var = (oz9) obj;
        return u890.j(this.a, oz9Var.a) && u890.j(this.b, oz9Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jlw0 jlw0Var = this.b;
        return iHashCode + (jlw0Var == null ? 0 : jlw0Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
