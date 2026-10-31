package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gf71 implements Parcelable {
    public static final Parcelable.Creator<gf71> CREATOR = new ff71(0);
    public final hl71 a;
    public final String b;
    public final String c;
    public final String d;
    public final te71 e;

    public gf71(String str, String str2, String str3, te71 te71Var, hl71 hl71Var) {
        this.a = hl71Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = te71Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf71)) {
            return false;
        }
        gf71 gf71Var = (gf71) obj;
        return u890.j(this.a, gf71Var.a) && u890.j(this.b, gf71Var.b) && u890.j(this.c, gf71Var.c) && u890.j(this.d, gf71Var.d) && u890.j(this.e, gf71Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(new w871(this.d), i);
        parcel.writeParcelable(this.e, i);
    }
}
