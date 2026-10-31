package p;

import android.view.View;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Action;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tzx implements Action {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public /* synthetic */ tzx(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public final void run() {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                tqw tqwVar = (tqw) this.d;
                ngm ngmVar = (ngm) obj2;
                PlayerState playerState = ngmVar.b;
                boolean zC = o4p1.C(playerState);
                vzx vzxVar = (vzx) this.c;
                lik1 lik1Var = (lik1) vzxVar.g;
                if (!zC) {
                    boolean zBooleanValue = ((Boolean) ((iu30) vzxVar.Z).invoke((PlayerState) this.f)).booleanValue();
                    tv80 tv80VarD = cvl1.d(tqwVar);
                    ((cmf1) vzxVar.Y).a(ngmVar, (pdm) obj, zBooleanValue, tv80VarD);
                } else {
                    tv80 tv80VarD2 = cvl1.d(tqwVar);
                    eoc0 eoc0Var = new eoc0(playerState.contextUri(), lik1Var, mno1.o0);
                    if (!vzxVar.d) {
                        mfm mfmVarA = ((i4q) vzxVar.t).a(lik1Var);
                        Observable observableA = ((ywc0) vzxVar.h).a(eoc0Var);
                        AtomicReferenceArray atomicReferenceArray = p6r0.e;
                        mfm.b(mfmVarA, observableA, yon1.G1("CONTEXTMENU_DJNARRATION", "contextmenu/djnarration", 425, "contextmenu"), (bjm) null, tv80VarD2, 20);
                    } else {
                        ((yhm) vzxVar.X).a(eoc0Var, tv80VarD2);
                    }
                }
                break;
            default:
                kt91 kt91Var = (kt91) obj2;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131960399});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                er91 er91Var = new er91((fs91) null, "", 2131960399, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
                if (((rh4) obj).b()) {
                    kt91Var.a(new z3h(this, (byte) 2));
                }
                if (!kt91Var.g()) {
                    kt91Var.o(er91Var);
                } else {
                    kt91Var.k(er91Var);
                }
                break;
        }
    }
}
