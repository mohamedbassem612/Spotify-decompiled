package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class od70 implements me70, Parcelable {
    public static final Parcelable.Creator<od70> CREATOR;
    public final md70 a;
    public final idd1 b = new idd1(new nd70(this, (byte) 0));

    static {
        w280 w280Var = b380.b;
        fyo1.k((String) null, bg11.e);
        CREATOR = new ij60((byte) 23);
    }

    public od70(String str, b380 b380Var) {
        this.a = new md70(str, b380Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od70)) {
            return false;
        }
        return this.a.equals(((od70) obj).a);
    }

    public final int hashCode() {
        return ((Number) this.b.getValue()).intValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        md70 md70Var = this.a;
        parcel.writeString(md70Var.a);
        List list = md70Var.b;
        if (list.isEmpty()) {
            list = null;
        }
        parcel.writeStringList(list);
    }
}
