package p;

import android.content.Context;
import android.icu.text.DateFormat;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.webkit.CookieManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.messages.StickerSelected;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y441 implements joj1, Function {
    public final Object a;
    public Object b;
    public final Object c;
    public Object d;

    public y441(CookieManager cookieManager, rl4 rl4Var) {
        Map mapJ = sqg0.J(new mmr0[]{new mmr0("duckduckgo.com", Collections.singletonList(new mmr0("p", "1"))), new mmr0("search.brave.com", Collections.singletonList(new mmr0("safesearch", "strict"))), new mmr0("duckduckgo.com", Collections.singletonList(new mmr0("g", (Object) null))), new mmr0(".bing.com", p7h.M(new mmr0[]{new mmr0("_SS", (Object) null), new mmr0("SRCHHPGUSR", (Object) null)})), new mmr0(".ecosia.org", Collections.singletonList(new mmr0("ECFG", (Object) null))), new mmr0(".startpage.com", Collections.singletonList(new mmr0("preferences", (Object) null))), new mmr0(".reddit.com", Collections.singletonList(new mmr0("over18", (Object) null)))});
        Map mapJ2 = sqg0.J(new mmr0[]{new mmr0("bing", p7h.M(new mmr0[]{new mmr0("adlt", "strict"), new mmr0("safeSearch", "Strict")})), new mmr0("duckduckgo", Collections.singletonList(new mmr0("kp", "1"))), new mmr0("ecosia", p7h.M(new mmr0[]{new mmr0("safesearch", "2"), new mmr0("sfs", "true")})), new mmr0("google", Collections.singletonList(new mmr0("safe", "high"))), new mmr0("onesearch", Collections.singletonList(new mmr0("vm", "r"))), new mmr0("qwant", p7h.M(new mmr0[]{new mmr0("safesearch", "2"), new mmr0("s", "2")})), new mmr0("startpage", Collections.singletonList(new mmr0("adsafe", "high"))), new mmr0("yahoo", Collections.singletonList(new mmr0("vm", "r"))), new mmr0("yandex", p7h.M(new mmr0[]{new mmr0("fyandex", "1"), new mmr0("filter", "strict")}))});
        this.a = cookieManager;
        this.b = rl4Var;
        this.c = mapJ;
        this.d = mapJ2;
    }

    public static final /* synthetic */ f420 d(y441 y441Var) {
        return (oi) y441Var.b;
    }

    public static final Locale e(y441 y441Var) {
        return (Locale) ((idd1) y441Var.a).getValue();
    }

    public static final /* synthetic */ TimeZone f(y441 y441Var) {
        return (TimeZone) y441Var.b;
    }

    public static y441 h(View view) {
        int i = 2131428721;
        EncoreButton encoreButtonT = m5n1.t(view, 2131428721);
        if (encoreButtonT != null) {
            i = 2131428725;
            EncoreTextView encoreTextViewT = m5n1.t(view, 2131428725);
            if (encoreTextViewT != null) {
                i = 2131428732;
                EncoreTextView encoreTextViewT2 = m5n1.t(view, 2131428732);
                if (encoreTextViewT2 != null) {
                    return new y441((ConstraintLayout) view, encoreButtonT, encoreTextViewT, encoreTextViewT2);
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static Message q(int i, ArrayList arrayList) {
        Object obj;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((Message) obj2).what == i) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object A(yfe0 yfe0Var, onm onmVar) {
        vb51 vb51Var;
        if (onmVar instanceof vb51) {
            vb51Var = (vb51) onmVar;
            int i = vb51Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vb51Var.d = i - Integer.MIN_VALUE;
            } else {
                vb51Var = new vb51(this, onmVar);
            }
        } else {
            vb51Var = new vb51(this, onmVar);
        }
        Object objI = vb51Var.b;
        int i2 = vb51Var.d;
        if (i2 == 0) {
            hm5.M(objI);
            String str = yfe0Var.a;
            String str2 = yfe0Var.c;
            if (!ihc1.h0(str, "spotify:search", false) && !ihc1.h0(str2, "spotify:search", false)) {
                return Boolean.FALSE;
            }
            if (!((ele1) this.b).a.a()) {
                return Boolean.FALSE;
            }
            ((ff81) this.d).b(yfe0Var.a, yfe0Var.b, str2);
            mr20 mr20VarA = ((am30) this.c).a();
            vb51Var.a = yfe0Var;
            vb51Var.d = 1;
            objI = b5p1.i(mr20VarA, vb51Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yfe0Var = vb51Var.a;
            hm5.M(objI);
        }
        boolean zBooleanValue = ((Boolean) objI).booleanValue();
        ptf1 ptf1Var = (ptf1) this.a;
        String str3 = yfe0Var.b;
        if (zBooleanValue) {
            a1r0.j((a1r0) ptf1Var.b, mx20.d.g(), (String) null, (Bundle) null, false, 12);
        } else if (((ele1) ptf1Var.c).a.b()) {
            Set set = s4b1.f;
            a1r0.j((a1r0) ptf1Var.b, l1d.m("spotify:internal:reinvent-free:time-cap-upsell?source=search&trackID=", uic.x(str3).j()), (String) null, (Bundle) null, false, 12);
        } else {
            Set set2 = s4b1.f;
            a1r0.j((a1r0) ptf1Var.b, l1d.m("spotify:internal:reinvent-free:time-cap-pivot:track-radio-upsell:", uic.x(str3).j()), (String) null, (Bundle) null, false, 12);
        }
        return Boolean.TRUE;
    }

    public void B(ywb0 ywb0Var) {
        try {
            String strB = ((nfa0) this.a).b((zwb0) this.d, ywb0Var);
            hma1 hma1VarEdit = ((dma1) this.b).edit();
            hma1VarEdit.d((bma1) this.c, strB);
            hma1VarEdit.g();
        } catch (SerializationException e) {
            Logger.e(e, "Error while writing cache", new Object[0]);
        }
    }

    public void a(d3p1 d3p1Var) {
        bpb1 bpb1Var = (bpb1) this.c;
        boolean z = d3p1Var instanceof tnj1;
        znj1 znj1Var = aoj1.a;
        if (!z) {
            if ((d3p1Var instanceof unj1) && u890.j((coj1) bpb1Var.getValue(), znj1Var)) {
                ((jnj1) this.b).invoke(xnj1.a);
                return;
            }
            return;
        }
        if (((Number) ((inj1) this.a).invoke()).intValue() - ((tnj1) d3p1Var).c >= 0) {
            znj1Var = znj1.a;
        }
        if (u890.j(bpb1Var.getValue(), znj1Var)) {
            return;
        }
        bpb1Var.m((Object) null, znj1Var);
    }

    public Object apply(Object obj) {
        ni91 ni91Var = (ni91) obj;
        nn61 nn61Var = (nn61) this.a;
        if (nn61Var == null) {
            eg.m("playModePicker cannot be null here!");
            return null;
        }
        String str = ni91Var.e;
        r961 r961Var = (r961) this.c;
        return new CompletableFromAction(new wf0((qp91) this.d, nn61Var, new wn91(str, new dj71(r961Var, (byte) 11), new qv61(r961Var, (byte) 23)), (byte) 19)).s((Scheduler) this.b).w();
    }

    public void b(gu61 gu61Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2143995444);
        byte b = 4;
        int i2 = i | (x340Var.g(gu61Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object[] objArr = new Object[0];
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = w661.S0;
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT, x340Var, 48);
            kn61 kn61Var = (kn61) ven0Var.getValue();
            boolean zI = x340Var.i(this) | x340Var.g(ven0Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new ln61(this, ven0Var, null, (byte) 0);
                x340Var.s0(objT2);
            }
            qxd0.t(kn61Var, x340Var, (vu30) objT2);
            kn61 kn61Var2 = (kn61) ((hrr0) this.d).getValue();
            boolean zI2 = x340Var.i(this) | x340Var.g(ven0Var);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new ln61(this, ven0Var, null, (byte) 1);
                x340Var.s0(objT3);
            }
            qxd0.t(kn61Var2, x340Var, (vu30) objT3);
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = v8r.q((Object) null);
                x340Var.s0(objT4);
            }
            ven0 ven0Var2 = (ven0) objT4;
            kn61 kn61Var3 = (kn61) ven0Var.getValue();
            if (kn61Var3 == null) {
                kn61Var3 = (kn61) ven0Var2.getValue();
            }
            if (kn61Var3 == null) {
                x340Var.i0(1310217269);
                x340Var.r(false);
            } else {
                x340Var.i0(1310217270);
                boolean zG = x340Var.g(kn61Var3) | x340Var.g(ven0Var) | x340Var.i(this);
                Object objT5 = x340Var.T();
                if (zG || objT5 == m4cVar) {
                    odp0 odp0Var = new odp0(kn61Var3, this, ven0Var2, ven0Var, (byte) 17);
                    x340Var.s0(odp0Var);
                    objT5 = odp0Var;
                }
                Function0 function0 = (Function0) objT5;
                boolean zI3 = x340Var.i(this) | x340Var.g(kn61Var3);
                Object objT6 = x340Var.T();
                if (zI3 || objT6 == m4cVar) {
                    objT6 = new m551(this, kn61Var3, ven0Var2, b);
                    x340Var.s0(objT6);
                }
                c(gu61Var, kn61Var3, iu30Var, function0, (Function0) objT6, x340Var, (i2 & 14) | ((i2 << 3) & 896) | ((i2 << 9) & 458752));
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hl11(this, gu61Var, iu30Var, i, (byte) 23);
        }
    }

    public void c(gu61 gu61Var, kn61 kn61Var, iu30 iu30Var, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        b0k b0kVar2;
        h311 h311VarV;
        mn61 mn61Var;
        iu30 iu30Var2;
        an61 an61Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-995308050);
        int i2 = (b0kVar3.g(gu61Var) ? 4 : 2) | i | (b0kVar3.g(kn61Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 256 : 128;
        }
        int i3 = i2 | (b0kVar3.i(function0) ? 2048 : 1024) | (b0kVar3.i(function1) ? 16384 : 8192);
        if ((196608 & i) == 0) {
            i3 |= b0kVar3.i(this) ? 131072 : 65536;
        }
        if (b0kVar3.Y(i3 & 1, (74899 & i3) != 74898)) {
            jgb1 jgb1Var = (jgb1) iu30Var.invoke(kn61Var.a);
            if (jgb1Var == null || (iu30Var2 = (iu30) jgb1Var.n.get(kn61Var.b)) == null || (an61Var = (an61) iu30Var2.invoke(kn61Var.c)) == null) {
                h311VarV = b0kVar3.v();
                if (h311VarV == null) {
                    return;
                } else {
                    mn61Var = new mn61(this, gu61Var, kn61Var, iu30Var, function0, function1, i, (byte) 1);
                }
            } else {
                scx scxVarM = pno1.m(b0kVar3);
                String str = kn61Var.a;
                boolean z = false;
                String str2 = kn61Var.b;
                if ((i3 & 7168) == 2048) {
                    z = true;
                }
                boolean zG = b0kVar3.g(scxVarM) | z;
                Object objT = b0kVar3.T();
                if (zG || objT == fkj0.X) {
                    objT = new bw10(function0, scxVarM);
                    b0kVar3.s0(objT);
                }
                b0kVar2 = b0kVar3;
                x74.f(function1, scxVarM, (mfx) null, false, false, 0.0f, false, Boolean.TRUE, false, false, (vu30) null, apo.r(33673517, new nu31(this, new gn61(gu61Var, str, str2, an61Var, (Function0) objT, kn61Var.d), kn61Var, (byte) 5), b0kVar3), b0kVar2, ((i3 >> 12) & 14) | 12582912, 48, 1916);
            }
            h311VarV.d = mn61Var;
        }
        b0kVar2 = b0kVar3;
        b0kVar2.b0();
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            mn61Var = new mn61(this, gu61Var, kn61Var, iu30Var, function0, function1, i, (byte) 0);
            h311VarV.d = mn61Var;
        }
    }

    public void g() {
        ArrayList arrayList = new ArrayList();
        ((LinkedBlockingDeque) this.c).drainTo(arrayList);
        arrayList.add(Message.obtain(null, 2, 0, 0));
        fn31.T(smo1.e((o8n) this.a), (o8n) null, 0, new lc41(this, arrayList, (lnm) null, (byte) 26), 3);
    }

    public xe01 getState() {
        return (xe01) this.d;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0073  */
    /* JADX WARN: Code duplicated, block: B:34:0x0080 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(onm onmVar) {
        y181 y181Var;
        Object objZ;
        if (onmVar instanceof y181) {
            y181Var = (y181) onmVar;
            int i = y181Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                y181Var.c = i - Integer.MIN_VALUE;
            } else {
                y181Var = new y181(this, onmVar);
            }
        } else {
            y181Var = new y181(this, onmVar);
        }
        Object objC = y181Var.a;
        int i2 = y181Var.c;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objC);
            if (((l85) this.a).a()) {
                wu71 wu71Var = (wu71) this.b;
                y181Var.c = 1;
                objC = wu71Var.c(y181Var);
                if (objC != d9nVar) {
                }
                return d9nVar;
            }
            return Boolean.FALSE;
        }
        if (i2 == 1) {
            hm5.M(objC);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    hm5.M(objC);
                    return objC;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objC);
        }
        if (((Number) objC).intValue() < 3) {
            yzu yzuVar = (yzu) this.c;
            y181Var.c = 3;
            objZ = yzuVar.z(y181Var);
            if (objZ != d9nVar) {
                return d9nVar;
            }
            return objZ;
        }
        return Boolean.FALSE;
        if (!((Boolean) objC).booleanValue()) {
            cv71 cv71Var = (cv71) this.d;
            y181Var.c = 2;
            objC = cv71Var.b(y181Var);
            if (objC != d9nVar) {
                if (((Number) objC).intValue() < 3) {
                    yzu yzuVar2 = (yzu) this.c;
                    y181Var.c = 3;
                    objZ = yzuVar2.z(y181Var);
                    if (objZ != d9nVar) {
                        return objZ;
                    }
                }
            }
            return d9nVar;
        }
        return Boolean.FALSE;
    }

    public qhm j() {
        Scheduler scheduler = (Scheduler) this.a;
        acl aclVar = (acl) this.b;
        zr51 zr51Var = (zr51) this.c;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(as51.class, new ur51(zr51Var));
        subtypeEffectHandlerBuilderC.g(ds51.class, new yr51(zr51Var));
        subtypeEffectHandlerBuilderC.g(bs51.class, new wr51(zr51Var));
        subtypeEffectHandlerBuilderC.g(cs51.class, new xr51(zr51Var));
        subtypeEffectHandlerBuilderC.g(es51.class, new tr51(zr51Var));
        return new qhm(aclVar, subtypeEffectHandlerBuilderC.h(), scheduler, ((zu4) this.d).a());
    }

    public String k(String str) {
        if (((rl4) this.b).a()) {
            l370 l370VarB = null;
            try {
                k370 k370Var = new k370();
                k370Var.f((l370) null, str);
                l370VarB = k370Var.b();
            } catch (IllegalArgumentException unused) {
            }
            if (l370VarB != null) {
                Map map = (Map) this.d;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (ihc1.h0(l370VarB.d, (String) entry.getKey(), false)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                ArrayList<List> arrayList = new ArrayList(linkedHashMap.size());
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add(o7h.l1((Iterable) ((Map.Entry) it.next()).getValue()));
                }
                for (List<mmr0> list : arrayList) {
                    k370 k370VarG = l370VarB.g();
                    for (mmr0 mmr0Var : list) {
                        k370VarG.j((String) mmr0Var.a, (String) mmr0Var.b);
                    }
                    l370VarB = k370VarG.b();
                }
                return l370VarB.i;
            }
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object l(String str, onm onmVar) {
        ak81 ak81Var;
        a031 a031Var = (a031) this.a;
        a1g a1gVar = (a1g) this.d;
        if (onmVar instanceof ak81) {
            ak81Var = (ak81) onmVar;
            int i = ak81Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ak81Var.c = i - Integer.MIN_VALUE;
            } else {
                ak81Var = new ak81(this, onmVar);
            }
        } else {
            ak81Var = new ak81(this, onmVar);
        }
        Object obj = ak81Var.a;
        int i2 = ak81Var.c;
        try {
            try {
                if (i2 == 0) {
                    hm5.M(obj);
                    if (!ihc1.y0(str)) {
                        w0g w0gVar = (w0g) this.c;
                        ak81Var.c = 1;
                        Object objG = w0gVar.g(str, ak81Var);
                        d9n d9nVar = d9n.a;
                        if (objG == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                e2.getMessage();
            }
            a1gVar.a();
            a031Var.a();
            return rih1.a;
        } catch (Throwable th) {
            a1gVar.a();
            a031Var.a();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object m(onm onmVar) {
        bk81 bk81Var;
        a1g a1gVar = (a1g) this.d;
        if (onmVar instanceof bk81) {
            bk81Var = (bk81) onmVar;
            int i = bk81Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bk81Var.c = i - Integer.MIN_VALUE;
            } else {
                bk81Var = new bk81(this, onmVar);
            }
        } else {
            bk81Var = new bk81(this, onmVar);
        }
        Object objE = bk81Var.a;
        int i2 = bk81Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objE);
                z0g z0gVarB = a1gVar.b();
                if (z0gVarB != null) {
                    z0g z0gVar = z0gVarB.a == 1 ? z0gVarB : null;
                    if (z0gVar != null) {
                        return new g200(z0gVar.b);
                    }
                }
                w0g w0gVar = (w0g) this.c;
                bk81Var.c = 1;
                objE = w0gVar.e(bk81Var);
                d9n d9nVar = d9n.a;
                if (objE == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objE);
            }
            tur0 tur0Var = (tur0) objE;
            String str = tur0Var.a;
            long j = tur0Var.c;
            hma1 hma1VarEdit = a1gVar.a.edit();
            hma1VarEdit.d(a1g.c, "SignUp");
            hma1VarEdit.d(a1g.d, str);
            hma1VarEdit.c(a1g.e, j);
            hma1VarEdit.g();
            return new g200(tur0Var.a);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.d(l1d.m("Failed to fetch child initiated auth session: ", e2.getMessage()), new Object[0]);
            return f200.a;
        }
    }

    public void n() {
        ArrayList arrayList = new ArrayList();
        ((LinkedBlockingDeque) this.c).drainTo(arrayList);
        arrayList.add(Message.obtain(null, 1, 0, 0));
        fn31.T(smo1.e((o8n) this.a), (o8n) null, 0, new lc41(this, arrayList, (lnm) null, (byte) 26), 3);
    }

    public String o(long j) {
        TimeZone timeZone = (TimeZone) this.b;
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(j);
        if (calendar.get(1) == Calendar.getInstance(timeZone).get(1)) {
            String str = ((DateFormat) ((idd1) this.c).getValue()).format(Long.valueOf(j));
            str.getClass();
            return str;
        }
        String str2 = ((DateFormat) ((idd1) this.d).getValue()).format(Long.valueOf(j));
        str2.getClass();
        return str2;
    }

    public gw70 p() {
        return (gw70) this.a;
    }

    public void r(int i, String str) {
        Object next;
        rvb1 rvb1Var;
        String str2;
        Object next2;
        rzq rzqVar = (rzq) this.a;
        k1r k1rVarB = rzqVar.b(((o3r) this.c).a("MESSAGING_LYRICS"));
        if (!(k1rVarB instanceof i1r)) {
            k1rVarB = null;
        }
        List list = k1rVarB != null ? (List) u890.k(k1rVarB, (d0r) null, (n4r) null) : null;
        if (list == null) {
            list = z6x.a;
        }
        Iterator it = list.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            List list2 = ((mwb1) next).c;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((rvb1) it2.next()).a.equals(str)) {
                        break loop0;
                    }
                }
            }
        }
        mwb1 mwb1Var = (mwb1) next;
        if (mwb1Var != null) {
            Iterator it3 = mwb1Var.c.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (!((rvb1) next2).a.equals(str));
            rvb1Var = (rvb1) next2;
        } else {
            rvb1Var = null;
        }
        hxb1 hxb1Var = rvb1Var != null ? rvb1Var.f : null;
        String str3 = "NONE";
        if (hxb1Var instanceof fxb1) {
            str2 = "LYRICS_STICKER";
        } else {
            str2 = hxb1Var instanceof exb1 ? "GRAPHIC_STICKER" : "NONE";
        }
        k1r k1rVarB2 = rzqVar.b(((o3r) this.d).a(rih1.a));
        if (!(k1rVarB2 instanceof i1r)) {
            k1rVarB2 = null;
        }
        String str4 = k1rVarB2 != null ? (String) u890.k(k1rVarB2, (d0r) null, (n4r) null) : null;
        if (str4 == null) {
            str4 = "";
        }
        uwb1 uwb1VarN = StickerSelected.n();
        uwb1VarN.r(str);
        String str5 = mwb1Var != null ? mwb1Var.a : null;
        uwb1VarN.q(str5 != null ? str5 : "");
        uwb1VarN.s(str2);
        if (i == 1) {
            str3 = "STICKER_DISCOVERY_PAGE";
        } else if (i == 2) {
            str3 = "CHAT_STICKER_SUGGESTION";
        } else if (i != 3) {
            throw null;
        }
        uwb1VarN.t(str3);
        uwb1VarN.n(str4);
        ((t2j0) this.b).a(uwb1VarN.build());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.channels.ClosedSendChannelException */
    public void s(u091 u091Var) throws Throwable {
        Object objL = ((bbc) this.c).l(u091Var);
        if (objL instanceof oge) {
            Throwable thA = qge.a(objL);
            if (thA != null) {
                throw thA;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        if (objL instanceof pge) {
            eg.m("Check failed.");
        } else if (((AtomicInteger) this.d).getAndIncrement() == 0) {
            fn31.T((c9n) this.a, (o8n) null, 0, new w621(this, (lnm) null, (byte) 6), 3);
        }
    }

    public Observable t() {
        Observable observableDistinctUntilChanged = ((z141) this.a).a.replay(1).f().map(f2x0.t).distinctUntilChanged();
        Observable observableDistinctUntilChanged2 = ((Observable) this.b).replay(1).f().map(i2x0.i).distinctUntilChanged();
        Observable observableDistinctUntilChanged3 = new ObservableFromPublisher((Flowable) this.c).map(new v9c(this, (byte) 23)).distinctUntilChanged();
        g931 g931Var = (g931) this.d;
        Observable observableI = yoi1.i(((zr00) g931Var.b).a, o6x.a);
        Observable observableA = ((yh2) g931Var.c).a();
        Flowable flowable = ((o241) g931Var.d).a.toFlowable(BackpressureStrategy.d);
        return Observable.merge(p7h.M(new Observable[]{observableDistinctUntilChanged, observableDistinctUntilChanged2, observableDistinctUntilChanged3, Observable.combineLatest(observableI, observableA, x0d.j(flowable, flowable), djx0.h).distinctUntilChanged().distinctUntilChanged().map(h2x0.t)}));
    }

    public ywb0 u() {
        String strE = ((dma1) this.b).e((bma1) this.c, "{}");
        if (strE == null) {
            return null;
        }
        try {
            return (ywb0) ((nfa0) this.a).a(strE, (zwb0) this.d);
        } catch (SerializationException e) {
            Logger.e(e, "Error while reading cache", new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object v(String str, String str2, onm onmVar) {
        x361 x361Var;
        if (onmVar instanceof x361) {
            x361Var = (x361) onmVar;
            int i = x361Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x361Var.c = i - Integer.MIN_VALUE;
            } else {
                x361Var = new x361(this, onmVar);
            }
        } else {
            x361Var = new x361(this, onmVar);
        }
        Object objQ = x361Var.a;
        int i2 = x361Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objQ);
                bfd bfdVar = (bfd) this.b;
                List listM = p7h.M(new String[]{str, str2});
                x361Var.c = 1;
                objQ = bfdVar.q(listM, false, x361Var);
                d9n d9nVar = d9n.a;
                if (objQ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objQ);
            }
            return ((goe) objQ).a;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object w(onm onmVar) {
        a461 a461Var;
        if (onmVar instanceof a461) {
            a461Var = (a461) onmVar;
            int i = a461Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                a461Var.c = i - Integer.MIN_VALUE;
            } else {
                a461Var = new a461(this, onmVar);
            }
        } else {
            a461Var = new a461(this, onmVar);
        }
        Object objJ = a461Var.a;
        int i2 = a461Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                Flowable flowable = (Flowable) this.d;
                vbm[] vbmVarArr = q601.a;
                wzv0 wzv0Var = new wzv0(new h801(new kge(flowable), (byte) 3), (byte) 17);
                ck01 ck01Var = new ck01(2, (lnm) null, (byte) 13);
                a461Var.c = 1;
                objJ = b5p1.j(wzv0Var, ck01Var, a461Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objJ);
            }
            String str = (String) objJ;
            return new w4i1(str, str, 12, (String) null);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0089  */
    /* JADX WARN: Code duplicated, block: B:31:0x0093  */
    /* JADX WARN: Code duplicated, block: B:33:0x009a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public Object x(String str, String str2, String str3, String str4, boolean z, onm onmVar) {
        b461 b461Var;
        boolean z2;
        String str5;
        String str6;
        boolean z3;
        String strG;
        Object objD;
        f1n0 f1n0Var = (f1n0) this.c;
        if (onmVar instanceof b461) {
            b461Var = (b461) onmVar;
            int i = b461Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                b461Var.f = i - Integer.MIN_VALUE;
            } else {
                b461Var = new b461(this, onmVar);
            }
        } else {
            b461Var = new b461(this, onmVar);
        }
        b461 b461Var2 = b461Var;
        Object obj = b461Var2.d;
        int i2 = b461Var2.f;
        Object obj2 = rih1.a;
        Object obj3 = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            b461Var2.a = str3;
            b461Var2.b = str4;
            z2 = z;
            b461Var2.c = z2;
            b461Var2.f = 1;
            if (y(str, str2, str3, str4, b461Var2) != obj3) {
                str5 = str3;
                str6 = str4;
            }
            return obj3;
        }
        if (i2 == 1) {
            boolean z4 = b461Var2.c;
            str6 = b461Var2.b;
            str5 = b461Var2.a;
            hm5.M(obj);
            z2 = z4;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    hm5.M(obj);
                    return obj2;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z3 = b461Var2.c;
            str6 = b461Var2.b;
            str5 = b461Var2.a;
            hm5.M(obj);
        }
        if (z3) {
            b461Var2.a = null;
            b461Var2.b = null;
            b461Var2.c = z3;
            b461Var2.f = 3;
            if (str6 != null) {
                strG = pcf.d(6, str6, (String) null);
            } else {
                strG = pcf.g(str5);
            }
            objD = f1n0.d(f1n0Var, new dwn0(strG, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null), b461Var2);
            if (objD != obj3) {
                objD = obj2;
            }
            if (objD == obj3) {
                return obj3;
            }
        }
        return obj2;
        b461Var2.a = str5;
        b461Var2.b = str6;
        b461Var2.c = z2;
        b461Var2.f = 2;
        if (f1n0Var.a(b461Var2) != obj3) {
            z3 = z2;
            if (z3) {
                b461Var2.a = null;
                b461Var2.b = null;
                b461Var2.c = z3;
                b461Var2.f = 3;
                if (str6 != null) {
                    strG = pcf.d(6, str6, (String) null);
                } else {
                    strG = pcf.g(str5);
                }
                objD = f1n0.d(f1n0Var, new dwn0(strG, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null), b461Var2);
                if (objD != obj3) {
                    objD = obj2;
                }
                if (objD == obj3) {
                }
            }
            return obj2;
        }
        return obj3;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object y(String str, String str2, String str3, String str4, onm onmVar) {
        c461 c461Var;
        String str5;
        String str6;
        String str7;
        String str8;
        w4i1 w4i1Var;
        String str9;
        String str10;
        String str11;
        w4i1 w4i1Var2;
        String str12;
        String str13;
        bfd bfdVar;
        g8d g8dVar;
        String str14;
        if (onmVar instanceof c461) {
            c461Var = (c461) onmVar;
            int i = c461Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c461Var.h = i - Integer.MIN_VALUE;
            } else {
                c461Var = new c461(this, onmVar);
            }
        } else {
            c461Var = new c461(this, onmVar);
        }
        Object obj = c461Var.f;
        int i2 = c461Var.h;
        rih1 rih1Var = rih1.a;
        Object obj2 = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                c461Var.a = str;
                c461Var.b = str2;
                str5 = str3;
                c461Var.c = str5;
                c461Var.d = str4;
                c461Var.h = 1;
                Object objW = w(c461Var);
                if (objW != obj2) {
                    str6 = str;
                    obj = objW;
                    str7 = str2;
                    str8 = str4;
                }
                return obj2;
            }
            if (i2 == 1) {
                str8 = c461Var.d;
                str5 = c461Var.c;
                str7 = c461Var.b;
                str6 = c461Var.a;
                hm5.M(obj);
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w4i1Var2 = c461Var.e;
                str12 = c461Var.c;
                str13 = c461Var.b;
                str10 = c461Var.a;
                hm5.M(obj);
            }
            str14 = (String) obj;
            if (str14 == null) {
                str11 = str14;
                w4i1Var = w4i1Var2;
                str9 = str13;
                str5 = str12;
                long jB = ((yqg) this.a).b() / 1000;
                String strValueOf = String.valueOf(jB);
                tom tomVar = new tom(strValueOf, str11, w4i1Var, jB, true, new lpl(str9, (bc71) null, (String) null, new bpl(str10, str5), (hmp0) null, (String) null, (String) null, 118), new pom(false), (ArrayList) null, (ArrayList) null, (nom) null, false, (xo2) null, 3968);
                bfdVar = (bfd) this.b;
                g8dVar = new g8d(str11, strValueOf, new e8d(tomVar, false), true);
                c461Var.a = null;
                c461Var.b = null;
                c461Var.c = null;
                c461Var.d = null;
                c461Var.e = null;
                c461Var.h = 3;
                if (bfdVar.G(g8dVar, c461Var) == obj2) {
                    return obj2;
                }
            }
            return rih1Var;
            w4i1 w4i1Var3 = (w4i1) obj;
            if (w4i1Var3 != null) {
                if (str8 == null) {
                    String str15 = w4i1Var3.a;
                    c461Var.a = str6;
                    c461Var.b = str7;
                    c461Var.c = str5;
                    c461Var.d = null;
                    c461Var.e = w4i1Var3;
                    c461Var.h = 2;
                    Object objV = v(str15, str5, c461Var);
                    if (objV != obj2) {
                        w4i1Var2 = w4i1Var3;
                        obj = objV;
                        str12 = str5;
                        str13 = str7;
                        str10 = str6;
                        str14 = (String) obj;
                        if (str14 == null) {
                            str11 = str14;
                            w4i1Var = w4i1Var2;
                            str9 = str13;
                            str5 = str12;
                            long jB2 = ((yqg) this.a).b() / 1000;
                            String strValueOf2 = String.valueOf(jB2);
                            tom tomVar2 = new tom(strValueOf2, str11, w4i1Var, jB2, true, new lpl(str9, (bc71) null, (String) null, new bpl(str10, str5), (hmp0) null, (String) null, (String) null, 118), new pom(false), (ArrayList) null, (ArrayList) null, (nom) null, false, (xo2) null, 3968);
                            bfdVar = (bfd) this.b;
                            g8dVar = new g8d(str11, strValueOf2, new e8d(tomVar2, false), true);
                            c461Var.a = null;
                            c461Var.b = null;
                            c461Var.c = null;
                            c461Var.d = null;
                            c461Var.e = null;
                            c461Var.h = 3;
                            if (bfdVar.G(g8dVar, c461Var) == obj2) {
                            }
                        }
                    }
                } else {
                    w4i1Var = w4i1Var3;
                    str9 = str7;
                    str10 = str6;
                    str11 = str8;
                    long jB3 = ((yqg) this.a).b() / 1000;
                    String strValueOf3 = String.valueOf(jB3);
                    tom tomVar3 = new tom(strValueOf3, str11, w4i1Var, jB3, true, new lpl(str9, (bc71) null, (String) null, new bpl(str10, str5), (hmp0) null, (String) null, (String) null, 118), new pom(false), (ArrayList) null, (ArrayList) null, (nom) null, false, (xo2) null, 3968);
                    bfdVar = (bfd) this.b;
                    g8dVar = new g8d(str11, strValueOf3, new e8d(tomVar3, false), true);
                    c461Var.a = null;
                    c461Var.b = null;
                    c461Var.c = null;
                    c461Var.d = null;
                    c461Var.e = null;
                    c461Var.h = 3;
                    if (bfdVar.G(g8dVar, c461Var) == obj2) {
                    }
                }
                return obj2;
            }
            return rih1Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "SendListeningActivityReaction: failed to send via Campfire API", new Object[0]);
            return rih1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object z(String str, String str2, String str3, sl01 sl01Var, onm onmVar) {
        o461 o461Var;
        if (onmVar instanceof o461) {
            o461Var = (o461) onmVar;
            int i = o461Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                o461Var.c = i - Integer.MIN_VALUE;
            } else {
                o461Var = new o461(this, onmVar);
            }
        } else {
            o461Var = new o461(this, onmVar);
        }
        Object objY = o461Var.a;
        int i2 = o461Var.c;
        if (i2 == 0) {
            hm5.M(objY);
            geo0 geo0Var = geo0.b;
            p461 p461Var = new p461(this, sl01Var, str2, str, str3, (lnm) null);
            o461Var.c = 1;
            objY = fn31.Y(geo0Var, p461Var, o461Var);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objY);
        }
        return ((e331) objY).a;
    }

    public void reset() {
    }

    public y441() {
        this.a = new idd1(w0n0.T0);
        this.b = TimeZone.getTimeZone("UTC");
        this.c = new idd1(new l5v0(this, (byte) 19));
        this.d = new idd1(new qv61(this, (byte) 28));
    }

    public y441(Context context, oi oiVar) {
        this.a = context;
        this.b = oiVar;
        this.c = new idd1(new qv61(this, (byte) 4));
        this.d = new idd1(new l5v0(this, (byte) 16));
    }

    public y441(inj1 inj1Var, jnj1 jnj1Var) {
        this.a = inj1Var;
        this.b = jnj1Var;
        bpb1 bpb1VarB = gio1.b(znj1.a);
        this.c = bpb1VarB;
        this.d = d5p1.h(bpb1VarB);
    }

    public y441(kly0 kly0Var, ogr ogrVar) {
        this.a = kly0Var;
        this.b = ogrVar;
        this.c = new idd1(new l451(this, (byte) 21));
        this.d = v8r.q((Object) null);
    }

    public y441(rzq rzqVar, t2j0 t2j0Var) {
        this.a = rzqVar;
        this.b = t2j0Var;
        this.c = w3p1.o(new l4r(v061.b, 1, hz51.t, new j4r(hz51.N0), hz51.X), hz51.O0);
        this.d = w3p1.o(new l4r(hvm.d, 1, hz51.Y, new j4r(hz51.h), hz51.Z), hz51.i);
    }

    public y441(esw eswVar, w751 w751Var, wao0 wao0Var) {
        this.a = eswVar;
        this.b = w751Var;
        this.c = wao0Var;
    }

    public y441(nfa0 nfa0Var, dma1 dma1Var, bma1 bma1Var, nma0 nma0Var) {
        this.a = nfa0Var;
        this.b = dma1Var;
        this.c = bma1Var;
        int i = ywb0.a;
        chc1 chc1Var = chc1.a;
        this.d = new zwb0(nma0Var, (byte) 0);
    }

    public y441(c9n c9nVar, d781 d781Var, w621 w621Var) {
        this.a = c9nVar;
        this.b = w621Var;
        byte b = 0;
        this.c = mno1.a(Integer.MAX_VALUE, 0, 6);
        this.d = new AtomicInteger(0);
        faa0 faa0VarA = c9nVar.J().A(fkj0.W0);
        if (faa0VarA == null) {
            return;
        }
        faa0VarA.L(new iv81(d781Var, this, b));
    }

    public /* synthetic */ y441(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public y441(o8n o8nVar) {
        this.a = o8nVar;
        this.c = new LinkedBlockingDeque(20);
        this.d = new v7y(this, (byte) 2);
    }
}
