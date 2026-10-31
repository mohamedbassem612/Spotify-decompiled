package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uqe0 {
    public static final uqe0 a = new uqe0();

    public static l7h1 a(String str, t3k1 t3k1Var) {
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-client-lock-state";
        x6h1VarI.f = "1.0.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.b = str;
        y6h1 y6h1VarA = x6h1VarI.a();
        List listSingletonList = Collections.singletonList("lockstate");
        if (t3k1Var instanceof iwq0) {
            x6h1 x6h1VarC = y6h1VarA.c();
            x6h1VarC.i.add(new a7h1("dialog", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = true;
            y6h1 y6h1VarA2 = x6h1VarC.a();
            k7h1 k7h1Var = new k7h1();
            ((xjn) k7h1Var).a = y6h1VarA2;
            ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
            k7h1Var.e = listSingletonList;
            return k7h1Var.a();
        }
        if (!(t3k1Var instanceof hwq0)) {
            if (t3k1Var instanceof jwq0) {
                return null;
            }
            eg.o();
            return null;
        }
        x6h1 x6h1VarC2 = y6h1VarA.c();
        x6h1VarC2.i.add(new a7h1("bottom_sheet", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = true;
        y6h1 y6h1VarA3 = x6h1VarC2.a();
        k7h1 k7h1Var2 = new k7h1();
        ((xjn) k7h1Var2).a = y6h1VarA3;
        ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var2.e = listSingletonList;
        return k7h1Var2.a();
    }

    public static tqe0 b(String str, are0 are0Var, czo1 czo1Var) {
        woe0 woe0Var;
        xoe0 xoe0Var = are0Var.a;
        iwq0 iwq0Var = are0Var.b;
        bqk0 bqk0Var = new bqk0(str, (byte) 25);
        if (czo1Var instanceof k50) {
            return new tqe0(null, null, null, null, new jgd0(new nqk0(bqk0Var, (short) 0), (byte) 17), 15);
        }
        String str2 = null;
        if (czo1Var instanceof r50) {
            iwq0 iwq0Var2 = iwq0Var instanceof iwq0 ? iwq0Var : null;
            if (iwq0Var2 != null) {
                swk0 swk0Var = new swk0(new rwk0(bqk0Var, (byte) 1), iwq0Var2.f);
                return new tqe0(null, new lbc0(1, swk0Var, swk0.class, "hitUiNavigate", "hitUiNavigate(Ljava/lang/String;)Lcom/spotify/ubi/android/eventdefinitions/UbiInteractionEvent;", 0, (byte) 16), new p350(0, swk0Var, swk0.class, "hitUiHide", "hitUiHide()Lcom/spotify/ubi/android/eventdefinitions/UbiInteractionEvent;", 0, (byte) 25), null, null, 25);
            }
        } else if (czo1Var instanceof s50) {
            iwq0 iwq0Var3 = iwq0Var instanceof iwq0 ? iwq0Var : null;
            if (iwq0Var3 != null) {
                return new tqe0(null, null, new p350(0, new twk0(new rwk0(bqk0Var, (byte) 1), iwq0Var3.g), twk0.class, "hitUiHide", "hitUiHide()Lcom/spotify/ubi/android/eventdefinitions/UbiInteractionEvent;", 0, (byte) 26), null, null, 27);
            }
        } else if (czo1Var instanceof l50) {
            hwq0 hwq0Var = iwq0Var instanceof hwq0 ? (hwq0) iwq0Var : null;
            if (hwq0Var != null) {
                ArrayList arrayList = hwq0Var.f;
                int i = ((l50) czo1Var).c;
                rvb rvbVar = (rvb) o7h.t0(i, arrayList);
                qwk0 qwk0Var = new qwk0(new rwk0(bqk0Var, (byte) 0), rvbVar != null ? rvbVar.b : null, Integer.valueOf(i));
                return new tqe0(null, new lbc0(1, qwk0Var, qwk0.class, "hitUiNavigate", "hitUiNavigate(Ljava/lang/String;)Lcom/spotify/ubi/android/eventdefinitions/UbiInteractionEvent;", 0, (byte) 17), new p350(0, qwk0Var, qwk0.class, "hitUiHide", "hitUiHide()Lcom/spotify/ubi/android/eventdefinitions/UbiInteractionEvent;", 0, (byte) 27), null, null, 25);
            }
        } else if (czo1Var instanceof q50) {
            kbh kbhVar = xoe0Var.b;
            kbh kbhVar2 = kbhVar instanceof kbh ? kbhVar : null;
            if (kbhVar2 != null) {
                wqk0 wqk0Var = new wqk0(bqk0Var.b(), (byte) 6);
                q50 q50Var = (q50) czo1Var;
                if (q50Var instanceof n50) {
                    nwk0 nwk0Var = new nwk0(wqk0Var, kbhVar2.e.d);
                    return new tqe0(null, new lbc0(1, nwk0Var, nwk0.class, "hitUiNavigate", "hitUiNavigate(Ljava/lang/String;)Lcom/spotify/ubi/android/eventdefinitions/UbiInteractionEvent;", 0, (byte) 12), new p350(0, nwk0Var, nwk0.class, "hitUiHide", "hitUiHide()Lcom/spotify/ubi/android/eventdefinitions/UbiInteractionEvent;", 0, (byte) 17), new p350(0, nwk0Var, nwk0.class, "hitUiReveal", "hitUiReveal()Lcom/spotify/ubi/android/eventdefinitions/UbiInteractionEvent;", 0, (byte) 18), null, 17);
                }
                if (q50Var instanceof o50) {
                    woe0 woe0Var2 = kbhVar2.f;
                    owk0 owk0Var = new owk0(wqk0Var, woe0Var2 != null ? woe0Var2.d : null);
                    return new tqe0(owk0Var.e(), new lbc0(1, owk0Var, owk0.class, "hitUiNavigate", "hitUiNavigate(Ljava/lang/String;)Lcom/spotify/ubi/android/eventdefinitions/UbiInteractionEvent;", 0, (byte) 13), new p350(0, owk0Var, owk0.class, "hitUiHide", "hitUiHide()Lcom/spotify/ubi/android/eventdefinitions/UbiInteractionEvent;", 0, (byte) 19), new p350(0, owk0Var, owk0.class, "hitUiReveal", "hitUiReveal()Lcom/spotify/ubi/android/eventdefinitions/UbiInteractionEvent;", 0, (byte) 20), null, 16);
                }
                if (q50Var instanceof p50) {
                    woe0 woe0Var3 = kbhVar2.g;
                    pwk0 pwk0Var = new pwk0(wqk0Var, woe0Var3 != null ? woe0Var3.d : null);
                    return new tqe0(pwk0Var.e(), new lbc0(1, pwk0Var, pwk0.class, "hitUiNavigate", "hitUiNavigate(Ljava/lang/String;)Lcom/spotify/ubi/android/eventdefinitions/UbiInteractionEvent;", 0, (byte) 14), new p350(0, pwk0Var, pwk0.class, "hitUiHide", "hitUiHide()Lcom/spotify/ubi/android/eventdefinitions/UbiInteractionEvent;", 0, (byte) 21), new p350(0, pwk0Var, pwk0.class, "hitUiReveal", "hitUiReveal()Lcom/spotify/ubi/android/eventdefinitions/UbiInteractionEvent;", 0, (byte) 22), null, 16);
                }
                if (q50Var instanceof m50) {
                    mwk0 mwk0Var = new mwk0(wqk0Var);
                    return new tqe0(mwk0Var.e(), new lbc0(1, mwk0Var, mwk0.class, "hitUiNavigate", "hitUiNavigate(Ljava/lang/String;)Lcom/spotify/ubi/android/eventdefinitions/UbiInteractionEvent;", 0, (byte) 11), null, null, null, 28);
                }
                eg.o();
                return null;
            }
        } else {
            if (!(czo1Var instanceof v50)) {
                eg.o();
                return null;
            }
            tj51 tj51Var = xoe0Var.b;
            tj51 tj51Var2 = tj51Var instanceof tj51 ? tj51Var : null;
            if (tj51Var2 != null) {
                wqk0 wqk0Var2 = new wqk0(bqk0Var.b(), (byte) 7);
                v50 v50Var = (v50) czo1Var;
                if (v50Var instanceof t50) {
                    ArrayList arrayList2 = tj51Var2.d;
                    t50 t50Var = (t50) v50Var;
                    int i2 = t50Var.d;
                    int i3 = t50Var.c;
                    wqe0 wqe0Var = (wqe0) o7h.t0(i3, arrayList2);
                    if (wqe0Var != null && (woe0Var = (woe0) o7h.t0(i2, wqe0Var.c)) != null) {
                        str2 = woe0Var.d;
                    }
                    uwk0 uwk0Var = new uwk0(Integer.valueOf(i2), str2, new jpk0(wqk0Var2, Integer.valueOf(i3)));
                    return new tqe0(uwk0Var.e(), new lbc0(1, uwk0Var, uwk0.class, "hitUiNavigate", "hitUiNavigate(Ljava/lang/String;)Lcom/spotify/ubi/android/eventdefinitions/UbiInteractionEvent;", 0, (byte) 15), new p350(0, uwk0Var, uwk0.class, "hitUiHide", "hitUiHide()Lcom/spotify/ubi/android/eventdefinitions/UbiInteractionEvent;", 0, (byte) 23), new p350(0, uwk0Var, uwk0.class, "hitUiReveal", "hitUiReveal()Lcom/spotify/ubi/android/eventdefinitions/UbiInteractionEvent;", 0, (byte) 24), null, 16);
                }
                if (!(v50Var instanceof u50)) {
                    eg.o();
                    return null;
                }
            }
        }
        return null;
    }
}
