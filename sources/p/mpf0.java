package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mpf0 implements Parcelable {
    public static final Parcelable.Creator<mpf0> CREATOR = new ipf0((byte) 2);
    public final String a;
    public final lpf0 b;

    public mpf0(String str, lpf0 lpf0Var) {
        this.a = str;
        this.b = lpf0Var;
    }

    public final bff0 a() {
        lpf0 lpf0Var = this.b;
        if (lpf0Var instanceof jpf0) {
            return ((jpf0) lpf0Var).b;
        }
        if (lpf0Var instanceof kpf0) {
            return ((kpf0) lpf0Var).a;
        }
        if (lpf0Var instanceof hpf0) {
            return ((hpf0) lpf0Var).a;
        }
        eg.o();
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mpf0)) {
            return false;
        }
        mpf0 mpf0Var = (mpf0) obj;
        return u890.j(this.a, mpf0Var.a) && u890.j(this.b, mpf0Var.b);
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
