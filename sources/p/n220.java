package p;

import androidx.datastore.preferences.protobuf.a;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n220 {
    public static final /* synthetic */ int c = 0;
    public final jg91 a = new jg91(16);
    public boolean b;

    static {
        new n220(0);
    }

    public n220(int i) {
        a();
        a();
    }

    public static void b(qwg qwgVar, mul1 mul1Var, int i, Object obj) throws IOException {
        if (mul1Var == mul1.d) {
            qwgVar.p1(i, 3);
            ((a) obj).c(qwgVar);
            qwgVar.p1(i, 4);
        }
        qwgVar.p1(i, mul1Var.b);
        switch (mul1Var.ordinal()) {
            case 0:
                qwgVar.d1(((Double) obj).doubleValue());
                break;
            case 1:
                qwgVar.i1(((Float) obj).floatValue());
                break;
            case 2:
                qwgVar.t1(((Long) obj).longValue());
                break;
            case 3:
                qwgVar.t1(((Long) obj).longValue());
                break;
            case 4:
                qwgVar.k1(((Integer) obj).intValue());
                break;
            case 5:
                qwgVar.h1(((Long) obj).longValue());
                break;
            case 6:
                qwgVar.f1(((Integer) obj).intValue());
                break;
            case 7:
                qwgVar.Y0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof ihc)) {
                    qwgVar.o1((String) obj);
                } else {
                    qwgVar.c1((ihc) obj);
                }
                break;
            case 9:
                ((a) obj).c(qwgVar);
                break;
            case 10:
                a aVar = (a) obj;
                qwgVar.r1(aVar.a());
                aVar.c(qwgVar);
                break;
            case 11:
                if (!(obj instanceof ihc)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    qwgVar.r1(length);
                    qwgVar.Z0(bArr, 0, length);
                } else {
                    qwgVar.c1((ihc) obj);
                }
                break;
            case 12:
                qwgVar.r1(((Integer) obj).intValue());
                break;
            case 13:
                qwgVar.k1(((Integer) obj).intValue());
                break;
            case 14:
                qwgVar.f1(((Integer) obj).intValue());
                break;
            case 15:
                qwgVar.h1(((Long) obj).longValue());
                break;
            case 16:
                qwgVar.l1(((Integer) obj).intValue());
                break;
            case 17:
                qwgVar.m1(((Long) obj).longValue());
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        jg91 jg91Var = this.a;
        if (!jg91Var.d) {
            if (jg91Var.b.size() > 0) {
                pze0.m(jg91Var.c(0).getKey());
                throw null;
            }
            Iterator it = jg91Var.d().iterator();
            if (it.hasNext()) {
                pze0.m(((Map.Entry) it.next()).getKey());
                throw null;
            }
        }
        if (!jg91Var.d) {
            jg91Var.c = jg91Var.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(jg91Var.c);
            jg91Var.f = jg91Var.f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(jg91Var.f);
            jg91Var.d = true;
        }
        this.b = true;
    }

    public final Object clone() {
        n220 n220Var = new n220();
        jg91 jg91Var = this.a;
        if (jg91Var.b.size() > 0) {
            Map.Entry entryC = jg91Var.c(0);
            pze0.m(entryC.getKey());
            entryC.getValue();
            throw null;
        }
        Iterator it = jg91Var.d().iterator();
        if (!it.hasNext()) {
            return n220Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        pze0.m(entry.getKey());
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n220) {
            return this.a.equals(((n220) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public n220() {
    }
}
