package p;

import android.content.Context;
import android.os.Bundle;
import com.google.protobuf.Empty;
import com.spotify.base.java.logging.Logger;
import com.spotify.musicplaybackspeed.speedcontrolbottomsheet.SpeedSaveError;
import com.spotify.player.model.command.SeekToCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.searchview.proto.AutocompleteViewResponse;
import com.spotify.searchview.proto.Entity;
import com.spotify.searchview.proto.Track;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableToSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableError;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m021 implements Function, p2r0, nyc {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public m021(b7n b7nVar, ka kaVar) {
        this.a = (byte) 13;
        this.b = yoi1.i(b7nVar.a(i6n.a), o6x.a);
        this.c = ((Observable) kaVar.invoke()).distinctUntilChanged();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    public static dw41 o(Entity entity) {
        if (entity.getUri().length() != 0) {
            int iV = entity.v();
            int i = iV == 0 ? -1 : mv41.a[l1d.C(iV)];
            if (i == 1) {
                Track trackG = entity.G();
                String uri = entity.getUri();
                int i2 = mv41.b[trackG.C().ordinal()];
                if (i2 == 1) {
                    uri = trackG.p();
                    if (ihc1.y0(uri)) {
                        uri = null;
                    }
                } else if (i2 == 2) {
                    uri = null;
                }
                if (uri != null) {
                    return new cw41(uri);
                }
            } else if (i == 2) {
                return new bw41(entity.getUri());
            }
        }
        return null;
    }

    public Map a(int i, String str, String str2, Set set) {
        return sqg0.J(new mmr0[]{new mmr0("query", str), new mmr0("locale", upn1.m()), new mmr0("entity_types", o7h.y0(o7h.a1(set, new be21((byte) 5)), ",", (String) null, (String) null, new ldz0((Object) this, (byte) 20), 30)), new mmr0("limit", String.valueOf(i)), new mmr0("request_id", str2), new mmr0("timestamp", String.valueOf(((yqg) this.c).b()))});
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
    public Object apply(Object obj) throws HttpException {
        Completable completableFlatMapCompletable;
        List list;
        j9u0 j9u0VarE;
        Object next;
        byte b = this.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        sq51 sq51Var = null;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 2:
                List list2 = (List) obj;
                pmf0 pmf0Var = (pmf0) obj2;
                iff0 iff0Var = pmf0Var.a;
                iff0Var.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append("DELETE FROM lyrics_entities WHERE track_id IN (");
                anm1.h(list2.size(), sb);
                sb.append(")");
                return new CompletableToSingle(m5n1.l(iff0Var.a, new r3j(sb.toString(), list2, (byte) 3)).s(pmf0Var.b).n((Scheduler) obj3), ln70.c, (Object) null).onErrorReturnItem(Empty.n());
            case 9:
                Throwable th = (Throwable) obj;
                int i = ((AtomicInteger) obj2).get();
                if (!((Boolean) ((yc31) obj3).a.invoke(th)).booleanValue() || i - 1 == 3) {
                    int i2 = Flowable.a;
                    return new FlowableError(Functions.h(th));
                }
                long j = 500 * i;
                utw0 utw0Var = ike1.a;
                utw0Var.y("RCS");
                utw0Var.o("Failed %d attempt with error: %s, retrying in %d ms...", new Object[]{Integer.valueOf(i), th.getMessage(), Long.valueOf(j)});
                return Flowable.a0(j, timeUnit, Schedulers.c);
            case 16:
                Object obj4 = (tb0) obj;
                if (obj4.equals(pb0.a) || obj4.equals(qb0.a)) {
                    return Completable.j(aax.a);
                }
                if (!(obj4 instanceof rb0)) {
                    eg.o();
                    return null;
                }
                ffr ffrVar = (ffr) obj2;
                rb0 rb0Var = (rb0) obj4;
                me20 me20Var = (me20) obj3;
                String str = me20Var.g;
                q5 q5Var = (q5) ffrVar.d;
                hce1 hce1Var = (hce1) ffrVar.b;
                na naVar = (na) hce1Var.c;
                byte b2 = 24;
                if (rb0Var instanceof ob0) {
                    completableFlatMapCompletable = ((Single) naVar.invoke()).flatMapCompletable(new ptf1(new iai1((k560) q5Var.invoke(rb0Var, str), new z9i1(me20Var.a, me20Var.b, me20Var.d, me20Var.e, me20Var.g, me20Var.c, me20Var.f)), hce1Var, b2));
                } else {
                    if (!(rb0Var instanceof sb0)) {
                        eg.o();
                        return null;
                    }
                    completableFlatMapCompletable = ((Single) naVar.invoke()).flatMapCompletable(new ptf1(new jai1((l560) q5Var.invoke(rb0Var, str), new z9i1(me20Var.a, me20Var.b, me20Var.d, me20Var.e, me20Var.g, me20Var.c, me20Var.f)), hce1Var, b2));
                }
                return completableFlatMapCompletable.h(w841.i);
            case 18:
                return Observable.just(rih1.a).delay(((qj91) obj).a, timeUnit, (Scheduler) obj2).map(new vrn((yqg) obj3, (byte) 1));
            case 22:
                sy21 sy21Var = (sy21) obj;
                AutocompleteViewResponse autocompleteViewResponse = (AutocompleteViewResponse) sy21Var.b;
                if (autocompleteViewResponse == null) {
                    throw new HttpException(sy21Var);
                }
                String str2 = (String) obj2;
                vi11 vi11Var = (vi11) obj3;
                String strC = sy21Var.a.f.c("x-search-request-id");
                if (strC != null) {
                    str2 = strC;
                }
                n851 n851Var = (n851) vi11Var.d;
                h290 h290VarO = autocompleteViewResponse.o();
                uy41 uy41Var = n851Var.a;
                ArrayList arrayList = new ArrayList();
                Iterator it = h290VarO.iterator();
                while (it.hasNext()) {
                    lby lbyVarB = uy41Var.b((Entity) it.next());
                    if (lbyVarB != null) {
                        arrayList.add(lbyVarB);
                    }
                }
                return new l851(str2, new b49(arrayList, autocompleteViewResponse.p() ? n851.a(autocompleteViewResponse.n()) : null));
            case 23:
                Object obj5 = ((e331) obj).a;
                kd51 kd51Var = (kd51) obj2;
                String str3 = (String) obj3;
                bhk1 bhk1Var = (bhk1) kd51Var.t.e();
                if (bhk1Var == null || (list = bhk1Var.d) == null) {
                    list = z6x.a;
                }
                return kd51Var.U(obj5, str3, list);
            default:
                mmr0 mmr0Var = (mmr0) obj;
                am51 am51Var = (am51) obj3;
                spq0 spq0Var = (spq0) mmr0Var.a;
                fvf1 fvf1Var = (fvf1) mmr0Var.b;
                wp91 wp91Var = ((yl51) obj2).c;
                gm51 gm51VarA = wp91Var instanceof wp91 ? am51Var.d.a(2, fvf1Var.a) : em51.a;
                w9u0 w9u0Var = am51Var.c;
                String str4 = (String) spq0Var.h();
                if (gm51VarA instanceof gm51) {
                    j9u0VarE = am51.e(gm51VarA.a, SeekToCommand.Relative.BEGINNING, str4);
                } else if (gm51VarA instanceof fm51) {
                    wp91 wp91Var2 = wp91Var instanceof wp91 ? wp91Var : null;
                    if (wp91Var2 != null) {
                        Iterator it2 = wp91Var2.a.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                lvy lvyVar = (lvy) next;
                                long j2 = lvyVar.b.a;
                                n5f0 n5f0Var = new n5f0(j2, lvyVar.c.a);
                                long j3 = ((fm51) gm51VarA).a;
                                if (j2 > j3 || j3 > n5f0Var.b) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        lvy lvyVar2 = (lvy) next;
                        if (lvyVar2 != null) {
                            sq51Var = lvyVar2.b;
                        }
                    }
                    if (sq51Var != null) {
                        SeekToCommand.Builder builder = SeekToCommand.builder(sq51Var.a);
                        CommandOptions.Builder builder2 = CommandOptions.builder();
                        if (str4 != null) {
                            builder2.getClass();
                            builder2.onlyForPlaybackId(str4);
                        }
                        j9u0VarE = new j9u0(builder.options(builder2.build()).relative(SeekToCommand.Relative.BEGINNING).build());
                    } else {
                        j9u0VarE = am51.e(-15000L, SeekToCommand.Relative.CURRENT, str4);
                    }
                } else {
                    j9u0VarE = am51.e(-15000L, SeekToCommand.Relative.CURRENT, str4);
                }
                return w9u0Var.a(j9u0VarE).ignoreElement();
        }
    }

    public my31 b(bas basVar) {
        ArrayList arrayList = new ArrayList();
        if (((xl4) ((ynb0) this.c).get()).b()) {
            arrayList.add(((dkp) this.b).a(basVar));
        }
        return new my31(arrayList);
    }

    public cnc0 c() {
        return (cnc0) this.b;
    }

    public dg90 d() {
        y490 y490Var = (y490) this.c;
        y490Var.f(((Context) this.b).getApplicationContext());
        return new dg90((Object) y490Var, (byte) 23);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object e(String str, String str2, onm onmVar) {
        qc41 qc41Var;
        if (onmVar instanceof qc41) {
            qc41Var = (qc41) onmVar;
            int i = qc41Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qc41Var.c = i - Integer.MIN_VALUE;
            } else {
                qc41Var = new qc41(this, onmVar);
            }
        } else {
            qc41Var = new qc41(this, onmVar);
        }
        qc41 qc41Var2 = qc41Var;
        Object objT = qc41Var2.a;
        int i2 = qc41Var2.c;
        if (i2 == 0) {
            hm5.M(objT);
            xyc0 xyc0Var = (iyc0) this.c;
            qc41Var2.c = 1;
            objT = xyc0Var.t(str, str2, "remove-item-speed", (phc) null, qc41Var2);
            d9n d9nVar = d9n.a;
            if (objT == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objT);
        }
        ly21 ly21Var = (py21) objT;
        if (ly21Var instanceof oy21) {
            return rih1.a;
        }
        if (ly21Var instanceof ly21) {
            return new m231(new SpeedSaveError(ly21Var.a.b()));
        }
        eg.o();
        return null;
    }

    public Object f(String str, List list, r6h1 r6h1Var, huu huuVar) {
        q8n q8nVar = (q8n) this.c;
        return list.isEmpty() ? fn31.Y(q8nVar, new m311(this, str, r6h1Var, (lnm) null, (byte) 2), huuVar) : fn31.Y(q8nVar, new sew0((byte) 9, this, str, ((dyp0) o7h.q0(list)).a, ((dyp0) o7h.q0(list)).b, r6h1Var, (lnm) null), huuVar);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    /* JADX WARN: Code duplicated, block: B:38:0x009e  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:71:0x0117  */
    /* JADX WARN: Code duplicated, block: B:74:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        if (r10 == r7) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d2, code lost:
    
        if (r10 == r7) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object g(p.kh71 r11, p.onm r12) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.m021.g(p.kh71, p.onm):java.lang.Object");
    }

    public o2r0 h(q7r0 q7r0Var, Bundle bundle) {
        return new g931(q7r0Var, bundle, (vu30) this.b, (xu30) this.c);
    }

    public Object i(Function0 function0) {
        Object objInvoke;
        vn41 vn41Var = (vn41) this.b;
        Object obj = vn41Var.b;
        Object obj2 = this.c;
        synchronized (obj) {
            objInvoke = vn41Var.c == obj2 ? function0.invoke() : null;
        }
        return objInvoke;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object j(String str, String str2, float f, onm onmVar) {
        rc41 rc41Var;
        if (onmVar instanceof rc41) {
            rc41Var = (rc41) onmVar;
            int i = rc41Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rc41Var.c = i - Integer.MIN_VALUE;
            } else {
                rc41Var = new rc41(this, onmVar);
            }
        } else {
            rc41Var = new rc41(this, onmVar);
        }
        rc41 rc41Var2 = rc41Var;
        Object objA = rc41Var2.a;
        int i2 = rc41Var2.c;
        if (i2 == 0) {
            hm5.M(objA);
            wm90 wm90Var = (wm90) this.b;
            double dDoubleValue = new BigDecimal(String.valueOf(f)).doubleValue();
            rc41Var2.c = 1;
            objA = wm90Var.a(str, str2, dDoubleValue, rc41Var2);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        ly21 ly21Var = (py21) objA;
        if (ly21Var instanceof oy21) {
            return rih1.a;
        }
        if (ly21Var instanceof ly21) {
            return new m231(new SpeedSaveError(ly21Var.a.b()));
        }
        eg.o();
        return null;
    }

    public void k(jf01 jf01Var, IOException iOException) {
        ohd ohdVar = (ohd) this.b;
        if (ohdVar.s() instanceof ago0) {
            ohdVar.resumeWith(new m231(new IOException(l1d.m("Failed to fetch Rive asset from ", (String) this.c), iOException)));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object l(int i, String str, Set set, onm onmVar) throws NoWhenBranchMatchedException {
        nv41 nv41Var;
        String str2;
        boolean zContains;
        if (onmVar instanceof nv41) {
            nv41Var = (nv41) onmVar;
            int i2 = nv41Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nv41Var.e = i2 - Integer.MIN_VALUE;
            } else {
                nv41Var = new nv41(this, onmVar);
            }
        } else {
            nv41Var = new nv41(this, onmVar);
        }
        Object obj = nv41Var.c;
        int i3 = nv41Var.e;
        try {
            if (i3 == 0) {
                hm5.M(obj);
                if (ihc1.y0(str) || set.isEmpty() || i <= 0) {
                    return new qv41(z6x.a, null);
                }
                String string = UUID.randomUUID().toString();
                kea1 kea1Var = (kea1) this.b;
                Map<String, String> mapA = a(i, str, string, set);
                nv41Var.a = set;
                nv41Var.b = string;
                nv41Var.e = 1;
                Object objA = kea1Var.a(mapA, nv41Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
                obj = objA;
                str2 = string;
            } else {
                if (i3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = nv41Var.b;
                set = nv41Var.a;
                hm5.M(obj);
            }
            h290<Entity> h290VarO = ((AutocompleteViewResponse) obj).o();
            ArrayList arrayList = new ArrayList();
            for (Entity entity : h290VarO) {
                entity.getClass();
                dw41 dw41VarO = o(entity);
                if (dw41VarO != null) {
                    arrayList.add(dw41VarO);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                dw41 dw41Var = (dw41) obj2;
                if (dw41Var instanceof cw41) {
                    zContains = set.contains(wy41.a);
                } else {
                    if (!(dw41Var instanceof bw41)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zContains = set.contains(wy41.b);
                }
                if (zContains) {
                    arrayList2.add(obj2);
                }
            }
            return new qv41(arrayList2, str2);
        } catch (Exception e) {
            op71.x(nv41Var.getContext());
            Logger.e(e, "SongDNA search: autocomplete request failed for %d entity types.", new Object[]{new Integer(set.size())});
            return pv41.a;
        }
    }

    public boolean m(List list, Map map) {
        if (((xp4) this.c).b()) {
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (ihc1.h0(((ll81) it.next()).a, "session_control_display", false)) {
                        Set setKeySet = map.keySet();
                        if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
                            Iterator it2 = setKeySet.iterator();
                            while (it2.hasNext()) {
                                if (ihc1.h0((String) it2.next(), "session_control_display", false)) {
                                    return true;
                                }
                            }
                            break;
                        }
                        break;
                    }
                }
            }
        }
        return false;
    }

    public void n(jf01 jf01Var, ry21 ry21Var) {
        try {
            ohd ohdVar = (ohd) this.b;
            String str = (String) this.c;
            try {
                if (ohdVar.s() instanceof ago0) {
                    if (ry21Var.Q0) {
                        ohdVar.resumeWith(qxd0.R(ry21Var.g, 10485760L));
                    } else {
                        ohdVar.resumeWith(new m231(new IOException("Failed to fetch Rive asset from " + str + " (HTTP " + ry21Var.d + ")")));
                    }
                }
                ry21Var.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    u890.p(ry21Var, th);
                    throw th2;
                }
            }
        } catch (IOException e) {
            k(jf01Var, e);
        }
    }

    public void p() {
        ni61 ni61Var = (ni61) this.b;
        Object obj = ni61Var.b;
        Object obj2 = this.c;
        synchronized (obj) {
            try {
                mi61 mi61Var = ni61Var.c;
                if ((mi61Var != null ? mi61Var.a : null) == obj2) {
                    ni61Var.c = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ m021(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public m021(t2j0 t2j0Var) {
        this.a = (byte) 28;
        this.b = t2j0Var;
        this.c = new CopyOnWriteArraySet();
    }

    public m021(i8h1 i8h1Var) {
        this.a = (byte) 3;
        this.b = i8h1Var;
        this.c = new dsk0((byte) 10);
    }

    public m021(pvc pvcVar, xae xaeVar, q8n q8nVar) {
        this.a = (byte) 1;
        this.b = xaeVar;
        this.c = q8nVar;
    }

    public m021(i8h1 i8h1Var, r6h1 r6h1Var) {
        this.a = (byte) 26;
        this.b = i8h1Var;
        this.c = new opl0(r6h1Var, (byte) 5);
    }
}
