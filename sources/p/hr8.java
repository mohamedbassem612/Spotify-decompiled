package p;

import android.content.Context;
import android.content.Intent;
import com.spotify.adsinternal.adscore.model.Format;
import com.spotify.betamax.offlinecoordinator.proto.OfflinePlugin;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hr8 implements Function, lqw {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public hr8(b020 b020Var, String str, PlayerState playerState, boolean z, List list) {
        this.a = (byte) 2;
        this.c = str;
        this.d = playerState;
        this.b = z;
        this.e = list;
    }

    /* JADX WARN: Code duplicated, block: B:158:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:35:0x0120  */
    /* JADX WARN: Code duplicated, block: B:57:0x018d  */
    public Object apply(Object obj) {
        boolean z;
        String str;
        ArrayList arrayList;
        String str2;
        jo70 jo70Var;
        String str3;
        xkk1 xkk1Var;
        mq70 mq70Var;
        up70 up70VarA;
        String str4;
        Integer num;
        Object next;
        ArrayList arrayListB;
        String str5;
        byte b = this.a;
        String str6 = "";
        int iIntValue = 0;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                jm70 jm70Var = (jm70) obj;
                ow3 ow3Var = (ow3) this.c;
                Context context = (Context) obj3;
                wq8 wq8Var = (wq8) obj2;
                boolean z2 = this.b;
                if (jm70Var instanceof im70) {
                    return Single.create(new ix7((km3) ow3Var.b, kyo1.w(wq8Var, ((im70) jm70Var).a, Boolean.TRUE).toString(), wq8Var.e, (byte) 7)).flatMap(new fdc(z2, ow3Var, context, wq8Var, jm70Var));
                }
                if (jm70Var instanceof hm70) {
                    return Single.just(new dr8(nhz.Y, "Error when authorizing", null));
                }
                eg.o();
                return null;
            case 1:
                idu0 idu0Var = (idu0) obj;
                boolean z3 = this.b;
                inm inmVar = (inm) obj3;
                y6b1 y6b1VarU = tto1.u(idu0Var.a);
                if (y6b1VarU != null && y6b1VarU.j((y6b1) this.c) && idu0Var.c == z3) {
                    ((t35) inmVar.f.a.get()).c();
                }
                inmVar.d.a((String) obj2, z3);
                return new CompletableFromAction(new f72(inmVar, (byte) 8));
            case 2:
                Map map = (Map) obj;
                String str7 = (String) this.c;
                PlayerState playerState = (PlayerState) obj3;
                boolean z4 = this.b;
                List<ulu0> list = (List) obj2;
                ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
                for (ulu0 ulu0Var : list) {
                    wy00 wy00Var = (wy00) map.get(ulu0Var.a());
                    String str8 = ulu0Var.b;
                    String strA = ulu0Var.a();
                    String str9 = ulu0Var.c.c;
                    boolean z5 = wy00Var != null ? wy00Var.b : false;
                    List list2 = ulu0Var.e;
                    ArrayList arrayList3 = new ArrayList(q7h.U(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        String str10 = ((pi90) it.next()).b;
                        if (str10 == null) {
                            str10 = "";
                        }
                        arrayList3.add(str10);
                    }
                    boolean z6 = wy00Var != null ? wy00Var.c : ulu0Var.f;
                    boolean z7 = wy00Var != null ? wy00Var.a : ulu0Var.g;
                    if (!z4) {
                        z = false;
                    } else if (wy00Var != null ? wy00Var.d : ulu0Var.h) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean zJ = u890.j(playerState.contextUri(), str7);
                    jrt0 jrt0Var = crt0.a;
                    if (zJ) {
                        ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                        if (u890.j(contextTrack != null ? contextTrack.uri() : null, ulu0Var.a())) {
                            if (playerState.isPaused()) {
                                jrt0Var = jrt0.a;
                            } else if (playerState.isPlaying()) {
                                jrt0Var = ort0.a;
                            }
                        }
                    }
                    arrayList2.add(new p111(str8, strA, false, arrayList3, str9, z5, false, z, z6, jrt0Var, z7, false));
                }
                return arrayList2;
            case 3:
                sy21 sy21Var = (sy21) obj;
                x390 x390Var = (x390) obj3;
                ry21 ry21Var = sy21Var.a;
                boolean z8 = ry21Var.Q0;
                n72 n72Var = (n72) this.c;
                if (!z8) {
                    ((rdo) x390Var.c).a(new pdo(Long.valueOf(ry21Var.d), n72Var.a, ry21Var.c, n72Var.b.a.toUpperCase(Locale.ROOT), (((blc0) obj2) == blc0.ti || this.b) ? "music" : "podcast"));
                    eg.m("Response unavailable");
                    return null;
                }
                lzb0 lzb0Var = (lzb0) sy21Var.b;
                ArrayList arrayList4 = z6x.a;
                if (lzb0Var == null) {
                    arrayList = arrayList4;
                } else {
                    List list3 = lzb0Var.a;
                    String str11 = lzb0Var.b;
                    qyb0 qyb0Var = (qyb0) o7h.s0(list3);
                    if (qyb0Var == null || (str = qyb0Var.l) == null) {
                        str = "leavebehind";
                    }
                    List<qyb0> list4 = list3;
                    arrayList = new ArrayList(q7h.U(list4, 10));
                    for (qyb0 qyb0Var2 : list4) {
                        String str12 = qyb0Var2.j;
                        String str13 = qyb0Var2.e;
                        String str14 = qyb0Var2.a;
                        String str15 = qyb0Var2.b;
                        xkg0 xkg0Var = new xkg0();
                        xkg0Var.put("buttonMessage", qyb0Var2.c);
                        xkg0Var.put("tagline", qyb0Var2.d);
                        xkg0Var.put("displayImage", str13);
                        xkg0Var.put("logoImage", qyb0Var2.f);
                        xkg0Var.put("product_name", str);
                        xkg0 xkg0VarB = xkg0Var.b();
                        fgh0 fgh0Var = new fgh0(6, Collections.singletonList(new gq70(iIntValue, iIntValue, new p57(str13))), (List) null);
                        String str16 = qyb0Var2.g;
                        String str17 = qyb0Var2.h;
                        Format format = Format.BANNER;
                        xkg0 xkg0Var2 = new xkg0();
                        f3g1 f3g1Var = qyb0Var2.i;
                        if (f3g1Var != null) {
                            xkg0Var2.put("viewed", f3g1Var.a);
                            xkg0Var2.put("clicked", f3g1Var.b);
                        }
                        arrayList.add(new ji0(str12, "", str14, "", str15, 1, xkg0VarB, fgh0Var, str16, str17, str11, false, false, format, false, arrayList4, "", xkg0Var2.b(), 2));
                        iIntValue = 0;
                    }
                }
                return new e331(arrayList);
            case 4:
                uv00 uv00Var = (uv00) obj;
                String str18 = (String) obj3;
                zei1 zei1Var = uv00Var.a(zei1.class, (String) this.c).b;
                if (zei1Var != null) {
                    Iterator it2 = zei1Var.e.iterator();
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (it2.hasNext()) {
                            yp70 yp70Var = (yp70) next;
                            int i = yp70Var.b * yp70Var.c;
                            do {
                                Object next2 = it2.next();
                                yp70 yp70Var2 = (yp70) next2;
                                int i2 = yp70Var2.b * yp70Var2.c;
                                if (i < i2) {
                                    next = next2;
                                    i = i2;
                                }
                            } while (it2.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    yp70 yp70Var3 = (yp70) next;
                    if (yp70Var3 != null) {
                        str2 = yp70Var3.a;
                    } else {
                        str2 = "";
                    }
                } else {
                    str2 = "";
                }
                String str19 = zei1Var != null ? zei1Var.b : "";
                if (zei1Var != null && (num = zei1Var.f) != null) {
                    iIntValue = num.intValue();
                }
                int i3 = iIntValue;
                String str20 = (str18.length() <= 0 || (xkk1Var = uv00Var.a(xkk1.class, str18).b) == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.c)) == null || (str4 = up70VarA.a.a) == null) ? "" : str4;
                String str21 = (String) obj2;
                if (this.b && str21.length() == 0) {
                    if (str18.length() > 0 && (jo70Var = uv00Var.a(jo70.class, str18).b) != null && (str3 = jo70Var.a) != null) {
                        str6 = str3;
                    }
                    str21 = str6;
                }
                String str22 = str21;
                w281 w281Var = str18.length() > 0 ? (w281) uv00Var.a(w281.class, str18).b : null;
                return new vqi0(str2, str19, i3, str20, str22, w281Var != null ? w281Var.j : null, w281Var != null ? w281Var.k : null);
            case 5:
                uv00 uv00Var2 = (uv00) obj;
                List<String> list5 = (List) this.c;
                ArrayList arrayList5 = new ArrayList(q7h.U(list5, 10));
                for (String str23 : list5) {
                    mdz mdzVar = uv00Var2.a(mdz.class, str23).b;
                    arrayList5.add((mdzVar == null || mdzVar.g.isEmpty()) ? new zpp0(rqp0.a(str23)) : new zpp0(mdzVar));
                }
                List list6 = (List) obj3;
                if (this.b) {
                    List<String> list7 = list6;
                    arrayListB = new ArrayList(q7h.U(list7, 10));
                    for (String str24 : list7) {
                        d7u0 d7u0Var = uv00Var2.a(d7u0.class, str24).b;
                        if (d7u0Var != null) {
                            Iterator it3 = d7u0Var.b.iterator();
                            if (it3.hasNext()) {
                                str5 = ((tqj1) it3.next()).b.a;
                            } else {
                                str5 = null;
                            }
                        } else {
                            str5 = null;
                        }
                        arrayListB.add(new aqp0(str24, str5));
                    }
                } else {
                    arrayListB = rqp0.b(list6);
                }
                return new lvp0((OfflinePlugin.PluginCommand) obj2, o7h.N0(arrayListB, arrayList5));
            case 6:
                return (((Boolean) obj).booleanValue() && this.b) ? new hrn0(fux0.class, (hux0) ((vu30) this.c).invoke((Intent) obj3, (th61) obj2), a6w0.a) : crn0.a;
            default:
                ofz0 ofz0Var = (ofz0) ((dc31) this.c).c;
                dma1 dma1VarB = ofz0Var.b.b(ofz0Var.a, (String) obj);
                nfz0 nfz0Var = new nfz0(dma1VarB);
                boolean z9 = this.b;
                String str25 = (String) obj2;
                hma1 hma1VarEdit = dma1VarB.edit();
                hma1VarEdit.d(nfz0.d, (String) obj3);
                hma1VarEdit.g();
                hma1 hma1VarEdit2 = dma1VarB.edit();
                hma1VarEdit2.a(nfz0.b, true);
                hma1VarEdit2.g();
                if (z9) {
                    hma1 hma1VarEdit3 = dma1VarB.edit();
                    hma1VarEdit3.a(nfz0.c, true);
                    hma1VarEdit3.g();
                    hma1 hma1VarEdit4 = dma1VarB.edit();
                    hma1VarEdit4.d(nfz0.e, str25);
                    hma1VarEdit4.g();
                }
                return nfz0Var;
        }
    }

    public void d(Object obj) {
        ((h141) this.d).e(obj);
    }

    public void dispose() {
        this.b = true;
        llm llmVar = (llm) this.c;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
    }

    public void k(Object obj, tqw tqwVar) {
        k8d1 k8d1Var = (k8d1) this.e;
        if (this.b) {
            return;
        }
        llm llmVarE = (llm) this.c;
        if (llmVarE == null) {
            llmVarE = smo1.e(k8d1Var.a.y(op71.f()));
            this.c = llmVarE;
        }
        fn31.T(llmVarE, (o8n) null, 0, new p651(k8d1Var, (h141) this.d, obj, tqwVar, (lnm) null, (byte) 25), 3);
    }

    public /* synthetic */ hr8(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
    }

    public /* synthetic */ hr8(Object obj, boolean z, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ hr8(byte b, Object obj, String str, String str2, boolean z) {
        this.a = b;
        this.c = obj;
        this.d = str;
        this.b = z;
        this.e = str2;
    }

    public hr8(boolean z, b72 b72Var, vu30 vu30Var, Intent intent, th61 th61Var) {
        this.a = (byte) 6;
        this.b = z;
        this.c = vu30Var;
        this.d = intent;
        this.e = th61Var;
    }

    public hr8(h141 h141Var, Object obj, k8d1 k8d1Var) {
        this.a = (byte) 8;
        this.d = h141Var;
        this.e = k8d1Var;
        h141Var.e(obj);
    }
}
