package p;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n4f extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p4f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n4f(p4f p4fVar, byte b) {
        super(3);
        this.a = b;
        this.b = p4fVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        byte b = this.a;
        p4f p4fVar = this.b;
        switch (b) {
            case 0:
                m4f m4fVar = (m4f) obj;
                tqw tqwVar = (tqw) obj3;
                String str = p4fVar.a;
                if (m4fVar instanceof i4f) {
                    tte tteVar = (tte) p4fVar.c.get();
                    Set set = s4b1.f;
                    String strB = pcf.b(uic.x(str));
                    if (strB == null) {
                        hhg1.o(str, "Chat id cannot be empty. Uri was ");
                        return null;
                    }
                    tteVar.a(strB, ((i4f) m4fVar).c, p4fVar.a, cvl1.d(tqwVar), true, true, true, true);
                } else if (m4fVar instanceof h4f) {
                    Set set2 = s4b1.f;
                    h4f h4fVar = (h4f) m4fVar;
                    String strH = pcf.h(uic.C(h4fVar.c, (String) null));
                    if (strH == null) {
                        hhg1.n("Required value was null.");
                        return null;
                    }
                    a1r0.j(p4fVar.b, h4fVar.e, cvl1.d(tqwVar).a.a, mno1.h(new mmr0[]{new mmr0("OnPlatformShareData", new g7q0(strH)), new mmr0("preSelectedUsers", Collections.singletonList(h4fVar.d.a))}), false, 8);
                } else if (m4fVar instanceof j4f) {
                    rj50 rj50Var = (rj50) p4fVar.d.get();
                    Set set3 = s4b1.f;
                    String strB2 = pcf.b(uic.x(str));
                    String str2 = p4fVar.a;
                    if (strB2 == null) {
                        hhg1.o(str2, "Chat id cannot be empty. Uri was ");
                        return null;
                    }
                    j4f j4fVar = (j4f) m4fVar;
                    rj50Var.a(strB2, str2, j4fVar.c, j4fVar.d, cvl1.d(tqwVar));
                } else if (m4fVar instanceof k4f) {
                    ((k4f) m4fVar).e.invoke(cvl1.d(tqwVar));
                } else {
                    if (!(m4fVar instanceof l4f)) {
                        eg.o();
                        return null;
                    }
                    ((l4f) m4fVar).e.invoke();
                }
                return rih1.a;
            default:
                m4f m4fVar2 = (m4f) obj;
                idd1 idd1Var = p4fVar.g;
                idd1 idd1Var2 = p4fVar.f;
                boolean z = m4fVar2 instanceof h4f;
                b7x b7xVar = b7x.a;
                if (z) {
                    xuk0 xuk0Var = (xuk0) idd1Var2.getValue();
                    xuk0Var.getClass();
                    x6h1 x6h1VarC = xuk0Var.a.c();
                    x6h1VarC.i.add(new a7h1("create_group_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((h4f) m4fVar2).e)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
                }
                if (m4fVar2 instanceof i4f) {
                    xuk0 xuk0Var2 = (xuk0) idd1Var2.getValue();
                    xuk0Var2.getClass();
                    x6h1 x6h1VarC2 = xuk0Var2.a.c();
                    x6h1VarC2.i.add(new a7h1("more_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                } else if (m4fVar2 instanceof j4f) {
                    avk0 avk0Var = (avk0) idd1Var.getValue();
                    avk0Var.getClass();
                    x6h1 x6h1VarC3 = avk0Var.a.c();
                    x6h1VarC3.i.add(new a7h1("more_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(m4fVar2 instanceof k4f)) {
                        if (!(m4fVar2 instanceof l4f)) {
                            eg.o();
                            return null;
                        }
                        if (((l4f) m4fVar2).c) {
                            xuk0 xuk0Var3 = (xuk0) idd1Var2.getValue();
                            xuk0Var3.getClass();
                            x6h1 x6h1VarC4 = xuk0Var3.a.c();
                            x6h1VarC4.i.add(new a7h1("mute_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC4.j = false;
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{new mmr0("state_before_toggle", "muted"), new mmr0("state_after_toggle", "not_muted")})), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                        } else {
                            avk0 avk0Var2 = (avk0) idd1Var.getValue();
                            avk0Var2.getClass();
                            x6h1 x6h1VarC5 = avk0Var2.a.c();
                            x6h1VarC5.i.add(new a7h1("mute_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC5.j = false;
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{new mmr0("state_before_toggle", "muted"), new mmr0("state_after_toggle", "not_muted")})), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
                        }
                        return w7h1Var;
                    }
                    if (((k4f) m4fVar2).c) {
                        xuk0 xuk0Var4 = (xuk0) idd1Var2.getValue();
                        xuk0Var4.getClass();
                        x6h1 x6h1VarC6 = xuk0Var4.a.c();
                        x6h1VarC6.i.add(new a7h1("mute_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC6.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
                    } else {
                        avk0 avk0Var3 = (avk0) idd1Var.getValue();
                        avk0Var3.getClass();
                        x6h1 x6h1VarC7 = avk0Var3.a.c();
                        x6h1VarC7.i.add(new a7h1("mute_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC7.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis());
                    }
                }
                return w7h1Var2;
        }
    }
}
