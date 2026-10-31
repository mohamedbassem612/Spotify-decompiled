package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.v1.proto.Paragraph;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x5c1 implements Parcelable {
    public static final Parcelable.Creator<x5c1> CREATOR = new yub1(25);
    public final Paragraph a;
    public final String b;
    public final int c;

    public x5c1(Paragraph paragraph, String str, int i) {
        this.a = paragraph;
        this.b = str;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5c1)) {
            return false;
        }
        x5c1 x5c1Var = (x5c1) obj;
        return u890.j(this.a, x5c1Var.a) && u890.j(this.b, x5c1Var.b) && this.c == x5c1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        yor0.c.u(this.a, parcel);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
    }
}
