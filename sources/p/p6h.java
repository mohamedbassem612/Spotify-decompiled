package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p6h extends s6h {
    public static final Parcelable.Creator<p6h> CREATOR = new i8g((byte) 27);
    public final int a;
    public final z771 b;
    public final ez61 c;
    public final Set d;
    public final wa71 e;
    public final wkt f;

    public p6h(int i, z771 z771Var, ez61 ez61Var, Set set, wa71 wa71Var, wkt wktVar) {
        this.a = i;
        this.b = z771Var;
        this.c = ez61Var;
        this.d = set;
        this.e = wa71Var;
        this.f = wktVar;
    }

    public static p6h l(p6h p6hVar, int i, wkt wktVar, int i2) {
        if ((i2 & 1) != 0) {
            i = p6hVar.a;
        }
        int i3 = i;
        z771 z771Var = p6hVar.b;
        ez61 ez61Var = p6hVar.c;
        Set set = p6hVar.d;
        wa71 wa71Var = p6hVar.e;
        if ((i2 & 32) != 0) {
            wktVar = p6hVar.f;
        }
        return new p6h(i3, z771Var, ez61Var, set, wa71Var, wktVar);
    }

    public final Set a() {
        return this.d;
    }

    public final ez61 b() {
        return this.c;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6h)) {
            return false;
        }
        p6h p6hVar = (p6h) obj;
        return this.a == p6hVar.a && u890.j(this.b, p6hVar.b) && u890.j(this.c, p6hVar.c) && u890.j(this.d, p6hVar.d) && u890.j(this.e, p6hVar.e) && u890.j(this.f, p6hVar.f);
    }

    public final z771 g() {
        return this.b;
    }

    public final int h() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + gvg.c(pze0.f(this.c, xvj1.j(this.b.a, l1d.C(this.a) * 31, 31), 31), 31, this.d)) * 31;
        wkt wktVar = this.f;
        return iHashCode + (wktVar == null ? 0 : wktVar.hashCode());
    }

    public final wa71 j() {
        return this.e;
    }

    public final wkt k() {
        return this.f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(lf51.q(this.a));
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        Iterator itH = k4s0.h(this.d, parcel);
        while (itH.hasNext()) {
            parcel.writeString(((a7h) itH.next()).name());
        }
        parcel.writeParcelable(this.e, i);
    }
}
