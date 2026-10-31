package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class o57 implements r57 {
    public static final Parcelable.Creator<o57> CREATOR = new fp5((byte) 27);
    public final String a;

    public /* synthetic */ o57(String str) {
        this.a = str;
    }

    public static final /* synthetic */ o57 a(String str) {
        return new o57(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o57) {
            return u890.j(this.a, ((o57) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f4i1.f("FileId(value=", this.a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
