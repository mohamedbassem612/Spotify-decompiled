package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ml1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 5;
    public boolean b;
    public byte c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public final /* synthetic */ Object h;
    public /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ml1(boolean z, yqg yqgVar, int i, xtb0 xtb0Var, ven0 ven0Var, tob1 tob1Var, ven0 ven0Var2, ven0 ven0Var3, ven0 ven0Var4, lnm lnmVar) {
        super(2, lnmVar);
        this.b = z;
        this.d = yqgVar;
        this.c = i;
        this.e = xtb0Var;
        this.f = ven0Var;
        this.g = tob1Var;
        this.h = ven0Var2;
        this.i = ven0Var3;
        this.t = ven0Var4;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.t;
        Object obj3 = this.h;
        switch (b) {
            case 0:
                ml1 ml1Var = new ml1((a42) this.f, (d0r) obj2, (hti0) obj3, lnmVar);
                ml1Var.i = obj;
                return ml1Var;
            case 1:
                return new ml1((sgm) this.g, (wgm) obj3, (kjm) this.i, (iu30) obj2, lnmVar);
            case 2:
                ml1 ml1Var2 = new ml1((g1i) this.d, (String) this.e, (String) this.f, this.b, (String) this.g, (String) obj3, (String) obj2, lnmVar);
                ml1Var2.i = obj;
                return ml1Var2;
            case 3:
                return new ml1(this.b, (ven0) this.d, (ven0) this.e, (hlu) this.f, (ven0) this.g, (ven0) obj3, (ven0) this.i, (ven0) obj2, lnmVar);
            case 4:
                return new ml1(this.b, (yqg) this.d, this.c, (xtb0) this.e, (ven0) this.f, (tob1) this.g, (ven0) obj3, (ven0) this.i, (ven0) obj2, lnmVar);
            case 5:
                ml1 ml1Var3 = new ml1((List) this.g, (uvy) obj3, (hre1) obj2, this.b, lnmVar);
                ml1Var3.i = obj;
                return ml1Var3;
            default:
                ml1 ml1Var4 = new ml1((r9c) this.g, (hwc0) obj3, (fkv) obj2, lnmVar);
                ml1Var4.i = obj;
                return ml1Var4;
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
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0292  */
    /* JADX WARN: Code duplicated, block: B:186:0x0564  */
    /* JADX WARN: Code duplicated, block: B:190:0x056d  */
    /* JADX WARN: Code duplicated, block: B:220:0x063a  */
    /* JADX WARN: Code duplicated, block: B:224:0x0664  */
    /* JADX WARN: Code duplicated, block: B:226:0x0672 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:227:0x0674  */
    /* JADX WARN: Code duplicated, block: B:229:0x0677  */
    /* JADX WARN: Code duplicated, block: B:231:0x067a  */
    /* JADX WARN: Code duplicated, block: B:232:0x067c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:233:0x067e  */
    /* JADX WARN: Code duplicated, block: B:234:0x0680  */
    /* JADX WARN: Code duplicated, block: B:236:0x0687  */
    /* JADX WARN: Code duplicated, block: B:237:0x0689  */
    /* JADX WARN: Code duplicated, block: B:240:0x068e  */
    /* JADX WARN: Code duplicated, block: B:244:0x0695  */
    /* JADX WARN: Code duplicated, block: B:249:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:251:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:253:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:255:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:257:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:259:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:260:0x06db  */
    /* JADX WARN: Code duplicated, block: B:261:0x06de  */
    /* JADX WARN: Code duplicated, block: B:264:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:266:0x06ef  */
    /* JADX WARN: Code duplicated, block: B:268:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:270:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:273:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:274:0x0702  */
    /* JADX WARN: Code duplicated, block: B:275:0x0705  */
    /* JADX WARN: Code duplicated, block: B:278:0x070e  */
    /* JADX WARN: Code duplicated, block: B:280:0x0711  */
    /* JADX WARN: Code duplicated, block: B:282:0x0714  */
    /* JADX WARN: Code duplicated, block: B:284:0x0717  */
    /* JADX WARN: Code duplicated, block: B:286:0x0720  */
    /* JADX WARN: Code duplicated, block: B:287:0x0724  */
    /* JADX WARN: Code duplicated, block: B:288:0x0728  */
    /* JADX WARN: Code duplicated, block: B:291:0x073d  */
    /* JADX WARN: Code duplicated, block: B:293:0x0740 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:294:0x0742  */
    /* JADX WARN: Code duplicated, block: B:296:0x0745  */
    /* JADX WARN: Code duplicated, block: B:298:0x0759  */
    /* JADX WARN: Code duplicated, block: B:299:0x0768  */
    /* JADX WARN: Code duplicated, block: B:300:0x0777  */
    /* JADX WARN: Code duplicated, block: B:306:0x07cb  */
    /* JADX WARN: Code duplicated, block: B:309:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:311:0x07f2 A[LOOP:8: B:307:0x07de->B:311:0x07f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:356:0x0682 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:0x0698 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:360:0x06d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x06fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:362:0x071b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:363:0x0754 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:370:0x0808 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:373:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:382:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x01df  */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02cc, code lost:
    
        if (r1.collect(r3, r43) == r10) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x047a, code lost:
    
        if (r0.collect(r22, r43) == r10) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x04ca, code lost:
    
        if (r2.collect(r11, r43) == r10) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x04cd, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007b, code lost:
    
        if (r9.u(r7, r11, r43) == r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x058e, code lost:
    
        if (r7.emit(r1, r43) == r10) goto L193;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r44) {
        /*
            Method dump skipped, instruction units count: 2234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ml1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml1(a42 a42Var, d0r d0rVar, hti0 hti0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.f = a42Var;
        this.h = hti0Var;
        this.t = d0rVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml1(r9c r9cVar, hwc0 hwc0Var, fkv fkvVar, lnm lnmVar) {
        super(2, lnmVar);
        this.g = r9cVar;
        this.h = hwc0Var;
        this.t = fkvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml1(g1i g1iVar, String str, String str2, boolean z, String str3, String str4, String str5, lnm lnmVar) {
        super(2, lnmVar);
        this.d = g1iVar;
        this.e = str;
        this.f = str2;
        this.b = z;
        this.g = str3;
        this.h = str4;
        this.t = str5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml1(sgm sgmVar, wgm wgmVar, kjm kjmVar, iu30 iu30Var, lnm lnmVar) {
        super(2, lnmVar);
        this.g = sgmVar;
        this.h = wgmVar;
        this.i = kjmVar;
        this.t = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml1(List list, uvy uvyVar, hre1 hre1Var, boolean z, lnm lnmVar) {
        super(2, lnmVar);
        this.g = list;
        this.h = uvyVar;
        this.t = hre1Var;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml1(boolean z, ven0 ven0Var, ven0 ven0Var2, hlu hluVar, ven0 ven0Var3, ven0 ven0Var4, ven0 ven0Var5, ven0 ven0Var6, lnm lnmVar) {
        super(2, lnmVar);
        this.b = z;
        this.d = ven0Var;
        this.e = ven0Var2;
        this.f = hluVar;
        this.g = ven0Var3;
        this.h = ven0Var4;
        this.i = ven0Var5;
        this.t = ven0Var6;
    }
}
