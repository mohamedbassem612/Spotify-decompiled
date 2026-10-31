package p;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.home.evopage.mobius.State;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xjr implements rjp0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xjr(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0165  */
    public final void b(Object obj) {
        Map mapD;
        SparseArray<Parcelable> sparseParcelableArray;
        chm0 model;
        List list;
        View viewC;
        byte b = this.a;
        lvf1 lvf1VarA = null;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((akr) obj2).l(((Number) obj).intValue());
                return;
            case 1:
                t2u t2uVar = (t2u) obj2;
                if (((iac0) obj) == null || !t2uVar.M1) {
                    return;
                }
                View viewQ0 = t2uVar.Q0();
                if (viewQ0.getParent() != null) {
                    eg.m("DialogFragment can not be attached to a container view");
                    return;
                } else {
                    if (t2uVar.Q1 != null) {
                        if (th30.P(3)) {
                            Objects.toString(t2uVar.Q1);
                        }
                        t2uVar.Q1.setContentView(viewQ0);
                        return;
                    }
                    return;
                }
            case 2:
                rnc0 rnc0Var = (rnc0) obj;
                el00 el00Var = (el00) obj2;
                tp60 tp60Var = el00Var.g;
                RecyclerView recyclerView = el00Var.T0;
                tj00 tj00Var = el00Var.c;
                tp60Var.n(tj00Var.Z0);
                wo60 wo60Var = tj00Var.h;
                wo60Var.i();
                wo60Var.m();
                el00Var.U0.setRefreshing(false);
                w25 w25Var = el00Var.S0;
                if (!w25Var.d0()) {
                    el00Var.t.e().getLifecycle().a(new rjd(el00Var, (byte) 3));
                }
                if (el00Var.X0 == null) {
                    t3x t3xVar = new t3x(el00Var, rnc0Var, (byte) 22);
                    if (!w25Var.c() || recyclerView.isLaidOut()) {
                        t3xVar.invoke();
                        return;
                    } else {
                        recyclerView.post(new g54(t3xVar, (byte) 7));
                        return;
                    }
                }
                rnc0Var.getClass();
                Bundle bundle = el00Var.X0;
                int i = bundle != null ? bundle.getInt("viewDataHoldersSize", 0) : 0;
                State state = (State) tj00Var.Q0.e();
                if (state != null) {
                    State.Content content = state instanceof State.Content ? (State.Content) state : null;
                    if (content != null && (model = content.getModel()) != null && (list = model.a) != null) {
                        list.size();
                    }
                }
                List list2 = rnc0Var.b;
                list2.size();
                if (i - 5 <= list2.size()) {
                    Bundle bundle2 = el00Var.X0;
                    el00Var.X0 = null;
                    if (el00Var.P0) {
                        qe91 qe91Var = (qe91) el00Var.R0.f.getValue();
                        mapD = qe91Var != null ? qe91Var.d() : null;
                        if (mapD == null) {
                            mapD = b7x.a;
                        }
                    } else {
                        mapD = b7x.a;
                    }
                    el00Var.b(mapD);
                    dq60 dq60Var = tj00Var.Z0;
                    boolean zF = tp60Var.f(dq60Var);
                    try {
                        el00Var.W0.b(rnc0Var);
                        if (zF) {
                            tp60Var.a(dq60Var);
                        }
                        int size = list2.size() + (el00Var.i ? 1 : 0);
                        z511 adapter = recyclerView.getAdapter();
                        if (adapter != null) {
                            t3p1.A(new t3x(el00Var, bundle2, (byte) 21), new uv4(size, (byte) 27), adapter);
                            return;
                        }
                        if (bundle2 != null && (sparseParcelableArray = bundle2.getSparseParcelableArray("view_state")) != null) {
                            recyclerView.restoreHierarchyState(sparseParcelableArray);
                        }
                        ((bpb1) el00Var.Q0).m(null, Boolean.TRUE);
                        return;
                    } catch (Throwable th) {
                        if (!zF) {
                            throw th;
                        }
                        tp60Var.a(dq60Var);
                        throw th;
                    }
                }
                return;
            case 3:
                vmc1 vmc1Var = (vmc1) obj;
                if (vmc1Var == null) {
                    return;
                }
                dxy.n((dxy) obj2, vmc1Var.a);
                return;
            case 4:
                ((ssw0) obj2).l((dbr0) obj);
                return;
            case 5:
                air0 air0Var = (air0) obj2;
                if (((l3r) obj) != l3r.c || (viewC = air0Var.c()) == null) {
                    return;
                }
                if (viewC.isAttachedToWindow()) {
                    aiq0.a(viewC, new aih0(viewC, air0Var, false, (byte) 9));
                    return;
                } else {
                    viewC.addOnAttachStateChangeListener(new vgu(viewC, viewC, air0Var, (byte) 2));
                    return;
                }
            case 6:
                bn70 bn70Var = (bn70) obj;
                wh81 wh81Var = (wh81) obj2;
                if (bn70Var == null || u890.j(wh81Var.Z, bn70Var)) {
                    return;
                }
                if (wh81Var.Z != null && !u890.j(bn70Var.toString(), wh81Var.t) && !(wh81Var.P0 instanceof b6w0)) {
                    wh81Var.a.t();
                }
                wh81Var.Z = bn70Var;
                vh81 vh81Var = wh81Var.f;
                mma0 mma0Var = wh81.R0[1];
                m1q0 m1q0Var = (m1q0) vh81Var.a;
                if (m1q0Var != null) {
                    m1q0Var.f(String.valueOf(bn70Var).equals(wh81Var.t));
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                fai0 fai0Var = (fai0) obj2;
                lvf1 lvf1Var = (lvf1) fai0Var.e();
                if (lvf1Var != null) {
                    bool.getClass();
                    lvf1VarA = lvf1.a(lvf1Var, bool.booleanValue(), false, false, false, false, 30);
                }
                fai0Var.m(lvf1VarA);
                return;
        }
    }
}
