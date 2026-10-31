package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class p57 implements r57 {
    public static final Parcelable.Creator<p57> CREATOR = new fp5((byte) 28);
    public final String a;

    public /* synthetic */ p57(String str) {
        this.a = str;
    }

    public static final /* synthetic */ p57 a(String str) {
        return new p57(str);
    }

    public final /* synthetic */ String b() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p57) {
            return u890.j(this.a, ((p57) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f4i1.f("Url(value=", this.a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
