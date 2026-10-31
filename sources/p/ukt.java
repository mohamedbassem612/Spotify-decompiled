package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ukt extends wkt {
    public static final Parcelable.Creator<ukt> CREATOR = new qms((byte) 18);
    public final o571 a;
    public final c380 b;
    public final ou80 c;

    public ukt(o571 o571Var, c380 c380Var, ou80 ou80Var) {
        this.a = o571Var;
        this.b = c380Var;
        this.c = ou80Var;
    }

    @Override // p.wkt
    public final o571 a() {
        return this.a;
    }

    @Override // p.wkt
    public final ou80 b() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ukt)) {
            return false;
        }
        ukt uktVar = (ukt) obj;
        return u890.j(this.a, uktVar.a) && u890.j(this.b, uktVar.b) && u890.j(this.c, uktVar.c);
    }

    @Override // p.wkt
    public final c380 g() {
        return this.b;
    }

    public final int hashCode() {
        int iF = kk0.f(this.b, this.a.hashCode() * 31, 31);
        ou80 ou80Var = this.c;
        return iF + (ou80Var == null ? 0 : ou80Var.a.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        Iterator itL = x0d.l(this.b, parcel);
        while (itL.hasNext()) {
            parcel.writeString(((yy61) itL.next()).name());
        }
        parcel.writeSerializable(this.c);
    }
}
