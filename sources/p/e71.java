package p;

import android.os.ParcelFileDescriptor;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e71 implements Callable {
    public final /* synthetic */ byte a;
    public final Object b;
    public final /* synthetic */ Object c;

    public e71(dqo1 dqo1Var, ParcelFileDescriptor parcelFileDescriptor, byte[] bArr) {
        this.a = (byte) 24;
        this.b = parcelFileDescriptor;
        this.c = bArr;
    }

    /* JADX WARN: Code duplicated, block: B:188:0x052e  */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01e0, code lost:
    
        r3 = new java.net.URL(r4.toString()).openStream();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ed, code lost:
    
        r1 = r1.getContentResolver().openOutputStream(r9, "w");
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01f5, code lost:
    
        if (r1 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01f7, code lost:
    
        r3.getClass();
        p.o0c.w(r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01fd, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0200, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0206, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0209, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x020b, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x020c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x020d, code lost:
    
        p.u890.p(r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0210, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0216, code lost:
    
        throw new java.lang.IllegalStateException("Failed to open output stream for content URI");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0217, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0218, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0219, code lost:
    
        p.u890.p(r3, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x021c, code lost:
    
        throw r0;
     */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object call() throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2132
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e71.call():java.lang.Object");
    }

    public /* synthetic */ e71(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public e71(h54 h54Var, q57 q57Var) {
        this.a = (byte) 2;
        this.c = h54Var;
        this.b = q57Var;
    }
}
