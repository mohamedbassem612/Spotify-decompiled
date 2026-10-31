package p;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class obb0 extends t2u implements jik1, ug30, o6r0, DialogInterface.OnClickListener {
    public final bf70 V1;
    public o3n0 W1;
    public zg30 X1;

    public obb0(bf70 bf70Var) {
        this.V1 = bf70Var;
    }

    @Override // p.ug30
    public final String A(Context context) {
        return "";
    }

    public final void G0() {
        super.G0();
        o3n0 o3n0Var = this.W1;
        if (o3n0Var != null) {
            o3n0Var.b();
        } else {
            u890.C("ubiLogger");
            throw null;
        }
    }

    @Override // p.fn10
    public final gn10 Q() {
        return mno1.w;
    }

    @Override // p.lir0
    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return nhc.o(yon1.p2(), nik1.O0.a());
    }

    public final Dialog c1(Bundle bundle) {
        LayoutInflater layoutInflaterB0 = ((zf30) this).o1;
        if (layoutInflaterB0 == null) {
            layoutInflaterB0 = B0((Bundle) null);
            ((zf30) this).o1 = layoutInflaterB0;
        }
        this.X1 = zg30.b(layoutInflaterB0);
        uh3 uh3Var = new uh3(P0(), 2132018150);
        zg30 zg30Var = this.X1;
        if (zg30Var != null) {
            return uh3Var.setView(zg30Var.a()).setPositiveButton(2131958992, this).create();
        }
        u890.C("viewBinding");
        throw null;
    }

    @Override // p.o6r0
    public final n6r0 e() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.p2();
    }

    @Override // p.jik1
    public final lik1 getViewUri() {
        return nik1.O0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i != -1) {
            hhg1.n("Unsupported dialog button");
            return;
        }
        o3n0 o3n0Var = this.W1;
        if (o3n0Var == null) {
            u890.C("ubiLogger");
            throw null;
        }
        o3n0Var.a();
        Z0(false, false);
    }

    @Override // p.ug30
    public final String s() {
        return "settings-languages-music";
    }

    public final void v0(Context context) {
        this.V1.f(this);
        super.v0(context);
    }

    public final void w0(Bundle bundle) {
        super.w0(bundle);
        ((t2u) this).L1 = false;
        Dialog dialog = ((t2u) this).Q1;
        if (dialog != null) {
            dialog.setCancelable(false);
        }
    }
}
