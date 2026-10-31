package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.v1.proto.Paragraph;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vj01 implements wj01 {
    public static final Parcelable.Creator<vj01> CREATOR = new sj01((byte) 2);
    public final String a;
    public final Paragraph b;
    public final Paragraph c;

    public vj01(String str, Paragraph paragraph, Paragraph paragraph2) {
        this.a = str;
        this.b = paragraph;
        this.c = paragraph2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj01)) {
            return false;
        }
        vj01 vj01Var = (vj01) obj;
        return u890.j(this.a, vj01Var.a) && u890.j(this.b, vj01Var.b) && u890.j(this.c, vj01Var.c);
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Paragraph paragraph = this.c;
        return iHashCode + (paragraph == null ? 0 : paragraph.hashCode());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        yor0 yor0Var = yor0.c;
        yor0Var.u(this.b, parcel);
        yor0Var.u(this.c, parcel);
    }
}
