package p;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kvd0 extends t2u {
    public final c8d0 V1;
    public bgx W1;
    public tjq X1;
    public ptf1 Y1;
    public Function0 Z1;
    public qzh a2;

    public kvd0(c8d0 c8d0Var) {
        this.V1 = c8d0Var;
    }

    public final void G0() {
        super.G0();
        tjq tjqVar = this.X1;
        if (tjqVar == null) {
            u890.C("presenter");
            throw null;
        }
        qzh qzhVar = this.a2;
        if (qzhVar == null) {
            u890.C("dialogComponent");
            throw null;
        }
        lbc0 lbc0Var = new lbc0(qzhVar, (byte) 4);
        qzh qzhVar2 = this.a2;
        if (qzhVar2 != null) {
            tjqVar.t(lbc0Var, new lbc0(qzhVar2, (byte) 5));
        } else {
            u890.C("dialogComponent");
            throw null;
        }
    }

    public final void H0() {
        super.H0();
        tjq tjqVar = this.X1;
        if (tjqVar != null) {
            tjqVar.u();
        } else {
            u890.C("presenter");
            throw null;
        }
    }

    public final void I0(View view, Bundle bundle) {
        ptf1 ptf1Var = this.Y1;
        if (ptf1Var != null) {
            ptf1Var.o();
        } else {
            u890.C("impressionLogger");
            throw null;
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Function0 function0 = this.Z1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void v0(Context context) {
        this.V1.f(this);
        super.v0(context);
    }

    public final void w0(Bundle bundle) {
        super.w0(bundle);
        e1(0, 2132017702);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bgx bgxVar = this.W1;
        if (bgxVar == null) {
            u890.C("dialogComponentFactory");
            throw null;
        }
        ver verVarA = bgxVar.a((l0i) null);
        this.a2 = verVarA;
        return verVarA.getView();
    }
}
