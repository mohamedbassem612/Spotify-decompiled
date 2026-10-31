package p;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ilw0 extends llw0 {
    public static final Parcelable.Creator<ilw0> CREATOR = new w7w0((byte) 16);
    public final int a;
    public final int b;
    public final String c;

    public ilw0(String str, String str2, String str3) {
        this(Color.parseColor(str), Color.parseColor(str2), str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ilw0)) {
            return false;
        }
        ilw0 ilw0Var = (ilw0) obj;
        return this.a == ilw0Var.a && this.b == ilw0Var.b && u890.j(this.c, ilw0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
    }

    public ilw0(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }
}
