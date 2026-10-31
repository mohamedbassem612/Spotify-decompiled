package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class u3x extends who1 {
    public final /* synthetic */ v3x c;

    public u3x(v3x v3xVar) {
        this.c = v3xVar;
    }

    public final void v(Throwable th) {
        this.c.c.g(th);
    }

    public final void w(zsc zscVar) {
        v3x v3xVar = this.c;
        v3xVar.b = zscVar;
        zsc zscVar2 = v3xVar.b;
        a4x a4xVar = v3xVar.c;
        v3xVar.a = new zeu(zscVar2, a4xVar.f, a4xVar.h, dio1.v());
        a4x a4xVar2 = v3xVar.c;
        d46 d46Var = a4xVar2.b;
        ArrayList arrayList = new ArrayList(d46Var.c);
        a4xVar2.a.writeLock().lock();
        try {
            a4xVar2.c = (byte) 1;
            arrayList.addAll(d46Var);
            d46Var.clear();
            a4xVar2.a.writeLock().unlock();
            for (int i = 0; i < arrayList.size(); i++) {
                ((y3x) arrayList.get(i)).b();
            }
        } catch (Throwable th) {
            a4xVar2.a.writeLock().unlock();
            throw th;
        }
    }
}
