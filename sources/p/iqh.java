package p;

import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.userinteractivityservice.usercomments.v1.proto.Comment;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class iqh implements Connectable, x9k1 {
    public static final List P0 = p7h.M(new blc0[]{blc0.ld, blc0.Pg});
    public long N0;
    public final ConstraintLayout O0;
    public final e93 X;
    public final ogh Y;
    public final ku1 Z;
    public final yqg a;
    public final bqh b;
    public final jqh c;
    public final kt91 d;
    public final cwe1 e;
    public final String f;
    public final boolean g;
    public final kph h;
    public final ku1 i;
    public final cce t;

    public iqh(yqg yqgVar, bqh bqhVar, jqh jqhVar, kt91 kt91Var, cwe1 cwe1Var, String str, boolean z, kph kphVar, ku1 ku1Var, cce cceVar, e93 e93Var, ogh oghVar, ku1 ku1Var2, qph qphVar) {
        cce cceVar2 = (cce) e93Var.Q0;
        ConstraintLayout constraintLayout = (ConstraintLayout) cceVar2.b;
        this.a = yqgVar;
        this.b = bqhVar;
        this.c = jqhVar;
        this.d = kt91Var;
        this.e = cwe1Var;
        this.f = str;
        this.g = z;
        this.h = kphVar;
        this.i = ku1Var;
        this.t = cceVar;
        this.X = e93Var;
        this.Y = oghVar;
        this.Z = ku1Var2;
        String str2 = qphVar.f;
        rph rphVar = qphVar.h;
        rph rphVar2 = rphVar == null ? new rph(str2, qphVar.e, qphVar.i) : rphVar;
        String str3 = (String) qphVar.c.f.get(str2);
        kphVar.N0().runOnUiThread(new xwn1(kphVar, new cqh(Mobius.b(Mobius.d(nph.a, RxConnectables.a(qphVar.b.a(this, qphVar.g, str2))).h(qphVar.d.x(str2)).d(new oph(qphVar)).b(new pph(qphVar)), rph.a(rphVar2, null, null, null, null, null, null, null, str3 == null ? "" : str3, false, null, null, null, false, null, null, null, null, false, 524031), mph.a, MainThreadWorkRunner.a()), this), (byte) 12));
        ((ComposeView) e93Var.N0).setContent(tdi.b);
        ((ComposeView) cceVar2.c).setContent(tdi.d);
        ((jgh) e93Var.e).a.setVisibility(8);
        constraintLayout.setVisibility(8);
        ((TextView) e93Var.O0).setText(jqhVar.b);
        constraintLayout.setOnTouchListener(new kgh((byte) 4));
        ((i8h1) cceVar.b).f(((gxk0) cceVar.d).e(), (Set) null);
        k3s itemAnimator = ((RecyclerView) e93Var.R0).getItemAnimator();
        if (itemAnimator != null) {
            ((zw81) itemAnimator).g = false;
        }
        this.O0 = (ConstraintLayout) e93Var.b;
    }

    public static ArrayList a(uge1 uge1Var) {
        List list = uge1Var.a;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Comment) it.next()).r());
        }
        return arrayList;
    }

    public final Connection L(Consumer consumer) {
        cn cnVar = new cn(this.Z, consumer, (byte) 29);
        final Connection connectionL = this.i.L(new y11(cnVar, (byte) 4));
        PublishSubject publishSubject = new PublishSubject();
        final byte b = 0;
        Disposable disposableSubscribe = publishSubject.distinctUntilChanged().subscribe(new io.reactivex.rxjava3.functions.Consumer() { // from class: p.hqh
            public final void accept(Object obj) {
                byte b2 = b;
                Connection connection = connectionL;
                switch (b2) {
                    case 0:
                        connection.accept((ukh) obj);
                        break;
                    default:
                        connection.accept(obj);
                        break;
                }
            }
        });
        Connection connectionL2 = this.Y.L(consumer);
        e93 e93Var = this.X;
        ((EncoreButton) e93Var.d).setOnClickListener(new fqh(this, consumer, (byte) 0));
        ((EncoreButton) e93Var.U0).setOnClickListener(new fqh(this, consumer, (byte) 1));
        ((EncoreButton) e93Var.c).setOnClickListener(new fqh(this, consumer, (byte) 2));
        return new gqh(this, (ngh) connectionL2, publishSubject, disposableSubscribe, connectionL, cnVar);
    }

    public final void c(s9k1 s9k1Var) {
        e93 e93Var = this.X;
        jgh jghVar = (jgh) e93Var.e;
        if (s9k1Var.equals(l8k1.a)) {
            this.h.Y0();
            return;
        }
        if (s9k1Var instanceof n8k1) {
            n8k1 n8k1Var = (n8k1) s9k1Var;
            jghVar.d.setText(n8k1Var.a);
            jghVar.d.setSelection(n8k1Var.b);
            return;
        }
        if (s9k1Var.equals(l9k1.a)) {
            if (jghVar.a.getVisibility() == 0) {
                this.Y.a();
                return;
            } else {
                this.N0 = this.a.b();
                return;
            }
        }
        if (s9k1Var instanceof n9k1) {
            this.d.n(new er91((fs91) null, ((n9k1) s9k1Var).a, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false), (CoordinatorLayout) e93Var.V0);
        } else {
            if (!s9k1Var.equals(r9k1.a)) {
                eg.o();
                return;
            }
            kjh kjhVar = ((vlh) this.i.b).a;
            zl7 zl7Var = kjhVar.O0;
            RecyclerView recyclerView = kjhVar.Q0;
            if (recyclerView != null) {
                recyclerView.p0(kjhVar.N0);
                recyclerView.p0(zl7Var);
                recyclerView.m(zl7Var);
            }
        }
    }

    public final View getRoot() {
        return this.O0;
    }
}
