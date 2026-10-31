package p;

import android.content.Context;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mio1 extends k9 {
    public final qok0 c;

    public mio1(qok0 qok0Var) {
        super((byte) 9);
        this.c = qok0Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    public final Object C0(Object obj) {
        qok0 qok0Var = this.c;
        if (obj != null) {
            throw new ClassCastException();
        }
        Context contextB = qok0Var.b();
        String str = true != mpn1.a() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
        synchronized (tgp1.class) {
            vfp1 vfp1Var = new vfp1(str);
            synchronized (tgp1.class) {
                try {
                    owo1 owo1Var = tgp1.a;
                    if (owo1Var == null) {
                        owo1Var = new owo1((byte) 3);
                        tgp1.a = owo1Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i = kzo1.a;
            if (gjv.a(contextB, "com.google.mlkit.dynamite.barcode") <= 0) {
                mz40.b.getClass();
                if (h450.b(contextB) < 204500000) {
                    throw null;
                }
            }
            qok0 qok0Var2 = this.c;
            new AtomicInteger(0);
            new AtomicBoolean(false);
            new wh41();
            new LinkedList();
            zod.t(qok0Var2, "MlKitContext can not be null");
            zod.t((Object) null, "BarcodeScannerOptions can not be null");
            throw null;
        }
        int i2 = kzo1.a;
        if (gjv.a(contextB, "com.google.mlkit.dynamite.barcode") <= 0) {
            mz40.b.getClass();
            if (h450.b(contextB) < 204500000) {
                throw null;
            }
        }
        qok0 qok0Var3 = this.c;
        new AtomicInteger(0);
        new AtomicBoolean(false);
        new wh41();
        new LinkedList();
        zod.t(qok0Var3, "MlKitContext can not be null");
        zod.t((Object) null, "BarcodeScannerOptions can not be null");
        throw null;
    }
}
