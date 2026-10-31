package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gq70 implements Parcelable, ir0 {
    public static final Parcelable.Creator<gq70> CREATOR = new mj70((byte) 4);
    public final int a;
    public final int b;
    public final r57 c;

    public gq70(int i, int i2, r57 r57Var) {
        this.a = i;
        this.b = i2;
        this.c = r57Var;
    }

    public final r57 a() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq70)) {
            return false;
        }
        gq70 gq70Var = (gq70) obj;
        return this.a == gq70Var.a && this.b == gq70Var.b && u890.j(this.c, gq70Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeParcelable((Parcelable) this.c, i);
    }

    public /* synthetic */ gq70(p57 p57Var) {
        this(0, 0, p57Var);
    }
}
