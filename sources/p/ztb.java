package p;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ztb extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ztb(Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        byte b2 = 28;
        byte b3 = 20;
        b7x b7xVar = b7x.a;
        byte b4 = 16;
        byte b5 = 0;
        byte b6 = 1;
        pkb pkbVar = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                kd31 kd31Var = (kd31) obj;
                float fFloatValue = ((Number) ((Function0) obj3).invoke()).floatValue();
                kd31Var.b(fFloatValue);
                float fX0 = ((wat) obj2).X0(fFloatValue * 4.0f);
                kd31Var.k(fX0 > 0.0f ? new pkb(3, fX0, fX0) : null);
                return rih1Var;
            case 1:
                st6 st6Var = (st6) obj;
                iu30 iu30Var = (iu30) obj3;
                if (st6Var.equals(rt6.a)) {
                    iu30Var.invoke(ukk.a);
                } else {
                    if (!(st6Var instanceof qt6)) {
                        eg.o();
                        return null;
                    }
                    qt6 qt6Var = (qt6) st6Var;
                    String str = qt6Var.a;
                    iu30Var.invoke(new xkk(str, ((cfd) obj2).s(new av80(str, qt6Var.b))));
                }
                return rih1Var;
            case 2:
                p5t0.u((p5t0) obj, (q5t0) obj3, 0, 0, new tla((v0c) obj2, b3), 4);
                return rih1Var;
            case 3:
                ((abc0) obj).a = new ry5((p2c) obj3, (l2c) obj2, pkbVar, b2);
                return rih1Var;
            case 4:
                ic9 ic9Var = (ic9) obj3;
                ((gr6) ic9Var.c).a(((dg30) ic9Var.b).getString(2131954322), (List) obj2);
                return rih1Var;
            case 5:
                ji50 ji50Var = (ji50) obj;
                ajq0 ajq0Var = (ajq0) obj2;
                Iterator it = ((k6c) ((d520) obj3).b).a.iterator();
                while (it.hasNext()) {
                    ((x8c) it.next()).a(ajq0Var, ji50Var);
                }
                return rih1Var;
            case 6:
                int iIntValue = ((Number) obj).intValue();
                ((hdn0) obj2).t(iIntValue);
                bpb1 bpb1Var = ((plt) obj3).a;
                bpb1Var.m((Object) null, olt.a((olt) bpb1Var.getValue(), null, false, false, null, Integer.valueOf(iIntValue), 15));
                return rih1Var;
            case 7:
                List<mmr0> list = (List) obj;
                zpc zpcVar = (zpc) obj2;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (mmr0 mmr0Var : list) {
                    jh5 jh5Var = (jh5) mmr0Var.a;
                    arrayList.add(new mmr0(jh5Var, zpcVar.f(jh5Var, (k3r) mmr0Var.b)));
                }
                if (!arrayList.isEmpty()) {
                    ((iu30) obj3).invoke(arrayList);
                }
                return rih1Var;
            case 8:
                c380 c380Var = (c380) obj3;
                ((rtb0) obj).e(c380Var.size(), new qf1(c380Var, (byte) 28), new qf1(c380Var, (byte) 29), new j2i(802480018, new ot(c380Var, (pt) obj2, (byte) 2), true));
                return rih1Var;
            case 9:
                return new x010((zob1) obj3, ((a6d) obj2).b.a(), new l2(3, (lnm) null, (byte) 20), (byte) 1);
            case 10:
                return new ht0((a6d) obj3, obj2, (byte) 6);
            case 11:
                ((c460) obj3).a(((e6d) obj2).c, (FrameLayout) obj);
                return rih1Var;
            case 12:
                ((abc0) obj).a = new pid((qid) obj3, (ven0) obj2, (lnm) null, (byte) 0);
                return rih1Var;
            case 13:
                hxb hxbVar = (hxb) obj;
                if (hxbVar instanceof gxb) {
                    if (!((boolean[]) obj3)[0]) {
                        xid xidVar = (xid) obj2;
                        i8h1 i8h1Var = (i8h1) xidVar.b;
                        x6h1 x6h1VarC = ((zok0) xidVar.c).b.c();
                        x6h1VarC.i.add(new a7h1("dismiss", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC.j = false;
                        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    }
                } else if (!hxbVar.equals(fxb.a) && !hxbVar.equals(exb.a)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 14:
                ((nmd) obj3).b.D((y341) obj, (k0j0) obj2);
                return rih1Var;
            case 15:
                xwa xwaVar = (xwa) obj3;
                de50 de50Var = (de50) obj2;
                xwaVar.a = de50Var;
                return new ht0(xwaVar, de50Var, (byte) 7);
            case 16:
                return new mgb(((oud) obj3).b(), (vu30) obj2, b4);
            case 17:
                c380 c380Var2 = ((k0e) obj3).b;
                ((rtb0) obj).e(c380Var2.size(), new kwd(c380Var2, b5), new kwd(c380Var2, b6), new j2i(802480018, new ot(c380Var2, (umf0) obj2, (byte) 3), true));
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                ((vu30) obj3).invoke(((kic1) obj2).a, (tv80) obj);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                FrameLayout frameLayout = (FrameLayout) obj;
                i6l1 i6l1Var = (i6l1) obj3;
                if (i6l1Var != null) {
                    i6l1Var.a(obj2, frameLayout);
                }
                return rih1Var;
            case 20:
                ((Boolean) obj).getClass();
                ((iu30) obj3).invoke(new m6e(((i6e) obj2).a));
                return rih1Var;
            case 21:
                fta ftaVar = (fta) obj3;
                fn31.T(cto1.q((dg30) ftaVar.c), (o8n) null, 0, new x4c((Object) ftaVar, (String) obj2, obj, (lnm) null, (byte) 4), 3);
                return rih1Var;
            case 22:
                Set set = s4b1.f;
                ((iae) obj2).a.a("spotify:blend:story:".concat(uic.x((String) obj3).h()), (tv80) obj, (Bundle) null);
                return rih1Var;
            case 23:
                xhm1 xhm1Var = (xhm1) obj;
                idm1 idm1Var = (idm1) obj3;
                qdm1 qdm1Var = (qdm1) obj2;
                int iOrdinal = qdm1Var.e.a.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    b5 = 1;
                }
                return idm1Var.b(xhm1Var, b5, qdm1Var.c);
            case 24:
                List list2 = (List) obj;
                String strY0 = o7h.y0(list2, "", (String) null, (String) null, (iu30) null, 62);
                cce cceVar = (cce) obj3;
                i8h1 i8h1Var2 = (i8h1) ((idd1) cceVar.d).getValue();
                x6h1 x6h1VarC2 = ((txk0) cceVar.c).b.c();
                x6h1VarC2.i.add(new a7h1("pin_input_field", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("text_edit", 1, Collections.singletonMap("field_to_be_changed", "pin")), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (ihc1.y0((String) it2.next())) {
                            ((iu30) obj2).invoke(new nde(strY0));
                        }
                    }
                }
                return rih1Var;
            case 25:
                fta ftaVar2 = ((ble) obj3).a;
                oud oudVar = (oud) obj2;
                oudVar.getClass();
                qke qkeVar = (qke) ftaVar2.b;
                vke vkeVar = (vke) ftaVar2.c;
                q8n q8nVar = (q8n) ftaVar2.e;
                hyl0 hyl0Var = (hyl0) ftaVar2.d;
                c8o.l(hyl0Var);
                return new kpg0(new ele(qkeVar, vkeVar, q8nVar, hyl0Var, oudVar), rje.X0);
            case 26:
                uv11 uv11Var = (uv11) obj;
                return new gcm(uv11Var.a, ((eme) obj3).c.a, null, new ame((vu30) obj2, uv11Var, b5), 12);
            case 27:
                q7r0 q7r0VarG = ((cir0) obj3).g();
                String str2 = ((eve) obj2).b.a;
                Set set2 = pcf.a;
                q7r0VarG.d("spotify:chat-mute:".concat(str2), (tv80) obj, (Bundle) null);
                return rih1Var;
            case 28:
                return new ht0((ewe) obj3, (ven0) obj2, (byte) 9);
            default:
                c380 c380Var3 = ((v4f) obj3).b;
                ((kex) obj).b(c380Var3.size(), new j2i(-1673449743, new ef8(c380Var3, (p4f) obj2, (byte) 16), true), new s6(c380Var3, (byte) 17));
                return rih1Var;
        }
    }
}
