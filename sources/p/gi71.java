package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gi71 extends ii71 {
    public static final Parcelable.Creator<gi71> CREATOR = new ff71((byte) 8);
    public final hl71 a;
    public final List b;
    public final cmt c;
    public final String d;
    public final String e;
    public final String f;
    public final va71 g;
    public final te71 h;

    public gi71(hl71 hl71Var, List list, cmt cmtVar, String str, String str2, String str3, va71 va71Var, te71 te71Var) {
        this.a = hl71Var;
        this.b = list;
        this.c = cmtVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = va71Var;
        this.h = te71Var;
    }

    public static gi71 a(gi71 gi71Var, hl71 hl71Var, ArrayList arrayList, te71 te71Var, int i) {
        if ((i & 1) != 0) {
            hl71Var = gi71Var.a;
        }
        hl71 hl71Var2 = hl71Var;
        List list = arrayList;
        if ((i & 2) != 0) {
            list = gi71Var.b;
        }
        List list2 = list;
        cmt cmtVar = gi71Var.c;
        String str = gi71Var.d;
        String str2 = gi71Var.e;
        String str3 = gi71Var.f;
        va71 va71Var = gi71Var.g;
        if ((i & 128) != 0) {
            te71Var = gi71Var.h;
        }
        gi71Var.getClass();
        return new gi71(hl71Var2, list2, cmtVar, str, str2, str3, va71Var, te71Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gi71)) {
            return false;
        }
        gi71 gi71Var = (gi71) obj;
        return u890.j(this.a, gi71Var.a) && this.b.equals(gi71Var.b) && u890.j(this.c, gi71Var.c) && u890.j(this.d, gi71Var.d) && u890.j(this.e, gi71Var.e) && u890.j(this.f, gi71Var.f) && u890.j(this.g, gi71Var.g) && u890.j(this.h, gi71Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.a.hashCode() + cy30.d(cy30.d(cy30.d((this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeParcelable(new w871(this.f), i);
        parcel.writeParcelable(this.g, i);
        parcel.writeParcelable(this.h, i);
    }
}
