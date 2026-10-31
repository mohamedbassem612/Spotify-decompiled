package p;

import androidx.media3.exoplayer.source.MergingMediaSource$IllegalMergeException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qvi0 extends h2k {
    public static final yoh0 S0;
    public final ArrayList N0;
    public final twb O0;
    public int P0;
    public long[][] Q0;
    public MergingMediaSource$IllegalMergeException R0;
    public final qba[] X;
    public final ArrayList Y;
    public final sqe1[] Z;

    static {
        koh0 koh0Var = new koh0();
        koh0Var.b = "MergingMediaSource";
        S0 = koh0Var.a();
    }

    public qvi0(qba... qbaVarArr) {
        twb twbVar = new twb((byte) 6);
        this.X = qbaVarArr;
        this.O0 = twbVar;
        this.N0 = new ArrayList(Arrays.asList(qbaVarArr));
        this.P0 = -1;
        this.Y = new ArrayList(qbaVarArr.length);
        for (int i = 0; i < qbaVarArr.length; i++) {
            this.Y.add(new ArrayList());
        }
        this.Z = new sqe1[qbaVarArr.length];
        this.Q0 = new long[0][];
        new HashMap();
        n3p1.j(8, "expectedKeys");
        n3p1.j(2, "expectedValuesPerKey");
        muh muhVarB = muh.b(8);
        fwm0 fwm0Var = new fwm0();
        n3p1.j(2, "expectedValuesPerKey");
        new gwm0(muhVarB).g = fwm0Var;
    }

    @Override // p.h2k
    public final p2i0 A(Object obj, p2i0 p2i0Var) {
        int iIntValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.Y;
        List list = (List) arrayList.get(iIntValue);
        for (int i = 0; i < list.size(); i++) {
            if (((pvi0) list.get(i)).a.equals(p2i0Var)) {
                return ((pvi0) ((List) arrayList.get(0)).get(i)).a;
            }
        }
        return null;
    }

    @Override // p.h2k
    public final void G(Object obj, qba qbaVar, sqe1 sqe1Var) {
        int iH;
        Integer num = (Integer) obj;
        if (this.R0 != null) {
            return;
        }
        if (this.P0 == -1) {
            iH = sqe1Var.h();
            this.P0 = iH;
        } else {
            int iH2 = sqe1Var.h();
            int i = this.P0;
            if (iH2 != i) {
                this.R0 = new MergingMediaSource$IllegalMergeException();
                return;
            }
            iH = i;
        }
        int length = this.Q0.length;
        sqe1[] sqe1VarArr = this.Z;
        if (length == 0) {
            this.Q0 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iH, sqe1VarArr.length);
        }
        ArrayList arrayList = this.N0;
        arrayList.remove(qbaVar);
        sqe1VarArr[num.intValue()] = sqe1Var;
        if (arrayList.isEmpty()) {
            s(sqe1VarArr[0]);
        }
    }

    @Override // p.qba
    public final boolean c(yoh0 yoh0Var) {
        qba[] qbaVarArr = this.X;
        return qbaVarArr.length > 0 && qbaVarArr[0].c(yoh0Var);
    }

    @Override // p.qba
    public final arh0 f(p2i0 p2i0Var, hw3 hw3Var, long j) {
        qba[] qbaVarArr = this.X;
        int length = qbaVarArr.length;
        arh0[] arh0VarArr = new arh0[length];
        sqe1[] sqe1VarArr = this.Z;
        int iB = sqe1VarArr[0].b(p2i0Var.a);
        for (int i = 0; i < length; i++) {
            p2i0 p2i0VarA = p2i0Var.a(sqe1VarArr[i].l(iB));
            arh0VarArr[i] = qbaVarArr[i].f(p2i0VarA, hw3Var, j - this.Q0[iB][i]);
            ((List) this.Y.get(i)).add(new pvi0(p2i0VarA, arh0VarArr[i]));
        }
        return new ovi0(this.O0, this.Q0[iB], arh0VarArr);
    }

    @Override // p.qba
    public final yoh0 m() {
        qba[] qbaVarArr = this.X;
        return qbaVarArr.length > 0 ? qbaVarArr[0].m() : S0;
    }

    @Override // p.h2k, p.qba
    public final void o() throws MergingMediaSource$IllegalMergeException {
        MergingMediaSource$IllegalMergeException mergingMediaSource$IllegalMergeException = this.R0;
        if (mergingMediaSource$IllegalMergeException != null) {
            throw mergingMediaSource$IllegalMergeException;
        }
        super.o();
    }

    @Override // p.qba
    public final void r(yeg1 yeg1Var) {
        this.t = zoi1.r((lkh0) null);
        int i = 0;
        while (true) {
            qba[] qbaVarArr = this.X;
            if (i >= qbaVarArr.length) {
                return;
            }
            H(Integer.valueOf(i), qbaVarArr[i]);
            i++;
        }
    }

    @Override // p.qba
    public final void t(arh0 arh0Var) {
        ovi0 ovi0Var = (ovi0) arh0Var;
        int i = 0;
        while (true) {
            qba[] qbaVarArr = this.X;
            if (i >= qbaVarArr.length) {
                return;
            }
            List list = (List) this.Y.get(i);
            boolean[] zArr = ovi0Var.b;
            arh0[] arh0VarArr = ovi0Var.a;
            arh0 arh0Var2 = zArr[i] ? ((noe1) arh0VarArr[i]).a : arh0VarArr[i];
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (((pvi0) list.get(i2)).b.equals(arh0Var2)) {
                    list.remove(i2);
                    break;
                }
            }
            qbaVarArr[i].t(ovi0Var.b[i] ? ((noe1) arh0VarArr[i]).a : arh0VarArr[i]);
            i++;
        }
    }

    @Override // p.h2k, p.qba
    public final void w() {
        super.w();
        Arrays.fill(this.Z, (Object) null);
        this.P0 = -1;
        this.R0 = null;
        ArrayList arrayList = this.N0;
        arrayList.clear();
        Collections.addAll(arrayList, this.X);
    }

    @Override // p.qba
    public final void z(yoh0 yoh0Var) {
        this.X[0].z(yoh0Var);
    }
}
