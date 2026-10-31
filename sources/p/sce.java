package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class sce implements Parcelable {
    public static final Parcelable.Creator<sce> CREATOR = new xud((byte) 22);
    public final String a;
    public final String b;
    public final van c;

    public sce(String str, String str2, van vanVar) {
        this.a = str;
        this.b = str2;
        this.c = vanVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sce)) {
            return false;
        }
        sce sceVar = (sce) obj;
        return u890.j(this.a, sceVar.a) && u890.j(this.b, sceVar.b) && u890.j(this.c, sceVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        this.c.writeToParcel(parcel, i);
    }
}
