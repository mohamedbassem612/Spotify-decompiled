package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yyl extends kzl {
    public static final Parcelable.Creator<yyl> CREATOR = new pol((byte) 24);
    public final String a;
    public final gxs0 b;
    public final int c;
    public final tv80 d;

    public yyl(String str, gxs0 gxs0Var, int i, tv80 tv80Var) {
        this.a = str;
        this.b = gxs0Var;
        this.c = i;
        this.d = tv80Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yyl)) {
            return false;
        }
        yyl yylVar = (yyl) obj;
        return u890.j(this.a, yylVar.a) && u890.j(this.b, yylVar.b) && this.c == yylVar.c && u890.j(this.d, yylVar.d);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        tv80 tv80Var = this.d;
        return iF + (tv80Var == null ? 0 : tv80Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
        parcel.writeParcelable(this.d, i);
    }
}
