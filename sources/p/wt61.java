package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wt61 implements Parcelable {
    public static final Parcelable.Creator<wt61> CREATOR = new hs61((byte) 5);
    public final p6r0 a;
    public final String b;

    public wt61(p6r0 p6r0Var, String str) {
        this.a = p6r0Var;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wt61)) {
            return false;
        }
        wt61 wt61Var = (wt61) obj;
        return u890.j(this.a, wt61Var.a) && u890.j(this.b, wt61Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.a);
        parcel.writeString(this.b);
    }
}
