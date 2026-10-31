package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dsf0 implements fsf0 {
    public static final Parcelable.Creator<dsf0> CREATOR = new ipf0((byte) 27);
    public final List a;
    public final boolean b;
    public final int c;

    public dsf0(int i, List list, boolean z) {
        this.a = list;
        this.b = z;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsf0)) {
            return false;
        }
        dsf0 dsf0Var = (dsf0) obj;
        return u890.j(this.a, dsf0Var.a) && this.b == dsf0Var.b && this.c == dsf0Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(pze0.s(this.c));
    }
}
