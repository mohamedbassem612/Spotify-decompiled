package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class po41 implements zo41 {
    public static final Parcelable.Creator<po41> CREATOR = new xw31((byte) 25);
    public static final po41 d = new po41("", z6x.a, "");
    public final List a;
    public final String b;
    public final String c;

    public po41(String str, List list, String str2) {
        this.a = list;
        this.b = str;
        this.c = str2;
    }

    @Override // p.zo41
    public final String S() {
        return "Carousel";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof po41)) {
            return false;
        }
        po41 po41Var = (po41) obj;
        return this.a.equals(po41Var.a) && u890.j(this.b, po41Var.b) && u890.j(this.c, po41Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            ((oo41) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
