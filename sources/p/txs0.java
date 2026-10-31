package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class txs0 extends xl81 implements hv51 {
    public static final Parcelable.Creator<txs0> CREATOR = new bis0((byte) 17);
    public final String a;
    public final String b;
    public final boolean c;

    public txs0(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public static txs0 a(txs0 txs0Var, boolean z) {
        String str = txs0Var.a;
        String str2 = txs0Var.b;
        txs0Var.getClass();
        return new txs0(str, str2, z);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txs0)) {
            return false;
        }
        txs0 txs0Var = (txs0) obj;
        return u890.j(this.a, txs0Var.a) && u890.j(this.b, txs0Var.b) && this.c == txs0Var.c;
    }

    public final boolean f() {
        return this.c;
    }

    public final String getUri() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
