package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ngd implements Parcelable {
    public static final Parcelable.Creator<ngd> CREATOR = new yyb((byte) 19);
    public final ve10 a;
    public final ve10 b;
    public final String c;
    public final hux d;
    public final String e;

    public ngd(ve10 ve10Var, ve10 ve10Var2, String str, hux huxVar, String str2) {
        this.a = ve10Var;
        this.b = ve10Var2;
        this.c = str;
        this.d = huxVar;
        this.e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ngd)) {
            return false;
        }
        ngd ngdVar = (ngd) obj;
        return u890.j(this.a, ngdVar.a) && u890.j(this.b, ngdVar.b) && u890.j(this.c, ngdVar.c) && u890.j(this.d, ngdVar.d) && u890.j(this.e, ngdVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + eqq.k(cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        this.b.writeToParcel(parcel, i);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
    }
}
