package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i8e implements Parcelable {
    public static final Parcelable.Creator<i8e> CREATOR = new xud((byte) 15);
    public final bi90 a;
    public final String b;

    public i8e(bi90 bi90Var, String str) {
        this.a = bi90Var;
        this.b = str;
    }

    public final bi90 a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8e)) {
            return false;
        }
        i8e i8eVar = (i8e) obj;
        return u890.j(this.a, i8eVar.a) && u890.j(this.b, i8eVar.b);
    }

    public final int hashCode() {
        bi90 bi90Var = this.a;
        int iHashCode = (bi90Var == null ? 0 : bi90Var.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
    }
}
