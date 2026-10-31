package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dd70 implements x570, Parcelable {
    public final cd70 a;
    public final idd1 b = new idd1(new g050(this, (byte) 27));
    public static final dd70 c = byo1.m((pc70) null, (pc70) null, (Map) null, (String) null);
    public static final Parcelable.Creator<dd70> CREATOR = new ij60((byte) 19);

    public dd70(ld70 ld70Var, ld70 ld70Var2, j380 j380Var, String str) {
        this.a = new cd70(this, ld70Var, ld70Var2, j380Var, str);
    }

    public final ld70 a() {
        return this.a.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd70)) {
            return false;
        }
        return this.a.equals(((dd70) obj).a);
    }

    public final int hashCode() {
        return ((Number) this.b.getValue()).intValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cd70 cd70Var = this.a;
        parcel.writeTypedObject(cd70Var.c, i);
        parcel.writeTypedObject(cd70Var.d, i);
        gho1.t(parcel, cd70Var.e);
        parcel.writeString(cd70Var.f);
    }
}
