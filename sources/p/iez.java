package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class iez implements Parcelable {
    public static final Parcelable.Creator<iez> CREATOR = new dez((byte) 3);
    public final hez a;
    public final s69 b;
    public final s69 c;
    public final s69 d;
    public final s69 e;
    public final s69 f;
    public final s69 g;

    public iez(hez hezVar, s69 s69Var, s69 s69Var2, s69 s69Var3, s69 s69Var4, s69 s69Var5, s69 s69Var6) {
        this.a = hezVar;
        this.b = s69Var;
        this.c = s69Var2;
        this.d = s69Var3;
        this.e = s69Var4;
        this.f = s69Var5;
        this.g = s69Var6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iez)) {
            return false;
        }
        iez iezVar = (iez) obj;
        return u890.j(this.a, iezVar.a) && u890.j(this.b, iezVar.b) && u890.j(this.c, iezVar.c) && u890.j(this.d, iezVar.d) && u890.j(this.e, iezVar.e) && u890.j(this.f, iezVar.f) && u890.j(this.g, iezVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + v8i0.h(this.f, v8i0.h(this.e, v8i0.h(this.d, v8i0.h(this.c, v8i0.h(this.b, this.a.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        this.b.writeToParcel(parcel, i);
        this.c.writeToParcel(parcel, i);
        this.d.writeToParcel(parcel, i);
        this.e.writeToParcel(parcel, i);
        this.f.writeToParcel(parcel, i);
        this.g.writeToParcel(parcel, i);
    }
}
