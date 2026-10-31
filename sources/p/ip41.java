package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ip41 implements kp41 {
    public static final Parcelable.Creator<ip41> CREATOR = new uo41((byte) 4);
    public final int a;
    public final List b;

    public /* synthetic */ ip41(int i, int i2) {
        this((i2 & 1) != 0 ? 1 : i, (List) z6x.a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ip41)) {
            return false;
        }
        ip41 ip41Var = (ip41) obj;
        return this.a == ip41Var.a && u890.j(this.b, ip41Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(x0d.v(this.a));
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
    }

    public ip41(int i, List list) {
        this.a = i;
        this.b = list;
    }
}
