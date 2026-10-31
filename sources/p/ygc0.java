package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ygc0 implements Parcelable {
    public static final Parcelable.Creator<ygc0> CREATOR = new v5c0((byte) 16);
    public final String a;
    public final String b;
    public final boolean c;

    public ygc0(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = str == null && str2 == null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygc0)) {
            return false;
        }
        ygc0 ygc0Var = (ygc0) obj;
        return u890.j(this.a, ygc0Var.a) && u890.j(this.b, ygc0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
