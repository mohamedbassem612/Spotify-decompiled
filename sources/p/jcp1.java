package p;

import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jcp1 implements j720 {
    public final boolean a;
    public final Object b;
    public Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public jcp1(ikj1 ikj1Var, int i) {
        this.c = new bz11();
        this.b = ikj1Var;
        wcp1.f();
        this.a = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.firebase.encoders.EncodingException */
    public byte[] a() throws EncodingException {
        bjx0 bjx0Var = bjx0.a1;
        ikj1 ikj1Var = (ikj1) this.b;
        ((bz11) this.c).i = false;
        bz11 bz11Var = (bz11) this.c;
        bz11Var.g = Boolean.FALSE;
        ikj1Var.a = new j9p1(bz11Var);
        try {
            wcp1.f();
            t0p1 t0p1Var = new t0p1(ikj1Var);
            cyn1 cyn1Var = new cyn1((byte) 0);
            bjx0Var.c(cyn1Var);
            HashMap map = new HashMap(cyn1Var.a);
            HashMap map2 = new HashMap(cyn1Var.b);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                jxn1 jxn1Var = new jxn1(byteArrayOutputStream, map, map2);
                ifp0 ifp0Var = (ifp0) map.get(t0p1.class);
                if (ifp0Var == null) {
                    throw new EncodingException("No encoder for ".concat(String.valueOf(t0p1.class)));
                }
                ifp0Var.a(t0p1Var, jxn1Var);
                return byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
            }
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    public void c(tv80 tv80Var) {
        iu30 iu30Var = (iu30) ((p811) this.c).a;
        if (iu30Var != null) {
            iu30Var.invoke(tv80Var);
        }
    }

    public boolean e() {
        return this.a;
    }

    public mr20 getTitle() {
        return (x010) this.b;
    }

    public jcp1(q7d0 q7d0Var, p811 p811Var) {
        this.c = p811Var;
        this.b = q7d0Var.j;
        this.a = q7d0Var.f.a();
    }
}
