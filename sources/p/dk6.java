package p;

import com.spotify.wrapped.v1.proto.SceneTemplate;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dk6 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public int c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk6(int i, ce60 ce60Var, boolean z, p811 p811Var, c9n c9nVar, tob1 tob1Var, xtb0 xtb0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 3;
        this.c = i;
        this.d = ce60Var;
        this.b = z;
        this.e = p811Var;
        this.f = c9nVar;
        this.g = tob1Var;
        this.h = xtb0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new dk6((SceneTemplate.ArtistCardsContent.TradingCard) this.d, this.c, (bju) this.e, (ti31) this.f, (kj31) this.g, (cxc) this.h, lnmVar);
            case 1:
                dk6 dk6Var = new dk6((xtb0) this.e, (Function0) this.f, (ven0) this.g, this.c, (ven0) this.h, lnmVar);
                dk6Var.d = obj;
                return dk6Var;
            case 2:
                dk6 dk6Var2 = new dk6((String) this.e, (g2z) this.f, (xu30) this.g, (Function0) this.h, this.c, lnmVar);
                dk6Var2.d = obj;
                return dk6Var2;
            case 3:
                return new dk6(this.c, (ce60) this.d, this.b, (p811) this.e, (c9n) this.f, (tob1) this.g, (xtb0) this.h, lnmVar);
            case 4:
                return new dk6((oie0) this.h, lnmVar);
            case 5:
                return new dk6((i2j0) this.d, (c380) this.e, (tob1) this.f, this.c, (xtb0) this.g, (iu30) this.h, lnmVar);
            case 6:
                return new dk6((fws0) this.e, (jua0) this.f, (upb0) this.g, (iu30) this.h, lnmVar);
            case 7:
                return new dk6(this.d, this.c, this.e, this.f, lnmVar, (byte) 7);
            default:
                return new dk6(this.d, this.c, this.e, this.f, lnmVar, (byte) 8);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 1:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 2:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 3:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 5:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 6:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 7:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            default:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x025e  */
    /* JADX WARN: Code duplicated, block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x020f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0211  */
    /* JADX WARN: Code duplicated, block: B:93:0x0229  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x0211 -> B:83:0x01e2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 1102
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.dk6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk6(SceneTemplate.ArtistCardsContent.TradingCard tradingCard, int i, bju bjuVar, ti31 ti31Var, kj31 kj31Var, cxc cxcVar, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 0;
        this.d = tradingCard;
        this.c = i;
        this.e = bjuVar;
        this.f = ti31Var;
        this.g = kj31Var;
        this.h = cxcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dk6(Object obj, int i, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = i;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk6(String str, g2z g2zVar, xu30 xu30Var, Function0 function0, int i, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 2;
        this.e = str;
        this.f = g2zVar;
        this.g = xu30Var;
        this.h = function0;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk6(xtb0 xtb0Var, Function0 function0, ven0 ven0Var, int i, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.e = xtb0Var;
        this.f = function0;
        this.g = ven0Var;
        this.c = i;
        this.h = ven0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk6(oie0 oie0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 4;
        this.h = oie0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk6(i2j0 i2j0Var, c380 c380Var, tob1 tob1Var, int i, xtb0 xtb0Var, iu30 iu30Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 5;
        this.d = i2j0Var;
        this.e = c380Var;
        this.f = tob1Var;
        this.c = i;
        this.g = xtb0Var;
        this.h = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk6(fws0 fws0Var, jua0 jua0Var, upb0 upb0Var, iu30 iu30Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 6;
        this.e = fws0Var;
        this.f = jua0Var;
        this.g = upb0Var;
        this.h = iu30Var;
    }
}
