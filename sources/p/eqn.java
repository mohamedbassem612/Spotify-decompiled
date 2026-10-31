package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eqn implements Parcelable {
    public static final Parcelable.Creator<eqn> CREATOR = new upn((byte) 5);
    public final String a;
    public final tv80 b;

    public eqn(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqn)) {
            return false;
        }
        eqn eqnVar = (eqn) obj;
        return u890.j(this.a, eqnVar.a) && u890.j(this.b, eqnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
