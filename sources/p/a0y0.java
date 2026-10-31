package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a0y0 extends c0y0 {
    public static final Parcelable.Creator<a0y0> CREATOR = new zzx0((byte) 0);
    public final String b;
    public final String c;

    public a0y0(String str, String str2) {
        super(null);
        this.b = str;
        this.c = str2;
    }

    @Override // p.c0y0
    public final String a() {
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
        if (!(obj instanceof a0y0)) {
            return false;
        }
        a0y0 a0y0Var = (a0y0) obj;
        return u890.j(this.b, a0y0Var.b) && u890.j(this.c, a0y0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public /* synthetic */ a0y0(String str) {
        this(str, null);
    }
}
