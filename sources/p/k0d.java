package p;

import java.util.Comparator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class k0d implements Comparator {
    public final /* synthetic */ byte a;
    public static final k0d b = new k0d(0);
    public static final k0d c = new k0d(1);
    public static final k0d d = new k0d(2);
    public static final k0d e = new k0d(3);
    public static final k0d f = new k0d(4);
    public static final k0d g = new k0d(5);
    public static final k0d h = new k0d(6);
    public static final /* synthetic */ k0d i = new k0d(7);
    public static final k0d t = new k0d(8);
    public static final k0d X = new k0d(9);
    public static final k0d Y = new k0d(10);
    public static final k0d Z = new k0d(11);
    public static final k0d N0 = new k0d(12);
    public static final k0d O0 = new k0d(13);
    public static final k0d P0 = new k0d(14);
    public static final k0d Q0 = new k0d(15);

    public /* synthetic */ k0d(byte b2) {
        this.a = b2;
    }

    public static float a(ys71 ys71Var) {
        if (ys71Var.b.s() == 0.0f && (ys71Var instanceof ys71) && ys71Var.Y == null) {
            return -1.0f;
        }
        return ys71Var.b.s();
    }

    public static int b(n9r n9rVar) {
        if (n9rVar == null) {
            iht.a(36);
            throw null;
        }
        if (iht.l(n9rVar, 4)) {
            return 8;
        }
        if (n9rVar instanceof pjl) {
            return 7;
        }
        if (n9rVar instanceof tdy0) {
            return ((tdy0) n9rVar).L() == null ? 6 : 5;
        }
        if (n9rVar instanceof ov30) {
            return ((ov30) n9rVar).L() == null ? 4 : 3;
        }
        if (n9rVar instanceof beg) {
            return 2;
        }
        return n9rVar instanceof jit ? 1 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:171:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:182:0x03de  */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03e6, code lost:
    
        if (r8 == false) goto L188;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compare(java.lang.Object r8, java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 1096
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.k0d.compare(java.lang.Object, java.lang.Object):int");
    }
}
