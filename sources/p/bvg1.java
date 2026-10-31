package p;

import com.spotify.cosmos.cosmos.Request;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bvg1 {
    public static final String[] l;
    public final en31 a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final boolean d;
    public final v6a e;
    public final String[] g;
    public final pjp0 h;
    public final mre0 i;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public Function0 k = new mf41((byte) 11);
    public final LinkedHashMap f = new LinkedHashMap();

    static {
        new nfb((byte) 28, false);
        l = new String[]{"INSERT", "UPDATE", Request.DELETE};
    }

    public bvg1(en31 en31Var, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z, v6a v6aVar) {
        this.a = en31Var;
        this.b = linkedHashMap;
        this.c = linkedHashMap2;
        this.d = z;
        this.e = v6aVar;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase = str.toLowerCase(locale);
            this.f.put(lowerCase, Integer.valueOf(i));
            String str2 = (String) this.b.get(strArr[i]);
            String lowerCase2 = str2 != null ? str2.toLowerCase(locale) : null;
            if (lowerCase2 != null) {
                lowerCase = lowerCase2;
            }
            strArr2[i] = lowerCase;
        }
        this.g = strArr2;
        for (Map.Entry entry : this.b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            if (this.f.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                LinkedHashMap linkedHashMap3 = this.f;
                linkedHashMap3.put(lowerCase4, sqg0.G(lowerCase3, linkedHashMap3));
            }
        }
        this.h = new pjp0(this.g.length);
        this.i = new mre0(this.g.length);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(bdv0 bdv0Var, onm onmVar) {
        uug1 uug1Var;
        if (onmVar instanceof uug1) {
            uug1Var = (uug1) onmVar;
            int i = uug1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                uug1Var.d = i - Integer.MIN_VALUE;
            } else {
                uug1Var = new uug1(this, onmVar);
            }
        } else {
            uug1Var = new uug1(this, onmVar);
        }
        Object objC = uug1Var.b;
        int i2 = uug1Var.d;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objC);
            iu30 p5e1Var = new p5e1((byte) 20);
            uug1Var.a = bdv0Var;
            uug1Var.d = 1;
            objC = bdv0Var.c("SELECT * FROM room_table_modification_log WHERE invalidated = 1", p5e1Var, uug1Var);
            if (objC != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Set set = (Set) uug1Var.a;
            hm5.M(objC);
            return set;
        }
        bdv0Var = (bdv0) uug1Var.a;
        hm5.M(objC);
        Set set2 = (Set) objC;
        if (!set2.isEmpty()) {
            uug1Var.a = set2;
            uug1Var.d = 2;
            if (anm1.x(bdv0Var, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", uug1Var) == d9nVar) {
                return d9nVar;
            }
        }
        return set2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) throws Throwable {
        wug1 wug1Var;
        cce cceVar;
        if (onmVar instanceof wug1) {
            wug1Var = (wug1) onmVar;
            int i = wug1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wug1Var.d = i - Integer.MIN_VALUE;
            } else {
                wug1Var = new wug1(this, onmVar);
            }
        } else {
            wug1Var = new wug1(this, onmVar);
        }
        Object objT = wug1Var.b;
        int i2 = wug1Var.d;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(objT);
            en31 en31Var = this.a;
            cce cceVar2 = en31Var.g;
            boolean zI = cceVar2.i();
            w7x w7xVar = w7x.a;
            if (!zI) {
                return w7xVar;
            }
            try {
                if (!this.j.compareAndSet(true, false)) {
                    cceVar2.G();
                    return w7xVar;
                }
                if (!((Boolean) this.k.invoke()).booleanValue()) {
                    cceVar2.G();
                    return w7xVar;
                }
                blr blrVar = new blr(this, lnmVar, (byte) 2);
                wug1Var.a = cceVar2;
                wug1Var.d = 1;
                objT = en31Var.t(false, blrVar, wug1Var);
                d9n d9nVar = d9n.a;
                if (objT == d9nVar) {
                    return d9nVar;
                }
                cceVar = cceVar2;
            } catch (Throwable th) {
                th = th;
                cceVar = cceVar2;
                cceVar.G();
                throw th;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cceVar = wug1Var.a;
            try {
                hm5.M(objT);
            } catch (Throwable th2) {
                th = th2;
                cceVar.G();
                throw th;
            }
        }
        Set set = (Set) objT;
        if (!set.isEmpty()) {
            this.i.e(set);
            this.e.invoke(set);
        }
        cceVar.G();
        return set;
    }

    public final void c(Function0 function0, Function0 function1) {
        if (this.j.compareAndSet(false, true)) {
            function0.invoke();
            llm llmVar = this.a.a;
            if (llmVar != null) {
                c921.y(llmVar, new z8n("Room Invalidation Tracker Refresh"), 0, new k6g1(this, function1, (lnm) null, (byte) 9), 2);
            } else {
                u890.C("coroutineScope");
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0089  */
    /* JADX WARN: Code duplicated, block: B:23:0x008f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0092  */
    /* JADX WARN: Code duplicated, block: B:29:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0075, code lost:
    
        if (p.anm1.x(r1, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c3, code lost:
    
        if (p.anm1.x(r11, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c5, code lost:
    
        return r8;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00c3 -> B:28:0x00c6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(p.v7g1 r18, int r19, p.onm r20) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.bvg1.d(p.v7g1, int, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:18:0x006e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006c -> B:19:0x006f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(p.v7g1 r8, int r9, p.onm r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof p.yug1
            if (r0 == 0) goto L13
            r0 = r10
            p.yug1 r0 = (p.yug1) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            p.yug1 r0 = new p.yug1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f
            int r1 = r0.h
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L31
            int r7 = r0.e
            int r8 = r0.d
            java.lang.String[] r9 = r0.c
            java.lang.String r1 = r0.b
            p.bdv0 r3 = r0.a
            p.hm5.M(r10)
            r10 = r9
            r9 = r3
            goto L6f
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            r7 = 0
            return r7
        L38:
            p.hm5.M(r10)
            java.lang.String[] r7 = r7.g
            r7 = r7[r9]
            java.lang.String[] r9 = p.bvg1.l
            r10 = 0
            r1 = 3
            r6 = r1
            r1 = r7
            r7 = r6
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L4a:
            if (r8 >= r7) goto L71
            r3 = r10[r8]
            java.lang.String r3 = p.nfb.d(r1, r3)
            java.lang.String r4 = "DROP TRIGGER IF EXISTS `"
            r5 = 96
            java.lang.String r3 = p.cy30.n(r4, r3, r5)
            r0.a = r9
            r0.b = r1
            r0.c = r10
            r0.d = r8
            r0.e = r7
            r0.h = r2
            java.lang.Object r3 = p.anm1.x(r9, r3, r0)
            p.d9n r4 = p.d9n.a
            if (r3 != r4) goto L6f
            return r4
        L6f:
            int r8 = r8 + r2
            goto L4a
        L71:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.bvg1.e(p.v7g1, int, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(onm onmVar) throws Throwable {
        zug1 zug1Var;
        cce cceVar;
        if (onmVar instanceof zug1) {
            zug1Var = (zug1) onmVar;
            int i = zug1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                zug1Var.d = i - Integer.MIN_VALUE;
            } else {
                zug1Var = new zug1(this, onmVar);
            }
        } else {
            zug1Var = new zug1(this, onmVar);
        }
        Object obj = zug1Var.b;
        int i2 = zug1Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            en31 en31Var = this.a;
            cce cceVar2 = en31Var.g;
            if (cceVar2.i()) {
                try {
                    q721 q721Var = new q721(this, (lnm) null, (byte) 27);
                    zug1Var.a = cceVar2;
                    zug1Var.d = 1;
                    Object objT = en31Var.t(false, q721Var, zug1Var);
                    d9n d9nVar = d9n.a;
                    if (objT == d9nVar) {
                        return d9nVar;
                    }
                    cceVar = cceVar2;
                    cceVar.G();
                } catch (Throwable th) {
                    th = th;
                    cceVar = cceVar2;
                    cceVar.G();
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cceVar = zug1Var.a;
            try {
                hm5.M(obj);
                cceVar.G();
            } catch (Throwable th2) {
                th = th2;
                cceVar.G();
                throw th;
            }
        }
        return rih1.a;
    }

    public final mmr0 g(String[] strArr) {
        xj61 xj61Var = new xj61();
        for (String str : strArr) {
            Set set = (Set) this.c.get(str.toLowerCase(Locale.ROOT));
            if (set != null) {
                xj61Var.addAll(set);
            } else {
                xj61Var.add(str);
            }
        }
        String[] strArr2 = (String[]) cwl1.j(xj61Var).toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr2[i];
            Integer num = (Integer) this.f.get(str2.toLowerCase(Locale.ROOT));
            if (num == null) {
                hhg1.n("There is no table with name ".concat(str2));
                return null;
            }
            iArr[i] = num.intValue();
        }
        return oqn1.n(strArr2, iArr);
    }
}
