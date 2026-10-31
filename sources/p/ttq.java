package p;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ttq implements jly0 {
    public final /* synthetic */ byte a;
    public final boolean b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ttq(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public final Object get() {
        byte b = this.a;
        Object obj = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    return new stq(this);
                }
                if (!z) {
                    jah.e(z ? 1 : 0);
                    return null;
                }
                d35 d35Var = (d35) ((z8i1) ((jmq) obj).a).q.get();
                c8o.l(d35Var);
                return d35Var;
            case 1:
                jmq jmqVar = (jmq) obj;
                if (!z) {
                    return new edi1((ttq) jmqVar.c, new h7l0((byte) 8));
                }
                if (z) {
                    return u1n0.z((q7r0) jmqVar.a);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 2:
                jmq jmqVar2 = (jmq) obj;
                g4j1 g4j1Var = (g4j1) jmqVar2.a;
                if (z) {
                    if (!z) {
                        jah.e(z ? 1 : 0);
                        return null;
                    }
                    ajg ajgVar = (ajg) g4j1Var.b.get();
                    c8o.l(ajgVar);
                    return ajgVar;
                }
                Activity activity = (Activity) g4j1Var.a.get();
                c8o.l(activity);
                ttq ttqVar = (ttq) jmqVar2.b;
                z710 z710Var = (z710) g4j1Var.c.get();
                c8o.l(z710Var);
                return new vbe1(activity, ttqVar, z710Var);
            case 3:
                jmq jmqVar3 = (jmq) obj;
                h4j1 h4j1Var = (h4j1) jmqVar3.a;
                if (z) {
                    if (!z) {
                        jah.e(z ? 1 : 0);
                        return null;
                    }
                    ajg ajgVar2 = (ajg) h4j1Var.b.get();
                    c8o.l(ajgVar2);
                    return ajgVar2;
                }
                Activity activity2 = (Activity) h4j1Var.a.get();
                c8o.l(activity2);
                ttq ttqVar2 = (ttq) jmqVar3.b;
                z710 z710Var2 = (z710) h4j1Var.c.get();
                c8o.l(z710Var2);
                return new vbe1(activity2, ttqVar2, z710Var2);
            case 4:
                if (!z) {
                    return new muq(this);
                }
                if (z) {
                    return new nuq(this);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 5:
                mwj1 mwj1Var = (mwj1) ((jmq) obj).a;
                if (!z) {
                    return pzm.h((mos) mwj1Var.f.get());
                }
                if (!z) {
                    jah.e(z ? 1 : 0);
                    return null;
                }
                i8h1 i8h1Var = (i8h1) mwj1Var.g.get();
                c8o.l(i8h1Var);
                return i8h1Var;
            case 6:
                tbl tblVar = ((wuq) obj).a;
                if (!z) {
                    return new szs((kzs) tblVar.a.get());
                }
                if (z) {
                    return (vk50) tblVar.b.get();
                }
                jah.e(z ? 1 : 0);
                return null;
            case 7:
                if (!z) {
                    return new xuq(this);
                }
                if (!z) {
                    jah.e(z ? 1 : 0);
                    return null;
                }
                lzn0 lzn0Var = (lzn0) ((ibq) ((jmq) obj).a).a.i.get();
                c8o.l(lzn0Var);
                return new hz5(lzn0Var);
            case 8:
                k3q k3qVar = (k3q) ((jnq) obj).b;
                if (!z) {
                    return new bzo(this, (byte) 6);
                }
                if (!z) {
                    jah.e(z ? 1 : 0);
                    return null;
                }
                woa woaVar = (woa) k3qVar.a.W8.get();
                c8o.l(woaVar);
                kma kmaVar = (kma) k3qVar.a.a.Z1.get();
                c8o.l(kmaVar);
                fpa fpaVar = (fpa) k3qVar.a.X8.get();
                c8o.l(fpaVar);
                pe peVar = (pe) k3qVar.a.p9.get();
                c8o.l(peVar);
                boolean zBooleanValue = ((Boolean) k3qVar.a.a.N1.get()).booleanValue();
                zle1 zle1Var = (zle1) k3qVar.a.a3.get();
                c8o.l(zle1Var);
                return new k0t(woaVar, kmaVar, fpaVar, peVar, zBooleanValue, zle1Var);
            case 9:
                jbq jbqVar = (jbq) ((yjq) obj).d;
                if (!z) {
                    return new bvq(this);
                }
                if (!z) {
                    jah.e(z ? 1 : 0);
                    return null;
                }
                woa woaVar2 = (woa) jbqVar.a.W8.get();
                c8o.l(woaVar2);
                kma kmaVar2 = (kma) jbqVar.a.a.Z1.get();
                c8o.l(kmaVar2);
                fpa fpaVar2 = (fpa) jbqVar.a.X8.get();
                c8o.l(fpaVar2);
                pe peVar2 = (pe) jbqVar.a.p9.get();
                c8o.l(peVar2);
                boolean zBooleanValue2 = ((Boolean) jbqVar.a.a.N1.get()).booleanValue();
                zle1 zle1Var2 = (zle1) jbqVar.a.a3.get();
                c8o.l(zle1Var2);
                return new k0t(woaVar2, kmaVar2, fpaVar2, peVar2, zBooleanValue2, zle1Var2);
            case 10:
                jmq jmqVar4 = (jmq) obj;
                if (z) {
                    if (z) {
                        return u1n0.z((q7r0) jmqVar4.a);
                    }
                    jah.e(z ? 1 : 0);
                    return null;
                }
                ttq ttqVar3 = (ttq) jmqVar4.c;
                h7l0 h7l0Var = new h7l0((byte) 9);
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-gen-alpha-kid-account-creation-welcome";
                x6h1VarI.f = "1.0.0";
                x6h1VarI.g = "22.0.0";
                y6h1 y6h1VarA = x6h1VarI.a();
                p7h.M(new String[]{"kid-account-creation/welcome", "kid-account-transition/welcome"});
                r6h1 r6h1Var = r6h1.c;
                return new mml1(ttqVar3, h7l0Var, new b7l0(new r6h1(kk0.l(y6h1VarA), (u8h1) null)));
            case 11:
                tjq tjqVar = (tjq) obj;
                bct bctVar = (bct) tjqVar.c;
                qop qopVar = (qop) tjqVar.b;
                jbq jbqVar2 = (jbq) tjqVar.d;
                if (!z) {
                    String strD = qopVar.d();
                    uqv0 uqv0VarI3 = jbqVar2.b.i3();
                    koc0 koc0Var = bctVar.d;
                    nfa0 nfa0Var = (nfa0) jbqVar2.a.b2.get();
                    c8o.l(nfa0Var);
                    o7m1 o7m1Var = (o7m1) ((jly0) tjqVar.a).get();
                    q8n q8nVar = (q8n) jbqVar2.a.r2.get();
                    c8o.l(q8nVar);
                    return new vbe1(strD, uqv0VarI3, koc0Var, nfa0Var, o7m1Var, q8nVar);
                }
                if (!z) {
                    jah.e(z ? 1 : 0);
                    return null;
                }
                String strD2 = qopVar.d();
                koc0 koc0Var2 = bctVar.d;
                iyc0 iyc0Var = (iyc0) jbqVar2.b.g1.get();
                c8o.l(iyc0Var);
                nfa0 nfa0Var2 = (nfa0) jbqVar2.a.b2.get();
                c8o.l(nfa0Var2);
                q8n q8nVar2 = (q8n) jbqVar2.a.V2.get();
                c8o.l(q8nVar2);
                kt91 kt91Var = (kt91) jbqVar2.a.f8.get();
                c8o.l(kt91Var);
                return new o7m1(strD2, koc0Var2, iyc0Var, nfa0Var2, q8nVar2, kt91Var);
            default:
                fyh1 fyh1Var = (fyh1) ((jmq) obj).a;
                if (!z) {
                    Context context = fyh1Var.a;
                    c8o.l(context);
                    q8n q8nVar3 = fyh1Var.b;
                    c8o.l(q8nVar3);
                    return new skx0(context, q8nVar3);
                }
                if (!z) {
                    jah.e(z ? 1 : 0);
                    return null;
                }
                Context context2 = fyh1Var.a;
                c8o.l(context2);
                return new ykx0(context2);
        }
    }
}
