package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c0f0 implements Parcelable, jik1 {
    public static final Parcelable.Creator<c0f0> CREATOR = new rwe0((byte) 9);
    public final String a;
    public final zzy b;

    public c0f0(String str, zzy zzyVar) {
        this.a = str;
        this.b = zzyVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0f0)) {
            return false;
        }
        c0f0 c0f0Var = (c0f0) obj;
        return u890.j(this.a, c0f0Var.a) && u890.j(this.b, c0f0Var.b);
    }

    public final lik1 getViewUri() {
        return cfm0.i("spotify:internal:parental-control:login-current-device:", this.a, nik1.o0);
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
