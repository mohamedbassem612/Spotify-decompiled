package p;

import android.content.Context;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kwo1 implements ovo1 {
    public final aob0 a;
    public final kvo1 b;

    public kwo1(Context context, kvo1 kvo1Var) {
        this.b = kvo1Var;
        xhc xhcVar = xhc.e;
        jog1.b(context);
        hog1 hog1VarC = jog1.a().c(xhcVar);
        if (xhc.d.contains(new bbx("json"))) {
            new aob0(new gwo1(hog1VarC, (byte) 0));
        }
        this.a = new aob0(new gwo1(hog1VarC, (byte) 1));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.firebase.encoders.EncodingException */
    @Override // p.ovo1
    public final void a(zxl1 zxl1Var) throws EncodingException {
        kvo1 kvo1Var = this.b;
        kvo1Var.getClass();
        iog1 iog1Var = (iog1) this.a.get();
        kvo1Var.getClass();
        f2x0 f2x0Var = f2x0.Y0;
        fqn1 fqn1Var = (fqn1) zxl1Var.b;
        ((bz11) zxl1Var.c).i = false;
        bz11 bz11Var = (bz11) zxl1Var.c;
        bz11Var.g = Boolean.FALSE;
        fqn1Var.b = new xso1(bz11Var);
        try {
            cxo1.c();
            rlo1 rlo1Var = new rlo1(fqn1Var);
            zxl1 zxl1Var2 = new zxl1();
            f2x0Var.a(zxl1Var2);
            HashMap map = new HashMap((HashMap) zxl1Var2.b);
            HashMap map2 = new HashMap((HashMap) zxl1Var2.c);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                xhn1 xhn1Var = new xhn1(byteArrayOutputStream, map, map2);
                ifp0 ifp0Var = (ifp0) map.get(rlo1.class);
                if (ifp0Var == null) {
                    throw new EncodingException("No encoder for ".concat(String.valueOf(rlo1.class)));
                }
                ifp0Var.a(rlo1Var, xhn1Var);
                iog1Var.b(new r09((Integer) null, byteArrayOutputStream.toByteArray(), xnw0.b));
            } catch (IOException unused) {
            }
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
