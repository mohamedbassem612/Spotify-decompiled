package p;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wdu implements Closeable {
    public final String a;
    public final long b;
    public final ArrayList c;
    public final /* synthetic */ beu d;

    public wdu(beu beuVar, String str, long j, ArrayList arrayList) {
        this.d = beuVar;
        this.a = str;
        this.b = j;
        this.c = arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            w4n1.b((fka1) it.next());
        }
    }
}
