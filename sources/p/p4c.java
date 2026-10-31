package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p4c implements mvd, nvd, Parcelable {
    public static final Parcelable.Creator<p4c> CREATOR = new yyb((byte) 3);
    public final ka61 a;
    public final String b;
    public final String c;

    public p4c(ka61 ka61Var, String str, String str2) {
        this.a = ka61Var;
        this.b = str;
        this.c = str2;
    }

    @Override // p.mvd
    public final Object a(Collection collection) {
        ka61 ka61Var = this.a;
        return new p4c(ka61.h(ka61Var, ka61Var.a.a(collection)), this.b, this.c);
    }

    @Override // p.mvd
    public final Object b(i iVar) {
        ka61 ka61Var = this.a;
        return new p4c(ka61.h(ka61Var, ka61Var.a.b(iVar)), this.b, this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4c)) {
            return false;
        }
        p4c p4cVar = (p4c) obj;
        return u890.j(this.a, p4cVar.a) && u890.j(this.b, p4cVar.b) && u890.j(this.c, p4cVar.c);
    }

    @Override // p.mvd
    public final Object g(i iVar) {
        ka61 ka61Var = this.a;
        return new p4c(ka61.h(ka61Var, ka61Var.a.k(iVar, z6x.a, false)), this.b, this.c);
    }

    public final List getItems() {
        return this.a.a.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
