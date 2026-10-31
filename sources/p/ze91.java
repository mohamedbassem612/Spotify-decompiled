package p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ze91 implements x3k, Iterable, ola0 {
    public fdn0 X;
    public int b;
    public int d;
    public int e;
    public final Object f;
    public boolean g;
    public int h;
    public HashMap t;
    public int[] a = new int[0];
    public Object[] c = new Object[0];
    public ArrayList i = new ArrayList();

    public static final void e(hf91 hf91Var, int i) {
        while (hf91Var.v >= 0 && hf91Var.u <= i) {
            hf91Var.N();
            hf91Var.i();
        }
    }

    public final int b(s340 s340Var) {
        if (this.g) {
            g0k.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!s340Var.a()) {
            bmv0.a("Anchor refers to a group that was removed");
        }
        return s340Var.a;
    }

    public final void c() {
        this.t = new HashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final nen0 d(j06 j06Var, wdn0 wdn0Var) {
        int i;
        Object[] objArr = wdn0Var.a;
        int i2 = wdn0Var.b;
        boolean z = false;
        for (?? r3 = z; r3 < i2; r3++) {
            if (!k(aym.k(((znm0) objArr[r3]).e))) {
                wdn0 wdn0Var2 = new wdn0();
                Object[] objArr2 = wdn0Var.a;
                int i3 = wdn0Var.b;
                for (?? r4 = z; r4 < i3; r4++) {
                    Object obj = objArr2[r4];
                    if (k(aym.k(((znm0) obj).e))) {
                        wdn0Var2.b(obj);
                    }
                }
                wdn0Var = wdn0Var2;
                break;
            }
        }
        wdn0 wdn0VarU = ero1.u(wdn0Var, new waq0(this, (byte) 22));
        if (wdn0VarU.i()) {
            return hj41.b;
        }
        long[] jArr = hj41.a;
        nen0 nen0Var = new nen0();
        hf91 hf91VarI = i();
        try {
            Object[] objArr3 = wdn0VarU.a;
            int i4 = wdn0VarU.b;
            for (?? r5 = z; r5 < i4; r5++) {
                znm0 znm0Var = (znm0) objArr3[r5];
                int iC = hf91VarI.c(aym.k(znm0Var.e));
                int iF = hf91VarI.F(iC, hf91VarI.b);
                e(hf91VarI, iF);
                e(hf91VarI, iF);
                while (true) {
                    i = hf91VarI.t;
                    if (i == iF || i == hf91VarI.u) {
                        break;
                        break;
                    }
                    if (iF < hf91VarI.t(i) + i) {
                        hf91VarI.Q();
                    } else {
                        hf91VarI.M();
                    }
                }
                if (i != iF) {
                    g0k.a("Unexpected slot table structure");
                }
                hf91VarI.Q();
                hf91VarI.a(iC - hf91VarI.t);
                nen0Var.m(znm0Var, g0k.c(znm0Var.c, znm0Var, hf91VarI, j06Var));
            }
            e(hf91VarI, Integer.MAX_VALUE);
            boolean z2 = true;
            return nen0Var;
        } finally {
            hf91VarI.e(z);
        }
    }

    public final ye91 f() {
        if (this.g) {
            eg.m("Cannot read while a writer is pending");
            return null;
        }
        this.e++;
        return new ye91(this);
    }

    public final hf91 i() {
        if (this.g) {
            g0k.a("Cannot start a writer when another writer is pending");
        }
        if (this.e > 0) {
            g0k.a("Cannot start a writer when a reader is pending");
        }
        this.g = true;
        this.h++;
        return new hf91(this);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new lm50(this, 0, this.b);
    }

    public final boolean k(s340 s340Var) {
        int iC;
        return s340Var.a() && (iC = bf91.c(this.i, s340Var.a, this.b)) >= 0 && u890.j(this.i.get(iC), s340Var);
    }

    public final z340 l(int i) {
        int i2;
        ArrayList arrayList;
        int iC;
        HashMap map = this.t;
        if (map != null) {
            if (this.g) {
                g0k.a("use active SlotWriter to crate an anchor for location instead");
            }
            s340 s340Var = (i < 0 || i >= (i2 = this.b) || (iC = bf91.c((arrayList = this.i), i, i2)) < 0) ? null : (s340) arrayList.get(iC);
            if (s340Var != null) {
                return (z340) map.get(s340Var);
            }
        }
        return null;
    }
}
