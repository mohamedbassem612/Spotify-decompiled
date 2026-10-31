package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class err0 extends zpb1 implements Parcelable, hdn0, uv91 {
    public static final Parcelable.Creator<err0> CREATOR = new agm0((byte) 4);
    public sv91 b;

    public err0(int i) {
        jv91 jv91VarH = pv91.h();
        sv91 sv91Var = new sv91(jv91VarH.g(), i);
        if (!(jv91VarH instanceof rv40)) {
            sv91Var.b = new sv91(1L, i);
        }
        this.b = sv91Var;
    }

    @Override // p.ven0
    public final iu30 b() {
        return new waq0(this, (byte) 26);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p.uv91
    public final wv91 g() {
        return kcx0.R0;
    }

    @Override // p.ven0
    public final Object h() {
        return Integer.valueOf(s());
    }

    @Override // p.ypb1
    public final cqb1 k() {
        return this.b;
    }

    @Override // p.ypb1
    public final void l(cqb1 cqb1Var) {
        this.b = (sv91) cqb1Var;
    }

    @Override // p.ypb1
    public final cqb1 n(cqb1 cqb1Var, cqb1 cqb1Var2, cqb1 cqb1Var3) {
        if (((sv91) cqb1Var2).c == ((sv91) cqb1Var3).c) {
            return cqb1Var2;
        }
        return null;
    }

    public final int s() {
        return ((sv91) pv91.r(this.b, this)).c;
    }

    public final void t(int i) {
        jv91 jv91VarH;
        sv91 sv91Var = (sv91) pv91.f(this.b);
        if (sv91Var.c != i) {
            sv91 sv91Var2 = this.b;
            synchronized (pv91.c) {
                jv91VarH = pv91.h();
                ((sv91) pv91.n(sv91Var2, this, jv91VarH, sv91Var)).c = i;
            }
            pv91.l(jv91VarH, this);
        }
    }

    public final String toString() {
        return cy30.i(((sv91) pv91.f(this.b)).c, "MutableIntState(value=", hashCode(), ")@");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(s());
    }
}
