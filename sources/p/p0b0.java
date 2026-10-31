package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p0b0 {
    public final di8 a;
    public final String b;
    public final String c;
    public final boolean d;
    public final Long e;
    public final Long f;

    public /* synthetic */ p0b0(di8 di8Var, Long l, int i) {
        this(di8Var, null, null, false, null, (i & 32) != 0 ? null : l);
    }

    public static p0b0 a(p0b0 p0b0Var, di8 di8Var, Long l, int i) {
        String str = p0b0Var.b;
        String str2 = p0b0Var.c;
        boolean z = p0b0Var.d;
        Long l2 = p0b0Var.e;
        if ((i & 32) != 0) {
            l = p0b0Var.f;
        }
        return new p0b0(di8Var, str, str2, z, l2, l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0068, code lost:
    
        if (java.util.Arrays.equals(r4.b, r1.b) != false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto Lc
            java.lang.Class r2 = r8.getClass()
            goto Ld
        Lc:
            r2 = r1
        Ld:
            java.lang.Class<p.p0b0> r3 = p.p0b0.class
            boolean r2 = r3.equals(r2)
            r3 = 0
            if (r2 != 0) goto L17
            return r3
        L17:
            p.p0b0 r8 = (p.p0b0) r8
            p.di8 r2 = r8.a
            p.di8 r4 = r7.a
            if (r4 != r2) goto L20
            goto L6a
        L20:
            java.lang.Class r5 = r4.getClass()
            if (r2 == 0) goto L29
            java.lang.Class<p.di8> r6 = p.di8.class
            goto L2a
        L29:
            r6 = r1
        L2a:
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L31
            goto L8c
        L31:
            java.lang.String r5 = r4.a
            java.lang.String r6 = r2.a
            boolean r5 = p.u890.j(r5, r6)
            if (r5 != 0) goto L3c
            goto L8c
        L3c:
            p.wd r5 = r4.b
            p.wd r6 = r2.b
            boolean r5 = p.u890.j(r5, r6)
            if (r5 != 0) goto L47
            goto L8c
        L47:
            p.of8 r4 = r4.c
            p.of8 r2 = r2.c
            if (r4 == 0) goto L4e
            goto L4f
        L4e:
            r4 = r1
        L4f:
            if (r4 == 0) goto L8c
            if (r2 == 0) goto L54
            r1 = r2
        L54:
            if (r1 == 0) goto L8c
            java.lang.String r2 = r4.a
            java.lang.String r5 = r1.a
            boolean r2 = p.u890.j(r2, r5)
            if (r2 == 0) goto L8c
            byte[] r2 = r4.b
            byte[] r1 = r1.b
            boolean r1 = java.util.Arrays.equals(r2, r1)
            if (r1 == 0) goto L8c
        L6a:
            java.lang.String r1 = r7.b
            java.lang.String r2 = r8.b
            boolean r1 = p.u890.j(r1, r2)
            if (r1 != 0) goto L75
            return r3
        L75:
            java.lang.String r1 = r7.c
            java.lang.String r2 = r8.c
            boolean r1 = p.u890.j(r1, r2)
            if (r1 != 0) goto L80
            return r3
        L80:
            java.lang.Long r7 = r7.e
            java.lang.Long r8 = r8.e
            boolean r7 = p.u890.j(r7, r8)
            if (r7 != 0) goto L8b
            return r3
        L8b:
            return r0
        L8c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p.p0b0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode;
        di8 di8Var = this.a;
        int iHashCode2 = di8Var.a.hashCode() * 31;
        wd wdVar = di8Var.b;
        int iHashCode3 = (iHashCode2 + (wdVar != null ? wdVar.hashCode() : 0)) * 31;
        of8 of8Var = di8Var.c;
        of8 of8Var2 = of8Var != null ? of8Var : null;
        if (of8Var2 != null) {
            iHashCode = Arrays.hashCode(of8Var2.b) + (of8Var.a.hashCode() * 31);
        } else {
            iHashCode = of8Var.hashCode();
        }
        int i = (iHashCode3 + iHashCode) * 31;
        String str = this.b;
        int iHashCode4 = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Long l = this.e;
        return iHashCode5 + (l != null ? Long.hashCode(l.longValue()) : 0);
    }

    public p0b0(di8 di8Var, String str, String str2, boolean z, Long l, Long l2) {
        this.a = di8Var;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = l;
        this.f = l2;
    }
}
