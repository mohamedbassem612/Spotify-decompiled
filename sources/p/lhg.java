package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lhg extends z031 implements vu30 {
    public final /* synthetic */ byte b;
    public byte c;
    public /* synthetic */ Object d;
    public Object e;
    public Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lhg(d7v d7vVar, ksg ksgVar, iu30 iu30Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = (byte) 1;
        this.f = d7vVar;
        this.g = ksgVar;
        this.e = iu30Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.b;
        Object obj2 = this.g;
        switch (b) {
            case 0:
                lhg lhgVar = new lhg((iu30) this.e, (ven0) this.f, (ven0) obj2, lnmVar, (byte) 0);
                lhgVar.d = obj;
                return lhgVar;
            case 1:
                lhg lhgVar2 = new lhg((d7v) this.f, (ksg) obj2, (iu30) this.e, lnmVar);
                lhgVar2.d = obj;
                return lhgVar2;
            case 2:
                lhg lhgVar3 = new lhg(obj2, lnmVar, (byte) 2);
                lhgVar3.d = obj;
                return lhgVar3;
            case 3:
                lhg lhgVar4 = new lhg((View) this.e, (ven0) this.f, (ven0) obj2, lnmVar, (byte) 3);
                lhgVar4.d = obj;
                return lhgVar4;
            case 4:
                lhg lhgVar5 = new lhg((svh0) this.f, (nea) obj2, lnmVar);
                lhgVar5.d = obj;
                return lhgVar5;
            case 5:
                lhg lhgVar6 = new lhg((mgc) this.e, (qnm0) this.f, (b4e1) obj2, lnmVar, (byte) 5);
                lhgVar6.d = obj;
                return lhgVar6;
            case 6:
                lhg lhgVar7 = new lhg(obj2, lnmVar, (byte) 6);
                lhgVar7.d = obj;
                return lhgVar7;
            default:
                lhg lhgVar8 = new lhg((o8n) this.e, (yo31) this.f, (jfe) obj2, lnmVar, (byte) 7);
                lhgVar8.d = obj;
                return lhgVar8;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        i8d1 i8d1Var = (i8d1) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
        return create(i8d1Var, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:369:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:372:0x06f0 A[LOOP:13: B:368:0x06e1->B:372:0x06f0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:479:0x06f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:480:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:126:0x02b2 -> B:128:0x02b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:226:0x0427 -> B:228:0x042b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:317:0x05d0 -> B:319:0x05d4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0096 -> B:28:0x0078). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:365:0x06d1 -> B:367:0x06d5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0110 -> B:84:0x01e9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0112 -> B:38:0x00a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x017c -> B:84:0x01e9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x017e -> B:57:0x0125). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x01d7 -> B:80:0x01db). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 2128
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.lhg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lhg(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.b = b;
        this.g = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lhg(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.b = b;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lhg(svh0 svh0Var, nea neaVar, lnm lnmVar) {
        super(2, lnmVar);
        this.b = (byte) 4;
        this.f = svh0Var;
        this.g = neaVar;
    }
}
