package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class h9i0 extends a8d1 implements vu30 {
    public byte N0;
    public final /* synthetic */ q9i0 O0;
    public final /* synthetic */ ArrayList P0;
    public final /* synthetic */ boolean Q0;
    public final /* synthetic */ w8i0 R0;
    public final /* synthetic */ String S0;
    public final /* synthetic */ String T0;
    public int X;
    public int Y;
    public long Z;
    public opa a;
    public v9i0 b;
    public l811 c;
    public List d;
    public List e;
    public Object f;
    public Object g;
    public Iterator h;
    public v9i0 i;
    public v9i0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9i0(q9i0 q9i0Var, ArrayList arrayList, boolean z, w8i0 w8i0Var, String str, String str2, lnm lnmVar) {
        super(2, lnmVar);
        this.O0 = q9i0Var;
        this.P0 = arrayList;
        this.Q0 = z;
        this.R0 = w8i0Var;
        this.S0 = str;
        this.T0 = str2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new h9i0(this.O0, this.P0, this.Q0, this.R0, this.S0, this.T0, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:92:0x0222 A[Catch: all -> 0x0267, Exception -> 0x026b, CancellationException -> 0x026e, TryCatch #4 {all -> 0x0267, blocks: (B:108:0x02ae, B:109:0x02c3, B:111:0x02c9, B:113:0x02da, B:117:0x02e3, B:96:0x025b, B:90:0x021c, B:92:0x0222, B:102:0x0272, B:105:0x0283), top: B:218:0x025b }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0257  */
    /* JADX WARN: Code duplicated, block: B:95:0x0259  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x007e: MOVE (r1 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]) (LINE:127), block:B:23:0x007e */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0079: MOVE (r2 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:122), block:B:21:0x0079 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x007f: MOVE (r2 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:128), block:B:23:0x007e */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0076: MOVE (r3 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:119), block:B:20:0x0076 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x007a: MOVE (r3 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:123), block:B:21:0x0079 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0080: MOVE (r3 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:129), block:B:23:0x007e */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v76, types: [p.opa] */
    /* JADX WARN: Type inference failed for: r3v79 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v81 */
    /* JADX WARN: Type inference failed for: r3v82 */
    /* JADX WARN: Type inference failed for: r3v83 */
    /* JADX WARN: Type inference failed for: r3v84 */
    /* JADX WARN: Type inference failed for: r3v88 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:124:0x0331 -> B:228:0x0337). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x0259 -> B:218:0x025b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 1366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.h9i0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
