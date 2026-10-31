package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.martini.martinidata.model.Mode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fj21 implements Parcelable {
    public static final Parcelable.Creator<fj21> CREATOR = new g321((byte) 3);
    public final String a;
    public final String b;
    public final lik1 c;
    public final Mode d;

    public fj21(String str, String str2, lik1 lik1Var, Mode mode) {
        this.a = str;
        this.b = str2;
        this.c = lik1Var;
        this.d = mode;
    }

    public final Mode a() {
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
        if (!(obj instanceof fj21)) {
            return false;
        }
        fj21 fj21Var = (fj21) obj;
        return u890.j(this.a, fj21Var.a) && u890.j(this.b, fj21Var.b) && u890.j(this.c, fj21Var.c) && this.d == fj21Var.d;
    }

    public final String getUri() {
        return this.b;
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d.name());
    }
}
