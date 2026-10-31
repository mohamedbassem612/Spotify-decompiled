package p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class py70 implements xpw {
    public final yqg a;
    public final gw70 b;
    public final q8n c;
    public String e;
    public final psw h;
    public final bpb1 d = gio1.b(hy70.a);
    public final js20 f = x3p1.n(new ux70(this, (byte) 1), vu70.Q0, g070.P0, (o8n) null, vu70.R0, 8);
    public final ia00 g = n3o1.q(this).a(oe60.S0, oe60.T0);

    public py70(yqg yqgVar, gw70 gw70Var, q8n q8nVar) {
        this.a = yqgVar;
        this.b = gw70Var;
        this.c = q8nVar;
        j2i j2iVar = nsi.a;
        ien0 ien0Var = qsw.a;
        this.h = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.g;
    }

    public final jsw c() {
        return this.h;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, onm onmVar, boolean z) throws Exception {
        ny70 ny70Var;
        int i;
        if (onmVar instanceof ny70) {
            ny70Var = (ny70) onmVar;
            int i2 = ny70Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ny70Var.d = i2 - Integer.MIN_VALUE;
            } else {
                ny70Var = new ny70(this, onmVar);
            }
        } else {
            ny70Var = new ny70(this, onmVar);
        }
        Object obj = ny70Var.b;
        int i3 = ny70Var.d;
        if (i3 == 0) {
            hm5.M(obj);
            int i4 = (z ? 180 : 240) * 3;
            ny70Var.a = i4;
            ny70Var.d = 1;
            Object objF = f(str, ny70Var);
            Object obj2 = d9n.a;
            if (objF == obj2) {
                return obj2;
            }
            obj = objF;
            i = i4;
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = ny70Var.a;
            hm5.M(obj);
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap((Bitmap) obj, i, i, true);
        return new iy70(bitmapCreateScaledBitmap, Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, 6, 6, true));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:41|23|(1:33)(1:26)) */
    /* JADX WARN: Code duplicated, block: B:26:0x0067 A[PHI: r13
      0x0067: PHI (r13v5 java.lang.Object) = (r13v8 java.lang.Object), (r13v1 java.lang.Object) binds: [B:24:0x0064, B:16:0x003b] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x006e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x0087  */
    /* JADX WARN: Code duplicated, block: B:41:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        r6 = r12;
        r12 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
    
        if (p.hap1.i(((long) r12) * 500, r0) == r5) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x006c -> B:34:0x0081). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x007e -> B:34:0x0081). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(java.lang.String r12, p.onm r13) throws java.lang.Exception {
        /*
            r11 = this;
            boolean r0 = r13 instanceof p.oy70
            if (r0 == 0) goto L13
            r0 = r13
            p.oy70 r0 = (p.oy70) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            p.oy70 r0 = new p.oy70
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.d
            int r1 = r0.f
            r2 = 2
            r3 = 0
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L43
            if (r1 == r4) goto L37
            if (r1 != r2) goto L31
            int r12 = r0.c
            java.lang.Exception r1 = r0.b
            java.lang.String r6 = r0.a
            p.hm5.M(r13)
            goto L81
        L31:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r11)
            return r3
        L37:
            int r12 = r0.c
            java.lang.String r1 = r0.a
            p.hm5.M(r13)     // Catch: java.lang.Exception -> L3f java.util.concurrent.CancellationException -> L85
            goto L67
        L3f:
            r13 = move-exception
            r6 = r1
            r1 = r13
            goto L6b
        L43:
            p.hm5.M(r13)
            r1 = r3
            r13 = r4
        L48:
            r6 = 4
            if (r13 >= r6) goto L87
            p.gw70 r1 = r11.b     // Catch: java.lang.Exception -> L68 java.util.concurrent.CancellationException -> L85
            p.ixg r1 = r1.f(r12)     // Catch: java.lang.Exception -> L68 java.util.concurrent.CancellationException -> L85
            r6 = 0
            r1.g = r6     // Catch: java.lang.Exception -> L68 java.util.concurrent.CancellationException -> L85
            io.reactivex.rxjava3.core.Single r1 = r1.i()     // Catch: java.lang.Exception -> L68 java.util.concurrent.CancellationException -> L85
            r0.a = r12     // Catch: java.lang.Exception -> L68 java.util.concurrent.CancellationException -> L85
            r0.b = r3     // Catch: java.lang.Exception -> L68 java.util.concurrent.CancellationException -> L85
            r0.c = r13     // Catch: java.lang.Exception -> L68 java.util.concurrent.CancellationException -> L85
            r0.f = r4     // Catch: java.lang.Exception -> L68 java.util.concurrent.CancellationException -> L85
            java.lang.Object r13 = p.fc11.j(r1, r0)     // Catch: java.lang.Exception -> L68 java.util.concurrent.CancellationException -> L85
            if (r13 != r5) goto L67
            goto L80
        L67:
            return r13
        L68:
            r1 = move-exception
            r6 = r12
            r12 = r13
        L6b:
            r13 = 3
            if (r12 >= r13) goto L81
            r7 = 500(0x1f4, double:2.47E-321)
            long r9 = (long) r12
            long r9 = r9 * r7
            r0.a = r6
            r0.b = r1
            r0.c = r12
            r0.f = r2
            java.lang.Object r13 = p.hap1.i(r9, r0)
            if (r13 != r5) goto L81
        L80:
            return r5
        L81:
            int r13 = r12 + 1
            r12 = r6
            goto L48
        L85:
            r11 = move-exception
            throw r11
        L87:
            r1.getClass()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p.py70.f(java.lang.String, p.onm):java.lang.Object");
    }

    public final mqw getBehavior() {
        return this.f;
    }
}
