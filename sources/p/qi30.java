package p;

import android.os.Parcel;
import android.os.Parcelable;
import app.p000rive.semantics.SemanticState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qi30 implements Parcelable {
    public static final Parcelable.Creator<qi30> CREATOR = new hbn1((byte) 22);
    public final int N0;
    public final boolean O0;
    public final boolean X;
    public final int Y;
    public final String Z;
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean t;

    public qi30(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readInt() != 0;
        this.d = parcel.readInt() != 0;
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readString();
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.t = parcel.readInt() != 0;
        this.X = parcel.readInt() != 0;
        this.Y = parcel.readInt();
        this.Z = parcel.readString();
        this.N0 = parcel.readInt();
        this.O0 = parcel.readInt() != 0;
    }

    public final zf30 a(rg30 rg30Var, ClassLoader classLoader) {
        zf30 zf30VarA = rg30Var.a(classLoader, this.a);
        zf30VarA.e = this.b;
        zf30VarA.O0 = this.c;
        zf30VarA.Q0 = this.d;
        zf30VarA.R0 = true;
        zf30VarA.Y0 = this.e;
        zf30VarA.Z0 = this.f;
        zf30VarA.a1 = this.g;
        zf30VarA.d1 = this.h;
        zf30VarA.Y = this.i;
        zf30VarA.c1 = this.t;
        zf30VarA.b1 = this.X;
        zf30VarA.r1 = w8c0.values()[this.Y];
        zf30VarA.h = this.Z;
        zf30VarA.i = this.N0;
        zf30VarA.l1 = this.O0;
        return zf30VarA;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(SemanticState.Focused);
        sb.append("FragmentState{");
        sb.append(this.a);
        sb.append(" (");
        sb.append(this.b);
        sb.append(")}:");
        if (this.c) {
            sb.append(" fromLayout");
        }
        if (this.d) {
            sb.append(" dynamicContainer");
        }
        int i = this.f;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.h) {
            sb.append(" retainInstance");
        }
        if (this.i) {
            sb.append(" removing");
        }
        if (this.t) {
            sb.append(" detached");
        }
        if (this.X) {
            sb.append(" hidden");
        }
        String str2 = this.Z;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.N0);
        }
        if (this.O0) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeInt(this.Y);
        parcel.writeString(this.Z);
        parcel.writeInt(this.N0);
        parcel.writeInt(this.O0 ? 1 : 0);
    }

    public qi30(zf30 zf30Var) {
        this.a = zf30Var.getClass().getName();
        this.b = zf30Var.e;
        this.c = zf30Var.O0;
        this.d = zf30Var.Q0;
        this.e = zf30Var.Y0;
        this.f = zf30Var.Z0;
        this.g = zf30Var.a1;
        this.h = zf30Var.d1;
        this.i = zf30Var.Y;
        this.t = zf30Var.c1;
        this.X = zf30Var.b1;
        this.Y = zf30Var.r1.ordinal();
        this.Z = zf30Var.h;
        this.N0 = zf30Var.i;
        this.O0 = zf30Var.l1;
    }
}
