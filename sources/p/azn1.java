package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class azn1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public Object g;
    public Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ azn1(Object obj, Object obj2, String str, Object obj3, Object obj4, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.h = obj;
        this.c = obj2;
        this.d = str;
        this.e = obj3;
        this.f = obj4;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                return new azn1((rvo1) this.h, (u9c) this.c, (String) this.d, (String) obj3, (vrv0) obj2, lnmVar, (byte) 0);
            case 1:
                return new azn1((zwo1) this.h, (u9c) this.c, (String) this.d, (String) obj3, (vrv0) obj2, lnmVar, (byte) 1);
            case 2:
                return new azn1((zwo1) this.h, (q7o1) this.c, (String) this.d, (sln1) obj3, (ArrayList) obj2, lnmVar, (byte) 2);
            case 3:
                return new azn1((yln1) this.d, (x5o1) obj3, (zwo1) obj2, lnmVar, (byte) 3);
            case 4:
                azn1 azn1Var = new azn1((f0p1) obj3, (svb0) obj2, lnmVar, (byte) 4);
                azn1Var.d = obj;
                return azn1Var;
            case 5:
                azn1 azn1Var2 = new azn1((f0p1) obj3, (sln1) obj2, lnmVar, (byte) 5);
                azn1Var2.d = obj;
                return azn1Var2;
            default:
                azn1 azn1Var3 = new azn1((fqn1) this.d, (yln1) obj3, (zwo1) obj2, lnmVar, (byte) 6);
                azn1Var3.c = obj;
                return azn1Var3;
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
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
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((rvo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((rvo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((rvo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:146:0x042b  */
    /* JADX WARN: Code duplicated, block: B:148:0x0450  */
    /* JADX WARN: Code duplicated, block: B:151:0x0466  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v36, types: [byte] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38, types: [p.vgn0] */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v84 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v28, types: [p.vgn0] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v35, types: [p.vgn0] */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v87 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:151:0x0466 -> B:144:0x0425). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 1422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.azn1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ azn1(Object obj, Object obj2, zwo1 zwo1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = zwo1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ azn1(f0p1 f0p1Var, Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = f0p1Var;
        this.f = obj;
    }
}
