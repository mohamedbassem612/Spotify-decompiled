package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s171 implements Parcelable {
    public static final Parcelable.Creator<s171> CREATOR = new hs61(19);
    public final String a;
    public final hux b;

    public s171(String str, hux huxVar) {
        this.a = str;
        this.b = huxVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s171)) {
            return false;
        }
        s171 s171Var = (s171) obj;
        return u890.j(this.a, s171Var.a) && u890.j(this.b, s171Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        hux huxVar = this.b;
        return iHashCode + (huxVar == null ? 0 : huxVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
