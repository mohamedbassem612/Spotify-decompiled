package p;

import android.os.Bundle;
import com.spotify.mobius.functions.Consumer;
import com.spotify.scrollsita.v1.Section;
import com.spotify.widgets.widgetstate.WidgetState;
import com.spotify.widgets.widgetstate.WidgetStateKt;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q961 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q961(vt61 vt61Var, lqs0 lqs0Var) {
        super(1);
        this.a = (byte) 14;
        this.b = lqs0Var;
    }

    public final Object invoke(Object obj) {
        float fFloatValue;
        byte b = this.a;
        byte b2 = 20;
        float f = 0.0f;
        w7x w7xVar = w7x.a;
        lnm lnmVar = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return new wzv0(((h961) obj2).c, (byte) 18);
            case 1:
                return new rxc0(((w4y0) obj2).b);
            case 2:
                ((qtr) obj).b(new pnp0((res) obj2, (lnm) null, (byte) 24));
                return rih1Var;
            case 3:
                ((qtr) obj).b(new k8y0((cm0) obj2, (lnm) null, (byte) 13));
                return rih1Var;
            case 4:
                ((qtr) obj).b(new js((et90) obj2, lnmVar, b2));
                return rih1Var;
            case 5:
                return new rxc0(((ncc0) obj2).b);
            case 6:
                ((cen0) obj).a(div.l, WidgetStateKt.toBase64String((WidgetState) obj2));
                return rih1Var;
            case 7:
                return new rxc0(((j2y0) obj2).b);
            case 8:
                qtr qtrVar = (qtr) obj;
                qtrVar.b((bv30) obj2);
                qtrVar.d(ec61.c1, qr51.Z0);
                return rih1Var;
            case 9:
                return new rxc0(((zwr) obj2).b);
            case 10:
                return ((rr61) obj2).b;
            case 11:
                return (lq61) obj2;
            case 12:
                int iIntValue = ((Number) obj).intValue();
                ufz0 ufz0Var = ((vs61) obj2).d;
                ufz0Var.f = iIntValue;
                qfz0 qfz0Var = ufz0Var.b;
                if (qfz0Var != null) {
                    qfz0Var.e(iIntValue);
                }
                return rih1Var;
            case 13:
                bq61 bq61Var = (bq61) obj;
                Consumer consumer = (Consumer) ((cr6) obj2).e;
                if (consumer != null) {
                    consumer.accept(bq61Var);
                }
                return rih1Var;
            case 14:
                Object obj3 = ((ibr0) obj).b;
                lqs0 lqs0Var = vt61.j;
                pqs0 it = ((lqs0) obj2).iterator();
                while (true) {
                    pqs0 pqs0Var = it;
                    if (!pqs0Var.hasNext()) {
                        return new tq61(f);
                    }
                    String str = (String) pqs0Var.next();
                    lqs0 lqs0Var2 = vt61.j;
                    ut61 ut61Var = (ut61) obj3;
                    Float fB0 = zso1.b0(str, ut61Var.a);
                    if (fB0 != null) {
                        fFloatValue = fB0.floatValue() * 100.0f;
                    } else {
                        Float fB1 = zso1.b0(str, ut61Var.b);
                        if (fB1 == null) {
                            return uq61.a;
                        }
                        fFloatValue = fB1.floatValue();
                    }
                    f += fFloatValue;
                }
                break;
            case 15:
                pu61 pu61Var = (pu61) obj2;
                return new hp0(pu61Var.g.c(new d061(1, pu61Var, pu61.class, "onDismissed", "onDismissed(Lcom/spotify/tome/pagecapabilities/properties/BottomSheetProperties$BehaviorManager$DismissedReason;)V", 0, (byte) 4)), (byte) 16);
            case 16:
                ((qtr) obj).b(new gz0((r171) obj2, (lnm) null, (byte) 22));
                return rih1Var;
            case 17:
                ((j171) obj2).i.invoke(new r071((String) obj));
                return rih1Var;
            case 18:
                return new u171((qz61) obj2, ((p271) obj).b);
            case 19:
                w171 w171Var = (w171) obj;
                h271 h271Var = ((i271) obj2).b;
                if (w171Var instanceof u171) {
                    return h271Var.b((u171) w171Var);
                }
                if (w171Var instanceof v171) {
                    return h271Var.t((v171) w171Var);
                }
                if (w171Var instanceof t171) {
                    return h271Var.s((t171) w171Var);
                }
                eg.o();
                return null;
            case 20:
                return new rxc0(((k871) obj2).a);
            case 21:
                return new h2l0((i3l0) obj, ((g771) obj2).a);
            case 22:
                ji50 ji50Var = (ji50) obj;
                ji50Var.b.put(g271.class, r4o1.P(qi71.X, w7xVar, new jt41((cl71) obj2, ji50Var, (byte) 22), ea71.t));
                return rih1Var;
            case 23:
                yrj1.a.getClass();
                d261 d261Var = yrj1.c;
                mma0 mma0Var = yrj1.b[0];
                d261Var.getClass();
                ((e261) obj).b(d261Var, (h3i0) obj2);
                return rih1Var;
            case 24:
                aq71 aq71Var = (aq71) obj;
                yxb0 yxb0Var = (yxb0) obj2;
                String strK = nzy.k(aq71Var.a);
                sge0 sge0Var = aq71Var.f;
                bc71 bc71Var = aq71Var.d;
                return new x010(((bc71Var instanceof lb71) && (sge0Var == null || (sge0Var.a instanceof oge0))) ? new m441(new ciw0(yxb0Var, new ec71(4, strK, aq71Var.c), (lnm) null, (byte) 20)) : new huz(o0p1.r(bc71Var, sge0Var), (byte) 10), ((zr00) yxb0Var.c).a, new ap51(3, (lnm) null, (byte) 3), (byte) 1);
            case 25:
                u2r u2rVar = (u2r) obj;
                mzr0 mzr0Var = (mzr0) obj2;
                u2rVar.b(((a9q) mzr0Var.a).a("clip-playback-handler"));
                u2rVar.b((lrh) mzr0Var.c);
                return rih1Var;
            case 26:
                eqc eqcVar = (eqc) obj;
                ez71 ez71Var = (ez71) obj2;
                z1a1 z1a1VarA = ez71Var.R0.a(eqcVar.a.j(), eqcVar.a.getLayoutDirection(), eqcVar);
                u8s0 u8s0VarA = ww4.a();
                vpb1.l(u8s0VarA, z1a1VarA);
                vw4 vw4VarG = t3k1.g();
                vw4VarG.c(u8s0VarA, true);
                float length = vw4VarG.a.getLength();
                float[] fArr = {0.1f * length, 0.9f * length};
                float fH = eqcVar.h() * ez71Var.Q0;
                long j = u7h.j;
                return eqcVar.a(new ob61(ez71Var, length, u8s0VarA, new mic0(0, (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), p7h.M(new u7h[]{new u7h(j), new u7h(u7h.b(ez71Var.S0, 0.8f, 0.0f, 0.0f, 0.0f, 14)), new u7h(ez71Var.S0), new u7h(u7h.b(ez71Var.S0, 0.8f, 0.0f, 0.0f, 0.0f, 14)), new u7h(j)}), (List) null), fH, fArr, (byte) 1));
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                i181 i181Var = (i181) obj2;
                return w5p1.n(new b181((ioj0) i181Var.a.getValue(), null, w7xVar), (e181) obj, i181Var.g);
            case 28:
                String str2 = (String) obj;
                a1r0 a1r0Var = ((k481) obj2).I1;
                if (a1r0Var != null) {
                    a1r0.j(a1r0Var, str2, (String) null, (Bundle) null, false, 14);
                    return rih1Var;
                }
                u890.C("pageActivityNavigator");
                throw null;
            default:
                ((qtr) obj).b(new gz0((et90) obj2, (lnm) null, (byte) 24));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q961(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }
}
