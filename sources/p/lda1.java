package p;

import app.rive.runtime.kotlin.fonts.Fonts;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.player.model.Context;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.PlayAsNextInQueueCommand;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.PlayOptions;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class lda1 extends tv30 implements vu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lda1(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    /* JADX WARN: Code duplicated, block: B:193:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:194:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:69:0x0260  */
    public final Object invoke(Object obj, Object obj2) {
        byte[] bArr;
        goj0 goj0VarA;
        jo70 jo70Var;
        List list;
        ho70 ho70Var;
        goj0 goj0VarA2;
        jo70 jo70Var2;
        boolean z;
        String str;
        goj0 goj0VarA3;
        zd3 zd3Var;
        byte b = this.a;
        ddj1 ddj1Var = ddj1.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                String str2 = (String) obj;
                tv80 tv80Var = (tv80) obj2;
                pda1 pda1Var = (pda1) ((lyc) this).receiver;
                if (tv80Var != null) {
                    pda1Var.getClass();
                    pda1Var.f(new lsn0((String) null, tv80Var.a));
                }
                pda1Var.q.setValue(str2);
                return rih1Var;
            case 1:
                String str3 = (String) obj;
                tv80 tv80Var2 = (tv80) obj2;
                pda1 pda1Var2 = (pda1) ((lyc) this).receiver;
                if (tv80Var2 != null) {
                    pda1Var2.getClass();
                    pda1Var2.f(new lsn0((String) null, tv80Var2.a));
                }
                pda1Var2.r.setValue(str3);
                return rih1Var;
            case 2:
                String str4 = (String) obj;
                int iIntValue = ((Number) obj2).intValue();
                t25 t25Var = (t25) ((lyc) this).receiver;
                t25Var.getClass();
                Set setY = don1.y(str4);
                List list2 = (List) t25Var.d.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list2) {
                    String lang = ((Fonts.Family) obj3).getLang();
                    if (lang == null) {
                        lang = "";
                    }
                    Set setY2 = don1.y(lang);
                    if (!(setY2 instanceof Collection) || !setY2.isEmpty()) {
                        Iterator it = setY2.iterator();
                        while (it.hasNext()) {
                            if (setY.contains((String) it.next())) {
                                arrayList.add(obj3);
                            }
                            break;
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    r7h.W(q7h.V(((Fonts.Family) it2.next()).getFonts().values()), arrayList2);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : arrayList2) {
                    Fonts.Font font = (Fonts.Font) obj4;
                    if (u890.j(font.getStyle(), "normal") && !u890.j(font.getFallbackFor(), "serif")) {
                        arrayList3.add(obj4);
                    }
                }
                Iterator it3 = o7h.a1(arrayList3, new s25(iIntValue, (byte) 0)).iterator();
                do {
                    if (it3.hasNext()) {
                        Fonts.Font font2 = (Fonts.Font) it3.next();
                        LinkedHashMap linkedHashMap = t25Var.e;
                        File file = (File) t25Var.b.invoke(font2);
                        if (file == null) {
                            bArr = null;
                        } else {
                            if (!linkedHashMap.containsKey(file)) {
                                linkedHashMap.put(file, t25Var.c.invoke(font2));
                            }
                            bArr = (byte[]) linkedHashMap.get(file);
                        }
                    } else {
                        bArr = null;
                    }
                    if (bArr != null) {
                        return bArr;
                    }
                    Logger.k("No usable Rive system font for %s, weight %s", new Object[]{str4, Integer.valueOf(iIntValue)});
                    return null;
                } while (bArr == null);
                if (bArr != null) {
                    return bArr;
                }
                Logger.k("No usable Rive system font for %s, weight %s", new Object[]{str4, Integer.valueOf(iIntValue)});
                return null;
            case 3:
                ioj0 ioj0Var = (ioj0) obj2;
                ((glf1) ((lyc) this).receiver).getClass();
                ArrayList<String> arrayList4 = ((blf1) obj).a;
                ArrayList arrayList5 = new ArrayList(q7h.U(arrayList4, 10));
                for (String str5 : arrayList4) {
                    hoj0 hoj0VarC = ioj0Var.c(jo70.class, str5);
                    String str6 = (hoj0VarC == null || (goj0VarA2 = hoj0VarC.a()) == null || (jo70Var2 = (jo70) goj0VarA2.a) == null) ? null : jo70Var2.a;
                    if (str6 == null) {
                        str6 = "";
                    }
                    hoj0 hoj0VarC2 = ioj0Var.c(jo70.class, str5);
                    String str7 = (hoj0VarC2 == null || (goj0VarA = hoj0VarC2.a()) == null || (jo70Var = (jo70) goj0VarA.a) == null || (list = jo70Var.d) == null || (ho70Var = (ho70) o7h.s0(list)) == null) ? null : ho70Var.a;
                    if (str7 == null) {
                        str7 = "";
                    }
                    arrayList5.add(new flf1(str6, str7));
                }
                ArrayList arrayList6 = new ArrayList();
                for (Object obj5 : arrayList5) {
                    flf1 flf1Var = (flf1) obj5;
                    if (flf1Var.a.length() > 0 && flf1Var.b.length() > 0) {
                        arrayList6.add(obj5);
                    }
                }
                return arrayList6.isEmpty() ? clf1.a : new dlf1(arrayList6);
            case 4:
                y4g1 y4g1Var = (y4g1) obj;
                c5g1 c5g1Var = (c5g1) obj2;
                ((i5g1) ((lyc) this).receiver).getClass();
                w5g1 w5g1Var = c5g1Var.a;
                if (!(w5g1Var instanceof w5g1)) {
                    return z4g1.a;
                }
                e5g1 e5g1Var = c5g1Var.b;
                return new a5g1(w5g1Var.a, e5g1Var != null ? e5g1Var.d : null, e5g1Var != null ? e5g1Var.a : ast0.c, e5g1Var != null ? e5g1Var.b : v4m.a, e5g1Var != null ? e5g1Var.c : p840.a, y4g1Var.a);
            case 5:
                a8b0 a8b0Var = (a8b0) obj;
                a8b0 a8b0Var2 = (a8b0) obj2;
                ((v0h1) ((lyc) this).receiver).getClass();
                bao0.b.getClass();
                cao0 cao0Var = aao0.b;
                return Boolean.valueOf(cao0Var.b(a8b0Var, a8b0Var2) && !cao0Var.b(a8b0Var2, a8b0Var));
            case 6:
                return Boolean.valueOf(((cao0) ((lyc) this).receiver).a((a8b0) obj, (a8b0) obj2));
            case 7:
                ioj0 ioj0Var2 = (ioj0) obj2;
                String str8 = ((lnh1) obj).a;
                if (((onh1) ((lyc) this).receiver).d.a()) {
                    hoj0 hoj0VarC3 = ioj0Var2.c(zd3.class, str8);
                    if ((hoj0VarC3 == null || (goj0VarA3 = hoj0VarC3.a()) == null || (zd3Var = (zd3) goj0VarA3.a) == null) ? false : zd3Var.e) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                String str9 = onh1.e(ioj0Var2.c(jo70.class, str8)).a;
                up70 up70VarA = onh1.e(ioj0Var2.c(xkk1.class, str8)).a.a(vp70.c);
                return new mnh1(str9, (up70VarA == null || (str = up70VarA.a.a) == null) ? "" : str, onh1.e(ioj0Var2.c(iam.class, str8)).a, Long.valueOf(onh1.e(ioj0Var2.c(zoy0.class, str8)).c), z);
            case 8:
                taj1 taj1Var = (taj1) obj;
                adj1 adj1Var = (edj1) obj2;
                ((gcj1) ((lyc) this).receiver).getClass();
                if (adj1Var.equals(ddj1Var)) {
                    return Next.j();
                }
                if (adj1Var instanceof adj1) {
                    adj1 adj1Var2 = adj1Var;
                    return !u890.j(adj1Var2.a(), taj1Var) ? Next.i(new xcj1(taj1Var, adj1Var2.e(), false, false, false, adj1Var2.b(), 60), Effects.a(new ic80[]{new ic80(taj1Var.a)})) : Next.j();
                }
                eg.o();
                return null;
            case 9:
                taj1 taj1Var2 = (taj1) obj;
                adj1 adj1Var3 = (edj1) obj2;
                ((hcj1) ((lyc) this).receiver).getClass();
                if (adj1Var3.equals(ddj1Var)) {
                    return Next.j();
                }
                if (adj1Var3 instanceof adj1) {
                    adj1 adj1Var4 = adj1Var3;
                    return !u890.j(adj1Var4.a(), taj1Var2) ? Next.i(new xcj1(taj1Var2, adj1Var4.e(), false, false, false, adj1Var4.b(), 60), Effects.a(new hc80[]{new hc80(taj1Var2.a)})) : Next.j();
                }
                eg.o();
                return null;
            case 10:
                Object objI = fc11.i(((bcj1) ((lyc) this).receiver).f.a(((gq0) obj).a).o(Functions.h), (lnm) obj2);
                return objI == d9nVar ? objI : rih1Var;
            case 11:
                Object objI2 = fc11.i(((wcj1) ((lyc) this).receiver).f.a(((gq0) obj).a).o(Functions.h), (lnm) obj2);
                return objI2 == d9nVar ? objI2 : rih1Var;
            case 12:
                return ((kmj1) ((lyc) this).receiver).c((Boolean) obj, (qxc0) obj2);
            case 13:
                j1l1 j1l1Var = (j1l1) ((lyc) this).receiver;
                j1l1Var.getClass();
                CommandOptions commandOptions = j1l1.x;
                boolean zC = ((PlayerState) obj).track().c();
                String str10 = ((t0l1) obj2).a;
                return zC ? j1l1Var.d.a(new f9u0(PlayAsNextInQueueCommand.builder(Collections.singletonList(ContextTrack.create(str10))).options(commandOptions).build())) : j1l1Var.g.a(PlayCommand.builder(Context.fromUri(str10), PlayOrigin.create("vteceffecthandlerfactory")).playOptions(PlayOptions.builder().commandOptions(commandOptions).build()).build());
            case 14:
                PlayerState playerState = (PlayerState) obj;
                s0l1 s0l1Var = (s0l1) obj2;
                j1l1 j1l1Var2 = (j1l1) ((lyc) this).receiver;
                j1l1Var2.getClass();
                if (playerState.isPlaying() && !playerState.isPaused()) {
                    return j1l1Var2.d.a(new e9u0(PauseCommand.builder().options(j1l1.x.toBuilder().onlyForLocalDevice(s0l1Var.a).build()).pauseOrigin(j1l1.y).build()));
                }
                Single singleJust = Single.just(new ceh());
                singleJust.getClass();
                return singleJust;
            case 15:
                j1l1 j1l1Var3 = (j1l1) ((lyc) this).receiver;
                j1l1Var3.getClass();
                if (((PlayerState) obj).isPaused()) {
                    return j1l1Var3.d.a(j1l1.z);
                }
                Single singleJust2 = Single.just(new ceh());
                singleJust2.getClass();
                return singleJust2;
            case 16:
                return ((j1l1) ((lyc) this).receiver).d.a(j1l1.A);
            default:
                return ((j1l1) ((lyc) this).receiver).d.a(j1l1.B);
        }
    }
}
