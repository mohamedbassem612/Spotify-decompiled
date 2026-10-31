package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e371 implements f371 {
    public static final Parcelable.Creator<e371> CREATOR = new hs61((byte) 25);
    public final cmt a;
    public final String b;

    public e371(cmt cmtVar, String str) {
        this.a = cmtVar;
        this.b = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e371)) {
            return false;
        }
        e371 e371Var = (e371) obj;
        return u890.j(this.a, e371Var.a) && u890.j(this.b, e371Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(new w871(this.b), i);
    }
}
