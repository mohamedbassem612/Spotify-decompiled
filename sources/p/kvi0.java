package p;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kvi0 implements x8s0, oe50 {
    public final Path a = new Path();
    public final Path b = new Path();
    public final Path c = new Path();
    public final ArrayList d = new ArrayList();
    public final jvi0 e;

    public kvi0(jvi0 jvi0Var) {
        this.e = jvi0Var;
    }

    public final void a(Path.Op op) {
        Path path = this.b;
        path.reset();
        Path path2 = this.a;
        path2.reset();
        ArrayList arrayList = this.d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            stl stlVar = (x8s0) arrayList.get(size);
            if (stlVar instanceof stl) {
                stl stlVar2 = stlVar;
                ArrayList arrayList2 = (ArrayList) stlVar2.d();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path path3 = ((x8s0) arrayList2.get(size2)).getPath();
                    Matrix matrixE = stlVar2.c;
                    nfg1 nfg1Var = stlVar2.k;
                    if (nfg1Var != null) {
                        matrixE = nfg1Var.e();
                    } else {
                        matrixE.reset();
                    }
                    path3.transform(matrixE);
                    path.addPath(path3);
                }
            } else {
                path.addPath(stlVar.getPath());
            }
        }
        int i = 0;
        stl stlVar3 = (x8s0) arrayList.get(0);
        if (stlVar3 instanceof stl) {
            stl stlVar4 = stlVar3;
            List listD = stlVar4.d();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listD;
                if (i >= arrayList3.size()) {
                    break;
                }
                Path path4 = ((x8s0) arrayList3.get(i)).getPath();
                Matrix matrixE2 = stlVar4.c;
                nfg1 nfg1Var2 = stlVar4.k;
                if (nfg1Var2 != null) {
                    matrixE2 = nfg1Var2.e();
                } else {
                    matrixE2.reset();
                }
                path4.transform(matrixE2);
                path2.addPath(path4);
                i++;
            }
        } else {
            path2.set(stlVar3.getPath());
        }
        this.c.op(path2, path, op);
    }

    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return;
            }
            ((x8s0) arrayList.get(i)).b(list, list2);
            i++;
        }
    }

    public final void d(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            x8s0 x8s0Var = (wpl) listIterator.previous();
            if (x8s0Var instanceof x8s0) {
                this.d.add(x8s0Var);
                listIterator.remove();
            }
        }
    }

    public final Path getPath() {
        Path path = this.c;
        path.reset();
        jvi0 jvi0Var = this.e;
        if (!jvi0Var.b) {
            int iC = l1d.C(jvi0Var.a);
            if (iC == 0) {
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.d;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((x8s0) arrayList.get(i)).getPath());
                    i++;
                }
            } else {
                if (iC == 1) {
                    a(Path.Op.UNION);
                    return path;
                }
                if (iC == 2) {
                    a(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (iC == 3) {
                    a(Path.Op.INTERSECT);
                    return path;
                }
                if (iC == 4) {
                    a(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }
}
