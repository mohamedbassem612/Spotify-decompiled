package p;

import androidx.datastore.preferences.protobuf.e;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class ptc0 {
    public static final ktc0 a = new ktc0();
    public static final mtc0 b = new mtc0();

    public void a(long j, Object obj) {
        pvb0 pvb0VarUnmodifiableList;
        pvb0 pvb0Var = (List) elh1.j(j, obj);
        if (pvb0Var instanceof pvb0) {
            pvb0VarUnmodifiableList = pvb0Var.g();
        } else {
            if (ktc0.c.isAssignableFrom(pvb0Var.getClass())) {
                return;
            }
            if ((pvb0Var instanceof pnw0) && (pvb0Var instanceof i290)) {
                j9 j9Var = (i290) pvb0Var;
                if (j9Var.c()) {
                    j9Var.d();
                    return;
                }
                return;
            }
            pvb0VarUnmodifiableList = Collections.unmodifiableList(pvb0Var);
        }
        elh1.p(obj, j, pvb0VarUnmodifiableList);
    }

    public void b(e eVar, Object obj, long j) {
        List list = (List) elh1.j(j, obj);
        List listD = ktc0.d(eVar, list.size(), j);
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        elh1.p(eVar, j, list);
    }

    public List c(long j, Object obj) {
        return ktc0.d(obj, 10, j);
    }
}
