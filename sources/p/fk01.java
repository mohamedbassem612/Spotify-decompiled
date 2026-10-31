package p;

import android.os.Bundle;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fk01 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fk01(int i) {
        super(i);
        this.a = (byte) 8;
    }

    /* JADX WARN: Code duplicated, block: B:136:0x02bc A[PHI: r9
      0x02bc: PHI (r9v22 java.lang.String) = (r9v19 java.lang.String), (r9v25 java.lang.String) binds: [B:142:0x02d4, B:134:0x02b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:188:0x039c  */
    /* JADX WARN: Code duplicated, block: B:269:0x056d  */
    public final Object invoke(Object obj, Object obj2) {
        jo70 jo70Var;
        jo70 jo70Var2;
        gzd gzdVar;
        mq70 mq70Var;
        up70 up70VarA;
        int i;
        fg91 fg91VarA;
        int i2;
        String str;
        List list;
        up70 up70Var;
        mq70 mq70Var2;
        List list2;
        up70 up70Var2;
        mz51 mz51Var;
        byte b = this.a;
        String str2 = "";
        int i3 = 3;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                guo1.w((b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                return fv01.d((au01) obj2, ((Number) obj).intValue());
            case 2:
                oey0 oey0Var = (oey0) obj;
                return new kob1(oey0Var.a, oey0Var.b, oey0Var.c, oey0Var.d, oey0Var.e, oey0Var.f, oey0Var.g, oey0Var.h, oey0Var.i, oey0Var.j, oey0Var.k, oey0Var.l, oey0Var.m, oey0Var.n, oey0Var.o, oey0Var.p, oey0Var.q, oey0Var.r, ((v810) obj2).a, oey0Var.v, oey0Var.x);
            case 3:
                PlayerState playerState = (PlayerState) obj;
                PlayerState playerState2 = (PlayerState) obj2;
                if (!u890.j(hi11.a(playerState), hi11.a(playerState2))) {
                    ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                    String strUri = contextTrack != null ? contextTrack.uri() : null;
                    ContextTrack contextTrack2 = (ContextTrack) playerState2.track().h();
                    z = u890.j(strUri, contextTrack2 != null ? contextTrack2.uri() : null);
                }
                return Boolean.valueOf(z);
            case 4:
                PlayerState playerState3 = (PlayerState) obj2;
                String strUri2 = ((ContextTrack) playerState3.track().b()).uri();
                t380 t380VarDisallowTogglingRepeatTrackReasons = playerState3.restrictions().disallowTogglingRepeatTrackReasons();
                ue21 ue21Var = new ue21(strUri2, x8p1.m(playerState3), x8p1.p(x8p1.m(playerState3), playerState3.restrictions()), t380VarDisallowTogglingRepeatTrackReasons.isEmpty() || t380VarDisallowTogglingRepeatTrackReasons.equals(mi11.i));
                if (u890.j(playerState3.restrictions().disallowTogglingRepeatTrackReasons(), mi11.i)) {
                    i3 = 2;
                } else {
                    int iC = l1d.C(x8p1.m(playerState3));
                    if (iC == 0) {
                        i3 = 1;
                    } else if (iC != 1 && iC != 2) {
                        eg.o();
                        return null;
                    }
                }
                return new ii11(ue21Var, i3);
            case 5:
                PlayerState playerState4 = ((s810) obj2).a;
                String strContextUri = playerState4.contextUri();
                String strUri3 = ((ContextTrack) playerState4.track().b()).uri();
                mm91 lm91Var = (playerState4.restrictions().disallowTogglingShuffleReasons().isEmpty() && !playerState4.options().shufflingContext()) ? new lm91(false) : new mm91(false);
                mm91 mm91Var = lm91Var;
                boolean z2 = !playerState4.restrictions().disallowTogglingShuffleReasons().isEmpty();
                boolean zShufflingContext = playerState4.options().shufflingContext();
                rp91 rp91Var = rp91.a;
                rp91 rp91Var2 = rp91.b;
                rp91 rp91Var3 = zShufflingContext ? rp91Var2 : rp91Var;
                rp91 rp91Var4 = playerState4.options().shufflingContext() ? rp91Var2 : rp91Var;
                if (!playerState4.options().shufflingContext()) {
                    rp91Var = rp91Var2;
                }
                return new em91(strContextUri, strUri3, mm91Var, z2, new sp91(rp91Var3, rp91Var4, rp91Var), 32);
            case 6:
                ((Number) obj2).intValue();
                kw7.b((b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                wk11 wk11Var = (wk11) obj;
                Map map = (Map) obj2;
                al11 al11Var = wk11Var.c;
                boolean z3 = al11Var instanceof yk11;
                s0e s0eVar = r0e.a;
                if (z3) {
                    String str3 = ((yk11) al11Var).a;
                    if (!ihc1.y0(str3)) {
                        s0eVar = new s0e(str3);
                    }
                } else if (al11Var instanceof xk11) {
                    xk11 xk11Var = (xk11) al11Var;
                    String str4 = xk11Var.a;
                    djs0 djs0Var = (djs0) map.get(xk11Var.b);
                    String str5 = (djs0Var == null || (jo70Var = djs0Var.a) == null) ? null : jo70Var.a;
                    str2 = str5 != null ? str5 : "";
                    if (!ihc1.y0(str4) && !ihc1.y0(str2)) {
                        s0eVar = new s0e(nhc1.W(str4, "{0}", str2));
                    }
                } else if (!(al11Var instanceof zk11)) {
                    eg.o();
                    return null;
                }
                List<String> listJ0 = o7h.j0(wk11Var.b);
                ArrayList arrayList = new ArrayList();
                for (String str6 : listJ0) {
                    djs0 djs0Var2 = (djs0) map.get(str6);
                    if (djs0Var2 == null || (jo70Var2 = djs0Var2.a) == null) {
                        gzdVar = null;
                    } else {
                        if (ihc1.y0(jo70Var2.a)) {
                            jo70Var2 = null;
                        }
                        if (jo70Var2 == null) {
                            gzdVar = null;
                        } else {
                            xkk1 xkk1Var = djs0Var2.b;
                            String str7 = (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.c)) == null) ? null : up70VarA.a.a;
                            List listI0 = f46.i0(new String[]{jo70Var2.b, o7h.y0(jo70Var2.d, ", ", (String) null, (String) null, ej11.f, 30)});
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj3 : listI0) {
                                if (!ihc1.y0((String) obj3)) {
                                    arrayList2.add(obj3);
                                }
                            }
                            gzdVar = new gzd(str6, jo70Var2.a, str7, mqo1.A(arrayList2));
                        }
                    }
                    if (gzdVar != null) {
                        arrayList.add(gzdVar);
                    }
                }
                return new k0e(s0eVar, mqo1.F(arrayList));
            case 8:
                return ad5.T0.invoke((List) obj, (qxc0) obj2);
            case 9:
                ((Number) obj2).intValue();
                z47.i((b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                gf31 gf31Var = (gf31) obj2;
                String str8 = ((ef31) obj).a;
                jo70 jo70Var3 = gf31Var.a;
                xkk1 xkk1Var2 = gf31Var.b;
                myv0 myv0Var = gf31Var.c;
                Boolean bool = gf31Var.d;
                Set set = s4b1.f;
                s4b1 s4b1VarX = uic.x(str8);
                if (((xkk1Var2 == null || (mq70Var2 = xkk1Var2.b) == null || (list2 = mq70Var2.a) == null || (up70Var2 = (up70) o7h.s0(list2)) == null) ? null : up70Var2.a.a) != null) {
                    i = 3;
                } else {
                    blc0 blc0Var = s4b1VarX.c;
                    i = (blc0Var == blc0.u1 || blc0Var == blc0.m2) ? 1 : 2;
                }
                if (ihc1.h0(str8, "playlist", false)) {
                    fg91VarA = fg91.b;
                } else {
                    List list3 = jo70Var3.d;
                    ArrayList arrayList3 = new ArrayList(q7h.U(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((ho70) it.next()).a);
                    }
                    fg91VarA = mqo1.A(arrayList3);
                }
                String str9 = jo70Var3.a;
                String str10 = jo70Var3.b;
                long j = myv0Var != null ? myv0Var.b : 0L;
                if (xkk1Var2 != null) {
                    int iC2 = l1d.C(i);
                    if (iC2 == 0 || iC2 == 1) {
                        up70 up70Var3 = (up70) o7h.s0(xkk1Var2.a.a);
                        str = up70Var3 != null ? up70Var3.a.a : null;
                        if (str != null) {
                            str2 = str;
                        }
                    } else {
                        if (iC2 != 2) {
                            eg.o();
                            return null;
                        }
                        mq70 mq70Var3 = xkk1Var2.b;
                        str = (mq70Var3 == null || (list = mq70Var3.a) == null || (up70Var = (up70) o7h.s0(list)) == null) ? null : up70Var.a.a;
                        if (str != null) {
                            str2 = str;
                        }
                    }
                } else {
                    str2 = null;
                }
                int iC3 = l1d.C(i);
                if (iC3 == 0) {
                    i2 = 1;
                } else if (iC3 == 1) {
                    i2 = 2;
                } else {
                    if (iC3 != 2) {
                        eg.o();
                        return null;
                    }
                    i2 = 3;
                }
                return new ff31(str9, str10, fg91VarA, str2, i2, j, bool, str8);
            case 11:
                ((Number) obj2).intValue();
                nb51.d((b0k) obj, czo1.p(1));
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                bs51.g((b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                rzn1.i((b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                tp51 tp51Var = (tp51) obj;
                sp51 sp51Var = (sp51) obj2;
                Set set2 = s4b1.f;
                blc0 blc0Var2 = uic.x(tp51Var.a).c;
                z = blc0Var2 == blc0.u1 || blc0Var2 == blc0.m2;
                String str11 = sp51Var.b;
                if (str11 == null || ihc1.y0(str11)) {
                    str11 = null;
                }
                String str12 = sp51Var.c;
                if (str12 == null || ihc1.y0(str12)) {
                    str12 = null;
                }
                String str13 = tp51Var.a;
                int i4 = tp51Var.b;
                String str14 = sp51Var.a;
                String string = str14 != null ? ihc1.e1(str14).toString() : null;
                String str15 = (z || str12 == null) ? str11 : str12;
                int i5 = z ? 1 : str12 != null ? 2 : 3;
                String str16 = sp51Var.d;
                return new up51(str13, i4, string, str15, i5, (str16 == null || ihc1.y0(str16)) ? null : str16, sp51Var.e, sp51Var.f, sp51Var.g);
            case 15:
                ((Number) obj2).intValue();
                wgo1.f((b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                wgo1.h((b0k) obj, czo1.p(1));
                return rih1Var;
            case 17:
                ty51 ty51Var = (ty51) obj;
                Bundle bundle = (Bundle) obj2;
                if (bundle == null || (mz51Var = (mz51) jhc1.t(bundle, "selectionBundle", mz51.class)) == null) {
                    mz51Var = new mz51(jy31.a, z6x.a);
                }
                k8g1 k8g1Var = ty51Var.i;
                return new b061(k8g1Var.a, k8g1Var.c, k8g1Var.d, k8g1Var.e, k8g1Var.f, k8g1Var.h, k8g1Var.i, mz51Var.a, mz51Var.b);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                ((Number) obj2).intValue();
                hno1.b((b0k) obj, czo1.p(1));
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ((Number) obj2).intValue();
                ryo1.f((b0k) obj, czo1.p(1));
                return rih1Var;
            case 20:
                m671 m671Var = (m671) obj2;
                if (im0.f((ContextTrack) m671Var.a.track().b()) && m671Var.b) {
                    z = true;
                }
                return new p671(z, null, null);
            case 21:
                ((Number) obj2).intValue();
                g2p1.r((b0k) obj, czo1.p(1));
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                b5p1.e((b0k) obj, czo1.p(1));
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                n9p1.h((b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                fbp1.k((b0k) obj, czo1.p(1));
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                g491.a((b0k) obj, czo1.p(1));
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                g491.b((b0k) obj, czo1.p(1));
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                g491.d((b0k) obj, czo1.p(1));
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                g491.e((b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                g491.h((b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fk01(int i, byte b) {
        super(2);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fk01(Object obj, byte b) {
        super(2);
        this.a = b;
    }
}
