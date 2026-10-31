package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class frz0 implements Parcelable {
    public static final Parcelable.Creator<frz0> CREATOR = new erz0((byte) 0);
    public final String a;
    public final List b;
    public final String c;
    public final v0a d;

    public frz0(String str, List list, String str2, v0a v0aVar) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = v0aVar;
    }

    public final String a() {
        return this.c;
    }

    public final v0a b() {
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
        if (!(obj instanceof frz0)) {
            return false;
        }
        frz0 frz0Var = (frz0) obj;
        return u890.j(this.a, frz0Var.a) && u890.j(this.b, frz0Var.b) && u890.j(this.c, frz0Var.c) && u890.j(this.d, frz0Var.d);
    }

    public final List g() {
        return this.b;
    }

    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        int iB = f4i1.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        v0a v0aVar = this.d;
        return iHashCode + (v0aVar != null ? v0aVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
    }
}
