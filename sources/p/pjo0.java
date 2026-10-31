package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class pjo0 implements Parcelable {
    public final String a;
    public final v80 b;
    public static final njo0 Companion = new njo0();
    public static final Parcelable.Creator<pjo0> CREATOR = new b4o0((byte) 14);
    public static final znb0[] c = {null, dm5.S(2, fsm0.a1)};

    public /* synthetic */ pjo0(int i, String str, v80 v80Var) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, ljo0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = v80Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjo0)) {
            return false;
        }
        pjo0 pjo0Var = (pjo0) obj;
        return u890.j(this.a, pjo0Var.a) && this.b == pjo0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.name());
    }

    public pjo0(String str, v80 v80Var) {
        this.a = str;
        this.b = v80Var;
    }
}
