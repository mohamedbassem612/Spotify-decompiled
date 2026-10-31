package p;

import android.content.Context;
import com.spotify.home.evopage.mobius.Effect;
import com.spotify.home.evopage.mobius.Event;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y2e0 {
    public final np60 a;
    public final cd91 b;
    public final kba c;
    public final hs00 d;
    public final dw01 e;
    public final lmo f;
    public final gqr g;
    public final xvo h;
    public final yxd1 i;
    public final Context j;
    public final tp60 k;
    public final rk00 l;

    public y2e0(np60 np60Var, cd91 cd91Var, kba kbaVar, hs00 hs00Var, dw01 dw01Var, lmo lmoVar, gqr gqrVar, xvo xvoVar, yxd1 yxd1Var, Context context, tp60 tp60Var, rk00 rk00Var) {
        this.a = np60Var;
        this.b = cd91Var;
        this.c = kbaVar;
        this.d = hs00Var;
        this.e = dw01Var;
        this.f = lmoVar;
        this.g = gqrVar;
        this.h = xvoVar;
        this.i = yxd1Var;
        this.j = context;
        this.k = tp60Var;
        this.l = rk00Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(cp60 cp60Var, onm onmVar) {
        m2e0 m2e0Var;
        if (onmVar instanceof m2e0) {
            m2e0Var = (m2e0) onmVar;
            int i = m2e0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                m2e0Var.d = i - Integer.MIN_VALUE;
            } else {
                m2e0Var = new m2e0(this, onmVar);
            }
        } else {
            m2e0Var = new m2e0(this, onmVar);
        }
        Object objC = m2e0Var.b;
        int i2 = m2e0Var.d;
        if (i2 == 0) {
            hm5.M(objC);
            boolean z = cp60Var.a;
            String str = cp60Var.c.g;
            m2e0Var.a = cp60Var;
            m2e0Var.d = 1;
            objC = c(str, m2e0Var, z);
            Object obj = d9n.a;
            if (objC == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cp60Var = m2e0Var.a;
            hm5.M(objC);
        }
        mmr0 mmr0Var = (mmr0) objC;
        String str2 = (String) mmr0Var.a;
        List list = (List) mmr0Var.b;
        l2e l2eVar = cp60Var.c;
        return new cp60(cp60Var.a, cp60Var.b, new l2e(o7h.N0(list, l2eVar.a), l2eVar.b, l2eVar.c, l2eVar.d, l2eVar.e, l2eVar.f, str2, l2eVar.h), cp60Var.d);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object b(Effect.LoadHomeStructure loadHomeStructure, onm onmVar) {
        t2e0 t2e0Var;
        Object m231Var;
        ice0 loadingStrategy;
        Throwable th;
        if (onmVar instanceof t2e0) {
            t2e0Var = (t2e0) onmVar;
            int i = t2e0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                t2e0Var.f = i - Integer.MIN_VALUE;
            } else {
                t2e0Var = new t2e0(this, onmVar);
            }
        } else {
            t2e0Var = new t2e0(this, onmVar);
        }
        t2e0 t2e0Var2 = t2e0Var;
        Object objL = t2e0Var2.d;
        int i2 = t2e0Var2.f;
        d9n d9nVar = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(objL);
                w2e0 w2e0Var = new w2e0(loadHomeStructure, null, this);
                t2e0Var2.a = loadHomeStructure;
                t2e0Var2.b = null;
                t2e0Var2.f = 1;
                objL = smo1.s(w2e0Var, t2e0Var2);
                if (objL == d9nVar) {
                }
                return d9nVar;
            }
            if (i2 == 1) {
                loadHomeStructure = t2e0Var2.a;
                hm5.M(objL);
            } else {
                if (i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                loadingStrategy = t2e0Var2.c;
                th = t2e0Var2.b;
                hm5.M(objL);
            }
            return new Event.FailedToLoadHomeStructure(th, loadingStrategy, this.f.a, ((Boolean) objL).booleanValue());
            m231Var = (cp60) objL;
        } catch (Throwable th2) {
            m231Var = new m231(th2);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            loadingStrategy = loadHomeStructure.getLoadingStrategy();
            Observable observable = this.g.a;
            t2e0Var2.a = null;
            t2e0Var2.b = thA;
            t2e0Var2.c = loadingStrategy;
            t2e0Var2.f = 2;
            objL = fc11.l(observable, 1, null, t2e0Var2);
            if (objL != d9nVar) {
                th = thA;
                return new Event.FailedToLoadHomeStructure(th, loadingStrategy, this.f.a, ((Boolean) objL).booleanValue());
            }
            return d9nVar;
        }
        cp60 cp60Var = (cp60) m231Var;
        boolean z = cp60Var.a;
        boolean z2 = cp60Var.b;
        l2e l2eVar = cp60Var.c;
        Set setB = this.d.b();
        ConcurrentHashMap concurrentHashMap = this.e.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (((bw01) entry.getValue()).a.isEmpty()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return m2e.a(l2eVar, setB, o7h.p1(arrayList), z, z2, (Set) this.i.a.getValue(), loadHomeStructure.getLoadingStrategy(), this.j);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0085  */
    /* JADX WARN: Code duplicated, block: B:40:0x008a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0097  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:51:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x006c -> B:28:0x006e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.io.Serializable c(java.lang.String r12, p.onm r13, boolean r14) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof p.x2e0
            if (r0 == 0) goto L14
            r0 = r13
            p.x2e0 r0 = (p.x2e0) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f = r1
        L12:
            r13 = r0
            goto L1a
        L14:
            p.x2e0 r0 = new p.x2e0
            r0.<init>(r11, r13)
            goto L12
        L1a:
            java.lang.Object r0 = r13.d
            int r1 = r13.f
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L39
            if (r1 != r4) goto L33
            boolean r12 = r13.a
            p.p811 r14 = r13.c
            java.util.List r1 = r13.b
            java.util.List r1 = (java.util.List) r1
            p.hm5.M(r0)     // Catch: java.lang.Throwable -> L31
            goto L6e
        L31:
            r0 = move-exception
            goto L7a
        L33:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r11)
            return r2
        L39:
            java.util.ArrayList r0 = p.hrt.j(r0)
            p.p811 r1 = new p.p811
            r1.<init>()
            r1.a = r12
            r10 = r13
            r7 = r14
            r14 = r1
            r12 = r3
            r1 = r0
        L49:
            if (r12 != 0) goto La4
            p.np60 r5 = r11.a     // Catch: java.lang.Throwable -> L73
            p.lmo r12 = r11.f     // Catch: java.lang.Throwable -> L73
            java.lang.String r6 = r12.a     // Catch: java.lang.Throwable -> L73
            java.lang.Object r12 = r14.a     // Catch: java.lang.Throwable -> L73
            r8 = r12
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L73
            p.ice0 r9 = p.ice0.a     // Catch: java.lang.Throwable -> L73
            r12 = r1
            java.util.List r12 = (java.util.List) r12     // Catch: java.lang.Throwable -> L77
            r10.b = r12     // Catch: java.lang.Throwable -> L77
            r10.c = r14     // Catch: java.lang.Throwable -> L73
            r10.a = r7     // Catch: java.lang.Throwable -> L73
            r10.f = r4     // Catch: java.lang.Throwable -> L73
            java.lang.Object r0 = r5.a(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L73
            p.d9n r12 = p.d9n.a
            if (r0 != r12) goto L6c
            return r12
        L6c:
            r12 = r7
            r13 = r10
        L6e:
            p.l2e r0 = (p.l2e) r0     // Catch: java.lang.Throwable -> L31
        L70:
            r7 = r12
            r10 = r13
            goto L81
        L73:
            r0 = move-exception
        L74:
            r12 = r7
            r13 = r10
            goto L7a
        L77:
            r0 = move-exception
            r12 = r0
            goto L74
        L7a:
            p.m231 r5 = new p.m231
            r5.<init>(r0)
            r0 = r5
            goto L70
        L81:
            boolean r12 = r0 instanceof p.m231
            if (r12 == 0) goto L86
            r0 = r2
        L86:
            p.l2e r0 = (p.l2e) r0
            if (r0 == 0) goto L95
            java.util.List r12 = r0.a
            java.util.Collection r12 = (java.util.Collection) r12
            r1.addAll(r12)
            java.lang.String r12 = r0.g
            r14.a = r12
        L95:
            if (r0 == 0) goto La2
            java.lang.String r12 = r0.g
            int r12 = r12.length()
            if (r12 != 0) goto La0
            goto La2
        La0:
            r12 = r3
            goto L49
        La2:
            r12 = r4
            goto L49
        La4:
            java.lang.Object r11 = r14.a
            p.mmr0 r11 = p.oqn1.n(r11, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p.y2e0.c(java.lang.String, p.onm, boolean):java.io.Serializable");
    }
}
