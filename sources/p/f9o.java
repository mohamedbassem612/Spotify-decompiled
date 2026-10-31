package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f9o implements Parcelable {
    public static final Parcelable.Creator<f9o> CREATOR = new upn((byte) 29);
    public final int a;
    public final lax b;

    public f9o(int i, lax laxVar) {
        this.a = i;
        this.b = laxVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9o)) {
            return false;
        }
        f9o f9oVar = (f9o) obj;
        return this.a == f9oVar.a && u890.j(this.b, f9oVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
