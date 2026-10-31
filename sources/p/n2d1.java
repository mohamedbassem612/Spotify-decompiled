package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.deviceproxy.navigation.v1.DeregisterSupportedNavigationCommandsRequest;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n2d1 implements dwo {
    public final g0l a;
    public final svt b;
    public final yqg c;
    public final mr20 d;
    public final q8n e;
    public final Set f;
    public final llm g;
    public volatile String h;
    public volatile long i;

    public n2d1(g0l g0lVar, svt svtVar, nd4 nd4Var, yqg yqgVar, mr20 mr20Var, q8n q8nVar, Set set) {
        this.a = g0lVar;
        this.b = svtVar;
        this.c = yqgVar;
        this.d = mr20Var;
        this.e = q8nVar;
        this.f = set;
        llm llmVarH = us71.h(q8nVar);
        this.g = llmVarH;
        if (nd4Var.a()) {
            fn31.T(llmVarH, (o8n) null, 0, new xba1(this, (lnm) null, (byte) 17), 3);
        } else {
            Logger.g("[NAV_REG] Registration disabled — skipping", new Object[0]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(String str, onm onmVar) {
        i2d1 i2d1Var;
        m231 m231Var;
        if (onmVar instanceof i2d1) {
            i2d1Var = (i2d1) onmVar;
            int i = i2d1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                i2d1Var.c = i - Integer.MIN_VALUE;
            } else {
                i2d1Var = new i2d1(this, onmVar);
            }
        } else {
            i2d1Var = new i2d1(this, onmVar);
        }
        i2d1 i2d1Var2 = i2d1Var;
        Object obj = i2d1Var2.a;
        int i2 = i2d1Var2.c;
        m231 m231Var2 = rih1.a;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                gdt gdtVarN = DeregisterSupportedNavigationCommandsRequest.n();
                gdtVarN.n(str);
                DeregisterSupportedNavigationCommandsRequest deregisterSupportedNavigationCommandsRequest = (DeregisterSupportedNavigationCommandsRequest) gdtVarN.build();
                svt svtVar = this.b;
                deregisterSupportedNavigationCommandsRequest.getClass();
                i2d1Var2.c = 1;
                Object objD = svt.d(svtVar, deregisterSupportedNavigationCommandsRequest, null, i2d1Var2, 2, null);
                d9n d9nVar = d9n.a;
                if (objD == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            m231Var = m231Var2;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (!(m231Var instanceof m231)) {
            Logger.g("[NAV_REG] Deregistered device", new Object[0]);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            Logger.k("[NAV_REG] Failed to deregister: %s", new Object[]{thA.getMessage()});
        }
        return m231Var2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x005f -> B:30:0x0061). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final void b(com.spotify.deviceproxy.navigation.v1.RegisterSupportedNavigationCommandsRequest r12, p.onm r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof p.j2d1
            if (r0 == 0) goto L14
            r0 = r13
            p.j2d1 r0 = (p.j2d1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.d = r1
        L12:
            r13 = r0
            goto L1a
        L14:
            p.j2d1 r0 = new p.j2d1
            r0.<init>(r11, r13)
            goto L12
        L1a:
            java.lang.Object r0 = r13.b
            p.d9n r1 = p.d9n.a
            int r2 = r13.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L30
            com.spotify.deviceproxy.navigation.v1.RegisterSupportedNavigationCommandsRequest r12 = r13.a
            p.hm5.M(r0)     // Catch: java.lang.Throwable -> L2e
            goto L61
        L2e:
            r0 = move-exception
            goto L67
        L30:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r11)
            return
        L36:
            com.spotify.deviceproxy.navigation.v1.RegisterSupportedNavigationCommandsRequest r12 = r13.a
            p.hm5.M(r0)
        L3b:
            r6 = r12
            r8 = r13
            goto L4f
        L3e:
            p.hm5.M(r0)
        L41:
            r13.a = r12
            r13.d = r4
            r5 = 43200000(0x2932e00, double:2.1343636E-316)
            java.lang.Object r0 = p.hap1.i(r5, r13)
            if (r0 != r1) goto L3b
            goto L5e
        L4f:
            p.svt r5 = r11.b     // Catch: java.lang.Throwable -> L64
            r8.a = r6     // Catch: java.lang.Throwable -> L64
            r8.d = r3     // Catch: java.lang.Throwable -> L64
            r7 = 0
            r9 = 2
            r10 = 0
            java.lang.Object r0 = p.svt.c(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L64
            if (r0 != r1) goto L5f
        L5e:
            return
        L5f:
            r12 = r6
            r13 = r8
        L61:
            com.spotify.deviceproxy.navigation.v1.RegisterSupportedNavigationCommandsResponse r0 = (com.spotify.deviceproxy.navigation.v1.RegisterSupportedNavigationCommandsResponse) r0     // Catch: java.lang.Throwable -> L2e
            goto L6d
        L64:
            r0 = move-exception
            r12 = r6
            r13 = r8
        L67:
            p.m231 r2 = new p.m231
            r2.<init>(r0)
            r0 = r2
        L6d:
            boolean r2 = r0 instanceof p.m231
            if (r2 != 0) goto L7d
            r2 = r0
            com.spotify.deviceproxy.navigation.v1.RegisterSupportedNavigationCommandsResponse r2 = (com.spotify.deviceproxy.navigation.v1.RegisterSupportedNavigationCommandsResponse) r2
            p.yqg r2 = r11.c
            long r5 = r2.b()
            r11.i = r5
        L7d:
            java.lang.Throwable r0 = p.e331.a(r0)
            if (r0 == 0) goto L41
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "[NAV_REG] Heartbeat failed: %s"
            com.spotify.base.java.logging.Logger.k(r2, r0)
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: p.n2d1.b(com.spotify.deviceproxy.navigation.v1.RegisterSupportedNavigationCommandsRequest, p.onm):void");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Code duplicated, block: B:26:0x0078  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0092  */
    /* JADX WARN: Code duplicated, block: B:35:0x009f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d1 A[LOOP:1: B:39:0x00cf->B:40:0x00d1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x0114 A[LOOP:2: B:43:0x010e->B:45:0x0114, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x016d  */
    /* JADX WARN: Code duplicated, block: B:60:0x018e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0198  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0092 -> B:33:0x0095). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x01e4 -> B:34:0x009c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(p.onm r25) {
        /*
            Method dump skipped, instruction units count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.n2d1.c(p.onm):java.lang.Object");
    }

    public final void shutdown() {
        smo1.p(this.g, (CancellationException) null);
        String str = this.h;
        if (str != null) {
            fn31.T(smo1.e(this.e), (o8n) null, 0, new pec1(this, str, (lnm) null, (byte) 6), 3);
        }
    }
}
