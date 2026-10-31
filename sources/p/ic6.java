package p;

import com.spotify.common.uri.SpotifyUriParserException;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ic6 extends x7e0 {
    public final kc6 d;
    public final uu00 e;
    public final q8n f;
    public llm g;
    public final bpb1 h;
    public final bpb1 i;
    public final mko t;

    public ic6(kc6 kc6Var, uu00 uu00Var, lko lkoVar, q8n q8nVar) {
        this.d = kc6Var;
        this.e = uu00Var;
        this.f = q8nVar;
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.h = bpb1VarB;
        this.i = bpb1VarB;
        this.t = lko.a(lkoVar, new huz(w7x.a, (byte) 10), kc6Var.b);
    }

    public static an7 n(String str, String str2) {
        Optional optionalEmpty;
        v6b1 v6b1Var;
        try {
            optionalEmpty = Optional.of(new y6b1(str, true));
        } catch (SpotifyUriParserException unused) {
            optionalEmpty = Optional.empty();
        }
        y6b1 y6b1Var = (y6b1) optionalEmpty.orElse(null);
        if (y6b1Var == null || (v6b1Var = y6b1Var.c) == null) {
            v6b1Var = v6b1.E1;
        }
        int iOrdinal = v6b1Var.ordinal();
        if (iOrdinal == 2) {
            return new an7(nkx.c, str2, true);
        }
        if (iOrdinal == 6) {
            return new an7(akx.c, str2, false);
        }
        if (iOrdinal == 210) {
            return new an7(qkx.c, str2, true);
        }
        if (iOrdinal == 12 || iOrdinal == 13) {
            return new an7(grx.c, str2, false);
        }
        return (iOrdinal == 63 || iOrdinal == 64) ? new an7(mrx.c, str2, false) : new an7(box.c, str2, false);
    }

    public final void e() {
        if (d()) {
            return;
        }
        llm llmVar = this.g;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        llm llmVarE = smo1.e(this.f);
        this.g = llmVarE;
        this.t.start();
        j();
        fn31.T(llmVarE, (o8n) null, 0, new uqo1(this, (lnm) null, (byte) 1), 3);
    }

    public final void f() {
        this.t.stop();
        llm llmVar = this.g;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        this.g = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable k(List list, onm onmVar) {
        bc6 bc6Var;
        LinkedHashMap m231Var;
        if (onmVar instanceof bc6) {
            bc6Var = (bc6) onmVar;
            int i = bc6Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bc6Var.d = i - Integer.MIN_VALUE;
            } else {
                bc6Var = new bc6(this, onmVar);
            }
        } else {
            bc6Var = new bc6(this, onmVar);
        }
        Object objQ = bc6Var.b;
        int i2 = bc6Var.d;
        b7x b7xVar = b7x.a;
        try {
            if (i2 == 0) {
                hm5.M(objQ);
                if (list.isEmpty()) {
                    return b7xVar;
                }
                iu30 s6Var = new s6(list, (byte) 6);
                bc6Var.a = list;
                bc6Var.d = 1;
                objQ = q(s6Var, bc6Var);
                d9n d9nVar = d9n.a;
                if (objQ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = bc6Var.a;
                hm5.M(objQ);
            }
            uv00 uv00Var = (uv00) objQ;
            List list2 = list;
            int iS = zno1.s(q7h.U(list2, 10));
            if (iS < 16) {
                iS = 16;
            }
            m231Var = new LinkedHashMap(iS);
            for (Object obj : list2) {
                m231Var.put(obj, uv00Var.a(jo70.class, (String) obj).b);
            }
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        return m231Var instanceof m231 ? b7xVar : m231Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable l(List list, onm onmVar) {
        cc6 cc6Var;
        LinkedHashMap m231Var;
        mq70 mq70Var;
        up70 up70VarA;
        if (onmVar instanceof cc6) {
            cc6Var = (cc6) onmVar;
            int i = cc6Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cc6Var.d = i - Integer.MIN_VALUE;
            } else {
                cc6Var = new cc6(this, onmVar);
            }
        } else {
            cc6Var = new cc6(this, onmVar);
        }
        Object objQ = cc6Var.b;
        int i2 = cc6Var.d;
        b7x b7xVar = b7x.a;
        try {
            if (i2 == 0) {
                hm5.M(objQ);
                if (list.isEmpty()) {
                    return b7xVar;
                }
                iu30 s6Var = new s6(list, (byte) 7);
                cc6Var.a = list;
                cc6Var.d = 1;
                objQ = q(s6Var, cc6Var);
                d9n d9nVar = d9n.a;
                if (objQ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = cc6Var.a;
                hm5.M(objQ);
            }
            uv00 uv00Var = (uv00) objQ;
            List list2 = list;
            int iS = zno1.s(q7h.U(list2, 10));
            if (iS < 16) {
                iS = 16;
            }
            m231Var = new LinkedHashMap(iS);
            for (Object obj : list2) {
                xkk1 xkk1Var = uv00Var.a(xkk1.class, (String) obj).b;
                m231Var.put(obj, (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.c)) == null) ? null : up70VarA.a.a);
            }
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        return m231Var instanceof m231 ? b7xVar : m231Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object m(jo70 jo70Var, boolean z, onm onmVar) {
        dc6 dc6Var;
        io70 io70Var;
        Optional optionalEmpty;
        v6b1 v6b1Var;
        Optional optionalEmpty2;
        v6b1 v6b1Var2;
        jo70 jo70Var2 = jo70Var;
        if (onmVar instanceof dc6) {
            dc6Var = (dc6) onmVar;
            int i = dc6Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                dc6Var.e = i - Integer.MIN_VALUE;
            } else {
                dc6Var = new dc6(this, onmVar);
            }
        } else {
            dc6Var = new dc6(this, onmVar);
        }
        Object obj = dc6Var.c;
        int i2 = dc6Var.e;
        byte b = 1;
        lnm zm7Var = null;
        if (i2 == 0) {
            hm5.M(obj);
            io70 io70Var2 = jo70Var2.e;
            if (io70Var2 == null) {
                io70Var2 = null;
            } else if (z) {
                if (io70Var2.a.length() > 0) {
                    Set set = s4b1.f;
                    if (uic.x(io70Var2.b).c != blc0.fh) {
                        io70Var2 = null;
                    }
                } else {
                    io70Var2 = null;
                }
            }
            smc0 smc0VarN = k4p1.n();
            List list = jo70Var2.d;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ho70) it.next()).b);
            }
            smc0VarN.addAll(arrayList);
            if (io70Var2 != null) {
                smc0VarN.add(io70Var2.b);
            }
            og5 og5Var = new og5(this, k4p1.k(smc0VarN), zm7Var, b);
            dc6Var.a = jo70Var2;
            dc6Var.b = io70Var2;
            dc6Var.e = 1;
            Object objS = smo1.s(og5Var, dc6Var);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
            io70 io70Var3 = io70Var2;
            obj = objS;
            io70Var = io70Var3;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            io70Var = dc6Var.b;
            jo70Var2 = dc6Var.a;
            hm5.M(obj);
        }
        mmr0 mmr0Var = (mmr0) obj;
        Map map = (Map) mmr0Var.a;
        Map map2 = (Map) mmr0Var.b;
        List<ho70> list2 = jo70Var2.d;
        ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
        for (ho70 ho70Var : list2) {
            String str = ho70Var.b;
            String str2 = ho70Var.a;
            jo70 jo70Var3 = (jo70) map.get(str);
            String str3 = jo70Var3 != null ? jo70Var3.b : null;
            String str4 = str3 == null ? "" : str3;
            an7 an7VarN = n(str, (String) map2.get(str));
            try {
                optionalEmpty2 = Optional.of(new y6b1(str, true));
            } catch (SpotifyUriParserException unused) {
                optionalEmpty2 = Optional.empty();
            }
            y6b1 y6b1Var = (y6b1) optionalEmpty2.orElse(null);
            if (y6b1Var == null || (v6b1Var2 = y6b1Var.c) == null) {
                v6b1Var2 = v6b1.E1;
            }
            int iOrdinal = v6b1Var2.ordinal();
            arrayList2.add(new zm7(str, str2, str4, an7VarN, (iOrdinal == 2 || iOrdinal == 210) ? 1 : 2));
        }
        if (io70Var != null) {
            String str5 = io70Var.b;
            String str6 = io70Var.a;
            jo70 jo70Var4 = (jo70) map.get(str5);
            String str7 = jo70Var4 != null ? jo70Var4.b : null;
            String str8 = str7 == null ? "" : str7;
            an7 an7VarN2 = n(str5, (String) map2.get(str5));
            try {
                optionalEmpty = Optional.of(new y6b1(str5, true));
            } catch (SpotifyUriParserException unused2) {
                optionalEmpty = Optional.empty();
            }
            y6b1 y6b1Var2 = (y6b1) optionalEmpty.orElse(null);
            if (y6b1Var2 == null || (v6b1Var = y6b1Var2.c) == null) {
                v6b1Var = v6b1.E1;
            }
            int iOrdinal2 = v6b1Var.ordinal();
            zm7Var = new zm7(str5, str6, str8, an7VarN2, (iOrdinal2 == 2 || iOrdinal2 == 210) ? 1 : 2);
        }
        return new ac6(o7h.N0(p7h.N(zm7Var), arrayList2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r9 == r5) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(java.lang.String r7, java.lang.String r8, p.onm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.fc6
            if (r0 == 0) goto L13
            r0 = r9
            p.fc6 r0 = (p.fc6) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.fc6 r0 = new p.fc6
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r9)
            goto L5f
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            java.lang.String r7 = r0.a
            p.hm5.M(r9)     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> L62
            goto L4b
        L37:
            p.hm5.M(r9)
            p.os r9 = new p.os     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> L62
            r1 = 3
            r9.<init>(r7, r8, r1)     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> L62
            r0.a = r7     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> L62
            r0.d = r3     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> L62
            java.lang.Object r9 = r6.q(r9, r0)     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> L62
            if (r9 != r5) goto L4b
            goto L5e
        L4b:
            p.uv00 r9 = (p.uv00) r9     // Catch: java.lang.Exception -> L4e java.util.concurrent.CancellationException -> L62
            return r9
        L4e:
            p.wk3 r8 = new p.wk3
            r9 = 6
            r8.<init>(r7, r9)
            r0.a = r4
            r0.d = r2
            java.lang.Object r9 = r6.q(r8, r0)
            if (r9 != r5) goto L5f
        L5e:
            return r5
        L5f:
            p.uv00 r9 = (p.uv00) r9
            return r9
        L62:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ic6.o(java.lang.String, java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bb, code lost:
    
        if (r13 == r7) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(java.lang.String r12, p.onm r13) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ic6.p(java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(iu30 iu30Var, onm onmVar) {
        hc6 hc6Var;
        if (onmVar instanceof hc6) {
            hc6Var = (hc6) onmVar;
            int i = hc6Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hc6Var.c = i - Integer.MIN_VALUE;
            } else {
                hc6Var = new hc6(this, onmVar);
            }
        } else {
            hc6Var = new hc6(this, onmVar);
        }
        Object objJ = hc6Var.a;
        int i2 = hc6Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            Single singleFirstOrError = this.e.b(new oi("artist-attribution-sheet", false, iu30Var)).filter(bbn.g).firstOrError();
            hc6Var.c = 1;
            objJ = fc11.j(singleFirstOrError, hc6Var);
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
        return objJ;
    }
}
