package p;

import androidx.compose.ui.geometry.Size;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pob0 {
    public final float a;
    public final float b;
    public final hrr0 c;
    public final mdt d = yv91.a(new pr90(this, (byte) 27));
    public final pfn0 e = new pfn0();
    public final hrr0 f = v8r.q(Boolean.FALSE);
    public o95 g = c97.b(0.0f);
    public o95 h = c97.b(0.0f);
    public flb0 i = flb0.a;
    public final hrr0 j = v8r.q(new Size(0));
    public final drr0 k = new drr0(1.0f);

    public pob0(int i, float f, float f2) {
        this.a = f;
        this.b = f2;
        this.c = v8r.q(new qz20(i));
    }

    public static n511 i(n511 n511Var, long j, float f) {
        float f2 = n511Var.a;
        float f3 = n511Var.b;
        float fIntBitsToFloat = n511Var.c - (Float.intBitsToFloat((int) (j >> 32)) / f);
        float fIntBitsToFloat2 = n511Var.d - (Float.intBitsToFloat((int) (j & 4294967295L)) / f);
        float f4 = f2 > fIntBitsToFloat ? fIntBitsToFloat : f2;
        float f5 = f3 > fIntBitsToFloat2 ? fIntBitsToFloat2 : f3;
        if (fIntBitsToFloat >= f2) {
            f2 = fIntBitsToFloat;
        }
        if (fIntBitsToFloat2 >= f3) {
            f3 = fIntBitsToFloat2;
        }
        return new n511(f4, f5, f2, f3);
    }

    public final long a(int i, lbh lbhVar) {
        n511 n511Var = (n511) lbhVar.c.get(i);
        hrr0 hrr0Var = this.j;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (((Size) hrr0Var.getValue()).a >> 32));
        drr0 drr0Var = this.k;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(((fIntBitsToFloat / drr0Var.s()) - 0.0f) - 0.0f)) << 32) | (((long) Float.floatToRawIntBits(((Float.intBitsToFloat((int) (((Size) hrr0Var.getValue()).a & 4294967295L)) / drr0Var.s()) - 0.0f) - 0.0f)) & 4294967295L);
        float f = n511Var.c;
        float f2 = n511Var.a;
        float f3 = n511Var.d;
        float f4 = n511Var.b;
        long j = (((long) ((int) (f - f2))) << 32) | (((long) ((int) (f3 - f4))) & 4294967295L);
        long jIntBitsToFloat = (((long) ((int) Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)))) & 4294967295L) | (((long) ((int) Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)))) << 32);
        long jRound = (((long) Math.round(((this.i == flb0.a ? 0.0f : (-1.0f) * 0.0f) + 1.0f) * ((((int) (jIntBitsToFloat >> 32)) - ((int) (j >> 32))) / 2.0f))) << 32) | (((long) Math.round((1.0f + 0.0f) * ((((int) (jIntBitsToFloat & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f))) & 4294967295L);
        return (((long) Float.floatToRawIntBits(f4 - ((int) (jRound & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(f2 - ((int) (jRound >> 32)))) << 32);
    }

    public final fjk1 b() {
        return d() ? new fjk1(((Number) this.g.e()).floatValue(), ((Number) this.h.e()).floatValue(), this.k.s(), ((Size) this.j.getValue()).a) : new fjk1(0.0f, 0.0f, 1.0f, 0L);
    }

    public final fjk1 c() {
        return (fjk1) this.d.getValue();
    }

    public final boolean d() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final void e(tz20 tz20Var) {
        this.c.setValue(tz20Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        if (r5.g(r8, r0) == r4) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(float r6, float r7, p.onm r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof p.kob0
            if (r0 == 0) goto L13
            r0 = r8
            p.kob0 r0 = (p.kob0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.kob0 r0 = new p.kob0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            p.hm5.M(r8)
            goto L64
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r5)
            r5 = 0
            return r5
        L31:
            float r7 = r0.b
            float r6 = r0.a
            p.hm5.M(r8)
            goto L50
        L39:
            p.hm5.M(r8)
            p.o95 r8 = r5.g
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r6)
            r0.a = r6
            r0.b = r7
            r0.e = r3
            java.lang.Object r8 = r8.g(r1, r0)
            if (r8 != r4) goto L50
            goto L63
        L50:
            p.o95 r5 = r5.h
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r7)
            r0.a = r6
            r0.b = r7
            r0.e = r2
            java.lang.Object r5 = r5.g(r8, r0)
            if (r5 != r4) goto L64
        L63:
            return r4
        L64:
            p.rih1 r5 = p.rih1.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.pob0.f(float, float, p.onm):java.lang.Object");
    }

    public final Object g(int i, lbh lbhVar, onm onmVar) {
        e(new qz20(i));
        long jA = a(i, lbhVar);
        Object objF = f(Float.intBitsToFloat((int) (jA >> 32)), Float.intBitsToFloat((int) (jA & 4294967295L)), onmVar);
        return objF == d9n.a ? objF : rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r5.h(r0) == r4) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(p.onm r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p.nob0
            if (r0 == 0) goto L13
            r0 = r6
            p.nob0 r0 = (p.nob0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.nob0 r0 = new p.nob0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            p.hm5.M(r6)
            goto L4e
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r5)
            r5 = 0
            return r5
        L31:
            p.hm5.M(r6)
            goto L43
        L35:
            p.hm5.M(r6)
            p.o95 r6 = r5.g
            r0.c = r3
            java.lang.Object r6 = r6.h(r0)
            if (r6 != r4) goto L43
            goto L4d
        L43:
            p.o95 r5 = r5.h
            r0.c = r2
            java.lang.Object r5 = r5.h(r0)
            if (r5 != r4) goto L4e
        L4d:
            return r4
        L4e:
            p.rih1 r5 = p.rih1.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.pob0.h(p.onm):java.lang.Object");
    }
}
