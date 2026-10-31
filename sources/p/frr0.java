package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class frr0 extends zpb1 implements Parcelable, uv91, tob1, ven0 {
    public static final Parcelable.Creator<frr0> CREATOR = new elr0((byte) 24);
    public tv91 b;

    public frr0(long j) {
        jv91 jv91VarH = pv91.h();
        tv91 tv91Var = new tv91(jv91VarH.g(), j);
        if (!(jv91VarH instanceof rv40)) {
            tv91Var.b = new tv91(1L, j);
        }
        this.b = tv91Var;
    }

    @Override // p.ven0
    public final iu30 b() {
        return new waq0(this, (byte) 27);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p.uv91
    public final wv91 g() {
        return kcx0.R0;
    }

    @Override // p.tob1
    public final Object getValue() {
        return Long.valueOf(s());
    }

    @Override // p.ven0
    public final Object h() {
        return Long.valueOf(s());
    }

    @Override // p.ypb1
    public final cqb1 k() {
        return this.b;
    }

    @Override // p.ypb1
    public final void l(cqb1 cqb1Var) {
        this.b = (tv91) cqb1Var;
    }

    @Override // p.ypb1
    public final cqb1 n(cqb1 cqb1Var, cqb1 cqb1Var2, cqb1 cqb1Var3) {
        if (((tv91) cqb1Var2).c == ((tv91) cqb1Var3).c) {
            return cqb1Var2;
        }
        return null;
    }

    public final long s() {
        return ((tv91) pv91.r(this.b, this)).c;
    }

    @Override // p.ven0
    public final void setValue(Object obj) {
        t(((Number) obj).longValue());
    }

    public final void t(long j) {
        jv91 jv91VarH;
        tv91 tv91Var = (tv91) pv91.f(this.b);
        if (tv91Var.c != j) {
            tv91 tv91Var2 = this.b;
            synchronized (pv91.c) {
                jv91VarH = pv91.h();
                ((tv91) pv91.n(tv91Var2, this, jv91VarH, tv91Var)).c = j;
            }
            pv91.l(jv91VarH, this);
        }
    }

    public final String toString() {
        return "MutableLongState(value=" + ((tv91) pv91.f(this.b)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(s());
    }
}
