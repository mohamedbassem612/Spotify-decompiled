package p;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class ajn implements mnm, qiw {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ajn(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // p.mnm
    public Object d(Task task) {
        bsd1 bsd1Var = (bsd1) this.a;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
        dp5 dp5Var = (dp5) this.c;
        if (task.j()) {
            bsd1Var.d(task.g());
        } else if (task.f() != null) {
            bsd1Var.c(task.f());
        } else if (atomicBoolean.getAndSet(true)) {
            dp5Var.e();
        }
        return o0c.z((Object) null);
    }

    @Override // p.qiw
    public void v(Object obj) {
        AtomicReference atomicReference = (AtomicReference) this.a;
        g4u g4uVar = (g4u) this.b;
        qiw qiwVar = (qiw) this.c;
        Object obj2 = atomicReference.get();
        if (obj2 == null || g4uVar.test(obj2, obj)) {
            qiwVar.v(obj);
        }
        atomicReference.set(obj);
    }
}
