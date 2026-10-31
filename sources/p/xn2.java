package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xn2 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ long c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn2(long j, on41 on41Var, qn41 qn41Var, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 11;
        this.c = j;
        this.d = on41Var;
        this.e = qn41Var;
        this.f = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new xn2(this.d, this.c, obj3, obj2, lnmVar, (byte) 0);
            case 1:
                xn2 xn2Var = new xn2(obj3, obj2, this.c, lnmVar, (byte) 1);
                xn2Var.d = obj;
                return xn2Var;
            case 2:
                xn2 xn2Var2 = new xn2(obj3, obj2, this.c, lnmVar, (byte) 2);
                xn2Var2.d = obj;
                return xn2Var2;
            case 3:
                xn2 xn2Var3 = new xn2(obj3, obj2, this.c, lnmVar, (byte) 3);
                xn2Var3.d = obj;
                return xn2Var3;
            case 4:
                xn2 xn2Var4 = new xn2(obj3, this.c, obj2, lnmVar, (byte) 4);
                xn2Var4.d = obj;
                return xn2Var4;
            case 5:
                return new xn2(this.d, obj3, (String) obj2, this.c, lnmVar, (byte) 5);
            case 6:
                xn2 xn2Var5 = new xn2(obj3, this.c, obj2, lnmVar, (byte) 6);
                xn2Var5.d = obj;
                return xn2Var5;
            case 7:
                xn2 xn2Var6 = new xn2(this.c, (iu30) obj2, (mqj0) obj3, lnmVar);
                xn2Var6.d = obj;
                return xn2Var6;
            case 8:
                return new xn2(this.d, obj3, this.c, obj2, lnmVar, (byte) 8);
            case 9:
                xn2 xn2Var7 = new xn2(obj3, this.c, obj2, lnmVar, (byte) 9);
                xn2Var7.d = obj;
                return xn2Var7;
            case 10:
                return new xn2(this.d, this.c, obj3, obj2, lnmVar, (byte) 10);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new xn2(this.c, (on41) this.d, (qn41) obj3, (String) obj2, lnmVar);
            case grn1.d /* 12 */:
                xn2 xn2Var8 = new xn2(obj3, this.c, obj2, lnmVar, (byte) 12);
                xn2Var8.d = obj;
                return xn2Var8;
            case 13:
                xn2 xn2Var9 = new xn2(obj3, this.c, obj2, lnmVar, (byte) 13);
                xn2Var9.d = obj;
                return xn2Var9;
            case 14:
                return new xn2(this.d, obj3, this.c, obj2, lnmVar, (byte) 14);
            case 15:
                xn2 xn2Var10 = new xn2(this.c, obj3, obj2, lnmVar, (byte) 15);
                xn2Var10.d = obj;
                return xn2Var10;
            case 16:
                return new xn2(this.d, obj3, (String) obj2, this.c, lnmVar, (byte) 16);
            default:
                xn2 xn2Var11 = new xn2(this.c, obj3, obj2, lnmVar, (byte) 17);
                xn2Var11.d = obj;
                return xn2Var11;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case grn1.d /* 12 */:
                return create((cu41) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((swo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:181:0x033f  */
    /* JADX WARN: Code duplicated, block: B:183:0x034b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x02f8 -> B:162:0x02fc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:182:0x0349 -> B:184:0x034d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 1488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xn2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn2(long j, iu30 iu30Var, mqj0 mqj0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 7;
        this.c = j;
        this.f = iu30Var;
        this.e = mqj0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xn2(long j, Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = j;
        this.e = obj;
        this.f = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xn2(Object obj, long j, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.c = j;
        this.e = obj2;
        this.f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xn2(Object obj, long j, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.c = j;
        this.f = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xn2(Object obj, Object obj2, long j, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.c = j;
        this.f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xn2(Object obj, Object obj2, long j, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.c = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xn2(Object obj, Object obj2, String str, long j, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = str;
        this.c = j;
    }
}
