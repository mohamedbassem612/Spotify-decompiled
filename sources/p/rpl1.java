package p;

import android.content.ComponentName;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rpl1 extends a8d1 implements vu30 {
    public final /* synthetic */ ComponentName N0;
    public byte X;
    public final /* synthetic */ spl1 Y;
    public final /* synthetic */ int[] Z;
    public String a;
    public int[] b;
    public spl1 c;
    public ComponentName d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rpl1(spl1 spl1Var, int[] iArr, ComponentName componentName, lnm lnmVar) {
        super(2, lnmVar);
        this.Y = spl1Var;
        this.Z = iArr;
        this.N0 = componentName;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new rpl1(this.Y, this.Z, this.N0, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0069  */
    /* JADX WARN: Code duplicated, block: B:14:0x008f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0091  */
    /* JADX WARN: Code duplicated, block: B:19:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00e8 -> B:20:0x00ee). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.rpl1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
