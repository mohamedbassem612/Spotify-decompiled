package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zd4 extends z031 implements vu30 {
    public final /* synthetic */ byte b;
    public byte c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zd4(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.b = b;
        this.e = obj;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.b;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                zd4 zd4Var = new zd4((be4) obj2, lnmVar, (byte) 0);
                zd4Var.d = obj;
                return zd4Var;
            case 1:
                zd4 zd4Var2 = new zd4((uku) obj2, lnmVar, (byte) 1);
                zd4Var2.d = obj;
                return zd4Var2;
            case 2:
                zd4 zd4Var3 = new zd4((vu30) obj2, lnmVar, (byte) 2);
                zd4Var3.d = obj;
                return zd4Var3;
            case 3:
                zd4 zd4Var4 = new zd4((az20) obj2, lnmVar, (byte) 3);
                zd4Var4.d = obj;
                return zd4Var4;
            default:
                zd4 zd4Var5 = new zd4((View) obj2, lnmVar, (byte) 4);
                zd4Var5.d = obj;
                return zd4Var5;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((i8d1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((i8d1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((i8d1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((i8d1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((r561) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:117:0x020f A[LOOP:2: B:113:0x01fb->B:117:0x020f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:135:0x0213 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x01cb -> B:106:0x01ce). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00e2 -> B:57:0x00e5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.zd4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
