package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class drr0 extends zpb1 implements Parcelable, uv91, ven0, tob1 {
    public static final Parcelable.Creator<drr0> CREATOR = new elr0((byte) 23);
    public rv91 b;

    public drr0(float f) {
        jv91 jv91VarH = pv91.h();
        rv91 rv91Var = new rv91(jv91VarH.g(), f);
        if (!(jv91VarH instanceof rv40)) {
            rv91Var.b = new rv91(1L, f);
        }
        this.b = rv91Var;
    }

    @Override // p.ven0
    public final iu30 b() {
        return new waq0(this, (byte) 25);
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
        return Float.valueOf(s());
    }

    @Override // p.ven0
    public final Object h() {
        return Float.valueOf(s());
    }

    @Override // p.ypb1
    public final cqb1 k() {
        return this.b;
    }

    @Override // p.ypb1
    public final void l(cqb1 cqb1Var) {
        this.b = (rv91) cqb1Var;
    }

    @Override // p.ypb1
    public final cqb1 n(cqb1 cqb1Var, cqb1 cqb1Var2, cqb1 cqb1Var3) {
        if (((rv91) cqb1Var2).c == ((rv91) cqb1Var3).c) {
            return cqb1Var2;
        }
        return null;
    }

    public final float s() {
        return ((rv91) pv91.r(this.b, this)).c;
    }

    @Override // p.ven0
    public final void setValue(Object obj) {
        t(((Number) obj).floatValue());
    }

    public final void t(float f) {
        jv91 jv91VarH;
        rv91 rv91Var = (rv91) pv91.f(this.b);
        if (rv91Var.c == f) {
            return;
        }
        rv91 rv91Var2 = this.b;
        synchronized (pv91.c) {
            jv91VarH = pv91.h();
            ((rv91) pv91.n(rv91Var2, this, jv91VarH, rv91Var)).c = f;
        }
        pv91.l(jv91VarH, this);
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((rv91) pv91.f(this.b)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(s());
    }
}
