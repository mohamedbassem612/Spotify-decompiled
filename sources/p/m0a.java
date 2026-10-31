package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m0a implements Parcelable {
    public static final Parcelable.Creator<m0a> CREATOR = new ux9((byte) 13);
    public final String a;
    public final o0a b;

    public m0a(String str, o0a o0aVar) {
        this.a = str;
        this.b = o0aVar;
    }

    public final o0a a() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0a)) {
            return false;
        }
        m0a m0aVar = (m0a) obj;
        return u890.j(this.a, m0aVar.a) && this.b == m0aVar.b;
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.name());
    }
}
