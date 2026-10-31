package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hrr0 extends zpb1 implements Parcelable, uv91 {
    public static final Parcelable.Creator<hrr0> CREATOR = new grr0(0);
    public final wv91 b;
    public vv91 c;

    public hrr0(Object obj, wv91 wv91Var) {
        this.b = wv91Var;
        jv91 jv91VarH = pv91.h();
        vv91 vv91Var = new vv91(jv91VarH.g(), obj);
        if (!(jv91VarH instanceof rv40)) {
            vv91Var.b = new vv91(1L, obj);
        }
        this.c = vv91Var;
    }

    @Override // p.ven0
    public final iu30 b() {
        return new waq0(this, (byte) 28);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p.uv91
    public final wv91 g() {
        return this.b;
    }

    @Override // p.tob1
    public final Object getValue() {
        return ((vv91) pv91.r(this.c, this)).c;
    }

    @Override // p.ven0
    public final Object h() {
        return getValue();
    }

    @Override // p.ypb1
    public final cqb1 k() {
        return this.c;
    }

    @Override // p.ypb1
    public final void l(cqb1 cqb1Var) {
        this.c = (vv91) cqb1Var;
    }

    @Override // p.ypb1
    public final cqb1 n(cqb1 cqb1Var, cqb1 cqb1Var2, cqb1 cqb1Var3) {
        if (this.b.x(((vv91) cqb1Var2).c, ((vv91) cqb1Var3).c)) {
            return cqb1Var2;
        }
        return null;
    }

    @Override // p.ven0
    public final void setValue(Object obj) {
        jv91 jv91VarH;
        vv91 vv91Var = (vv91) pv91.f(this.c);
        if (this.b.x(vv91Var.c, obj)) {
            return;
        }
        vv91 vv91Var2 = this.c;
        synchronized (pv91.c) {
            jv91VarH = pv91.h();
            ((vv91) pv91.n(vv91Var2, this, jv91VarH, vv91Var)).c = obj;
        }
        pv91.l(jv91VarH, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((vv91) pv91.f(this.c)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        wv91 wv91VarG = g();
        if (wv91VarG.equals(f331.X0)) {
            i2 = 0;
        } else if (wv91VarG.equals(kcx0.R0)) {
            i2 = 1;
        } else {
            if (!wv91VarG.equals(c4x0.f)) {
                eg.m("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
