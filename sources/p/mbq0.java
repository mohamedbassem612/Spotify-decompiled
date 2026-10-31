package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import spotify.your_library.esperanto.proto.YourLibraryRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;
import spotify.your_library.esperanto.proto.YourLibraryResponse;
import spotify.your_library.proto.YourLibraryConfig;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mbq0 extends x7e0 {
    public static final trc0 X;
    public static final YourLibraryRequest t;
    public final vwm1 d;
    public final xrc0 e;
    public final q8n f;
    public final bpb1 g;
    public final any h;
    public llm i;

    static {
        gvm1 gvm1VarO = YourLibraryRequest.o();
        hvm1 hvm1VarQ = YourLibraryRequestHeader.q();
        qsm1 qsm1VarN = YourLibraryConfig.YourLibrarySortOrder.n();
        qsm1VarN.n(rsm1.g);
        hvm1VarQ.I(qsm1VarN.build());
        hvm1VarQ.C(30);
        jsm1 jsm1VarR = YourLibraryConfig.YourLibraryFilters.r();
        jsm1VarR.q(ksm1.d);
        jsm1VarR.q(ksm1.b);
        hvm1VarQ.u(jsm1VarR.build());
        gvm1VarO.q(hvm1VarQ.build());
        t = gvm1VarO.build();
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.j0();
        hru0VarS.x(sku0VarP);
        X = new trc0(hru0VarS.build(), (g3d0) null, (Set) null, false, (src0) null, jqz0.a, (prc0) null, 0, (List) null, 478);
    }

    public mbq0(vwm1 vwm1Var, xrc0 xrc0Var, npm1 npm1Var, q8n q8nVar) {
        this.d = vwm1Var;
        this.e = xrc0Var;
        this.f = q8nVar;
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.g = bpb1VarB;
        this.h = new any(bpb1VarB, (byte) 18);
    }

    public final void e() {
        if (this.g.getValue() != null) {
            i();
            return;
        }
        j();
        llm llmVarK = i3a.k(this.f);
        this.i = llmVarK;
        fn31.T(llmVarK, (o8n) null, 0, new i2p0(this, (lnm) null, (byte) 5), 3);
    }

    public final void f() {
        llm llmVar = this.i;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        this.i = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        if (r7 == r5) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(p.onm r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p.jbq0
            if (r0 == 0) goto L13
            r0 = r7
            p.jbq0 r0 = (p.jbq0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.jbq0 r0 = new p.jbq0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            p.hm5.M(r7)     // Catch: java.lang.Exception -> L2b
            goto L5e
        L2b:
            r7 = move-exception
            goto L69
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r2
        L33:
            p.hm5.M(r7)     // Catch: java.lang.Exception -> L2b
            goto L43
        L37:
            p.hm5.M(r7)
            r0.c = r4     // Catch: java.lang.Exception -> L2b
            java.lang.Object r7 = r6.l(r0)     // Catch: java.lang.Exception -> L2b
            if (r7 != r5) goto L43
            goto L5d
        L43:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Exception -> L2b
            boolean r1 = r7.isEmpty()     // Catch: java.lang.Exception -> L2b
            if (r1 == 0) goto L4e
            p.z6x r7 = p.z6x.a     // Catch: java.lang.Exception -> L2b
            goto L60
        L4e:
            r0.c = r3     // Catch: java.lang.Exception -> L2b
            p.wkk0 r1 = new p.wkk0     // Catch: java.lang.Exception -> L2b
            r3 = 25
            r1.<init>(r7, r6, r2, r3)     // Catch: java.lang.Exception -> L2b
            java.lang.Object r7 = p.smo1.s(r1, r0)     // Catch: java.lang.Exception -> L2b
            if (r7 != r5) goto L5e
        L5d:
            return r5
        L5e:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Exception -> L2b
        L60:
            p.bpb1 r0 = r6.g     // Catch: java.lang.Exception -> L2b
            r0.l(r7)     // Catch: java.lang.Exception -> L2b
            r6.i()     // Catch: java.lang.Exception -> L2b
            goto L6c
        L69:
            r6.h(r7)
        L6c:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.mbq0.k(p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(onm onmVar) {
        kbq0 kbq0Var;
        if (onmVar instanceof kbq0) {
            kbq0Var = (kbq0) onmVar;
            int i = kbq0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kbq0Var.c = i - Integer.MIN_VALUE;
            } else {
                kbq0Var = new kbq0(this, onmVar);
            }
        } else {
            kbq0Var = new kbq0(this, onmVar);
        }
        Object objA = kbq0Var.a;
        int i2 = kbq0Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            kbq0Var.c = 1;
            objA = this.d.a(t, kbq0Var);
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
        h290 h290VarN = ((YourLibraryResponse) objA).n();
        ArrayList arrayList = new ArrayList();
        for (Object obj : h290VarN) {
            int iOrdinal = ((YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity) obj).s().ordinal();
            if ((iOrdinal != 0 ? iOrdinal != 2 ? null : ezy.a : ezy.b) != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!((YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity) obj2).e().getUri().equals("spotify:playlist:37i9dQZF1EYkqdzj48dyYq")) {
                arrayList2.add(obj2);
            }
        }
        return o7h.d1(arrayList2, 30);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:26:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:31:0x007f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0097 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object m(YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity yourLibraryDecoratedEntity, onm onmVar) {
        lbq0 lbq0Var;
        ezy ezyVar;
        ezy ezyVar2;
        int iOrdinal;
        Object objF;
        d9n d9nVar;
        YourLibraryDecoratedEntityOuterClass.YourLibraryEntityInfo yourLibraryEntityInfo;
        ezy ezyVar3;
        if (onmVar instanceof lbq0) {
            lbq0Var = (lbq0) onmVar;
            int i = lbq0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                lbq0Var.e = i - Integer.MIN_VALUE;
            } else {
                lbq0Var = new lbq0(this, onmVar);
            }
        } else {
            lbq0Var = new lbq0(this, onmVar);
        }
        Object obj = lbq0Var.c;
        int i2 = lbq0Var.e;
        if (i2 == 0) {
            hm5.M(obj);
            YourLibraryDecoratedEntityOuterClass.YourLibraryEntityInfo yourLibraryEntityInfoE = yourLibraryDecoratedEntity.e();
            int iOrdinal2 = yourLibraryDecoratedEntity.s().ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 != 2) {
                    ezyVar2 = null;
                } else {
                    ezyVar = ezy.a;
                }
                if (ezyVar2 != null) {
                    iOrdinal = ezyVar2.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            return new fdq0(yourLibraryEntityInfoE.getUri(), yourLibraryEntityInfoE.getName(), ezyVar2, yourLibraryEntityInfoE.q(), 0, yourLibraryDecoratedEntity.n().n(), 16);
                        }
                        eg.o();
                        return null;
                    }
                    String uri = yourLibraryEntityInfoE.getUri();
                    lbq0Var.a = yourLibraryEntityInfoE;
                    lbq0Var.b = ezyVar2;
                    lbq0Var.e = 1;
                    objF = this.e.f(uri, X, lbq0Var);
                    d9nVar = d9n.a;
                    if (objF == d9nVar) {
                        return d9nVar;
                    }
                    yourLibraryEntityInfo = yourLibraryEntityInfoE;
                    ezyVar3 = ezyVar2;
                    obj = objF;
                }
                return null;
            }
            ezyVar = ezy.b;
            ezyVar2 = ezyVar;
            if (ezyVar2 != null) {
                iOrdinal = ezyVar2.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        return new fdq0(yourLibraryEntityInfoE.getUri(), yourLibraryEntityInfoE.getName(), ezyVar2, yourLibraryEntityInfoE.q(), 0, yourLibraryDecoratedEntity.n().n(), 16);
                    }
                    eg.o();
                    return null;
                }
                String uri2 = yourLibraryEntityInfoE.getUri();
                lbq0Var.a = yourLibraryEntityInfoE;
                lbq0Var.b = ezyVar2;
                lbq0Var.e = 1;
                objF = this.e.f(uri2, X, lbq0Var);
                d9nVar = d9n.a;
                if (objF == d9nVar) {
                    return d9nVar;
                }
                yourLibraryEntityInfo = yourLibraryEntityInfoE;
                ezyVar3 = ezyVar2;
                obj = objF;
            }
            return null;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ezy ezyVar4 = lbq0Var.b;
        yourLibraryEntityInfo = lbq0Var.a;
        hm5.M(obj);
        ezyVar3 = ezyVar4;
        wsc0 wsc0Var = (wsc0) ((py21) obj).c();
        int i3 = wsc0Var != null ? wsc0Var.a : 0;
        if (i3 != 0) {
            return new fdq0(yourLibraryEntityInfo.getUri(), yourLibraryEntityInfo.getName(), ezyVar3, yourLibraryEntityInfo.q(), i3, null, 32);
        }
        return null;
    }

    public final m6e0 n() {
        return f4p1.g(this);
    }
}
