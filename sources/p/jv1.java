package p;

import android.content.res.Configuration;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jv1 extends a8d1 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ byte a = 1;
    public int b;
    public int c;
    public boolean d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv1(fu1 fu1Var, Integer num, ven0 ven0Var, wat watVar, int i, int i2, ven0 ven0Var2, xtb0 xtb0Var, Configuration configuration, ven0 ven0Var3, lnm lnmVar) {
        super(2, lnmVar);
        this.e = fu1Var;
        this.f = num;
        this.g = ven0Var;
        this.t = watVar;
        this.b = i;
        this.c = i2;
        this.h = ven0Var2;
        this.X = xtb0Var;
        this.Y = configuration;
        this.i = ven0Var3;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.Y;
        Object obj3 = this.X;
        Object obj4 = this.t;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new jv1((fu1) this.e, (Integer) this.f, (ven0) this.g, (wat) obj4, this.b, this.c, (ven0) this.h, (xtb0) obj3, (Configuration) obj2, (ven0) this.i, lnmVar);
            default:
                jv1 jv1Var = new jv1((Set) obj4, (in71) obj3, (List) obj2, lnmVar);
                jv1Var.i = obj;
                return jv1Var;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x009f  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00f6 A[LOOP:0: B:26:0x00f0->B:28:0x00f6, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00cb -> B:23:0x00ce). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 754
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.jv1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv1(Set set, in71 in71Var, List list, lnm lnmVar) {
        super(2, lnmVar);
        this.t = set;
        this.X = in71Var;
        this.Y = list;
    }
}
