package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qte implements Parcelable {
    public static final Parcelable.Creator<qte> CREATOR = new zge((byte) 17);
    public final String a;
    public final boolean b;
    public final ctf c;
    public final zks0 d;
    public final List e;
    public final List f;

    public qte(String str, boolean z, ctf ctfVar, zks0 zks0Var, List list, List list2) {
        this.a = str;
        this.b = z;
        this.c = ctfVar;
        this.d = zks0Var;
        this.e = list;
        this.f = list2;
    }

    public static qte a(qte qteVar, boolean z, btf btfVar, List list, List list2, int i) {
        String str = qteVar.a;
        if ((i & 2) != 0) {
            z = qteVar.b;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            btfVar = qteVar.c;
        }
        btf btfVar2 = btfVar;
        zks0 zks0Var = qteVar.d;
        if ((i & 16) != 0) {
            list = qteVar.e;
        }
        List list3 = list;
        if ((i & 32) != 0) {
            list2 = qteVar.f;
        }
        qteVar.getClass();
        return new qte(str, z2, btfVar2, zks0Var, list3, list2);
    }

    public final ctf b() {
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
        if (!(obj instanceof qte)) {
            return false;
        }
        qte qteVar = (qte) obj;
        return u890.j(this.a, qteVar.a) && this.b == qteVar.b && u890.j(this.c, qteVar.c) && u890.j(this.d, qteVar.d) && u890.j(this.e, qteVar.e) && this.f.equals(qteVar.f);
    }

    public final List g() {
        return this.e;
    }

    public final boolean h() {
        return this.b;
    }

    public final int hashCode() {
        return this.f.hashCode() + f4i1.b((this.d.hashCode() + ((this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e);
    }

    public final zks0 j() {
        return this.d;
    }

    public final List k() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeParcelable(this.c, i);
        this.d.writeToParcel(parcel, i);
        Iterator itM = kk0.m(parcel, this.e);
        while (itM.hasNext()) {
            ((jwm) itM.next()).writeToParcel(parcel, i);
        }
        Iterator itM2 = kk0.m(parcel, this.f);
        while (itM2.hasNext()) {
            ((tom) itM2.next()).writeToParcel(parcel, i);
        }
    }
}
