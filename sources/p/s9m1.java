package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class s9m1 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r7 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        if (r7 == r1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(p.a9m1 r5, p.ohm1 r6, p.onm r7) {
        /*
            boolean r0 = r7 instanceof p.f9m1
            if (r0 == 0) goto L13
            r0 = r7
            p.f9m1 r0 = (p.f9m1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.f9m1 r0 = new p.f9m1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.c
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            java.lang.String r5 = r0.a
            p.hm5.M(r7)
            goto L73
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r5)
            return r2
        L31:
            java.lang.String r5 = r0.a
            p.hm5.M(r7)
            goto L51
        L37:
            p.hm5.M(r7)
            p.z0c1 r5 = r5.a
            boolean r7 = r5 instanceof p.y0c1
            p.d9n r1 = p.d9n.a
            if (r7 == 0) goto L60
            p.y0c1 r5 = (p.y0c1) r5
            java.lang.String r5 = r5.a
            r0.a = r5
            r0.c = r4
            java.lang.Object r7 = r6.b(r5, r0)
            if (r7 != r1) goto L51
            goto L72
        L51:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L5a
            p.w1c1 r2 = new p.w1c1
            r2.<init>(r7)
        L5a:
            p.v9m1 r6 = new p.v9m1
            r6.<init>(r5, r2)
            return r6
        L60:
            boolean r7 = r5 instanceof p.x0c1
            if (r7 == 0) goto L82
            p.x0c1 r5 = (p.x0c1) r5
            java.lang.String r5 = r5.a
            r0.a = r5
            r0.c = r3
            java.lang.Object r7 = r6.c(r5, r0)
            if (r7 != r1) goto L73
        L72:
            return r1
        L73:
            java.util.Set r7 = (java.util.Set) r7
            if (r7 == 0) goto L7c
            p.v1c1 r2 = new p.v1c1
            r2.<init>(r7)
        L7c:
            p.v9m1 r6 = new p.v9m1
            r6.<init>(r5, r2)
            return r6
        L82:
            p.eg.o()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p.s9m1.a(p.a9m1, p.ohm1, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(b9m1 b9m1Var, ohm1 ohm1Var, onm onmVar) {
        g9m1 g9m1Var;
        String str;
        String str2;
        if (onmVar instanceof g9m1) {
            g9m1Var = (g9m1) onmVar;
            int i = g9m1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                g9m1Var.c = i - Integer.MIN_VALUE;
            } else {
                g9m1Var = new g9m1(onmVar);
            }
        } else {
            g9m1Var = new g9m1(onmVar);
        }
        Object obj = g9m1Var.b;
        int i2 = g9m1Var.c;
        if (i2 != 0) {
            if (i2 == 1) {
                str2 = g9m1Var.a;
                hm5.M(obj);
                String str3 = (String) obj;
                return new v9m1(str2, str3 != null ? new w1c1(str3) : null);
            }
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = g9m1Var.a;
            hm5.M(obj);
            Set set = (Set) obj;
            return new v9m1(str, set != null ? new v1c1(set) : null);
        }
        hm5.M(obj);
        z0c1 z0c1Var = b9m1Var.a;
        String str4 = b9m1Var.b;
        boolean z = z0c1Var instanceof y0c1;
        d9n d9nVar = d9n.a;
        if (z) {
            String str5 = ((y0c1) z0c1Var).a;
            g9m1Var.a = str5;
            g9m1Var.c = 1;
            Object objD = ohm1Var.d(str5, str4, g9m1Var);
            if (objD != d9nVar) {
                obj = objD;
                str2 = str5;
                String str6 = (String) obj;
                return new v9m1(str2, str6 != null ? new w1c1(str6) : null);
            }
        } else {
            if (!(z0c1Var instanceof x0c1)) {
                eg.o();
                return null;
            }
            String str7 = ((x0c1) z0c1Var).a;
            g9m1Var.a = str7;
            g9m1Var.c = 2;
            Object objE = ohm1Var.e(str7, str4, g9m1Var);
            if (objE != d9nVar) {
                obj = objE;
                str = str7;
                Set set2 = (Set) obj;
                return new v9m1(str, set2 != null ? new v1c1(set2) : null);
            }
        }
        return d9nVar;
    }
}
