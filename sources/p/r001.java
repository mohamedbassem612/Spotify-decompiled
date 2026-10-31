package p;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r001 extends dwb implements f601 {
    public final c1y0 V1;
    public umq W1;
    public zmq X1;
    public g601 Y1;
    public pux0 Z1;
    public txz0 a2;
    public i8h1 b2;
    public l6h1 c2;
    public MobiusLoop.Controller d2;
    public BottomSheetBehavior e2;
    public String f2;
    public String g2;

    public r001(c1y0 c1y0Var) {
        this.V1 = c1y0Var;
    }

    public final void F0(Bundle bundle) {
        super/*p.t2u*/.F0(bundle);
        String str = this.g2;
        if (str == null) {
            u890.C("entityId");
            throw null;
        }
        bundle.putString("reactions-sheet-entity-id", str);
        String str2 = this.f2;
        if (str2 == null) {
            u890.C("parentEntityUri");
            throw null;
        }
        bundle.putString("reactions-sheet-parent-entity-uri", str2);
        MobiusLoop.Controller controller = this.d2;
        if (controller == null || !((o501) controller.a()).b()) {
            return;
        }
        MobiusLoop.Controller controller2 = this.d2;
        if (controller2 != null) {
            bundle.putParcelable("reactions-sheet-mobius-model", (Parcelable) controller2.a());
        } else {
            u890.C("controller");
            throw null;
        }
    }

    public final int b1() {
        return 2132017792;
    }

    public final Dialog c1(Bundle bundle) {
        cwb cwbVar = new cwb(P0(), 2132017792);
        cwbVar.setOnShowListener(new l1r0(this, (byte) 1));
        return cwbVar;
    }

    public final frd1 i1() {
        String str = this.f2;
        if (str == null) {
            u890.C("parentEntityUri");
            throw null;
        }
        String str2 = this.g2;
        if (str2 != null) {
            return new frd1(str2, str);
        }
        u890.C("entityId");
        throw null;
    }

    public final void v0(Context context) {
        this.V1.f(this);
        super/*p.t2u*/.v0(context);
    }

    public final void w0(Bundle bundle) {
        super/*p.t2u*/.w0(bundle);
        if (bundle != null) {
            String string = bundle.getString("reactions-sheet-entity-id");
            if (string == null) {
                eg.m("Missing entity ID in saved state");
                return;
            }
            this.g2 = string;
            String string2 = bundle.getString("reactions-sheet-parent-entity-uri");
            if (string2 != null) {
                this.f2 = string2;
            } else {
                eg.m("Missing parent entity URI in saved state");
            }
        }
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        o501 o501Var;
        pux0 pux0Var = this.Z1;
        if (pux0Var == null) {
            u890.C("reactionsBottomSheetLogger");
            throw null;
        }
        pux0Var.m();
        txz0 txz0Var = this.a2;
        if (txz0Var == null) {
            u890.C("reactionDataResolver");
            throw null;
        }
        sxz0 sxz0VarA = txz0Var.a(i1());
        if (sxz0VarA == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        umq umqVar = this.W1;
        if (umqVar == null) {
            u890.C("effectHandlerFactory");
            throw null;
        }
        o401 o401VarA = umqVar.a(i1(), this, sxz0VarA);
        if (bundle == null || !bundle.containsKey("reactions-sheet-mobius-model") || (o501Var = (o501) bundle.getParcelable("reactions-sheet-mobius-model")) == null) {
            o501Var = new o501(sxz0VarA.c());
        }
        zmq zmqVar = this.X1;
        if (zmqVar == null) {
            u890.C("mobiusInjectorFactory");
            throw null;
        }
        this.d2 = zmqVar.a(o501Var, o401VarA).a();
        anq anqVar = this.Y1;
        if (anqVar == null) {
            u890.C("viewsFactory");
            throw null;
        }
        Context contextP0 = P0();
        MobiusLoop.Controller controller = this.d2;
        if (controller != null) {
            return anqVar.a(sxz0VarA, contextP0, controller, this, i1(), bundle != null, new fbz0(this, (byte) 17)).getRoot();
        }
        u890.C("controller");
        throw null;
    }

    public final void y0() {
        ((zf30) this).h1 = true;
        pux0 pux0Var = this.Z1;
        if (pux0Var != null) {
            pux0Var.l();
        } else {
            u890.C("reactionsBottomSheetLogger");
            throw null;
        }
    }
}
