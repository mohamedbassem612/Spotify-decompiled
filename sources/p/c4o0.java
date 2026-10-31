package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c4o0 implements Parcelable {
    public static final Parcelable.Creator<c4o0> CREATOR = new b4o0((byte) 0);
    public final hux a;
    public final String b;
    public final String c;

    public c4o0(String str, String str2, hux huxVar) {
        this.a = huxVar;
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4o0)) {
            return false;
        }
        c4o0 c4o0Var = (c4o0) obj;
        return u890.j(this.a, c4o0Var.a) && u890.j(this.b, c4o0Var.b) && u890.j(this.c, c4o0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
