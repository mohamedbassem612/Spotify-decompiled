package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class y2k extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y2k(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                y2k y2kVar = new y2k(2, lnmVar, (byte) 0);
                y2kVar.c = obj;
                return y2kVar;
            case 1:
                y2k y2kVar2 = new y2k(2, lnmVar, (byte) 1);
                y2kVar2.c = obj;
                return y2kVar2;
            case 2:
                y2k y2kVar3 = new y2k(2, lnmVar, (byte) 2);
                y2kVar3.c = obj;
                return y2kVar3;
            case 3:
                y2k y2kVar4 = new y2k(2, lnmVar, (byte) 3);
                y2kVar4.c = obj;
                return y2kVar4;
            case 4:
                y2k y2kVar5 = new y2k(2, lnmVar, (byte) 4);
                y2kVar5.c = obj;
                return y2kVar5;
            case 5:
                y2k y2kVar6 = new y2k(2, lnmVar, (byte) 5);
                y2kVar6.c = obj;
                return y2kVar6;
            case 6:
                y2k y2kVar7 = new y2k(2, lnmVar, (byte) 6);
                y2kVar7.c = obj;
                return y2kVar7;
            case 7:
                y2k y2kVar8 = new y2k(2, lnmVar, (byte) 7);
                y2kVar8.c = obj;
                return y2kVar8;
            default:
                y2k y2kVar9 = new y2k(2, lnmVar, (byte) 8);
                y2kVar9.c = obj;
                return y2kVar9;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((List) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 2:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 5:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 7:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            default:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:122:0x01ce -> B:118:0x01b9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0087 -> B:31:0x0074). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00b8 -> B:45:0x00a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x00f5 -> B:59:0x00d4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0125 -> B:76:0x0112). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:158:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.y2k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
