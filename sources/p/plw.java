package p;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class plw extends a8d1 implements vu30 {
    public final /* synthetic */ qlw N0;
    public final /* synthetic */ iu30 O0;
    public byte X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ Set Z;
    public qlw a;
    public iu30 b;
    public Map c;
    public Iterator d;
    public Object e;
    public String f;
    public String g;
    public vr20 h;
    public int i;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public plw(Set set, qlw qlwVar, iu30 iu30Var, lnm lnmVar) {
        super(2, lnmVar);
        this.Z = set;
        this.N0 = qlwVar;
        this.O0 = iu30Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        plw plwVar = new plw(this.Z, this.N0, this.O0, lnmVar);
        plwVar.Y = obj;
        return plwVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    /* JADX WARN: Code duplicated, block: B:19:0x006f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0073  */
    /* JADX WARN: Code duplicated, block: B:22:0x007d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0081  */
    /* JADX WARN: Code duplicated, block: B:25:0x0087  */
    /* JADX WARN: Code duplicated, block: B:56:0x011a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0121  */
    /* JADX WARN: Code duplicated, block: B:60:0x0124 A[PHI: r6 r7 r8 r10 r11 r12 r13 r14 r15
      0x0124: PHI (r6v3 int) = (r6v4 int), (r6v6 int) binds: [B:43:0x00df, B:58:0x011f] A[DONT_GENERATE, DONT_INLINE]
      0x0124: PHI (r7v2 int) = (r7v3 int), (r7v5 int) binds: [B:43:0x00df, B:58:0x011f] A[DONT_GENERATE, DONT_INLINE]
      0x0124: PHI (r8v3 p.vr20) = (r8v4 p.vr20), (r8v6 p.vr20) binds: [B:43:0x00df, B:58:0x011f] A[DONT_GENERATE, DONT_INLINE]
      0x0124: PHI (r10v1 java.lang.String) = (r10v3 java.lang.String), (r10v4 java.lang.String) binds: [B:43:0x00df, B:58:0x011f] A[DONT_GENERATE, DONT_INLINE]
      0x0124: PHI (r11v1 java.lang.Object) = (r11v2 java.lang.Object), (r11v4 java.lang.Object) binds: [B:43:0x00df, B:58:0x011f] A[DONT_GENERATE, DONT_INLINE]
      0x0124: PHI (r12v2 java.util.Iterator) = (r12v3 java.util.Iterator), (r12v5 java.util.Iterator) binds: [B:43:0x00df, B:58:0x011f] A[DONT_GENERATE, DONT_INLINE]
      0x0124: PHI (r13v2 java.util.Map) = (r13v3 java.util.Map), (r13v5 java.util.Map) binds: [B:43:0x00df, B:58:0x011f] A[DONT_GENERATE, DONT_INLINE]
      0x0124: PHI (r14v2 p.iu30) = (r14v3 p.iu30), (r14v5 p.iu30) binds: [B:43:0x00df, B:58:0x011f] A[DONT_GENERATE, DONT_INLINE]
      0x0124: PHI (r15v2 p.qlw) = (r15v3 p.qlw), (r15v5 p.qlw) binds: [B:43:0x00df, B:58:0x011f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x012e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0131  */
    /* JADX WARN: Code duplicated, block: B:65:0x0144  */
    /* JADX WARN: Code duplicated, block: B:66:0x0147  */
    /* JADX WARN: Code duplicated, block: B:68:0x0151  */
    /* JADX WARN: Code duplicated, block: B:72:0x0159  */
    /* JADX WARN: Code duplicated, block: B:76:0x0164  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.lang.String, java.util.Iterator, java.util.Map, p.iu30, p.qlw, p.vr20] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006f -> B:74:0x015e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007d -> B:74:0x015e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0109 -> B:49:0x010a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x012e -> B:74:0x015e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0144 -> B:74:0x015e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0156 -> B:74:0x015e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x015c -> B:74:0x015e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.plw.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
