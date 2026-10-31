package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tcs0 implements Parcelable {
    public static final Parcelable.Creator<tcs0> CREATOR = new ybs0(5);
    public final String a;
    public final String b;
    public final ycs0 c;
    public final String d;
    public final String e;
    public final c380 f;

    public tcs0(String str, String str2, ycs0 ycs0Var, String str3, String str4, c380 c380Var) {
        this.a = str;
        this.b = str2;
        this.c = ycs0Var;
        this.d = str3;
        this.e = str4;
        this.f = c380Var;
    }

    public static tcs0 a(tcs0 tcs0Var, String str, c380 c380Var, int i) {
        if ((i & 1) != 0) {
            str = tcs0Var.a;
        }
        String str2 = str;
        String str3 = tcs0Var.b;
        ycs0 ycs0Var = tcs0Var.c;
        String str4 = tcs0Var.d;
        String str5 = tcs0Var.e;
        if ((i & 32) != 0) {
            c380Var = tcs0Var.f;
        }
        tcs0Var.getClass();
        return new tcs0(str2, str3, ycs0Var, str4, str5, c380Var);
    }

    public final ee30 b(String str) {
        Object next;
        Iterator it = this.f.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((xbs0) next).a, str));
        xbs0 xbs0Var = (xbs0) next;
        if (xbs0Var != null) {
            return xbs0Var.h;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tcs0)) {
            return false;
        }
        tcs0 tcs0Var = (tcs0) obj;
        return u890.j(this.a, tcs0Var.a) && u890.j(this.b, tcs0Var.b) && u890.j(this.c, tcs0Var.c) && u890.j(this.d, tcs0Var.d) && u890.j(this.e, tcs0Var.e) && u890.j(this.f, tcs0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + cy30.d(cy30.d((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        this.c.writeToParcel(parcel, i);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        Iterator itL = x0d.l(this.f, parcel);
        while (itL.hasNext()) {
            ((xbs0) itL.next()).writeToParcel(parcel, i);
        }
    }
}
