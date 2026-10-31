package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
public final class lw {
    public final di8 a;
    public final String b;
    public final String c;
    public final Integer d;
    public final boolean e;
    public final Long f;
    public final Long g;

    public /* synthetic */ lw(di8 di8Var, String str, String str2, Integer num, Long l, int i) {
        this(di8Var, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) == 0, null, (i & 64) != 0 ? null : l);
    }

    public static lw a(lw lwVar, di8 di8Var, Long l, int i) {
        String str = lwVar.b;
        String str2 = lwVar.c;
        Integer num = lwVar.d;
        boolean z = lwVar.e;
        Long l2 = lwVar.f;
        if ((i & 64) != 0) {
            l = lwVar.g;
        }
        lwVar.getClass();
        return new lw(di8Var, str, str2, num, z, l2, l);
    }

    public final di8 b() {
        return this.a;
    }

    public final Integer c() {
        return this.d;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.b;
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
            java.lang.Class<p.lw> r3 = p.lw.class
            boolean r2 = r3.equals(r2)
            r3 = 0
            if (r2 != 0) goto L17
            return r3
        L17:
            p.lw r8 = (p.lw) r8
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
            java.lang.Long r7 = r7.f
            java.lang.Long r8 = r8.f
            boolean r7 = p.u890.j(r7, r8)
            if (r7 != 0) goto L8b
            return r3
        L8b:
            return r0
        L8c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p.lw.equals(java.lang.Object):boolean");
    }

    public final Long f() {
        return this.g;
    }

    public final Long g() {
        return this.f;
    }

    public final boolean h() {
        return this.e;
    }

    public final int hashCode() {
        di8 di8Var = this.a;
        int iHashCode = di8Var.a.hashCode() * 31;
        wd wdVar = di8Var.b;
        int iHashCode2 = (iHashCode + (wdVar != null ? wdVar.hashCode() : 0)) * 31;
        of8 of8Var = di8Var.c;
        of8 of8Var2 = of8Var != null ? of8Var : null;
        int iHashCode3 = (iHashCode2 + (of8Var2 != null ? (of8Var.a.hashCode() * 31) + Arrays.hashCode(of8Var2.b) : of8Var.hashCode())) * 31;
        String str = this.b;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Long l = this.f;
        return iHashCode5 + (l != null ? Long.hashCode(l.longValue()) : 0);
    }

    public lw(di8 di8Var, String str, String str2, Integer num, boolean z, Long l, Long l2) {
        this.a = di8Var;
        this.b = str;
        this.c = str2;
        this.d = num;
        this.e = z;
        this.f = l;
        this.g = l2;
    }
}
