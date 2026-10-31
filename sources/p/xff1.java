package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xff1 implements wff1 {
    public static final Parcelable.Creator<xff1> CREATOR = new r8f1((byte) 2);
    public final List a;
    public final Integer b;
    public final String c;

    public xff1(Integer num, String str, List list) {
        this.a = list;
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
        if (!(obj instanceof xff1)) {
            return false;
        }
        xff1 xff1Var = (xff1) obj;
        return u890.j(this.a, xff1Var.a) && u890.j(this.b, xff1Var.b) && u890.j(this.c, xff1Var.c);
    }

    public final String getId() {
        return this.c;
    }

    @Override // p.wff1
    public final List getItems() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return this.c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
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
        parcel.writeString(this.c);
    }
}
