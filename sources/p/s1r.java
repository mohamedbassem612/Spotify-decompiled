package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class s1r {
    public final b7n a;
    public final kly0 b;
    public final t1r c;
    public final bbc d;

    public s1r(b7n b7nVar, q8n q8nVar, caq caqVar, t1r t1rVar) {
        this.a = b7nVar;
        this.b = caqVar;
        this.c = t1rVar;
        llm llmVarX = l1d.x(q8nVar);
        this.d = mno1.a(Integer.MAX_VALUE, 0, 6);
        c921.y(llmVarX, (o8n) null, 0, new p1r(this, (lnm) null, (byte) 0), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        q1r q1rVar;
        if (onmVar instanceof q1r) {
            q1rVar = (q1r) onmVar;
            int i = q1rVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                q1rVar.c = i - Integer.MIN_VALUE;
            } else {
                q1rVar = new q1r(this, onmVar);
            }
        } else {
            q1rVar = new q1r(this, onmVar);
        }
        Object objB = q1rVar.a;
        int i2 = q1rVar.c;
        if (i2 == 0) {
            hm5.M(objB);
            Integer numP = yah0.p(this.c.a.l(t1r.j, -1));
            Integer num = numP.intValue() != -1 ? numP : null;
            if (num != null) {
                Integer numP2 = yah0.p(num.intValue());
                q1rVar.c = 1;
                objB = this.a.b(v6n.a, numP2, q1rVar);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            }
            return rih1.a;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objB);
        ((Boolean) objB).getClass();
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
    
        if (r10 == r6) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(p.onm r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof p.r1r
            if (r0 == 0) goto L13
            r0 = r10
            p.r1r r0 = (p.r1r) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.r1r r0 = new p.r1r
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.a
            int r1 = r0.c
            p.v6n r2 = p.v6n.a
            p.b7n r3 = r9.a
            r4 = 2
            r5 = 1
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L3a
            if (r1 == r5) goto L36
            if (r1 != r4) goto L2f
            p.hm5.M(r10)
            goto L9c
        L2f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            r9 = 0
            return r9
        L36:
            p.hm5.M(r10)
            goto L55
        L3a:
            p.hm5.M(r10)
            p.mr20 r10 = r3.a(r2)
            p.re1 r1 = new p.re1
            r7 = 17
            r1.<init>(r7)
            p.lt20 r10 = p.x4p1.h(r10, r1)
            r0.c = r5
            java.lang.Object r10 = p.b5p1.k(r10, r0)
            if (r10 != r6) goto L55
            goto L9b
        L55:
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 == 0) goto La1
            int r10 = r10.intValue()
            r1 = -1
            p.t1r r7 = r9.c
            if (r10 == r1) goto L70
            p.dma1 r1 = r7.a
            p.hma1 r1 = r1.edit()
            p.bma1 r8 = p.t1r.j
            r1.b(r8, r10)
            r1.g()
        L70:
            p.kly0 r9 = r9.b
            java.lang.Object r9 = r9.get()
            p.nc4 r9 = (p.nc4) r9
            boolean r9 = r9.a()
            if (r9 != 0) goto L7f
            goto L8f
        L7f:
            p.dma1 r9 = r7.a
            p.bma1 r1 = p.t1r.f
            r7 = 0
            boolean r9 = r9.h(r1, r7)
            if (r9 == 0) goto L8b
            goto L8f
        L8b:
            if (r10 != r5) goto L8e
            goto L8f
        L8e:
            r5 = r7
        L8f:
            java.lang.Integer r9 = p.yah0.p(r5)
            r0.c = r4
            java.lang.Object r10 = r3.b(r2, r9, r0)
            if (r10 != r6) goto L9c
        L9b:
            return r6
        L9c:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            r10.getClass()
        La1:
            p.rih1 r9 = p.rih1.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.s1r.b(p.onm):java.lang.Object");
    }
}
