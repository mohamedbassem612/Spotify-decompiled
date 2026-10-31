package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s8f1 implements n8f1 {
    public static final Parcelable.Creator<s8f1> CREATOR = new r8f1((byte) 0);
    public final ArrayList a;
    public final Integer b;
    public final Timestamp c;
    public final String d;

    public s8f1(ArrayList arrayList, Integer num, Timestamp timestamp, String str) {
        this.a = arrayList;
        this.b = num;
        this.c = timestamp;
        this.d = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8f1)) {
            return false;
        }
        s8f1 s8f1Var = (s8f1) obj;
        return u890.j(this.a, s8f1Var.a) && u890.j(this.b, s8f1Var.b) && u890.j(this.c, s8f1Var.c) && u890.j(this.d, s8f1Var.d);
    }

    public final String getId() {
        return this.d;
    }

    public final List getItems() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31);
    }

    public final Integer o() {
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itO = xvj1.o(this.a, parcel);
        while (itO.hasNext()) {
            ((q8f1) itO.next()).writeToParcel(parcel, i);
        }
        Integer num = this.b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        Timestamp timestamp = this.c;
        parcel.writeLong(timestamp.q());
        parcel.writeInt(timestamp.p());
        parcel.writeString(this.d);
    }

    public /* synthetic */ s8f1(ArrayList arrayList, Integer num, Timestamp timestamp, int i) {
        this(arrayList, (i & 2) != 0 ? null : num, timestamp, "TopArtists");
    }
}
