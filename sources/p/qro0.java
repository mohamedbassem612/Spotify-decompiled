package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qro0 implements Parcelable {
    public static final Parcelable.Creator<qro0> CREATOR = new b4o0((byte) 20);
    public final String a;
    public final ipo0 b;

    public qro0(String str, ipo0 ipo0Var) {
        this.a = str;
        this.b = ipo0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qro0)) {
            return false;
        }
        qro0 qro0Var = (qro0) obj;
        return u890.j(this.a, qro0Var.a) && this.b == qro0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
