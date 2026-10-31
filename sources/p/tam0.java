package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tam0 implements Parcelable {
    public static final Parcelable.Creator<tam0> CREATOR = new w9k0((byte) 6);
    public final String a;
    public final qpl b;

    public tam0(String str, qpl qplVar) {
        this.a = str;
        this.b = qplVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tam0)) {
            return false;
        }
        tam0 tam0Var = (tam0) obj;
        return u890.j(this.a, tam0Var.a) && u890.j(this.b, tam0Var.b);
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
