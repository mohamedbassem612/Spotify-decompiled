package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wwy extends ywy {
    public static final Parcelable.Creator<wwy> CREATOR = new jhy((byte) 14);
    public final int X;
    public final List Y;
    public final u771 a;
    public final int b;
    public final ela1 c;
    public final wkt d;
    public final cuu0 e;
    public final llw0 f;
    public final vwy g;
    public final Map h;
    public final bwe1 i;
    public final rhy t;

    public wwy(u771 u771Var, int i, ela1 ela1Var, wkt wktVar, cuu0 cuu0Var, llw0 llw0Var, vwy vwyVar, Map map, bwe1 bwe1Var, rhy rhyVar, int i2, List list) {
        this.a = u771Var;
        this.b = i;
        this.c = ela1Var;
        this.d = wktVar;
        this.e = cuu0Var;
        this.f = llw0Var;
        this.g = vwyVar;
        this.h = map;
        this.i = bwe1Var;
        this.t = rhyVar;
        this.X = i2;
        this.Y = list;
    }

    public static wwy g(wwy wwyVar, int i, wkt wktVar, cuu0 cuu0Var, llw0 llw0Var, vwy vwyVar, int i2, int i3) {
        u771 u771Var = wwyVar.a;
        if ((i3 & 2) != 0) {
            i = wwyVar.b;
        }
        int i4 = i;
        ela1 ela1Var = wwyVar.c;
        wkt wktVar2 = (i3 & 8) != 0 ? wwyVar.d : wktVar;
        cuu0 cuu0Var2 = (i3 & 16) != 0 ? wwyVar.e : cuu0Var;
        llw0 llw0Var2 = (i3 & 32) != 0 ? wwyVar.f : llw0Var;
        vwy vwyVar2 = (i3 & 64) != 0 ? wwyVar.g : vwyVar;
        Map map = wwyVar.h;
        bwe1 bwe1Var = wwyVar.i;
        rhy rhyVar = wwyVar.t;
        int i5 = (i3 & 1024) != 0 ? wwyVar.X : i2;
        List list = wwyVar.Y;
        wwyVar.getClass();
        return new wwy(u771Var, i4, ela1Var, wktVar2, cuu0Var2, llw0Var2, vwyVar2, map, bwe1Var, rhyVar, i5, list);
    }

    @Override // p.ywy
    public final u771 a() {
        return this.a;
    }

    @Override // p.ywy
    public final wkt b() {
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
        if (!(obj instanceof wwy)) {
            return false;
        }
        wwy wwyVar = (wwy) obj;
        return u890.j(this.a, wwyVar.a) && this.b == wwyVar.b && u890.j(this.c, wwyVar.c) && u890.j(this.d, wwyVar.d) && u890.j(this.e, wwyVar.e) && u890.j(this.f, wwyVar.f) && this.g == wwyVar.g && u890.j(this.h, wwyVar.h) && u890.j(this.i, wwyVar.i) && u890.j(this.t, wwyVar.t) && this.X == wwyVar.X && u890.j(this.Y, wwyVar.Y);
    }

    public final jlw0 h() {
        return (jlw0) this.h.get(this.g);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ab80.k(this.b, this.a.hashCode() * 31, 31)) * 31;
        wkt wktVar = this.d;
        int iHashCode2 = (iHashCode + (wktVar == null ? 0 : wktVar.hashCode())) * 31;
        cuu0 cuu0Var = this.e;
        int iE = cy30.e((this.g.hashCode() + ((this.f.hashCode() + ((iHashCode2 + (cuu0Var == null ? 0 : cuu0Var.hashCode())) * 31)) * 31)) * 31, 31, this.h);
        bwe1 bwe1Var = this.i;
        int iHashCode3 = (iE + (bwe1Var == null ? 0 : Long.hashCode(bwe1Var.a))) * 31;
        rhy rhyVar = this.t;
        return this.Y.hashCode() + kaa0.f(this.X, (iHashCode3 + (rhyVar != null ? rhyVar.hashCode() : 0)) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(lf51.q(this.b));
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
        parcel.writeString(this.g.name());
        Iterator itJ = xcg1.j(parcel, this.h);
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            parcel.writeString(((vwy) entry.getKey()).name());
            parcel.writeParcelable((Parcelable) entry.getValue(), i);
        }
        parcel.writeParcelable(this.i, i);
        parcel.writeParcelable(this.t, i);
        parcel.writeInt(this.X);
        Iterator itM = kk0.m(parcel, this.Y);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
    }
}
