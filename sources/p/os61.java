package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class os61 implements Parcelable {
    public static final Parcelable.Creator<os61> CREATOR = new hs61((byte) 1);
    public final p6r0 a;
    public final gu61 b;
    public final String c;
    public final int d;

    public /* synthetic */ os61(p6r0 p6r0Var, gu61 gu61Var, String str, int i) {
        this(p6r0Var, gu61Var, (i & 4) != 0 ? null : str, 0, null);
    }

    public final String a() {
        return this.c;
    }

    public final int b() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof os61)) {
            return false;
        }
        os61 os61Var = (os61) obj;
        return u890.j(this.a, os61Var.a) && u890.j(this.b, os61Var.b) && u890.j(this.c, os61Var.c) && this.d == os61Var.d;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b.a);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        int i = this.d;
        return iHashCode + (i != 0 ? l1d.C(i) : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        int i2 = this.d;
        if (i2 == 0) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        if (i2 != 1) {
            throw null;
        }
        parcel.writeString("SEARCH");
    }

    public os61(p6r0 p6r0Var, gu61 gu61Var, String str, int i, l1d l1dVar) {
        this.a = p6r0Var;
        this.b = gu61Var;
        this.c = str;
        this.d = i;
    }
}
