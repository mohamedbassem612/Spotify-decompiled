package p;

import android.media.Image;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class ye30 implements zx70 {
    public final zx70 b;
    public final Object a = new Object();
    public final HashSet c = new HashSet();

    public ye30(zx70 zx70Var) {
        this.b = zx70Var;
    }

    @Override // p.zx70
    public rt70 Q0() {
        return this.b.Q0();
    }

    public final void a(xe30 xe30Var) {
        synchronized (this.a) {
            this.c.add(xe30Var);
        }
    }

    @Override // p.zx70
    public final Image b() {
        return this.b.b();
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        HashSet hashSet;
        this.b.close();
        synchronized (this.a) {
            hashSet = new HashSet(this.c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((xe30) it.next()).a(this);
        }
    }

    @Override // p.zx70
    public final int getFormat() {
        return this.b.getFormat();
    }

    @Override // p.zx70
    public int getHeight() {
        return this.b.getHeight();
    }

    @Override // p.zx70
    public int getWidth() {
        return this.b.getWidth();
    }

    @Override // p.zx70
    public final fl1[] r0() {
        return this.b.r0();
    }
}
