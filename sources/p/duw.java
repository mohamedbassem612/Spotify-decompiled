package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class duw {
    public static final pxg1 a;
    public static final pxg1 b;
    public static final pxg1 c;

    static {
        ceo ceoVar = new ceo(0.4f, 0.0f, 0.6f, 1.0f);
        a = new pxg1(120, mlv.a, 2);
        b = new pxg1(150, ceoVar, 2);
        c = new pxg1(120, ceoVar, 2);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0009 A[PHI: r1
      0x0009: PHI (r1v3 p.pxg1) = (r1v0 p.pxg1), (r1v0 p.pxg1), (r1v0 p.pxg1), (r1v4 p.pxg1), (r1v4 p.pxg1), (r1v4 p.pxg1), (r1v4 p.pxg1) binds: [B:19:0x0022, B:22:0x0027, B:28:0x0033, B:5:0x0007, B:8:0x000d, B:11:0x0012, B:14:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    public static final Object a(o95 o95Var, float f, qt80 qt80Var, qt80 qt80Var2, onm onmVar) {
        pxg1 pxg1Var;
        pxg1 pxg1Var2 = null;
        if (qt80Var2 != null) {
            boolean z = qt80Var2 instanceof r9w0;
            pxg1Var = a;
            if (z || (qt80Var2 instanceof o5v) || (qt80Var2 instanceof dy60) || (qt80Var2 instanceof ry20)) {
                pxg1Var2 = pxg1Var;
            }
        } else if (qt80Var != null) {
            boolean z2 = qt80Var instanceof r9w0;
            pxg1Var = b;
            if (z2 || (qt80Var instanceof o5v)) {
                pxg1Var2 = pxg1Var;
            } else if (qt80Var instanceof dy60) {
                pxg1Var2 = c;
            } else if (qt80Var instanceof ry20) {
                pxg1Var2 = pxg1Var;
            }
        }
        pxg1 pxg1Var3 = pxg1Var2;
        d9n d9nVar = d9n.a;
        if (pxg1Var3 != null) {
            Object objB = o95.b(o95Var, new p3v(f), pxg1Var3, (Float) null, (iu30) null, onmVar, 12);
            if (objB == d9nVar) {
                return objB;
            }
        } else {
            Object objG = o95Var.g(new p3v(f), onmVar);
            if (objG == d9nVar) {
                return objG;
            }
        }
        return rih1.a;
    }
}
