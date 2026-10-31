package p;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kph extends dwb {
    public final lpd V1;
    public vlh W1;
    public o6p X1;
    public p6p Y1;
    public s6p Z1;
    public t6p a2;
    public u6p b2;
    public v6p c2;
    public bqh d2;
    public iqh e2;
    public String f2;
    public lik1 g2;
    public boolean h2;
    public njb0 i2;
    public boolean j2;
    public final PublishSubject k2 = new PublishSubject();

    public kph(lpd lpdVar) {
        this.V1 = lpdVar;
    }

    public final void F0(Bundle bundle) {
        super/*p.t2u*/.F0(bundle);
        bundle.putString("comments_sheet_entity_uri", i1());
        lik1 lik1Var = this.g2;
        if (lik1Var != null) {
            bundle.putParcelable("comments_sheet_view_uri", lik1Var);
        } else {
            u890.C("viewUri");
            throw null;
        }
    }

    public final void G0() {
        super/*p.t2u*/.G0();
        ((ViewGroup) Q0().getParent()).getLayoutParams().height = -1;
    }

    public final int b1() {
        return 2132017481;
    }

    public final Dialog c1(Bundle bundle) {
        Dialog dialogC1 = super.c1(bundle);
        dialogC1.setTitle(dialogC1.getContext().getString(2131954139));
        return dialogC1;
    }

    public final String i1() {
        String str = this.f2;
        if (str != null) {
            return str;
        }
        u890.C("entityUri");
        throw null;
    }

    public final void v0(Context context) {
        this.V1.f(this);
        super/*p.t2u*/.v0(context);
    }

    public final void w0(Bundle bundle) {
        super/*p.t2u*/.w0(bundle);
        if (bundle == null) {
            bqh bqhVar = this.d2;
            if (bqhVar != null) {
                bqhVar.a();
                return;
            } else {
                u890.C("commentsSheetStateStorage");
                throw null;
            }
        }
        if (bundle.containsKey("comments_sheet_entity_uri") && bundle.containsKey("comments_sheet_view_uri")) {
            String string = bundle.getString("comments_sheet_entity_uri");
            string.getClass();
            this.f2 = string;
            Parcelable parcelable = bundle.getParcelable("comments_sheet_view_uri");
            parcelable.getClass();
            this.g2 = (lik1) parcelable;
        }
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        rph rphVarB;
        u6p u6pVar = this.b2;
        if (u6pVar == null) {
            u890.C("loggerFactory");
            throw null;
        }
        cce cceVarA = u6pVar.a(i1());
        e93 e93VarB = e93.b(layoutInflater);
        s6p s6pVar = this.Z1;
        if (s6pVar == null) {
            u890.C("inputConnectableFactory");
            throw null;
        }
        ogh oghVarA = s6pVar.a((jgh) e93VarB.e, cceVarA, i1());
        if (bundle != null) {
            bqh bqhVar = this.d2;
            if (bqhVar == null) {
                u890.C("commentsSheetStateStorage");
                throw null;
            }
            rphVarB = bqhVar.b(i1());
        } else {
            rphVarB = null;
        }
        p6p p6pVar = this.Y1;
        if (p6pVar == null) {
            u890.C("mobiusInjectorFactory");
            throw null;
        }
        njb0 njb0Var = this.i2;
        String strI1 = i1();
        lik1 lik1Var = this.g2;
        if (lik1Var == null) {
            u890.C("viewUri");
            throw null;
        }
        o6p o6pVar = this.X1;
        if (o6pVar == null) {
            u890.C("eventSourcesFactory");
            throw null;
        }
        qph qphVarA = p6pVar.a(o6pVar.a(this.k2), njb0Var, strI1, lik1Var, rphVarB, this.j2);
        v6p v6pVar = this.c2;
        if (v6pVar == null) {
            u890.C("viewsFactory");
            throw null;
        }
        String strI2 = i1();
        vlh vlhVar = this.W1;
        if (vlhVar == null) {
            u890.C("commentsListFactory");
            throw null;
        }
        RecyclerView recyclerView = (RecyclerView) e93VarB.R0;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.setAdapter(vlhVar.a);
        recyclerView.j(vlhVar.b);
        ku1 ku1Var = new ku1(vlhVar, (byte) 5);
        if (this.a2 == null) {
            u890.C("listEventConnectableFactory");
            throw null;
        }
        this.e2 = v6p.a(v6pVar, strI2, this, ku1Var, cceVarA, qphVarA, e93VarB, oghVarA, t6p.a(cceVarA), this.h2);
        this.i2 = null;
        BottomSheetBehavior bottomSheetBehaviorG = ((t2u) this).Q1.g();
        bottomSheetBehaviorG.L(3);
        bottomSheetBehaviorG.J(0);
        bottomSheetBehaviorG.t(new jph(this, (byte) 0));
        iqh iqhVar = this.e2;
        if (iqhVar != null) {
            return iqhVar.getRoot();
        }
        u890.C("views");
        throw null;
    }
}
