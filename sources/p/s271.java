package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s271 implements pf51, Parcelable {
    public static final Parcelable.Creator<s271> CREATOR = new hs61((byte) 21);
    public final ArrayList a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public s271(String str, String str2, String str3, String str4, String str5, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s271)) {
            return false;
        }
        s271 s271Var = (s271) obj;
        return this.a.equals(s271Var.a) && u890.j(this.b, s271Var.b) && u890.j(this.c, s271Var.c) && u890.j(this.d, s271Var.d) && u890.j(this.e, s271Var.e) && u890.j(this.f, s271Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itO = xvj1.o(this.a, parcel);
        while (itO.hasNext()) {
            ((r271) itO.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }
}
