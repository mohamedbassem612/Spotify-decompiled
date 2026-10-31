package p;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oie0 extends x7e0 implements b031 {
    public xab1 X;
    public xab1 Y;
    public final tso d;
    public final whe0 e;
    public final l6s f;
    public final boe0 g;
    public final llm h = smo1.g();
    public final bpb1 i;
    public final xe01 t;

    public oie0(tso tsoVar, whe0 whe0Var, l6s l6sVar, boe0 boe0Var) {
        sie0 sie0Var;
        this.d = tsoVar;
        this.e = whe0Var;
        this.f = l6sVar;
        this.g = boe0Var;
        mvb1 mvb1Var = tsoVar.c;
        xne0 xne0Var = mvb1Var instanceof xne0 ? (xne0) mvb1Var : null;
        if (xne0Var == null) {
            sie0Var = new sie0(null, 31);
        } else {
            String str = xne0Var.a;
            sie0Var = (str == null || ihc1.y0(str)) ? new sie0(null, 27) : new sie0(new rne0(str, xne0Var.b), 26);
        }
        bpb1 bpb1VarB = gio1.b(sie0Var);
        this.i = bpb1VarB;
        this.t = d5p1.h(bpb1VarB);
    }

    public final void a(Bundle bundle) {
        bpb1 bpb1Var;
        Object value;
        rie0 parcelable = bundle.getParcelable("location-ui-state");
        if (parcelable != null) {
            do {
                bpb1Var = this.i;
                value = bpb1Var.getValue();
            } while (!bpb1Var.k(value, sie0.a((sie0) value, parcelable.a, parcelable.b, parcelable.c, swc1.a, null, 16)));
            if (((x7e0) this).b.get() != w7e0.a) {
                l(parcelable.b);
            }
        }
    }

    public final void e() {
        j();
        i();
        p6d0 p6d0Var = new p6d0(this, (lnm) null, (byte) 10);
        llm llmVar = this.h;
        fn31.T(llmVar, (o8n) null, 0, p6d0Var, 3);
        fn31.T(llmVar, (o8n) null, 0, new dk6(this, null), 3);
        l(((sie0) this.i.getValue()).b);
    }

    public final void f() {
        bpb1 bpb1Var;
        Object value;
        sie0 sie0VarA;
        op71.q(this.h.a, (CancellationException) null);
        this.X = null;
        this.Y = null;
        do {
            bpb1Var = this.i;
            value = bpb1Var.getValue();
            sie0VarA = (sie0) value;
            if (sie0VarA.c == 2) {
                sie0VarA = sie0.a(sie0VarA, null, null, 1, null, null, 27);
            }
        } while (!bpb1Var.k(value, sie0VarA));
    }

    public final void k(iu30 iu30Var, boolean z) {
        xab1 xab1Var = this.X;
        if (xab1Var == null || !xab1Var.isActive()) {
            lnm lnmVar = null;
            if (z) {
                boe0 boe0Var = this.g;
                i8h1 i8h1Var = (i8h1) boe0Var.a.get();
                x6h1 x6h1VarC = boe0Var.b.b.c();
                x6h1VarC.i.add(new a7h1("location_preview", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("current_location_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                b7x b7xVar = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
            }
            xab1 xab1VarT = fn31.T(this.h, (o8n) null, 2, new og5((Object) this, (Object) iu30Var, lnmVar, (byte) 25), 1);
            this.X = xab1VarT;
            xab1VarT.start();
        }
    }

    public final void l(String str) {
        xab1 xab1Var = this.Y;
        lnm lnmVar = null;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        if (str.length() == 0) {
            return;
        }
        this.Y = fn31.T(this.h, (o8n) null, 0, new m2a0(this, str, lnmVar, (byte) 16), 3);
    }

    public final void m(aoe0 aoe0Var, boolean z) {
        bpb1 bpb1Var;
        Object value;
        sie0 sie0Var;
        ArrayList arrayList;
        xab1 xab1Var;
        xab1 xab1Var2 = this.X;
        if (xab1Var2 != null) {
            xab1Var2.d((CancellationException) null);
        }
        this.X = null;
        if (z && (xab1Var = this.Y) != null) {
            xab1Var.d((CancellationException) null);
        }
        do {
            bpb1Var = this.i;
            value = bpb1Var.getValue();
            sie0Var = (sie0) value;
            List listM = p7h.M(new String[]{aoe0Var.a, aoe0Var.b});
            arrayList = new ArrayList();
            for (Object obj : listM) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
        } while (!bpb1Var.k(value, sie0.a(sie0Var, new rne0(o7h.y0(arrayList, ", ", (String) null, (String) null, (iu30) null, 62), true), z ? "" : sie0Var.b, 3, z ? swc1.a : sie0Var.d, null, 16)));
        fn31.T(this.h, (o8n) null, 0, new nie0(this, aoe0Var, null, (byte) 1), 3);
    }

    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        bpb1 bpb1Var = this.i;
        bundle.putParcelable("location-ui-state", new rie0(((sie0) bpb1Var.getValue()).a, ((sie0) bpb1Var.getValue()).b, ((sie0) bpb1Var.getValue()).c == 2 ? 1 : ((sie0) bpb1Var.getValue()).c));
        return bundle;
    }
}
