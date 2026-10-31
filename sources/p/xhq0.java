package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xhq0 extends wiy0 {
    public final long X;
    public boolean Y;
    public boolean Z;

    public xhq0(ghy0 ghy0Var, yiy0 yiy0Var, long j, h661 h661Var) {
        super(ghy0Var, yiy0Var, h661Var);
        this.X = j;
    }

    public final x1k b(h661 h661Var) {
        if (h661Var.equals(((wiy0) this).e)) {
            return this;
        }
        vhq0 vhq0Var = new vhq0(((wiy0) this).c, ((wiy0) this).d, h661Var);
        if (h661Var.d() != 1) {
            nkx0.o("Implementation of oneOf type ", h661Var.h(), " should contain only 1 element, but get ", h661Var.d());
            return null;
        }
        List listF = h661Var.f(0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF) {
            if (obj instanceof zhy0) {
                arrayList.add(obj);
            }
        }
        zhy0 zhy0Var = (zhy0) o7h.X0(arrayList);
        if (zhy0Var != null) {
            zhy0Var.number();
            return vhq0Var;
        }
        bhn0.k("Implementation of oneOf type ", h661Var.h(), " should have @ProtoNumber annotation");
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final String b1(long j) throws SerializationException {
        Object next;
        String strH;
        if (j != 19501) {
            return super.b1(j);
        }
        kl1 kl1Var = j761.a;
        int i = (int) (this.X & 2147483647L);
        h661 h661Var = ((wiy0) this).e;
        Iterator it = sio1.u(h661Var).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((int) (sio1.s((h661) next, 0) & 2147483647L)) != i);
        h661 h661Var2 = (h661) next;
        if (h661Var2 != null && (strH = h661Var2.h()) != null) {
            return strH;
        }
        throw new SerializationException("Cannot find a subclass of " + h661Var.h() + " annotated with @ProtoNumber(" + i + ").");
    }

    public final long e1(h661 h661Var, int i) {
        if (i == 0) {
            return 19501L;
        }
        return sio1.s(h661Var, 0);
    }

    public final int p(h661 h661Var) {
        if (!this.Y) {
            this.Y = true;
            return 0;
        }
        if (this.Z) {
            return -1;
        }
        this.Z = true;
        return 1;
    }
}
