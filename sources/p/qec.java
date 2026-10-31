package p;

import android.os.Bundle;
import com.spotify.wrapped.v1.proto.Action;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qec implements eec {
    public final /* synthetic */ Action a;
    public final /* synthetic */ int b;
    public final /* synthetic */ rec c;
    public final /* synthetic */ String d;

    public qec(Action action, int i, rec recVar, String str) {
        this.a = action;
        this.b = i;
        this.c = recVar;
        this.d = str;
    }

    @Override // p.eec
    public final void a() {
        tv80 tv80VarM;
        rec recVar = this.c;
        mub mubVar = recVar.d;
        Action action = this.a;
        int iN = action.n();
        int i = iN == 0 ? -1 : pec.a[l1d.C(iN)];
        if (i != 1) {
            b7x b7xVar = b7x.a;
            String str = this.d;
            if (i == 2) {
                int iC = l1d.C(this.b);
                if (iC == 0) {
                    hp80 hp80VarB = recVar.b();
                    String strO = action.p().o();
                    i8h1 i8h1Var = mubVar.c;
                    opl0 opl0VarA = mubVar.a(str, hp80VarB);
                    x6h1 x6h1VarC = opl0VarA.c.c();
                    x6h1VarC.i.add(new a7h1("center_button", "navigate", (Integer) null, (String) null, "not_saved"));
                    x6h1VarC.j = true;
                    tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strO)), x6h1VarC.a(), opl0VarA.b, System.currentTimeMillis()), (xj61) null);
                } else if (iC != 1) {
                    eg.o();
                    return;
                } else {
                    qpj1 qpj1Var = recVar.c;
                    tv80VarM = bcl1.f((bcl1) qpj1Var.c, qpj1Var.p(), str, (String) null, (String) null, new bek1(action.p().o(), (byte) 16), 12);
                }
                Set set = s4b1.f;
                if (uic.u(action.p().o())) {
                    recVar.a.a(action.p().o(), tv80VarM, (Bundle) null);
                    return;
                } else {
                    bhn0.B(action.p().o(), "Invalid Spotify URI: ");
                    return;
                }
            }
            if (i != 3) {
                if (i != 4) {
                    k220.f("Unexpected action type: ".concat(x0d.y(action.n())));
                    return;
                }
                hp80 hp80VarB2 = recVar.b();
                i8h1 i8h1Var2 = mubVar.c;
                opl0 opl0VarA2 = mubVar.a(str, hp80VarB2);
                x6h1 x6h1VarC2 = opl0VarA2.c.c();
                x6h1VarC2.i.add(new a7h1("center_button", "navigate_to_next", (Integer) null, (String) null, "not_saved"));
                x6h1VarC2.j = true;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("skip_to_next", 2, sqg0.J(new mmr0[]{new mmr0("item_to_be_skipped", str), new mmr0("position_ms", ""), new mmr0("total_content_ms", "")})), x6h1VarC2.a(), opl0VarA2.b, System.currentTimeMillis()), (xj61) null);
                recVar.h.k();
                return;
            }
            o0i o0iVar = (o0i) recVar.e.c.getValue();
            if (o0iVar != null) {
                hp80 hp80Var = o0iVar.e;
                String playlistUri = action.q().getPlaylistUri();
                i8h1 i8h1Var3 = mubVar.c;
                opl0 opl0VarA3 = mubVar.a(str, hp80Var);
                x6h1 x6h1VarC3 = opl0VarA3.c.c();
                x6h1VarC3.i.add(new a7h1("center_button", "save", (Integer) null, (String) null, "not_saved"));
                x6h1VarC3.j = true;
                i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("follow", 1, Collections.singletonMap("item_to_be_followed", playlistUri)), x6h1VarC3.a(), opl0VarA3.b, System.currentTimeMillis()), (xj61) null);
                fn31.T(o0iVar.a, (o8n) null, 0, new oec(recVar, action, null), 3);
            }
        }
    }
}
