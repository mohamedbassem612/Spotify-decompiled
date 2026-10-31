package p;

import java.security.GeneralSecurityException;
import java.text.SimpleDateFormat;
import javax.crypto.Mac;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class djs extends ThreadLocal {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ djs(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new SimpleDateFormat("MMM yyyy", yoi1.A(((ejs) obj).a.getResources().getConfiguration()).b(0));
            default:
                wmw0 wmw0Var = (wmw0) obj;
                try {
                    Mac mac = (Mac) k8y.f.a(wmw0Var.b);
                    mac.init(wmw0Var.c);
                    return mac;
                } catch (GeneralSecurityException e) {
                    bhn0.p(e);
                    return null;
                }
        }
    }
}
