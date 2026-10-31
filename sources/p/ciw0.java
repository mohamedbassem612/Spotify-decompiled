package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.wrapped.v1.proto.RiveAnimation;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ciw0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public Object c;
    public Object d;
    public Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ciw0(k811 k811Var, Map map, ciw0 ciw0Var, ck01 ck01Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 10;
        this.d = k811Var;
        this.c = map;
        this.e = ciw0Var;
        this.f = ck01Var;
    }

    private final Object A(Object obj) {
        Object obj2;
        pcf1 pcf1Var = (pcf1) this.f;
        SceneTemplate.TopSongJourneyContent.Card2 card2 = (SceneTemplate.TopSongJourneyContent.Card2) this.e;
        ni31 ni31Var = (ni31) this.d;
        byte b = this.b;
        Serializable serializable = d9n.a;
        if (b != 0) {
            if (b == 1) {
                hm5.M(obj);
            } else {
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.c;
                hm5.M(obj);
            }
            return new mmr0(obj2, obj);
        }
        hm5.M(obj);
        RiveAnimation riveAnimationP = card2.p();
        ti31 ti31Var = pcf1Var.f;
        kj31 kj31Var = pcf1Var.g;
        this.d = ni31Var;
        this.b = (byte) 1;
        obj = mym.m(riveAnimationP, ti31Var, kj31Var, ni31Var, this);
        if (obj != serializable) {
        }
        return serializable;
        RiveAnimation riveAnimationP2 = card2.p();
        cxc cxcVar = pcf1Var.h;
        this.d = null;
        this.c = obj;
        this.b = (byte) 2;
        Serializable serializableN = mym.n(riveAnimationP2, cxcVar, ni31Var, this);
        if (serializableN != serializable) {
            Object obj3 = obj;
            obj = serializableN;
            obj2 = obj3;
            return new mmr0(obj2, obj);
        }
        return serializable;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fc A[PHI: r0 r1
      0x00fc: PHI (r0v9 p.p811) = (r0v5 p.p811), (r0v5 p.p811), (r0v11 p.p811) binds: [B:43:0x00db, B:48:0x00f8, B:11:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x00fc: PHI (r1v11 p.p811) = (r1v6 p.p811), (r1v6 p.p811), (r1v15 p.p811) binds: [B:43:0x00db, B:48:0x00f8, B:11:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0102  */
    /* JADX WARN: Code duplicated, block: B:55:0x011c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0121 A[PHI: r0
      0x0121: PHI (r0v12 p.p811) = (r0v9 p.p811), (r0v9 p.p811), (r0v16 p.p811) binds: [B:51:0x0100, B:56:0x011d, B:10:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0127  */
    /* JADX WARN: Code duplicated, block: B:63:0x0141  */
    /* JADX WARN: Code duplicated, block: B:67:0x0147  */
    /* JADX WARN: Code duplicated, block: B:69:0x014a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0168  */
    /* JADX WARN: Code duplicated, block: B:75:0x016c  */
    /* JADX WARN: Code duplicated, block: B:78:0x018b  */
    /* JADX WARN: Code duplicated, block: B:81:0x018f A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0142, code lost:
    
        if (r14 == r8) goto L80;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object e(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ciw0.e(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00d9 A[RETURN] */
    private final Object g(Object obj) {
        ck01 ck01Var = (ck01) this.f;
        byte b = this.b;
        d9n d9nVar = rih1.a;
        d9n d9nVar2 = d9n.a;
        try {
            if (b == 0) {
                hm5.M(obj);
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) ((k811) this.d).B().openConnection();
                httpsURLConnection.setRequestMethod("GET");
                httpsURLConnection.setRequestProperty("Accept", "application/json");
                for (Map.Entry entry : ((Map) this.c).entrySet()) {
                    httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                int responseCode = httpsURLConnection.getResponseCode();
                if (responseCode == 200) {
                    InputStream inputStream = httpsURLConnection.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                    }
                    bufferedReader.close();
                    inputStream.close();
                    JSONObject jSONObject = new JSONObject(sb.toString());
                    ciw0 ciw0Var = (ciw0) this.e;
                    this.b = (byte) 1;
                    if (ciw0Var.invoke(jSONObject, this) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    this.b = (byte) 2;
                    ck01Var.invoke("Bad response code: " + responseCode, this);
                    if (d9nVar == d9nVar2) {
                        return d9nVar2;
                    }
                }
            } else {
                if (b != 1 && b != 2 && b != 3) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = e.toString();
            }
            this.b = (byte) 3;
            ck01Var.invoke(message, this);
            if (d9nVar == d9nVar2) {
                return d9nVar2;
            }
        }
        return d9nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a6, code lost:
    
        if (r1 == r6) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object h(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ciw0.h(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r0.b(r7, r6) == r4) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object i(java.lang.Object r7) {
        /*
            r6 = this;
            byte r0 = r6.b
            r1 = 0
            r2 = 2
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L17
            if (r0 != r2) goto L11
            p.hm5.M(r7)
            goto L45
        L11:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r1
        L17:
            java.lang.Object r0 = r6.d
            p.ssw0 r0 = (p.ssw0) r0
            p.hm5.M(r7)
            goto L3a
        L1f:
            p.hm5.M(r7)
            java.lang.Object r7 = r6.c
            r0 = r7
            p.ssw0 r0 = (p.ssw0) r0
            java.lang.Object r7 = r6.e
            p.gqb0 r7 = (p.gqb0) r7
            java.lang.Object r5 = r6.f
            java.lang.String r5 = (java.lang.String) r5
            r6.d = r0
            r6.b = r3
            java.lang.Object r7 = r7.e(r5, r6)
            if (r7 != r4) goto L3a
            goto L44
        L3a:
            r6.d = r1
            r6.b = r2
            java.lang.Object r6 = r0.b(r7, r6)
            if (r6 != r4) goto L45
        L44:
            return r4
        L45:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ciw0.i(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        if (r1.emit(r4, r9) == r8) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
    
        if (r0.emit(p.uk31.a, r9) == r8) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object j(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.c
            p.vr20 r0 = (p.vr20) r0
            byte r1 = r9.b
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            p.d9n r8 = p.d9n.a
            if (r1 == 0) goto L3f
            if (r1 == r6) goto L3b
            if (r1 == r5) goto L37
            if (r1 == r4) goto L2f
            if (r1 == r3) goto L2b
            if (r1 != r2) goto L25
            java.lang.Object r9 = r9.d
            p.vr20 r9 = (p.vr20) r9
            java.lang.Exception r9 = (java.lang.Exception) r9
            p.hm5.M(r10)
            goto L95
        L25:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r7
        L2b:
            p.hm5.M(r10)     // Catch: java.lang.Exception -> L86
            goto L95
        L2f:
            java.lang.Object r1 = r9.d
            p.vr20 r1 = (p.vr20) r1
            p.hm5.M(r10)     // Catch: java.lang.Exception -> L86
            goto L72
        L37:
            p.hm5.M(r10)
            goto L5a
        L3b:
            p.hm5.M(r10)
            goto L4f
        L3f:
            p.hm5.M(r10)
            r9.c = r0
            r9.b = r6
            p.vk31 r10 = p.vk31.a
            java.lang.Object r10 = r0.emit(r10, r9)
            if (r10 != r8) goto L4f
            goto L94
        L4f:
            r9.c = r0
            r9.b = r5
            java.lang.Object r10 = p.xpn1.H(r9)
            if (r10 != r8) goto L5a
            goto L94
        L5a:
            java.lang.Object r10 = r9.e     // Catch: java.lang.Exception -> L86
            p.bl31 r10 = (p.bl31) r10     // Catch: java.lang.Exception -> L86
            p.va31 r10 = r10.a     // Catch: java.lang.Exception -> L86
            java.lang.Object r1 = r9.f     // Catch: java.lang.Exception -> L86
            com.spotify.wrapped.v1.proto.RiveAnimation r1 = (com.spotify.wrapped.v1.proto.RiveAnimation) r1     // Catch: java.lang.Exception -> L86
            r9.c = r0     // Catch: java.lang.Exception -> L86
            r9.d = r0     // Catch: java.lang.Exception -> L86
            r9.b = r4     // Catch: java.lang.Exception -> L86
            java.lang.Object r10 = r10.a(r1, r9)     // Catch: java.lang.Exception -> L86
            if (r10 != r8) goto L71
            goto L94
        L71:
            r1 = r0
        L72:
            p.qa31 r10 = (p.qa31) r10     // Catch: java.lang.Exception -> L86
            p.xk31 r4 = new p.xk31     // Catch: java.lang.Exception -> L86
            r4.<init>(r10)     // Catch: java.lang.Exception -> L86
            r9.c = r0     // Catch: java.lang.Exception -> L86
            r9.d = r7     // Catch: java.lang.Exception -> L86
            r9.b = r3     // Catch: java.lang.Exception -> L86
            java.lang.Object r9 = r1.emit(r4, r9)     // Catch: java.lang.Exception -> L86
            if (r9 != r8) goto L95
            goto L94
        L86:
            r9.c = r7
            r9.d = r7
            r9.b = r2
            p.uk31 r10 = p.uk31.a
            java.lang.Object r9 = r0.emit(r10, r9)
            if (r9 != r8) goto L95
        L94:
            return r8
        L95:
            p.rih1 r9 = p.rih1.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ciw0.j(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        if (r1.emit(r4, r9) == r8) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
    
        if (r0.emit(p.hl31.a, r9) == r8) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.c
            p.vr20 r0 = (p.vr20) r0
            byte r1 = r9.b
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            p.d9n r8 = p.d9n.a
            if (r1 == 0) goto L3f
            if (r1 == r6) goto L3b
            if (r1 == r5) goto L37
            if (r1 == r4) goto L2f
            if (r1 == r3) goto L2b
            if (r1 != r2) goto L25
            java.lang.Object r9 = r9.d
            p.vr20 r9 = (p.vr20) r9
            java.lang.Exception r9 = (java.lang.Exception) r9
            p.hm5.M(r10)
            goto L95
        L25:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r7
        L2b:
            p.hm5.M(r10)     // Catch: java.lang.Exception -> L86
            goto L95
        L2f:
            java.lang.Object r1 = r9.d
            p.vr20 r1 = (p.vr20) r1
            p.hm5.M(r10)     // Catch: java.lang.Exception -> L86
            goto L72
        L37:
            p.hm5.M(r10)
            goto L5a
        L3b:
            p.hm5.M(r10)
            goto L4f
        L3f:
            p.hm5.M(r10)
            r9.c = r0
            r9.b = r6
            p.il31 r10 = p.il31.a
            java.lang.Object r10 = r0.emit(r10, r9)
            if (r10 != r8) goto L4f
            goto L94
        L4f:
            r9.c = r0
            r9.b = r5
            java.lang.Object r10 = p.xpn1.H(r9)
            if (r10 != r8) goto L5a
            goto L94
        L5a:
            java.lang.Object r10 = r9.e     // Catch: java.lang.Exception -> L86
            p.ol31 r10 = (p.ol31) r10     // Catch: java.lang.Exception -> L86
            p.va31 r10 = r10.a     // Catch: java.lang.Exception -> L86
            java.lang.Object r1 = r9.f     // Catch: java.lang.Exception -> L86
            com.spotify.wrapped.v1.proto.RiveAnimation r1 = (com.spotify.wrapped.v1.proto.RiveAnimation) r1     // Catch: java.lang.Exception -> L86
            r9.c = r0     // Catch: java.lang.Exception -> L86
            r9.d = r0     // Catch: java.lang.Exception -> L86
            r9.b = r4     // Catch: java.lang.Exception -> L86
            java.lang.Object r10 = r10.a(r1, r9)     // Catch: java.lang.Exception -> L86
            if (r10 != r8) goto L71
            goto L94
        L71:
            r1 = r0
        L72:
            p.qa31 r10 = (p.qa31) r10     // Catch: java.lang.Exception -> L86
            p.kl31 r4 = new p.kl31     // Catch: java.lang.Exception -> L86
            r4.<init>(r10)     // Catch: java.lang.Exception -> L86
            r9.c = r0     // Catch: java.lang.Exception -> L86
            r9.d = r7     // Catch: java.lang.Exception -> L86
            r9.b = r3     // Catch: java.lang.Exception -> L86
            java.lang.Object r9 = r1.emit(r4, r9)     // Catch: java.lang.Exception -> L86
            if (r9 != r8) goto L95
            goto L94
        L86:
            r9.c = r7
            r9.d = r7
            r9.b = r2
            p.hl31 r10 = p.hl31.a
            java.lang.Object r9 = r0.emit(r10, r9)
            if (r9 != r8) goto L95
        L94:
            return r8
        L95:
            p.rih1 r9 = p.rih1.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ciw0.m(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
    
        if (r1.emit(r2, r8) == r6) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object o(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.d
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r8.c
            p.vr20 r1 = (p.vr20) r1
            byte r2 = r8.b
            r3 = 2
            r4 = 1
            r5 = 0
            p.d9n r6 = p.d9n.a
            if (r2 == 0) goto L25
            if (r2 == r4) goto L1f
            if (r2 != r3) goto L19
            p.hm5.M(r9)
            goto L77
        L19:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r5
        L1f:
            p.hm5.M(r9)     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L7a
            goto L41
        L23:
            r9 = move-exception
            goto L4e
        L25:
            p.hm5.M(r9)
            java.lang.Object r9 = r8.e
            p.vw51 r9 = (p.vw51) r9
            java.lang.Object r2 = r8.f
            java.lang.String r2 = (java.lang.String) r2
            p.xrc0 r9 = r9.a     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L7a
            com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy r7 = p.vw51.i     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L7a
            r8.c = r1     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L7a
            r8.b = r4     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L7a
            p.rsc0 r9 = (p.rsc0) r9     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L7a
            java.lang.Object r9 = r9.h(r2, r0, r7, r8)     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L7a
            if (r9 != r6) goto L41
            goto L76
        L41:
            p.py21 r9 = (p.py21) r9     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L7a
            if (r9 == 0) goto L4c
            java.lang.Object r9 = r9.c()     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L7a
            p.zuc0 r9 = (p.zuc0) r9     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L7a
            goto L54
        L4c:
            r9 = r5
            goto L54
        L4e:
            p.m231 r2 = new p.m231
            r2.<init>(r9)
            r9 = r2
        L54:
            java.lang.Throwable r2 = p.e331.a(r9)
            if (r2 != 0) goto L5b
            goto L65
        L5b:
            java.lang.String r9 = "Failed to resolve selected row %s"
            java.lang.Object[] r4 = new java.lang.Object[]{r0}
            com.spotify.base.java.logging.Logger.e(r2, r9, r4)
            r9 = r5
        L65:
            p.zuc0 r9 = (p.zuc0) r9
            p.mmr0 r2 = new p.mmr0
            r2.<init>(r0, r9)
            r8.c = r5
            r8.b = r3
            java.lang.Object r8 = r1.emit(r2, r8)
            if (r8 != r6) goto L77
        L76:
            return r6
        L77:
            p.rih1 r8 = p.rih1.a
            return r8
        L7a:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ciw0.o(java.lang.Object):java.lang.Object");
    }

    private final Object p(Object obj) throws Throwable {
        rg61 rg61Var;
        Throwable th;
        rg61 rg61Var2;
        vu30 vu30Var;
        AtomicReference atomicReference = (AtomicReference) this.e;
        byte b = this.b;
        d9n d9nVar = d9n.a;
        try {
            try {
                if (b == 0) {
                    hm5.M(obj);
                    c9n c9nVar = (c9n) this.c;
                    rg61Var = new rg61(op71.z(c9nVar.J()), ((iu30) this.d).invoke(c9nVar));
                    rg61 rg61Var3 = (rg61) atomicReference.getAndSet(rg61Var);
                    if (rg61Var3 != null) {
                        faa0 faa0Var = rg61Var3.a;
                        this.c = rg61Var;
                        this.b = (byte) 1;
                        if (op71.p(faa0Var, this) != d9nVar) {
                        }
                    }
                    return d9nVar;
                }
                if (b != 1) {
                    if (b != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rg61Var2 = (rg61) this.c;
                    try {
                        hm5.M(obj);
                        while (!atomicReference.compareAndSet(rg61Var2, null) && atomicReference.get() == rg61Var2) {
                        }
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        while (!atomicReference.compareAndSet(rg61Var2, null) && atomicReference.get() == rg61Var2) {
                        }
                        throw th;
                    }
                }
                rg61Var = (rg61) this.c;
                hm5.M(obj);
                Object obj2 = rg61Var.b;
                this.c = rg61Var;
                this.b = (byte) 2;
                obj = vu30Var.invoke(obj2, this);
                if (obj != d9nVar) {
                    rg61Var2 = rg61Var;
                    while (!atomicReference.compareAndSet(rg61Var2, null)) {
                    }
                    return obj;
                }
                return d9nVar;
            } catch (Throwable th3) {
                th = th3;
                rg61Var2 = rg61Var;
                while (!atomicReference.compareAndSet(rg61Var2, null)) {
                }
                throw th;
            }
            vu30Var = (vu30) this.f;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r0.emit(r7, r6) == r5) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object r(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.c
            p.vr20 r0 = (p.vr20) r0
            byte r1 = r6.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L23
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L15
            p.hm5.M(r7)
            goto L4d
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L1b:
            java.lang.Object r0 = r6.d
            p.vr20 r0 = (p.vr20) r0
            p.hm5.M(r7)
            goto L40
        L23:
            p.hm5.M(r7)
            java.lang.Object r7 = r6.e
            p.o671 r7 = (p.o671) r7
            p.f771 r7 = r7.f
            java.lang.Object r1 = r6.f
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            r6.c = r4
            r6.d = r0
            r6.b = r3
            java.lang.Object r7 = r7.a(r1, r6)
            if (r7 != r5) goto L40
            goto L4c
        L40:
            r6.c = r4
            r6.d = r4
            r6.b = r2
            java.lang.Object r6 = r0.emit(r7, r6)
            if (r6 != r5) goto L4d
        L4c:
            return r5
        L4d:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ciw0.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r1.emit(r8, r7) == r6) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object s(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f
            p.ec71 r0 = (p.ec71) r0
            java.lang.Object r1 = r7.c
            p.vr20 r1 = (p.vr20) r1
            byte r2 = r7.b
            r3 = 2
            r4 = 1
            r5 = 0
            p.d9n r6 = p.d9n.a
            if (r2 == 0) goto L27
            if (r2 == r4) goto L1f
            if (r2 != r3) goto L19
            p.hm5.M(r8)
            goto L63
        L19:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r5
        L1f:
            java.lang.Object r1 = r7.d
            p.vr20 r1 = (p.vr20) r1
            p.hm5.M(r8)
            goto L43
        L27:
            p.hm5.M(r8)
            java.lang.Object r8 = r7.e
            p.yxb0 r8 = (p.yxb0) r8
            java.lang.Object r8 = r8.d
            p.lc71 r8 = (p.lc71) r8
            java.util.List r2 = java.util.Collections.singletonList(r0)
            r7.c = r5
            r7.d = r1
            r7.b = r4
            java.lang.Object r8 = r8.a(r2, r7)
            if (r8 != r6) goto L43
            goto L62
        L43:
            java.util.Map r8 = (java.util.Map) r8
            java.lang.Object r8 = r8.get(r0)
            p.bc71 r8 = (p.bc71) r8
            if (r8 == 0) goto L54
            p.zb71 r8 = p.wro1.L(r8)
            if (r8 == 0) goto L54
            goto L56
        L54:
            p.jb71 r8 = p.jb71.a
        L56:
            r7.c = r5
            r7.d = r5
            r7.b = r3
            java.lang.Object r7 = r1.emit(r8, r7)
            if (r7 != r6) goto L63
        L62:
            return r6
        L63:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ciw0.s(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006c, code lost:
    
        if (r0.emit(r1, r7) == r5) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object t(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.c
            p.vr20 r0 = (p.vr20) r0
            byte r1 = r7.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L2a
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L15
            p.hm5.M(r8)
            goto L6f
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r4
        L1b:
            java.lang.Object r0 = r7.e
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r7.d
            p.vr20 r1 = (p.vr20) r1
            p.hm5.M(r8)
            r6 = r1
            r1 = r0
            r0 = r6
            goto L4d
        L2a:
            p.hm5.M(r8)
            java.lang.Object r8 = r7.f
            p.m591 r8 = (p.m591) r8
            r7.c = r4
            r7.d = r0
            java.lang.String r1 = "skip_finished_episodes"
            r7.e = r1
            r7.b = r3
            boolean r3 = r8.a
            if (r3 == 0) goto L48
            p.eqs r3 = r8.b
            java.lang.String r8 = r8.c
            java.io.Serializable r8 = r3.a(r8, r7)
            goto L4a
        L48:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
        L4a:
            if (r8 != r5) goto L4d
            goto L6e
        L4d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.util.Map r8 = java.util.Collections.singletonMap(r1, r8)
            p.ovn r1 = new p.ovn
            r1.<init>(r8)
            r7.c = r4
            r7.d = r4
            r7.e = r4
            r7.b = r2
            java.lang.Object r7 = r0.emit(r1, r7)
            if (r7 != r5) goto L6f
        L6e:
            return r5
        L6f:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ciw0.t(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r9.a(r1, r8) == r7) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
    
        if (r9 == r7) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        return r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [byte] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.spotify.ads.esperanto.proto.CreateSlotRequest, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object u(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f
            p.be91 r0 = (p.be91) r0
            java.lang.Object r1 = r8.e
            p.jx0 r1 = (p.jx0) r1
            java.lang.Object r2 = r8.c
            p.c9n r2 = (p.c9n) r2
            byte r3 = r8.b
            r4 = 0
            r5 = 2
            r6 = 1
            p.d9n r7 = p.d9n.a
            if (r3 == 0) goto L2d
            if (r3 == r6) goto L23
            if (r3 != r5) goto L1d
            p.hm5.M(r9)
            goto L78
        L1d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r4
        L23:
            java.lang.Object r3 = r8.d
            com.spotify.ads.esperanto.proto.CreateSlotRequest r3 = (com.spotify.ads.esperanto.proto.CreateSlotRequest) r3
            p.hm5.M(r9)     // Catch: java.lang.Exception -> L2b
            goto L66
        L2b:
            r9 = move-exception
            goto L4f
        L2d:
            p.hm5.M(r9)
            p.orn r9 = com.spotify.ads.esperanto.proto.CreateSlotRequest.n()
            java.lang.String r3 = r1.a
            r9.n(r3)
            com.google.protobuf.h r9 = r9.build()
            r3 = r9
            com.spotify.ads.esperanto.proto.CreateSlotRequest r3 = (com.spotify.ads.esperanto.proto.CreateSlotRequest) r3
            p.by0 r9 = r0.c     // Catch: java.lang.Exception -> L2b
            r8.c = r2     // Catch: java.lang.Exception -> L2b
            r8.d = r3     // Catch: java.lang.Exception -> L2b
            r8.b = r6     // Catch: java.lang.Exception -> L2b
            java.lang.Object r9 = r9.a(r1, r8)     // Catch: java.lang.Exception -> L2b
            if (r9 != r7) goto L66
            goto L77
        L4f:
            p.smo1.t(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "Preregistration task failed for "
            r2.<init>(r6)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.spotify.base.java.logging.Logger.l(r9, r1, r2)
        L66:
            p.pf91 r9 = r0.a
            r3.getClass()
            r8.c = r4
            r8.d = r4
            r8.b = r5
            java.lang.Object r9 = r9.c(r3, r8)
            if (r9 != r7) goto L78
        L77:
            return r7
        L78:
            com.spotify.ads.esperanto.proto.CreateSlotResponse r9 = (com.spotify.ads.esperanto.proto.CreateSlotResponse) r9
            boolean r8 = r9.p()
            if (r8 == 0) goto L8a
            p.rc91 r8 = new p.rc91
            java.lang.String r9 = r9.o()
            r8.<init>(r9)
            goto L8c
        L8a:
            p.sc91 r8 = p.sc91.a
        L8c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ciw0.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0094, code lost:
    
        if (r0.emit(r11, r10) == r5) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object v(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.c
            p.vr20 r0 = (p.vr20) r0
            byte r1 = r10.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L16
            p.hm5.M(r11)
            goto L97
        L16:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            return r4
        L1c:
            java.lang.Object r0 = r10.d
            p.vr20 r0 = (p.vr20) r0
            p.hm5.M(r11)
            goto L8a
        L24:
            p.hm5.M(r11)
            java.lang.Object r11 = r10.e
            p.h7a1 r11 = (p.h7a1) r11
            p.vb81 r11 = r11.a
            java.util.ArrayList r11 = r11.d
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r11 = r11.iterator()
        L38:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L77
            java.lang.Object r6 = r11.next()
            p.bc81 r6 = (p.bc81) r6
            java.lang.String r7 = r6.c
            java.util.List r7 = java.util.Collections.singletonList(r7)
            java.util.Collection r7 = (java.util.Collection) r7
            java.util.ArrayList r6 = r6.d
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = p.q7h.U(r6, r9)
            r8.<init>(r9)
            java.util.Iterator r6 = r6.iterator()
        L5d:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L6f
            java.lang.Object r9 = r6.next()
            p.cc81 r9 = (p.cc81) r9
            java.lang.String r9 = r9.c
            r8.add(r9)
            goto L5d
        L6f:
            java.util.ArrayList r6 = p.o7h.N0(r8, r7)
            p.r7h.W(r6, r1)
            goto L38
        L77:
            java.lang.Object r11 = r10.f
            p.j7a1 r11 = (p.j7a1) r11
            p.jo8 r11 = r11.a
            r10.c = r4
            r10.d = r0
            r10.b = r3
            java.io.Serializable r11 = r11.c(r1, r10)
            if (r11 != r5) goto L8a
            goto L96
        L8a:
            r10.c = r4
            r10.d = r4
            r10.b = r2
            java.lang.Object r10 = r0.emit(r11, r10)
            if (r10 != r5) goto L97
        L96:
            return r5
        L97:
            p.rih1 r10 = p.rih1.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ciw0.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0070 A[PHI: r1 r12
      0x0070: PHI (r1v2 p.vr20) = (r1v1 p.vr20), (r1v4 p.vr20) binds: [B:23:0x006d, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x0070: PHI (r12v10 java.lang.Object) = (r12v9 java.lang.Object), (r12v0 java.lang.Object) binds: [B:23:0x006d, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        if (r1.emit(r12, r11) == r8) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object w(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.e
            p.dda1 r0 = (p.dda1) r0
            java.lang.Object r1 = r11.c
            p.vr20 r1 = (p.vr20) r1
            byte r2 = r11.b
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            p.d9n r8 = p.d9n.a
            if (r2 == 0) goto L36
            if (r2 == r6) goto L32
            if (r2 == r5) goto L2e
            if (r2 == r4) goto L25
            if (r2 != r3) goto L1f
            p.hm5.M(r12)
            goto L7d
        L1f:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r11)
            return r7
        L25:
            java.lang.Object r0 = r11.d
            r1 = r0
            p.vr20 r1 = (p.vr20) r1
            p.hm5.M(r12)
            goto L70
        L2e:
            p.hm5.M(r12)
            goto L5d
        L32:
            p.hm5.M(r12)
            goto L46
        L36:
            p.hm5.M(r12)
            long r9 = p.dda1.f
            r11.c = r1
            r11.b = r6
            java.lang.Object r12 = p.hap1.j(r9, r11)
            if (r12 != r8) goto L46
            goto L7c
        L46:
            p.bpb1 r12 = r0.c
            java.lang.Object r12 = r12.getValue()
            boolean r12 = r12 instanceof p.uca1
            if (r12 != 0) goto L5d
            r11.c = r1
            r11.b = r5
            p.vca1 r12 = p.vca1.a
            java.lang.Object r12 = r1.emit(r12, r11)
            if (r12 != r8) goto L5d
            goto L7c
        L5d:
            java.lang.Object r12 = r11.f
            java.lang.String r12 = (java.lang.String) r12
            r11.c = r7
            r11.d = r1
            r11.b = r4
            java.util.Set r2 = p.dda1.e
            java.lang.Object r12 = r0.a(r12, r11)
            if (r12 != r8) goto L70
            goto L7c
        L70:
            r11.c = r7
            r11.d = r7
            r11.b = r3
            java.lang.Object r11 = r1.emit(r12, r11)
            if (r11 != r8) goto L7d
        L7c:
            return r8
        L7d:
            p.rih1 r11 = p.rih1.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ciw0.w(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0066  */
    /* JADX WARN: Code duplicated, block: B:26:0x0067 A[Catch: RuntimeException -> 0x002a, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x002a, blocks: (B:11:0x0026, B:26:0x0067, B:23:0x0056), top: B:34:0x0011 }] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008d, code lost:
    
        if (r1.emit(r0, r11) == r8) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object x(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.d
            p.y6c1 r0 = (p.y6c1) r0
            java.lang.Object r1 = r11.c
            p.vr20 r1 = (p.vr20) r1
            byte r2 = r11.b
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            p.d9n r8 = p.d9n.a
            if (r2 == 0) goto L34
            if (r2 == r7) goto L30
            if (r2 == r6) goto L2c
            if (r2 == r5) goto L26
            if (r2 != r4) goto L20
            p.hm5.M(r12)
            goto L90
        L20:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r11)
            return r3
        L26:
            p.hm5.M(r12)     // Catch: java.lang.RuntimeException -> L2a
            goto L67
        L2a:
            r12 = move-exception
            goto L6a
        L2c:
            p.hm5.M(r12)
            goto L56
        L30:
            p.hm5.M(r12)
            goto L49
        L34:
            p.hm5.M(r12)
            p.g7c1 r12 = new p.g7c1
            p.z7c1 r2 = p.z7c1.a
            r12.<init>(r2)
            r11.c = r1
            r11.b = r7
            java.lang.Object r12 = r1.emit(r12, r11)
            if (r12 != r8) goto L49
            goto L8f
        L49:
            long r9 = r0.d
            r11.c = r1
            r11.b = r6
            java.lang.Object r12 = p.hap1.i(r9, r11)
            if (r12 != r8) goto L56
            goto L8f
        L56:
            java.lang.Object r12 = r11.e     // Catch: java.lang.RuntimeException -> L2a
            p.w4c1 r12 = (p.w4c1) r12     // Catch: java.lang.RuntimeException -> L2a
            int r2 = r0.c     // Catch: java.lang.RuntimeException -> L2a
            r11.c = r1     // Catch: java.lang.RuntimeException -> L2a
            r11.b = r5     // Catch: java.lang.RuntimeException -> L2a
            java.lang.Object r12 = r12.b(r2, r11)     // Catch: java.lang.RuntimeException -> L2a
            if (r12 != r8) goto L67
            goto L8f
        L67:
            p.a8c1 r12 = p.a8c1.a     // Catch: java.lang.RuntimeException -> L2a
            goto L80
        L6a:
            int r0 = r0.c
            java.lang.Object r2 = r11.f
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r5 = "Error loading story "
            java.lang.String r6 = " for feature "
            java.lang.String r0 = p.ab80.n(r5, r6, r0, r2)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.spotify.base.java.logging.Logger.e(r12, r0, r2)
            p.x7c1 r12 = p.x7c1.a
        L80:
            p.g7c1 r0 = new p.g7c1
            r0.<init>(r12)
            r11.c = r3
            r11.b = r4
            java.lang.Object r11 = r1.emit(r0, r11)
            if (r11 != r8) goto L90
        L8f:
            return r8
        L90:
            p.rih1 r11 = p.rih1.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ciw0.x(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0086  */
    /* JADX WARN: Code duplicated, block: B:24:0x008f  */
    /* JADX WARN: Code duplicated, block: B:27:0x009e  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:37:0x00be  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cc  */
    private final Object y(Object obj) {
        Object objA;
        String str;
        String str2;
        llg llgVar;
        Object objN;
        Object obj2;
        String str3;
        c3e1 c3e1Var;
        c3e1 c3e1Var2;
        String str4;
        g2e1 g2e1Var = (g2e1) this.f;
        i2e1 i2e1Var = (i2e1) this.e;
        il71 il71Var = (il71) this.c;
        byte b = this.b;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            il71Var.setAttribute("entity_uri", i2e1Var.d.a.a.a);
            if (i2e1Var.d.b.d) {
                oud oudVar = g2e1Var.d;
                gud gudVar = new gud(new rn71(rc11.a.b(x7i0.class)));
                this.c = il71Var;
                this.b = (byte) 1;
                if (oudVar.a(gudVar, this) != d9nVar) {
                }
            }
            return d9nVar;
        }
        if (b == 1) {
            hm5.M(obj);
        } else {
            if (b == 2) {
                hm5.M(obj);
                objA = obj;
                str = (String) objA;
                if (str != null) {
                    il71Var.setAttribute("result", "failure");
                    return s2e1.a;
                }
                il71Var.setAttribute("result", "success");
                str2 = i2e1Var.g;
                if (str2 != null) {
                    dc31 dc31Var = g2e1Var.g;
                    this.c = null;
                    this.d = str;
                    this.b = (byte) 3;
                    objN = dc31Var.n(str2, this);
                    if (objN != d9nVar) {
                        obj2 = objN;
                        str3 = str;
                    }
                    return d9nVar;
                }
                llgVar = null;
                xid xidVar = g2e1Var.h;
                long j = i2e1Var.e;
                c3e1Var = i2e1Var.d.b.b;
                if (c3e1Var instanceof c3e1) {
                    c3e1Var2 = c3e1Var;
                } else {
                    c3e1Var2 = null;
                }
                str4 = c3e1Var2 != null ? c3e1Var2.X : null;
                if (str4 == null) {
                    str4 = "";
                }
                return new t2e1(str, llgVar, xidVar.n(llgVar, j, false, str4));
            }
            if (b != 3) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str3 = (String) this.d;
            hm5.M(obj);
            obj2 = obj;
        }
        str = str3;
        llgVar = (llg) obj2;
        xid xidVar2 = g2e1Var.h;
        long j2 = i2e1Var.e;
        c3e1Var = i2e1Var.d.b.b;
        if (c3e1Var instanceof c3e1) {
            c3e1Var2 = c3e1Var;
        } else {
            c3e1Var2 = null;
        }
        if (c3e1Var2 != null) {
        }
        if (str4 == null) {
            str4 = "";
        }
        return new t2e1(str, llgVar, xidVar2.n(llgVar, j2, false, str4));
        pec1 pec1Var = new pec1(i2e1Var, g2e1Var, (lnm) null, (byte) 12);
        this.c = il71Var;
        this.b = (byte) 2;
        objA = il71Var.a("fetching_transcript", pec1Var, this);
        if (objA != d9nVar) {
            str = (String) objA;
            if (str != null) {
                il71Var.setAttribute("result", "failure");
                return s2e1.a;
            }
            il71Var.setAttribute("result", "success");
            str2 = i2e1Var.g;
            if (str2 != null) {
                dc31 dc31Var2 = g2e1Var.g;
                this.c = null;
                this.d = str;
                this.b = (byte) 3;
                objN = dc31Var2.n(str2, this);
                if (objN != d9nVar) {
                    obj2 = objN;
                    str3 = str;
                    str = str3;
                    llgVar = (llg) obj2;
                }
            } else {
                llgVar = null;
            }
            xid xidVar3 = g2e1Var.h;
            long j3 = i2e1Var.e;
            c3e1Var = i2e1Var.d.b.b;
            if (c3e1Var instanceof c3e1) {
                c3e1Var2 = c3e1Var;
            } else {
                c3e1Var2 = null;
            }
            if (c3e1Var2 != null) {
            }
            if (str4 == null) {
                str4 = "";
            }
            return new t2e1(str, llgVar, xidVar3.n(llgVar, j3, false, str4));
        }
        return d9nVar;
    }

    private final Object z(Object obj) {
        Object obj2;
        ebf1 ebf1Var = (ebf1) this.f;
        SceneTemplate.TopGenreContent.Card2 card2 = (SceneTemplate.TopGenreContent.Card2) this.e;
        ni31 ni31Var = (ni31) this.d;
        byte b = this.b;
        Serializable serializable = d9n.a;
        if (b != 0) {
            if (b == 1) {
                hm5.M(obj);
            } else {
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.c;
                hm5.M(obj);
            }
            return new mmr0(obj2, obj);
        }
        hm5.M(obj);
        RiveAnimation riveAnimationN = card2.n();
        ti31 ti31Var = ebf1Var.a;
        kj31 kj31Var = ebf1Var.b;
        this.d = ni31Var;
        this.b = (byte) 1;
        obj = mym.m(riveAnimationN, ti31Var, kj31Var, ni31Var, this);
        if (obj != serializable) {
        }
        return serializable;
        RiveAnimation riveAnimationN2 = card2.n();
        cxc cxcVar = ebf1Var.e;
        this.d = null;
        this.c = obj;
        this.b = (byte) 2;
        Serializable serializableN = mym.n(riveAnimationN2, cxcVar, ni31Var, this);
        if (serializableN != serializable) {
            Object obj3 = obj;
            obj = serializableN;
            obj2 = obj3;
            return new mmr0(obj2, obj);
        }
        return serializable;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.f;
        switch (b) {
            case 0:
                ciw0 ciw0Var = new ciw0((phi0) this.e, (dew) obj2, lnmVar, (byte) 0);
                ciw0Var.c = obj;
                return ciw0Var;
            case 1:
                ciw0 ciw0Var2 = new ciw0((r7y0) obj2, lnmVar, (byte) 1);
                ciw0Var2.c = obj;
                return ciw0Var2;
            case 2:
                ciw0 ciw0Var3 = new ciw0((h001) this.e, (String) obj2, lnmVar, (byte) 2);
                ciw0Var3.c = obj;
                return ciw0Var3;
            case 3:
                ciw0 ciw0Var4 = new ciw0((dxy) this.e, (ga01) obj2, lnmVar, (byte) 3);
                ciw0Var4.c = obj;
                return ciw0Var4;
            case 4:
                ciw0 ciw0Var5 = new ciw0((ui01) obj2, lnmVar, (byte) 4);
                ciw0Var5.c = obj;
                return ciw0Var5;
            case 5:
                ciw0 ciw0Var6 = new ciw0(this.d, this.e, obj2, lnmVar, (byte) 5);
                ciw0Var6.c = obj;
                return ciw0Var6;
            case 6:
                ciw0 ciw0Var7 = new ciw0((wt20) this.e, (mr20) obj2, lnmVar, (byte) 6);
                ciw0Var7.c = obj;
                return ciw0Var7;
            case 7:
                ciw0 ciw0Var8 = new ciw0(this.d, this.e, obj2, lnmVar, (byte) 7);
                ciw0Var8.c = obj;
                return ciw0Var8;
            case 8:
                ciw0 ciw0Var9 = new ciw0((SceneTemplate.RelationshipStatusContent.Card2) this.e, (se8) obj2, lnmVar, (byte) 8);
                ciw0Var9.d = obj;
                return ciw0Var9;
            case 9:
                ciw0 ciw0Var10 = new ciw0((y321) obj2, lnmVar, (byte) 9);
                ciw0Var10.c = obj;
                return ciw0Var10;
            case 10:
                return new ciw0((k811) this.d, (Map) this.c, (ciw0) this.e, (ck01) obj2, lnmVar);
            case 11:
                return new ciw0((byp0) this.c, (String) this.e, (xrc0) obj2, false, lnmVar, (byte) 11);
            case 12:
                return new ciw0((xgn0) this.e, (vu30) obj2, lnmVar, (byte) 12);
            case 13:
                return new ciw0((k811) this.e, (gs21) obj2, lnmVar, (byte) 13);
            case 14:
                return new ciw0((ssw0) this.c, (gqb0) this.e, (String) obj2, false, lnmVar, (byte) 14);
            case 15:
                ciw0 ciw0Var11 = new ciw0((bl31) this.e, (RiveAnimation) obj2, lnmVar, (byte) 15);
                ciw0Var11.c = obj;
                return ciw0Var11;
            case 16:
                ciw0 ciw0Var12 = new ciw0((ol31) this.e, (RiveAnimation) obj2, lnmVar, (byte) 16);
                ciw0Var12.c = obj;
                return ciw0Var12;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ciw0 ciw0Var13 = new ciw0(this.d, this.e, obj2, lnmVar, (byte) 17);
                ciw0Var13.c = obj;
                return ciw0Var13;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ciw0 ciw0Var14 = new ciw0(this.d, this.e, obj2, lnmVar, (byte) 18);
                ciw0Var14.c = obj;
                return ciw0Var14;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ciw0 ciw0Var15 = new ciw0((o671) this.e, (String) obj2, lnmVar, (byte) 19);
                ciw0Var15.c = obj;
                return ciw0Var15;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ciw0 ciw0Var16 = new ciw0((yxb0) this.e, (ec71) obj2, lnmVar, (byte) 20);
                ciw0Var16.c = obj;
                return ciw0Var16;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ciw0 ciw0Var17 = new ciw0((m591) obj2, lnmVar, (byte) 21);
                ciw0Var17.c = obj;
                return ciw0Var17;
            case 22:
                ciw0 ciw0Var18 = new ciw0((jx0) this.e, (be91) obj2, lnmVar, (byte) 22);
                ciw0Var18.c = obj;
                return ciw0Var18;
            case 23:
                ciw0 ciw0Var19 = new ciw0((h7a1) this.e, (j7a1) obj2, lnmVar, (byte) 23);
                ciw0Var19.c = obj;
                return ciw0Var19;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ciw0 ciw0Var20 = new ciw0((dda1) this.e, (String) obj2, lnmVar, (byte) 24);
                ciw0Var20.c = obj;
                return ciw0Var20;
            case 25:
                ciw0 ciw0Var21 = new ciw0(this.d, this.e, obj2, lnmVar, (byte) 25);
                ciw0Var21.c = obj;
                return ciw0Var21;
            case 26:
                ciw0 ciw0Var22 = new ciw0((i2e1) this.e, (g2e1) obj2, lnmVar, (byte) 26);
                ciw0Var22.c = obj;
                return ciw0Var22;
            case 27:
                ciw0 ciw0Var23 = new ciw0((SceneTemplate.TopGenreContent.Card2) this.e, (ebf1) obj2, lnmVar, (byte) 27);
                ciw0Var23.d = obj;
                return ciw0Var23;
            case 28:
                ciw0 ciw0Var24 = new ciw0((SceneTemplate.TopSongJourneyContent.Card2) this.e, (pcf1) obj2, lnmVar, (byte) 28);
                ciw0Var24.d = obj;
                return ciw0Var24;
            default:
                ciw0 ciw0Var25 = new ciw0((SceneTemplate.TopSongJourneyContent.Card3) this.e, (xcf1) obj2, lnmVar, (byte) 29);
                ciw0Var25.d = obj;
                return ciw0Var25;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((ni31) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((JSONObject) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((il71) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((ni31) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((ni31) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((ni31) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01d1 A[LOOP:0: B:105:0x01cb->B:107:0x01d1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:236:0x054c A[Catch: all -> 0x04d3, TryCatch #0 {all -> 0x04d3, blocks: (B:216:0x04cc, B:234:0x0546, B:236:0x054c, B:238:0x0558, B:240:0x055c, B:244:0x0563, B:245:0x0568), top: B:437:0x04cc }] */
    /* JADX WARN: Code duplicated, block: B:238:0x0558 A[Catch: all -> 0x04d3, TryCatch #0 {all -> 0x04d3, blocks: (B:216:0x04cc, B:234:0x0546, B:236:0x054c, B:238:0x0558, B:240:0x055c, B:244:0x0563, B:245:0x0568), top: B:437:0x04cc }] */
    /* JADX WARN: Code duplicated, block: B:240:0x055c A[Catch: all -> 0x04d3, TRY_LEAVE, TryCatch #0 {all -> 0x04d3, blocks: (B:216:0x04cc, B:234:0x0546, B:236:0x054c, B:238:0x0558, B:240:0x055c, B:244:0x0563, B:245:0x0568), top: B:437:0x04cc }] */
    /* JADX WARN: Code duplicated, block: B:244:0x0563 A[Catch: all -> 0x04d3, TRY_ENTER, TryCatch #0 {all -> 0x04d3, blocks: (B:216:0x04cc, B:234:0x0546, B:236:0x054c, B:238:0x0558, B:240:0x055c, B:244:0x0563, B:245:0x0568), top: B:437:0x04cc }] */
    /* JADX WARN: Code duplicated, block: B:289:0x063e A[PHI: r0 r7
      0x063e: PHI (r0v55 java.lang.Object) = (r0v54 java.lang.Object), (r0v72 java.lang.Object) binds: [B:287:0x063a, B:281:0x0607] A[DONT_GENERATE, DONT_INLINE]
      0x063e: PHI (r7v16 p.zlj0) = (r7v14 p.zlj0), (r7v20 p.zlj0) binds: [B:287:0x063a, B:281:0x0607] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:291:0x0646  */
    /* JADX WARN: Code duplicated, block: B:294:0x066d  */
    /* JADX WARN: Code duplicated, block: B:296:0x0671  */
    /* JADX WARN: Code duplicated, block: B:299:0x0696  */
    /* JADX WARN: Code duplicated, block: B:301:0x069a  */
    /* JADX WARN: Code duplicated, block: B:306:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:348:0x079e  */
    /* JADX WARN: Code duplicated, block: B:350:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:378:0x082b  */
    /* JADX WARN: Code duplicated, block: B:381:0x0841  */
    /* JADX WARN: Code duplicated, block: B:384:0x085c  */
    /* JADX WARN: Code duplicated, block: B:387:0x0873  */
    /* JADX WARN: Code duplicated, block: B:388:0x0875 A[Catch: all -> 0x07d6, CancellationException -> 0x0919, PHI: r2
      0x0875: PHI (r2v5 java.lang.Object) = (r2v4 java.lang.Object), (r2v14 java.lang.Object) binds: [B:386:0x0871, B:364:0x07eb] A[DONT_GENERATE, DONT_INLINE], TryCatch #9 {CancellationException -> 0x0919, all -> 0x07d6, blocks: (B:356:0x07cf, B:360:0x07d9, B:408:0x08c1, B:361:0x07de, B:416:0x08e7, B:362:0x07e3, B:393:0x088f, B:363:0x07e8, B:388:0x0875, B:390:0x0881, B:396:0x08a0, B:398:0x08a4, B:401:0x08a9, B:403:0x08ad, B:405:0x08b3, B:411:0x08d2, B:412:0x08d7, B:413:0x08d8, B:385:0x085d), top: B:448:0x07c6 }] */
    /* JADX WARN: Code duplicated, block: B:390:0x0881 A[Catch: all -> 0x07d6, CancellationException -> 0x0919, TryCatch #9 {CancellationException -> 0x0919, all -> 0x07d6, blocks: (B:356:0x07cf, B:360:0x07d9, B:408:0x08c1, B:361:0x07de, B:416:0x08e7, B:362:0x07e3, B:393:0x088f, B:363:0x07e8, B:388:0x0875, B:390:0x0881, B:396:0x08a0, B:398:0x08a4, B:401:0x08a9, B:403:0x08ad, B:405:0x08b3, B:411:0x08d2, B:412:0x08d7, B:413:0x08d8, B:385:0x085d), top: B:448:0x07c6 }] */
    /* JADX WARN: Code duplicated, block: B:392:0x088d  */
    /* JADX WARN: Code duplicated, block: B:393:0x088f A[Catch: all -> 0x07d6, CancellationException -> 0x0919, TryCatch #9 {CancellationException -> 0x0919, all -> 0x07d6, blocks: (B:356:0x07cf, B:360:0x07d9, B:408:0x08c1, B:361:0x07de, B:416:0x08e7, B:362:0x07e3, B:393:0x088f, B:363:0x07e8, B:388:0x0875, B:390:0x0881, B:396:0x08a0, B:398:0x08a4, B:401:0x08a9, B:403:0x08ad, B:405:0x08b3, B:411:0x08d2, B:412:0x08d7, B:413:0x08d8, B:385:0x085d), top: B:448:0x07c6 }] */
    /* JADX WARN: Code duplicated, block: B:395:0x089e  */
    /* JADX WARN: Code duplicated, block: B:396:0x08a0 A[Catch: all -> 0x07d6, CancellationException -> 0x0919, TryCatch #9 {CancellationException -> 0x0919, all -> 0x07d6, blocks: (B:356:0x07cf, B:360:0x07d9, B:408:0x08c1, B:361:0x07de, B:416:0x08e7, B:362:0x07e3, B:393:0x088f, B:363:0x07e8, B:388:0x0875, B:390:0x0881, B:396:0x08a0, B:398:0x08a4, B:401:0x08a9, B:403:0x08ad, B:405:0x08b3, B:411:0x08d2, B:412:0x08d7, B:413:0x08d8, B:385:0x085d), top: B:448:0x07c6 }] */
    /* JADX WARN: Code duplicated, block: B:398:0x08a4 A[Catch: all -> 0x07d6, CancellationException -> 0x0919, TryCatch #9 {CancellationException -> 0x0919, all -> 0x07d6, blocks: (B:356:0x07cf, B:360:0x07d9, B:408:0x08c1, B:361:0x07de, B:416:0x08e7, B:362:0x07e3, B:393:0x088f, B:363:0x07e8, B:388:0x0875, B:390:0x0881, B:396:0x08a0, B:398:0x08a4, B:401:0x08a9, B:403:0x08ad, B:405:0x08b3, B:411:0x08d2, B:412:0x08d7, B:413:0x08d8, B:385:0x085d), top: B:448:0x07c6 }] */
    /* JADX WARN: Code duplicated, block: B:410:0x08d1  */
    /* JADX WARN: Code duplicated, block: B:415:0x08e6  */
    /* JADX WARN: Code duplicated, block: B:416:0x08e7 A[Catch: all -> 0x07d6, CancellationException -> 0x0919, TRY_LEAVE, TryCatch #9 {CancellationException -> 0x0919, all -> 0x07d6, blocks: (B:356:0x07cf, B:360:0x07d9, B:408:0x08c1, B:361:0x07de, B:416:0x08e7, B:362:0x07e3, B:393:0x088f, B:363:0x07e8, B:388:0x0875, B:390:0x0881, B:396:0x08a0, B:398:0x08a4, B:401:0x08a9, B:403:0x08ad, B:405:0x08b3, B:411:0x08d2, B:412:0x08d7, B:413:0x08d8, B:385:0x085d), top: B:448:0x07c6 }] */
    /* JADX WARN: Code duplicated, block: B:479:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x049a, code lost:
    
        if (p.l4p1.s(r2, r0, r29) == r10) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x04ab, code lost:
    
        if (r2.emit(r0, r29) == r10) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x04b1, code lost:
    
        return r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x05cb, code lost:
    
        if (r2.emit(r4, r29) == r10) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x05e6, code lost:
    
        if (r2.emit(r0, r29) == r10) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0669, code lost:
    
        if (r6.emit(r8, r29) == r10) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0693, code lost:
    
        if (r6.emit(r8, r29) == r10) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x06d3, code lost:
    
        if (r6.emit(r8, r29) == r10) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x06f7, code lost:
    
        if (r6.emit(r15, r29) == r10) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x083d, code lost:
    
        if (r6.emit(r0, r29) == r10) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x08fa, code lost:
    
        if (r6.emit(r0, r29) == r10) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0916, code lost:
    
        if (r6.emit(r2, r29) == r10) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x0935, code lost:
    
        if (r6.emit(r2, r29) == r10) goto L434;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:291:0x0646, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:296:0x0671, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ciw0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ciw0(Object obj, Object obj2, Object obj3, boolean z, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.e = obj2;
        this.f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ciw0(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ciw0(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ciw0(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }
}
