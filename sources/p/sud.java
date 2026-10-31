package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.v1.proto.Paragraph;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sud implements Parcelable {
    public static final Parcelable.Creator<sud> CREATOR = new yyb((byte) 29);
    public final Paragraph a;
    public final Paragraph b;

    public sud(Paragraph paragraph, Paragraph paragraph2) {
        this.a = paragraph;
        this.b = paragraph2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sud)) {
            return false;
        }
        sud sudVar = (sud) obj;
        return u890.j(this.a, sudVar.a) && u890.j(this.b, sudVar.b);
    }

    public final int hashCode() {
        Paragraph paragraph = this.a;
        return this.b.hashCode() + ((paragraph == null ? 0 : paragraph.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        yor0 yor0Var = yor0.c;
        yor0Var.u(this.a, parcel);
        yor0Var.u(this.b, parcel);
    }
}
