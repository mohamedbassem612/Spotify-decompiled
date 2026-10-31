package p;

import android.os.Bundle;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import com.spotify.player.model.ContextTrack;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zhi1 extends hab0 implements vu30 {
    public static final zhi1 N0;
    public static final zhi1 O0;
    public static final zhi1 P0;
    public static final zhi1 Q0;
    public static final zhi1 R0;
    public static final zhi1 S0;
    public static final zhi1 T0;
    public static final zhi1 U0;
    public static final zhi1 V0;
    public static final zhi1 W0;
    public static final zhi1 X;
    public static final zhi1 X0;
    public static final zhi1 Y;
    public static final zhi1 Y0;
    public static final zhi1 Z;
    public static final zhi1 Z0;
    public static final zhi1 a1;
    public static final zhi1 b;
    public static final zhi1 b1;
    public static final zhi1 c;
    public static final zhi1 c1;
    public static final zhi1 d;
    public static final zhi1 d1;
    public static final zhi1 e;
    public static final zhi1 e1;
    public static final zhi1 f;
    public static final zhi1 g;
    public static final zhi1 h;
    public static final zhi1 i;
    public static final zhi1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new zhi1(i2, (byte) 0);
        c = new zhi1(i2, (byte) 1);
        d = new zhi1(i2, (byte) 2);
        e = new zhi1(i2, (byte) 3);
        f = new zhi1(i2, (byte) 4);
        g = new zhi1(i2, (byte) 5);
        h = new zhi1(i2, (byte) 6);
        i = new zhi1(i2, (byte) 7);
        t = new zhi1(i2, (byte) 8);
        X = new zhi1(i2, (byte) 9);
        Y = new zhi1(i2, (byte) 10);
        Z = new zhi1(i2, (byte) 11);
        N0 = new zhi1(i2, (byte) 12);
        O0 = new zhi1(i2, (byte) 13);
        P0 = new zhi1(i2, (byte) 14);
        Q0 = new zhi1(i2, (byte) 15);
        R0 = new zhi1(i2, (byte) 16);
        S0 = new zhi1(i2, (byte) 17);
        T0 = new zhi1(i2, (byte) 18);
        U0 = new zhi1(i2, (byte) 19);
        V0 = new zhi1(i2, (byte) 20);
        W0 = new zhi1(i2, (byte) 21);
        X0 = new zhi1(i2, (byte) 22);
        Y0 = new zhi1(i2, (byte) 23);
        Z0 = new zhi1(i2, (byte) 24);
        a1 = new zhi1(i2, (byte) 25);
        b1 = new zhi1(i2, (byte) 26);
        c1 = new zhi1(i2, (byte) 27);
        d1 = new zhi1(i2, (byte) 28);
        e1 = new zhi1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zhi1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        whi1 whi1Var;
        goj0 goj0VarA;
        goj0 goj0VarA2;
        goj0 goj0VarA3;
        int i2 = 0;
        z = false;
        boolean z = false;
        pn30 pn30Var = null;
        switch (this.a) {
            case 0:
                whi1 whi1Var2 = (whi1) obj;
                Bundle bundle = (Bundle) obj2;
                return (bundle == null || (whi1Var = (whi1) jhc1.t(bundle, "stats-page-saved-instance", whi1.class)) == null) ? whi1Var2 : whi1Var;
            case 1:
                jvi1 jvi1Var = (jvi1) obj2;
                return new lvi1(((kvi1) obj).a, new qvi1(jvi1Var.a, jvi1Var.b, jvi1Var.c, jvi1Var.d));
            case 2:
                svi1 svi1Var = (svi1) obj;
                return new tvi1(svi1Var.a, svi1Var.b, svi1Var.c, svi1Var.d, ((s910) obj2).a);
            case 3:
                return (ywi1) obj;
            case 4:
                dbq0 dbq0Var = (dbq0) obj;
                Bundle bundle2 = (Bundle) obj2;
                Serializable serializable = bundle2 != null ? bundle2.getSerializable("verification_onboarding_step") : null;
                tzi1 tzi1Var = serializable instanceof tzi1 ? (tzi1) serializable : null;
                if (tzi1Var == null) {
                    tzi1Var = tzi1.b;
                }
                if (dbq0Var instanceof abq0) {
                    abq0 abq0Var = (abq0) dbq0Var;
                    zaq0 zaq0Var = abq0Var.a;
                    szi1 szi1Var = new szi1(zaq0Var.a, zaq0Var.b, zaq0Var.d, zaq0Var.c);
                    zaq0 zaq0Var2 = abq0Var.b;
                    return new xzi1(new uzi1(tzi1Var, szi1Var, new szi1(zaq0Var2.a, zaq0Var2.b, (String) null, zaq0Var2.c), abq0Var.c));
                }
                if (dbq0Var instanceof bbq0) {
                    bbq0 bbq0Var = (bbq0) dbq0Var;
                    return new xzi1(new vzi1(new szi1(bbq0Var.a, bbq0Var.b, (String) null, bbq0Var.c)));
                }
                eg.o();
                return null;
            case 5:
                return (x0j1) obj;
            case 6:
                h3j1 h3j1Var = (h3j1) obj;
                a3j1 a3j1Var = (a3j1) obj2;
                String str = h3j1Var.a;
                a7q0 a7q0Var = a3j1Var.a;
                uxn uxnVar = a3j1Var.b;
                return new i3j1(str, h0p1.s(h3j1Var, a7q0Var, uxnVar), h0p1.r(h3j1Var, uxnVar), 4);
            case 7:
                h3j1 h3j1Var2 = (h3j1) obj;
                ioj0 ioj0Var = (ioj0) obj2;
                String str2 = h3j1Var2.a;
                hoj0 hoj0VarC = ioj0Var.c(uxn.class, str2);
                uxn uxnVar2 = (hoj0VarC == null || (goj0VarA3 = hoj0VarC.a()) == null) ? null : (uxn) goj0VarA3.a;
                hoj0 hoj0VarC2 = ioj0Var.c(a7q0.class, str2);
                z2a z2aVarS = h0p1.s(h3j1Var2, (hoj0VarC2 == null || (goj0VarA2 = hoj0VarC2.a()) == null) ? null : (a7q0) goj0VarA2.a, uxnVar2);
                hoj0 hoj0VarC3 = ioj0Var.c(pn30.class, str2);
                if (hoj0VarC3 != null && (goj0VarA = hoj0VarC3.a()) != null) {
                    pn30Var = (pn30) goj0VarA.a;
                }
                return new i3j1(str2, z2aVarS, h0p1.t(pn30Var), h0p1.r(h3j1Var2, uxnVar2));
            case 8:
                return new u7h(((afx) obj).a.c);
            case 9:
                return new u7h(((afx) obj).a.c);
            case 10:
                return new u7h(((afx) obj).a.c);
            case 11:
                return rih1.a;
            case 12:
                return First.c((fdj1) obj2, Collections.singleton(new jc80(((mbj1) obj).a)));
            case 13:
                return ((c7j1) obj).b;
            case 14:
                kej1 kej1Var = (kej1) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (iIntValue == -1) {
                    return kej1Var;
                }
                List list = kej1Var.c;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (Object obj3 : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        p7h.T();
                        throw null;
                    }
                    jej1 jej1Var = (jej1) obj3;
                    arrayList.add((i2 != iIntValue || jej1Var.a) ? jej1.a(jej1Var, 1) : jej1.a(jej1Var, 2));
                    i2 = i3;
                }
                return new kej1(kej1Var.b, arrayList, kej1Var.a);
            case 15:
                return null;
            case 16:
                return null;
            case 17:
                return new xej1((bbl1) obj, (bbl1) obj2);
            case 18:
                return ((u4t0) obj).e;
            case 19:
                return ((t4t0) obj).e;
            case 20:
                return new u7h(((afx) obj).a.c);
            case 21:
                return new u7h(((afx) obj).a.c);
            case 22:
                return null;
            case 23:
                return First.c((pgj1) obj2, Collections.singleton(new fgj1((ufj1) obj)));
            case 24:
                return new dgj1((jo70) obj, (xkk1) obj2);
            case 25:
                return Next.h((rhj1) obj2);
            case 26:
                rhj1 rhj1Var = (rhj1) obj2;
                xj61 xj61Var = new xj61();
                if (rhj1Var.h.b.d) {
                    xj61Var.add(new chj1(rhj1Var.a, rhj1Var.b));
                }
                if (rhj1Var.X instanceof ohj1) {
                    xj61Var.add(new ahj1(rhj1Var.a, rhj1Var.b, rhj1Var.h, rhj1Var.i, rhj1Var.t, rhj1Var.c));
                }
                return First.c(rhj1Var, cwl1.j(xj61Var));
            case 27:
                return new vhj1(((uhj1) obj).a, ((Boolean) obj2).booleanValue());
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                mmr0 mmr0Var = (mmr0) obj2;
                ContextTrack contextTrack = (ContextTrack) mmr0Var.a;
                twj1 twj1Var = (twj1) mmr0Var.b;
                String strA0 = l4o1.a0(contextTrack, "image_url");
                if ((twj1Var instanceof rwj1) && ((rwj1) twj1Var).a.contains(ujj1.b)) {
                    z = true;
                }
                return new njj1(strA0, z);
            default:
                hkj1 hkj1Var = (hkj1) obj2;
                return (hkj1Var.a && (hkj1Var.b instanceof swj1)) ? kkj1.a : new jkj1(hkj1Var.c);
        }
    }
}
