package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yk50 implements Parcelable {
    public static final Parcelable.Creator<yk50> CREATOR = new xk50((byte) 0);
    public final String a;
    public final String b;
    public final hl50 c;

    public yk50(String str, String str2, hl50 hl50Var) {
        this.a = str;
        this.b = str2;
        this.c = hl50Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk50)) {
            return false;
        }
        yk50 yk50Var = (yk50) obj;
        return u890.j(this.a, yk50Var.a) && u890.j(this.b, yk50Var.b) && u890.j(this.c, yk50Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
