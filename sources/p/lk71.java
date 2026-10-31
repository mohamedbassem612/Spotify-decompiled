package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lk71 extends nk71 {
    public static final Parcelable.Creator<lk71> CREATOR = new ff71((byte) 16);
    public final String a;
    public final rn71 b;
    public final s1f1 c;

    public lk71(String str, rn71 rn71Var, s1f1 s1f1Var) {
        this.a = str;
        this.b = rn71Var;
        this.c = s1f1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk71)) {
            return false;
        }
        lk71 lk71Var = (lk71) obj;
        return u890.j(this.a, lk71Var.a) && u890.j(this.b, lk71Var.b) && u890.j(this.c, lk71Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.a.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
    }
}
