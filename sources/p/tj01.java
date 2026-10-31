package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.v1.proto.Paragraph;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tj01 implements wj01 {
    public static final Parcelable.Creator<tj01> CREATOR = new sj01((byte) 0);
    public final String a;
    public final Paragraph b;
    public final Paragraph c;
    public final Paragraph d;

    public tj01(String str, Paragraph paragraph, Paragraph paragraph2, Paragraph paragraph3) {
        this.a = str;
        this.b = paragraph;
        this.c = paragraph2;
        this.d = paragraph3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tj01)) {
            return false;
        }
        tj01 tj01Var = (tj01) obj;
        return u890.j(this.a, tj01Var.a) && u890.j(this.b, tj01Var.b) && u890.j(this.c, tj01Var.c) && u890.j(this.d, tj01Var.d);
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        yor0 yor0Var = yor0.c;
        yor0Var.u(this.b, parcel);
        yor0Var.u(this.c, parcel);
        yor0Var.u(this.d, parcel);
    }
}
