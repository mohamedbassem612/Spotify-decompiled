package p;

import androidx.datastore.core.CorruptionException;
import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import java.io.FileInputStream;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lnb0 implements e761 {
    public static final lnb0 a = new lnb0();
    public static final dnb0 b = dnb0.m();

    public final Object a() {
        return b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.core.CorruptionException */
    public final Object b(FileInputStream fileInputStream) throws CorruptionException {
        try {
            return dnb0.p(fileInputStream);
        } catch (InvalidProtocolBufferException e) {
            throw new CorruptionException("Cannot read proto.", e);
        }
    }

    public final void c(Object obj, v091 v091Var) {
        dnb0 dnb0Var = (dnb0) obj;
        dnb0Var.getClass();
        int iA = dnb0Var.a((qm41) null);
        Logger logger = owg.w;
        if (iA > 4096) {
            iA = 4096;
        }
        owg owgVar = new owg(v091Var, iA);
        liy0.a().c(dnb0Var).f(dnb0Var, fp8.i(owgVar));
        if (owgVar.u > 0) {
            owgVar.n0();
        }
    }
}
