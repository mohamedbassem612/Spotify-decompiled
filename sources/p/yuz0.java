package p;

import com.spotify.player.model.PlayerState;
import com.spotify.runtime_consumption.esperanto.proto.QueryRuntimeConsumptionRequest;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yuz0 {
    public final ynb0 a;
    public final Flowable b;
    public final uu00 c;
    public final jn7 d;

    public yuz0(ynb0 ynb0Var, Flowable flowable, uu00 uu00Var, jn7 jn7Var) {
        this.a = ynb0Var;
        this.b = flowable;
        this.c = uu00Var;
        this.d = jn7Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        vuz0 vuz0Var;
        String str2;
        jo70 jo70Var;
        mdz mdzVar;
        String string;
        kdz kdzVar;
        io70 io70Var;
        if (onmVar instanceof vuz0) {
            vuz0Var = (vuz0) onmVar;
            int i = vuz0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                vuz0Var.e = i - Integer.MIN_VALUE;
            } else {
                vuz0Var = new vuz0(this, onmVar);
            }
        } else {
            vuz0Var = new vuz0(this, onmVar);
        }
        Object objO = vuz0Var.c;
        int i2 = vuz0Var.e;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objO);
            c3u0 c3u0Var = new c3u0(this, (lnm) null, (byte) 29);
            vuz0Var.a = str;
            vuz0Var.e = 1;
            objO = rc2.O(250L, c3u0Var, vuz0Var);
            if (objO != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            str = vuz0Var.a;
            hm5.M(objO);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = vuz0Var.b;
            str = vuz0Var.a;
            hm5.M(objO);
        }
        uv00 uv00Var = (uv00) objO;
        jo70Var = uv00Var.a(jo70.class, str2).b;
        mdzVar = uv00Var.a(mdz.class, str2).b;
        if (jo70Var == null && (io70Var = jo70Var.e) != null) {
            string = io70Var.b;
        } else if (mdzVar != null || (kdzVar = mdzVar.d) == null) {
            string = null;
        } else {
            string = kdzVar.b.toString();
        }
        if (u890.j(string, str)) {
            return str2;
        }
        return null;
        PlayerState playerState = (PlayerState) objO;
        if (playerState != null) {
            String strO = o4p1.o(playerState);
            if (strO.length() <= 0) {
                strO = null;
            }
            if (strO != null) {
                Single singleFirstOrError = this.c.b(new oi("ratings-runtime-consumption", false, new q4z0(strO, (byte) 7))).filter(hgx0.d).firstOrError();
                vuz0Var.a = str;
                vuz0Var.b = strO;
                vuz0Var.e = 2;
                Object objJ = fc11.j(singleFirstOrError, vuz0Var);
                if (objJ != d9nVar) {
                    String str3 = strO;
                    objO = objJ;
                    str2 = str3;
                    uv00 uv00Var2 = (uv00) objO;
                    jo70Var = uv00Var2.a(jo70.class, str2).b;
                    mdzVar = uv00Var2.a(mdz.class, str2).b;
                    if (jo70Var == null) {
                        if (mdzVar != null) {
                            string = null;
                        } else {
                            string = null;
                        }
                    } else if (mdzVar != null) {
                        string = null;
                    } else {
                        string = null;
                    }
                    if (u890.j(string, str)) {
                        return str2;
                    }
                }
                return d9nVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        if (r8 == r5) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r7, p.onm r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p.wuz0
            if (r0 == 0) goto L13
            r0 = r8
            p.wuz0 r0 = (p.wuz0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.wuz0 r0 = new p.wuz0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r8)     // Catch: java.lang.Throwable -> L74 java.util.concurrent.CancellationException -> L75
            goto L71
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            p.hm5.M(r8)     // Catch: java.lang.Throwable -> L74 java.util.concurrent.CancellationException -> L75
            goto L50
        L35:
            p.hm5.M(r8)
            p.ynb0 r8 = r6.a
            java.lang.Object r8 = r8.get()
            p.oz4 r8 = (p.oz4) r8
            boolean r8 = r8.a()
            if (r8 != 0) goto L47
            goto L74
        L47:
            r0.c = r3     // Catch: java.lang.Throwable -> L74 java.util.concurrent.CancellationException -> L75
            java.lang.Object r8 = r6.a(r7, r0)     // Catch: java.lang.Throwable -> L74 java.util.concurrent.CancellationException -> L75
            if (r8 != r5) goto L50
            goto L70
        L50:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L74 java.util.concurrent.CancellationException -> L75
            if (r8 != 0) goto L55
            goto L74
        L55:
            p.g1z0 r7 = com.spotify.runtime_consumption.esperanto.proto.QueryRuntimeConsumptionRequest.n()     // Catch: java.lang.Throwable -> L74 java.util.concurrent.CancellationException -> L75
            r7.n(r8)     // Catch: java.lang.Throwable -> L74 java.util.concurrent.CancellationException -> L75
            r7.q()     // Catch: java.lang.Throwable -> L74 java.util.concurrent.CancellationException -> L75
            com.google.protobuf.h r7 = r7.build()     // Catch: java.lang.Throwable -> L74 java.util.concurrent.CancellationException -> L75
            com.spotify.runtime_consumption.esperanto.proto.QueryRuntimeConsumptionRequest r7 = (com.spotify.runtime_consumption.esperanto.proto.QueryRuntimeConsumptionRequest) r7     // Catch: java.lang.Throwable -> L74 java.util.concurrent.CancellationException -> L75
            r7.getClass()     // Catch: java.lang.Throwable -> L74 java.util.concurrent.CancellationException -> L75
            r0.c = r2     // Catch: java.lang.Throwable -> L74 java.util.concurrent.CancellationException -> L75
            java.lang.Object r8 = r6.c(r7, r0)     // Catch: java.lang.Throwable -> L74 java.util.concurrent.CancellationException -> L75
            if (r8 != r5) goto L71
        L70:
            return r5
        L71:
            java.lang.Long r8 = (java.lang.Long) r8     // Catch: java.lang.Throwable -> L74 java.util.concurrent.CancellationException -> L75
            return r8
        L74:
            return r4
        L75:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.yuz0.b(java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(QueryRuntimeConsumptionRequest queryRuntimeConsumptionRequest, onm onmVar) {
        xuz0 xuz0Var;
        if (onmVar instanceof xuz0) {
            xuz0Var = (xuz0) onmVar;
            int i = xuz0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xuz0Var.c = i - Integer.MIN_VALUE;
            } else {
                xuz0Var = new xuz0(this, onmVar);
            }
        } else {
            xuz0Var = new xuz0(this, onmVar);
        }
        Object objO = xuz0Var.a;
        int i2 = xuz0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objO);
                pew0 pew0Var = new pew0(this, queryRuntimeConsumptionRequest, false, (lnm) null, (byte) 27);
                xuz0Var.c = 1;
                objO = rc2.O(250L, pew0Var, xuz0Var);
                d9n d9nVar = d9n.a;
                if (objO == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objO);
            }
            return (Long) objO;
        } catch (CancellationException unused) {
            op71.x(xuz0Var.getContext());
            return null;
        } catch (Exception unused2) {
            return null;
        }
    }
}
