package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ucs0 implements Parcelable {
    public static final Parcelable.Creator<ucs0> CREATOR = new ybs0(6);
    public final String a;

    public /* synthetic */ ucs0(String str) {
        this.a = str;
    }

    public static String a(String str) {
        return f4i1.f("PaymentSessionId(value=", str, ")");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ucs0) {
            return this.a.equals(((ucs0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
