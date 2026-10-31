package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b5c0 extends d6c0 {
    public static final Parcelable.Creator<b5c0> CREATOR = new cwb0((byte) 10);
    public final List b;
    public final boolean c;

    public /* synthetic */ b5c0(List list, int i) {
        this((i & 1) != 0 ? z6x.a : list, (i & 2) == 0);
    }

    @Override // p.d6c0
    public final List a() {
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
        if (!(obj instanceof b5c0)) {
            return false;
        }
        b5c0 b5c0Var = (b5c0) obj;
        return u890.j(this.b, b5c0Var.b) && this.c == b5c0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeInt(this.c ? 1 : 0);
    }

    public b5c0(List list, boolean z) {
        super(true);
        this.b = list;
        this.c = z;
    }
}
