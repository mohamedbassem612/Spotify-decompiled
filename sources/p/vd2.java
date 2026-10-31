package p;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.contribution.repositoryimpl.f;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vd2 extends a8d1 implements zu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vd2(xpw xpwVar, Object obj, lnm lnmVar, byte b) {
        super(4, lnmVar);
        this.a = b;
        this.c = xpwVar;
        this.d = obj;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        byte b2 = 4;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                vd2 vd2Var = new vd2((int) b2, (lnm) obj4, (byte) 0);
                vd2Var.b = (Integer) obj;
                vd2Var.c = (pb2) obj2;
                vd2Var.d = (lax) obj3;
                return vd2Var.invokeSuspend(rih1Var);
            case 1:
                vd2 vd2Var2 = new vd2((int) b2, (lnm) obj4, (byte) 1);
                vd2Var2.b = (jre) obj;
                vd2Var2.c = (vo2) obj2;
                vd2Var2.d = (jre) obj3;
                return vd2Var2.invokeSuspend(rih1Var);
            case 2:
                vd2 vd2Var3 = new vd2(this.d, (lnm) obj4, (byte) 2);
                vd2Var3.b = (e87) obj;
                vd2Var3.c = (c87) obj2;
                vd2Var3.invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                vd2 vd2Var4 = new vd2(this.d, (lnm) obj4, (byte) 3);
                vd2Var4.b = (gb8) obj2;
                vd2Var4.c = (tqw) obj3;
                vd2Var4.invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                vd2 vd2Var5 = new vd2((ic9) this.d, (lnm) obj4, b2);
                vd2Var5.b = (String) obj2;
                vd2Var5.c = (tv80) obj3;
                vd2Var5.invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                vd2 vd2Var6 = new vd2(this.d, (lnm) obj4, (byte) 5);
                vd2Var6.b = (tad) obj2;
                vd2Var6.c = (tqw) obj3;
                vd2Var6.invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                vd2 vd2Var7 = new vd2(this.d, (lnm) obj4, (byte) 6);
                vd2Var7.b = (z7h) obj;
                vd2Var7.c = (y7h) obj2;
                vd2Var7.invokeSuspend(rih1Var);
                return rih1Var;
            case 7:
                vd2 vd2Var8 = new vd2((pt) this.c, (swh) this.d, (lnm) obj4, (byte) 7);
                vd2Var8.b = (rwh) obj2;
                vd2Var8.invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                vd2 vd2Var9 = new vd2(this.d, (lnm) obj4, (byte) 8);
                vd2Var9.b = (twl) obj;
                vd2Var9.c = (nwl) obj2;
                vd2Var9.invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                vd2 vd2Var10 = new vd2(this.d, (lnm) obj4, (byte) 9);
                vd2Var10.b = obj2;
                vd2Var10.c = obj3;
                return vd2Var10.invokeSuspend(rih1Var);
            case 10:
                vd2 vd2Var11 = new vd2(this.d, (lnm) obj4, (byte) 10);
                vd2Var11.b = (jh5) obj;
                vd2Var11.c = obj2;
                vd2Var11.invokeSuspend(rih1Var);
                throw null;
            case 11:
                vd2 vd2Var12 = new vd2((int) b2, (lnm) obj4, (byte) 11);
                vd2Var12.b = (o2o) obj;
                vd2Var12.c = (xkk1) obj2;
                vd2Var12.d = (jo70) obj3;
                return vd2Var12.invokeSuspend(rih1Var);
            case 12:
                vd2 vd2Var13 = new vd2(this.d, (lnm) obj4, (byte) 12);
                vd2Var13.b = (w0v) obj;
                vd2Var13.c = (q0v) obj2;
                vd2Var13.invokeSuspend(rih1Var);
                return rih1Var;
            case 13:
                vd2 vd2Var14 = new vd2((int) b2, (lnm) obj4, (byte) 13);
                vd2Var14.b = (Map) obj;
                vd2Var14.c = (f130) obj2;
                vd2Var14.d = (YourLibraryResponse) obj3;
                return vd2Var14.invokeSuspend(rih1Var);
            case 14:
                vd2 vd2Var15 = new vd2(this.d, (lnm) obj4, (byte) 14);
                vd2Var15.b = (ge21) obj;
                vd2Var15.c = (fe21) obj2;
                vd2Var15.invokeSuspend(rih1Var);
                return rih1Var;
            case 15:
                vd2 vd2Var16 = new vd2(this.d, (lnm) obj4, (byte) 15);
                vd2Var16.b = (km61) obj;
                vd2Var16.c = (tv80) obj3;
                vd2Var16.invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                vd2 vd2Var17 = new vd2(this.d, (lnm) obj4, (byte) 16);
                vd2Var17.b = (r820) obj2;
                vd2Var17.c = (tqw) obj3;
                vd2Var17.invokeSuspend(rih1Var);
                return rih1Var;
            case 17:
                vd2 vd2Var18 = new vd2(this.d, (lnm) obj4, (byte) 17);
                vd2Var18.b = (o180) obj;
                vd2Var18.c = (n180) obj2;
                vd2Var18.invokeSuspend(rih1Var);
                return rih1Var;
            case 18:
                vd2 vd2Var19 = new vd2(this.d, (lnm) obj4, (byte) 18);
                vd2Var19.b = (ih80) obj2;
                vd2Var19.c = (tqw) obj3;
                vd2Var19.invokeSuspend(rih1Var);
                return rih1Var;
            case 19:
                vd2 vd2Var20 = new vd2((int) b2, (lnm) obj4, (byte) 19);
                vd2Var20.b = (cxc0) obj;
                vd2Var20.c = (Set) obj2;
                vd2Var20.d = (Map) obj3;
                return vd2Var20.invokeSuspend(rih1Var);
            case 20:
                vd2 vd2Var21 = new vd2((int) b2, (lnm) obj4, (byte) 20);
                vd2Var21.b = (Long) obj;
                vd2Var21.c = (PlayerState) obj2;
                vd2Var21.d = (Boolean) obj3;
                return vd2Var21.invokeSuspend(rih1Var);
            case 21:
                vd2 vd2Var22 = new vd2((int) b2, (lnm) obj4, (byte) 21);
                vd2Var22.b = (List) obj;
                vd2Var22.c = (List) obj2;
                vd2Var22.d = (List) obj3;
                return vd2Var22.invokeSuspend(rih1Var);
            case 22:
                vd2 vd2Var23 = new vd2((int) b2, (lnm) obj4, (byte) 22);
                vd2Var23.b = (k1r) obj;
                vd2Var23.c = (zkm) obj2;
                vd2Var23.d = (hwt) obj3;
                return vd2Var23.invokeSuspend(rih1Var);
            case 23:
                vd2 vd2Var24 = new vd2((int) b2, (lnm) obj4, (byte) 23);
                vd2Var24.b = (qnx0) obj;
                vd2Var24.c = (PlayerState) obj2;
                vd2Var24.d = (ijo) obj3;
                return vd2Var24.invokeSuspend(rih1Var);
            case 24:
                vd2 vd2Var25 = new vd2((e701) this.c, (v601) this.d, (lnm) obj4, (byte) 24);
                vd2Var25.b = (z601) obj2;
                vd2Var25.invokeSuspend(rih1Var);
                return rih1Var;
            case 25:
                vd2 vd2Var26 = new vd2((int) b2, (lnm) obj4, (byte) 25);
                vd2Var26.b = (k1r) obj;
                vd2Var26.c = (String) obj2;
                vd2Var26.d = (i091) obj3;
                return vd2Var26.invokeSuspend(rih1Var);
            case 26:
                vd2 vd2Var27 = new vd2((wy61) this.c, (oy61) this.d, (lnm) obj4, (byte) 26);
                vd2Var27.b = (jy61) obj2;
                vd2Var27.invokeSuspend(rih1Var);
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                vd2 vd2Var28 = new vd2((wy61) this.c, (a371) this.d, (lnm) obj4, (byte) 27);
                vd2Var28.b = (z271) obj2;
                vd2Var28.invokeSuspend(rih1Var);
                return rih1Var;
            case 28:
                vd2 vd2Var29 = new vd2((sa71) this.c, (ven0) this.d, (lnm) obj4, (byte) 28);
                vd2Var29.b = (pa71) obj2;
                vd2Var29.invokeSuspend(rih1Var);
                return rih1Var;
            default:
                vd2 vd2Var30 = new vd2((int) b2, (lnm) obj4, (byte) 29);
                vd2Var30.b = (ioj0) obj;
                vd2Var30.c = (whx0) obj2;
                vd2Var30.d = (Set) obj3;
                return vd2Var30.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        z = false;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        String hreVar = null;
        switch (b) {
            case 0:
                Integer num = (Integer) this.b;
                pb2 pb2Var = (pb2) this.c;
                lax laxVar = (lax) this.d;
                hm5.M(obj);
                return new td2(num, pb2Var, laxVar);
            case 1:
                jre jreVar = (jre) this.b;
                vo2 vo2Var = (vo2) this.c;
                jre jreVar2 = (jre) this.d;
                hm5.M(obj);
                if (jreVar2 != null) {
                    return jreVar2;
                }
                if (!u890.j(vo2Var, qo2.a)) {
                    if (u890.j(vo2Var, to2.a)) {
                        hreVar = new hre("Something went wrong. Try again?");
                    } else if (u890.j(vo2Var, ro2.a)) {
                        hreVar = new dre(1);
                    } else if (u890.j(vo2Var, oo2.a)) {
                        hreVar = new dre(2);
                    } else if (vo2Var instanceof so2) {
                        kw01 kw01Var = ((so2) vo2Var).c;
                        hreVar = new hre(kw01Var != null ? cy30.p("Found it! It's ", kw01Var.a, " by ", o7h.y0(kw01Var.b, ", ", (String) null, (String) null, (iu30) null, 62), ".") : "Found it, but I couldn't load the track details.");
                    } else if (vo2Var instanceof uo2) {
                        hreVar = new hre("I couldn't find anything. Try again?");
                    } else {
                        if (!u890.j(vo2Var, po2.a)) {
                            eg.o();
                            return null;
                        }
                        hreVar = new hre("Something went wrong. Try again?");
                    }
                }
                return hreVar == null ? jreVar : hreVar;
            case 2:
                e87 e87Var = (e87) this.b;
                c87 c87Var = (c87) this.c;
                hm5.M(obj);
                if (!u890.j(c87Var, c87.a)) {
                    eg.o();
                    return null;
                }
                if (e87Var.c) {
                    return rih1Var;
                }
                ((d87) ((ven0) this.d).getValue()).c.invoke();
                return rih1Var;
            case 3:
                gb8 gb8Var = (gb8) this.b;
                tqw tqwVar = (tqw) this.c;
                hm5.M(obj);
                if (!u890.j(gb8Var, gb8.a)) {
                    eg.o();
                    return null;
                }
                if (tqwVar == null) {
                    return rih1Var;
                }
                ((lzn0) ((br0) this.d).c).a("spotify:genre:0JQ5DAqbMKFETqK4t8f1n3", n3o1.y(tqwVar), (Bundle) null);
                return rih1Var;
            case 4:
                String str = (String) this.b;
                tv80 tv80Var = (tv80) this.c;
                hm5.M(obj);
                lzn0 lzn0Var = (lzn0) ((ic9) this.d).b;
                if (tv80Var != null) {
                    lzn0Var.a(str, tv80Var, (Bundle) null);
                } else {
                    lzn0Var.h(str);
                }
                return rih1Var;
            case 5:
                hbd hbdVar = (hbd) this.d;
                rad radVar = (tad) this.b;
                tqw tqwVar2 = (tqw) this.c;
                hm5.M(obj);
                if (u890.j(radVar, sad.a)) {
                    pcf.a(hbdVar.a, nik1.e1.a, tqwVar2 != null ? n3o1.y(tqwVar2) : null, (Bundle) null);
                } else if (!u890.j(radVar, qad.a)) {
                    if (!(radVar instanceof rad)) {
                        eg.o();
                        return null;
                    }
                    wb2 wb2Var = hbdVar.b;
                    rad radVar2 = radVar;
                    cb2 cb2Var = new cb2(radVar2.a);
                    hreVar = tqwVar2 != null ? n3o1.y(tqwVar2) : null;
                    Intent intent = radVar2.b;
                    wb2 wb2Var2 = wb2Var;
                    wb2Var2.getClass();
                    wb2Var2.c(new te2(cb2Var), true, hreVar, intent);
                }
                hbdVar.c.invoke(radVar);
                return rih1Var;
            case 6:
                z7h z7hVar = (z7h) this.b;
                w7h w7hVar = (y7h) this.c;
                hm5.M(obj);
                if (!(w7hVar instanceof w7h)) {
                    if (w7hVar instanceof x7h) {
                        return rih1Var;
                    }
                    eg.o();
                    return null;
                }
                d9h d9hVar = (d9h) o7h.t0(w7hVar.a, z7hVar.a);
                if (d9hVar == null) {
                    return rih1Var;
                }
                ((c8h) this.d).b.invoke(d9hVar);
                return rih1Var;
            case 7:
                rwh rwhVar = (rwh) this.b;
                hm5.M(obj);
                if (rwhVar != null) {
                    ((zrg) ((pt) this.c).h).b(((swh) this.d).a, rwhVar.a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 8:
                twl twlVar = (twl) this.b;
                nwl nwlVar = (nwl) this.c;
                hm5.M(obj);
                if ((nwlVar instanceof mwl) && (twlVar instanceof qwl)) {
                    ((s801) ((uwl) this.d).t).a(((qwl) twlVar).a, false);
                }
                return rih1Var;
            case 9:
                Object obj2 = this.b;
                Object obj3 = this.c;
                hm5.M(obj);
                return new m441(new ae1(obj3, (trm) obj2, (f) this.d, (lnm) null, (byte) 6));
            case 10:
                jh5 jh5Var = (jh5) this.b;
                hm5.M(obj);
                Object obj4 = jh5Var.b;
                throw new ClassCastException();
            case 11:
                o2o o2oVar = (o2o) this.b;
                xkk1 xkk1Var = (xkk1) this.c;
                jo70 jo70Var = (jo70) this.d;
                hm5.M(obj);
                return new p1o(o2oVar, xkk1Var, jo70Var);
            case 12:
                w0v w0vVar = (w0v) this.b;
                q0v q0vVar = (q0v) this.c;
                hm5.M(obj);
                ((tvr) this.d).c.invoke(w0vVar.a, q0vVar);
                return rih1Var;
            case 13:
                Map map = (Map) this.b;
                f130 f130Var = (f130) this.c;
                YourLibraryResponse yourLibraryResponse = (YourLibraryResponse) this.d;
                hm5.M(obj);
                return new bbs(f130Var, yourLibraryResponse, map);
            case 14:
                ge21 ge21Var = (ge21) this.b;
                fe21 fe21Var = (fe21) this.c;
                hm5.M(obj);
                if (pjs.a[fe21Var.ordinal()] == 1) {
                    ((tbr0) ((br0) this.d).c).a(new y231(new qxm1(ge21Var.a.a.getId(), ge21Var.a.b)));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 15:
                km61 km61Var = (km61) this.b;
                tv80 tv80Var2 = (tv80) this.c;
                hm5.M(obj);
                yzu yzuVar = (yzu) this.d;
                k9r k9rVar = (k9r) yzuVar.b;
                if (k9rVar.q()) {
                    if (!k9rVar.q()) {
                        hhg1.n("Failed requirement.");
                        return null;
                    }
                    lzn0 lzn0Var2 = (lzn0) k9rVar.b;
                    if (tv80Var2 != null) {
                        lzn0Var2.a("spotify:internal:equalizer", tv80Var2, (Bundle) null);
                        return rih1Var;
                    }
                    lzn0Var2.h("spotify:internal:equalizer");
                    return rih1Var;
                }
                String[] systemSharedLibraryNames = ((Activity) yzuVar.a).getPackageManager().getSystemSharedLibraryNames();
                if (systemSharedLibraryNames != null) {
                    for (String str2 : systemSharedLibraryNames) {
                        if (u890.j(str2, "com.sony.device")) {
                            yzuVar.K();
                            return rih1Var;
                        }
                    }
                }
                if (km61.a(km61Var, "warning", null, true, 2)) {
                    return rih1Var;
                }
                yzuVar.K();
                return rih1Var;
            case 16:
                r820 r820Var = (r820) this.b;
                tqw tqwVar3 = (tqw) this.c;
                hm5.M(obj);
                ((jg7) ((tm) this.d).e).invoke(r820Var, tqwVar3 != null ? n3o1.y(tqwVar3).a : null);
                return rih1Var;
            case 17:
                o180 o180Var = (o180) this.b;
                m180 m180Var = (n180) this.c;
                hm5.M(obj);
                if (!(m180Var instanceof m180)) {
                    if (m180Var instanceof l180) {
                        return rih1Var;
                    }
                    eg.o();
                    return null;
                }
                ax70 ax70Var = (ax70) o7h.t0(m180Var.a, o180Var.a);
                if (ax70Var == null) {
                    return rih1Var;
                }
                ((q180) this.d).b.invoke(ax70Var);
                return rih1Var;
            case 18:
                ih80 ih80Var = (ih80) this.b;
                tqw tqwVar4 = (tqw) this.c;
                hm5.M(obj);
                if (ih80Var == null) {
                    eg.o();
                    return null;
                }
                if (tqwVar4 == null) {
                    return rih1Var;
                }
                ((lzn0) ((rwj) this.d).f).a(ih80Var.a, n3o1.y(tqwVar4), (Bundle) null);
                return rih1Var;
            case 19:
                cxc0 cxc0Var = (cxc0) this.b;
                Set set = (Set) this.c;
                Map map2 = (Map) this.d;
                ArrayList arrayListJ = hrt.j(obj);
                Iterator it = map2.entrySet().iterator();
                while (it.hasNext()) {
                    r7h.W((Iterable) ((Map.Entry) it.next()).getValue(), arrayListJ);
                }
                return new yvg1(cxc0Var, set, arrayListJ);
            case 20:
                Long l = (Long) this.b;
                PlayerState playerState = (PlayerState) this.c;
                Boolean bool = (Boolean) this.d;
                hm5.M(obj);
                return new yvg1(l, playerState, bool);
            case 21:
                List list = (List) this.b;
                List list2 = (List) this.c;
                List list3 = (List) this.d;
                hm5.M(obj);
                return new yvg1(list, list2, list3);
            case 22:
                k1r k1rVar = (k1r) this.b;
                zkm zkmVar = (zkm) this.c;
                hwt hwtVar = (hwt) this.d;
                hm5.M(obj);
                return new ant0((ont0) u890.k(k1rVar, (d0r) null, (n4r) null), zkmVar, hwtVar);
            case 23:
                qnx0 qnx0Var = (qnx0) this.b;
                PlayerState playerState2 = (PlayerState) this.c;
                ijo ijoVar = (ijo) this.d;
                hm5.M(obj);
                pnx0 pnx0Var = qnx0Var.a;
                w281 w281Var = qnx0Var.b;
                String strContextUri = playerState2.contextUri();
                ContextTrack contextTrack = (ContextTrack) playerState2.track().h();
                hreVar = contextTrack != null ? contextTrack.uri() : null;
                if (playerState2.isPlaying() && !playerState2.isPaused()) {
                    z = true;
                }
                return new fa10(pnx0Var, w281Var, new alm(strContextUri, hreVar, z), ijoVar, qnx0Var.c, qnx0Var.d, qnx0Var.e);
            case 24:
                String str3 = ((v601) this.d).a;
                e701 e701Var = (e701) this.c;
                z601 z601Var = (z601) this.b;
                hm5.M(obj);
                if (u890.j(z601Var, w601.a) || u890.j(z601Var, x601.a)) {
                    ((s801) e701Var.i).a(str3, false);
                    return rih1Var;
                }
                if (u890.j(z601Var, y601.a)) {
                    ((jz51) e701Var.t).a(str3);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 25:
                k1r k1rVar2 = (k1r) this.b;
                String str4 = (String) this.c;
                i091 i091Var = (i091) this.d;
                hm5.M(obj);
                return new yvg1(k1rVar2, str4, i091Var);
            case 26:
                jy61 jy61Var = (jy61) this.b;
                hm5.M(obj);
                if (u890.j(jy61Var, jy61.a)) {
                    ((wy61) this.c).c.a(((oy61) this.d).a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                z271 z271Var = (z271) this.b;
                hm5.M(obj);
                if (u890.j(z271Var, z271.a)) {
                    ((wy61) this.c).c.a(((a371) this.d).a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 28:
                pa71 pa71Var = (pa71) this.b;
                hm5.M(obj);
                if (!(pa71Var instanceof pa71)) {
                    eg.o();
                    return null;
                }
                long j = pa71Var.a;
                long j2 = pa71Var.b;
                if (j2 <= 0) {
                    return rih1Var;
                }
                ((ven0) this.d).setValue(Float.valueOf(((int) Math.rint((j / j2) * 1000.0f)) / 1000.0f));
                return rih1Var;
            default:
                ioj0 ioj0Var = (ioj0) this.b;
                whx0 whx0Var = (whx0) this.c;
                Set set2 = (Set) this.d;
                hm5.M(obj);
                return new b181(ioj0Var, whx0Var.a, set2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vd2(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vd2(Object obj, lnm lnmVar, byte b) {
        super(4, lnmVar);
        this.a = b;
        this.d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vd2(byte b) {
        super(4, (lnm) null);
        this.a = b;
    }
}
