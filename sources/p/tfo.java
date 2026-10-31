package p;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class tfo extends a8d1 implements vu30 {
    public final /* synthetic */ Object N0;
    public Object X;
    public Object Y;
    public Object Z;
    public final /* synthetic */ byte a;
    public Object b;
    public Iterator c;
    public Object d;
    public int e;
    public int f;
    public byte g;
    public Object h;
    public Object i;
    public Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tfo(List list, f961 f961Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.Z = list;
        this.N0 = f961Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.N0;
        switch (b) {
            case 0:
                tfo tfoVar = new tfo((Set) obj2, this.i, lnmVar, (byte) 0);
                tfoVar.d = obj;
                return tfoVar;
            case 1:
                tfo tfoVar2 = new tfo((List) this.Z, (f961) obj2, lnmVar, (byte) 1);
                tfoVar2.Y = obj;
                return tfoVar2;
            case 2:
                tfo tfoVar3 = new tfo((List) this.Z, (f961) obj2, lnmVar, (byte) 2);
                tfoVar3.Y = obj;
                return tfoVar3;
            default:
                tfo tfoVar4 = new tfo((Set) obj2, this.i, lnmVar, (byte) 3);
                tfoVar4.d = obj;
                return tfoVar4;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:248:0x0779  */
    /* JADX WARN: Code duplicated, block: B:250:0x0786  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:159:0x054b -> B:160:0x0553). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x009b -> B:35:0x0125). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:250:0x0786 -> B:266:0x0809). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:254:0x07ba -> B:284:0x07bd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:264:0x07f2 -> B:259:0x07e5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00e4 -> B:309:0x00ea). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x012c -> B:37:0x0142). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x027f -> B:66:0x0288). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 2108
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.tfo.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tfo(Set set, Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.N0 = set;
        this.i = obj;
    }
}
