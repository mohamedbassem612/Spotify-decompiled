package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ytt implements Parcelable {
    public static final Parcelable.Creator<ytt> CREATOR = new zrt((byte) 3);
    public final String a;
    public final boolean b;

    public ytt(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("device.picker.bottom.sheet.args", this);
        return bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ytt)) {
            return false;
        }
        ytt yttVar = (ytt) obj;
        return u890.j(this.a, yttVar.a) && this.b == yttVar.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
