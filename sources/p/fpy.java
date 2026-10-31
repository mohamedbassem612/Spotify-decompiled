package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fpy implements Parcelable {
    public static final Parcelable.Creator<fpy> CREATOR = new jhy(6);
    public final String a;
    public final kw91 b;
    public final epy c;

    public fpy(String str, kw91 kw91Var, epy epyVar) {
        this.a = str;
        this.b = kw91Var;
        this.c = epyVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpy)) {
            return false;
        }
        fpy fpyVar = (fpy) obj;
        return u890.j(this.a, fpyVar.a) && u890.j(this.b, fpyVar.b) && u890.j(this.c, fpyVar.c);
    }

    public final int hashCode() {
        return f4i1.b(this.a.hashCode() * 31, 31, this.b.a) + (this.c == null ? 0 : 752561654);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        this.b.writeToParcel(parcel, i);
        parcel.writeParcelable(this.c, i);
    }
}
