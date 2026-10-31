package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o8f1 implements n8f1 {
    public static final Parcelable.Creator<o8f1> CREATOR = new lse1((byte) 28);
    public final ArrayList a;
    public final Integer b;
    public final String c;

    public o8f1(Integer num, String str, ArrayList arrayList) {
        this.a = arrayList;
        this.b = num;
        this.c = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8f1)) {
            return false;
        }
        o8f1 o8f1Var = (o8f1) obj;
        return this.a.equals(o8f1Var.a) && u890.j(this.b, o8f1Var.b) && u890.j(this.c, o8f1Var.c);
    }

    public final String getId() {
        return this.c;
    }

    public final List getItems() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return this.c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
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
        parcel.writeString(this.c);
    }
}
