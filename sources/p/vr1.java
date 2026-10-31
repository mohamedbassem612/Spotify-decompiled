package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vr1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 4;
    public boolean b;
    public byte c;
    public String d;
    public Object e;
    public Object f;
    public Object g;
    public /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr1(xtb0 xtb0Var, boolean z, y7e1 y7e1Var, String str, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, lnm lnmVar) {
        super(2, lnmVar);
        this.e = xtb0Var;
        this.b = z;
        this.f = y7e1Var;
        this.d = str;
        this.g = ven0Var;
        this.h = ven0Var2;
        this.i = ven0Var3;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.i;
        switch (b) {
            case 0:
                return new vr1((xtb0) this.e, this.b, (y7e1) this.f, this.d, (ven0) this.g, (ven0) this.h, (ven0) obj2, lnmVar);
            case 1:
                vr1 vr1Var = new vr1((x73) obj2, this.d, lnmVar);
                vr1Var.h = obj;
                return vr1Var;
            case 2:
                return new vr1(this.b, (List) this.e, (oj3) this.f, (blc0) this.g, (gj3) this.h, this.d, (String) obj2, lnmVar);
            case 3:
                vr1 vr1Var2 = new vr1((yjq) obj2, lnmVar);
                vr1Var2.h = obj;
                return vr1Var2;
            default:
                return new vr1((i7x0) this.e, this.d, this.b, (h7x0) this.f, (String) this.g, (tv80) this.h, (String) obj2, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0287 A[PHI: r0 r11
      0x0287: PHI (r0v50 boolean) = (r0v49 boolean), (r0v53 boolean) binds: [B:87:0x0226, B:101:0x0283] A[DONT_GENERATE, DONT_INLINE]
      0x0287: PHI (r11v5 p.vr20) = (r11v4 p.vr20), (r11v7 p.vr20) binds: [B:87:0x0226, B:101:0x0283] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:160:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0228  */
    /* JADX WARN: Code duplicated, block: B:90:0x024f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0253  */
    /* JADX WARN: Code duplicated, block: B:94:0x0257  */
    /* JADX WARN: Code duplicated, block: B:95:0x025a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0265  */
    /* JADX WARN: Code duplicated, block: B:97:0x0270  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
    
        if (r7 == r8) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x027a, code lost:
    
        if (r1 == r8) goto L106;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 1140
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.vr1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr1(yjq yjqVar, lnm lnmVar) {
        super(2, lnmVar);
        this.i = yjqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr1(x73 x73Var, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.i = x73Var;
        this.d = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr1(i7x0 i7x0Var, String str, boolean z, h7x0 h7x0Var, String str2, tv80 tv80Var, String str3, lnm lnmVar) {
        super(2, lnmVar);
        this.e = i7x0Var;
        this.d = str;
        this.b = z;
        this.f = h7x0Var;
        this.g = str2;
        this.h = tv80Var;
        this.i = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr1(boolean z, List list, oj3 oj3Var, blc0 blc0Var, gj3 gj3Var, String str, String str2, lnm lnmVar) {
        super(2, lnmVar);
        this.b = z;
        this.e = list;
        this.f = oj3Var;
        this.g = blc0Var;
        this.h = gj3Var;
        this.d = str;
        this.i = str2;
    }
}
