package p;

import com.google.android.gms.cast.CastDevice;
import com.spotify.base.java.logging.Logger;
import com.spotify.connect.castbasic.CastBasicException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vkr implements x2e {
    public final elr a;
    public final qtz b;
    public final nfa0 c;
    public final q8n d;
    public final ilr e;
    public final dt71 f = mgo1.e(0, 1, 0, 5);
    public c9n g;
    public gg61 h;
    public j4e i;

    public vkr(elr elrVar, qtz qtzVar, nfa0 nfa0Var, q8n q8nVar, ilr ilrVar) {
        this.a = elrVar;
        this.b = qtzVar;
        this.c = nfa0Var;
        this.d = q8nVar;
        this.e = ilrVar;
        this.g = cy30.t(q8nVar);
    }

    public static String d(j4e j4eVar) {
        CastDevice castDeviceB;
        return cy30.p("[deviceName=", (j4eVar == null || (castDeviceB = j4eVar.b()) == null) ? null : castDeviceB.d, ", sessionId=", j4eVar != null ? j4eVar.c() : null, "]");
    }

    @Override // p.x2e
    public final void a() {
        try {
            j4e j4eVar = this.i;
            this.i = null;
            if (j4eVar != null) {
                j4eVar.f();
            }
        } catch (CastBasicException e) {
            Logger.e(e, "Digesting exception during shutdown", new Object[0]);
        }
        smo1.q(this.g);
        this.h = null;
        this.i = null;
    }

    @Override // p.x2e
    public final void b() {
        c9n c9nVarV = qmo1.v(this.g, new z5o(this, (byte) 25));
        this.g = c9nVarV;
        c921.y(c9nVarV, (o8n) null, 0, new n1o(this, (lnm) null, (byte) 10), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d5, code lost:
    
        if (f(r1, r0) == r5) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(p.j4e r8, p.onm r9) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.vkr.c(p.j4e, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
    
        if (r6.a(1, r11, r1) == r9) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a9, code lost:
    
        if (r6.a(1, r11, r1) == r9) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.lang.String r11, java.lang.String r12, p.onm r13) {
        /*
            r10 = this;
            java.lang.String r0 = "putConnect returned "
            boolean r1 = r13 instanceof p.tkr
            if (r1 == 0) goto L15
            r1 = r13
            p.tkr r1 = (p.tkr) r1
            int r2 = r1.e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.e = r2
            goto L1a
        L15:
            p.tkr r1 = new p.tkr
            r1.<init>(r10, r13)
        L1a:
            java.lang.Object r13 = r1.c
            int r2 = r1.e
            java.lang.String r3 = "CastBasic->%s"
            r4 = 3
            r5 = 2
            p.qtz r6 = r10.b
            r7 = 0
            r8 = 1
            p.d9n r9 = p.d9n.a
            if (r2 == 0) goto L4d
            if (r2 == r8) goto L45
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L35
            p.hm5.M(r13)
            goto Lac
        L35:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            return r7
        L3b:
            java.lang.String r12 = r1.b
            java.lang.String r11 = r1.a
            p.hm5.M(r13)     // Catch: java.lang.Exception -> L43 java.util.concurrent.CancellationException -> Laf
            goto Lac
        L43:
            r10 = move-exception
            goto L92
        L45:
            java.lang.String r12 = r1.b
            java.lang.String r11 = r1.a
            p.hm5.M(r13)     // Catch: java.lang.Exception -> L43 java.util.concurrent.CancellationException -> Laf
            goto L5d
        L4d:
            p.hm5.M(r13)
            r1.a = r11     // Catch: java.lang.Exception -> L43 java.util.concurrent.CancellationException -> Laf
            r1.b = r12     // Catch: java.lang.Exception -> L43 java.util.concurrent.CancellationException -> Laf
            r1.e = r8     // Catch: java.lang.Exception -> L43 java.util.concurrent.CancellationException -> Laf
            java.lang.Enum r13 = r6.c(r11, r1)     // Catch: java.lang.Exception -> L43 java.util.concurrent.CancellationException -> Laf
            if (r13 != r9) goto L5d
            goto Lab
        L5d:
            p.n3e r13 = (p.n3e) r13     // Catch: java.lang.Exception -> L43 java.util.concurrent.CancellationException -> Laf
            p.n3e r2 = p.n3e.b     // Catch: java.lang.Exception -> L43 java.util.concurrent.CancellationException -> Laf
            if (r13 == r2) goto Lac
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L43 java.util.concurrent.CancellationException -> Laf
            r2.<init>(r0)     // Catch: java.lang.Exception -> L43 java.util.concurrent.CancellationException -> Laf
            r2.append(r13)     // Catch: java.lang.Exception -> L43 java.util.concurrent.CancellationException -> Laf
            java.lang.String r13 = " for device: "
            r2.append(r13)     // Catch: java.lang.Exception -> L43 java.util.concurrent.CancellationException -> Laf
            r2.append(r12)     // Catch: java.lang.Exception -> L43 java.util.concurrent.CancellationException -> Laf
            java.lang.String r13 = r2.toString()     // Catch: java.lang.Exception -> L43 java.util.concurrent.CancellationException -> Laf
            java.lang.Object[] r13 = new java.lang.Object[]{r13}     // Catch: java.lang.Exception -> L43 java.util.concurrent.CancellationException -> Laf
            com.spotify.base.java.logging.Logger.k(r3, r13)     // Catch: java.lang.Exception -> L43 java.util.concurrent.CancellationException -> Laf
            p.ilr r10 = r10.e     // Catch: java.lang.Exception -> L43 java.util.concurrent.CancellationException -> Laf
            p.m4e r13 = p.m4e.h     // Catch: java.lang.Exception -> L43 java.util.concurrent.CancellationException -> Laf
            r10.b(r13)     // Catch: java.lang.Exception -> L43 java.util.concurrent.CancellationException -> Laf
            r1.a = r11     // Catch: java.lang.Exception -> L43 java.util.concurrent.CancellationException -> Laf
            r1.b = r12     // Catch: java.lang.Exception -> L43 java.util.concurrent.CancellationException -> Laf
            r1.e = r5     // Catch: java.lang.Exception -> L43 java.util.concurrent.CancellationException -> Laf
            java.lang.Object r10 = r6.a(r8, r11, r1)     // Catch: java.lang.Exception -> L43 java.util.concurrent.CancellationException -> Laf
            if (r10 != r9) goto Lac
            goto Lab
        L92:
            java.lang.String r13 = "putConnect failed for device: "
            java.lang.String r12 = p.l1d.m(r13, r12)
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            com.spotify.base.java.logging.Logger.e(r10, r3, r12)
            r1.a = r7
            r1.b = r7
            r1.e = r4
            java.lang.Object r10 = r6.a(r8, r11, r1)
            if (r10 != r9) goto Lac
        Lab:
            return r9
        Lac:
            p.rih1 r10 = p.rih1.a
            return r10
        Laf:
            r10 = move-exception
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.vkr.e(java.lang.String, java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(j4e j4eVar, onm onmVar) {
        ukr ukrVar;
        if (onmVar instanceof ukr) {
            ukrVar = (ukr) onmVar;
            int i = ukrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ukrVar.c = i - Integer.MIN_VALUE;
            } else {
                ukrVar = new ukr(this, onmVar);
            }
        } else {
            ukrVar = new ukr(this, onmVar);
        }
        Object obj = ukrVar.a;
        int i2 = ukrVar.c;
        if (i2 == 0) {
            hm5.M(obj);
            CastDevice castDeviceB = j4eVar.b();
            String strJ = castDeviceB != null ? castDeviceB.j() : null;
            CastDevice castDeviceB2 = j4eVar.b();
            String str = castDeviceB2 != null ? castDeviceB2.d : null;
            if (strJ == null) {
                throw new CastBasicException(2, null, "No Cast device present in the Session");
            }
            ukrVar.c = 1;
            Object objE = e(strJ, str, ukrVar);
            d9n d9nVar = d9n.a;
            if (objE == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        this.f.a(r2e.a);
        return rih1.a;
    }
}
