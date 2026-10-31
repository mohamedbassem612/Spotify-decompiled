package p;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bzb0 {
    public final x390 a;
    public final ay0 b;
    public final ay0 c;
    public final ey4 d;
    public final String e;
    public final d3d1 f;
    public final d3d1 g;

    public bzb0(x390 x390Var, ay0 ay0Var, ay0 ay0Var2, ey4 ey4Var, String str, d3d1 d3d1Var, d3d1 d3d1Var2) {
        this.a = x390Var;
        this.b = ay0Var;
        this.c = ay0Var2;
        this.d = ey4Var;
        this.e = str;
        this.f = d3d1Var;
        this.g = d3d1Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ay0 ay0Var, onm onmVar) {
        zyb0 zyb0Var;
        if (onmVar instanceof zyb0) {
            zyb0Var = (zyb0) onmVar;
            int i = zyb0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zyb0Var.c = i - Integer.MIN_VALUE;
            } else {
                zyb0Var = new zyb0(this, onmVar);
            }
        } else {
            zyb0Var = new zyb0(this, onmVar);
        }
        Object objC = zyb0Var.a;
        int i2 = zyb0Var.c;
        if (i2 == 0) {
            hm5.M(objC);
            Map mapSingletonMap = Collections.singletonMap("context", this.e);
            zyb0Var.c = 1;
            ay0Var.getClass();
            objC = ay0.c(ay0Var, mapSingletonMap, zyb0Var);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objC);
        }
        oc91 oc91Var = (pc91) objC;
        if (oc91Var instanceof oc91) {
            return oc91Var.b;
        }
        if (oc91Var instanceof nc91) {
            return z6x.a;
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ab, code lost:
    
        if (r9 == r7) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(p.lnm r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof p.azb0
            if (r0 == 0) goto L13
            r0 = r9
            p.azb0 r0 = (p.azb0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.azb0 r0 = new p.azb0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L3b
            if (r1 == r5) goto L37
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            p.hm5.M(r9)
            goto Lae
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r2
        L33:
            p.hm5.M(r9)
            return r9
        L37:
            p.hm5.M(r9)
            return r9
        L3b:
            p.hm5.M(r9)
            p.d3d1 r9 = p.d3d1.MUSIC_SEE_ALL
            p.ey4 r1 = r8.d
            p.d3d1 r6 = r8.g
            p.d9n r7 = p.d9n.a
            if (r6 != r9) goto L5a
            boolean r9 = r1.a()
            if (r9 == 0) goto L5a
            r0.c = r5
            p.ay0 r9 = r8.b
            java.lang.Object r8 = r8.a(r9, r0)
            if (r8 != r7) goto L59
            goto Lad
        L59:
            return r8
        L5a:
            p.d3d1 r9 = p.d3d1.PODCAST_SEE_ALL
            if (r6 != r9) goto L70
            boolean r9 = r1.b()
            if (r9 == 0) goto L70
            r0.c = r4
            p.ay0 r9 = r8.c
            java.lang.Object r8 = r8.a(r9, r0)
            if (r8 != r7) goto L6f
            goto Lad
        L6f:
            return r8
        L70:
            int[] r9 = p.yyb0.a
            p.d3d1 r1 = r8.f
            int r4 = r1.ordinal()
            r9 = r9[r4]
            java.lang.String r4 = r8.e
            r6 = 8
            if (r9 != r5) goto L86
            p.m72 r9 = new p.m72
            r9.<init>(r4, r1, r6)
            goto L9f
        L86:
            java.util.Set r9 = p.s4b1.f
            p.s4b1 r9 = p.uic.x(r4)
            p.blc0 r9 = r9.c
            p.blc0 r1 = p.blc0.Pg
            if (r9 != r1) goto L9a
            p.k72 r9 = new p.k72
            p.d3d1 r1 = p.d3d1.PODCAST_SCROLL_NPV
            r9.<init>(r4, r1, r6)
            goto L9f
        L9a:
            p.l72 r9 = new p.l72
            r9.<init>(r4)
        L9f:
            p.x390 r8 = r8.a
            io.reactivex.rxjava3.core.Observable r8 = r8.b(r9)
            r0.c = r3
            java.lang.Object r9 = p.fc11.l(r8, r5, r2, r0)
            if (r9 != r7) goto Lae
        Lad:
            return r7
        Lae:
            java.util.List r9 = (java.util.List) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.bzb0.b(p.lnm):java.lang.Object");
    }
}
