package p;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pk60 extends eq51 {
    public final uzr0 Z;

    public pk60(yoh0 yoh0Var, uzr0 uzr0Var, wpc wpcVar, Executor executor, long j, long j2, long j3) {
        super(yoh0Var, uzr0Var, wpcVar, executor, j, j2, j3);
        this.Z = uzr0Var;
    }

    public static void i(bl60 bl60Var, yk60 yk60Var, HashSet hashSet, ArrayList arrayList) {
        String str = bl60Var.a;
        long j = bl60Var.h + yk60Var.e;
        String str2 = yk60Var.g;
        if (str2 != null) {
            Uri uriQ = pno1.q(str, str2);
            if (hashSet.add(uriQ)) {
                arrayList.add(new cq51(j, eq51.b(uriQ)));
            }
        }
        arrayList.add(new cq51(j, new n3r(pno1.q(str, yk60Var.a), yk60Var.i, yk60Var.t)));
    }

    @Override // p.eq51
    public final ArrayList e(xpc xpcVar, kf20 kf20Var, boolean z) throws IOException {
        pk60 pk60Var = this;
        gl60 gl60Var = (gl60) kf20Var;
        ArrayList<n3r> arrayList = new ArrayList();
        fl60 fl60Var = fl60.o;
        if (gl60Var instanceof fl60) {
            fl60Var = (fl60) gl60Var;
            List list = fl60Var.d;
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(eq51.b((Uri) list.get(i)));
            }
        } else {
            arrayList.add(eq51.b(Uri.parse(gl60Var.a)));
        }
        uzr0 hl60Var = !fl60Var.l.isEmpty() ? new hl60(fl60Var, null) : pk60Var.Z;
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        for (n3r n3rVar : arrayList) {
            arrayList2.add(new cq51(0L, n3rVar));
            try {
                bl60 bl60Var = (bl60) pk60Var.c(xpcVar, hl60Var, n3rVar, z);
                b380 b380Var = bl60Var.r;
                long j = z == 0 ? pk60Var.a : 0L;
                long j2 = z ? -9223372036854775807L : pk60Var.b;
                yk60 yk60Var = null;
                for (int i2 = 0; i2 < b380Var.size(); i2++) {
                    yk60 yk60Var2 = (yk60) b380Var.get(i2);
                    long j3 = bl60Var.h + yk60Var2.e;
                    if (j3 + yk60Var2.c > j) {
                        if (j2 != -9223372036854775807L && j3 >= j + j2) {
                            break;
                        }
                        yk60 yk60Var3 = yk60Var2.b;
                        if (yk60Var3 != null && yk60Var3 != yk60Var) {
                            i(bl60Var, yk60Var3, hashSet, arrayList2);
                            yk60Var = yk60Var3;
                        }
                        i(bl60Var, yk60Var2, hashSet, arrayList2);
                    }
                }
            } catch (IOException e) {
                if (!z) {
                    throw e;
                }
            }
            pk60Var = this;
        }
        return arrayList2;
    }
}
