package p;

import com.spotify.rcs.resolver.grpc.v0.ResolveRequest;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eqb extends a8d1 implements vu30 {
    public Object N0;
    public final /* synthetic */ Object O0;
    public Object X;
    public Object Y;
    public Object Z;
    public final /* synthetic */ byte a = 0;
    public Object b;
    public int c;
    public int d;
    public int e;
    public int f;
    public byte g;
    public Object h;
    public Serializable i;
    public Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqb(fqb fqbVar, ResolveRequest resolveRequest, lnm lnmVar) {
        super(2, lnmVar);
        this.X = fqbVar;
        this.O0 = resolveRequest;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.O0;
        switch (b) {
            case 0:
                eqb eqbVar = new eqb((fqb) this.X, (ResolveRequest) obj2, lnmVar);
                eqbVar.Z = obj;
                return eqbVar;
            default:
                return new eqb((uy10) this.N0, (String) obj2, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0329 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:115:0x038c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0394  */
    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0112 A[Catch: all -> 0x0032, TryCatch #1 {all -> 0x0032, blocks: (B:11:0x002b, B:54:0x01a9, B:46:0x0145, B:40:0x010c, B:42:0x0112, B:47:0x0156, B:48:0x0171, B:50:0x0177, B:51:0x0188, B:35:0x00e4, B:39:0x00f0, B:31:0x00ca), top: B:121:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x013e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0140  */
    /* JADX WARN: Code duplicated, block: B:78:0x0287  */
    /* JADX WARN: Code duplicated, block: B:81:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:84:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:85:0x02be  */
    /* JADX WARN: Code duplicated, block: B:88:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:91:0x02de  */
    /* JADX WARN: Code duplicated, block: B:95:0x030b  */
    /* JADX WARN: Code duplicated, block: B:97:0x031a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0320  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x034f -> B:108:0x0352). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0140 -> B:46:0x0145). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 928
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.eqb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqb(uy10 uy10Var, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.N0 = uy10Var;
        this.O0 = str;
    }
}
