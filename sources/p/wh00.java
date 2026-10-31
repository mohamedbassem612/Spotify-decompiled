package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wh00 implements Parcelable {
    public static final Parcelable.Creator<wh00> CREATOR = new dez((byte) 28);
    public final String a;
    public final String b;
    public final jj40 c;
    public final List d;

    public wh00(String str, String str2, jj40 jj40Var, List list) {
        this.a = str;
        this.b = str2;
        this.c = jj40Var;
        this.d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wh00)) {
            return false;
        }
        wh00 wh00Var = (wh00) obj;
        return u890.j(this.a, wh00Var.a) && u890.j(this.b, wh00Var.b) && u890.j(this.c, wh00Var.c) && this.d.equals(wh00Var.d);
    }

    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        jj40 jj40Var = this.c;
        return this.d.hashCode() + ((iD + (jj40Var == null ? 0 : jj40Var.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        Iterator itM = kk0.m(parcel, this.d);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
    }
}
