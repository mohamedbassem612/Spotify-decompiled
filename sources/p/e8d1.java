package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class e8d1 {
    public static final Set a = f46.S0(new Integer[]{200, 304, 404, 429});

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:7))(1:7)|8|35|(2:(1:(2:12|13)(2:14|15))(4:16|36|17|18)|(1:29)(1:32))(1:21)|38|22|(1:31)(1:25)|(1:(0))) */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        r10 = r14;
        r14 = r11;
        r11 = r15;
        r15 = r1;
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009c, code lost:
    
        if (p.hap1.i(r5, r0) == r4) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v6, types: [int, short] */
    /* JADX WARN: Type inference failed for: r1v4, types: [int, short] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x009c -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(int r11, long r12, p.iu30 r14, p.onm r15) throws java.lang.Exception {
        /*
            boolean r0 = r15 instanceof p.d8d1
            if (r0 == 0) goto L13
            r0 = r15
            p.d8d1 r0 = (p.d8d1) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            p.d8d1 r0 = new p.d8d1
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.e
            int r1 = r0.f
            r2 = 2
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r1 == 0) goto L4c
            if (r1 == r3) goto L3d
            if (r1 != r2) goto L36
            int r11 = r0.b
            short r12 = r0.c
            long r12 = (long) r12
            byte r14 = r0.a
            p.iu30 r1 = r0.d
            p.hm5.M(r15)
        L32:
            r15 = r11
            r11 = r14
            r14 = r1
            goto L50
        L36:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r11)
            r11 = 0
            return r11
        L3d:
            int r11 = r0.b
            short r12 = r0.c
            long r12 = (long) r12
            byte r14 = r0.a
            p.iu30 r1 = r0.d
            p.hm5.M(r15)     // Catch: java.lang.Exception -> L4a java.util.concurrent.CancellationException -> La0
            return r15
        L4a:
            r15 = move-exception
            goto L69
        L4c:
            p.hm5.M(r15)
            r15 = 0
        L50:
            r0.d = r14     // Catch: java.lang.Exception -> L63 java.util.concurrent.CancellationException -> La0
            r0.a = r11     // Catch: java.lang.Exception -> L63 java.util.concurrent.CancellationException -> La0
            int r1 = (int) r12     // Catch: java.lang.Exception -> L63 java.util.concurrent.CancellationException -> La0
            r0.c = r1     // Catch: java.lang.Exception -> L63 java.util.concurrent.CancellationException -> La0
            r0.b = r15     // Catch: java.lang.Exception -> L63 java.util.concurrent.CancellationException -> La0
            r0.f = r3     // Catch: java.lang.Exception -> L63 java.util.concurrent.CancellationException -> La0
            java.lang.Object r11 = r14.invoke(r0)     // Catch: java.lang.Exception -> L63 java.util.concurrent.CancellationException -> La0
            if (r11 != r4) goto L62
            goto L9e
        L62:
            return r11
        L63:
            r1 = move-exception
            r10 = r14
            r14 = r11
            r11 = r15
            r15 = r1
            r1 = r10
        L69:
            if (r11 >= r14) goto L9f
            int r11 = r11 + 1
            long r5 = (long) r11
            long r5 = r5 * r12
            p.utw0 r7 = p.ike1.a
            java.lang.String r8 = "RCS"
            r7.y(r8)
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r11)
            java.lang.String r15 = r15.getMessage()
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r5)
            java.lang.Object[] r15 = new java.lang.Object[]{r8, r15, r9}
            java.lang.String r8 = "Failed %d attempt with error: %s, retrying in %d ms..."
            r7.o(r8, r15)
            r0.d = r1
            r0.a = r14
            int r15 = (int) r12
            r0.c = r15
            r0.b = r11
            r0.f = r2
            java.lang.Object r15 = p.hap1.i(r5, r0)
            if (r15 != r4) goto L32
        L9e:
            return r4
        L9f:
            throw r15
        La0:
            r11 = move-exception
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e8d1.a(int, long, p.iu30, p.onm):java.lang.Object");
    }
}
