package p;

import android.os.Bundle;
import com.spotify.player.esperanto.proto.EsContextPlayerState;
import com.spotify.player.model.PlayerState;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w63 extends a8d1 implements zu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w63(sde1 sde1Var, yxb0 yxb0Var, c9n c9nVar, lnm lnmVar) {
        super(4, lnmVar);
        this.a = (byte) 25;
        this.c = sde1Var;
        this.d = yxb0Var;
        this.e = c9nVar;
    }

    private final Object e(Object obj) {
        mmb1 mmb1Var = (qob1) this.b;
        m500 m500Var = (m500) this.c;
        tqw tqwVar = (tqw) this.d;
        hm5.M(obj);
        if ((m500Var instanceof m500) && (mmb1Var instanceof mmb1) && tqwVar != null) {
            ((qe31) this.e).d.a(mmb1Var.a, n3o1.y(tqwVar), (Bundle) null);
        }
        return rih1.a;
    }

    private final Object g(Object obj) {
        hd81 hd81Var = (hd81) this.e;
        he81 he81Var = (he81) this.b;
        cd81 cd81Var = (cd81) this.c;
        tqw tqwVar = (tqw) this.d;
        hm5.M(obj);
        if (u890.j(cd81Var, sc81.a)) {
            if (hd81Var.f(he81Var, tqwVar) == null) {
                hqn1.q(hd81Var.b, he81Var.d, tqwVar, (Bundle) null);
            }
        } else if (u890.j(cd81Var, bd81.a) || u890.j(cd81Var, wc81.a)) {
            hd81Var.f(he81Var, tqwVar);
        } else if (u890.j(cd81Var, tc81.a) && he81Var.l && tqwVar != null) {
            vgm.b(hd81Var.i, he81Var.d, (String) null, n3o1.y(tqwVar), new tgm((String) null, true, false, false, false, false, false, jon1.I(he81Var), true, false, 0, false, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (p860) null, (mgo0) null, false, false, -771, 1), 2);
        }
        return rih1.a;
    }

    private final Object h(Object obj) {
        si81 si81Var = (si81) this.e;
        qi81 qi81Var = (qi81) this.b;
        tqw tqwVar = (tqw) this.c;
        hm5.M(obj);
        if (qi81Var instanceof ni81) {
            ((lzn0) ((pt) this.d).d).a("spotify:user", cvl1.d(tqwVar), (Bundle) null);
        } else if (qi81Var instanceof pi81) {
            si81Var.c.a.invoke();
        } else {
            if (!(qi81Var instanceof oi81)) {
                eg.o();
                return null;
            }
            si81Var.d.a.invoke();
        }
        return rih1.a;
    }

    private final Object i(Object obj) {
        kby kbyVar;
        String str;
        zuc0 zuc0Var;
        boolean z;
        Object next;
        Object za9Var;
        ez91 ez91Var;
        List list;
        wyz0 wyz0VarI;
        py21 py21Var = (py21) this.b;
        py21 py21Var2 = (py21) this.c;
        py21 py21Var3 = (py21) this.d;
        hm5.M(obj);
        wsc0 wsc0Var = (wsc0) py21Var.c();
        if (wsc0Var == null || (((str = (kbyVar = wsc0Var.f).p) != null && str.length() != 0) || (zuc0Var = (zuc0) py21Var2.c()) == null)) {
            return null;
        }
        List list2 = zuc0Var.f;
        Map map = zuc0Var.g;
        List list3 = list2;
        int i = 0;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it = list3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                ll81 ll81Var = (ll81) it.next();
                if (u890.j(ll81Var.a, "set-reaction") && ll81Var.b == 1) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        Iterator it2 = list3.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            ll81 ll81Var2 = (ll81) next;
            if (u890.j(ll81Var2.a, "remove-reaction") && ll81Var2.b == 1) {
                break;
            }
        }
        String str2 = (((ll81) next) == null || (wyz0VarI = pvc.i(map)) == null) ? null : wyz0VarI.a;
        if (z && str2 != null) {
            za9Var = new xa9(str2);
        } else if (z) {
            za9Var = wa9.a;
        } else {
            za9Var = str2 != null ? new za9(str2) : ya9.a;
        }
        boolean z2 = !(za9Var instanceof ya9);
        iqi0 iqi0Var = (iqi0) py21Var3.c();
        if (iqi0Var != null && (list = iqi0Var.f) != null) {
            List<fji0> list4 = list;
            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                for (fji0 fji0Var : list4) {
                    if (!fji0Var.f.b()) {
                        wls0 wls0Var = fji0Var.f;
                        wls0Var.getClass();
                        if (wls0Var != wls0.a) {
                            continue;
                        }
                    }
                    i++;
                    if (i < 0) {
                        p7h.S();
                        throw null;
                    }
                }
            }
        }
        int i2 = i;
        boolean z3 = kbyVar.w.b;
        x4i1 x4i1Var = zuc0Var.d;
        lkj0 lkj0Var = zuc0Var.p;
        if (lkj0Var instanceof k1z) {
            ez91Var = bz91.a;
        } else if (u890.j(lkj0Var, hkj0.a)) {
            ez91Var = cz91.a;
        } else {
            if (!(lkj0Var instanceof fjf1)) {
                eg.o();
                return null;
            }
            ez91Var = dz91.a;
        }
        return new kz91(i2, z3, z2, x4i1Var, ez91Var);
    }

    private final Object j(Object obj) {
        glm0 glm0Var = (glm0) this.b;
        px60 px60Var = (px60) this.d;
        Boolean bool = (Boolean) this.c;
        hm5.M(obj);
        if (bool == null) {
            return null;
        }
        if (bool.booleanValue()) {
            return z6x.a;
        }
        return omd1.a(glm0Var, (px60Var instanceof nx60) && !((nx60) px60Var).a.isEmpty());
    }

    private final Object m(Object obj) {
        yxb0 yxb0Var = (yxb0) this.d;
        sde1 sde1Var = (sde1) this.c;
        rde1 rde1Var = (rde1) this.b;
        hm5.M(obj);
        if (rde1Var == null) {
            eg.o();
            return null;
        }
        if (sde1Var.h) {
            xab1 xab1Var = (xab1) yxb0Var.f;
            lnm lnmVar = null;
            if (xab1Var != null) {
                xab1Var.d((CancellationException) null);
            }
            yxb0Var.f = fn31.T((c9n) this.e, (o8n) null, 0, new q721(yxb0Var, sde1Var, rde1Var, lnmVar, (byte) 19), 3);
        }
        return rih1.a;
    }

    private final Object o(Object obj) {
        Collection collectionU0;
        g061 g061Var;
        xdg1 xdg1Var = (xdg1) this.b;
        vdg1 vdg1Var = (vdg1) this.c;
        hm5.M(obj);
        g061 g061Var2 = xdg1Var.b;
        List list = xdg1Var.a;
        Set setE = ha71.E(g061Var2);
        if (vdg1Var instanceof udg1) {
            int i = ((udg1) vdg1Var).b;
            if (setE.isEmpty()) {
                collectionU0 = Collections.singleton(Integer.valueOf(i));
            } else {
                Set set = setE;
                collectionU0 = (i == ((Number) o7h.I0(set)).intValue() || i == ((Number) o7h.F0(set)).intValue()) ? dm61.u0(Integer.valueOf(i), setE) : ha71.u(list, setE).contains(Integer.valueOf(i)) ? dm61.x0(Integer.valueOf(i), setE) : Collections.singleton(Integer.valueOf(i));
            }
            Collection collection = collectionU0;
            if (collection.isEmpty()) {
                g061Var = new g061(z6x.a);
            } else {
                List listZ0 = o7h.Z0(collection);
                ArrayList arrayList = new ArrayList();
                int iIntValue = ((Number) o7h.q0(listZ0)).intValue();
                int size = listZ0.size();
                int iIntValue2 = iIntValue;
                for (int i2 = 1; i2 < size; i2++) {
                    if (((Number) listZ0.get(i2)).intValue() == iIntValue2 + 1) {
                        iIntValue2 = ((Number) listZ0.get(i2)).intValue();
                    } else {
                        arrayList.add(new f061(iIntValue, iIntValue2));
                        iIntValue = ((Number) listZ0.get(i2)).intValue();
                        iIntValue2 = iIntValue;
                    }
                }
                arrayList.add(new f061(iIntValue, iIntValue2));
                g061Var = new g061(arrayList);
            }
            ((iu30) this.d).invoke(new xdg1(list, g061Var, xdg1Var.c));
        } else if (!(vdg1Var instanceof tdg1)) {
            eg.o();
            return null;
        }
        return rih1.a;
    }

    private final Object p(Object obj) {
        tmg1 tmg1Var = (tmg1) this.b;
        tqw tqwVar = (tqw) this.c;
        hm5.M(obj);
        if (!u890.j(tmg1Var, tmg1.a)) {
            eg.o();
            return null;
        }
        ((zmg1) ((nm1) this.d).f).a.k("spotify:transcript:languagepicker", tqwVar != null ? n3o1.y(tqwVar) : null, mno1.h(new mmr0[]{new mmr0("episode_uri", ((umg1) this.e).a)}), true);
        return rih1.a;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.e;
        switch (b) {
            case 0:
                w63 w63Var = new w63((s63) obj5, (lnm) obj4, (byte) 0);
                w63Var.b = (PlayerState) obj;
                w63Var.c = (Boolean) obj2;
                w63Var.d = (Boolean) obj3;
                return w63Var.invokeSuspend(rih1Var);
            case 1:
                w63 w63Var2 = new w63((ven0) obj5, (lnm) obj4, (byte) 1);
                w63Var2.b = (lc7) obj;
                w63Var2.c = (jc7) obj2;
                w63Var2.d = (tqw) obj3;
                w63Var2.invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                w63 w63Var3 = new w63((fob) obj5, (lnm) obj4, (byte) 2);
                w63Var3.b = (eob) obj;
                w63Var3.c = (cob) obj2;
                w63Var3.d = (tqw) obj3;
                w63Var3.invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                w63 w63Var4 = new w63((xpg) obj5, (lnm) obj4, (byte) 3);
                w63Var4.b = (cxc0) obj;
                w63Var4.c = (g3d0) obj2;
                w63Var4.d = (Set) obj3;
                return w63Var4.invokeSuspend(rih1Var);
            case 4:
                w63 w63Var5 = new w63((fbh) obj5, (lnm) obj4, (byte) 4);
                w63Var5.b = (Integer) obj;
                w63Var5.c = (cc10) obj2;
                w63Var5.d = (cy50) obj3;
                return w63Var5.invokeSuspend(rih1Var);
            case 5:
                w63 w63Var6 = new w63((j0l) obj5, (lnm) obj4, (byte) 5);
                w63Var6.b = (List) obj;
                w63Var6.c = (List) obj2;
                w63Var6.d = (pp90) obj3;
                return w63Var6.invokeSuspend(rih1Var);
            case 6:
                w63 w63Var7 = new w63(this.d, obj5, (lnm) obj4, (byte) 6);
                w63Var7.b = (Map) obj;
                w63Var7.c = (rmd) obj2;
                return w63Var7.invokeSuspend(rih1Var);
            case 7:
                w63 w63Var8 = new w63(this.d, obj5, (lnm) obj4, (byte) 7);
                w63Var8.b = (b920) obj;
                w63Var8.c = (y820) obj2;
                w63Var8.invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                w63 w63Var9 = new w63(this.d, obj5, (lnm) obj4, (byte) 8);
                w63Var9.b = (wi50) obj2;
                w63Var9.c = (tqw) obj3;
                w63Var9.invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                w63 w63Var10 = new w63((h3j1) obj5, (lnm) obj4, (byte) 9);
                w63Var10.b = (a7q0) obj;
                w63Var10.c = (uxn) obj2;
                w63Var10.d = (pn30) obj3;
                return w63Var10.invokeSuspend(rih1Var);
            case 10:
                w63 w63Var11 = new w63((z180) obj5, (lnm) obj4, (byte) 10);
                w63Var11.b = (l57) obj;
                w63Var11.c = (YourLibraryResponse) obj2;
                w63Var11.d = (YourLibraryResponse) obj3;
                return w63Var11.invokeSuspend(rih1Var);
            case 11:
                List list = (List) obj;
                ep90 ep90Var = (ep90) obj2;
                String str = ep90Var != null ? ep90Var.a : null;
                w63 w63Var12 = new w63((vx40) obj5, (lnm) obj4, (byte) 11);
                w63Var12.b = list;
                w63Var12.c = str;
                w63Var12.d = (String) obj3;
                return w63Var12.invokeSuspend(rih1Var);
            case 12:
                w63 w63Var13 = new w63((ytj0) obj5, (lnm) obj4, (byte) 12);
                w63Var13.b = (spq0) obj;
                w63Var13.c = (EsContextPlayerState.ContextPlayerState) obj2;
                w63Var13.d = (ibk0) obj3;
                return w63Var13.invokeSuspend(rih1Var);
            case 13:
                w63 w63Var14 = new w63(this.d, obj5, (lnm) obj4, (byte) 13);
                w63Var14.b = (qmp0) obj;
                w63Var14.c = (nmp0) obj2;
                w63Var14.invokeSuspend(rih1Var);
                return rih1Var;
            case 14:
                w63 w63Var15 = new w63((String) obj5, (lnm) obj4, (byte) 14);
                w63Var15.b = (ioj0) obj;
                w63Var15.c = (zkm) obj2;
                w63Var15.d = (hwt) obj3;
                return w63Var15.invokeSuspend(rih1Var);
            case 15:
                w63 w63Var16 = new w63((cm0) obj5, (lnm) obj4, (byte) 15);
                w63Var16.b = (hzv0) obj;
                w63Var16.c = (azv0) obj2;
                w63Var16.d = (tqw) obj3;
                w63Var16.invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                w63 w63Var17 = new w63((jn7) obj5, (lnm) obj4, (byte) 16);
                w63Var17.b = (jh5) obj;
                w63Var17.c = obj2;
                w63Var17.d = obj3;
                return w63Var17.invokeSuspend(rih1Var);
            case 17:
                w63 w63Var18 = new w63((qr11) obj5, (lnm) obj4, (byte) 17);
                w63Var18.b = (pr11) obj;
                w63Var18.c = (jwn) obj2;
                w63Var18.d = (Map) obj3;
                return w63Var18.invokeSuspend(rih1Var);
            case 18:
                w63 w63Var19 = new w63((qe31) obj5, (lnm) obj4, (byte) 18);
                w63Var19.b = (ne31) obj;
                w63Var19.c = (me31) obj2;
                w63Var19.d = (tqw) obj3;
                w63Var19.invokeSuspend(rih1Var);
                return rih1Var;
            case 19:
                w63 w63Var20 = new w63(this.d, obj5, (lnm) obj4, (byte) 19);
                w63Var20.b = (rnc0) obj;
                w63Var20.c = (qnc0) obj2;
                return w63Var20.invokeSuspend(rih1Var);
            case 20:
                w63 w63Var21 = new w63((qe31) obj5, (lnm) obj4, (byte) 20);
                w63Var21.b = (qob1) obj;
                w63Var21.c = (m500) obj2;
                w63Var21.d = (tqw) obj3;
                w63Var21.invokeSuspend(rih1Var);
                return rih1Var;
            case 21:
                w63 w63Var22 = new w63((hd81) obj5, (lnm) obj4, (byte) 21);
                w63Var22.b = (he81) obj;
                w63Var22.c = (cd81) obj2;
                w63Var22.d = (tqw) obj3;
                w63Var22.invokeSuspend(rih1Var);
                return rih1Var;
            case 22:
                w63 w63Var23 = new w63(this.d, obj5, (lnm) obj4, (byte) 22);
                w63Var23.b = (qi81) obj2;
                w63Var23.c = (tqw) obj3;
                w63Var23.invokeSuspend(rih1Var);
                return rih1Var;
            case 23:
                w63 w63Var24 = new w63((jz91) obj5, (lnm) obj4, (byte) 23);
                w63Var24.b = (py21) obj;
                w63Var24.c = (py21) obj2;
                w63Var24.d = (py21) obj3;
                return w63Var24.invokeSuspend(rih1Var);
            case 24:
                w63 w63Var25 = new w63((omd1) obj5, (lnm) obj4, (byte) 24);
                w63Var25.b = (glm0) obj;
                w63Var25.d = (px60) obj2;
                w63Var25.c = (Boolean) obj3;
                return w63Var25.invokeSuspend(rih1Var);
            case 25:
                w63 w63Var26 = new w63((sde1) this.c, (yxb0) this.d, (c9n) obj5, (lnm) obj4);
                w63Var26.b = (rde1) obj2;
                w63Var26.invokeSuspend(rih1Var);
                return rih1Var;
            case 26:
                w63 w63Var27 = new w63((tva1) obj5, (lnm) obj4, (byte) 26);
                w63Var27.b = (k1r) obj;
                w63Var27.c = (k1r) obj2;
                w63Var27.d = (k1r) obj3;
                return w63Var27.invokeSuspend(rih1Var);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                w63 w63Var28 = new w63(this.d, obj5, (lnm) obj4, (byte) 27);
                w63Var28.b = (xdg1) obj;
                w63Var28.c = (vdg1) obj2;
                w63Var28.invokeSuspend(rih1Var);
                return rih1Var;
            case 28:
                w63 w63Var29 = new w63(this.d, obj5, (lnm) obj4, (byte) 28);
                w63Var29.b = (tmg1) obj2;
                w63Var29.c = (tqw) obj3;
                w63Var29.invokeSuspend(rih1Var);
                return rih1Var;
            default:
                w63 w63Var30 = new w63(this.d, obj5, (lnm) obj4, (byte) 29);
                w63Var30.b = (lzh1) obj2;
                w63Var30.c = (tqw) obj3;
                w63Var30.invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:213:0x0462  */
    /* JADX WARN: Code duplicated, block: B:321:0x0715  */
    /* JADX WARN: Code duplicated, block: B:334:0x0740  */
    /* JADX WARN: Code duplicated, block: B:395:0x095b  */
    /* JADX WARN: Code duplicated, block: B:396:0x095e  */
    /* JADX WARN: Code duplicated, block: B:403:0x0972  */
    /* JADX WARN: Code duplicated, block: B:413:0x09b9  */
    /* JADX WARN: Code duplicated, block: B:431:0x0a03 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:432:0x0a05  */
    /* JADX WARN: Code duplicated, block: B:433:0x0a0e  */
    /* JADX WARN: Code duplicated, block: B:435:0x0a14  */
    /* JADX WARN: Code duplicated, block: B:437:0x0a1e  */
    /* JADX WARN: Code duplicated, block: B:441:0x0a34  */
    /* JADX WARN: Code duplicated, block: B:447:0x0a58  */
    /* JADX WARN: Code duplicated, block: B:450:0x0a67  */
    /* JADX WARN: Code duplicated, block: B:451:0x0a6a  */
    /* JADX WARN: Code duplicated, block: B:453:0x0a70  */
    /* JADX WARN: Code duplicated, block: B:454:0x0a73  */
    /* JADX WARN: Code duplicated, block: B:457:0x0a8f  */
    /* JADX WARN: Code duplicated, block: B:458:0x0a92  */
    /* JADX WARN: Code duplicated, block: B:465:0x0aa8  */
    /* JADX WARN: Code duplicated, block: B:468:0x0ac1  */
    /* JADX WARN: Code duplicated, block: B:469:0x0ac4  */
    /* JADX WARN: Code duplicated, block: B:470:0x0ac7  */
    /* JADX WARN: Code duplicated, block: B:471:0x0acc  */
    /* JADX WARN: Code duplicated, block: B:472:0x0acf  */
    /* JADX WARN: Code duplicated, block: B:473:0x0ad2  */
    /* JADX WARN: Code duplicated, block: B:474:0x0ad5  */
    /* JADX WARN: Code duplicated, block: B:475:0x0ad8  */
    /* JADX WARN: Code duplicated, block: B:476:0x0adb  */
    /* JADX WARN: Code duplicated, block: B:477:0x0ade  */
    /* JADX WARN: Code duplicated, block: B:480:0x0ae6  */
    /* JADX WARN: Code duplicated, block: B:482:0x0aea  */
    /* JADX WARN: Code duplicated, block: B:485:0x0afd  */
    /* JADX WARN: Code duplicated, block: B:488:0x0b0b  */
    /* JADX WARN: Code duplicated, block: B:494:0x0b26  */
    /* JADX WARN: Code duplicated, block: B:500:0x0b38  */
    /* JADX WARN: Code duplicated, block: B:501:0x0b42  */
    /* JADX WARN: Code duplicated, block: B:503:0x0b46  */
    /* JADX WARN: Code duplicated, block: B:506:0x0b52  */
    /* JADX WARN: Code duplicated, block: B:507:0x0b57  */
    /* JADX WARN: Code duplicated, block: B:513:0x0b64  */
    /* JADX WARN: Code duplicated, block: B:515:0x0b67  */
    /* JADX WARN: Code duplicated, block: B:516:0x0b6a  */
    /* JADX WARN: Code duplicated, block: B:521:0x0b78  */
    /* JADX WARN: Code duplicated, block: B:646:0x0b20 A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v11 java.lang.Object, still in use, count: 2, list:
          (r11v11 java.lang.Object) from 0x0957: PHI (r11 I:??) = (r11v7 java.lang.Object), (r11v11 java.lang.Object) binds: [B:392:0x0956, B:644:0x0957] A[DONT_GENERATE, DONT_INLINE]
          (r11v11 java.lang.Object) from 0x0947: CHECK_CAST (p.i0l) (r11v11 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r46) {
        /*
            Method dump skipped, instruction units count: 3446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.w63.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w63(Object obj, lnm lnmVar, byte b) {
        super(4, lnmVar);
        this.a = b;
        this.e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w63(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(4, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
    }
}
