package p;

import android.graphics.Color;
import com.google.protobuf.Any;
import com.spotify.base.java.logging.Logger;
import com.spotify.watchfeed.component.item.v1.BottomBarComponent;
import com.spotify.wrapped.v1.proto.Action;
import com.spotify.wrapped.v1.proto.Outline;
import com.spotify.wrapped.v1.proto.Paragraph;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mtb implements j0i {
    public final kly0 a;

    public mtb(jly0 jly0Var) {
        this.a = jly0Var;
    }

    public static long d(long j, String str) {
        try {
            return z4p1.e(Color.parseColor(str));
        } catch (Exception unused) {
            return j;
        }
    }

    public static gqb e(Outline outline) {
        if (((outline.p() == 0 || outline.n().length() <= 0) ? null : outline) != null) {
            try {
                return new gqb(z4p1.e(Color.parseColor(outline.n())), outline.p());
            } catch (Exception unused) {
                Logger.d(l1d.m("BottomBar: Failed to parse outline color: ", outline.n()), new Object[0]);
            }
        }
        return null;
    }

    @Override // p.j0i
    public final z0i a(Any any) {
        lfx0 lfx0Var;
        x50 w50Var;
        zd60 zd60Var;
        BottomBarComponent bottomBarComponentU = BottomBarComponent.u(any.q());
        if (bottomBarComponentU.t()) {
            String strP = bottomBarComponentU.q().p();
            long j = u7h.f;
            lfx0Var = new lfx0(d(j, strP), d(j, bottomBarComponentU.q().n()));
        } else {
            lfx0Var = null;
        }
        sdp0 sdp0Var = bottomBarComponentU.s() ? new sdp0(bottomBarComponentU.p().q(), bottomBarComponentU.p().n(), bottomBarComponentU.p().r(), d(u7h.f, bottomBarComponentU.p().s()), d(u7h.j, bottomBarComponentU.p().o()), bottomBarComponentU.p().v() ? e(bottomBarComponentU.p().u()) : null, bottomBarComponentU.p().hasLabel() ? bottomBarComponentU.p().t() : null) : null;
        h290 h290VarN = bottomBarComponentU.n();
        ArrayList arrayList = new ArrayList();
        for (Iterator it = h290VarN.iterator(); it.hasNext(); it = it) {
            BottomBarComponent.ActionItem actionItem = (BottomBarComponent.ActionItem) it.next();
            actionItem.getClass();
            int iP = actionItem.p();
            int i = iP == 0 ? -1 : ltb.a[l1d.C(iP)];
            if (i == 1) {
                w50Var = new w50(actionItem.n());
            } else if (i != 2) {
                w50Var = null;
            } else {
                String strS = actionItem.o().s();
                Action actionO = actionItem.o().o();
                String strN = actionItem.o().n();
                String strT = actionItem.o().t();
                long j2 = u7h.f;
                long jD = d(j2, strT);
                long jD2 = d(u7h.j, actionItem.o().p());
                gqb gqbVarE = actionItem.o().w() ? e(actionItem.o().u()) : null;
                Paragraph paragraphN = actionItem.r() ? actionItem.q().n() : null;
                if (actionItem.o().v()) {
                    BottomBarComponent.HighlightStyle highlightStyleR = actionItem.o().r();
                    zd60Var = new zd60(d(j2, highlightStyleR.n()), d(u7h.b, highlightStyleR.o()), highlightStyleR.r() ? e(highlightStyleR.q()) : null);
                } else {
                    zd60Var = null;
                }
                w50Var = new x50(strS, actionO, strN, jD, jD2, gqbVarE, paragraphN, zd60Var);
            }
            if (w50Var != null) {
                arrayList.add(w50Var);
            }
        }
        return new btb(lfx0Var, sdp0Var, arrayList, bottomBarComponentU.r() ? Long.valueOf(bottomBarComponentU.o()) : null);
    }

    @Override // p.j0i
    public final Class b() {
        return btb.class;
    }

    @Override // p.j0i
    public final o1i c() {
        return (o1i) this.a.get();
    }
}
