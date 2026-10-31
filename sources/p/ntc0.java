package p;

import com.google.crypto.tink.shaded.protobuf.e;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class ntc0 {
    public static final jtc0 a = new jtc0();
    public static final ltc0 b = new ltc0();

    public void a(long j, Object obj) {
        mvb0 mvb0VarUnmodifiableList;
        mvb0 mvb0Var = (List) clh1.j(j, obj);
        if (mvb0Var instanceof mvb0) {
            mvb0VarUnmodifiableList = mvb0Var.g();
        } else {
            if (jtc0.c.isAssignableFrom(mvb0Var.getClass())) {
                return;
            }
            if ((mvb0Var instanceof nnw0) && (mvb0Var instanceof g290)) {
                h9 h9Var = (h9) ((g290) mvb0Var);
                if (h9Var.a) {
                    h9Var.a = false;
                    return;
                }
                return;
            }
            mvb0VarUnmodifiableList = Collections.unmodifiableList(mvb0Var);
        }
        clh1.p(obj, j, mvb0VarUnmodifiableList);
    }

    public void b(e eVar, Object obj, long j) {
        List list = (List) clh1.j(j, obj);
        List listD = jtc0.d(eVar, list.size(), j);
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        clh1.p(eVar, j, list);
    }

    public List c(long j, Object obj) {
        return jtc0.d(obj, 10, j);
    }
}
