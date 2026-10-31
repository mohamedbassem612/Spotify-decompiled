package p;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lqa1 extends dwb {
    public final hq81 V1;
    public l6s W1;
    public sss X1;
    public mxr Y1;

    public lqa1(hq81 hq81Var) {
        this.V1 = hq81Var;
    }

    public final int b1() {
        return 2132017871;
    }

    public final Dialog c1(Bundle bundle) {
        cwb cwbVarC1 = super.c1(bundle);
        cwbVarC1.g().K(true);
        cwbVarC1.g().L(3);
        cwbVarC1.setOnShowListener(new l1r0(this, (byte) 2));
        return cwbVarC1;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        mxr mxrVar = this.Y1;
        if (mxrVar == null) {
            u890.C("ubiLogger");
            throw null;
        }
        mxrVar.y();
        super/*p.t2u*/.onDismiss(dialogInterface);
    }

    public final void v0(Context context) {
        this.V1.f(this);
        super/*p.t2u*/.v0(context);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l6s l6sVar = this.W1;
        if (l6sVar == null) {
            u890.C("viewBinderFactory");
            throw null;
        }
        mxr mxrVarJ = l6sVar.j(P0(), layoutInflater);
        sss sssVar = this.X1;
        if (sssVar == null) {
            u890.C("mobiusControllerProvider");
            throw null;
        }
        MobiusLoop.Controller controllerA = sssVar.a();
        fta1.a(controllerA, ((zf30) this).s1);
        controllerA.c(new mwa1(mxrVarJ));
        return mxrVarJ.r();
    }
}
