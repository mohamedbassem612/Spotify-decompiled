package p;

import android.content.res.Resources;
import androidx.media3.exoplayer.ExoPlayer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ie3 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 3;
    public boolean b;
    public final /* synthetic */ long c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie3(long j, Object obj, r390 r390Var, jcu0 jcu0Var, iu30 iu30Var, ExoPlayer exoPlayer, lnm lnmVar) {
        super(2, lnmVar);
        this.c = j;
        this.d = obj;
        this.f = r390Var;
        this.g = jcu0Var;
        this.e = iu30Var;
        this.h = exoPlayer;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (b) {
            case 0:
                return new ie3(this.c, (yqg) this.d, (iu30) obj5, (Resources) obj4, (ven0) obj3, (ven0) obj2, lnmVar);
            case 1:
                return new ie3((mpa) this.d, this.c, (String) obj5, (opa) obj4, (gha) obj3, (vga) obj2, lnmVar);
            case 2:
                ie3 ie3Var = new ie3((vnh1) obj5, (xtl) obj4, (p5c) obj3, this.c, (faa0) obj2, lnmVar);
                ie3Var.d = obj;
                return ie3Var;
            case 3:
                return new ie3(this.c, this.d, (r390) obj4, (jcu0) obj3, (iu30) obj5, (ExoPlayer) obj2, lnmVar);
            case 4:
                ie3 ie3Var2 = new ie3((prw0) obj5, this.c, (mrw0) obj4, (av7) obj3, (rl1) obj2, lnmVar);
                ie3Var2.d = obj;
                return ie3Var2;
            case 5:
                return new ie3((hdt0) this.d, (String) obj5, this.c, (nbe1) obj4, (x6e1) obj3, (hyp0) obj2, lnmVar);
            default:
                long j = this.c;
                ie3 ie3Var3 = new ie3(j, (String) obj4, lnmVar, (i2x0) obj3, (lqo1) obj5, (swo1) obj2);
                ie3Var3.d = obj;
                return ie3Var3;
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
                return create((cu41) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:116:0x032c  */
    /* JADX WARN: Code duplicated, block: B:117:0x033f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0357  */
    /* JADX WARN: Code duplicated, block: B:120:0x036c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0370 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x0372  */
    /* JADX WARN: Code duplicated, block: B:127:0x03af  */
    /* JADX WARN: Code duplicated, block: B:129:0x03ba  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x03b8 -> B:130:0x03bc). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 978
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ie3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie3(long j, String str, lnm lnmVar, i2x0 i2x0Var, lqo1 lqo1Var, swo1 swo1Var) {
        super(2, lnmVar);
        this.c = j;
        this.e = lqo1Var;
        this.f = str;
        this.g = i2x0Var;
        this.h = swo1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie3(long j, yqg yqgVar, iu30 iu30Var, Resources resources, ven0 ven0Var, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.c = j;
        this.d = yqgVar;
        this.e = iu30Var;
        this.f = resources;
        this.g = ven0Var;
        this.h = ven0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie3(mpa mpaVar, long j, String str, opa opaVar, gha ghaVar, vga vgaVar, lnm lnmVar) {
        super(2, lnmVar);
        this.d = mpaVar;
        this.c = j;
        this.e = str;
        this.f = opaVar;
        this.g = ghaVar;
        this.h = vgaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie3(hdt0 hdt0Var, String str, long j, nbe1 nbe1Var, x6e1 x6e1Var, hyp0 hyp0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = hdt0Var;
        this.e = str;
        this.c = j;
        this.f = nbe1Var;
        this.g = x6e1Var;
        this.h = hyp0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie3(prw0 prw0Var, long j, mrw0 mrw0Var, av7 av7Var, rl1 rl1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.e = prw0Var;
        this.c = j;
        this.f = mrw0Var;
        this.g = av7Var;
        this.h = rl1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie3(vnh1 vnh1Var, xtl xtlVar, p5c p5cVar, long j, faa0 faa0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.e = vnh1Var;
        this.f = xtlVar;
        this.g = p5cVar;
        this.c = j;
        this.h = faa0Var;
    }
}
