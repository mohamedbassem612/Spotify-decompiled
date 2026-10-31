package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yde1 implements of51 {
    public static final Parcelable.Creator<yde1> CREATOR = new pwd1((byte) 11);
    public final int a;
    public final String b;
    public final List c;

    public yde1(String str, List list, int i) {
        this.a = i;
        this.b = str;
        this.c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yde1)) {
            return false;
        }
        yde1 yde1Var = (yde1) obj;
        return this.a == yde1Var.a && u890.j(this.b, yde1Var.b) && this.c.equals(yde1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    @Override // p.of51
    public final int p() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        Iterator itM = kk0.m(parcel, this.c);
        while (itM.hasNext()) {
            ((mbe1) itM.next()).writeToParcel(parcel, i);
        }
    }
}
