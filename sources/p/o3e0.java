package p;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.metadata.proto.Metadata;
import com.spotify.player.model.ContextTrack;
import com.spotify.recentlyplayed.recentlyplayed.RecentlyPlayedEntity;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletablePeek;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o3e0 implements o2r0, Function {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;

    public o3e0(List list) {
        this.a = (byte) 19;
        this.d = list;
        this.b = new ArrayList(list.size());
        this.c = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ((ArrayList) this.b).add(((b8h0) list.get(i)).b.v1());
            ((ArrayList) this.c).add(((b8h0) list.get(i)).c.c0());
        }
    }

    public static spq0 b(p510 p510Var) {
        String str = p510Var.c;
        if (str == null) {
            return j5.a;
        }
        Uri uri = Uri.EMPTY;
        String str2 = p510Var.b;
        String str3 = p510Var.d;
        return new i5w0(new u310(str, (String) null, str2, (String) null, str3 != null ? Uri.parse(str3) : uri, (Uri) null, uri, uri, uri, (Uri) null, (Uri) null, 2, false, false, false, false, 3, 4, (Double) null, (Integer) null, (Integer) null, false, (String) null, (String) null, (Integer) null, 0, (y310) null, (String) null, (Long) null, (String) null, (Map) null, p510Var.f, (String) null, (oz0) null, 1073741856, 12));
    }

    public static u310 e(Metadata.Album album, String str) {
        String string = y6b1.a(g9a.a(album.q().t())).toString();
        String name = album.getName();
        if (jhc1.F(string) || jhc1.F(name)) {
            return null;
        }
        spq0 spq0VarQ = q(album.n());
        Uri uri = Uri.EMPTY;
        Uri uri2 = Uri.parse(string);
        return new u310(string, (String) null, name, album.hasDate() ? String.valueOf(album.o().getYear()) : null, spq0VarQ.c() ? Uri.parse((String) spq0VarQ.b()) : uri, (Uri) null, uri, uri, uri, uri2, (Uri) null, 2, false, false, false, false, 3, 4, (Double) null, (Integer) null, (Integer) null, false, (String) null, (String) null, (Integer) null, 0, (y310) null, str, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, 1073741856, 12);
    }

    public static spq0 q(Metadata.ImageGroup imageGroup) {
        return imageGroup.getImageCount() > 0 ? new i5w0(y6b1.i(zno1.z(imageGroup.o().n().t())).toString()) : j5.a;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object a(zay0 zay0Var, onm onmVar) throws Throwable {
        n3e0 n3e0Var;
        h7y0 m231Var;
        Throwable th;
        h7y0 h7y0Var;
        q37 m231Var2;
        Throwable thA;
        q37 q37Var;
        int i;
        String str;
        String str2;
        String string;
        c47 c47Var;
        Context context = (Context) this.d;
        if (onmVar instanceof n3e0) {
            n3e0Var = (n3e0) onmVar;
            int i2 = n3e0Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n3e0Var.d = i2 - Integer.MIN_VALUE;
            } else {
                n3e0Var = new n3e0(this, onmVar);
            }
        } else {
            n3e0Var = new n3e0(this, onmVar);
        }
        Object objY = n3e0Var.b;
        int i3 = n3e0Var.d;
        q37 q37Var2 = null;
        d9n d9nVar = d9n.a;
        try {
            if (i3 == 0) {
                hm5.M(objY);
                pux0 pux0Var = (pux0) this.b;
                String str3 = zay0Var.a.a;
                n3e0Var.d = 1;
                objY = pux0Var.h(str3, n3e0Var);
                if (objY == d9nVar) {
                }
                return d9nVar;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                h7y0Var = n3e0Var.a;
                try {
                    hm5.M(objY);
                    m231Var2 = (q37) objY;
                } catch (Throwable th2) {
                    th = th2;
                    m231Var2 = new m231(th);
                }
                thA = e331.a(m231Var2);
                if (thA == null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
                    throw thA;
                }
                q37Var = m231Var2 instanceof m231 ? null : m231Var2;
                if (q37Var != null || (c47Var = q37Var.a) == null) {
                    i = wkk1.i.d;
                } else {
                    i = c47Var.a;
                }
                e9d1 e9d1VarO = b9p1.o(context, i);
                str = h7y0Var.c;
                if (str == null) {
                    str = "";
                }
                String str4 = h7y0Var.a;
                str2 = h7y0Var.d;
                if (str2 != null) {
                    string = context.getString(2131960638, str2);
                    string.getClass();
                } else {
                    string = context.getString(2131960136);
                    string.getClass();
                }
                return new cby0(str, e9d1VarO.a, str4, string);
            }
            hm5.M(objY);
            m231Var = (h7y0) objY;
        } catch (Throwable th3) {
            m231Var = new m231(th3);
        }
        Throwable thA2 = e331.a(m231Var);
        if (thA2 != null && !(thA2 instanceof TimeoutCancellationException) && (thA2 instanceof CancellationException)) {
            throw thA2;
        }
        if (e331.a(m231Var) != null) {
            return bby0.a;
        }
        h7y0 h7y0Var2 = m231Var;
        try {
            m27 m27Var = (m27) this.c;
            String str5 = h7y0Var2.c;
            n3e0Var.a = h7y0Var2;
            n3e0Var.d = 2;
            objY = fn31.Y(m27Var.b, new k96((byte) 6, (Object) m27Var, str5, (lnm) q37Var2), n3e0Var);
            if (objY != d9nVar) {
                h7y0Var = h7y0Var2;
                m231Var2 = (q37) objY;
                thA = e331.a(m231Var2);
                if (thA == null) {
                }
                q37Var = m231Var2 instanceof m231 ? null : m231Var2;
                if (q37Var != null) {
                    i = wkk1.i.d;
                } else {
                    i = wkk1.i.d;
                }
                e9d1 e9d1VarO2 = b9p1.o(context, i);
                str = h7y0Var.c;
                if (str == null) {
                    str = "";
                }
                String str6 = h7y0Var.a;
                str2 = h7y0Var.d;
                if (str2 != null) {
                    string = context.getString(2131960638, str2);
                    string.getClass();
                } else {
                    string = context.getString(2131960136);
                    string.getClass();
                }
                return new cby0(str, e9d1VarO2.a, str6, string);
            }
            return d9nVar;
        } catch (Throwable th4) {
            th = th4;
            h7y0Var = h7y0Var2;
            m231Var2 = new m231(th);
        }
    }

    public Object apply(Object obj) {
        String str = null;
        switch (this.a) {
            case 10:
                String str2 = (String) this.c;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                lnf0 lnf0Var = (lnf0) this.b;
                if (zBooleanValue) {
                    return lnf0Var.d.b(str2, (String) this.d).onErrorResumeNext(new yge0(lnf0Var, str2, (byte) 7));
                }
                o3e0 o3e0Var = lnf0Var.e;
                Single singleDefer = Single.defer(new omf0(o3e0Var, str2, (byte) 0));
                Scheduler scheduler = (Scheduler) o3e0Var.d;
                return singleDefer.subscribeOn(scheduler).flatMap(new eb80(o3e0Var, (byte) 21)).observeOn(scheduler);
            case 11:
                Boolean bool = (Boolean) obj;
                fdc fdcVar = (fdc) this.b;
                lnf0 lnf0Var2 = (lnf0) fdcVar.c;
                String strUri = ((ContextTrack) this.c).uri();
                String str3 = (String) this.d;
                if (fdcVar.b && bool.booleanValue()) {
                    str = (String) ((sqs0) fdcVar.e).b.getValue();
                }
                return lnf0Var2.d(strUri, str3, dhf0.d, str);
            case 20:
                Observable observableFlatMapObservable = ((Single) this.b).flatMapObservable(new j2e0((dxy) this.c, (jeh0) obj, (byte) 19));
                l811 l811Var = (l811) this.d;
                return observableFlatMapObservable.doOnError(new ieh0(l811Var, (byte) 0)).doOnNext(new ieh0(l811Var, (byte) 1)).map(f610.N0).onErrorReturn(o610.O0);
            case 21:
                qjv qjvVar = (ujv) obj;
                s24 s24Var = (s24) this.b;
                m210 m210Var = (m210) this.c;
                String str4 = (String) this.d;
                g510 g510Var = (g510) s24Var.c;
                if (qjvVar instanceof pjv) {
                    return g510Var.c(m210Var, true);
                }
                if (qjvVar instanceof rjv) {
                    return g510Var.c(m210Var, false);
                }
                if (qjvVar instanceof qjv) {
                    return g510.q(g510Var, m210Var, g510Var.h.h(qjvVar.a, str4));
                }
                if (qjvVar instanceof sjv) {
                    return g510.q(g510Var, m210Var, g510Var.h.o(str4, ((sjv) qjvVar).a));
                }
                if (!(qjvVar instanceof tjv)) {
                    eg.o();
                    return null;
                }
                Single singleError = Single.error(new IllegalArgumentException("Unknown curation event: " + qjvVar));
                singleError.getClass();
                return singleError;
            case 22:
                k791 k791Var = (k791) obj;
                m210 m210Var2 = (m210) this.d;
                g710 g710Var = (a710) this.b;
                s24 s24Var2 = (s24) this.c;
                if (k791Var instanceof j791) {
                    Flowable flowable = (Flowable) s24Var2.d;
                    return new FlowableSingleSingle(ydh.f(flowable, flowable)).flatMapCompletable(new w6e0(s24Var2, k791Var, g710Var, m210Var2, (byte) 17));
                }
                g710 g710Var2 = g710Var;
                g710Var2.getClass();
                return g710Var2.k.a(new l9u0()).doOnSuccess(new b710(g710Var2, (byte) 0)).ignoreElement().q(((g510) s24Var2.c).n(m210Var2).ignoreElement());
            default:
                int i = ((ota1) obj).a;
                int i2 = 100;
                int[] iArr = {100, 120, 150, 180, 200};
                for (int i3 = 0; i3 < 5; i3++) {
                    int i4 = iArr[i3];
                    if (i < i4) {
                        i2 = i4;
                        g710 g710Var3 = (g710) this.b;
                        CompletablePeek completablePeekH = ((pta1) g710Var3.l.getValue()).c(g710Var3.j, i2).h(dxu.U0);
                        g510 g510Var2 = (g510) ((s24) this.c).c;
                        return completablePeekH.q(g510Var2.b.u0().map(new sw9(g510Var2, i2, (byte) 7)).flatMap(new t64(i2, (m210) this.d, g510Var2)).ignoreElement());
                    }
                }
                g710 g710Var4 = (g710) this.b;
                CompletablePeek completablePeekH2 = ((pta1) g710Var4.l.getValue()).c(g710Var4.j, i2).h(dxu.U0);
                g510 g510Var3 = (g510) ((s24) this.c).c;
                return completablePeekH2.q(g510Var3.b.u0().map(new sw9(g510Var3, i2, (byte) 7)).flatMap(new t64(i2, (m210) this.d, g510Var3)).ignoreElement());
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    public spq0 c(t510 t510Var, String str, Boolean bool, boolean z, boolean z2, n3q0 n3q0Var, y310 y310Var, int i, m210 m210Var, String str2, rz0 rz0Var) {
        Uri uri;
        Uri uriE;
        Uri uriE2;
        Uri uriE3;
        aai0 aai0Var = (aai0) this.b;
        String str3 = t510Var.c;
        if (str3 == null) {
            return j5.a;
        }
        Set set = s4b1.f;
        blc0 blc0Var = uic.x(str3).c;
        boolean zBooleanValue = bool.booleanValue();
        oz0 oz0Var = null;
        if (!str3.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") && !str3.equals("spotify:collection:tracks") && !str3.equals("spotify:internal:collection:tracks") && (!nhc1.Y(str3, "spotify:user:", false) || !nhc1.R(str3, ":collection", false))) {
            nyu0 nyu0VarC = oxu0.a.c(str3);
            if ((nyu0VarC instanceof nyu0 ? nyu0VarC : null) != null) {
                Boolean boolA = n3q0Var != null ? n3q0Var.a(str3) : null;
                boolean z3 = p5y.a(str3) != null;
                if (!zBooleanValue || (!(z2 || z || (boolA != null && boolA.booleanValue())) || z3)) {
                    zBooleanValue = false;
                } else {
                    zBooleanValue = true;
                }
            } else {
                int iOrdinal = blc0Var.ordinal();
                if (iOrdinal == 30 || iOrdinal == 44) {
                    if (zBooleanValue && (z || z2)) {
                        zBooleanValue = true;
                    } else {
                        zBooleanValue = false;
                    }
                } else if (iOrdinal == 111) {
                    zBooleanValue = true;
                } else if (iOrdinal != 166 && iOrdinal != 860 && iOrdinal != 208 && iOrdinal != 209) {
                    zBooleanValue = false;
                }
            }
        } else if (zBooleanValue && (z || z2)) {
            zBooleanValue = true;
        } else {
            zBooleanValue = false;
        }
        int i2 = zBooleanValue ? 2 : 1;
        int iN = ((bm00) this.c).n(m210Var, uic.x(str3).c);
        String str4 = t510Var.d;
        if (str4 != null) {
            uri = Uri.parse(str4);
            uriE3 = aai0Var.e(uri, iN, 3);
            uriE = aai0Var.e(uri, iN, 2);
            uriE2 = aai0Var.e(uri, iN, 1);
        } else {
            uri = Uri.EMPTY;
            uriE = uri;
            uriE2 = uriE;
            uriE3 = uriE2;
        }
        v310 v310Var = new v310(str3);
        v310Var.h = Uri.parse(str3);
        v310Var.v = i2;
        v310Var.b = t510Var.a;
        v310Var.c = t510Var.b;
        v310Var.d = uri;
        v310Var.i = Uri.parse(uic.x(str3).y());
        v310Var.e = uriE3;
        v310Var.f = uriE;
        v310Var.g = uriE2;
        v310Var.k = t510Var.e.booleanValue();
        v310Var.l = t510Var.f.booleanValue();
        v310Var.w = iN;
        v310Var.n = k4s0.d(i);
        v310Var.q = str;
        v310Var.s = t510Var.g;
        v310Var.m = Integer.valueOf(Math.toIntExact(t510Var.h.longValue()));
        Integer num = t510Var.i;
        num.getClass();
        v310Var.o = num;
        v310Var.d();
        v310Var.r = str2;
        v310Var.f40p = y310Var;
        v310Var.t = t510Var.j;
        if (rz0Var != null) {
            List list = rz0Var.a;
            if (list == null) {
                list = Collections.EMPTY_LIST;
            }
            List list2 = rz0Var.b;
            if (list2 == null) {
                list2 = Collections.EMPTY_LIST;
            }
            oz0Var = new oz0(list, list2, rz0Var.c, rz0Var.d, rz0Var.e, rz0Var.f, rz0Var.g, rz0Var.h, rz0Var.i, rz0Var.j, rz0Var.k);
        }
        v310Var.u = oz0Var;
        return new i5w0(v310Var.a());
    }

    public spq0 d(t510 t510Var, String str, Boolean bool, boolean z, boolean z2, n3q0 n3q0Var, y310 y310Var, m210 m210Var) {
        return c(t510Var, str, bool, z, z2, n3q0Var, y310Var, 1, m210Var, null, null);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x011a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0154  */
    public spq0 f(RecentlyPlayedEntity recentlyPlayedEntity, spq0 spq0Var, int i, r9c r9cVar, boolean z, boolean z2) {
        int i2;
        aai0 aai0Var = (aai0) this.b;
        String str = recentlyPlayedEntity.getDerivedData().g;
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(str);
        v5b1 v5b1Var = s4b1VarX.d;
        spq0 spq0VarA = (v5b1Var == null || v5b1Var.getType() != wyu0.f) ? spq0.a(str) : spq0.a(uic.y(s4b1VarX.h()).z());
        if (!spq0VarA.c()) {
            return j5.a;
        }
        String str2 = (String) spq0VarA.b();
        String strP = p(recentlyPlayedEntity.getLabels().a);
        String strP2 = p(recentlyPlayedEntity.getLabels().b);
        boolean z3 = recentlyPlayedEntity.getDerivedData().c instanceof hwp0;
        int iOrdinal = uic.x(str2).c.ordinal();
        if (iOrdinal == 44 || iOrdinal == 47 || iOrdinal == 62) {
            i2 = 1;
        } else {
            i2 = (iOrdinal == 844 || iOrdinal == 860) ? 2 : 3;
        }
        String str3 = recentlyPlayedEntity.getDerivedData().j;
        Uri uriC = Uri.parse(str3);
        v310 v310Var = new v310(str2);
        v310Var.h = Uri.parse(str2);
        v310Var.i = Uri.parse(uic.x(str2).y());
        v310Var.b = strP;
        v310Var.c = strP2;
        v310Var.j = z3;
        v310Var.w = i2;
        v310Var.n = k4s0.d(i);
        v310Var.d();
        if (!"spotify:image:0000000000000000000000000000000000000000".equals(str3)) {
            v310Var.e = aai0Var.e(uriC, i2, 3);
            v310Var.f = aai0Var.e(uriC, i2, 2);
            v310Var.g = aai0Var.e(uriC, i2, 1);
        } else if (recentlyPlayedEntity.getDerivedData().a == yo01.b) {
            uriC = aai0Var.c(2131230960);
        }
        v310Var.d = uriC;
        boolean z4 = false;
        if (!str2.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") && !str2.equals("spotify:collection:tracks") && !str2.equals("spotify:internal:collection:tracks") && (!nhc1.Y(str2, "spotify:user:", false) || !nhc1.R(str2, ":collection", false))) {
            int iOrdinal2 = recentlyPlayedEntity.getDerivedData().a.ordinal();
            if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                if (r9cVar.i && (z || z2)) {
                    z4 = true;
                }
            } else if (iOrdinal2 == 3) {
                z4 = r9cVar.i;
            } else if (iOrdinal2 == 6) {
                boolean z5 = p5y.a(str2) != null;
                if (r9cVar.i && ((z || l1d.d(recentlyPlayedEntity.getDerivedData().e, 1) || z2) && !z5)) {
                    z4 = true;
                }
            } else if (iOrdinal2 == 9) {
                z4 = r9cVar.i;
            }
        } else if (r9cVar.i && (z || z2)) {
            z4 = true;
        }
        if (z4) {
            v310Var.v = 2;
        } else {
            v310Var.v = 1;
        }
        if (z4 || spq0Var.c()) {
            v310Var.q = (String) spq0Var.h();
        }
        v310Var.r = "GRID";
        return new i5w0(v310Var.a());
    }

    public j4m g(nhr0 nhr0Var, Bundle bundle) {
        ipe0 ipe0Var = (ipe0) this.d;
        jhl jhlVar = nhr0Var.g.d;
        ipe0Var.b = jhlVar;
        jhlVar.c.a(new i83(ipe0Var, (byte) 12));
        nhr0Var.j(ipe0Var.c);
        return ((o2r0) this.c).g(nhr0Var, bundle);
    }

    public vqo h(String str, mr20 mr20Var, c0g c0gVar, n2g0 n2g0Var) {
        return new vqo(str, new uqo(null, n2g0Var.e, null, null, 29), mr20Var, c0gVar, new bsn(this, (byte) 3), new sqo(new e4f0(n2g0Var, (byte) 16)));
    }

    public ArrayList i() {
        return (ArrayList) this.b;
    }

    public List j() {
        return (List) this.d;
    }

    public n2r k() {
        return (n2r) this.b;
    }

    public ArrayList l() {
        return (ArrayList) this.c;
    }

    public void m(List list) {
        dh90 uh90Var;
        ArrayList<zrw> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r7h.W(((yrw) it.next()).a, arrayList);
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (zrw zrwVar : arrayList) {
            if (zrwVar instanceof zrw) {
                uh90Var = new dh90(zrwVar.a);
            } else if (zrwVar instanceof bsw) {
                uh90Var = new th90(((bsw) zrwVar).a);
            } else if (!(zrwVar instanceof asw)) {
                eg.o();
                return;
            } else {
                asw aswVar = (asw) zrwVar;
                uh90Var = new uh90(aswVar.b, aswVar.a, aswVar.c);
            }
            arrayList2.add(uh90Var);
        }
        List listJ0 = o7h.j0(arrayList2);
        if (listJ0.equals((List) this.d)) {
            return;
        }
        this.d = listJ0;
        ((huh0) this.c).a((String) this.b, new gx30((li90[]) listJ0.toArray(new li90[0]))).subscribe();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(k371 k371Var, onm onmVar) {
        s4e0 s4e0Var;
        if (onmVar instanceof s4e0) {
            s4e0Var = (s4e0) onmVar;
            int i = s4e0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                s4e0Var.c = i - Integer.MIN_VALUE;
            } else {
                s4e0Var = new s4e0(this, onmVar);
            }
        } else {
            s4e0Var = new s4e0(this, onmVar);
        }
        Object objR = s4e0Var.a;
        int i2 = s4e0Var.c;
        if (i2 == 0) {
            hm5.M(objR);
            s4e0Var.c = 1;
            objR = r(k371Var, s4e0Var);
            Object obj = d9n.a;
            if (objR == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objR);
        }
        ArrayList arrayList = new ArrayList();
        int size = 0;
        for (qj71 qj71Var : (List) objR) {
            if (qj71Var.b > 0) {
                size = arrayList.size() + qj71Var.b;
            }
            arrayList.addAll(qj71Var.a);
        }
        return new b871(arrayList, size);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0083 A[Catch: all -> 0x010a, CancellationException -> 0x0111, TryCatch #2 {CancellationException -> 0x0111, all -> 0x010a, blocks: (B:13:0x002e, B:36:0x00e9, B:38:0x00f3, B:40:0x00fd, B:18:0x004b, B:32:0x00b2, B:26:0x007d, B:28:0x0083, B:33:0x00cd, B:19:0x004f, B:25:0x0062, B:22:0x0056), top: B:47:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b1 -> B:32:0x00b2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object o(p.k371 r17, p.onm r18) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.o3e0.o(p.k371, p.onm):java.lang.Object");
    }

    public String p(wo01 wo01Var) {
        String string;
        if (wo01Var instanceof vo01) {
            return ((vo01) wo01Var).a;
        }
        if (!(wo01Var instanceof uo01)) {
            return "";
        }
        uo01 uo01Var = (uo01) wo01Var;
        Context context = (Context) this.d;
        int i = uo01Var.a;
        List list = uo01Var.b;
        if (list.isEmpty()) {
            string = context.getResources().getString(i);
        } else {
            Resources resources = context.getResources();
            Object[] array = list.toArray(new Object[0]);
            string = resources.getString(i, Arrays.copyOf(array, array.length));
        }
        string.getClass();
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:37:0x009a  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00eb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d7, code lost:
    
        if (r10 == r7) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object r(p.k371 r11, p.onm r12) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.o3e0.r(p.k371, p.onm):java.lang.Object");
    }

    public /* synthetic */ o3e0(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public o3e0(String str, huh0 huh0Var) {
        this.a = (byte) 26;
        this.b = str;
        this.c = huh0Var;
        this.d = z6x.a;
    }

    public o3e0(ikp ikpVar, h7l0 h7l0Var) {
        this.a = (byte) 15;
        this.b = ikpVar;
        this.c = h7l0Var;
        this.d = new idd1(new tzf0(this, (byte) 12));
    }

    public o3e0(Activity activity, ov20 ov20Var) {
        this.a = (byte) 13;
        this.b = activity;
        this.c = ov20Var;
        this.d = new idd1(new tzf0(this, (byte) 6));
    }

    public o3e0(f7i0 f7i0Var, a1r0 a1r0Var) {
        this.a = (byte) 28;
        this.b = f7i0Var;
        this.c = a1r0Var;
        this.d = smo1.g();
    }

    public o3e0(Context context, aqs0 aqs0Var, ecb0 ecb0Var) {
        this.a = (byte) 8;
        this.d = context;
        this.b = aqs0Var;
        this.c = ecb0Var;
    }

    public o3e0(ikp ikpVar, tdl0 tdl0Var) {
        this.a = (byte) 16;
        this.b = ikpVar;
        this.c = tdl0Var;
        this.d = new idd1(new tzf0(this, (byte) 16));
    }

    public o3e0(uag1 uag1Var, d0r d0rVar) {
        this.a = (byte) 3;
        this.b = d0rVar;
        this.c = uag1Var.a();
        this.d = w3p1.o(new l4r(pwc0.w, 1, u0e0.V0, new j4r(u0e0.T0), u0e0.W0), u0e0.U0);
    }

    public o3e0(z8c0 z8c0Var, c681 c681Var, lve1 lve1Var) {
        this.a = (byte) 12;
        this.b = z8c0Var;
        this.c = c681Var;
        lve1Var.getClass();
        this.d = lve1Var;
    }

    public o3e0(o2r0 o2r0Var, ipe0 ipe0Var) {
        this.a = (byte) 5;
        this.c = o2r0Var;
        this.d = ipe0Var;
        this.b = o2r0Var.k();
    }

    public o3e0(Context context, aai0 aai0Var, p5y p5yVar, bm00 bm00Var, agc0 agc0Var) {
        this.a = (byte) 24;
        this.d = context;
        this.b = aai0Var;
        this.c = bm00Var;
    }
}
