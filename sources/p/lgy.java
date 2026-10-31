package p;

import android.net.Uri;
import android.os.Handler;
import android.view.View;
import androidx.media3.common.ParserException;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.betamax.player.exception.BetamaxException;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lgy {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public lgy(smc0 smc0Var, Handler handler, yqg yqgVar, String str, boolean z) {
        this.b = smc0Var;
        this.c = handler;
        this.d = yqgVar;
        this.e = str;
        this.a = z;
        this.f = new ConcurrentHashMap();
        this.g = new ConcurrentHashMap();
        this.h = new ConcurrentHashMap();
        this.i = new hce1(handler, yqgVar, new fgs0(this, (byte) 28));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public static void b0(HashMap map, String str, String str2) throws ParserException {
        if (!map.containsKey(str) || str2.equals(map.get(str))) {
            map.put(str, str2);
            return;
        }
        throw ParserException.b("The group ID " + str + " is associated with more than one pathway from variants");
    }

    public void A(m0u0 m0u0Var) {
        long jB = ((yqg) this.d).b();
        Iterator it = h(m0u0Var).iterator();
        while (it.hasNext()) {
            ((Handler) this.c).post(new qzt0((c0u0) it.next(), jB, (byte) 2));
        }
    }

    public void B(m0u0 m0u0Var, int i, jgc1 jgc1Var) {
        long jB = ((yqg) this.d).b();
        Iterator it = h(m0u0Var).iterator();
        while (it.hasNext()) {
            ((Handler) this.c).post(new uzt0((c0u0) it.next(), i, jgc1Var, jB));
        }
    }

    public void C(m0u0 m0u0Var, long j) {
        long jB = ((yqg) this.d).b();
        Iterator it = h(m0u0Var).iterator();
        while (it.hasNext()) {
            ((Handler) this.c).post(new pzt0((c0u0) it.next(), j, jB, (byte) 4));
        }
    }

    public void D(m0u0 m0u0Var, boolean z, boolean z2, float f, VideoSurfaceView videoSurfaceView) {
        long jB = ((yqg) this.d).b();
        Iterator it = h(m0u0Var).iterator();
        while (it.hasNext()) {
            ((Handler) this.c).post(new vzt0((c0u0) it.next(), z, z2, f, videoSurfaceView, jB));
        }
    }

    public void E(m0u0 m0u0Var) {
        Handler handler = (Handler) this.c;
        long jB = ((yqg) this.d).b();
        pjj1 pjj1Var = (pjj1) ((ConcurrentHashMap) ((hce1) this.i).e).remove(m0u0Var);
        if (pjj1Var != null) {
            pjj1Var.a.invoke(new xaj1(pjj1Var, (byte) 13));
        }
        List list = (List) ((ConcurrentHashMap) this.h).remove(m0u0Var);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                handler.post(new wzt0((n590) it.next(), jB, (byte) 0));
            }
            return;
        }
        List<c0u0> list2 = (List) ((ConcurrentHashMap) this.f).remove(m0u0Var);
        if (list2 != null) {
            for (c0u0 c0u0Var : list2) {
                if (c0u0Var instanceof n590) {
                    handler.post(new wzt0((n590) c0u0Var, jB, (byte) 1));
                }
            }
        }
    }

    public void F(m0u0 m0u0Var, int i, r4t r4tVar, long j) {
        z6x z6xVarH;
        boolean z = this.a;
        long jB = ((yqg) this.d).b();
        np00 np00Var = (np00) ((ConcurrentHashMap) this.g).remove(m0u0Var);
        if (np00Var != null) {
            np00Var.a.invoke(new gi00(np00Var, (byte) 1));
        }
        if (z) {
            z6xVarH = (List) ((ConcurrentHashMap) this.f).remove(m0u0Var);
            if (z6xVarH == null) {
                z6xVarH = z6x.a;
            }
        } else {
            z6xVarH = h(m0u0Var);
        }
        if (z) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : (Iterable) z6xVarH) {
                if (obj instanceof n590) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                ((ConcurrentHashMap) this.h).put(m0u0Var, arrayList);
            }
        }
        rm5 rm5VarC = r4tVar.c();
        try {
            Iterator it = z6xVarH.iterator();
            while (it.hasNext()) {
                ((Handler) this.c).post(new xzt0((c0u0) it.next(), r4tVar, i, j, jB, r4tVar.c()));
            }
            rm5VarC.H();
        } catch (Throwable th) {
            rm5VarC.H();
            throw th;
        }
    }

    public void G(float f, long j, m0u0 m0u0Var) {
        long jB = ((yqg) this.d).b();
        Iterator it = h(m0u0Var).iterator();
        while (it.hasNext()) {
            ((Handler) this.c).post(new yzt0((c0u0) it.next(), f, j, jB));
        }
    }

    public void H(m0u0 m0u0Var, long j) {
        long jB = ((yqg) this.d).b();
        Iterator it = h(m0u0Var).iterator();
        while (it.hasNext()) {
            ((Handler) this.c).post(new pzt0((c0u0) it.next(), j, jB, (byte) 5));
        }
    }

    public void I(m0u0 m0u0Var, long j) {
        long jB = ((yqg) this.d).b();
        Iterator it = h(m0u0Var).iterator();
        while (it.hasNext()) {
            ((Handler) this.c).post(new pzt0((c0u0) it.next(), j, jB, (byte) 6));
        }
    }

    public void J(m0u0 m0u0Var, BetamaxException betamaxException, long j) {
        long jB = ((yqg) this.d).b();
        Iterator it = h(m0u0Var).iterator();
        while (it.hasNext()) {
            ((Handler) this.c).post(new szt0((c0u0) it.next(), betamaxException, j, jB, (byte) 1));
        }
    }

    public void K(m0u0 m0u0Var, long j) {
        long jB = ((yqg) this.d).b();
        Iterator it = h(m0u0Var).iterator();
        while (it.hasNext()) {
            ((Handler) this.c).post(new pzt0((c0u0) it.next(), j, jB, (byte) 7));
        }
    }

    public void L(m0u0 m0u0Var, ko51 ko51Var) {
        long jB = ((yqg) this.d).b();
        Iterator it = h(m0u0Var).iterator();
        while (it.hasNext()) {
            ((Handler) this.c).post(new zzt0((c0u0) it.next(), ko51Var, jB));
        }
    }

    public void M(m0u0 m0u0Var, long j, long j2, boolean z) {
        long jB = ((yqg) this.d).b();
        Iterator it = h(m0u0Var).iterator();
        while (it.hasNext()) {
            ((Handler) this.c).post(new a0u0((c0u0) it.next(), j, j2, z, jB, (byte) 0));
        }
    }

    public void N(m0u0 m0u0Var, long j, long j2, boolean z) {
        long jB = ((yqg) this.d).b();
        Iterator it = h(m0u0Var).iterator();
        while (it.hasNext()) {
            ((Handler) this.c).post(new a0u0((c0u0) it.next(), j, j2, z, jB, (byte) 1));
        }
    }

    public void O(m0u0 m0u0Var, llb1 llb1Var) {
        for (c0u0 c0u0Var : h(m0u0Var)) {
            if (c0u0Var instanceof n590) {
                ((Handler) this.c).post(new jyh0((n590) c0u0Var, llb1Var, (byte) 8));
            }
        }
    }

    public void P(m0u0 m0u0Var, long j, hpc1 hpc1Var) {
        long jB = ((yqg) this.d).b();
        Iterator it = h(m0u0Var).iterator();
        while (it.hasNext()) {
            ((Handler) this.c).post(new nzt0((c0u0) it.next(), hpc1Var, j, jB, (byte) 1));
        }
    }

    public void Q(m0u0 m0u0Var, VideoSurfaceView videoSurfaceView, long j) {
        long jB = ((yqg) this.d).b();
        Iterator it = h(m0u0Var).iterator();
        while (it.hasNext()) {
            ((Handler) this.c).post(new nzt0((c0u0) it.next(), videoSurfaceView, j, jB, (byte) 2));
        }
    }

    public void R(m0u0 m0u0Var, int i, long j) {
        long jB = ((yqg) this.d).b();
        Iterator it = h(m0u0Var).iterator();
        while (it.hasNext()) {
            ((Handler) this.c).post(new zzt0((c0u0) it.next(), i, j, jB));
        }
    }

    public void S(m0u0 m0u0Var) {
        long jB = ((yqg) this.d).b();
        for (c0u0 c0u0Var : h(m0u0Var)) {
            if (c0u0Var instanceof n590) {
                ((Handler) this.c).post(new wzt0((n590) c0u0Var, jB, (byte) 2));
            }
        }
    }

    public void T(m0u0 m0u0Var, boolean z, long j) {
        long jB = ((yqg) this.d).b();
        Iterator it = h(m0u0Var).iterator();
        while (it.hasNext()) {
            ((Handler) this.c).post(new mzt0((c0u0) it.next(), z, j, jB, (byte) 2));
        }
    }

    public void U(m0u0 m0u0Var, ie30 ie30Var, long j) {
        long jB = ((yqg) this.d).b();
        Iterator it = h(m0u0Var).iterator();
        while (it.hasNext()) {
            ((Handler) this.c).post(new nzt0((c0u0) it.next(), new koj1(ie30Var.i, ie30Var.j, ie30Var.w, ie30Var.x, ie30Var.B, ie30Var.l), j, jB, (byte) 3));
        }
    }

    public void V(m0u0 m0u0Var, long j) {
        long jB = ((yqg) this.d).b();
        Iterator it = h(m0u0Var).iterator();
        while (it.hasNext()) {
            ((Handler) this.c).post(new zzt0((c0u0) it.next(), j, jB, (byte) 2));
        }
    }

    public void W(m0u0 m0u0Var, long j) {
        long jB = ((yqg) this.d).b();
        Iterator it = h(m0u0Var).iterator();
        while (it.hasNext()) {
            ((Handler) this.c).post(new zzt0((c0u0) it.next(), j, jB, (byte) 3));
        }
    }

    public void X(float f, long j, m0u0 m0u0Var) {
        long jB = ((yqg) this.d).b();
        Iterator it = h(m0u0Var).iterator();
        while (it.hasNext()) {
            ((Handler) this.c).post(new b0u0((c0u0) it.next(), f, j, jB));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public String Y(Uri uri, String str, int i, ArrayList arrayList, ll60 ll60Var, HashMap map, HashMap map2) throws ParserException {
        Integer num = (Integer) map.get(ll60Var);
        if (num == null) {
            if (str == null) {
                map2.put(ll60Var, 1);
                str = ".";
            } else {
                map2.put(ll60Var, 0);
            }
            ml60 ml60Var = new ml60(ll60Var, str, uri, i);
            map.put(ll60Var, Integer.valueOf(arrayList.size()));
            arrayList.add(ml60Var);
            return str;
        }
        if (str == null) {
            Integer num2 = (Integer) map2.get(ll60Var);
            num2.getClass();
            int iIntValue = num2.intValue();
            if (this.a && iIntValue >= 1) {
                throw ParserException.b("At most one playlist URL within an HlsRedundantGroup can have an undefined pathway when Content Steering is enabled");
            }
            int i2 = iIntValue + 1;
            String strT = m5n1.T(i2, ".");
            map2.put(ll60Var, Integer.valueOf(i2));
            str = strT;
        }
        ml60 ml60Var2 = (ml60) arrayList.get(num.intValue());
        Uri uri2 = (Uri) ml60Var2.b.get(str);
        if (uri2 == null || uri.equals(uri2)) {
            ml60Var2.b.put(str, uri);
            if (i != -1) {
                ml60Var2.c.add(Integer.valueOf(i));
            }
            return str;
        }
        throw ParserException.b("Different playlist URLs are found for pathway ID " + str + " within the HlsRedundantGroup");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object Z(jo70 jo70Var, onm onmVar) throws Throwable {
        qbz qbzVar;
        io70 io70Var;
        ia81 m231Var;
        hll hllVar;
        jo70 jo70Var2;
        wkk1 wkk1Var;
        String str;
        if (onmVar instanceof qbz) {
            qbzVar = (qbz) onmVar;
            int i = qbzVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qbzVar.d = i - Integer.MIN_VALUE;
            } else {
                qbzVar = new qbz(this, onmVar);
            }
        } else {
            qbzVar = new qbz(this, onmVar);
        }
        Object obj = qbzVar.b;
        int i2 = qbzVar.d;
        Long l = null;
        if (i2 == 0) {
            hm5.M(obj);
            io70 io70Var2 = jo70Var.e;
            if (io70Var2 == null) {
                return null;
            }
            try {
                u271 u271Var = (u271) this.h;
                String str2 = io70Var2.b;
                qbzVar.a = io70Var2;
                qbzVar.d = 1;
                Object objA = u271Var.a(str2, qbzVar);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
                io70Var = io70Var2;
                obj = objA;
            } catch (Throwable th) {
                th = th;
                io70Var = io70Var2;
                m231Var = new m231(th);
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            io70Var = qbzVar.a;
            try {
                hm5.M(obj);
            } catch (Throwable th2) {
                th = th2;
                m231Var = new m231(th);
            }
        }
        m231Var = (ia81) obj;
        Throwable thA = e331.a(m231Var);
        if (thA != null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
            throw thA;
        }
        if (m231Var instanceof m231) {
            m231Var = null;
        }
        ia81 ia81Var = m231Var;
        jlw0 jlw0Var = (ia81Var == null || (wkk1Var = ia81Var.c) == null || (str = wkk1Var.b) == null) ? null : new jlw0(str, io70Var.a);
        String str3 = io70Var.b;
        String str4 = io70Var.a;
        List list = (ia81Var == null || (jo70Var2 = ia81Var.a) == null) ? null : jo70Var2.d;
        if (list == null) {
            list = z6x.a;
        }
        String strY0 = o7h.y0(list, ", ", (String) null, (String) null, f9z.N0, 30);
        if (ia81Var != null && (hllVar = ia81Var.b) != null) {
            l = new Long(jfv.h(hllVar.a));
        }
        return new h281(str3, str4, jlw0Var, strY0, l);
    }

    public void a(String str) {
        this.e = str;
    }

    public void a0() {
        this.a = true;
    }

    public void b(int i) {
        Integer num = (Integer) this.d;
        n57.k(num == null || num.intValue() != 0, "Invalid resource ID provided: %s", new Object[]{num});
        this.f = Integer.valueOf(i);
    }

    public er91 c() {
        return new er91((fs91) this.b, (String) this.c, (Integer) this.d, (String) this.e, (Integer) this.f, (View.OnClickListener) this.g, (cvr) this.h, (xq91) this.i, this.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public b380 d(List list, HashMap map) throws ParserException {
        String str;
        lgy lgyVar;
        boolean z = this.a;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        int i = 0;
        while (i < list.size()) {
            dl60 dl60Var = (dl60) list.get(i);
            Uri uri = dl60Var.a;
            ll60 ll60Var = new ll60(dl60Var.b, dl60Var.e, dl60Var.d);
            if (z) {
                str = (String) map.get(dl60Var.c);
                if (str == null) {
                    lgyVar = this;
                }
                i++;
                this = lgyVar;
            } else {
                str = null;
            }
            String str2 = str;
            Uri uri2 = dl60Var.a;
            lgyVar = this;
            lgyVar.Y(uri2, str2, i, arrayList, ll60Var, map2, map3);
            i++;
            this = lgyVar;
        }
        lgy lgyVar2 = this;
        if (z) {
            ml60 ml60Var = (ml60) ((b380) lgyVar2.f).get(0);
            ml60Var.getClass();
            t380 t380VarA = ml60Var.a();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (!((ml60) arrayList.get(i2)).a().equals(t380VarA)) {
                    throw ParserException.b("The set of available pathway IDs of a rendition redundant group is inconsistent with variant redundant groups");
                }
            }
        }
        return b380.p(arrayList);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public b380 e(int i) throws ParserException {
        fl60 fl60Var = (fl60) this.b;
        f();
        if (i == 1) {
            b380 b380Var = (b380) this.g;
            if (b380Var != null) {
                return b380Var;
            }
            b380 b380VarD = d(fl60Var.f, (HashMap) this.c);
            this.g = b380VarD;
            return b380VarD;
        }
        if (i == 2) {
            b380 b380Var2 = (b380) this.h;
            if (b380Var2 != null) {
                return b380Var2;
            }
            b380 b380VarD2 = d(fl60Var.g, (HashMap) this.d);
            this.h = b380VarD2;
            return b380VarD2;
        }
        if (i != 3) {
            hhg1.n("Invalid type for creating rendition redundant group list");
            return null;
        }
        b380 b380Var3 = (b380) this.i;
        if (b380Var3 != null) {
            return b380Var3;
        }
        b380 b380VarD3 = d(fl60Var.h, (HashMap) this.e);
        this.i = b380VarD3;
        return b380VarD3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public void f() throws ParserException {
        boolean z = this.a;
        fl60 fl60Var = (fl60) this.b;
        if (((b380) this.f) == null) {
            ArrayList arrayList = new ArrayList();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            int i = 0;
            while (i < fl60Var.e.size()) {
                el60 el60Var = (el60) fl60Var.e.get(i);
                lgy lgyVar = this;
                String strY = lgyVar.Y(el60Var.a, el60Var.g, i, arrayList, new ll60(el60Var.b, el60Var.h, (String) null), map, map2);
                if (z) {
                    String str = el60Var.c;
                    if (str != null) {
                        b0((HashMap) lgyVar.c, str, strY);
                    }
                    String str2 = el60Var.d;
                    if (str2 != null) {
                        b0((HashMap) lgyVar.d, str2, strY);
                    }
                    String str3 = el60Var.e;
                    if (str3 != null) {
                        b0((HashMap) lgyVar.e, str3, strY);
                    }
                }
                i++;
                this = lgyVar;
            }
            lgy lgyVar2 = this;
            b380 b380VarP = b380.p(arrayList);
            lgyVar2.f = b380VarP;
            if (z) {
                ml60 ml60Var = (ml60) b380VarP.get(0);
                ml60Var.getClass();
                t380 t380VarA = ml60Var.a();
                for (int i2 = 1; i2 < ((b380) lgyVar2.f).size(); i2++) {
                    if (!((ml60) ((b380) lgyVar2.f).get(i2)).a().equals(t380VarA)) {
                        throw ParserException.b("The set of available pathway IDs is inconsistent among variant redundant groups");
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable g(String str, onm onmVar) throws Throwable {
        obz obzVar;
        Long m231Var;
        if (onmVar instanceof obz) {
            obzVar = (obz) onmVar;
            int i = obzVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                obzVar.d = i - Integer.MIN_VALUE;
            } else {
                obzVar = new obz(this, onmVar);
            }
        } else {
            obzVar = new obz(this, onmVar);
        }
        Object objJ = obzVar.b;
        int i2 = obzVar.d;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                Single singleZ = ((Flowable) this.d).z();
                obzVar.a = str;
                obzVar.d = 1;
                objJ = fc11.j(singleZ, obzVar);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = obzVar.a;
                hm5.M(objJ);
            }
            PlayerState playerState = (PlayerState) objJ;
            ContextTrack contextTrack = (ContextTrack) playerState.track().h();
            String strUri = contextTrack != null ? contextTrack.uri() : null;
            m231Var = (strUri == null || !strUri.equals(str)) ? null : (Long) playerState.position(((yqg) this.e).b()).h();
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
            throw thA;
        }
        if (m231Var instanceof m231) {
            return null;
        }
        return m231Var;
    }

    public List h(m0u0 m0u0Var) {
        List list = (List) ((ConcurrentHashMap) this.f).get(m0u0Var);
        return list == null ? z6x.a : list;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable i(String str, onm onmVar) throws Throwable {
        pbz pbzVar;
        Long m231Var;
        Throwable thA;
        if (onmVar instanceof pbz) {
            pbzVar = (pbz) onmVar;
            int i = pbzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pbzVar.c = i - Integer.MIN_VALUE;
            } else {
                pbzVar = new pbz(this, onmVar);
            }
        } else {
            pbzVar = new pbz(this, onmVar);
        }
        Object objJ = pbzVar.a;
        int i2 = pbzVar.c;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                if (str == null) {
                    m231Var = null;
                } else {
                    lqr lqrVar = (lqr) this.f;
                    pbzVar.c = 1;
                    objJ = lqrVar.j(str, pbzVar);
                    d9n d9nVar = d9n.a;
                    if (objJ == d9nVar) {
                        return d9nVar;
                    }
                }
                thA = e331.a(m231Var);
                if (thA == null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
                    throw thA;
                }
                if (m231Var instanceof m231) {
                    return null;
                }
                return m231Var;
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
            m231Var = (Long) objJ;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        thA = e331.a(m231Var);
        if (thA == null) {
        }
        if (m231Var instanceof m231) {
            return null;
        }
        return m231Var;
    }

    public void j(View.OnClickListener onClickListener) {
        this.g = onClickListener;
    }

    public void k(m0u0 m0u0Var, boolean z, long j) {
        long jB = ((yqg) this.d).b();
        Iterator it = h(m0u0Var).iterator();
        while (it.hasNext()) {
            ((Handler) this.c).post(new mzt0((c0u0) it.next(), z, j, jB, (byte) 0));
        }
    }

    public void l(m0u0 m0u0Var, ie30 ie30Var, long j) {
        long jB = ((yqg) this.d).b();
        Iterator it = h(m0u0Var).iterator();
        while (it.hasNext()) {
            ((Handler) this.c).post(new nzt0((c0u0) it.next(), new ev7(ie30Var.i, ie30Var.l, ie30Var.j, ie30Var.d), j, jB, (byte) 0));
        }
    }

    public void m(m0u0 m0u0Var, int i, long j) {
        long jB = ((yqg) this.d).b();
        Iterator it = h(m0u0Var).iterator();
        while (it.hasNext()) {
            ((Handler) this.c).post(new ozt0((c0u0) it.next(), i, j, jB));
        }
    }

    public void n(m0u0 m0u0Var, boolean z, long j) {
        long jB = ((yqg) this.d).b();
        Iterator it = h(m0u0Var).iterator();
        while (it.hasNext()) {
            ((Handler) this.c).post(new mzt0((c0u0) it.next(), z, j, jB, (byte) 1));
        }
    }

    public void o(m0u0 m0u0Var, long j, long j2, long j3) {
        long jB = ((yqg) this.d).b();
        Iterator it = h(m0u0Var).iterator();
        while (it.hasNext()) {
            ((Handler) this.c).post(new pzt0((c0u0) it.next(), j, j2, j3, jB));
        }
    }

    public void p(m0u0 m0u0Var, long j) {
        long jB = ((yqg) this.d).b();
        Iterator it = h(m0u0Var).iterator();
        while (it.hasNext()) {
            ((Handler) this.c).post(new pzt0((c0u0) it.next(), j, jB, (byte) 1));
        }
    }

    public void q(m0u0 m0u0Var, long j) {
        long jB = ((yqg) this.d).b();
        Iterator it = h(m0u0Var).iterator();
        while (it.hasNext()) {
            ((Handler) this.c).post(new qzt0((c0u0) it.next(), j, jB));
        }
    }

    public void r(m0u0 m0u0Var, long j) {
        long jB = ((yqg) this.d).b();
        Iterator it = h(m0u0Var).iterator();
        while (it.hasNext()) {
            ((Handler) this.c).post(new pzt0((c0u0) it.next(), j, jB, (byte) 2));
        }
    }

    public void s(m0u0 m0u0Var, int i) {
        long jB = ((yqg) this.d).b();
        Iterator it = h(m0u0Var).iterator();
        while (it.hasNext()) {
            ((Handler) this.c).post(new rzt0((c0u0) it.next(), i, jB, (byte) 0));
        }
    }

    public void t(m0u0 m0u0Var) {
        long jB = ((yqg) this.d).b();
        Iterator it = h(m0u0Var).iterator();
        while (it.hasNext()) {
            ((Handler) this.c).post(new qzt0((c0u0) it.next(), jB, (byte) 1));
        }
    }

    public void u(m0u0 m0u0Var, int i) {
        long jB = ((yqg) this.d).b();
        Iterator it = h(m0u0Var).iterator();
        while (it.hasNext()) {
            ((Handler) this.c).post(new rzt0((c0u0) it.next(), i, jB, (byte) 1));
        }
    }

    public void v(m0u0 m0u0Var, long j) {
        long jB = ((yqg) this.d).b();
        Iterator it = h(m0u0Var).iterator();
        while (it.hasNext()) {
            ((Handler) this.c).post(new pzt0((c0u0) it.next(), j, jB, (byte) 3));
        }
    }

    public void w(m0u0 m0u0Var, m0u0 m0u0Var2) {
        long jB = ((yqg) this.d).b();
        Iterator it = h(m0u0Var).iterator();
        while (it.hasNext()) {
            ((Handler) this.c).post(new jyh0((c0u0) it.next(), m0u0Var2, jB));
        }
    }

    public void x(m0u0 m0u0Var, BetamaxException betamaxException, long j) {
        long jB = ((yqg) this.d).b();
        Iterator it = h(m0u0Var).iterator();
        while (it.hasNext()) {
            ((Handler) this.c).post(new szt0((c0u0) it.next(), betamaxException, j, jB, (byte) 0));
        }
    }

    public void y(m0u0 m0u0Var, p590 p590Var) {
        long jB = ((yqg) this.d).b();
        for (c0u0 c0u0Var : h(m0u0Var)) {
            if (c0u0Var instanceof n590) {
                ((Handler) this.c).post(new aih0((n590) c0u0Var, p590Var, jB));
            }
        }
    }

    public void z(m0u0 m0u0Var, List list, List list2, List list3, List list4, int i, Long l, Long l2) {
        long jB = ((yqg) this.d).b();
        Iterator it = h(m0u0Var).iterator();
        while (it.hasNext()) {
            ((Handler) this.c).post(new tzt0((c0u0) it.next(), list, list2, list3, list4, i, l, l2, jB));
        }
    }

    public lgy(Flowable flowable, xrc0 xrc0Var, iz00 iz00Var, ywc0 ywc0Var, i4q i4qVar, yhm yhmVar, boolean z, e8r0 e8r0Var, Scheduler scheduler) {
        this.b = flowable;
        this.c = xrc0Var;
        this.d = iz00Var;
        this.e = ywc0Var;
        this.f = i4qVar;
        this.g = yhmVar;
        this.a = z;
        this.h = e8r0Var;
        this.i = scheduler;
    }

    public lgy(zle1 zle1Var, woa woaVar, kma kmaVar, fpa fpaVar, pe peVar, boolean z, gw70 gw70Var, lzn0 lzn0Var, luk lukVar) {
        this.b = zle1Var;
        this.c = woaVar;
        this.d = kmaVar;
        this.e = fpaVar;
        this.f = peVar;
        this.a = z;
        this.g = gw70Var;
        this.h = lzn0Var;
        this.i = lukVar;
    }

    public lgy() {
        this.c = "";
    }
}
