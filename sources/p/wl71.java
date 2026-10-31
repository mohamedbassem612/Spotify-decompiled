package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wl71 implements Parcelable {
    public static final Parcelable.Creator<wl71> CREATOR = new ff71((byte) 22);
    public final cmt a;
    public final String b;
    public final String c;
    public final String d;
    public final va71 e;
    public final hl71 f;
    public final te71 g;
    public final String h;

    public wl71(String str, String str2, String str3, String str4, cmt cmtVar, va71 va71Var, te71 te71Var, hl71 hl71Var) {
        this.a = cmtVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = va71Var;
        this.f = hl71Var;
        this.g = te71Var;
        this.h = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl71)) {
            return false;
        }
        wl71 wl71Var = (wl71) obj;
        return u890.j(this.a, wl71Var.a) && u890.j(this.b, wl71Var.b) && u890.j(this.c, wl71Var.c) && u890.j(this.d, wl71Var.d) && u890.j(this.e, wl71Var.e) && u890.j(this.f, wl71Var.f) && u890.j(this.g, wl71Var.g) && u890.j(this.h, wl71Var.h);
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() + ((this.f.hashCode() + ((this.e.a.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31)) * 31;
        String str = this.h;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(new w871(this.d), i);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
        parcel.writeParcelable(this.g, i);
        parcel.writeString(this.h);
    }
}
