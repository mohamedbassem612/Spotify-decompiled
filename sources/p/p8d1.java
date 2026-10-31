package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p8d1 extends x8d1 {
    public static final Parcelable.Creator<p8d1> CREATOR = new pxc1((byte) 18);
    public final List a;
    public final String b;

    public p8d1(List list, String str) {
        this.a = list;
        this.b = str;
    }

    @Override // p.x8d1
    public final String b() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8d1)) {
            return false;
        }
        p8d1 p8d1Var = (p8d1) obj;
        return this.a.equals(p8d1Var.a) && u890.j(this.b, p8d1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            parcel.writeInt(((Number) itM.next()).intValue());
        }
        parcel.writeString(this.b);
    }
}
