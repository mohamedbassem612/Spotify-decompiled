package p;

import com.spotify.automix.proto.PreviewOuterClass;
import com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions;
import com.spotify.player.esperanto.proto.EsContext$Context;
import com.spotify.player.esperanto.proto.EsContextPlayerState;
import com.spotify.player.esperanto.proto.EsGetStateRequest;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import com.spotify.player.esperanto.proto.EsOptional;
import com.spotify.player.esperanto.proto.EsPause$PauseRequest;
import com.spotify.player.esperanto.proto.EsPauseresumeOrigin$PauseResumeOrigin;
import com.spotify.player.esperanto.proto.EsPlay$PlayRequest;
import com.spotify.player.esperanto.proto.EsPreparePlay$PreparePlayRequest;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions$PreparePlayOptions;
import com.spotify.player.esperanto.proto.EsResume$ResumeRequest;
import com.spotify.player.esperanto.proto.EsSignalRequest$SignalRequest;
import com.spotify.player.esperanto.proto.EsSkipNext$SkipNextRequest;
import com.spotify.player.esperanto.proto.EsStop$StopRequest;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ldk0 implements cdk0 {
    public static final AtomicInteger c = new AtomicInteger(0);
    public final yqg a;
    public final jn7 b;

    public ldk0(yqg yqgVar, jn7 jn7Var) {
        this.a = yqgVar;
        this.b = jn7Var;
    }

    public static void b(int i) {
        if (c.get() != i) {
            throw new ddk0("Preview command superseded by a newer play or stop command");
        }
    }

    public final void c() {
        c.incrementAndGet();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0123  */
    /* JADX WARN: Code duplicated, block: B:37:0x0179  */
    /* JADX WARN: Code duplicated, block: B:39:0x017e  */
    /* JADX WARN: Code duplicated, block: B:43:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:46:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object d(lhg1 lhg1Var, String str, String str2, String str3, onm onmVar) {
        fdk0 fdk0Var;
        EsLoggingParams$LoggingParams esLoggingParams$LoggingParams;
        lhg1 lhg1Var2;
        String str4;
        String str5;
        int i;
        EsContextPlayerState.ContextPlayerState contextPlayerState;
        lhg1 lhg1Var3;
        String str6;
        int i2;
        EsContextPlayerState.ContextPlayerState contextPlayerState2;
        String str7;
        viw0 viw0VarN;
        EsContextPlayerState.ContextPlayerState contextPlayerState3;
        Object objU0;
        EsContextPlayerState.ContextPlayerState contextPlayerState4;
        if (onmVar instanceof fdk0) {
            fdk0Var = (fdk0) onmVar;
            int i3 = fdk0Var.i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fdk0Var.i = i3 - Integer.MIN_VALUE;
            } else {
                fdk0Var = new fdk0(this, onmVar);
            }
        } else {
            fdk0Var = new fdk0(this, onmVar);
        }
        Object obj = fdk0Var.g;
        int i4 = fdk0Var.i;
        jn7 jn7Var = this.b;
        Object obj2 = d9n.a;
        if (i4 == 0) {
            hm5.M(obj);
            int iIncrementAndGet = c.incrementAndGet();
            coz cozVarR = EsLoggingParams$LoggingParams.r();
            if (str != null) {
                cozVarR.n(str);
            }
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            cozVarR.q(yon1.G1("PLAYLIST_OVERLAP_EDIT_PAGE", "playlist/overlap-edit-page", 1470, "playlist").c);
            qpz qpzVarP = EsOptional.OptionalInt64.p();
            qpzVarP.n(this.a.b());
            cozVarR.s((EsOptional.OptionalInt64) qpzVarP.build());
            esLoggingParams$LoggingParams = (EsLoggingParams$LoggingParams) cozVarR.build();
            dkm dkmVarE = jn7Var.E(EsGetStateRequest.GetStateRequest.n());
            lhg1Var2 = lhg1Var;
            fdk0Var.a = lhg1Var2;
            str4 = str2;
            fdk0Var.b = str4;
            str5 = str3;
            fdk0Var.c = str5;
            fdk0Var.d = esLoggingParams$LoggingParams;
            fdk0Var.f = iIncrementAndGet;
            fdk0Var.i = 1;
            Object objI = b5p1.i(dkmVarE, fdk0Var);
            if (objI != obj2) {
                obj = objI;
                i = iIncrementAndGet;
            }
            return obj2;
        }
        if (i4 == 1) {
            i = fdk0Var.f;
            esLoggingParams$LoggingParams = fdk0Var.d;
            String str8 = fdk0Var.c;
            String str9 = fdk0Var.b;
            lhg1 lhg1Var4 = fdk0Var.a;
            hm5.M(obj);
            str4 = str9;
            lhg1Var2 = lhg1Var4;
            str5 = str8;
        } else {
            if (i4 == 2) {
                i = fdk0Var.f;
                EsContextPlayerState.ContextPlayerState contextPlayerState5 = fdk0Var.e;
                EsLoggingParams$LoggingParams esLoggingParams$LoggingParams2 = fdk0Var.d;
                String str10 = fdk0Var.c;
                String str11 = fdk0Var.b;
                lhg1 lhg1Var5 = fdk0Var.a;
                hm5.M(obj);
                contextPlayerState = contextPlayerState5;
                esLoggingParams$LoggingParams = esLoggingParams$LoggingParams2;
                str5 = str10;
                str6 = str11;
                lhg1Var3 = lhg1Var5;
                b(i);
                esLoggingParams$LoggingParams.getClass();
                fdk0Var.a = lhg1Var3;
                fdk0Var.b = str6;
                fdk0Var.c = str5;
                fdk0Var.d = esLoggingParams$LoggingParams;
                fdk0Var.e = contextPlayerState;
                fdk0Var.f = i;
                fdk0Var.i = 3;
                if (e(esLoggingParams$LoggingParams, i, fdk0Var) != obj2) {
                    i2 = i;
                    contextPlayerState2 = contextPlayerState;
                    str7 = str5;
                    b(i2);
                    esLoggingParams$LoggingParams.getClass();
                    fdk0Var.a = null;
                    fdk0Var.b = null;
                    fdk0Var.c = null;
                    fdk0Var.d = null;
                    fdk0Var.e = contextPlayerState2;
                    fdk0Var.f = i2;
                    fdk0Var.i = 4;
                    srz srzVarN = EsSignalRequest$SignalRequest.n();
                    srzVarN.r("automix-preview");
                    l9a l9aVar = n9a.e;
                    ruq0 ruq0Var = lhg1Var3.b;
                    double d = ruq0Var.R0;
                    double d2 = ruq0Var.S0;
                    viw0VarN = PreviewOuterClass.Preview.n();
                    viw0VarN.q();
                    viw0VarN.x();
                    viw0VarN.w();
                    ruq0 ruq0Var2 = lhg1Var3.b;
                    contextPlayerState3 = contextPlayerState2;
                    viw0VarN.y(ruq0Var2.a);
                    viw0VarN.z(ruq0Var2.b);
                    viw0VarN.u(ruq0Var2.c);
                    viw0VarN.v(ruq0Var2.d);
                    viw0VarN.A(dem1.R(lhg1Var3));
                    if (str6 != null) {
                        viw0VarN.r(str6);
                    }
                    if (str7 != null) {
                        viw0VarN.n(str7);
                    }
                    viw0VarN.s(d);
                    viw0VarN.t(d2);
                    srzVarN.q(n9a.c(l9aVar, viw0VarN.build().toByteArray()));
                    srzVarN.n(esLoggingParams$LoggingParams);
                    objU0 = jn7Var.u0((EsSignalRequest$SignalRequest) srzVarN.build(), fdk0Var);
                    if (objU0 != obj2) {
                        objU0 = rih1.a;
                    }
                    if (objU0 != obj2) {
                        contextPlayerState4 = contextPlayerState3;
                    }
                }
                return obj2;
            }
            if (i4 == 3) {
                i2 = fdk0Var.f;
                contextPlayerState2 = fdk0Var.e;
                esLoggingParams$LoggingParams = fdk0Var.d;
                str7 = fdk0Var.c;
                str6 = fdk0Var.b;
                lhg1Var3 = fdk0Var.a;
                hm5.M(obj);
                b(i2);
                esLoggingParams$LoggingParams.getClass();
                fdk0Var.a = null;
                fdk0Var.b = null;
                fdk0Var.c = null;
                fdk0Var.d = null;
                fdk0Var.e = contextPlayerState2;
                fdk0Var.f = i2;
                fdk0Var.i = 4;
                srz srzVarN2 = EsSignalRequest$SignalRequest.n();
                srzVarN2.r("automix-preview");
                l9a l9aVar2 = n9a.e;
                ruq0 ruq0Var3 = lhg1Var3.b;
                double d3 = ruq0Var3.R0;
                double d4 = ruq0Var3.S0;
                viw0VarN = PreviewOuterClass.Preview.n();
                viw0VarN.q();
                viw0VarN.x();
                viw0VarN.w();
                ruq0 ruq0Var4 = lhg1Var3.b;
                contextPlayerState3 = contextPlayerState2;
                viw0VarN.y(ruq0Var4.a);
                viw0VarN.z(ruq0Var4.b);
                viw0VarN.u(ruq0Var4.c);
                viw0VarN.v(ruq0Var4.d);
                viw0VarN.A(dem1.R(lhg1Var3));
                if (str6 != null) {
                    viw0VarN.r(str6);
                }
                if (str7 != null) {
                    viw0VarN.n(str7);
                }
                viw0VarN.s(d3);
                viw0VarN.t(d4);
                srzVarN2.q(n9a.c(l9aVar2, viw0VarN.build().toByteArray()));
                srzVarN2.n(esLoggingParams$LoggingParams);
                objU0 = jn7Var.u0((EsSignalRequest$SignalRequest) srzVarN2.build(), fdk0Var);
                if (objU0 != obj2) {
                    objU0 = rih1.a;
                }
                if (objU0 != obj2) {
                    contextPlayerState4 = contextPlayerState3;
                }
                return obj2;
            }
            if (i4 != 4) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            contextPlayerState4 = fdk0Var.e;
            hm5.M(obj);
        }
        return Boolean.valueOf(i3p1.z(contextPlayerState4));
        contextPlayerState = (EsContextPlayerState.ContextPlayerState) obj;
        b(i);
        Integer num = new Integer(i);
        fdk0Var.a = lhg1Var2;
        fdk0Var.b = str4;
        fdk0Var.c = str5;
        fdk0Var.d = esLoggingParams$LoggingParams;
        fdk0Var.e = contextPlayerState;
        fdk0Var.f = i;
        fdk0Var.i = 2;
        if (k(false, num, fdk0Var) != obj2) {
            lhg1Var3 = lhg1Var2;
            str6 = str4;
            b(i);
            esLoggingParams$LoggingParams.getClass();
            fdk0Var.a = lhg1Var3;
            fdk0Var.b = str6;
            fdk0Var.c = str5;
            fdk0Var.d = esLoggingParams$LoggingParams;
            fdk0Var.e = contextPlayerState;
            fdk0Var.f = i;
            fdk0Var.i = 3;
            if (e(esLoggingParams$LoggingParams, i, fdk0Var) != obj2) {
                i2 = i;
                contextPlayerState2 = contextPlayerState;
                str7 = str5;
                b(i2);
                esLoggingParams$LoggingParams.getClass();
                fdk0Var.a = null;
                fdk0Var.b = null;
                fdk0Var.c = null;
                fdk0Var.d = null;
                fdk0Var.e = contextPlayerState2;
                fdk0Var.f = i2;
                fdk0Var.i = 4;
                srz srzVarN3 = EsSignalRequest$SignalRequest.n();
                srzVarN3.r("automix-preview");
                l9a l9aVar3 = n9a.e;
                ruq0 ruq0Var5 = lhg1Var3.b;
                double d5 = ruq0Var5.R0;
                double d6 = ruq0Var5.S0;
                viw0VarN = PreviewOuterClass.Preview.n();
                viw0VarN.q();
                viw0VarN.x();
                viw0VarN.w();
                ruq0 ruq0Var6 = lhg1Var3.b;
                contextPlayerState3 = contextPlayerState2;
                viw0VarN.y(ruq0Var6.a);
                viw0VarN.z(ruq0Var6.b);
                viw0VarN.u(ruq0Var6.c);
                viw0VarN.v(ruq0Var6.d);
                viw0VarN.A(dem1.R(lhg1Var3));
                if (str6 != null) {
                    viw0VarN.r(str6);
                }
                if (str7 != null) {
                    viw0VarN.n(str7);
                }
                viw0VarN.s(d5);
                viw0VarN.t(d6);
                srzVarN3.q(n9a.c(l9aVar3, viw0VarN.build().toByteArray()));
                srzVarN3.n(esLoggingParams$LoggingParams);
                objU0 = jn7Var.u0((EsSignalRequest$SignalRequest) srzVarN3.build(), fdk0Var);
                if (objU0 != obj2) {
                    objU0 = rih1.a;
                }
                if (objU0 != obj2) {
                    contextPlayerState4 = contextPlayerState3;
                    return Boolean.valueOf(i3p1.z(contextPlayerState4));
                }
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(EsLoggingParams$LoggingParams esLoggingParams$LoggingParams, int i, onm onmVar) {
        gdk0 gdk0Var;
        if (onmVar instanceof gdk0) {
            gdk0Var = (gdk0) onmVar;
            int i2 = gdk0Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gdk0Var.e = i2 - Integer.MIN_VALUE;
            } else {
                gdk0Var = new gdk0(this, onmVar);
            }
        } else {
            gdk0Var = new gdk0(this, onmVar);
        }
        Object objI = gdk0Var.c;
        int i3 = gdk0Var.e;
        rih1 rih1Var = rih1.a;
        jn7 jn7Var = this.b;
        d9n d9nVar = d9n.a;
        if (i3 == 0) {
            hm5.M(objI);
            dkm dkmVarE = jn7Var.E(EsGetStateRequest.GetStateRequest.n());
            gdk0Var.a = esLoggingParams$LoggingParams;
            gdk0Var.b = i;
            gdk0Var.e = 1;
            objI = b5p1.i(dkmVarE, gdk0Var);
            if (objI != d9nVar) {
            }
            return d9nVar;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                hm5.M(objI);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = gdk0Var.b;
        esLoggingParams$LoggingParams = gdk0Var.a;
        hm5.M(objI);
        b(i);
        String strS = ((EsContextPlayerState.ContextPlayerState) objI).s();
        if (strS == null || ihc1.y0(strS)) {
            upz upzVarN = EsPlay$PlayRequest.n();
            upzVarN.n(esLoggingParams$LoggingParams);
            jqz jqzVarN = EsPreparePlay$PreparePlayRequest.n();
            cmz cmzVarP = EsContext$Context.p();
            cmzVarP.t("spotify:mixing:preview");
            cmzVarP.u("spotify:mixing:preview");
            jqzVarN.n((EsContext$Context) cmzVarP.build());
            lqz lqzVarS = EsPreparePlayOptions$PreparePlayOptions.s();
            lqzVarS.u(false);
            jqzVarN.q((EsPreparePlayOptions$PreparePlayOptions) lqzVarS.build());
            upzVarN.r((EsPreparePlay$PreparePlayRequest) jqzVarN.build());
            EsPlay$PlayRequest esPlay$PlayRequest = (EsPlay$PlayRequest) upzVarN.build();
            esPlay$PlayRequest.getClass();
            gdk0Var.a = null;
            gdk0Var.b = i;
            gdk0Var.e = 2;
            if (jn7Var.U(esPlay$PlayRequest, gdk0Var) == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }

    public final Object f(jdk0 jdk0Var) {
        drz drzVarN = EsResume$ResumeRequest.n();
        spz spzVarN = EsPauseresumeOrigin$PauseResumeOrigin.n();
        spzVarN.n("Mixing");
        drzVarN.r((EsPauseresumeOrigin$PauseResumeOrigin) spzVarN.build());
        tlz tlzVarN = EsCommandOptions$CommandOptions.n();
        tlzVarN.s(false);
        drzVarN.q((EsCommandOptions$CommandOptions) tlzVarN.build());
        Object objH0 = this.b.h0((EsResume$ResumeRequest) drzVarN.build(), jdk0Var);
        return objH0 == d9n.a ? objH0 : rih1.a;
    }

    public final lt20 g() {
        return new lt20(r4p1.k(rqt0.u(new fag(this.b.E(EsGetStateRequest.GetStateRequest.n()), (byte) 1)), 200L), new vv70(3, (lnm) null, (byte) 26), (byte) 1);
    }

    public final Object h(onm onmVar) {
        Object objI = i(onmVar);
        return objI == d9n.a ? objI : rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(onm onmVar) {
        idk0 idk0Var;
        if (onmVar instanceof idk0) {
            idk0Var = (idk0) onmVar;
            int i = idk0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                idk0Var.c = i - Integer.MIN_VALUE;
            } else {
                idk0Var = new idk0(this, onmVar);
            }
        } else {
            idk0Var = new idk0(this, onmVar);
        }
        Object objK = idk0Var.a;
        int i2 = idk0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objK);
                Integer num = new Integer(c.incrementAndGet());
                idk0Var.c = 1;
                objK = k(false, num, idk0Var);
                Object obj = d9n.a;
                if (objK == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objK);
            }
            edk0 edk0Var = (edk0) objK;
            Boolean boolValueOf = Boolean.valueOf(edk0Var.a);
            if (edk0Var.b) {
                return null;
            }
            return boolValueOf;
        } catch (ddk0 unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (f(r0) == r4) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(boolean r7, p.onm r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p.jdk0
            if (r0 == 0) goto L13
            r0 = r8
            p.jdk0 r0 = (p.jdk0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.jdk0 r0 = new p.jdk0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            p.hm5.M(r8)     // Catch: p.ddk0 -> L70
            goto L70
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            r6 = 0
            return r6
        L31:
            int r7 = r0.b
            boolean r1 = r0.a
            p.hm5.M(r8)     // Catch: p.ddk0 -> L70
            r5 = r8
            r8 = r7
            r7 = r1
            r1 = r5
            goto L58
        L3d:
            p.hm5.M(r8)
            java.util.concurrent.atomic.AtomicInteger r8 = p.ldk0.c     // Catch: p.ddk0 -> L70
            int r8 = r8.incrementAndGet()     // Catch: p.ddk0 -> L70
            java.lang.Integer r1 = new java.lang.Integer     // Catch: p.ddk0 -> L70
            r1.<init>(r8)     // Catch: p.ddk0 -> L70
            r0.a = r7     // Catch: p.ddk0 -> L70
            r0.b = r8     // Catch: p.ddk0 -> L70
            r0.e = r3     // Catch: p.ddk0 -> L70
            java.lang.Object r1 = r6.k(r7, r1, r0)     // Catch: p.ddk0 -> L70
            if (r1 != r4) goto L58
            goto L6f
        L58:
            p.edk0 r1 = (p.edk0) r1     // Catch: p.ddk0 -> L70
            boolean r1 = r1.c     // Catch: p.ddk0 -> L70
            if (r1 != 0) goto L70
            if (r7 == 0) goto L70
            b(r8)     // Catch: p.ddk0 -> L70
            r0.a = r7     // Catch: p.ddk0 -> L70
            r0.b = r8     // Catch: p.ddk0 -> L70
            r0.e = r2     // Catch: p.ddk0 -> L70
            java.lang.Object r6 = r6.f(r0)     // Catch: p.ddk0 -> L70
            if (r6 != r4) goto L70
        L6f:
            return r4
        L70:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ldk0.j(boolean, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object k(boolean z, Integer num, onm onmVar) {
        kdk0 kdk0Var;
        EsLoggingParams$LoggingParams esLoggingParams$LoggingParams;
        Integer num2;
        boolean z2;
        Object objI;
        boolean z3;
        boolean z4;
        boolean z5;
        if (onmVar instanceof kdk0) {
            kdk0Var = (kdk0) onmVar;
            int i = kdk0Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                kdk0Var.g = i - Integer.MIN_VALUE;
            } else {
                kdk0Var = new kdk0(this, onmVar);
            }
        } else {
            kdk0Var = new kdk0(this, onmVar);
        }
        Object obj = kdk0Var.e;
        int i2 = kdk0Var.g;
        jn7 jn7Var = this.b;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            coz cozVarR = EsLoggingParams$LoggingParams.r();
            qpz qpzVarP = EsOptional.OptionalInt64.p();
            qpzVarP.n(this.a.b());
            cozVarR.s((EsOptional.OptionalInt64) qpzVarP.build());
            esLoggingParams$LoggingParams = (EsLoggingParams$LoggingParams) cozVarR.build();
            dkm dkmVarE = jn7Var.E(EsGetStateRequest.GetStateRequest.n());
            num2 = num;
            kdk0Var.c = num2;
            kdk0Var.d = esLoggingParams$LoggingParams;
            z2 = z;
            kdk0Var.a = z2;
            kdk0Var.g = 1;
            objI = b5p1.i(dkmVarE, kdk0Var);
            if (objI != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z5 = kdk0Var.b;
                hm5.M(obj);
                return new edk0(z5, true, true);
            }
            if (i2 == 3) {
                z4 = kdk0Var.b;
                hm5.M(obj);
                return new edk0(z4, true, false);
            }
            if (i2 == 4) {
                z3 = kdk0Var.b;
                hm5.M(obj);
                return new edk0(z3, false, false);
            }
            if (i2 != 5) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z3 = kdk0Var.b;
            hm5.M(obj);
            return new edk0(z3, false, false);
        }
        boolean z6 = kdk0Var.a;
        esLoggingParams$LoggingParams = kdk0Var.d;
        Integer num3 = kdk0Var.c;
        hm5.M(obj);
        z2 = z6;
        objI = obj;
        num2 = num3;
        EsContextPlayerState.ContextPlayerState contextPlayerState = (EsContextPlayerState.ContextPlayerState) objI;
        if (num2 != null) {
            b(num2.intValue());
        }
        boolean z7 = i3p1.z(contextPlayerState);
        if (i3p1.z(contextPlayerState) && i3p1.B(contextPlayerState.S())) {
            if (contextPlayerState.getSignalsList().contains("stop-automix-preview")) {
                srz srzVarN = EsSignalRequest$SignalRequest.n();
                srzVarN.r("stop-automix-preview");
                srzVarN.q(z2 ? "true" : "false");
                srzVarN.n(esLoggingParams$LoggingParams);
                EsSignalRequest$SignalRequest esSignalRequest$SignalRequest = (EsSignalRequest$SignalRequest) srzVarN.build();
                kdk0Var.c = null;
                kdk0Var.d = null;
                kdk0Var.a = z2;
                kdk0Var.b = z7;
                kdk0Var.g = 2;
                if (jn7Var.u0(esSignalRequest$SignalRequest, kdk0Var) != d9nVar) {
                    z5 = z7;
                    return new edk0(z5, true, true);
                }
            } else {
                EsSkipNext$SkipNextRequest esSkipNext$SkipNextRequestN = EsSkipNext$SkipNextRequest.n();
                kdk0Var.c = null;
                kdk0Var.d = null;
                kdk0Var.a = z2;
                kdk0Var.b = z7;
                kdk0Var.g = 3;
                if (jn7Var.v0(esSkipNext$SkipNextRequestN, kdk0Var) != d9nVar) {
                    z4 = z7;
                    return new edk0(z4, true, false);
                }
            }
        } else if (contextPlayerState.Y()) {
            rpz rpzVarN = EsPause$PauseRequest.n();
            spz spzVarN = EsPauseresumeOrigin$PauseResumeOrigin.n();
            spzVarN.n("Mixing");
            rpzVarN.r((EsPauseresumeOrigin$PauseResumeOrigin) spzVarN.build());
            tlz tlzVarN = EsCommandOptions$CommandOptions.n();
            tlzVarN.s(false);
            rpzVarN.q((EsCommandOptions$CommandOptions) tlzVarN.build());
            EsPause$PauseRequest esPause$PauseRequest = (EsPause$PauseRequest) rpzVarN.build();
            kdk0Var.c = null;
            kdk0Var.d = null;
            kdk0Var.a = z2;
            kdk0Var.b = z7;
            kdk0Var.g = 5;
            Object objT = jn7Var.T(esPause$PauseRequest, kdk0Var);
            if (objT != d9nVar) {
                obj = objT;
                z3 = z7;
                return new edk0(z3, false, false);
            }
        } else {
            EsStop$StopRequest esStop$StopRequestN = EsStop$StopRequest.n();
            kdk0Var.c = null;
            kdk0Var.d = null;
            kdk0Var.a = z2;
            kdk0Var.b = z7;
            kdk0Var.g = 4;
            Object objY0 = jn7Var.y0(esStop$StopRequestN, kdk0Var);
            if (objY0 != d9nVar) {
                obj = objY0;
                z3 = z7;
                return new edk0(z3, false, false);
            }
        }
        return d9nVar;
    }
}
