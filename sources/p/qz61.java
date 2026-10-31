package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qz61 implements Parcelable {
    public static final Parcelable.Creator<qz61> CREATOR = new hs61((byte) 17);
    public final z771 a;
    public final s4b1 b;
    public final zsd c;

    public qz61(z771 z771Var, s4b1 s4b1Var, zsd zsdVar) {
        this.a = z771Var;
        this.b = s4b1Var;
        this.c = zsdVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz61)) {
            return false;
        }
        qz61 qz61Var = (qz61) obj;
        return u890.j(this.a, qz61Var.a) && u890.j(this.b, qz61Var.b) && u890.j(this.c, qz61Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xvj1.j(this.b, this.a.a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        s4b1 s4b1Var = this.b;
        parcel.writeString(s4b1Var != null ? s4b1Var.z() : null);
        parcel.writeParcelable(this.c, i);
    }
}
