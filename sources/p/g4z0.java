package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g4z0 implements h4z0 {
    public static final Parcelable.Creator<g4z0> CREATOR = new j1z0((byte) 7);
    public final String a;
    public final boolean b;
    public final String c;

    public g4z0(String str, String str2, boolean z) {
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4z0)) {
            return false;
        }
        g4z0 g4z0Var = (g4z0) obj;
        return u890.j(this.a, g4z0Var.a) && this.b == g4z0Var.b && u890.j(this.c, g4z0Var.c);
    }

    public final boolean f() {
        return this.b;
    }

    public final String getDescription() {
        return this.c;
    }

    public final String getText() {
        return this.a;
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iG + (str == null ? 0 : str.hashCode());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c);
    }
}
