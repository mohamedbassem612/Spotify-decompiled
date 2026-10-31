package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o940 implements Parcelable {
    public static final Parcelable.Creator<o940> CREATOR = new xt30(14);
    public final n940 a;
    public final k940 b;
    public final e940 c;

    public o940(n940 n940Var, k940 k940Var, e940 e940Var) {
        this.a = n940Var;
        this.b = k940Var;
        this.c = e940Var;
    }

    public final boolean a() {
        n940 n940Var = this.a;
        return (n940Var instanceof l940) && ((l940) n940Var).a.contains(h940.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o940)) {
            return false;
        }
        o940 o940Var = (o940) obj;
        return u890.j(this.a, o940Var.a) && this.b == o940Var.b && u890.j(this.c, o940Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        e940 e940Var = this.c;
        return iHashCode + (e940Var == null ? 0 : e940Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        this.b.writeToParcel(parcel, i);
        e940 e940Var = this.c;
        if (e940Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            e940Var.writeToParcel(parcel, i);
        }
    }
}
