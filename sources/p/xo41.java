package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xo41 implements zo41 {
    public static final Parcelable.Creator<xo41> CREATOR = new uo41((byte) 2);
    public final String a;
    public final List b;

    public xo41(String str, List list) {
        this.a = str;
        this.b = list;
    }

    @Override // p.zo41
    public final String S() {
        return "Summary";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xo41)) {
            return false;
        }
        xo41 xo41Var = (xo41) obj;
        return u890.j(this.a, xo41Var.a) && this.b.equals(xo41Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            ((qpl) itM.next()).writeToParcel(parcel, i);
        }
    }
}
