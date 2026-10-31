package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e7r0 implements Parcelable {
    public static final Parcelable.Creator<e7r0> CREATOR = new p7q0((byte) 25);
    public final String a;
    public final p6r0 b;
    public final String c;
    public final tv80 d;
    public final String e;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ e7r0(String str, p6r0 p6r0Var, String str2, int i) {
        String str3 = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            p6r0Var = yon1.U4();
        }
        this(str3, p6r0Var, (i & 4) != 0 ? "" : str2, null, "");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7r0)) {
            return false;
        }
        e7r0 e7r0Var = (e7r0) obj;
        return u890.j(this.a, e7r0Var.a) && u890.j(this.b, e7r0Var.b) && u890.j(this.c, e7r0Var.c) && u890.j(this.d, e7r0Var.d) && u890.j(this.e, e7r0Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        tv80 tv80Var = this.d;
        return this.e.hashCode() + ((iD + (tv80Var == null ? 0 : tv80Var.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeSerializable(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
    }

    public e7r0(String str, p6r0 p6r0Var, String str2, tv80 tv80Var, String str3) {
        this.a = str;
        this.b = p6r0Var;
        this.c = str2;
        this.d = tv80Var;
        this.e = str3;
    }
}
