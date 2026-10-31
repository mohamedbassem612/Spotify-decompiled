package p;

import android.app.Activity;
import androidx.lifecycle.LifecycleDestroyedException;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.login.credentialmanager.passkeys.PasskeysApiException;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$UserSettings;
import io.reactivex.rxjava3.core.Single;
import java.util.Map;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wt extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wt(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r7 == r5) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object e(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.c
            p.cab r0 = (p.cab) r0
            byte r1 = r6.b
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L15
            p.hm5.M(r7)
            goto L53
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r2
        L1b:
            p.hm5.M(r7)
            goto L33
        L1f:
            p.hm5.M(r7)
            java.lang.Object r7 = r0.b
            p.bjd r7 = (p.bjd) r7
            p.mr20 r7 = r7.b()
            r6.b = r4
            java.lang.Object r7 = p.b5p1.i(r7, r6)
            if (r7 != r5) goto L33
            goto L52
        L33:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L56
            java.lang.Object r7 = r0.c
            p.zid r7 = (p.zid) r7
            java.lang.Object r0 = r6.d
            java.lang.String r0 = (java.lang.String) r0
            r6.b = r3
            p.q8n r1 = r7.c
            p.yid r3 = new p.yid
            r3.<init>(r7, r0, r2)
            java.lang.Object r7 = p.fn31.Y(r1, r3, r6)
            if (r7 != r5) goto L53
        L52:
            return r5
        L53:
            p.eid r7 = (p.eid) r7
            return r7
        L56:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p.wt.e(java.lang.Object):java.lang.Object");
    }

    private final Object g(Object obj) {
        ypd ypdVar = (ypd) this.d;
        vr20 vr20Var = (vr20) this.c;
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            if (ypdVar.c == null) {
                q8n q8nVar = ypdVar.b;
                hzb hzbVar = new hzb(ypdVar, (lnm) null, (byte) 3);
                this.c = vr20Var;
                this.b = (byte) 1;
                if (fn31.Y(q8nVar, hzbVar, this) != d9nVar) {
                }
            }
        }
        if (b != 1) {
            if (b == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        i3b i3bVar = ypdVar.c;
        if (i3bVar == null) {
            u890.C("carConnection");
            throw null;
        }
        mr20 mr20VarI = t5p1.i((ymd0) i3bVar.b);
        this.c = null;
        this.b = (byte) 2;
        u4p1.S(vr20Var);
        Object objCollect = mr20VarI.collect(new vnb(vr20Var, (byte) 26), this);
        if (objCollect != d9nVar) {
            objCollect = rih1Var;
        }
        if (objCollect != d9nVar) {
            objCollect = rih1Var;
        }
        return objCollect == d9nVar ? d9nVar : rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0040 A[PHI: r0 r5 r6 r7 r9 r10
      0x0040: PHI (r0v1 p.wt) = (r0v13 p.wt), (r0v0 p.wt) binds: [B:12:0x003c, B:9:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x0040: PHI (r5v1 java.lang.Object) = (r5v11 java.lang.Object), (r5v15 java.lang.Object) binds: [B:12:0x003c, B:9:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x0040: PHI (r6v1 p.xj61) = (r6v5 p.xj61), (r6v0 p.xj61) binds: [B:12:0x003c, B:9:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x0040: PHI (r7v1 byte) = (r7v4 byte), (r7v0 byte) binds: [B:12:0x003c, B:9:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x0040: PHI (r9v1 byte) = (r9v7 byte), (r9v0 byte) binds: [B:12:0x003c, B:9:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x0040: PHI (r10v1 byte) = (r10v4 byte), (r10v0 byte) binds: [B:12:0x003c, B:9:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0076  */
    /* JADX WARN: Code duplicated, block: B:38:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:40:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:41:0x01d6  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e0, code lost:
    
        if (r0 == r11) goto L25;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00e0 -> B:26:0x00e3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object h(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.wt.h(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (p.u890.l(r9, r8) == r6) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object i(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.d
            android.app.Activity r0 = (android.app.Activity) r0
            byte r1 = r8.b
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = 0
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L18
            p.hm5.M(r9)     // Catch: java.lang.Exception -> L16
            goto L66
        L16:
            r8 = move-exception
            goto L6e
        L18:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r5
        L1e:
            java.lang.Object r1 = r8.c
            p.a6n1 r1 = (p.a6n1) r1
            p.hm5.M(r9)     // Catch: java.lang.Exception -> L16
            goto L4e
        L26:
            p.hm5.M(r9)
            android.content.Context r9 = r0.getApplicationContext()     // Catch: java.lang.Exception -> L16
            if (r9 == 0) goto L30
            goto L31
        L30:
            r9 = r0
        L31:
            p.a6n1 r1 = new p.a6n1     // Catch: java.lang.Exception -> L16
            p.nbo1 r7 = new p.nbo1     // Catch: java.lang.Exception -> L16
            r7.<init>(r9)     // Catch: java.lang.Exception -> L16
            r1.<init>(r7)     // Catch: java.lang.Exception -> L16
            java.lang.Object r9 = r1.b     // Catch: java.lang.Exception -> L16
            p.nbo1 r9 = (p.nbo1) r9     // Catch: java.lang.Exception -> L16
            p.hfp1 r9 = r9.a()     // Catch: java.lang.Exception -> L16
            r8.c = r1     // Catch: java.lang.Exception -> L16
            r8.b = r3     // Catch: java.lang.Exception -> L16
            java.lang.Object r9 = p.u890.l(r9, r8)     // Catch: java.lang.Exception -> L16
            if (r9 != r6) goto L4e
            goto L65
        L4e:
            p.r8o r9 = (p.r8o) r9     // Catch: java.lang.Exception -> L16
            java.lang.String r3 = "XDeviceInstall: launching prompt"
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L16
            com.spotify.base.java.logging.Logger.g(r3, r7)     // Catch: java.lang.Exception -> L16
            p.hfp1 r9 = r1.c(r0, r9)     // Catch: java.lang.Exception -> L16
            r8.c = r5     // Catch: java.lang.Exception -> L16
            r8.b = r2     // Catch: java.lang.Exception -> L16
            java.lang.Object r8 = p.u890.l(r9, r8)     // Catch: java.lang.Exception -> L16
            if (r8 != r6) goto L66
        L65:
            return r6
        L66:
            java.lang.String r8 = "XDeviceInstall: done"
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L16
            com.spotify.base.java.logging.Logger.g(r8, r9)     // Catch: java.lang.Exception -> L16
            goto L79
        L6e:
            java.lang.String r9 = "XDeviceInstall: failed: "
            java.lang.String r9 = p.ktd.i(r9, r8)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            com.spotify.base.java.logging.Logger.e(r8, r9, r0)
        L79:
            p.rih1 r8 = p.rih1.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.wt.i(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        if (p.fc11.i(r8, r7) == r6) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object j(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.c
            p.zd1 r0 = (p.zd1) r0
            java.lang.Object r1 = r7.d
            p.cnh r1 = (p.cnh) r1
            java.lang.String r2 = r1.b
            byte r3 = r7.b
            r4 = 2
            r5 = 1
            p.d9n r6 = p.d9n.a
            if (r3 == 0) goto L27
            if (r3 == r5) goto L23
            if (r3 != r4) goto L1c
            p.hm5.M(r8)     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> L63
            goto L5a
        L1a:
            r7 = move-exception
            goto L5d
        L1c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            r7 = 0
            return r7
        L23:
            p.hm5.M(r8)     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> L63
            goto L33
        L27:
            p.hm5.M(r8)
            r7.b = r5     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> L63
            java.lang.Object r8 = r0.b(r1, r7)     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> L63
            if (r8 != r6) goto L33
            goto L59
        L33:
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> L63
            java.lang.Object r0 = r0.b     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> L63
            p.tjh r0 = (p.tjh) r0     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> L63
            java.lang.String r1 = r1.a     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> L63
            p.n4b r3 = r0.c     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> L63
            io.reactivex.rxjava3.core.Completable r8 = r3.l(r1, r8, r2)     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> L63
            p.rjh r3 = new p.rjh     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> L63
            r5 = 0
            r3.<init>(r0, r1, r5)     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> L63
            io.reactivex.rxjava3.internal.operators.completable.CompletablePeek r8 = r8.g(r3)     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> L63
            io.reactivex.rxjava3.core.Scheduler r0 = r0.a     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> L63
            io.reactivex.rxjava3.internal.operators.completable.CompletableSubscribeOn r8 = r8.s(r0)     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> L63
            r7.b = r4     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> L63
            java.lang.Object r7 = p.fc11.i(r8, r7)     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> L63
            if (r7 != r6) goto L5a
        L59:
            return r6
        L5a:
            p.coh r7 = p.coh.a     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> L63
            return r7
        L5d:
            p.doh r8 = new p.doh
            r8.<init>(r2, r7)
            return r8
        L63:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.wt.j(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r11 == r7) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.c
            p.yon r0 = (p.yon) r0
            java.lang.Object r1 = r10.d
            p.dnh r1 = (p.dnh) r1
            java.lang.String r2 = r1.b
            java.lang.String r6 = r1.a
            byte r3 = r10.b
            r4 = 2
            r5 = 1
            p.d9n r7 = p.d9n.a
            if (r3 == 0) goto L2a
            if (r3 == r5) goto L26
            if (r3 != r4) goto L1f
            p.hm5.M(r11)     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L71
            goto L51
        L1c:
            r0 = move-exception
            r10 = r0
            goto L6b
        L1f:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            r10 = 0
            return r10
        L26:
            p.hm5.M(r11)     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L71
            goto L36
        L2a:
            p.hm5.M(r11)
            r10.b = r5     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L71
            java.lang.Object r11 = r0.a(r1, r10)     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L71
            if (r11 != r7) goto L36
            goto L50
        L36:
            java.util.List r11 = (java.util.List) r11     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L71
            java.lang.Object r3 = r0.b     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L71
            p.tjh r3 = (p.tjh) r3     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L71
            p.n4b r5 = r3.c     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L71
            io.reactivex.rxjava3.core.Single r11 = r5.m(r6, r11, r2)     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L71
            io.reactivex.rxjava3.core.Scheduler r3 = r3.a     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L71
            io.reactivex.rxjava3.core.Single r11 = r11.subscribeOn(r3)     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L71
            r10.b = r4     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L71
            java.lang.Object r11 = p.fc11.j(r11, r10)     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L71
            if (r11 != r7) goto L51
        L50:
            return r7
        L51:
            com.spotify.userinteractivityservice.usercomments.v1.proto.CreateReplyResponse r11 = (com.spotify.userinteractivityservice.usercomments.v1.proto.CreateReplyResponse) r11     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L71
            p.soh r3 = new p.soh     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L71
            java.lang.String r7 = r11.o()     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L71
            java.lang.String r8 = r1.b     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L71
            java.lang.Object r10 = r0.c     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L71
            p.yqg r10 = (p.yqg) r10     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L71
            long r4 = r10.b()     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L71
            boolean r9 = r11.n()     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L71
            r3.<init>(r4, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L71
            return r3
        L6b:
            p.toh r11 = new p.toh
            r11.<init>(r10, r6, r2)
            return r11
        L71:
            r0 = move-exception
            r10 = r0
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.wt.m(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0082  */
    /* JADX WARN: Code duplicated, block: B:40:0x0091  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0 A[PHI: r3 r10
      0x00a0: PHI (r3v9 p.n4s0) = (r3v6 p.n4s0), (r3v12 p.n4s0) binds: [B:41:0x009d, B:13:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x00a0: PHI (r10v14 java.lang.Object) = (r10v9 java.lang.Object), (r10v0 java.lang.Object) binds: [B:41:0x009d, B:13:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:66:0x0107 A[RETURN] */
    private final Object o(Object obj) {
        Object objS;
        Throwable thA;
        n4s0 n4s0Var;
        Boolean bool;
        oon oonVar;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        q5o q5oVar = (q5o) this.d;
        r5o r5oVar = q5oVar.b;
        dt71 dt71Var = q5oVar.g;
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                hm5.M(obj);
                g1f0 g1f0Var = q5oVar.d;
                boolean z = hzd1.a;
                if (fno1.k() && g1f0Var.n() && !z) {
                    tzr0 tzr0Var = q5oVar.c;
                    this.b = (byte) 2;
                    objS = tzr0Var.s(this);
                    if (objS != d9nVar) {
                        thA = e331.a(objS);
                        if (thA != null && (thA instanceof PasskeysApiException)) {
                            r5oVar.d(((PasskeysApiException) thA).a, "error_endpoint_passkeys-v1_passkey_register_start");
                        }
                        if (objS instanceof m231) {
                            objS = null;
                        }
                        n4s0Var = (n4s0) objS;
                        if (n4s0Var == null) {
                            bool = Boolean.FALSE;
                            this.c = null;
                            this.b = (byte) 3;
                            if (dt71Var.emit(bool, this) == d9nVar) {
                                return rih1Var;
                            }
                        } else {
                            w5o w5oVar = q5oVar.a;
                            String str = n4s0Var.a;
                            this.c = n4s0Var;
                            this.b = (byte) 4;
                            obj = w5oVar.b(str, this);
                            if (obj != d9nVar) {
                                oonVar = (oon) obj;
                                if (oonVar instanceof non) {
                                    this.c = null;
                                    this.b = (byte) 5;
                                    if (q5oVar.f((non) oonVar, n4s0Var, this) != d9nVar) {
                                        bool4 = Boolean.TRUE;
                                        this.c = null;
                                        this.b = (byte) 6;
                                        if (dt71Var.emit(bool4, this) != d9nVar) {
                                            return rih1Var;
                                        }
                                    }
                                } else if (oonVar instanceof mon) {
                                    r5oVar.b.a(new khv0(r5oVar.a.a, 4, (Map) null, "credential_manager_register_passkey_failure"));
                                    bool3 = Boolean.TRUE;
                                    this.c = null;
                                    this.b = (byte) 7;
                                    if (dt71Var.emit(bool3, this) != d9nVar) {
                                        return rih1Var;
                                    }
                                } else {
                                    if (!(oonVar instanceof lon)) {
                                        eg.o();
                                        return null;
                                    }
                                    bool2 = Boolean.TRUE;
                                    this.c = null;
                                    this.b = (byte) 8;
                                    if (dt71Var.emit(bool2, this) != d9nVar) {
                                        return rih1Var;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    Boolean bool5 = Boolean.FALSE;
                    this.b = (byte) 1;
                    if (dt71Var.emit(bool5, this) != d9nVar) {
                        return rih1Var;
                    }
                }
                return d9nVar;
            case 1:
                hm5.M(obj);
                return rih1Var;
            case 2:
                hm5.M(obj);
                objS = ((e331) obj).a;
                thA = e331.a(objS);
                if (thA != null) {
                    r5oVar.d(((PasskeysApiException) thA).a, "error_endpoint_passkeys-v1_passkey_register_start");
                }
                if (objS instanceof m231) {
                    objS = null;
                }
                n4s0Var = (n4s0) objS;
                if (n4s0Var == null) {
                    bool = Boolean.FALSE;
                    this.c = null;
                    this.b = (byte) 3;
                    if (dt71Var.emit(bool, this) == d9nVar) {
                        return rih1Var;
                    }
                } else {
                    w5o w5oVar2 = q5oVar.a;
                    String str2 = n4s0Var.a;
                    this.c = n4s0Var;
                    this.b = (byte) 4;
                    obj = w5oVar2.b(str2, this);
                    if (obj != d9nVar) {
                        oonVar = (oon) obj;
                        if (oonVar instanceof non) {
                            this.c = null;
                            this.b = (byte) 5;
                            if (q5oVar.f((non) oonVar, n4s0Var, this) != d9nVar) {
                                bool4 = Boolean.TRUE;
                                this.c = null;
                                this.b = (byte) 6;
                                if (dt71Var.emit(bool4, this) != d9nVar) {
                                    return rih1Var;
                                }
                            }
                        } else if (oonVar instanceof mon) {
                            r5oVar.b.a(new khv0(r5oVar.a.a, 4, (Map) null, "credential_manager_register_passkey_failure"));
                            bool3 = Boolean.TRUE;
                            this.c = null;
                            this.b = (byte) 7;
                            if (dt71Var.emit(bool3, this) != d9nVar) {
                                return rih1Var;
                            }
                        } else {
                            if (!(oonVar instanceof lon)) {
                                eg.o();
                                return null;
                            }
                            bool2 = Boolean.TRUE;
                            this.c = null;
                            this.b = (byte) 8;
                            if (dt71Var.emit(bool2, this) != d9nVar) {
                                return rih1Var;
                            }
                        }
                    }
                }
                return d9nVar;
            case 3:
                hm5.M(obj);
                return rih1Var;
            case 4:
                n4s0Var = (n4s0) this.c;
                hm5.M(obj);
                oonVar = (oon) obj;
                if (oonVar instanceof non) {
                    this.c = null;
                    this.b = (byte) 5;
                    if (q5oVar.f((non) oonVar, n4s0Var, this) != d9nVar) {
                        bool4 = Boolean.TRUE;
                        this.c = null;
                        this.b = (byte) 6;
                        if (dt71Var.emit(bool4, this) != d9nVar) {
                            return rih1Var;
                        }
                    }
                } else if (oonVar instanceof mon) {
                    r5oVar.b.a(new khv0(r5oVar.a.a, 4, (Map) null, "credential_manager_register_passkey_failure"));
                    bool3 = Boolean.TRUE;
                    this.c = null;
                    this.b = (byte) 7;
                    if (dt71Var.emit(bool3, this) != d9nVar) {
                        return rih1Var;
                    }
                } else {
                    if (!(oonVar instanceof lon)) {
                        eg.o();
                        return null;
                    }
                    bool2 = Boolean.TRUE;
                    this.c = null;
                    this.b = (byte) 8;
                    if (dt71Var.emit(bool2, this) != d9nVar) {
                        return rih1Var;
                    }
                }
                return d9nVar;
            case 5:
                hm5.M(obj);
                bool4 = Boolean.TRUE;
                this.c = null;
                this.b = (byte) 6;
                if (dt71Var.emit(bool4, this) != d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 6:
                hm5.M(obj);
                return rih1Var;
            case 7:
                hm5.M(obj);
                return rih1Var;
            case 8:
                hm5.M(obj);
                return rih1Var;
            default:
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    private final Object p(Object obj) {
        v3u0 v3u0Var = ((dao) this.d).a;
        vr20 vr20Var = (vr20) this.c;
        byte b = this.b;
        c4u0 c4u0Var = c4u0.Z;
        c4u0 c4u0Var2 = c4u0.Y;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            g4u0 g4u0VarQ = PlaybackSettingsEsperantoService.GetSettingsRequest.q();
            g4u0VarQ.r(c4u0Var2);
            g4u0VarQ.r(c4u0Var);
            g4u0VarQ.s(true);
            Single map = v3u0Var.callSingle("spotify.playback_settings.esperanto.proto.PlaybackSettings", "GetSettings", g4u0VarQ.build()).map(mif1.n1);
            this.c = vr20Var;
            this.b = (byte) 1;
            obj = fc11.j(map, this);
            if (obj != d9nVar) {
            }
        }
        if (b != 1) {
            if (b == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        PlaybackSettingsEsperantoService$UserSettings playbackSettingsEsperantoService$UserSettingsP = ((PlaybackSettingsEsperantoService.GetSettingsResponse) obj).p();
        y9o y9oVar = new y9o(playbackSettingsEsperantoService$UserSettingsP.t() ? playbackSettingsEsperantoService$UserSettingsP.o() : 5000, playbackSettingsEsperantoService$UserSettingsP.s() && playbackSettingsEsperantoService$UserSettingsP.n());
        m4u0 m4u0VarP = PlaybackSettingsEsperantoService.StreamSettingChangesRequest.p();
        m4u0VarP.q(c4u0Var2);
        m4u0VarP.q(c4u0Var);
        ipr iprVar = new ipr(y9oVar, new wef(yoi1.g(v3u0Var.callStream("spotify.playback_settings.esperanto.proto.PlaybackSettings", "StreamSettingChanges", m4u0VarP.build()).map(b610.Y0)), (byte) 15), new mnl(3, (lnm) null, (byte) 7), (byte) 16);
        this.c = null;
        this.b = (byte) 2;
        u4p1.S(vr20Var);
        Object objCollect = iprVar.collect(new ulm(vr20Var, (byte) 20), this);
        if (objCollect != d9nVar) {
            objCollect = rih1Var;
        }
        if (objCollect != d9nVar) {
            objCollect = rih1Var;
        }
        return objCollect == d9nVar ? d9nVar : rih1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                wt wtVar = new wt((xt) obj2, lnmVar, (byte) 0);
                wtVar.c = obj;
                return wtVar;
            case 1:
                wt wtVar2 = new wt((xb0) obj2, lnmVar, (byte) 1);
                wtVar2.c = obj;
                return wtVar2;
            case 2:
                wt wtVar3 = new wt((eyh0) obj2, lnmVar, (byte) 2);
                wtVar3.c = obj;
                return wtVar3;
            case 3:
                return new wt((upo) this.c, (ven0) obj2, lnmVar, (byte) 3);
            case 4:
                return new wt((c21) this.c, (String) obj2, lnmVar, (byte) 4);
            case 5:
                return new wt((bl3) this.c, (String) obj2, lnmVar, (byte) 5);
            case 6:
                return new wt((a24) this.c, (n4v) obj2, lnmVar, (byte) 6);
            case 7:
                wt wtVar4 = new wt((nx2) obj2, lnmVar, (byte) 7);
                wtVar4.c = obj;
                return wtVar4;
            case 8:
                return new wt((ml4) this.c, (oj80) obj2, lnmVar, (byte) 8);
            case 9:
                return new wt((sen0) this.c, (xid) obj2, lnmVar, (byte) 9);
            case 10:
                return new wt((yv5) obj2, lnmVar, (byte) 10);
            case 11:
                return new wt((tc6) this.c, (String) obj2, lnmVar, (byte) 11);
            case 12:
                return new wt((ttm0) this.c, (ec7) obj2, lnmVar, (byte) 12);
            case 13:
                wt wtVar5 = new wt((yu8) obj2, lnmVar, (byte) 13);
                wtVar5.c = obj;
                return wtVar5;
            case 14:
                wt wtVar6 = new wt((yo31) obj2, lnmVar, (byte) 14);
                wtVar6.c = obj;
                return wtVar6;
            case 15:
                wt wtVar7 = new wt((uya) obj2, lnmVar, (byte) 15);
                wtVar7.c = obj;
                return wtVar7;
            case 16:
                wt wtVar8 = new wt((xya) obj2, lnmVar, (byte) 16);
                wtVar8.c = obj;
                return wtVar8;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new wt((o95) this.c, (ven0) obj2, lnmVar, (byte) 17);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new wt((lsb) this.c, (drb) obj2, lnmVar, (byte) 18);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new wt((lsb) obj2, lnmVar, (byte) 19);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new wt((iwc) this.c, (ynb0) obj2, lnmVar, (byte) 20);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new wt((cab) this.c, (String) obj2, lnmVar, (byte) 21);
            case 22:
                wt wtVar9 = new wt((ypd) obj2, lnmVar, (byte) 22);
                wtVar9.c = obj;
                return wtVar9;
            case 23:
                return new wt((pdg) this.c, (tv80) obj2, lnmVar, (byte) 23);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new wt((Activity) obj2, lnmVar, (byte) 24);
            case 25:
                return new wt((zd1) this.c, (cnh) obj2, lnmVar, (byte) 25);
            case 26:
                return new wt((yon) this.c, (dnh) obj2, lnmVar, (byte) 26);
            case 27:
                return new wt((q5o) obj2, lnmVar, (byte) 27);
            case 28:
                wt wtVar10 = new wt((dao) obj2, lnmVar, (byte) 28);
                wtVar10.c = obj;
                return wtVar10;
            default:
                return new wt((faa0) this.c, (qoo) obj2, lnmVar, (byte) 29);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.lifecycle.LifecycleDestroyedException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invoke(Object obj, Object obj2) throws LifecycleDestroyedException, KotlinNothingValueException {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 16:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.lifecycle.LifecycleDestroyedException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:497:0x08d6  */
    /* JADX WARN: Code duplicated, block: B:499:0x08e0  */
    /* JADX WARN: Code duplicated, block: B:502:0x08fa A[PHI: r3
      0x08fa: PHI (r3v3 java.lang.Object) = (r3v28 java.lang.Object), (r3v33 java.lang.Object) binds: [B:500:0x08f6, B:495:0x08c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:504:0x08fe  */
    /* JADX WARN: Code duplicated, block: B:507:0x0903  */
    /* JADX WARN: Code duplicated, block: B:510:0x0914  */
    /* JADX WARN: Code duplicated, block: B:515:0x0926  */
    /* JADX WARN: Code duplicated, block: B:516:0x0928  */
    /* JADX WARN: Code duplicated, block: B:519:0x0933  */
    /* JADX WARN: Code duplicated, block: B:527:0x094e  */
    /* JADX WARN: Code duplicated, block: B:533:0x096c  */
    /* JADX WARN: Code duplicated, block: B:535:0x0970  */
    /* JADX WARN: Code duplicated, block: B:538:0x098c  */
    /* JADX WARN: Code duplicated, block: B:569:0x0a05  */
    /* JADX WARN: Code duplicated, block: B:572:0x0a10  */
    /* JADX WARN: Code duplicated, block: B:575:0x0a35  */
    /* JADX WARN: Code duplicated, block: B:589:0x091c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:591:0x090e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:594:0x093f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:597:0x092d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:120:0x0201 -> B:103:0x01bc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:143:0x0256 -> B:103:0x01bc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:148:0x026b -> B:103:0x01bc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:152:0x0272 -> B:103:0x01bc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:156:0x028d -> B:103:0x01bc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:209:0x03a2 -> B:205:0x037a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:224:0x03e0 -> B:220:0x03c0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0077 -> B:35:0x007b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:399:0x0721 -> B:393:0x06fc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:539:0x0996 -> B:497:0x08d6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws androidx.lifecycle.LifecycleDestroyedException, kotlin.KotlinNothingValueException {
        /*
            Method dump skipped, instruction units count: 2704
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.wt.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wt(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
    }
}
