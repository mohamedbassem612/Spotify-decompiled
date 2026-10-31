package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class agf1 implements wff1 {
    public static final Parcelable.Creator<agf1> CREATOR = new r8f1((byte) 4);
    public final List a;
    public final Integer b;
    public final Timestamp c;
    public final String d;

    public /* synthetic */ agf1(ArrayList arrayList, Integer num, Timestamp timestamp, int i) {
        this((i & 1) != 0 ? z6x.a : arrayList, (i & 2) != 0 ? null : num, timestamp, "TopTracks");
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agf1)) {
            return false;
        }
        agf1 agf1Var = (agf1) obj;
        return u890.j(this.a, agf1Var.a) && u890.j(this.b, agf1Var.b) && u890.j(this.c, agf1Var.c) && u890.j(this.d, agf1Var.d);
    }

    public final String getId() {
        return this.d;
    }

    @Override // p.wff1
    public final List getItems() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31);
    }

    @Override // p.wff1
    public final Integer o() {
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            ((zff1) itM.next()).writeToParcel(parcel, i);
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

    public agf1(List list, Integer num, Timestamp timestamp, String str) {
        this.a = list;
        this.b = num;
        this.c = timestamp;
        this.d = str;
    }
}
