package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.v1.proto.Paragraph;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zud implements Parcelable {
    public static final Parcelable.Creator<zud> CREATOR = new xud((byte) 0);
    public final Paragraph a;
    public final Paragraph b;
    public final ArrayList c;

    public zud(Paragraph paragraph, Paragraph paragraph2, ArrayList arrayList) {
        this.a = paragraph;
        this.b = paragraph2;
        this.c = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zud)) {
            return false;
        }
        zud zudVar = (zud) obj;
        return u890.j(this.a, zudVar.a) && u890.j(this.b, zudVar.b) && this.c.equals(zudVar.c);
    }

    public final int hashCode() {
        Paragraph paragraph = this.a;
        int iHashCode = (paragraph == null ? 0 : paragraph.hashCode()) * 31;
        Paragraph paragraph2 = this.b;
        return this.c.hashCode() + ((iHashCode + (paragraph2 != null ? paragraph2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        yor0 yor0Var = yor0.c;
        yor0Var.u(this.a, parcel);
        yor0Var.u(this.b, parcel);
        Iterator itO = xvj1.o(this.c, parcel);
        while (itO.hasNext()) {
            ((sud) itO.next()).writeToParcel(parcel, i);
        }
    }
}
