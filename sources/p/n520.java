package p;

import java.io.File;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class n520 extends x6 {
    public final ArrayDeque c;
    public final /* synthetic */ p520 d;

    public n520(p520 p520Var) {
        this.d = p520Var;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.c = arrayDeque;
        File file = p520Var.a;
        if (file.isDirectory()) {
            arrayDeque.push(b(file));
        } else if (file.isFile()) {
            arrayDeque.push(new l520(file));
        } else {
            this.a = (byte) 2;
        }
    }

    @Override // p.x6
    public final void a() {
        File file;
        while (true) {
            ArrayDeque arrayDeque = this.c;
            o520 o520Var = (o520) arrayDeque.peek();
            if (o520Var == null) {
                file = null;
                break;
            }
            File fileA = o520Var.a();
            if (fileA == null) {
                arrayDeque.pop();
            } else {
                if (fileA.equals(o520Var.a) || !fileA.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                    file = fileA;
                    break;
                }
                arrayDeque.push(b(fileA));
            }
        }
        if (file == null) {
            this.a = (byte) 2;
        } else {
            this.b = file;
            this.a = (byte) 1;
        }
    }

    public final j520 b(File file) {
        int iC = l1d.C(this.d.b);
        if (iC == 0) {
            return new m520(file);
        }
        if (iC == 1) {
            return new k520(file);
        }
        eg.o();
        return null;
    }
}
