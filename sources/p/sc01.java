package p;

import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sc01 extends a8d1 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public Object d;
    public int e;
    public int f;
    public Object g;
    public /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sc01(yae1 yae1Var, bw91 bw91Var, int i, int i2, ed01 ed01Var, ven0 ven0Var, lee1 lee1Var, int i3, ven0 ven0Var2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = yae1Var;
        this.d = bw91Var;
        this.e = i;
        this.f = i2;
        this.g = ed01Var;
        this.h = ven0Var;
        this.i = lee1Var;
        this.t = i3;
        this.X = ven0Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.i;
        Object obj3 = this.X;
        switch (b) {
            case 0:
                return new sc01((yae1) this.c, (bw91) this.d, this.e, this.f, (ed01) this.g, (ven0) this.h, (lee1) obj2, this.t, (ven0) obj3, lnmVar, (byte) 0);
            case 1:
                return new sc01((yae1) this.c, (bw91) this.d, this.e, this.f, (ed01) this.g, (ven0) this.h, (lee1) obj2, this.t, (ven0) obj3, lnmVar, (byte) 1);
            default:
                sc01 sc01Var = new sc01((spl1) obj3, (Intent) obj2, lnmVar);
                sc01Var.h = obj;
                return sc01Var;
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
            default:
                return create((int[]) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0047  */
    /* JADX WARN: Code duplicated, block: B:13:0x0069  */
    /* JADX WARN: Code duplicated, block: B:14:0x006b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x006b -> B:15:0x006f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.sc01.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc01(spl1 spl1Var, Intent intent, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 2;
        this.X = spl1Var;
        this.i = intent;
    }
}
