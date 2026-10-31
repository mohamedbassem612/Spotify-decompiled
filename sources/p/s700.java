package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s700 extends dwb {
    public final nay V1;
    public ypa W1;
    public otu X1;
    public uny Y1;
    public r800 Z1;
    public final f72 a2 = new f72(this, (byte) 19);

    public s700(nay nayVar) {
        this.V1 = nayVar;
    }

    public final void I0(View view, Bundle bundle) {
        r800 r800Var = this.Z1;
        if (r800Var != null) {
            Consumer consumerA = r800Var.a();
            uny unyVar = this.Y1;
            if (unyVar == null) {
                u890.C("viewBinder");
                throw null;
            }
            unyVar.d(this.a2, consumerA);
        }
        uny unyVar2 = this.Y1;
        if (unyVar2 != null) {
            unyVar2.E(this.Z1);
        } else {
            u890.C("viewBinder");
            throw null;
        }
    }

    public final int b1() {
        return 2132018427;
    }

    public final void v0(Context context) {
        this.V1.f(this);
        super/*p.t2u*/.v0(context);
    }

    public final void w0(Bundle bundle) {
        super/*p.t2u*/.w0(bundle);
        if (bundle != null) {
            dismiss();
        }
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.W1 == null) {
            u890.C("eventBottomSheetViewFactory");
            throw null;
        }
        u800 u800VarM = ypa.m(layoutInflater, viewGroup);
        otu otuVar = this.X1;
        if (otuVar == null) {
            u890.C("eventBottomSheetViewBinderFactory");
            throw null;
        }
        uny unyVarD = otuVar.d(u800VarM);
        this.Y1 = unyVarD;
        return unyVarD.t();
    }
}
